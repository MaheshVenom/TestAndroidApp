package com.ideasandinstars.trignometriccalculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TrignometricCalc extends AppCompatActivity implements DialogInterface.OnClickListener {

    TextView tOutput,sButton,cButton,tButton;
    EditText eInput;
    String ei1,o2;
    double ei2,outValue,ei2R, ei2D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trignometric_calc);
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
            o2 = Double.toString(round(outValue,5));
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
            tOutput.setText(o2);
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
