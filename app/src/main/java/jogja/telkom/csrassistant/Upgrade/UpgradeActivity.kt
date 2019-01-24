package jogja.telkom.csrassistant.Upgrade

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import jogja.telkom.csrassistant.R

class UpgradeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upgrade)

        val sama = findViewById<Button>(R.id.satu_paket)
        val beda = findViewById<Button>(R.id.beda_paket)

        sama.setOnClickListener { v -> startActivity(Intent(this@UpgradeActivity, SatuPaketUpgradeActivity::class.java)) }

        beda.setOnClickListener { v -> startActivity(Intent(this@UpgradeActivity, BedaPaketUpgradeActivity::class.java)) }
    }
}
