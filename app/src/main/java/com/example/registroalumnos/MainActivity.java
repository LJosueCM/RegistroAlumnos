package com.example.registroalumnos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etApellidos;
    EditText etCuenta;
    ImageView btnRegistrar;
    ImageView btnVer;
    RadioGroup rgGenero;
    RadioButton rbSexo;
    public String sexo="Masculino";

    public static List<Alumno> alumnos=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etApellidos = findViewById(R.id.etApellidos);
        etCuenta = findViewById(R.id.etCuenta);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        btnVer = findViewById(R.id.btnVer);
        rgGenero = findViewById(R.id.radioGroup);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateName();
                validateApellido();
                validateAccount();
                if (validateName() && validateApellido() && validateAccount()) {
                    String nombre = etName.getText().toString();
                    String apellidos = etApellidos.getText().toString();
                    String cuenta = etCuenta.getText().toString();
                    if (sexo.equals("Masculino")) {
                        alumnos.add(new Alumno(nombre + " " + apellidos, cuenta, R.drawable.hombre));
                    } else {
                        alumnos.add(new Alumno(nombre + " " + apellidos, cuenta, R.drawable.mujer));
                    }
                    Toast.makeText(MainActivity.this, getResources().getString(R.string.confirmed), Toast.LENGTH_LONG).show();
                }
            }
        });

        btnVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Listar.class);
                startActivityForResult(intent, 0);
            }
        });

    }

    public void checkButton(View v){
        int radioId = rgGenero.getCheckedRadioButtonId();
        rbSexo = findViewById(radioId);
        sexo = rbSexo.getText().toString();
    }

    private boolean validateName(){
        String NameInput = etName.getText().toString().trim();
        if (NameInput.isEmpty()) {
            etName.setError(getResources().getString(R.string.error1));
            return false;
        } else {
            etName.setError(null);
            return true;
        }
    }

    private boolean validateApellido(){
        String ApellidoInput = etApellidos.getText().toString().trim();
        if (ApellidoInput.isEmpty()) {
            etApellidos.setError(getResources().getString(R.string.error1));
            return false;
        } else {
            etApellidos.setError(null);
            return true;
        }
    }

    private boolean validateAccount(){
        String AccountInput = etCuenta.getText().toString().trim();
        if (AccountInput.isEmpty()) {
            etCuenta.setError(getResources().getString(R.string.error1));
            return false;
        } else if (AccountInput.length()<9) {
            etCuenta.setError(getResources().getString(R.string.errorAccount));
            return false;
        } else {
            etCuenta.setError(null);
            return true;
        }
    }
}