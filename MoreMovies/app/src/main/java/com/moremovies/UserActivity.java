package com.moremovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    private TextView userNameText;
    private TextView listsOfMoviesLinkText;
    private TextView listsOfEventsLinkText;
    private TextView listsOfRecomendedLinkText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        userNameText = (TextView) findViewById(R.id.userNameText);
        listsOfMoviesLinkText = (TextView) findViewById(R.id.listsOfMoviesLinkText);
        listsOfEventsLinkText = (TextView) findViewById(R.id.listOfEventsLinkText);
        listsOfRecomendedLinkText = (TextView) findViewById(R.id.listOfRecomendsLinkText);

        Intent loginIntent = getIntent();
        setUserName(loginIntent.getStringExtra("USER_NAME"));

        listsOfMoviesLinkText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MoviesIntent = new Intent (UserActivity.this, MoviesListsActivity.class);
                UserActivity.this.startActivity(MoviesIntent);
            }
        });

        listsOfEventsLinkText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent EventsIntent = new Intent (UserActivity.this, EventsListActivity.class);
                UserActivity.this.startActivity(EventsIntent);
            }
        });

        listsOfRecomendedLinkText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RecommendsIntent = new Intent (UserActivity.this, RecommendationListActivity.class);
                UserActivity.this.startActivity(RecommendsIntent);
            }
        });
    }

    public void setUserName(String newUserName){
        userNameText.setText(newUserName);
    }
}
