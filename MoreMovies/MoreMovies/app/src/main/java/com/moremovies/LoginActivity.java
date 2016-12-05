package com.moremovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText loginField = (EditText) findViewById(R.id.loginTextField);
        final EditText passwordField = (EditText) findViewById(R.id.passwordTextField);
        final Button signInButton = (Button) findViewById(R.id.signInButton);
        final Button signUpButton = (Button) findViewById(R.id.signUpButton);

        signInButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent userIntent = new Intent (LoginActivity.this, UserActivity.class);
                if (checkUserData(loginField.getText().toString(),passwordField.getText().toString())) {
                    userIntent.putExtra("USER_NAME",loginField.getText().toString());
                    LoginActivity.this.startActivity(userIntent);
                }
            }
        });


    }

    private boolean checkUserData(String login, String password){
        return true;
    }
}
