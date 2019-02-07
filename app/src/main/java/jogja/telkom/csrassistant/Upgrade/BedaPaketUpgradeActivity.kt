package jogja.telkom.csrassistant.Upgrade

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import jogja.telkom.csrassistant.R

class BedaPaketUpgradeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upgrade_beda_paket)

        val tigaDua = findViewById<Button>(R.id.tiga_dua)
        val tigaSatu = findViewById<Button>(R.id.tiga_satu)
        val duaSatu = findViewById<Button>(R.id.dua_satu)

        tigaDua.setOnClickListener { v -> startActivity(Intent(this@BedaPaketUpgradeActivity, TigaDuaActivity::class.java)) }
        tigaSatu.setOnClickListener { v -> startActivity(Intent(this@BedaPaketUpgradeActivity, TigaSatuActivity::class.java)) }
        duaSatu.setOnClickListener { v -> startActivity(Intent(this@BedaPaketUpgradeActivity,DuaSatuActivity::class.java)) }
    }
}
