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
        String string_to_be_converted_to_MD5 = "REPLACE_WITH YOUR_OWN_STRING";
        String MD5_Hash_String = md5(string_to_be_converted_to_MD5);
        Log.d("md5:", MD5_Hash_String);
        Log.d("md5:", "Hi");
    }
    public String md5(String s) {
        try {
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            for (int i=0; i<messageDigest.length; i++)
                hexString.append(Integer.toHexString(0xFF & messageDigest[i]));

            return hexString.toString();
        }catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}
