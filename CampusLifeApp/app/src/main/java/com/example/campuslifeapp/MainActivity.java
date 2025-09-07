package com.example.campuslifeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * A function that triggers a toast and calls the method to start an activity for the Facilities page.
     * @param v The ImageButton view that was clicked.
     */
    public void onClickFacilities(View v) {
        Toast.makeText(this, "Facilities clicked", Toast.LENGTH_SHORT).show();
        startDetailActivity("Facilities", 0);
    }

    /**
     * A function that triggers a toast and calls the method to start an activity for the Events page.
     * @param v The ImageButton view that was clicked.
     */
    public void onClickEvents(View v) {
        Toast.makeText(this, "Events clicked", Toast.LENGTH_SHORT).show();
        startDetailActivity("Events", 1);
    }

    /**
     * A function that triggers a toast and calls the method to start an activity for the Clubs page.
     * @param v The ImageButton view that was clicked.
     */
    public void onClickClubs(View v) {
        Toast.makeText(this, "Clubs clicked", Toast.LENGTH_SHORT).show();
        startDetailActivity("Clubs", 2);
    }

    /**
     * A function that triggers a toast and calls the method to start an activity for the Support page.
     * @param v The ImageButton view that was clicked.
     */
    public void onClickSupport(View v) {
        Toast.makeText(this, "Support clicked", Toast.LENGTH_SHORT).show();
        startDetailActivity("Support", 3);
    }

    /**
     * A function that creates an intent to start an activity with extra values included.
     * @param name The name of the ImageButton clicked.
     * @param index The index that corresponds the details of that ImageButton clicked.
     */
    public void startDetailActivity(String name, int index) {
        //Creates intent that starts up DetailActivity
        Intent intent = new Intent(this, DetailActivity.class);
        //Adds extra values so the activity knows which page to display
        intent.putExtra("name", name);
        intent.putExtra("index", index);
        //Starts the activity
        startActivity(intent);
    }
}