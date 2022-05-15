package com.example.aforu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton btnAddTask;
    Button btnHome;
    Button btnToday;
    Button btnWork;
    LinearLayout btnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddTask = (FloatingActionButton) findViewById(R.id.buttonAddTask);
        btnHome = (Button) findViewById(R.id.buttonHome);
        btnToday = (Button) findViewById(R.id.buttonToday);
        btnWork = (Button) findViewById(R.id.buttonWork);
        btnMain = (LinearLayout) findViewById(R.id.linearLayout);
        btnAddTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                funAddListItem();
            }
        });

    }

    void funCleanActivity()
    {
        btnAddTask.setVisibility(View.GONE);
        btnMain.setVisibility(View.GONE);
    }

    void funAddListItem()
    {
        funCleanActivity();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        AddListItemFragment addlistitemfragment =AddListItemFragment.newInstance("a","af");
        ft.replace(R.id.frameLayout, addlistitemfragment);
        ft.commit();
    }


}