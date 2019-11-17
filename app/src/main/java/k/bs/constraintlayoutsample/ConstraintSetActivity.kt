package k.bs.constraintlayoutsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.activity_constraint_set.*

class ConstraintSetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_set)


        val constraintSet1 = ConstraintSet()
        constraintSet1.clone(constraintLayout)

        val constraintSet2 = ConstraintSet()
        constraintSet2.clone(this, R.layout.activity_constraint_set2)

        var changed = false
        button.setOnClickListener {

            val transition = AutoTransition()
            transition.duration = 1000

            TransitionManager.beginDelayedTransition(constraintLayout, transition)

            val constraint = if (changed) constraintSet1 else constraintSet2
            constraint.applyTo(constraintLayout)
            changed = !changed

            textView.text = changed.toString()
        }
    }
}
