@file: JvmName("Rubik")

package com.contafu.rubik.activity

import android.app.Activity
import android.graphics.Color
import android.view.View
import android.view.WindowManager
import androidx.annotation.ColorInt

/**
 * 设置状态栏颜色
 * @param colorInt 设置颜色
 * @param isFitToSafeArea 是否占用安全区域
 */
fun Activity.setStatusBarColor(@ColorInt colorInt: Int = Color.TRANSPARENT, isFitToSafeArea: Boolean = false) {
    with(window) {
        clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        statusBarColor = colorInt

        if (isFitToSafeArea) {
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_IMMERSIVE or View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        } else {
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_IMMERSIVE or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        }
    }
}

/**
 * 设置导航栏颜色
 * @param colorInt 设置颜色
 */
fun Activity.setNavigationBarColor(@ColorInt colorInt: Int = Color.TRANSPARENT) {
    with(window) {
        clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
        addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        navigationBarColor = colorInt

//        if (isFitToWindow) {
//            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_IMMERSIVE or View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//        } else {
//            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_IMMERSIVE or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//        }
    }
}
