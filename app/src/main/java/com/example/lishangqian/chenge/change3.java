package com.example.lishangqian.chenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class change3 extends AppCompatActivity {

    private EditText editText3;
    private TextView textView3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change3);

        button4=(Button) findViewById(R.id.button4);
        editText3=(EditText) findViewById(R.id.editText3);
        textView3=(TextView) findViewById(R.id.textView3);

        final Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        textView3.setText(name);



        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name2=editText3.getText().toString();

                Intent result=new Intent();
                result.putExtra("name2",name2);
                setResult(1,result);
                finish();

            }


        });

    }




}
