package com.example.rmp24;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {
    TextView tvOut;
    Button btnOk;
    Button btnCancel;
    private static final String TAG = "myLogs";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "найдем View-элементы");
        tvOut = findViewById(R.id.tvOut);
        btnOk = findViewById(R.id.btnOk);
        Log.d(TAG, "присваиваем обработчик кнопкам");
        btnCancel = findViewById(R.id.btnCancel);
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);


    }
    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View v) {
        // по id определяем кнопку, вызвавшую этот обработчик
        Log.d(TAG, "по id определяем кнопку, вызвавшую этот обработчик");
        switch(v.getId()) {
            case R.id.btnOk:
                // кнопкаОК
                Log.d(TAG, "кнопкаОК");
                tvOut.setText("Нажата кнопка Ok ");
                Toast.makeText(this, "Нажата кнопка ОК", Toast.LENGTH_SHORT).show();
                break;
                case R.id.btnCancel:
                // кнопка Cancel
                    Log.d(TAG, "кнопка Cancel");
                tvOut.setText("Нажата кнопка Cancel");
                Toast.makeText(this, "Нажата кнопка Cancel", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}