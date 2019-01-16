package jogja.telkom.csrassistant.Upgrade;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import jogja.telkom.csrassistant.R;

public class UpgradeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrade);

        Button sama = findViewById(R.id.satu_paket);
        Button beda = findViewById(R.id.beda_paket);

        sama.setOnClickListener(v ->
                startActivity(new Intent(UpgradeActivity.this, SatuPaketUpgradeActivity.class)));

        beda.setOnClickListener(v ->
                startActivity(new Intent(UpgradeActivity.this, BedaPaketUpgradeActivity.class)));
    }
}
