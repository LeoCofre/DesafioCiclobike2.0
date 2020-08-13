package cl.desafiolatam.desafociclobike20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val setupCiclovias= SetupCiclovias().init()
        val myAdapter = CycloAdapter(setupCiclovias)

        ciclo_recycler.adapter = myAdapter
    }
}