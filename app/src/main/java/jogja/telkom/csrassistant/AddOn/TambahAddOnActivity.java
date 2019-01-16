package jogja.telkom.csrassistant.AddOn;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import jogja.telkom.csrassistant.Adapter.Instruksi;
import jogja.telkom.csrassistant.Adapter.RecAdapter;
import jogja.telkom.csrassistant.R;

public class TambahAddOnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addon_tambah);

        List<Instruksi> instruksiList = new ArrayList<>();

        instruksiList.add(new Instruksi("1. BUKA STARCLIK", "-Buka Starclick \n\n" +
                "-Tools > Transaction > Masukkan nomor pelanggan (Inet/Telpon) dari Nossa > Lakukan Pencarian \n\n" +
                "-Akan Muncul List Layanan Pelanggan \n\n" +
                "-Cek Lokasi > Next Step \n\n" +
                "-Pilih Operation > Modification > Next Step\n\n" +
                "-Pilih Produk > IPTV > USEE_HD\n\n" +
                "-Check Feasibility > Keadaan Normal: \"Permintaan dapat kami layani\" > Next Step \n\n" +
                "-Muncul Halaman Modif. Layanan > Isi Kolom-Kolom Berbintang Merah > Isi K-contact \n\n" +
                "-Format K-Contact: PL85962(KODE PL);NAMA PELANGGAN;CP;NO TIKET (Dari Nossa);ORDER;BY (NAMA PENGINPUT) *Semua Huruf Besar \n\n" +
                "-Contoh: PL85962;PAK XXX;0812XXXXXXXX;INXXXXXXXX;TAMBAH ADD ON XXXX;BY XXX \n\n" +
                "-Next \n\n"));
        instruksiList.add(new Instruksi("2. PILIH PAKET", "-Pilih Paket UseeTV, Perangkat IPTV, dan Tagihan yang sesuai \n\n" +
                "-Pada Add Ons, pilih salah satu Add Ons yang berhubungan dengan UseeTV sesuai keinginan pelanggan (USEETV ADD ON INDIHOME, ADD ON MINIPACK USEETV KHUSUS APARTEMENT, dll), Pilih Add On yang tertera disebelahnya, sesuai dengan keinginan pelanggan \n\n" +
                "-Tekan Add \n\n" +
                "-Tekan Appointment > Tekan Search \n\n" +
                "-Pada Type Appointment pilih CALL BY PHONE \n\n" +
                "-Pada Description ketikkan \"SUDAH PROSES\" \n\n" +
                "-Pada Date Appointment, pilih tanggal paling atas \n\n" +
                "-Submit > Appointment berhasil dibuat \n\n" +
                "-Submit > Order berhasil dibuat, output berupa Nomor SC, Copy Nomor SC \n\n"));
        instruksiList.add(new Instruksi("3. KEMBALI KE NOSSA", "-Pergi ke Work Logs > Isi Summary dan Details \n\n" +
                "-Contoh Summary: Sudah Proses Tambah Add On XXXX dengan SC XXXXXXXX, Details boleh diisi sama dengan Summary apabila tidak ada informasi tambahan \n\n" +
                "-Save dengan menekan Icon Disket di bagian atas \n\n" +
                "-Pergi ke Tab Actual Resolution \n\n" +
                "-Pada Actual Solution, tekan icon kaca pembesar, pada Decription ketik \"LAYANAN\", tekan Enter, Pilih SOLUTION_IPTC,IPTV - PAKET LAYANAN \n\n" +
                "-Pada Resolution isikan seperti pada Summary sebelumnya \n\n" +
                "-Save dengan menekan Icon Disket di bagian atas \n\n" +
                "-Take Ownership dengan menekan icon tangan memegang kertas \n\n" +
                "-Tekan icon Route Workflow (sebelah kiri icon Take Ownership) \n\n" +
                "-Pilih Resolve Incident \n\n"));


        RecAdapter adapter = new RecAdapter(instruksiList);

        RecyclerView recyclerView = findViewById(R.id.recview_tambah);

        ((SimpleItemAnimator) Objects.requireNonNull(recyclerView.getItemAnimator())).setSupportsChangeAnimations(false);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

    }
}
