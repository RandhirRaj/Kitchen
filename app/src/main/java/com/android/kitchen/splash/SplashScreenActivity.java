package com.android.kitchen.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import androidx.appcompat.app.AppCompatActivity;

import com.android.kitchen.R;
import com.android.kitchen.internetCheck.InternetConnectionChecker;
import com.android.kitchen.login.LoginActivity;
import com.google.firebase.auth.FirebaseAuth;


/**
 * Created by randhiraj on 25/04/18.
 */

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 1500;
    public static InternetConnectionChecker internetConnectionChecker;
    //    public static Activity homeActivity;
    public static SplashScreenActivity activity;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        mAuth = FirebaseAuth.getInstance();
//        mAuth.signOut();
        internetConnectionChecker = new InternetConnectionChecker();
        activity=this;

//        homeActivity=this;
//        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}
