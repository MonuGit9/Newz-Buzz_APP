package com.planetapps.newzbuzz

import android.webkit.WebView
import android.webkit.WebViewClient

class webViewController : WebViewClient() {

    override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {

            view.loadUrl(url)

        return true
    }
}