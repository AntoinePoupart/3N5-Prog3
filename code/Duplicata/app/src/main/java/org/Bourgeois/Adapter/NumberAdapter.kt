import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumberAdapter(private val numberList: List<NumberItem>) :
    RecyclerView.Adapter<NumberAdapter.NumberViewHolder>() {

    class NumberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val doubleButton: Button = itemView.findViewById(R.id.buttonDouble)
        val numberText: TextView = itemView.findViewById(R.id.textNumber)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_number, parent, false)
        return NumberViewHolder(view)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        val currentItem = numberList[position]
        holder.numberText.text = currentItem.value.toString()

        // Action du bouton pour doubler la valeur
        holder.doubleButton.setOnClickListener {
            currentItem.value *= 2
            notifyItemChanged(position) // Mettre à jour l'élément modifié
        }
    }

    override fun getItemCount() = numberList.size
}