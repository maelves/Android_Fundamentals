package com.mnicoara.example.codechallenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText email = findViewById(R.id.email);
        EditText phone = findViewById(R.id.phone);

        Button submit = findViewById(R.id.submit);
        CheckBox terms = findViewById(R.id.TC);

        TextView output = findViewById(R.id.output);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputEmail = email.getText().toString();
                String inputPhone = phone.getText().toString();

                if (TextUtils.isEmpty(inputEmail) && !inputEmail.matches(Patterns.EMAIL_ADDRESS.pattern())) {
                    email.setError("Fill the input with a valid email address");
                    return;
                } else {
                    email.setError(null);
                }

                if (TextUtils.isEmpty(inputPhone)) {
                    phone.setError("Fill the input with a valid email address");
                    return;
                } else {
                    phone.setError(null);
                }

                if(terms.isChecked()){
                    Toast.makeText(MainActivity.this, "Check me!", Toast.LENGTH_LONG).show();
                    return;
                }

                output.setText(getString(R.string.output, inputEmail, inputPhone));
            }
        });
    }
}