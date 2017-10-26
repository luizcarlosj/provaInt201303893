package com.example.arqdsis.provaint201303893;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class resultCalc extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_calc);



        Intent intent = getIntent();
        String txtTabuada = intent.getStringExtra(MainActivity.EXTRA_USERNAME);
        String txtContador = intent.getStringExtra(MainActivity.EXTRA_USERNAME);
        TextView txtResult = findViewById(R.id.resultTab);

        txtResult.setText(txtTabuada +"*"+ txtContador + "= ");


    }


    public void calcularTab (View view) {

        int numTab, numCont;
        EditText editTabuada = findViewById(R.id.idTabuada);
        EditText editContador = findViewById(R.id.idContador);
        numTab = Integer.parseInt(editTabuada.getText().toString());
        numCont = Integer.parseInt(editContador.getText().toString());


        int c, result;
        for (c = 0; c <= numCont; c++) {
            result = numTab * c;


        }
    }

}
