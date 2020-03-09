package salazar.armenta.cheese

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_registro.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        btn_GetStarted.setOnClickListener {
            var i = Intent(this, MenuActivity::class.java)
            startActivity(i)
        }
    }
}
