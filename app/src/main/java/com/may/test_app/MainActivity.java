package com.may.test_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void animation(View view){

        ImageView firstImage = findViewById(R.id.animationFirst);

        ImageView secondImage = findViewById(R.id.animationSecond);

        firstImage.animate().alpha(0f).setDuration(2000);

        secondImage.animate().alpha(1f).setDuration(4000);


    }


    public void clickButton(View view){

        ImageView myImage = findViewById(R.id.myImage);

        myImage.setImageResource(R.drawable.artboard_4);

        Toast.makeText(getApplicationContext(), "Hi man!", Toast.LENGTH_LONG).show();

        EditText myTextField = findViewById(R.id.textField);

        Log.i("TextFieldValue", myTextField.getText().toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
