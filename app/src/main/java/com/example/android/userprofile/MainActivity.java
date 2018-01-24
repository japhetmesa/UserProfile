package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameTextView = (TextView) findViewById(R.id.name);
        nameTextView.setText("Muntasir Biojid");
        TextView birthdayTextView = (TextView) findViewById(R.id.birthday);
        birthdayTextView.setText("April 15 1992");
        TextView countryTextView = (TextView) findViewById(R.id.country);
        countryTextView.setText("Bangladesh");
        ImageView profilePicImageView = (ImageView) findViewById(R.id.profile_picture);
        profilePicImageView.setImageResource(R.drawable.profile_pic);
    }
}
