package com.recepgemalmaz.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.recepgemalmaz.mvvmkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.mainActivityNesnesi = this
        binding.textViewSonuc.text = "0"

    }

    fun buttonToplama(alinanSayi1 : String, alinanSayi2 : String){
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val toplam = sayi1 + sayi2
        binding.textViewSonuc.text = toplam.toString()

    }
    fun buttonCarpma(alinanSayi1: String, alinanSayi2: String){
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val carpma = sayi1 * sayi2
        binding.textViewSonuc.text = carpma.toString()

    }
}