package jogja.telkom.csrassistant.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import jogja.telkom.csrassistant.R;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.RecViewHolder> {

    private List<Instruksi> list;

    public RecAdapter(List<Instruksi> list){
        this.list = list;
    }

    @NonNull
    @Override
    public RecViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);

        return new RecViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewHolder holder, int position) {
        Instruksi instruksi = list.get(position);
        holder.bind(instruksi);
        holder.itemView.setOnClickListener(v -> {
            boolean expanded = instruksi.isExpanded();
            instruksi.setExpanded(!expanded);
            notifyItemChanged(position);
        });
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    public class RecViewHolder extends RecyclerView.ViewHolder {

        private TextView langkah;
        private TextView isi;
        private View subItem;

        public RecViewHolder(@NonNull View itemView) {
            super(itemView);

            langkah   = itemView.findViewById(R.id.item_instruksi);
            isi         = itemView.findViewById(R.id.sub_item_isi);
            subItem     = itemView.findViewById(R.id.sub_item);
        }

        public void bind(Instruksi instruksi) {
            boolean expanded = instruksi.isExpanded();

            subItem.setVisibility(expanded ? View.VISIBLE : View.GONE);

            langkah.setText(instruksi.getLangkah());
            isi.setText(instruksi.getIsi());
        }
    }
}
