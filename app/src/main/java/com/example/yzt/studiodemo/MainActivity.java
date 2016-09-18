package com.example.yzt.studiodemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Toast;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.x;

//@ContentView(R.layout.activity_main)
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x.view().inject(this);
    }

    @Event(value=R.id.tv,type = View.OnClickListener.class)
    private void onTextViewClick(View v){
        System.out.print("aaaaaaaaaaaaa");
        Toast.makeText(MainActivity.this,"aaaa",Toast.LENGTH_LONG).show();
    }
}
