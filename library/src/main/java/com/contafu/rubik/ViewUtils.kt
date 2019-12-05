@file:JvmName("Rubik")
@file:JvmMultifileClass

package com.contafu.rubik

import android.view.View

/**
 * 过滤点击抖动
 * @param time 过滤抖动间隔
 * @param block 点击回调
 */
@JvmSynthetic
inline fun View.onFilterShakeClick(time: Long = 600, crossinline block: (View) -> Unit) {
    var pressDownPoint = System.currentTimeMillis()
    setOnClickListener {
        var interval = time
        if (600 > interval) {
            interval = 600
        }
        if (interval < System.currentTimeMillis() - pressDownPoint) {
            pressDownPoint = System.currentTimeMillis()
            block.invoke(it)
        }
    }
}

/**
 * 过滤点击抖动
 * @param time 过滤抖动间隔
 * @param onClickListener 点击回调
 */
@JvmOverloads
fun View.onFilterShakeClick(time: Long = 600L, onClickListener: View.OnClickListener) {
    var pressDownPoint = System.currentTimeMillis()
    setOnClickListener {
        var interval = time
        if (600 > interval) {
            interval = 600
        }
        if (interval < System.currentTimeMillis() - pressDownPoint) {
            pressDownPoint = System.currentTimeMillis()
            onClickListener.onClick(it)
        }
    }
}