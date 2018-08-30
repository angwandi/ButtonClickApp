package app.a2ms.buttonclickapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var userInput: EditText? = null
    private var button: Button? = null
    private var textView: TextView? = null
    private var numTimesClicked = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userInput = findViewById(R.id.editText)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        button?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                numTimesClicked += 1
                textView?.append("\nThe button got tapped $numTimesClicked time")
            }
        })
    }
}
