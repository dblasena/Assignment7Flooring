package dblasena.css.assignment7flooring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int CIS3334_REQUEST_CODE = 1001;

    EditText txtWidth, txtLength;
    TextView txtTViewResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtWidth = (EditText) findViewById(R.id.txtWidth);
        txtLength = (EditText) findViewById(R.id.txtLength);

        txtTViewResult = (TextView) findViewById(R.id.textViewResult);


        Button button = (Button) findViewById(R.id.btnResult);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String width = txtWidth.getText().toString();
                String length = txtLength.getText().toString();
                Intent secondActiv = new Intent(MainActivity.this, MainActivity2.class);
                secondActiv.putExtra("Width", width);
                secondActiv.putExtra("Length", length);
                startActivityForResult(secondActiv, CIS3334_REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       if (resultCode == RESULT_OK && requestCode == CIS3334_REQUEST_CODE) {
            if (data.hasExtra("PrevTotal")) {
               String result = data.getExtras().getString("PrevTotal");
                if (result != null && result.length() > 0) {
                    txtTViewResult.setText("Previous Total = " + result);
                    txtWidth.setText("");
                    txtLength.setText("");
                    Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
                }
            }
       }


    }
}
