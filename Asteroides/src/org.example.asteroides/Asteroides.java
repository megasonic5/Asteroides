package org.example.asteroides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Asteroides extends Activity {
    private Button bAcercaDe;
    private Button bSalir;
    private Button bConfigurar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        bConfigurar = (Button) findViewById(R.id.Button02);
        bConfigurar.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                mostrarPreferencias(null);
            }
        });
        bAcercaDe = (Button) findViewById(R.id.Button03);
        bAcercaDe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                lanzarAcercaDe(null);
            }
        });
        bSalir = (Button) findViewById(R.id.Button04);
        bSalir.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void mostrarPreferencias(View view) {
        Intent i = new Intent(this, Preferencias.class);
        startActivity(i);
    }

    public void lanzarAcercaDe(View view) {
        Intent i = new Intent(this, AcercaDe.class);
        startActivity(i);
    }
}
