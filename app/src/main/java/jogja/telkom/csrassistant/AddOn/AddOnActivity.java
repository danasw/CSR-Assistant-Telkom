package jogja.telkom.csrassistant.AddOn;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import jogja.telkom.csrassistant.R;

public class AddOnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addon_activity);

        Button tambah = findViewById(R.id.tambah_addon);
        Button cabut = findViewById(R.id.cabut_addon);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddOnActivity.this,TambahActivity.class));
            }
        });

        cabut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddOnActivity.this,"Add On Clicked",Toast.LENGTH_LONG).show();
            }
        });

    }

}
