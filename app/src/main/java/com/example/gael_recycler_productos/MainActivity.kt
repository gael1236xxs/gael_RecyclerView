package com.example.gael_recycler_productos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var listaProductos: MutableList<dtProductos> = mutableListOf()
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listaProductos.add(
            dtProductos("1","Javon","$14.91", "$15"))

        listaProductos.add(
            dtProductos("2","shampo","$17.89", "$16"))

        listaProductos.add(
            dtProductos("3","sabritas cheto uwu","$17.5", "$15"))

        listaProductos.add(
            dtProductos("4","tarjeta de regalo call of duty","$200", "$180"))

        listaProductos.add(
            dtProductos("5","tarjeta de regalo google play","100", "$150"))

        listaProductos.add(
            dtProductos("6","pasta penne","$20", "$18"))

        listaProductos.add(
            dtProductos("7","queso amarillo","$40", "$4"))

        listaProductos.add(
            dtProductos("8","ropa americana pantalon","$138", "$123.50"))

        listaProductos.add(
            dtProductos("9","cuernito pan","$12", "$7"))

        listaProductos.add(
            dtProductos("10","platano","$12", "$8.5"))

        listaProductos.add(
            dtProductos("11","hot dog","$12", "$8"))

        listaProductos.add(
            dtProductos("12","cafe andatti","$23", "$12"))

        listaProductos.add(
            dtProductos("13","aceite","14", "11"))

        listaProductos.add(
            dtProductos("14","ensalda de pollo","$14", "$12"))

        listaProductos.add(
            dtProductos("15","sopa nissi","$12", "$8"))

        listaProductos.add(
            dtProductos("16","torta de la esquina ","$43", "$34"))

        listaProductos.add(
            dtProductos("17","quesadillas","15", "11"))

        listaProductos.add(
            dtProductos("18","gelatina","$12", "$6"))

        listaProductos.add(
            dtProductos("19","pan de cazon","$23", "$13"))

        listaProductos.add(
            dtProductos("20","palate dedo","$15", "$7.5"))

        var tabla = findViewById<RecyclerView>(R.id.TablaProductos)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=productosAdapter(this,listaProductos)

    }
}