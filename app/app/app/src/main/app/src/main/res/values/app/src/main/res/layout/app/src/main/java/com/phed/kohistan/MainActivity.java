package com.phed.kohistan;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText name, phone, location, complaint;
    TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        location = findViewById(R.id.location);
        complaint = findViewById(R.id.complaint);
        status = findViewById(R.id.status);

        Button submit = findViewById(R.id.submit);
        Button call = findViewById(R.id.call);

        submit.setOnClickListener(v -> submitComplaint());

        call.setOnClickListener(v ->
                Toast.makeText(
                        this,
                        "PHED Kohistan Upper",
                        Toast.LENGTH_SHORT
                ).show()
        );
    }

    private void submitComplaint() {

        if (name.getText().toString().trim().isEmpty()
                || phone.getText().toString().trim().isEmpty()
                || complaint.getText().toString().trim().isEmpty()) {

            Toast.makeText(
                    this,
                    "Please fill Name, Mobile Number and Complaint.",
                    Toast.LENGTH_LONG
            ).show();

            return;
        }

        status.setText(
                "Complaint submitted successfully.\n" +
                "PHED Kohistan Upper"
        );

        name.setText("");
        phone.setText("");
        location.setText("");
        complaint.setText("");
    }
          }
