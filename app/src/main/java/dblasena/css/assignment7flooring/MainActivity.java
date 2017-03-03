package dblasena.css.assignment7flooring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final int CIS3334_REQUEST_CODE = 1001;

    EditText txtWidth, txtLength;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtWidth = (EditText) findViewById(R.id.txtWidth);
        txtLength = (EditText) findViewById(R.id.txtLength);



        Button button = (Button) findViewById(R.id.btnResult);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String width = txtWidth.getText().toString();
                String length = txtLength.getText().toString() ;
                Intent secActIntent = new Intent(MainActivity.this, MainActivity2.class);
                secActIntent.putExtra("Width", width);
                secActIntent.putExtra("Length", length);
                startActivity(secActIntent);
            }
        });
    }




}
