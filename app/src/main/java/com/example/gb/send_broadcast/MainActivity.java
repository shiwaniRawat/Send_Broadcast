package com.example.gb.send_broadcast;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendOutBroadcast(View view) {
        //It is a Explicit Intent beacuse we define the Receive.class in our intent directlly
      /*  Intent intent=new Intent(this,Receive.class);
        sendBroadcast(intent);*/
      Intent intent=new Intent();
     // intent.setClass(this,Receive.class);
        ComponentName cn=new ComponentName(this,Receive.class);
        intent.setComponent(cn);

        sendBroadcast(intent);
    }
}
