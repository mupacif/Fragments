package be.formation.broadway;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirPlaneMode extends BroadcastReceiver {
    public AirPlaneMode() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        Toast.makeText(context,"AirplaneMode",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(context, MainActivity.class);
        i.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);


    }
}
