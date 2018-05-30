package com.jrendon.a04intentexample;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Activity2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        Toast.makeText(this, "This is onCreate Act 2", Toast.LENGTH_SHORT).show();
        // Log.i("FirstActivity", "Inside onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "This is onStart Act 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "This is onResume Act 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "This is onPause Act 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "This is onStop Act 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "This is onDestroy Act 2", Toast.LENGTH_SHORT).show();
    }

    public void goToAct1(View v) {

        Intent intent = new Intent(Activity2.this, Activity1.class);
        startActivity(intent);
    }
}
