package app.example.voiceorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class showstores extends AppCompatActivity {
    private Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showstores);

        button1=(Button) findViewById(R.id.btgrow);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengrow();
            }
        });

        button2=(Button)findViewById(R.id.btlucky);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlucky();
            }
        });

        button3=(Button)findViewById(R.id.btevergreen);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openever();
            }
        });
    }

    public void openever() {
        Intent intent3 = new Intent(this,evergreen.class);
        startActivity(intent3);
    }

    public void openlucky() {
        Intent intent3 = new Intent(this,Luckystore.class);
        startActivity(intent3);
    }

    public void opengrow() {
        Intent intent2 = new Intent(this,growmart.class);
        startActivity(intent2);
    }
}
