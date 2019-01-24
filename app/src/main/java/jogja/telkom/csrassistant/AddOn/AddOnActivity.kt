package jogja.telkom.csrassistant.AddOn

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import jogja.telkom.csrassistant.R

class AddOnActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addon)

        val tambah = findViewById<Button>(R.id.tambah_addon)
        val cabut = findViewById<Button>(R.id.cabut_addon)

        tambah.setOnClickListener { v -> startActivity(Intent(this@AddOnActivity, TambahAddOnActivity::class.java)) }

        cabut.setOnClickListener { v -> startActivity(Intent(this@AddOnActivity, CabutAddOnActivity::class.java)) }

    }

}
