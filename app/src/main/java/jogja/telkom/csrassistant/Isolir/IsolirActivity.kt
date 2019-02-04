package jogja.telkom.csrassistant.Isolir

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

class IsolirActivity : AppCompatActivity() {
    private var mRecyclerView: RecyclerView? = null
    private var mContext: Context? = null

    private val dummyDataToPass: ArrayList<Instruksi>
        get() {
            val dataInstruksi = ArrayList<Instruksi>()
            var childDataItems: ArrayList<ChildInstruksi>
            val instruksi: Instruksi
            var childInstruksi: ChildInstruksi
            instruksi = Instruksi()
            instruksi.instruksi = "CEK SISKA TOOL"
            childDataItems = ArrayList()
            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Periksa Nomor Jastel pelanggan"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Periksa apakah tagihan sdah lunas, bila sudah maka bisa dilanjutkna untuk proses Buka Isolir"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Pada Type Modifikasi pilih opsi DN, masukkan nomor DN (nomor telepon pelanggan), tekan enter atau tombol panah di sebelah kolom"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-tekan tab Permintaan > Buat"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "Akan muncul pop-up Pilih Operasi, ketikkan \"RT\" pada kolom yans tersedia, tekan enter tiga kali"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Isikan K-Contact pada kolom Comment dengan format sebagai berikut:BUKIS TAGIHAN LUNAS, tekan save"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Permintaan akan masuk dalam tab Permintaan > Daftar, salin NDEM perimintaan BUKIS"
            childDataItems.add(childInstruksi)
            instruksi.setChildInstruksis(childDataItems)
            dataInstruksi.add(instruksi)

            instruksi.instruksi = "MOHON BANTUAN PS PERMINTAAN"
            childDataItems = ArrayList()
            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Mohon bantuan ke grup Permintaan Selain Cabut agar permintaan segera di-PS"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Tunggu sampai permintaan selesai, dapat dilihat melalui ISISKA"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Apabila pada kolom 'Jml Dossier Isolir Krn Tgkn' sudah bernilai 0, berarti isolir sudah dibuka"
            childDataItems.add(childInstruksi)

            childDataItems.add(childInstruksi)
            instruksi.setChildInstruksis(childDataItems)
            dataInstruksi.add(instruksi)

            return dataInstruksi
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_recview)
        mContext = this@IsolirActivity
        mRecyclerView = findViewById(R.id.layout_recview)
        val recyclerDataAdapter = RecAdapter(dummyDataToPass)
        mRecyclerView!!.layoutManager = LinearLayoutManager(mContext)
        mRecyclerView!!.adapter = recyclerDataAdapter
        mRecyclerView!!.setHasFixedSize(true)
    }
}
