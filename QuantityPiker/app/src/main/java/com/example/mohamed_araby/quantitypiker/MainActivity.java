package com.example.mohamed_araby.quantitypiker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private int quantity=0;
private  int price=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementButton(View view){
        displayQuantity(++quantity);

    }
    public void decrementButton(View view){
        if(quantity<0){
            displayQuantity(--quantity);
        }

    }
    public void displayQuantity(int q){
        TextView quant=(TextView) findViewById(R.id.quantity);
        quant.setText(String.valueOf(q));
        TextView pric=(TextView) findViewById(R.id.price);
        pric.setText(String.valueOf(q*10));
        price=q*10;


    }
    public void order(){
        displayMassege("Total Price = "+String.valueOf(price));
    }
    public void displayMassege(String msg){
        TextView pric=(TextView) findViewById(R.id.price);
        pric.setText(msg+"\n"+"Thank you :)");
    }


}
