package com.example.arqdsis.provaint201303893;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public static final String EXTRA_USERNAME= "com.example.arqdsis.provaint201303893.USERNAME";

    public void printResult (View view)
    {
        String txtTabuada, txtContador;


        Intent intent = new Intent(this, resultCalc.class);
        EditText tabuada = (EditText)findViewById(R.id.editTabuada);
        EditText contador = (EditText)findViewById(R.id.editContador);

        txtTabuada = tabuada.getText().toString();
        txtContador = contador.getText().toString();

        intent.putExtra(EXTRA_USERNAME, txtTabuada);
        intent.putExtra(EXTRA_USERNAME, txtContador);





        startActivity(intent);
    }

}
