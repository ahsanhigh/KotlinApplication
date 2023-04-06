package com.example.kotlinapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast
import androidx.core.view.isVisible
import com.airbnb.lottie.LottieAnimationView

class MainActivity2 : AppCompatActivity() {

    lateinit var webView:WebView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val pbBar = findViewById<LottieAnimationView>(R.id.animationLoading)
        webView = findViewById<WebView>(R.id.saarinewsWebView)

        webView.loadUrl("https://saarinews.com/")

        val javasetting = webView.settings
        javasetting.javaScriptEnabled = true

        webView.webViewClient = object : WebViewClient(){

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {

                pbBar.visibility = View.VISIBLE
                super.onPageStarted(view, url, favicon)
            }

            override fun onPageFinished(view: WebView?, url: String?) {

                pbBar.visibility = View.INVISIBLE
                super.onPageFinished(view, url)
            }


        }
    }

    override fun onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack()
        }else {
            super.onBackPressed()
        }
    }
}