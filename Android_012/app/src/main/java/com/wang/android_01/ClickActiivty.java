package com.wang.android_01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class ClickActiivty extends AppCompatActivity {

    private Button _btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_actiivty);
        InitPalette();
    }

    private void InitPalette(){
        _btnTest = findViewById(R.id.btn_click);
        _btnTest.setOnClickListener(v->{
            Toast.makeText(this, "点击了控件：", Toast.LENGTH_SHORT).show();
        });
        _btnTest.setOnLongClickListener(v->{
            Toast.makeText(this, "长按按钮触发", Toast.LENGTH_SHORT).show();
            return true;
        });
    }
}
