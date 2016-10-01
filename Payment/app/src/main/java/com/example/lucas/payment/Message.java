package com.example.lucas.payment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Intent i = getIntent();

        String account = i.getStringExtra("account");
        TextView accountText = (TextView) findViewById(R.id.accountText);
        accountText.append(account);

        String date = i.getStringExtra("date");
        TextView dateText = (TextView) findViewById(R.id.dateText);
        dateText.append(date);

        String ccv = i.getStringExtra("ccv");
        TextView ccvText = (TextView) findViewById(R.id.ccvText);
        ccvText.append(ccv);

        String card = i.getStringExtra("cardType");
        TextView cardText = (TextView) findViewById(R.id.cardText);
        cardText.append(card);

        String promo = i.getStringExtra("promo");
        TextView promoText = (TextView) findViewById(R.id.promoText);
        promoText.append(promo);

    }
}
