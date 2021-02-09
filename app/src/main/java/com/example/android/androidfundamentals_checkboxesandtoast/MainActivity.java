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

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = findViewById(R.id.linearLayout1);
        ArrayAdapter adapter = new ArrayAdapter();


            @Override
            public void setAdapter(Adapter adapter) {

            }

            @Override
            public View getSelectedView() {
                return null;
            }

            @Override
            public void setSelection(int position) {

            }
        }


    }



    public void showToast(View view) {
    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}