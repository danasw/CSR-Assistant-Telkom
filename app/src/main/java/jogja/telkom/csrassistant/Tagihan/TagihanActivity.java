package jogja.telkom.csrassistant.Tagihan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import jogja.telkom.csrassistant.R;

public class TagihanActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagihan);

        Button tidakSesuai = findViewById(R.id.tidak_sesuai);
        Button tetapDitagih = findViewById(R.id.tetap_ditagih);

        tidakSesuai.setOnClickListener(v ->
                startActivity(new Intent(TagihanActivity.this, TidakSesuaiTagihanActivity.class)));

        tetapDitagih.setOnClickListener(v ->
                startActivity(new Intent(TagihanActivity.this, TetapDitagihTagihanActivity.class)));
    }
}
