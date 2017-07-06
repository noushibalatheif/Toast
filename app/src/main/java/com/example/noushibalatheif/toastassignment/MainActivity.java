package com.example.noushibalatheif.toastassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick(View v)
    {
        Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();
    }
}
