package lt.arnas.fifthtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val TAG = "my_dice_tag"

    lateinit var mainText: TextView
    lateinit var dice1: TextView
    lateinit var dice2: TextView
    lateinit var dice3: TextView
    lateinit var dice4: TextView
    lateinit var dice5: TextView
    lateinit var dice6: TextView
    lateinit var button: Button
    lateinit var sumOfDices: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainText = findViewById(R.id.mainText)
        dice1 = findViewById(R.id.dice1)
        dice2 = findViewById(R.id.dice2)
        dice3 = findViewById(R.id.dice3)
        dice4 = findViewById(R.id.dice4)
        dice5 = findViewById(R.id.dice5)
        dice6 = findViewById(R.id.dice6)
        button = findViewById(R.id.button)
        sumOfDices = findViewById(R.id.sumOfDices)

        button.setOnClickListener {
            rollDices()
        }

    }

    fun rollDices() {
        var dices = mutableListOf<Int>()
        var sum: Int = 0

        for(item in 0..5) {
            dices.add(item, Random.nextInt(1, 6))
            sum += dices[item]
        }

        dice1.text = "Dice 1: ${dices[0]}"
        dice2.text = "Dice 2: ${dices[1]}"
        dice3.text = "Dice 3: ${dices[2]}"
        dice4.text = "Dice 4: ${dices[3]}"
        dice5.text = "Dice 5: ${dices[4]}"
        dice6.text = "Dice 6: ${dices[5]}"

        sumOfDices.text = "Sum of dices: $sum"
    }
}