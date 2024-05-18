package com.example.androidbundle

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.androidbundle.R.id.nis

class MainActivity2 : AppCompatActivity() {

    private lateinit var nama: TextView
    private lateinit var kelas: TextView
    private lateinit var nis: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        nama = findViewById(R.id.nama)
        kelas = findViewById(R.id.kelas)
        nis = findViewById(R.id.nis)

        val extras = intent.extras

        nama.text = extras?.getString("nama")
        kelas.text = extras?.getString("kelas")
        nis.text = extras?.getString("nis")
    }
}