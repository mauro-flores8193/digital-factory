package com.digitalfactory.sfa.network

import android.util.Log
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.ParsedRequestListener

class IntakeApi {
    companion object {
        private const val BASE_URL = "https://newsapi.org"
        val topHeadlinesUrl = "$BASE_URL/v2/top-headlines"
        val sourcesUrl = "$BASE_URL/v2/sources"
        val everythingUrl = "$BASE_URL/v2/everything"
        private val TAG = "CatchUp"
        var apiKey: String = ""


        fun requestSources(
            responseHandler: (IntakeResponse?) -> Unit,
            errorHandler: (ANError?) -> Unit) {
            request(sourcesUrl, mapOf("" to ""),
                responseHandler, errorHandler)
        }




        private inline fun <reified T>request(
            url: String,
            parameter: Map<String, String>?,
            crossinline responseHandler: (T?) -> Unit,
            crossinline errorHandler: (ANError?) -> Unit) {
            AndroidNetworking.get(url)
                .addQueryParameter("apiKey", apiKey)
                .addQueryParameter(parameter)
                .setTag(TAG)
                .setPriority(Priority.LOW)
                .build()
                .getAsObject(T::class.java,
                    object : ParsedRequestListener<T> {
                        override fun onResponse(response: T?) {
                            response?.apply {
                                val response = this as IntakeApiResponse
                                if (response.status.equals("ok", ignoreCase = true)) {
                                    responseHandler(this)
                                    Log.d(TAG, response.status)
                                }
                                else {
                                    Log.d(TAG, "Error $response.code: $response.message")
                                }
                            }
                        }

                        override fun onError(anError: ANError?) {
                            anError?.apply {
                                Log.d(TAG, "Error $errorCode: $errorBody $localizedMessage")
                                errorHandler(this)
                            }
                        }

                    })
        }
    }
}