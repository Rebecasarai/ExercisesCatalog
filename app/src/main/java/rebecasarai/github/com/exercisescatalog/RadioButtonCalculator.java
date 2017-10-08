package rebecasarai.github.com.exercisescatalog;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RadioButtonCalculator extends AppCompatActivity {
    private EditText num1, num2;
    private RadioButton sumar,restar,dividir, multiplicar;
    private TextView resul;
    public double number1, number2;
    public double resultado;
    RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_calculator);num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        sumar = (RadioButton) findViewById(R.id.suma);
        restar = (RadioButton) findViewById(R.id.resta);
        dividir = (RadioButton) findViewById(R.id.divi);
        multiplicar = (RadioButton) findViewById(R.id.multi);
        resul = (TextView) findViewById(R.id.resul);
        group = (RadioGroup) findViewById(R.id.group);
        group.clearCheck();
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                number1 = Double.parseDouble(num1.getText().toString());
                number2 = Double.parseDouble(num2.getText().toString());
                if (i == R.id.suma) {
                    final String text = "Has sumado";
                    //Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
                    resultado = number1 + number2;
                    mostrarResultado(resultado);
                }
                if (i == R.id.resta) {
                    final String text = "Has restado";
                    Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
                    resultado = number1 - number2;
                    mostrarResultado(resultado);
                }
                if (i == R.id.multi) {
                    final String text = "Has Multiplicado";
                    Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
                    resultado = number1 * number2;
                    mostrarResultado(resultado);
                }
                if (i == R.id.divi) {
                    final String text = "Has dividido";
                    Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
                    resultado = number1 / number2;
                    mostrarResultado(resultado);
                }
                //RadioButton rb=(RadioButton)findViewById(R.id.suma);
                //Toast.makeText(getApplicationContext(), rb.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void mostrarResultado(double resultado) {
        resul.setText("" + resultado);
    }


}