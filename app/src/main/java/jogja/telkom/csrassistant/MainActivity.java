package jogja.telkom.csrassistant;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import jogja.telkom.csrassistant.AddOn.AddOnActivity;
import jogja.telkom.csrassistant.Isolir.IsolirActivity;
import jogja.telkom.csrassistant.Kendala.KendalaActivity;
import jogja.telkom.csrassistant.Tagihan.TagihanActivity;
import jogja.telkom.csrassistant.Upgrade.UpgradeActivity;

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
            startActivity(new Intent(MainActivity.this, TagihanActivity.class));
        });


        upgrade.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, UpgradeActivity.class));
        });


        unlock.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, IsolirActivity.class));
        });


        problem.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, KendalaActivity.class));
        });

    }
}
