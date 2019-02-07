package jogja.telkom.csrassistant.Tagihan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import jogja.telkom.csrassistant.R

class TagihanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tagihan)

        val tidakSesuai = findViewById<Button>(R.id.tidak_sesuai)
        val tetapDitagih = findViewById<Button>(R.id.tetap_ditagih)

        tidakSesuai.setOnClickListener { v -> startActivity(Intent(this@TagihanActivity, TidakSesuaiTagihanActivity::class.java)) }

        tetapDitagih.setOnClickListener { v -> startActivity(Intent(this@TagihanActivity, TetapDitagihTagihanActivity::class.java)) }
    }
}
