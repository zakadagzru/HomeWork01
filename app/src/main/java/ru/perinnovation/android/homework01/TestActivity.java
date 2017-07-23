package ru.perinnovation.android.homework01;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ZChumarin on 23.07.2017.
 */

public class TestActivity extends AppCompatActivity {

    public static final String Metka = "Test Activity";

    private Button testButton;

    private TextView testTextView;

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://perinnovation.ru")));
            startActivity(new Intent(Intent.ACTION_SEND).putExtra(Intent.EXTRA_TEXT, "Peri Innovations").setType("text/plain"));
            startActivity(new Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:+79287654321")));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        testButton = (Button) findViewById(R.id.testButton);
        testButton.setOnClickListener(mOnClickListener);

        testTextView = (TextView) findViewById(R.id.testTextView);
        String str = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        if (str != null)
        {
            testTextView.setText(str);
        }

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
