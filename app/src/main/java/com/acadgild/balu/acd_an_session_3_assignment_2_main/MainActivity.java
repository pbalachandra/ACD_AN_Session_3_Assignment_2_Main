package com.acadgild.balu.acd_an_session_3_assignment_2_main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_violet, btn_indigo, btn_blue, btn_green, btn_yellow, btn_orange, btn_red;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vibgyor);
        btn_violet = (Button) findViewById(R.id.button_violet);
        btn_indigo = (Button) findViewById(R.id.button_indigo);
        btn_blue = (Button) findViewById(R.id.button_blue);
        btn_green = (Button) findViewById(R.id.button_green);
        btn_yellow = (Button) findViewById(R.id.button_yellow);
        btn_orange = (Button) findViewById(R.id.button_orange);
        btn_red = (Button) findViewById(R.id.button_red);

        btn_violet.setOnClickListener(this);
        btn_indigo.setOnClickListener(this);
        btn_blue.setOnClickListener(this);
        btn_green.setOnClickListener(this);
        btn_yellow.setOnClickListener(this);
        btn_orange.setOnClickListener(this);
        btn_red.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        String button_text = ((Button)v).getText().toString();
        String output_string = String.format(getResources().getString(R.string.color_selected),button_text);

        Log.i(button_text,output_string);
        Toast.makeText(this,output_string,Toast.LENGTH_LONG).show();
    }

}
