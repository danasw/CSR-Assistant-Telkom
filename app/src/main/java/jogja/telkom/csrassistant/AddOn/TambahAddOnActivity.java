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

        instruksiList.add(new Instruksi("1. BUKA STARCLIK", "- Buka Browser \n" + "- Masukkan alamat http://starclick.blah \n" + "- OKE" ));
        instruksiList.add(new Instruksi("2. PILIH PAKET", "ISINYA ADALAH"));
        instruksiList.add(new Instruksi("2. PILIH PAKET", "ISINYA ADALAH"));
        instruksiList.add(new Instruksi("2. PILIH PAKET", "ISINYA ADALAH"));


        RecAdapter adapter = new RecAdapter(instruksiList);

        RecyclerView recyclerView = findViewById(R.id.recview_tambah);

        ((SimpleItemAnimator) Objects.requireNonNull(recyclerView.getItemAnimator())).setSupportsChangeAnimations(false);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

    }
}
