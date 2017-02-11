package com.renanrhoden.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText caixaIdadeCachorro;
    private Button botaoDescobrirIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaIdadeCachorro = (EditText) findViewById(R.id.campoIdadeId);
        botaoDescobrirIdade = (Button) findViewById(R.id.botaoDescobrirIdadeId);
        resultadoIdade = (TextView) findViewById(R.id.campoResultadoIdadeId);

        botaoDescobrirIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoDigitado = caixaIdadeCachorro.getText().toString();

                if(textoDigitado.isEmpty()){
                    resultadoIdade.setText("Digite uma idade!");
                }
                else{
                    resultadoIdade.setText("A idade do cachorro em anos humanos é: " + Integer.parseInt(textoDigitado) * 7);
                }
            }
        });
    }
}
