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

class TidakSesuaiTagihanActivity : AppCompatActivity() {
    private var mRecyclerView: RecyclerView? = null
    private var mContext: Context? = null

    private val dummyDataToPass: ArrayList<Instruksi>
        get() {
            val dataInstruksi = ArrayList<Instruksi>()
            var childDataItems: ArrayList<ChildInstruksi>
            var instruksi: Instruksi
            var childInstruksi: ChildInstruksi

            instruksi = Instruksi()
            instruksi.instruksi = "CEK SISKA TOOL"
            childDataItems = ArrayList()
            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "Periksa Nomor Jastel pelanggan"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "Periksa apakah ada paket yang ditambahkan yang sekiranya membuat tagihan pelanggan bertambah, biasanya Add On, pertambahan kecepatan, atau fitur lain"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "Apabila kesalahan tagihan akibat ketidaktahuan pelanggan terhadap pajak, langsung edukasi pelanggan dan tutup laporan"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "Edukasi pelanggan (melalui telepon, WA, atau SMS) tentang hal yang membuat tagihan bertambah, dan tanyakan apakah masih berkenan untuk dicabut"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "Bila berkenan cabut layanan sesuai prosedur, bila tidak tutup laporan"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "Lakukan koreksi agar bulan berikutnya pelanggan tidak ditagih lagi"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "Informasikan kembali jika proses penjabutan sudah selesai (melalui WA atau SMS)"
            childDataItems.add(childInstruksi)

            childDataItems.add(childInstruksi)
            instruksi.setChildInstruksis(childDataItems)
            dataInstruksi.add(instruksi)

            instruksi = Instruksi()
            instruksi.instruksi = "TUTUP LAPORAN"
            childDataItems = ArrayList()
            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "Kembali ke Nossa, isi Log bahwa fitur/paket yang tidak diinginkan sudah dicabut dan pelanggan sudah diedukasi"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "Pada Actual Resolution search 'Tagihan' dan pilih sesuai dengan fitur yang dicabut (Internet atau IPTV)"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "Tekan tombol Take Ownership, lalu tekna tombol Route Workflow, pilih Resolve Incident"
            childDataItems.add(childInstruksi)

            childDataItems.add(childInstruksi)
            instruksi.setChildInstruksis(childDataItems)
            dataInstruksi.add(instruksi)
            return dataInstruksi
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_recview)
        mContext = this@TidakSesuaiTagihanActivity
        mRecyclerView = findViewById(R.id.layout_recview)
        val recyclerDataAdapter = RecAdapter(dummyDataToPass)
        mRecyclerView!!.layoutManager = LinearLayoutManager(mContext)
        mRecyclerView!!.adapter = recyclerDataAdapter
        mRecyclerView!!.setHasFixedSize(true)
    }
}
