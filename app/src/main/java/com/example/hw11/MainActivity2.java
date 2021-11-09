package com.example.hw11;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("onCreate","onCreate");
        setContentView(R.layout.activity_main2);
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop", "onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "onDestroy");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause", "onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume", "onResume");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart", "onStart");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("onRestart", "onRestart");
    }
    public void but_click(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}
