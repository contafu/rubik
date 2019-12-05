@file:JvmName("Rubik")
@file:JvmMultifileClass

package com.contafu.rubik

import android.util.Log

private const val TAG = "Rubik"

/**
 * @param message
 */
fun logd(message: Any) {
    if (BuildConfig.DEBUG) {
        Log.d(TAG, message.toString())
    }
}

/**
 * @param errorMessage
 */
fun loge(errorMessage: Any) {
    if (BuildConfig.DEBUG) {
        Log.e(TAG, errorMessage.toString())
    }
}

/**
 * @param warnMessage
 */
fun logw(warnMessage: Any) {
    if (BuildConfig.DEBUG) {
        Log.w(TAG, warnMessage.toString())
    }
}