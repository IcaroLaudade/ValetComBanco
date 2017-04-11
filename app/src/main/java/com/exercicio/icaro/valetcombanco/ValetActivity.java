package com.exercicio.icaro.valetcombanco;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Icaro on 01/04/2017.
 */

public class ValetActivity extends AppCompatActivity{
    @Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.valet);
         }
    public void adicionar(View view) {
        EditText txtModelo=((EditText)findViewById(R.id.modelo));
        EditText txtPlaca=((EditText)findViewById(R.id.placa));
        if(txtModelo.getText().toString().trim().equals("") || txtModelo.getText().toString().equals(null)|| txtPlaca.getText().toString().trim().equals("") || txtPlaca.getText().toString().equals(null) ){
            Toast t=Toast.makeText(this,"Não deixar em branco",Toast.LENGTH_SHORT);
            t.show();
           startActivity(new Intent(this,MainActivity.class));

        }else{
         Intent intent = new Intent();
         intent.putExtra("modelo", ((EditText) findViewById(R.id.modelo)).getText().toString());
         intent.putExtra("placa", ((EditText) findViewById(R.id.placa)).getText().toString());
         setResult(Activity.RESULT_OK, intent);
         finish();
        }
         }
}
