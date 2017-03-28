package android.course.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // define Proerties:
    //in activities / Controllers the properties are the controls.

    private TextView tvResult;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvResult = (TextView) findViewById(R.id.tvResult);

        setTvResult();





//        btnSend = (Button) findViewById(R.id.btnSend); //fbc
//        etMessage = (EditText) findViewById(R.id.etMessage);
//
//
//    }
//
//    public void btnClicked(View view) {
//        String text = etMessage.getText().toString();
//        Toast.makeText(this, "Hello " + text, Toast.LENGTH_SHORT).show();
//
    }

    private void setTvResult(){
        tvResult.setText(String.valueOf(counter));
    }

    public void btnClick2(View view) {
        //btn Plus
        counter++;
        setTvResult();



    }

    public void btnClicked(View view) {
        //btn Minus
        counter--;
        setTvResult();
    }
}
