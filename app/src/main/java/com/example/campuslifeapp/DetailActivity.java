package com.example.campuslifeapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Gets the intent sent over from MainActivity and extracts the extra values that were included
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int index = intent.getIntExtra("index", 0);

        //Gets the arrays of icons, titles, and contents from arrays.xml
        String[] icons = getResources().getStringArray(R.array.string_array_images);
        String[] titles = getResources().getStringArray(R.array.string_array_titles);
        String[] contents = getResources().getStringArray(R.array.string_array_content);

        //Access the views to be changed
        ImageView iv_icon = (ImageView) findViewById(R.id.iv_icon);
        TextView tv_name = (TextView) findViewById(R.id.tv_name);
        TextView tv_title = (TextView) findViewById(R.id.tv_title);
        TextView tv_content = (TextView) findViewById(R.id.tv_content);

        //Finding the resource id for the drawable since we can't set the image using the string only
        String drawableName = icons[index].trim();
        int resourceId = getResources().getIdentifier(drawableName, "drawable", getPackageName());

        //Update the UI (views)
        iv_icon.setImageResource(resourceId);
        tv_name.setText(name);
        tv_title.setText(titles[index].trim());
        tv_content.setText(contents[index].trim());
    }
}