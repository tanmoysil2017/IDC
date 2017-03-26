package com.idc.tanmoysil.irelanddurgotsab;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by tanmoy.sil on 26/03/2017.
 */
public class DailyServiceIDCOnBoot extends BroadcastReceiver{


    @Override
    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED))
        {
            DailyServiceIDC alarm = new DailyServiceIDC();
            alarm.setAlarm(context);

        }
    }
}
