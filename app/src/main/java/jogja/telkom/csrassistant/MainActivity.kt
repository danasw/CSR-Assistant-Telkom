package jogja.telkom.csrassistant

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import jogja.telkom.csrassistant.AddOn.AddOnActivity
import jogja.telkom.csrassistant.Isolir.IsolirActivity
import jogja.telkom.csrassistant.Tagihan.TagihanActivity
import jogja.telkom.csrassistant.Upgrade.UpgradeActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add = findViewById<CardView>(R.id.add_on)
        val bill = findViewById<CardView>(R.id.bill)
        val upgrade = findViewById<CardView>(R.id.up_down)
        val unlock = findViewById<CardView>(R.id.unlock)

        add.setOnClickListener { v -> startActivity(Intent(this@MainActivity, AddOnActivity::class.java)) }


        bill.setOnClickListener { v -> startActivity(Intent(this@MainActivity, TagihanActivity::class.java)) }


        upgrade.setOnClickListener { v -> startActivity(Intent(this@MainActivity, UpgradeActivity::class.java)) }


        unlock.setOnClickListener { v -> startActivity(Intent(this@MainActivity, IsolirActivity::class.java)) }

    }
}
