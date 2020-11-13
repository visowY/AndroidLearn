package com.wang.android02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox _checkTest;
    private TextView _txtTest;
    private RadioGroup _radioGroupTest;
    private Spinner _spinnerTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPalette();
        setPaletteListener();
    }

    private void initPalette(){
        _checkTest = findViewById(R.id.checkBox);
        _txtTest = findViewById(R.id.txtTest);
        _radioGroupTest = findViewById(R.id.radio_group_test);
        _spinnerTest =findViewById(R.id.spinner_Test);
    }

    private void setPaletteListener(){
        _checkTest.setOnCheckedChangeListener(new CheckListerner());
        _radioGroupTest.setOnCheckedChangeListener(new RadioListener());
        _spinnerTest.setOnItemSelectedListener(new SpinnerListener());
    }

    //<editor-fold desc="事件响应">
    private class CheckListerner implements CompoundButton.OnCheckedChangeListener{
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            String desc = String.format("您勾选了控件%d, 状态为%b", buttonView.getId(),isChecked);
            _txtTest.setText(desc);
            Toast.makeText(MainActivity.this, desc, Toast.LENGTH_SHORT).show();
        }
    }

    private class RadioListener implements RadioGroup.OnCheckedChangeListener{
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            Toast.makeText(MainActivity.this, "您选中了控件 " + checkedId, Toast.LENGTH_SHORT).show();
        }
    }

    private class SpinnerListener implements AdapterView.OnItemSelectedListener {

        String[] languages = getResources().getStringArray(R.array.language);
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(MainActivity.this, "您选择的是" +languages[position], Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {}
    }
    //</editor-fold>
}
