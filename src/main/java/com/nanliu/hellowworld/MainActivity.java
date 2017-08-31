package com.nanliu.hellowworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AppsFlyerLib;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Installation Event Tracking.
        AppsFlyerLib.getInstance().startTracking(this.getApplication(),"t2xeyLDmqxxUGZkfNf7n86");

        //Purchase Event Tracking.
        Map<String, Object> eventValue = new HashMap<String, Object>();
        eventValue.put(AFInAppEventParameterName.REVENUE,200);
        eventValue.put(AFInAppEventParameterName.CONTENT_TYPE,"category_a");
        eventValue.put(AFInAppEventParameterName.CONTENT_ID,"1234567");
        eventValue.put(AFInAppEventParameterName.CURRENCY,"USD");
        AppsFlyerLib.getInstance().trackEvent(getApplicationContext(), AFInAppEventType.PURCHASE,eventValue);
    }
}
