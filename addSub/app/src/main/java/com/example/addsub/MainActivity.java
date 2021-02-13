package com.example.addsub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addClick(View view) {
        Clicks addclick = new Clicks();
        addclick.aClick(view);
    }
    public void subClick(View view) {
        Clicks addclick = new Clicks();
        addclick.sClick(view);
    }
    public void multClick(View view) {
        Clicks addclick = new Clicks();
        addclick.mClick(view);
    }
    public void divClick(View view) {
        Clicks addclick = new Clicks();
        addclick.dClick(view);
    }

    private class Clicks {
        EditText no1 = (EditText) findViewById(R.id.no1);
        EditText no2 = (EditText) findViewById(R.id.no2);
        int n1 = Integer.parseInt(no1.getText().toString());
        int n2 = Integer.parseInt(no2.getText().toString());
        TextView result = (TextView) findViewById(R.id.result);
        TextView explain = (TextView) findViewById(R.id.explain);
        public void aClick(View v) {
            result.setText(Integer.toString(n1 + n2));
            explain.setText(R.string.exp_word_01);
        }
        public void sClick(View v) {
            result.setText(Integer.toString(n1 - n2));
            explain.setText(R.string.exp_word_02);
        }
        public void mClick(View v) {
            result.setText(Integer.toString(n1 * n2));
            explain.setText(R.string.exp_word_03);
        }
        public void dClick(View v) {
            result.setText(Integer.toString(n1 / n2));
            explain.setText(R.string.exp_word_04);
        }

    }




}
