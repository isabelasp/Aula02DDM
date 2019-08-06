package br.edu.ifsc.aula02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortear(View view) {
        EditText nt1 = findViewById(R.id.textView4);
        EditText nt2 = findViewById(R.id.textView3);
        TextView sort = findViewById(R.id.textView5);

        int n1 = Integer.parseInt(nt1.getText().toString());
        int n2 = Integer.parseInt(nt2.getText().toString());
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt((n2 - n1) + 1) + n1;
        sort.setText(Integer.toString(valor));

    }
}
