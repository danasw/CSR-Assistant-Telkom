package jogja.telkom.csrassistant.Adapter

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import jogja.telkom.csrassistant.R
import java.util.*

class RecAdapter(private val instruksis: ArrayList<Instruksi>) : RecyclerView.Adapter<RecAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecAdapter.MyViewHolder, position: Int) {
        val instruksi = instruksis[position]
        holder.textView_instruksi.text = instruksi.instruksi
        //
        val noOfChildTextViews = holder.linearLayout_isiInstruksi.childCount
        val noOfChild = instruksi.childDataItems!!.size
        if (noOfChild < noOfChildTextViews) {
            for (index in noOfChild until noOfChildTextViews) {
                val currentTextView = holder.linearLayout_isiInstruksi.getChildAt(index) as TextView
                currentTextView.visibility = View.GONE
            }
        }
        for (textViewIndex in 0 until noOfChild) {
            val currentTextView = holder.linearLayout_isiInstruksi.getChildAt(textViewIndex) as TextView
            currentTextView.text = instruksi.childDataItems!![textViewIndex].isiInstruksi
        }
    }

    override fun getItemCount(): Int {
        return instruksis.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        private val context: Context
        val textView_instruksi: TextView
        val linearLayout_isiInstruksi: LinearLayout

        init {
            context = itemView.context
            textView_instruksi = itemView.findViewById(R.id.item_instruksi)
            linearLayout_isiInstruksi = itemView.findViewById(R.id.sub_item_isi)
            linearLayout_isiInstruksi.visibility = View.GONE
            var intMaxNoOfChild = 0
            for (index in instruksis.indices) {
                val intMaxSizeTemp = instruksis[index].childDataItems!!.size
                if (intMaxSizeTemp > intMaxNoOfChild) intMaxNoOfChild = intMaxSizeTemp
            }

            //SET TEXT FORMAT UNTUK ISI
            for (indexView in 0 until intMaxNoOfChild) {
                val textView = TextView(context)
                textView.id = indexView
                textView.setPadding(16, 20, 16, 20)
                textView.gravity = Gravity.LEFT
                textView.textSize = 18F
                textView.setTextColor(Color.BLACK)
                textView.typeface = Typeface.createFromAsset(context.assets, "res/font/roboto_regular.ttf")
                textView.background = ContextCompat.getDrawable(context, R.drawable.background_sub_module_text)
                val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
                textView.setOnClickListener(this)
                linearLayout_isiInstruksi.addView(textView, layoutParams)
            }
            textView_instruksi.setOnClickListener(this)
        }

        override fun onClick(view: View) {
            if (view.id == R.id.item_instruksi) {
                if (linearLayout_isiInstruksi.visibility == View.VISIBLE) {
                    linearLayout_isiInstruksi.visibility = View.GONE
                } else {
                    linearLayout_isiInstruksi.visibility = View.VISIBLE
                }
            } else {
                val textViewClicked = view as TextView
                Toast.makeText(context, "" + textViewClicked.text.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}
