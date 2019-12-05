@file: JvmName("Rubik")
@file:JvmMultifileClass

package com.contafu.rubik

import android.content.res.Resources
import android.util.TypedValue

/**
 * 获取屏幕宽度
 */
fun getScreenWidth() = Resources.getSystem().displayMetrics.widthPixels


/**
 * 获取屏幕高度
 */
fun getScreenHeight() = Resources.getSystem().displayMetrics.heightPixels

/**
 * 根据屏幕 dpi 将 px 转换为 dp
 */
fun Float.convert2dp() =
    TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_PX,
        this,
        Resources.getSystem().displayMetrics
    )

/**
 * 根据屏幕 dpi 将 dp 转换为 px
 */
fun Float.convert2px() =
    TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this,
        Resources.getSystem().displayMetrics
    )