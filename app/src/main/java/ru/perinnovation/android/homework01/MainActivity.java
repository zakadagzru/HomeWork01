package ru.perinnovation.android.homework01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String Metka = "Main Activity";

    private Button mainButton;

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, TestActivity.class);
            startActivity(intent);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainButton = (Button) findViewById(R.id.mainButton);
        mainButton.setOnClickListener(mOnClickListener);
        Log.i(Metka, " onCreate Event ");
    };

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Metka, " onRestart Event ");
    };

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Metka, " onStart Event ");
    };

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Metka, " onResume Event ");
    };

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Metka, " onPause Event ");
    };

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Metka, " onStop Event ");
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Metka, " onDestroy Event ");
    };

}
