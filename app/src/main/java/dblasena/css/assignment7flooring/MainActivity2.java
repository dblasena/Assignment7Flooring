package dblasena.css.assignment7flooring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


        TextView txtResult;

        String length;
        String width;
        String txttotal;
        double numlength;
        double numwidth;
        double total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtResult = (TextView) findViewById(R.id.txtResult);

        Bundle extras = getIntent().getExtras();
        width = extras.getString("Width");
        length = extras.getString("Length");

        numlength = Double.parseDouble(length);
        numwidth = Double.parseDouble(width);
        total = numlength * numwidth;
        txttotal = Double.toString(total);

        txtResult.setText("Width is " + width + " ,Length is " + length + " and flooring needed is " + txttotal);



    }
}
