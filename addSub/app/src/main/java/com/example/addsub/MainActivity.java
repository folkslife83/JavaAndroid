package com.example.addsub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addClick(View v) {
        EditText no1 = (EditText) findViewById(R.id.no1);
        EditText no2 = (EditText) findViewById(R.id.no2);
        TextView result = (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(no1.getText().toString());
        int n2 = Integer.parseInt(no2.getText().toString());
        result.setText(Integer.toString(n1 + n2));
    }

    public void subClick(View v) {
        EditText no1 = (EditText) findViewById(R.id.no1);
        EditText no2 = (EditText) findViewById(R.id.no2);
        TextView result = (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(no1.getText().toString());
        int n2 = Integer.parseInt(no2.getText().toString());
        result.setText(Integer.toString(n1 - n2));
    }
    public void multClick(View v) {
        EditText no1 = (EditText) findViewById(R.id.no1);
        EditText no2 = (EditText) findViewById(R.id.no2);
        TextView result = (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(no1.getText().toString());
        int n2 = Integer.parseInt(no2.getText().toString());
        result.setText(Integer.toString(n1 * n2));
    }
    public void divClick(View v) {
        EditText no1 = (EditText) findViewById(R.id.no1);
        EditText no2 = (EditText) findViewById(R.id.no2);
        TextView result = (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(no1.getText().toString());
        int n2 = Integer.parseInt(no2.getText().toString());
        result.setText(Integer.toString(n1 / n2));
    }
}