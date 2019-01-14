package jogja.telkom.csrassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

import jogja.telkom.csrassistant.AddOn.AddOnActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView add      = (CardView) findViewById(R.id.add_on);
        CardView bill     = (CardView) findViewById(R.id.bill);
        CardView upgrade  = (CardView) findViewById(R.id.up_down);
        CardView unlock   = (CardView) findViewById(R.id.unlock);
        CardView problem  = (CardView) findViewById(R.id.problem);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddOnActivity.class));
            }
        });


        bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Tagihan Clicked",Toast.LENGTH_SHORT).show();
            }
        });


        upgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Upgrade dan Downgrade Clicked",Toast.LENGTH_SHORT).show();
            }
        });


        unlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Buka Isolir Clicked",Toast.LENGTH_SHORT).show();
            }
        });


        problem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Kendala dan Error Clicked",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
