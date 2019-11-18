package com.contafu.rubik

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.contafu.rubik.view.onFilterShakeClick

class AppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button(this).onFilterShakeClick {
            Log.d("TAG", "A")
        }

        Button(this).onFilterShakeClick(View.OnClickListener {

        })
    }
}