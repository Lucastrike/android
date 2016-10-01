package com.example.lucas.payment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickErase(View v){
        EditText account = (EditText) findViewById(R.id.account);
        EditText date = (EditText) findViewById(R.id.date);
        EditText ccv = (EditText) findViewById(R.id.ccv);
        ToggleButton promo = (ToggleButton) findViewById(R.id.promo);
        Spinner cardType = (Spinner) findViewById(R.id.cardType);

        account.setText("");
        date.setText("");
        ccv.setText("");
        promo.setChecked(false);
        cardType.setSelection(0);

    }

    public  void  clickSend (View v){

        final Intent i = new Intent(this, Message.class);

        EditText account = (EditText) findViewById(R.id.account);
        EditText date = (EditText) findViewById(R.id.date);
        EditText ccv = (EditText) findViewById(R.id.ccv);
        Spinner card = (Spinner) findViewById(R.id.cardType);
        ToggleButton promo = (ToggleButton) findViewById(R.id.promo);

        String accountMessage = account.getText().toString();
        i.putExtra("account", accountMessage);

        String dateMessage = date.getText().toString();
        i.putExtra("date", dateMessage);

        String ccvMessage = ccv.getText().toString();
        i.putExtra("ccv", ccvMessage);

        String cardMessage = card.getSelectedItem().toString();
        i.putExtra("cardType", cardMessage);

        String promoMessage = (String) promo.getText();
        i.putExtra("promo", promoMessage);

        startActivity(i);
    }


}
