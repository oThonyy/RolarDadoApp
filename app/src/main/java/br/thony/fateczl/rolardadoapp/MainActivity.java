package br.thony.fateczl.rolardadoapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RadioButton rbD4;
    private RadioButton rbD6;
    private RadioButton rbD8;
    private RadioButton rbD10;
    private RadioButton rbD12;
    private RadioButton rbD20;
    private RadioButton rbD100;
    private Button btnRolarDado;
    private Spinner spQntDado;
    private TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rbD4 = findViewById(R.id.rbD4);
        rbD4.setChecked(true);
        rbD6 = findViewById(R.id.rbD6);
        rbD8 = findViewById(R.id.rbD8);
        rbD10 = findViewById(R.id.rbD10);
        rbD12 = findViewById(R.id.rbD12);
        rbD20 = findViewById(R.id.rbD20);
        btnRolarDado = findViewById(R.id.btnRolarDado);
        spQntDado = findViewById(R.id.spQntDado);
        tvRes = findViewById(R.id.tvRes);

        preencherSpinner();
        btnRolarDado.setOnClickListener(op -> gerar());
    }

    private void gerar() {
        StringBuffer buffer = new StringBuffer();
        Integer qtd = (Integer) spQntDado.getSelectedItem();
        int cont = 0;
        int i = 0;
        if (rbD4.isChecked()) {
            while (cont < qtd) {
                if (i < 5) {
                    i = (int) (Math.random() * 4) + 1;
                    buffer.append(i);
                    if (cont < qtd - 1) {
                        buffer.append(", ");
                    }
                    cont++;
                    i = 0;
                }
            }
        } else if (rbD6.isChecked()) {
            while (cont < qtd) {
                if (i < 7) {
                    i = (int) (Math.random() * 6) + 1;
                    buffer.append(i);
                    if (cont < qtd - 1) {
                        buffer.append(", ");
                    }
                    cont++;
                    i = 0;
                }
            }
        } else if (rbD8.isChecked()) {
            while (cont < qtd) {
                if (i < 9) {
                    i = (int) (Math.random() * 8) + 1;
                    buffer.append(i);
                    if (cont < qtd - 1) {
                        buffer.append(", ");
                    }
                    cont++;
                    i = 0;
                }
            }
        } else if (rbD10.isChecked()) {
            while (cont < qtd) {
                if (i < 11) {
                    i = (int) (Math.random() * 10) + 1;
                    buffer.append(i);
                    if (cont < qtd - 1) {
                        buffer.append(", ");
                    }
                    cont++;
                    i = 0;
                }
            }
        } else if (rbD12.isChecked()) {
            while (cont < qtd) {
                if (i < 13) {
                    i = (int) (Math.random() * 12) + 1;
                    buffer.append(i);
                    if (cont < qtd - 1) {
                        buffer.append(", ");
                    }
                    cont++;
                    i = 0;
                }
            }
        } else if (rbD20.isChecked()) {
            while (cont < qtd) {
                if (i < 21) {
                    i = (int) (Math.random() * 20) + 1;
                    buffer.append(i);
                    if (cont < qtd - 1) {
                        buffer.append(", ");
                    }
                    cont++;
                    i = 0;
                }
            }
        } else {
            while (cont < qtd) {
                if (i < 101) {
                    i = (int) (Math.random() * 100) + 1;
                    buffer.append(i);
                    if (cont < qtd - 1) {
                        buffer.append(", ");
                    }
                    cont++;
                    i = 0;
                }
            }
        }
        tvRes.setText(buffer.toString());
    }

    private void preencherSpinner() {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, lista);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spQntDado.setAdapter(adapter);
    }
}