package com.mobile.pizzaplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PedidoConcluido extends AppCompatActivity {

    public TextView textPedidoFinal;
    public String pedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido_concluido);
        textPedidoFinal = findViewById(R.id.textPedidoFinal);
        pedido = getIntent().getStringExtra("pedido");

        textPedidoFinal.setText(pedido);
    }

    public void pedirNovamente(View view) {
        Intent pedidos = new Intent(this, MainActivity.class);
        startActivity(pedidos);
    }

    public void sair(View view) {
        this.finishAffinity();
    }
}