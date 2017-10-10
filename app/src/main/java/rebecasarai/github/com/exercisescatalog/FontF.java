package rebecasarai.github.com.exercisescatalog;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class FontF extends AppCompatActivity implements View.OnClickListener {
    CheckBox bold,gigantic, tiny, red;
    TextView textoAcambiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoAcambiar= (TextView) findViewById(R.id.textoAcambiar);
        bold = (CheckBox) findViewById(R.id.checkBox);
        gigantic = (CheckBox) findViewById(R.id.checkBox2);
        tiny = (CheckBox) findViewById(R.id.checkBox3);
        red = (CheckBox) findViewById(R.id.checkBox4);
        bold.setOnClickListener(this);
        gigantic.setOnClickListener(this);
        tiny.setOnClickListener(this);
        red.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // Esta checkeado?
        boolean checked = ((CheckBox) view).isChecked();

        // Chequea si esta chequeado o no, uno a uno
        switch(view.getId()) {
            case R.id.checkBox:
                if (checked) {
                    //Negrita
                    textoAcambiar.setTypeface(null, Typeface.BOLD);

                }else {
                    //Normal
                    textoAcambiar.setTypeface(null, Typeface.NORMAL);
                }
                break;
            case R.id.checkBox2:
                if (checked) {
                    //Gigante
                    textoAcambiar.setTextSize(40);
                    tiny.setChecked(false);
                }else {
                    textoAcambiar.setTextSize(20);
                }
                break;
            case R.id.checkBox3:
                if (checked) {
                    //Peque
                    textoAcambiar.setTextSize(8);
                    gigantic.setChecked(false);
                }else {
                    textoAcambiar.setTextSize(20);
                }
                break;
            case R.id.checkBox4:
                if (checked) {
                    //Red
                    textoAcambiar.setTextColor(Color.RED);
                }else {
                    textoAcambiar.setTextColor(Color.BLACK);
                }
                break;

        }


    }
}
