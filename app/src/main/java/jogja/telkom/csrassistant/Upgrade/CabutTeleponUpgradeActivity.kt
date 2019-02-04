package jogja.telkom.csrassistant.Upgrade

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

class CabutTeleponUpgradeActivity : AppCompatActivity() {
    private var mRecyclerView: RecyclerView? = null
    private var mContext: Context? = null

    private val dummyDataToPass: ArrayList<Instruksi>
        get() {
            val dataInstruksi = ArrayList<Instruksi>()
            var childDataItems: ArrayList<ChildInstruksi>
            var instruksi: Instruksi
            var childInstruksi: ChildInstruksi


            instruksi = Instruksi()
            instruksi.instruksi = "1. CEK IPAYMENT"
            childDataItems = ArrayList()
            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Cek apakah tagihan pelanggan sudah lunas melalui i-payment"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Jika belum, edukasi pelanggan untuk melunasi terlebih dahulu, jika sudah, lanjut ke langkah berikutnya"
            childDataItems.add(childInstruksi)

            instruksi = Instruksi()
            instruksi.instruksi = "2. I-SISKA dan MOHON BANTUAN PS"
            childDataItems = ArrayList()
            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Pada Type Modifikasi pilih opsi DN, masukkan nomor DN (nomor telepon pelanggan), tekan enter atau tombol panah di sebelah kolom"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-tekan tab Permintaan > Buat"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Akan muncul pop-up Pilih Operasi, ketikkan \"MC\" pada kolom yans tersedia, tekan enter tiga kali"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Akan muncul list permintaan pelanggan, pilih layanan telepon yang akan dinon-aktifkan, tekan tombol \"X\" berwarna merah"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Tekan tombool Abonemen di bawah lalu buat abonemen menjadi 0, akan muncul pop up, pada uraian pilih \"Dinas/Kebijakan Mgt\", tekan save"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Isikan K-Contact pada kolom Comment dengan format sebagai berikut:NOMOR PL;NAMA PELANGGAN;CP;NOMOR TIKET;POTS TIWY;BY XXX"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Copy K-Contact, letakkan ke Notepad"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Setelah selesai tekan tombol Save (disket), keluar (gambar pintu)"
            childDataItems.add(childInstruksi)
            instruksi.setChildInstruksis(childDataItems)
            dataInstruksi.add(instruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Klik \"Ok\" pada pop up List of Values"
            childDataItems.add(childInstruksi)
            instruksi.setChildInstruksis(childDataItems)
            dataInstruksi.add(instruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Pada Info layanan akan terlihat bahwah Permintaan Berlangsung terperbarui"
            childDataItems.add(childInstruksi)
            instruksi.setChildInstruksis(childDataItems)
            dataInstruksi.add(instruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Pada Tab permintaan pergi ke opsi Daftar, Copy NDEM dari permintaan cabut mohon bantuan ke grup Permintaan Selain Cabut agar permintaan segera di-PS"
            childDataItems.add(childInstruksi)
            instruksi.setChildInstruksis(childDataItems)
            dataInstruksi.add(instruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Sertakan NDEM, Nomor Telepon yang ingin dicabut, nama pelanggan, dan K-Contact yang sudah disimpan sebelumnya"
            childDataItems.add(childInstruksi)
            instruksi.setChildInstruksis(childDataItems)
            dataInstruksi.add(instruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Contoh: \"Moban PS POTS TIWY, NDEM:XXXXXX, Nomor:XXXXXX, Bapak/ibu XXXX, /K-Contact/"
            childDataItems.add(childInstruksi)
            instruksi.setChildInstruksis(childDataItems)
            dataInstruksi.add(instruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-infokan kepada juga kepada grup Sentral untuk memblokir agar nomor tersebut tidak bisa menerima/melakukan panggilan"
            childDataItems.add(childInstruksi)
            instruksi.setChildInstruksis(childDataItems)
            dataInstruksi.add(instruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "-Contoh: \"Moban block incoming dan outgoing /nomor pelanggan/, terimakasih"
            childDataItems.add(childInstruksi)
            instruksi.setChildInstruksis(childDataItems)
            dataInstruksi.add(instruksi)



            return dataInstruksi
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_recview)
        mContext = this@CabutTeleponUpgradeActivity
        mRecyclerView = findViewById(R.id.layout_recview)
        val recyclerDataAdapter = RecAdapter(dummyDataToPass)
        mRecyclerView!!.layoutManager = LinearLayoutManager(mContext)
        mRecyclerView!!.adapter = recyclerDataAdapter
        mRecyclerView!!.setHasFixedSize(true)
    }
}