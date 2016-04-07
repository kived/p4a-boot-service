package org.kivy.servtest;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;
import android.util.Log;

public class BootCompletedReceiver extends BroadcastReceiver {
	public void onReceive(Context context, Intent intent) {
		Log.i("ServiceMyservice", "received intent");
		ServiceMyservice.start(context, "");
	}
}
