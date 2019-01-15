package jogja.telkom.csrassistant;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import jogja.telkom.csrassistant.AddOn.AddOnActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView add      = findViewById(R.id.add_on);
        CardView bill     = findViewById(R.id.bill);
        CardView upgrade  = findViewById(R.id.up_down);
        CardView unlock   = findViewById(R.id.unlock);
        CardView problem  = findViewById(R.id.problem);

        add.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AddOnActivity.class));
        });


        bill.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Tagihan Clicked", Toast.LENGTH_SHORT).show();
        });


        upgrade.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Upgrade dan Downgrade Clicked", Toast.LENGTH_SHORT).show();
        });


        unlock.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Buka Isolir Clicked", Toast.LENGTH_SHORT).show();
        });


        problem.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Kendala dan Error Clicked", Toast.LENGTH_SHORT).show();
        });

    }
}
