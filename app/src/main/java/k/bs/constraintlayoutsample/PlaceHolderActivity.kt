package k.bs.constraintlayoutsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_place_holder.*

class PlaceHolderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place_holder)

        changeBtn.setOnClickListener {
            ph_1.setContentId(R.id.btn)
        }
    }
}
