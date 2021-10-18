package com.machwusa.translucent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //This code here is to hide the icon, you can comment it out to try it:
        /*PackageManager p = getPackageManager();
        ComponentName componentName = new ComponentName(this,
                com.machwusa.translucent.MainActivity.class); // activity which is first time open in manifiest file which is declare as <category android:name="android.intent.category.LAUNCHER" />
        p.setComponentEnabledSetting(componentName,PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);*/
        finish();
    }
}