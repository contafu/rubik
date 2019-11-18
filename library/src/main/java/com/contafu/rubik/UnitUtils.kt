@file:JvmName("Rubik")
@file:JvmMultifileClass

package com.contafu.rubik

import android.content.res.Resources
import android.util.TypedValue

/**
 * 根据屏幕 dpi 将 px 转换为 dp
 *
 * @param px px
 */
fun px2dp(px: Float) =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PX, px, Resources.getSystem().displayMetrics)

/**
 * 根据屏幕 dpi 将 dp 转换为 px
 *
 * @param dp dp
 */
fun dp2px(dp: Float) =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, Resources.getSystem().displayMetrics)