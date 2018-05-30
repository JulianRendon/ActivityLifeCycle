package com.jrendon.a04intentexample;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Activity1 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        Toast.makeText(this, "This is onCreate Act 1", Toast.LENGTH_SHORT).show();
        // Log.i("FirstActivity", "Inside onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "This is onStart Act 1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "This is onResume Act 1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "This is onPause Act 1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "This is onStop Act 1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "This is onDestroy Act 1", Toast.LENGTH_SHORT).show();
    }

    public void goToAct2(View v) {

        Intent intent = new Intent(Activity1.this, Activity2.class);
        startActivity(intent);
    }
}
