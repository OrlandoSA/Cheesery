package salazar.armenta.cheese

import android.content.Context

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_cold_drinks.*
import kotlinx.android.synthetic.main.activity_combos.*
import kotlinx.android.synthetic.main.producto_view.view.*

class Combos : AppCompatActivity() {

    var combos = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_combos)

        cargarProductos()

        var adaptador = AdaptadorProductos(this, combos)

        gridview.adapter = adaptador


    }

    fun cargarProductos() {
        combos.add(
            Product(
                "Combo 1",
                R.drawable.combo1,
                "Caramel syrup meets coffee, milk and ice and whipped cream and buttery caramel sauce layer the love on top.",
                5
            )
        )
        combos.add(
            Product(
                "Combo 2",
                R.drawable.combo2,
                "Rich mocha-flavored sauce meets up with chocolaty chips, milk and ice for a blender bash.",
                6
            )
        )
        combos.add(
            Product(
                "Combo 3",
                R.drawable.combo3,
                "Created by steeping medium-to-coarse ground coffee in room temperature water for 12 hours or longer.",
                3
            )
        )
        combos.add(
            Product(
                "Combo 4",
                R.drawable.combo4,
                "Leafy taste of matcha green tea powder with creamy milk and a little sugar for a flavor balance that will leave you feeling ready and raring to go.",
                4
            )
        )
    }

    private class AdaptadorProductos : BaseAdapter {

        var productos = ArrayList<Product>()
        var contexto: Context? = null

        constructor(contexto: Context, productos: ArrayList<Product>) {
            this.contexto = contexto
            this.productos = productos
        }

        override fun getCount(): Int {
            return productos.size
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
            var prod = productos[position]
            var inflador = LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.producto_view, null)

            vista.producto_img.setImageResource(prod.image)
            vista.producto_nombre.setText(prod.name)
            vista.producto_desc.setText(prod.description)
            vista.producto_precio.setText("$${prod.price}")

            return vista

        }

        override fun getItem(position: Int): Any {
            return productos[position]
        }

    }

}