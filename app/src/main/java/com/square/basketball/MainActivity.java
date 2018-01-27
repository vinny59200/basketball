package com.square.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t,count;Button missed;Button done;
    double missedScore=0;
    double doneScore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t= (TextView) findViewById(R.id.score);count = (TextView) findViewById(R.id.count);

        missed = (Button) findViewById(R.id.missed);
        missed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                missedScore=missedScore+1;
                scorify();
            }
        });
        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doneScore=doneScore+1;
                scorify();
            }
        });
    }

    private void scorify() {
        double sum=(missedScore+doneScore);
        double tot=doneScore/sum*100;
        t.setText(""+(new Double(tot)).intValue());
        count.setText(""+(new Double(sum)).intValue());
        System.out.println("missed:"+missedScore+"done:"+doneScore+"sum"+sum+"score"+tot);

    }
}
