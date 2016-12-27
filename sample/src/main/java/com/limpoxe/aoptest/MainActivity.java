package com.limpoxe.aoptest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by cailiming on 16/12/27.
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        doSomething();
    }

    public void doSomething() {
        Log.e("xx", "doSomething...");
    }


}
