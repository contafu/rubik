@file:JvmName("Rubik")
@file:JvmMultifileClass

package com.contafu.rubik

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.concurrent.timer

/**
 * 启动定时器
 * @param interval 定时器冷却值
 * @param heartBeat 间隔心跳
 */
@JvmSynthetic
private inline fun CoroutineScope.cd(interval: Long, crossinline heartBeat: () -> Boolean) {
    launch(Dispatchers.IO) {
        timer(name = "Tomas CD", period = 1000L) {
            if (heartBeat.invoke()) {
                cancel()
            }
        }

        withContext(Dispatchers.Main) {
        }
    }
}