package k.bs.constraintlayoutsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setView()
    }

    private fun setView() {
        btn_1.setOnClickListener {
            startActivity(Intent(this, ConstraintSetActivity::class.java))
        }

        btn_2.setOnClickListener {
            startActivity(Intent(this, PlaceHolderActivity::class.java))
        }
    }
}
