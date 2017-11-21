package com.example.lovejoseph.caremmunity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class RegformActivity extends AppCompatActivity {

    //varibles

    private  View progressView;
    private  View passwordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regform);

        //initalizing form

        passwordView = findViewById(R.id.passText);
        progressView = findViewById(R.id.progressBar);
        Button regbtn = findViewById(R.id.reg_submit_btn);

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                codeConfirmation();
            }
        });
    }


    private void codeConfirmation() {
        
    }


}
