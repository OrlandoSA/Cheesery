package salazar.armenta.cheese

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btn_coldDrinks.setOnClickListener {
            var i = Intent(this, Cold_drinks::class.java)
            startActivity(i)
        }
        btn_hotDrinks.setOnClickListener {
            var i = Intent(this, Hot_drinks::class.java)
            startActivity(i)
        }
        btn_Sweets.setOnClickListener {
            var i = Intent(this, Sweets::class.java)
            startActivity(i)
        }
        btn_Salties.setOnClickListener {
            var i = Intent(this, Salties::class.java)
            startActivity(i)
        }
        btn_Combos.setOnClickListener {
            val intent = Intent(this, Combos::class.java)
            startActivity(intent)
        }
        btn_Personalized.setOnClickListener {
            val intent = Intent(this, Cold_drinks::class.java)
            startActivity(intent)
        }
    }
}