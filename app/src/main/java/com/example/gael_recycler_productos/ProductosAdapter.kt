package com.example.gael_recycler_productos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class productosAdapter(var context: Context,
                       var ListaProductos: MutableList<dtProductos>) : RecyclerView.Adapter<productosAdapter.vHolder>()
{
    inner class vHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        lateinit var txtId: TextView
        init {
            txtId=itemView.findViewById(R.id.txtId)
        }
        lateinit var txtDescripcion: TextView
        init {
            txtDescripcion=itemView.findViewById(R.id.txtDescripcion)
        }
        lateinit var txtPrecioMenudeo: TextView
        init {
            txtPrecioMenudeo=itemView.findViewById(R.id.txtPrecioMenudeo)
        }

        lateinit var txtPrecioMayoreo: TextView
        init {
            txtPrecioMayoreo=itemView.findViewById(R.id.txtPrecioMayoreo)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): productosAdapter.vHolder {
        var itemView = LayoutInflater.from(context).inflate(
            R.layout.vistaproductos,parent,false)
        return vHolder(itemView)
    }

    override fun getItemCount(): Int {
        return ListaProductos.size
    }

    override fun onBindViewHolder(holder: productosAdapter.vHolder, position: Int) {
        var productos = ListaProductos[position]
        holder.txtId.text=productos.Id
        holder.txtDescripcion.text=productos.Descipcion
        holder.txtPrecioMenudeo.text=productos.PrecioMenudeo
        holder.txtPrecioMayoreo.text=productos.PrecioMayoreo
    }


}