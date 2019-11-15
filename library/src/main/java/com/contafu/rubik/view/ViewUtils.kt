@file:JvmName("Rubik")

package com.contafu.rubik.view

import android.view.View

/**
 * 过滤点击抖动
 * @scope For Kotlin
 * @param block 点击回调
 */
fun View.onFilterShakeClick(block: (View) -> Unit) {
    var pressDownPoint = System.currentTimeMillis()
    setOnClickListener {
        if (700 < System.currentTimeMillis() - pressDownPoint) {
            pressDownPoint = System.currentTimeMillis()
            block.invoke(it)
        }
    }
}

/**
 * 过滤点击抖动
 * @scope  For Java
 * @param onClickListener 点击回调
 */
fun View.onFilterShakeClick(onClickListener: View.OnClickListener) {
    var pressDownPoint = System.currentTimeMillis()
    setOnClickListener {
        if (700 < System.currentTimeMillis() - pressDownPoint) {
            pressDownPoint = System.currentTimeMillis()
            onClickListener.onClick(it)
        }
    }
}