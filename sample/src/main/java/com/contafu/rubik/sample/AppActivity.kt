package com.contafu.rubik.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.contafu.rubik.onFilterShakeClick
import com.contafu.rubik.toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope

class AppActivity : AppCompatActivity(), CoroutineScope by MainScope() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.onFilterShakeClick {
            toast("Hello World!")
//            cd(3000L) {
//                Log.d("TAG", "A")
//                false
//            }
        }
    }
}