package com.mayurphadte.smartphonedistributedcomputing;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by mayurphadte on 13/03/18.
 */

public class ProcessingService extends IntentService {
    public ProcessingService(){
        super("ProcessingService");

    }
    @Override
    protected void onHandleIntent(Intent intent){
        String string_to_be_converted_to_MD5 = "555555";
        //Log.d("md5:", MD5_Hash_String);
        //Log.d("md5:", "Hi");
        //Hello
        Log.d();


        //Log.d("Hi", String.valueOf('a'+'a'));
        Log.d("Hi", "49f68a5c8493ec2c0bf489821c21fc3b");
        long startTime = System.currentTimeMillis();
        for(char alphabet1 = 'a'; alphabet1 <= 'z'; alphabet1 ++){
            for(char alphabet2 = 'a'; alphabet2 <= 'z'; alphabet2 ++){
                Log.d("..", MD5(String.valueOf(alphabet1)+String.valueOf(alphabet2)));
                if(MD5(String.valueOf(alphabet1)+String.valueOf(alphabet2)).equals("49f68a5c8493ec2c0bf489821c21fc3b")){
                    Log.d("Found at",String.valueOf(alphabet1)+String.valueOf(alphabet2));
                    break;
                }
            }


        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        Log.d("Time: ",String.valueOf(elapsedTime));
    }
    public String MD5(String md5) {

        try {

            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");

            byte[] array = md.digest(md5.getBytes());

            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < array.length; ++i) {

                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));

            }

            return sb.toString();

        } catch (java.security.NoSuchAlgorithmException e) {

        }

        return null;

    }

}
