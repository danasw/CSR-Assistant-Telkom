package jogja.telkom.csrassistant.AddOn;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import jogja.telkom.csrassistant.Adapter.ChildInstruksi;
import jogja.telkom.csrassistant.Adapter.Instruksi;
import jogja.telkom.csrassistant.Adapter.RecAdapter;
import jogja.telkom.csrassistant.R;

public class CabutAddOnActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addon_cabut);
        mContext = CabutAddOnActivity.this;
        mRecyclerView = findViewById(R.id.recview_cabut);
        RecAdapter recyclerDataAdapter = new RecAdapter (getDummyDataToPass());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerView.setAdapter(recyclerDataAdapter);
        mRecyclerView.setHasFixedSize(true);
    }

    private ArrayList<Instruksi> getDummyDataToPass() {
        ArrayList<Instruksi> dataInstruksi = new ArrayList<>();
        ArrayList<ChildInstruksi> childDataItems;
        Instruksi instruksi;
        ChildInstruksi childInstruksi;

        /*UNTUK HEAD INSTRUKSI*/
        instruksi = new Instruksi();
        instruksi.setInstruksi("1. BUKA STARCLICK");
        childDataItems = new ArrayList<>();

        /*UNTUK ISI*/
        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Buka Starclick pada https://starclick.telkom.co.id/noss_prod/");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Tools > Transaction > Masukkan Nomer Pelanggan (Internet/Telepon)");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Lalu Pilih Lakukan Pencarian Hingga Muncul Daftar Layanan yang Dimiliki Pelanggan");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Check Lokasi > Next Step");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Pilih Operation > Modification > Next Step");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Pilih Product > IPTV > USEE_HD > Centang > Check Feasibility. Jika Sukses > Next Step");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Muncul Halaman Modif. Layanan > Isi Kolom-Kolom Berbintang Merah > Isi K-contact");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Format K-Contact: PL85962(KODE PL);NAMA PELANGGAN;CP;NO TIKET (Dari Nossa);ORDER;BY (NAMA PENGINPUT) *Semua Huruf Besar");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Contoh: PL85962;PAK XXX;0812XXXXXXXX;INXXXXXXXX;CABUT ADD ON XXXX;BY XXX");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- NEXT");
        childDataItems.add(childInstruksi);

        /*UNTUK MENAMBAHKAN PADA LIST*/
        instruksi.setChildInstruksis(childDataItems);
        dataInstruksi.add(instruksi);
        /*--------------SELESAI----------------------*/

        /*UNTUK HEAD INSTRUKSI*/
        instruksi = new Instruksi();
        instruksi.setInstruksi("2. PILIH ADD ON");
        childDataItems = new ArrayList<>();

        /*UNTUK ISI*/
        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Pada Data Pelanggan Pilih Add On yang ingin dilepas");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Pada Add Ons, pilih salah satu Add Ons yang berhubungan dengan UseeTV sesuai keinginan pelanggan \n " +
                "(USEETV ADD ON INDIHOME, ADD ON MINIPACK USEETV KHUSUS APARTEMENT, dll),\n" +
                " Pilih Add On yang tertera disebelahnya, sesuai dengan keinginan pelanggan");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Tekan Appointment > Tekan Search");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Pada Type Appointment pilih CALL BY PHONE");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Pada Description ketikkan \\\"SUDAH PROSES\\\"");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Pada Date Appointment, pilih tanggal paling atas ");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Submit > Appointment berhasil dibuat");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Submit > Order berhasil dibuat, output berupa Nomor SC, Copy Nomor SC ");
        childDataItems.add(childInstruksi);

        /*UNTUK MENAMBAHKAN PADA LIST*/
        instruksi.setChildInstruksis(childDataItems);
        dataInstruksi.add(instruksi);
        /*--------------SELESAI----------------------*/

        /*UNTUK HEAD INSTRUKSI*/
        instruksi = new Instruksi();
        instruksi.setInstruksi("3. BUKA NOSSA");
        childDataItems = new ArrayList<>();

        /*UNTUK ISI*/
        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Buka Nossa dan Lihat Halaman Tiket Pelanggan");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Pergi ke Work Logs > Isi Summary dan Details ");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Contoh Summary: Sudah Proses Cabut Add On XXXX dengan SC XXXXXXXX,\n" +
                " Details boleh diisi sama dengan Summary apabila tidak ada informasi tambahan ");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Save dengan menekan Icon Disket di bagian atas");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Pergi ke Tab Actual Resolution");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Pada Actual Solution, tekan icon kaca pembesar, pada Decription ketik \\\"LAYANAN\\\",\n" +
                " tekan Enter, Pilih SOLUTION_IPTV,IPTV - PAKET LAYANAN,PENCABUTAN LAYANAN - PAKET LAYANAN");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Pada Resolution isikan seperti pada Summary sebelumnya");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Save dengan menekan Icon Disket di bagian atas ");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Take Ownership dengan menekan icon tangan memegang kertas");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Tekan icon Route Workflow (sebelah kiri icon Take Ownership)");
        childDataItems.add(childInstruksi);

        childInstruksi = new ChildInstruksi();
        childInstruksi.setIsiInstruksi("- Pilih Resolve Incident");
        childDataItems.add(childInstruksi);

        /*UNTUK MENAMBAHKAN PADA LIST*/
        instruksi.setChildInstruksis(childDataItems);
        dataInstruksi.add(instruksi);
        /*--------------SELESAI----------------------*/

        /*-----------------*/
        return dataInstruksi;
    }
}
