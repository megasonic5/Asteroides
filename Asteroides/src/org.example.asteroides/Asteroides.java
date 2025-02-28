package org.example.asteroides;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Asteroides extends Activity {
    private Button bAcercaDe;

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        bAcercaDe = (Button) findViewById(R.id.button03);
        bAcercaDe.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                lanzarAcercaDe(null);
            }
        });
    }

    public void lanzarAcercaDe(View view) {
        Intent i = new Intent(this, AcercaDe.class);
        startActivity(i);
    }
}
