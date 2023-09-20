package hr.foi.scientificarticlemanager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hr.foi.scientificarticlemanager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}