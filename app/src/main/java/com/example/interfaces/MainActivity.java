package com.example.interfaces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox checkDocumentos;
    TextView txtEstado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkDocumentos = (CheckBox) findViewById(R.id.checkControl);
        txtEstado = (TextView) findViewById(R.id.txtEstado);

        checkDocumentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean bandera = ((CheckBox) v).isChecked();

                if( bandera == true ){
                    txtEstado.setText("CheckBox marcado");
                } else {
                    txtEstado.setText("CheckBox No marcado");
                }
            }
        });
    }
}
