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

    private String message = "";
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);

    }

    public void showToast(View view) {

        if (checkBox1.isChecked()) {
            message = message + getString(R.string.chocolate_syrup) + " ";
        }
        if (checkBox2.isChecked()) {
            message = message + getString(R.string.sprinkles) + " ";
        }
        if (checkBox3.isChecked()) {
            message = message + getString(R.string.crushed_nuts) + " ";
        }
        if (checkBox4.isChecked()) {
            message = message + getString(R.string.cherries) + " ";
        }
        if (checkBox5.isChecked()) {
            message = message + getString(R.string.oreo_cookie_crumbles) + " ";
        }

        Toast.makeText(this, message + ".", Toast.LENGTH_SHORT).show();
        message = "";

    }
}