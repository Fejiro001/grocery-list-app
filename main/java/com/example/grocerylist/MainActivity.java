package com.example.grocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    FloatingActionButton addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addBtn=(FloatingActionButton)findViewById(R.id.fab);

        addBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==addBtn){
            Intent intent=new Intent(this, NewListActivity.class);
            startActivity(intent);
        }

    }
}
