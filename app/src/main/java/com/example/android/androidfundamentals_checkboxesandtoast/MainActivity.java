package com.example.android.androidfundamentals_checkboxesandtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String message = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        CheckBox checkBox4 = findViewById(R.id.checkBox4);
        CheckBox checkBox5 = findViewById(R.id.checkBox5);


        if (checkBox1.isChecked()) {
            message = message + getString(R.string.chocolate_syrup);
        } else if (checkBox2.isChecked()) {
            message = message + getString(R.string.sprinkles);
        } else if (checkBox3.isChecked()) {
            message = message + getString(R.string.crushed_nuts);
        } else if (checkBox4.isChecked()) {
            message = message + getString(R.string.cherries);
        } else if (checkBox5.isChecked()) {
            message = message + getString(R.string.oreo_cookie_crumbles);
        }
    }

    public void showToast(View view) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}