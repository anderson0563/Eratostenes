package br.anderson.eratostenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tela extends AppCompatActivity {
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBarN = (SeekBar)findViewById(R.id.idSeekBar);
        int NUsuario = seekBarN.getProgress();


        Button calcular = (Button)findViewById(R.id.idCalcular);
        calcular.setOnClickListener( v -> {
            EditText N = (EditText)findViewById(R.id.idN);
            int NUsuario = Integer.parseInt(N.getText().toString());
            String NPrimos = recuperarN(this);
            String ListaNPrimos = recuperarPrimos(this);

            if(NPrimos.equals("Não disponível")) {
                TextView Resultado = (TextView) findViewById(R.id.idResultado);
                int n = NUsuario;
                List<Integer> lista = (new CalculoEratostenes()).findPrimes(n);
                Resultado.setText(lista.toString());
                guardarN(this, String.valueOf(n));
                guardarPrimos(this, lista.toString());
                System.out.println("if-1");
            }else
            if(NUsuario>Integer.parseInt(NPrimos)){
                TextView Resultado = (TextView) findViewById(R.id.idResultado);
                int n = NUsuario;
                List<Integer> lista = (new CalculoEratostenes()).findPrimes(n);
                Resultado.setText(lista.toString());
                System.out.println("if-2");
            }else{
                String NovaLista = recuperarNPrimos(ListaNPrimos, NUsuario);
                TextView Resultado = (TextView) findViewById(R.id.idResultado);
                Resultado.setText(NovaLista);
                System.out.println("if-3");
            }
        });
    }
    protected void guardarPrimos(Context contexto, String lista){
        SharedPreferences minhasPreferencias = contexto.getSharedPreferences("SP", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = minhasPreferencias.edit();
        editor.putString("PRIMOS", lista);
        editor.apply();
    }
    protected void guardarN(Context contexto, String n){
        SharedPreferences minhasPreferencias = contexto.getSharedPreferences("SP", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = minhasPreferencias.edit();
        editor.putString("N", n);
        editor.apply();
    }
    protected String recuperarN(Context contexto){
        return contexto.getSharedPreferences("SP", MODE_PRIVATE).getString("N", "Não disponível");
    }
    protected String recuperarPrimos(Context contexto){
        return contexto.getSharedPreferences("SP", MODE_PRIVATE).getString("PRIMOS", "Não disponível");
    }
    protected String recuperarNPrimos(String primos, int n){
        primos = primos.substring(1, primos.length()-1);
        primos = primos.replace(" ", "");
        List<String> lista = new ArrayList<>(Arrays.asList(primos.split(",")));
        List<Integer> novaLista = new ArrayList<>();
        for(String numero: lista){
            int N = Integer.parseInt(numero);
            if(N<n)
                novaLista.add(N);
        }
        return novaLista.toString();
    }

 */
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button calcular = (Button)findViewById(R.id.idCalcular);
    calcular.setOnClickListener( v -> {
        EditText N = (EditText)findViewById(R.id.idN);
        TextView Resultado = (TextView) findViewById(R.id.idResultado);
        int n = Integer.parseInt(N.getText().toString());

        List<Integer> lista = (new CalculoEratostenes()).findPrimes(n);
        Resultado.setText(lista.toString());


       // ((TextView) findViewById(R.id.idResultado)).setText(((List<Integer>)new CalculoEratostenes().findPrimes(Integer.parseInt((findViewById(R.id.idN)).getText().toString()))).toString());


    });
}

}