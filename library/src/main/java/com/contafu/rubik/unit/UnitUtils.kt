@file:JvmName("Rubik")

package com.contafu.rubik.unit

import android.content.Context
import android.util.TypedValue

/**
 * 根据屏幕 dpi 将 px 转换为 dp
 *
 * @param px px
 */
fun Context.px2dp(px: Float) = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PX, px, resources.displayMetrics)

/**
 * 根据屏幕 dpi 将 dp 转换为 px
 *
 * @param dp dp
 */
fun Context.dp2px(dp: Float) = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.displayMetrics)