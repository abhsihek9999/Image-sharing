package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import java.net.URI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ivUri = findViewById(R.id.ivUri) as ImageView

        if (intent.hasExtra(Intent.EXTRA_STREAM)) {

            if (intent.type != null &&
                  intent.type.equals("image/*")) {

                val uri = intent.getParcelableExtra<Uri>(Intent.EXTRA_STREAM)

                ivUri.setImageURI(uri)
            }
        }

    }
}