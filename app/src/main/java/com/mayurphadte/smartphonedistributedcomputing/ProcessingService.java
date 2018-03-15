package com.mayurphadte.smartphonedistributedcomputing;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by mayurphadte on 13/03/18.
 */

public class ProcessingService extends IntentService {
    public ProcessingService(){
        super("ProcessingService");

    }
    @Override
    protected void onHandleIntent(Intent intent){
        try{
            Thread.sleep(5000);
            Log.d("Hi", "hisii");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
