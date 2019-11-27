package com.owen.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SignUpActivity extends AppCompatActivity {
    private Button btnCreateAccount;
    private EditText etName, etPassword , etPhone;
    private ProgressDialog mDialog;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        //Instanciate Firebase
        //findIds
        //CreateAcount
    }
}
