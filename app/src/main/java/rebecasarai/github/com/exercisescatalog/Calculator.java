package rebecasarai.github.com.exercisescatalog;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Calculator extends AppCompatActivity  {
    //Declaración de variables
    private int cantidad;
    @BindView(R.id.button) Button btn1;
    @BindView(R.id.button2) Button btn2;
    @BindView(R.id.button3) Button btn3;
    @BindView(R.id.button4) Button btn4;
    @BindView(R.id.button5) Button btn5;
    @BindView(R.id.button6) Button btn6;
    @BindView(R.id.button7) Button btn7;
    @BindView(R.id.button8) Button btn8;
    @BindView(R.id.button9) Button btn9;
    @BindView(R.id.sumarCalcu) Button sumar;
    @BindView(R.id.restarCalcu) Button restar;
    @BindView(R.id.multi) Button multiplicar;
    @BindView(R.id.screen) Button screen;

    @OnClick({ R.id.button, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7,
            R.id.button8,R.id.button9})
    public void showOnScreen(View view) {
        ((Button) view).getText();

        /*switch (v){
            case R.id.button:
                screen.setText(""+1);
                break;
        }*/
    }
    //@OnClick({ R.id.button, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8,
                //R.id.button9})

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        ButterKnife.bind(this);
        cantidad = 0;
    }




}
