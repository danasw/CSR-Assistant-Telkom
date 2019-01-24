package jogja.telkom.csrassistant.Adapter;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import jogja.telkom.csrassistant.R;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.MyViewHolder> {
    private ArrayList<Instruksi> instruksis;

    public RecAdapter(ArrayList<Instruksi> instruksis) {
        this.instruksis = instruksis;
    }

    @Override
    public RecAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecAdapter.MyViewHolder holder, int position) {
        Instruksi instruksi= instruksis.get(position);
        holder.textView_instruksi.setText(instruksi.getInstruksi());
        //
        int noOfChildTextViews = holder.linearLayout_isiInstruksi.getChildCount();
        int noOfChild = instruksi.getChildDataItems().size();
        if (noOfChild < noOfChildTextViews) {
            for (int index = noOfChild; index < noOfChildTextViews; index++) {
                TextView currentTextView = (TextView) holder.linearLayout_isiInstruksi.getChildAt(index);
                currentTextView.setVisibility(View.GONE);
            }
        }
        for (int textViewIndex = 0; textViewIndex < noOfChild; textViewIndex++) {
            TextView currentTextView = (TextView) holder.linearLayout_isiInstruksi.getChildAt(textViewIndex);
            currentTextView.setText(instruksi.getChildDataItems().get(textViewIndex).getIsiInstruksi());
        }
    }

    @Override
    public int getItemCount() {
        return instruksis.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private Context context;
        private TextView textView_instruksi;
        private LinearLayout linearLayout_isiInstruksi;

        MyViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            textView_instruksi = itemView.findViewById(R.id.item_instruksi);
            linearLayout_isiInstruksi = itemView.findViewById(R.id.sub_item_isi);
            linearLayout_isiInstruksi.setVisibility(View.GONE);
            int intMaxNoOfChild = 0;
            for (int index = 0; index < instruksis.size(); index++) {
                int intMaxSizeTemp = instruksis.get(index).getChildDataItems().size();
                if (intMaxSizeTemp > intMaxNoOfChild) intMaxNoOfChild = intMaxSizeTemp;
            }
            //SET TEXT FORMAT UNTUK ISI
            for (int indexView = 0; indexView < intMaxNoOfChild; indexView++) {
                TextView textView = new TextView(context);
                textView.setId(indexView);
                textView.setPadding(16, 20, 0, 20);
                textView.setGravity(Gravity.LEFT);
                textView.setBackground(ContextCompat.getDrawable(context, R.drawable.background_sub_module_text));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                textView.setOnClickListener(this);
                linearLayout_isiInstruksi.addView(textView, layoutParams);
            }
            textView_instruksi.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.item_instruksi) {
                if (linearLayout_isiInstruksi.getVisibility() == View.VISIBLE) {
                    linearLayout_isiInstruksi.setVisibility(View.GONE);
                } else {
                    linearLayout_isiInstruksi.setVisibility(View.VISIBLE);
                }
            } else {
                TextView textViewClicked = (TextView) view;
                Toast.makeText(context, "" + textViewClicked.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        }
    }
}
