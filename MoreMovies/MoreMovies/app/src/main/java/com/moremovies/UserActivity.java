package com.moremovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_user, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch(id){
            case R.id.action_friends_list:
                Intent friendsIntent = new Intent (UserActivity.this, FriendsActivity.class);
                UserActivity.this.startActivity(friendsIntent);
                break;
            case R.id.action_messages:
                Intent messagesIntent = new Intent (UserActivity.this, MessagesActivity.class);
                UserActivity.this.startActivity(messagesIntent);
                break;
            case R.id.action_movies_list:
                Intent moviesListIntent = new Intent (UserActivity.this, MoviesListsActivity.class);
                UserActivity.this.startActivity(moviesListIntent);
                break;
            case R.id.action_events_list:
                Intent eventsListIntent = new Intent (UserActivity.this, EventsListActivity.class);
                UserActivity.this.startActivity(eventsListIntent);
                break;
            case R.id.action_all_movies:
                Intent allMoviesIntent = new Intent (UserActivity.this, AllMoviesActivity.class);
                UserActivity.this.startActivity(allMoviesIntent);
                break;
            case R.id.action_settings:
                Intent settingsIntent = new Intent (UserActivity.this, AllMoviesActivity.class);
                UserActivity.this.startActivity(settingsIntent);
                break;
            case R.id.action_exit:
                userNameText.setText("Unknown");
                Intent loginIntent = new Intent (UserActivity.this, LoginActivity.class);
                loginIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(loginIntent);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
