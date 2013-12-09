package com.mkyong.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class JagsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView text = new TextView(this);
        text.setText("Hello World, Jagadesh");
        setContentView(text);
        setContentView(R.layout.main);
    }
}