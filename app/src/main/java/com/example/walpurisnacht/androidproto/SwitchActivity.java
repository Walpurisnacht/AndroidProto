package com.example.walpurisnacht.androidproto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SwitchActivity extends AppCompatActivity
    implements TestFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        Intent intent = getIntent();

        TestFragment testFragment = (TestFragment) getSupportFragmentManager
                ().findFragmentById(R.id.fragment);
        TextView textView = (TextView) testFragment.getView().findViewById(R.id
                .textView);
        textView.setText(intent.getStringExtra("TEXT_VIEW_DATA"));
    }

    @Override
    public void syncValue(View view) {
        TextView textView = (TextView) findViewById(R.id.mainView);


        textView.setText("Different behavior");
    }
}
