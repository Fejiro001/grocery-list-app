package com.example.grocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class NewListActivity extends AppCompatActivity implements View.OnClickListener{
    Button doneBtn;
    EditText name, name1, name2, price, price1, price2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_list);
        
        doneBtn = (Button) findViewById(R.id.done);
        name = (EditText) findViewById(R.id.editText);
        name1 = (EditText) findViewById(R.id.editText1);
        name2 = (EditText) findViewById(R.id.editText2);
        price = (EditText) findViewById(R.id.editText3);
        price1 = (EditText) findViewById(R.id.editText4);
        price2 = (EditText) findViewById(R.id.editText5);

        doneBtn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this, MessageActivity.class);
        intent.putExtra("message_key", name.getText().toString());
        intent.putExtra("message_key1", name1.getText().toString());
        intent.putExtra("message_key2", name2.getText().toString());
        intent.putExtra("message_key3", price.getText().toString());
        intent.putExtra("message_key4", price1.getText().toString());
        intent.putExtra("message_key5", price2.getText().toString());
        startActivity(intent);
    }
}
