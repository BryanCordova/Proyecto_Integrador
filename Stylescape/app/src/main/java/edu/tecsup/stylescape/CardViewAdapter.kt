package edu.tecsup.stylescape

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CardViewAdapter : RecyclerView.Adapter<CardViewAdapter.ViewHolder>() {

    // Aquí debes definir la lista de elementos que deseas mostrar en el RecyclerView

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Aquí debes actualizar los elementos de la vista con los datos de cada elemento de la lista
    }

    override fun getItemCount(): Int {
        // Aquí debes devolver la cantidad de elementos en la lista
        return 0
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Aquí debes declarar los elementos de la vista dentro del elemento CardView

        init {
            // Aquí debes realizar la asignación de las vistas dentro del elemento CardView
        }
    }
}
