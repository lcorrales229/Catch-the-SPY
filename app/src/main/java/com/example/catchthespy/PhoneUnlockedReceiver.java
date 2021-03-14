package com.example.catchthespy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import android.widget.Toast;


public class PhoneUnlockedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_USER_PRESENT)){
            CameraManager mgr = new CameraManager(this);
            mgr.getCameraIdList();
            Toast.makeText(context,"Photo saved to Pictures\\iSelfie",Toast.LENGTH_SHORT).show();

        }else if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)){
            Log.d("asdaxxx", "Phone locked");
        }
        else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)){
            Log.d("asdaxxx", "Power On");
            //Toast.makeText(context,"Power On",Toast.LENGTH_SHORT).show();

        }


    }
}
