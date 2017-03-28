package android.course.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // define Proerties:
    //in activities / Controllers the properties are the controls.
    private RadioGroup rgTemperature;
    private TextView tvResult;
    private EditText etTemperature;
    private int temperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temp_converter);

        rgTemperature = (RadioGroup) findViewById(R.id.rgTemperature);
        tvResult = (TextView) findViewById(R.id.tvResult);
        etTemperature = (EditText) findViewById(R.id.etTemperature);



    }





    public void calculate(View view) {
        try {
            int checkedID = rgTemperature.getCheckedRadioButtonId();
            double result = 0;
            double temp = Double.valueOf(etTemperature.getText().toString());
            if (checkedID == R.id.radioCelsius){
                result = (temp - 32) * 5.0/9;

            }
            else {
                result = temp * 9.0/5 + 32;

            }
            tvResult.setText(String.valueOf(result));
        } catch (NumberFormatException e) {

        }
    }
}
