package com.contafu.rubik;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.contafu.rubik.view.Rubik;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        Rubik.onFilterShakeClick(button, view -> {
            Log.e("TAG", "A");
            return null;
        });

        Rubik.onFilterShakeClick(button, v -> {
            Log.e("TAG", "A");
        });

    }

}
