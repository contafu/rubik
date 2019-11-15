@file: JvmName("Rubik")

package com.contafu.rubik.screen

import android.content.Context

/**
 * 获取屏幕宽度
 */
fun Context.getScreenWidth() = resources.displayMetrics.widthPixels


/**
 * 获取屏幕高度
 */
fun Context.getScreenHeight() = resources.displayMetrics.heightPixels