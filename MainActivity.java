package com.example.huricanez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    EditText et;
    int[] mas1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        et = findViewById(R.id.et);  // определяем поле ввода текста
    }

    public void onClick(View view){ // по нажатию на кнопу считываем из EditText числа и переводим их в интеджер
        String temp = et.toString();
        String[] mas = temp.split(" ");
        mas1 = new int[mas.length];
        for(int i = 0 ; i<mas1.length; i++){
            mas1[i] = Integer.parseInt(mas[i]);
        }
    }

}
