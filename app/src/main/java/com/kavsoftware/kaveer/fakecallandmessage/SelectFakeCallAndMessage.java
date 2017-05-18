package com.kavsoftware.kaveer.fakecallandmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kavsoftware.kaveer.fakecallandmessage.FakeCall.FakeCall;

public class SelectFakeCallAndMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_fake_call_and_message);
        setTitle("Select option");

        Button fakeCall   = (Button)findViewById(R.id.BtnFakeCall);
        fakeCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fakeCallActivity = new Intent(SelectFakeCallAndMessage.this, FakeCall.class);
                startActivity(fakeCallActivity);
            }
        });

        Button fakeMessage   = (Button)findViewById(R.id.BtnFakeMessage);
        fakeMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fakeMessageActivity = new Intent(SelectFakeCallAndMessage.this, FakeMessage.class);
                startActivity(fakeMessageActivity);
            }
        });
    }
}
