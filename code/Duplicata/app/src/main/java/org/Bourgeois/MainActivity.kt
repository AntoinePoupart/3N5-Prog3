import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.Bourgeois.R

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var numberAdapter: NumberAdapter
    private lateinit var numberList: MutableList<NumberItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialisation de la RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Créer la liste des nombres (99 à 33 en enlevant 3 à chaque fois)
        numberList = mutableListOf()
        for (i in 99 downTo 33 step 3) {
            numberList.add(NumberItem(i))
        }

        // Configurer l'adaptateur
        numberAdapter = NumberAdapter(numberList)
        recyclerView.adapter = numberAdapter
    }
}