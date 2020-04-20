package com.example.grocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    TextView receive, receive1, receive2, receive3, receive4, receive5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        //Finds the textView by id
        receive = (TextView)findViewById(R.id.received);
        receive1 = (TextView)findViewById(R.id.received1);
        receive2 = (TextView)findViewById(R.id.received2);
        receive3 = (TextView)findViewById(R.id.received3);
        receive4 = (TextView)findViewById(R.id.received4);
        receive5 = (TextView)findViewById(R.id.received5);

        //Connects the editText views to the textViews
        receive.setText(getIntent().getStringExtra("message_key"));
        receive1.setText(getIntent().getStringExtra("message_key1"));
        receive2.setText(getIntent().getStringExtra("message_key2"));
        receive3.setText(getIntent().getStringExtra("message_key3"));
        receive4.setText(getIntent().getStringExtra("message_key4"));
        receive5.setText(getIntent().getStringExtra("message_key5"));
    }
    //Inflates the menu item in the activity
    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.message_activity_menu, menu);

        return super.onCreateOptionsMenu(menu);

    }
    //On clicking the share button
    //Added a click listener to my menu item, and used an intent to pop up the share menu
    @Override

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.mShare:

                Intent i = new Intent(

                        android.content.Intent.ACTION_SEND);

                i.setType("text/plain");

                i.putExtra(

                        android.content.Intent.EXTRA_TEXT, "This is my grocery list");

                startActivity(Intent.createChooser(

                        i,

                        "Share using"));

                break;

        }

        return super.onOptionsItemSelected(item);

    }
}
