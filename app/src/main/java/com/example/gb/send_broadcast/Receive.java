package com.example.gb.send_broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by GB on 8/17/2018.
 */

public class Receive extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context," receive",Toast.LENGTH_SHORT).show();
    }
}
