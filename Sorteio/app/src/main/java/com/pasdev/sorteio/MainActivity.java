package com.pasdev.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearMega(View view){

        TextView numero1 = findViewById(R.id.txvNumero1);
        TextView numero2 = findViewById(R.id.txvNumero2);
        TextView numero3 = findViewById(R.id.txvNumero3);
        TextView numero4 = findViewById(R.id.txvNumero4);
        TextView numero5 = findViewById(R.id.txvNumero5);
        TextView numero6 = findViewById(R.id.txvNumero6);

        int n1 = new Random().nextInt(61);
        numero1.setText("Número 1: " + Integer.toString(n1));

        int n2 = new Random().nextInt(61);
        numero2.setText("Número 2: " +  Integer.toString(n2));

        int n3 = new Random().nextInt(61);
        numero3.setText("Número 3: " +  Integer.toString(n3));

        int n4 = new Random().nextInt(61);
        numero4.setText("Número 4: " +  Integer.toString(n4));

        int n5 = new Random().nextInt(61);
        numero5.setText("Número 5: " +  Integer.toString(n5));

        int n6 = new Random().nextInt(61);
        numero6.setText("Número 6: " +  Integer.toString(n6));
    }

}