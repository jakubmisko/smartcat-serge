package com.example.myapplication

import android.content.Context
import android.content.res.Configuration
import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*

object LocaleUtil {

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    fun changeLanguage(context: Context, languageCode: String): Context {
        val conf: Configuration = context.resources.configuration
        val locale = Locale(languageCode)
        Locale.setDefault(locale)
        conf.setLocale(locale)
        return context.createConfigurationContext(conf)
    }
}