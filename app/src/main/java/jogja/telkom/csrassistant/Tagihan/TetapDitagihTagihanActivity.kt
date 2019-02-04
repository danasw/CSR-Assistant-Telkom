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
            var childDataItems: ArrayList<ChildInstruksi>
            var instruksi: Instruksi
            var childInstruksi: ChildInstruksi

            instruksi = Instruksi()
            instruksi.instruksi = "PERIKSA KETERANGAN TICKET"
            childDataItems = ArrayList()
            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Periksa apakah pelanggan sudah benar benar melakukan pencabutan melalui Data Churn pada Google Sheets, search nomor pelanggan"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Jika ditemukan, artinya pelanggan benar sudah melakukan pencabutan. Periksa apakah pelanggan sudah mengembalikan perangkat dan melunasi tegihan berjalan (apabila belum, edukasi pelanggan untuk melunasi atau mengembalikan alat)"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Tagihan berjalan ada apabila ada penggunaan layanan sebelum pencabutan"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Setelah data sesuai, lakukan koreksi tagihan agar pelanggan tidka lagi ditagih"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Lakukan koreksi agar bulan berikutnya pelanggan tidak ditagih lagi"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Informasikan kembali jika proses pengkoreksian sudah selesai (melalui WA atau SMS)"
            childDataItems.add(childInstruksi)

            childDataItems.add(childInstruksi)
            instruksi.setChildInstruksis(childDataItems)
            dataInstruksi.add(instruksi)

            instruksi = Instruksi()
            instruksi.instruksi = "TUTUP LAPORAN"
            childDataItems = ArrayList()
            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Kembali ke Nossa, isi Log bahwa bahwa tagihan sudah dikoreksi"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Pada Actual Resolution search 'Tagihan' dan pilih Internet atau IPTV"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Tekan tombol Take Ownership, lalu tekna tombol Route Workflow, pilih Resolve Incident"
            childDataItems.add(childInstruksi)

            childDataItems.add(childInstruksi)
            instruksi.setChildInstruksis(childDataItems)
            dataInstruksi.add(instruksi)
            return dataInstruksi
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_recview)
        mContext = this@TetapDitagihTagihanActivity
        mRecyclerView = findViewById(R.id.layout_recview)
        val recyclerDataAdapter = RecAdapter(dummyDataToPass)
        mRecyclerView!!.layoutManager = LinearLayoutManager(mContext)
        mRecyclerView!!.adapter = recyclerDataAdapter
        mRecyclerView!!.setHasFixedSize(true)
    }
}
