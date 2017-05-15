package com.kavsoftware.kaveer.fakecallandmessage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FakeMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_message);

        setTitle("Fake Message");
    }
}
