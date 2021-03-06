package com.example.walpurisnacht.androidproto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
    implements TestFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSwitchClick(View view) {
        Intent intent = new Intent(this, SwitchActivity.class);
        TestFragment testFragment = (TestFragment) getSupportFragmentManager
                ().findFragmentById(R.id.fragment);
        TextView textView = (TextView) testFragment.getView().findViewById(R.id
                .textView);
        intent.putExtra("TEXT_VIEW_DATA", textView.getText());
        startActivity(intent);
    }

    @Override
    public void syncValue(View view) {

        TestFragment testFragment = (TestFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment);

        TextView mainView = (TextView) findViewById(R.id.mainView);

        TextView textView = (TextView) testFragment.getView().findViewById(R.id
                .textView);
        mainView.setText(textView.getText());
    }
}
