package jogja.telkom.csrassistant.AddOn

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

class TambahAddOnActivity : AppCompatActivity() {
    private var mRecyclerView: RecyclerView? = null
    private var mContext: Context? = null

    private val dummyDataToPass: ArrayList<Instruksi>
        get() {
            val dataInstruksi = ArrayList<Instruksi>()
            var childDataItems: ArrayList<ChildInstruksi>
            var instruksi: Instruksi
            var childInstruksi: ChildInstruksi
            instruksi = Instruksi()
            instruksi.instruksi = "1. BUKA STARCLICK"
            childDataItems = ArrayList()
            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Buka Starclick pada https://starclick.telkom.co.id/noss_prod/"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Tools > Transaction > Masukkan Nomer Pelanggan (Internet/Telepon)"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Lalu Pilih Lakukan Pencarian Hingga Muncul Daftar Layanan yang Dimiliki Pelanggan"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Check Lokasi > Next Step"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Pilih Operation > Modification > Next Step"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Pilih Product > IPTV > USEE_HD > Centang > Check Feasibility. Jika Sukses > Next Step"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Muncul Halaman Modif. Layanan > Isi Kolom-Kolom Berbintang Merah > Isi K-contact"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Format K-Contact: PL85962(KODE PL);NAMA PELANGGAN;CP;NO TIKET (Dari Nossa);ORDER;BY (NAMA PENGINPUT) *Semua Huruf Besar"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Contoh: PL85962;PAK XXX;0812XXXXXXXX;INXXXXXXXX;TAMBAH ADD ON XXXX;BY XXX"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- NEXT"
            childDataItems.add(childInstruksi)
            instruksi.setChildInstruksis(childDataItems)
            dataInstruksi.add(instruksi)
            instruksi = Instruksi()
            instruksi.instruksi = "2. PILIH PAKET"
            childDataItems = ArrayList()
            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Pilih Paket UseeTV, Perangkat IPTV, dan Tagihan yang sesuai "
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Pada Add Ons, pilih salah satu Add Ons yang berhubungan dengan UseeTV sesuai keinginan pelanggan (USEETV ADD ON INDIHOME, ADD ON MINIPACK USEETV KHUSUS APARTEMENT, dll), \n" + "Pilih Add On yang tertera disebelahnya, sesuai dengan keinginan pelanggan > Tekan Add "
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Tekan Appointment > Tekan Search "
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Pada Type Appointment pilih CALL BY PHONE"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Pada Description ketikkan \\\"SUDAH PROSES\\\""
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Pada Date Appointment, pilih tanggal paling atas "
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Submit > Appointment berhasil dibuat"
            childDataItems.add(childInstruksi)

            childInstruksi = ChildInstruksi()
            childInstruksi.isiInstruksi = "- Submit > Order berhasil dibuat, output berupa Nomor SC, Copy Nomor SC "
            childDataItems.add(childInstruksi)
            instruksi.setChildInstruksis(childDataItems)
            dataInstruksi.add(instruksi)
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
        setContentView(R.layout.activity_addon_tambah)
        mContext = this@TambahAddOnActivity
        mRecyclerView = findViewById(R.id.recview_tambah)
        val recyclerDataAdapter = RecAdapter(dummyDataToPass)
        mRecyclerView!!.layoutManager = LinearLayoutManager(mContext)
        mRecyclerView!!.adapter = recyclerDataAdapter
        mRecyclerView!!.setHasFixedSize(true)
    }
}
