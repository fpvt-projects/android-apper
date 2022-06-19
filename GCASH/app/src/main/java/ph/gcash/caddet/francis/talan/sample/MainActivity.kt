package ph.gcash.caddet.francis.talan.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.gcash.caddet.francis.talan.sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textMessage.text = "View Binding"
    }
}