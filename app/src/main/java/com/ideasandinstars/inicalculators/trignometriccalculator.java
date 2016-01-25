package com.ideasandinstars.inicalculators;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Kiran Prabhakar on 13-01-2016.
 */
public class trignometriccalculator extends AppCompatActivity implements DialogInterface.OnClickListener  {


    TextView tOutput,sButton,cButton,tButton;
    EditText eInput;
    String ei1,o2;
    double ei2,outValue,ei2R;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        setContentView(R.layout.trignometriccalculator);
        sButton = (Button) findViewById(R.id.sinButton);
        cButton = (Button) findViewById(R.id.cosButton);
        tButton = (Button) findViewById(R.id.tanButton);
        tOutput = (TextView) findViewById(R.id.tvOutput);

    }

    public void sineClicked(View v){
        eInput = (EditText) findViewById(R.id.etInput);
        ei1 = eInput.getText().toString();

        try{
            ei2 = Double.parseDouble(ei1);
            ei2R = ei2 * (Math.PI / 180);
            outValue = Math.sin(ei2R);
            o2 = Double.toString(round(outValue,5));
            tOutput.setText(o2);

        } catch (final NumberFormatException e) {
            tOutput.setText("Invalid Input");
        }

    }

    public void cosClicked(View v){
        eInput = (EditText) findViewById(R.id.etInput);
        ei1 = eInput.getText().toString();

        try{
            ei2 = Double.parseDouble(ei1);
            ei2R = ei2 * (Math.PI / 180);
            outValue = Math.cos(ei2R);
            o2 = Double.toString(round(outValue, 5));
            tOutput.setText(o2);

        } catch (final NumberFormatException e) {
            tOutput.setText("Invalid Input");
        }

    }
    public void tanClicked(View v) {
        eInput = (EditText) findViewById(R.id.etInput);
        ei1 = eInput.getText().toString();

        try {
            ei2 = Double.parseDouble(ei1);
            ei2R = ei2 * (Math.PI / 180);
            outValue = Math.tan(ei2R);
            o2 = Double.toString(round(outValue, 5));
            if (ei2 == 90){
                tOutput.setText("Not Defined");
            }else {
                tOutput.setText(o2);
            }
        } catch (final NumberFormatException e) {
            ei2 = 0.0;

        }
    }
    public void secClicked(View v) {
        eInput = (EditText) findViewById(R.id.etInput);
        ei1 = eInput.getText().toString();

        try {
            ei2 = Double.parseDouble(ei1);
            ei2R = ei2 * (Math.PI / 180);
            outValue = 1/Math.cos(ei2R);
            if (round(Math.cos(ei2R),2) == 0.0)
            {
                tOutput.setText("Cannot be divided by Zero");
            }
            else {

                o2 = Double.toString(round(outValue, 5));
                tOutput.setText(o2);
            }

        } catch (final NumberFormatException e) {
            ei2 = 0.0;

        }
    }
    public void csecClicked(View v) {
        eInput = (EditText) findViewById(R.id.etInput);
        ei1 = eInput.getText().toString();

        try {
            ei2 = Double.parseDouble(ei1);
            ei2R = ei2 * (Math.PI / 180);
            outValue = 1/Math.sin(ei2R);
            if (round(Math.sin(ei2R),2) == 0.0)
            {
                tOutput.setText("Cannot be divided by Zero");
            }
            else {

                o2 = Double.toString(round(outValue, 5));
                tOutput.setText(o2);
            }

        } catch (final NumberFormatException e) {
            ei2 = 0.0;

        }
    }
    public void cotClicked(View v) {
        eInput = (EditText) findViewById(R.id.etInput);
        ei1 = eInput.getText().toString();

        try {
            ei2 = Double.parseDouble(ei1);
            ei2R = ei2 * (Math.PI / 180);
            outValue = 1/Math.tan(ei2R);
            if (round(Math.tan(ei2R),2) == 0.0)
            {
                tOutput.setText("Cannot be divided by Zero");
            }
            else {

                o2 = Double.toString(round(outValue, 5));
                tOutput.setText(o2);
            }
        } catch (final NumberFormatException e) {
            ei2 = 0.0;

        }
    }

    public void logClicked(View v) {
        eInput = (EditText) findViewById(R.id.etInput);
        ei1 = eInput.getText().toString();

        try {
            ei2 = Double.parseDouble(ei1);
            outValue = 1/Math.log10(ei2);
            if (ei2 == 0){
                tOutput.setText("Not Defined");
            }
            else {

                o2 = Double.toString(round(outValue, 5));
                tOutput.setText(o2);
            }
        } catch (final NumberFormatException e) {
            ei2 = 0.0;

        }
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

    }
}




