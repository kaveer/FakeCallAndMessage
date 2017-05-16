package com.kavsoftware.kaveer.fakecallandmessage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class FakeCall extends AppCompatActivity {
    LinearLayout linearLayout;
    EditText number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_call);
        setTitle("Fake Call");

        Button call   = (Button)findViewById(R.id.BtnCall);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetEditText();
                Validation();
            }
        });

        Button options   = (Button)findViewById(R.id.BtnOptions);
        options.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout = (LinearLayout) findViewById(R.id.LinLayoutOption);

                if(linearLayout.getVisibility() == View.VISIBLE)
                    linearLayout.setVisibility(View.INVISIBLE);
                else
                    linearLayout.setVisibility(View.VISIBLE);
            }
        });
    }

    private void Validation() {
        if (number.getText().length() == 0)
            number.setError("Enter Number to call");
    }

    private void SetEditText() {
        number = (EditText) findViewById(R.id.TxtNumber);
    }
}
