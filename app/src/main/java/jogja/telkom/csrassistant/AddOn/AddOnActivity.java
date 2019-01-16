package jogja.telkom.csrassistant.AddOn;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import jogja.telkom.csrassistant.R;

public class AddOnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addon);

        Button tambah = findViewById(R.id.tambah_addon);
        Button cabut = findViewById(R.id.cabut_addon);

        tambah.setOnClickListener(v ->
                startActivity(new Intent(AddOnActivity.this,TambahAddOnActivity.class)));

        cabut.setOnClickListener(v ->
                startActivity(new Intent(AddOnActivity.this,CabutAddOnActivity.class)));

    }

}
