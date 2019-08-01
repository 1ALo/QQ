package com.example.florida.ziad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       textView=findViewById(R.id.text_view);
       Bundle b=new Bundle();
       String name=b.getString("key1");
       String name2=b.getString("key2");

        textView.setText(name+"\n"+name2);
    }
}
