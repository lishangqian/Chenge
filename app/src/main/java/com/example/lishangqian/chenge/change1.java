package com.example.lishangqian.chenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class change1 extends AppCompatActivity {

    private EditText editText2;
    private TextView textView2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change1);

        button3=(Button) findViewById(R.id.button3);
        editText2=(EditText) findViewById(R.id.editText2);
        textView2=(TextView) findViewById(R.id.textView2);

        final Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        textView2.setText(name);



        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name1=editText2.getText().toString();

                Intent result=new Intent();
                result.putExtra("name1",name1);
                setResult(0,result);
                finish();

            }


        });

    }




}
