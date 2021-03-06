package com.example.nobodyme.alarm_notifi;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

import static android.content.Context.NOTIFICATION_SERVICE;



public class OurBroadcastReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarm Started", Toast.LENGTH_LONG).show();
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(2000);


        Notification noti=new Notification.Builder(context)
                .setContentTitle("New Message")
                .setContentText("hello here's the notification").setSmallIcon(R.mipmap.ic_launcher).build();

        NotificationManager manager = (NotificationManager)context.getSystemService(NOTIFICATION_SERVICE);
        noti.flags |= Notification.FLAG_AUTO_CANCEL;
        manager.notify(0, noti);




    }
}
