package com.kavsoftware.kaveer.fakecallandmessage.FakeCall;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.kavsoftware.kaveer.fakecallandmessage.R;

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
            if (Validation()){
                String FakeNumber = number.getText().toString();

                FakeRing(FakeNumber);

            }
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

    private void FakeRing(String fakeNumber) {
        Intent FakeRing = new Intent(FakeCall.this, FakeCallRinging.class);
        FakeRing.putExtra("fakeNumber", fakeNumber);
        startActivity(FakeRing);
    }



    private Boolean Validation() {
        Boolean result = true;

        if (number.getText().length() == 0) {
            number.setError("Enter Number to call");
            return false;
        }

        return result;
    }

    private void SetEditText() {
        number = (EditText) findViewById(R.id.TxtNumber);
    }
}
