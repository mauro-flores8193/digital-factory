package com.digitalfactory.sfa.models


import android.content.Context
import android.content.Context.MODE_PRIVATE

class SettingsRepository(context: Context) {
    private val preferences = context.getSharedPreferences(
        PREFS_FILENAME, MODE_PRIVATE)

    var didShowOnBoarding: Boolean
        get() { return preferences.getBoolean(PREF_ON_BOARDING, false)}
        set(value) {preferences.edit().putBoolean(PREF_ON_BOARDING, value).commit()}

    var shouldShowOnBoarding: Boolean
        get() = !this.didShowOnBoarding
        set(value) { this.didShowOnBoarding = !value}

    companion object {
        val PREFS_FILENAME = "com.minedu.control.settings"
        val PREF_ON_BOARDING = "didShowOnBoarding"

    }
}