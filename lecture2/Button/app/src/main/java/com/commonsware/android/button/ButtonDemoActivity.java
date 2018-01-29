package com.commonsware.android.button;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonDemoActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = (Button) findViewById(R.id.button1);
        button.setText("This is new text");
    }
    public void showToast(View button){
        Toast.makeText(getApplicationContext(),"Button is clicked",Toast.LENGTH_SHORT).show();
    }

}