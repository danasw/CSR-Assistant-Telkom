package jogja.telkom.csrassistant.Tagihan;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import jogja.telkom.csrassistant.Adapter.ChildInstruksi;
import jogja.telkom.csrassistant.Adapter.Instruksi;
import jogja.telkom.csrassistant.Adapter.RecAdapter;
import jogja.telkom.csrassistant.R;

public class TidakSesuaiTagihanActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private Context mContext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagihan_tidak_sesuai);
        mContext = TidakSesuaiTagihanActivity.this;
        mRecyclerView = findViewById(R.id.recview_tak_sesuai);
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
        childInstruksi.setIsiInstruksi("- Contoh Summary: Sudah Proses TAMBAH Add On XXXX dengan SC XXXXXXXX,\n" +
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
                " tekan Enter, Pilih SOLUTION_IPTC,IPTV - PAKET LAYANAN");
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
