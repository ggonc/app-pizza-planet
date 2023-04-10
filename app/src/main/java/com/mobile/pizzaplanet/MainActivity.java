package com.mobile.pizzaplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public EditText inputQuantidade1, inputQuantidade2, inputQuantidade3, inputQuantidade4;
    public String pedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputQuantidade1 = findViewById(R.id.inputQuantidade1);
        inputQuantidade2 = findViewById(R.id.inputQuantidade2);
        inputQuantidade3 = findViewById(R.id.inputQuantidade3);
        inputQuantidade4 = findViewById(R.id.inputQuantidade4);
    }

    public void fazerPedido(View view) {
        Random r = new Random();
        int low = 20;
        int high = 60;
        int tempoEspera = r.nextInt(high - low) + low;

        pedido = "Seu pedido chegará em " + tempoEspera + " minutos.";

        Intent pedidoConcluido = new Intent(this, PedidoConcluido.class);
        pedidoConcluido.putExtra("pedido", pedido);
        startActivity(pedidoConcluido);
    }

}