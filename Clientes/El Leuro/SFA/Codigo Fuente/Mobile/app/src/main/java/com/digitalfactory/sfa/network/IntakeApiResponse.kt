package com.digitalfactory.sfa.network

abstract class IntakeApiResponse(
    val status: String,
    val code: String?,
    val message: String?
) {
    constructor() : this("", "", "")
}
