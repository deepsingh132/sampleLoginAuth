package com.appsnipp.loginsamples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signOut(View view) {
        FirebaseAuth.getInstance().signOut();
        if (FirebaseAuth.getInstance().getCurrentUser()==null){
            Toast.makeText(this,"Sign out Success",Toast.LENGTH_LONG).show();
            finish();
            startActivity(new Intent(MainActivity.this,LoginActivity.class));

        }
        else Toast.makeText(this,"Sign out Failed",Toast.LENGTH_LONG).show();
    }
}