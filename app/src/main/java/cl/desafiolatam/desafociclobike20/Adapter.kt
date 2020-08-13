package cl.desafiolatam.desafociclobike20

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//Creacion ViewHolder

class CyclobikeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val tvCiclovia: TextView
    val tvComuna: TextView

    init {
        tvCiclovia = itemView.findViewById(R.id.tvCiclovia)
        tvComuna = itemView.findViewById(R.id.tvComuna)
    }

}
//Creacion Adapter con Viewholder

class CycloAdapter(val lista: List<Ciclovia>) : RecyclerView.Adapter<CyclobikeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CyclobikeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CyclobikeViewHolder(itemView = view)


    }

    //
    override fun getItemCount(): Int {
        return lista.size
    }

    // Implementar OnBindViewHolder
    override fun onBindViewHolder(holder: CyclobikeViewHolder, position: Int) {
        val ciclovia: Ciclovia = lista[position]

        holder.tvComuna.text = ciclovia.comuna
        holder.tvCiclovia.text = ciclovia.nombre


    }
}