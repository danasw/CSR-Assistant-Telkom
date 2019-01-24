package jogja.telkom.csrassistant.Tagihan

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import jogja.telkom.csrassistant.Adapter.ChildInstruksi
import jogja.telkom.csrassistant.Adapter.Instruksi
import jogja.telkom.csrassistant.Adapter.RecAdapter
import jogja.telkom.csrassistant.R
import java.util.*

class TetapDitagihTagihanActivity : AppCompatActivity() {
    private var mRecyclerView: RecyclerView? = null
    private var mContext: Context? = null

    private val dummyDataToPass: ArrayList<Instruksi>
        get() {
            val dataInstruksi = ArrayList<Instruksi>()
            val childDataItems: ArrayList<ChildInstruksi>
            val instruksi: Instruksi
            var childInstruksi: ChildInstruksi
            instruksi = Instruksi()
            instruksi.instruksi = "3. BUKA NOSSA"
            childDataItems = ArrayList()
            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Buka Nossa dan Lihat Halaman Tiket Pelanggan"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Pergi ke Work Logs > Isi Summary dan Details "
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Contoh Summary: Sudah Proses TAMBAH Add On XXXX dengan SC XXXXXXXX,\n" + " Details boleh diisi sama dengan Summary apabila tidak ada informasi tambahan "
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Save dengan menekan Icon Disket di bagian atas"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Pergi ke Tab Actual Resolution"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Pada Actual Solution, tekan icon kaca pembesar, pada Decription ketik \\\"LAYANAN\\\",\n" + " tekan Enter, Pilih SOLUTION_IPTC,IPTV - PAKET LAYANAN"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Pada Resolution isikan seperti pada Summary sebelumnya"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Save dengan menekan Icon Disket di bagian atas "
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Take Ownership dengan menekan icon tangan memegang kertas"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Tekan icon Route Workflow (sebelah kiri icon Take Ownership)"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Pilih Resolve Incident"
            childDataItems.add(childInstruksi)
            instruksi.setChildInstruksis(childDataItems)
            dataInstruksi.add(instruksi)
            return dataInstruksi
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tagihan_masih_ditagih)
        mContext = this@TetapDitagihTagihanActivity
        mRecyclerView = findViewById(R.id.recview_ditagih)
        val recyclerDataAdapter = RecAdapter(dummyDataToPass)
        mRecyclerView!!.layoutManager = LinearLayoutManager(mContext)
        mRecyclerView!!.adapter = recyclerDataAdapter
        mRecyclerView!!.setHasFixedSize(true)
    }
}
