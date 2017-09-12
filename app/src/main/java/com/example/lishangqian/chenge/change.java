package com.example.lishangqian.chenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class change extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private EditText editText1;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);

        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        editText1=(EditText) findViewById(R.id.editText1);
        textView1=(TextView) findViewById(R.id.textView1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nr = editText1.getText().toString();
                Intent intent = new Intent(change.this, change1.class);
                intent.putExtra("name",nr);
                startActivityForResult(intent,0);
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nr = editText1.getText().toString();
                Intent intent = new Intent(change.this, change3.class);
                intent.putExtra("name",nr);
                startActivityForResult(intent,1);
            }

        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==0&& resultCode==0) {
            String use1 = data.getStringExtra("name1");
            textView1.setText(use1);
        }
        else {
            String use2 = data.getStringExtra("name2");
            textView1.setText(use2);
        }


    }

}
