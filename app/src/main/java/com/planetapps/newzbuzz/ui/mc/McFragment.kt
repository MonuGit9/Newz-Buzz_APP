package com.planetapps.newzbuzz.ui.mc

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.planetapps.newzbuzz.R
import com.planetapps.newzbuzz.databinding.FragmentMcBinding
import com.planetapps.newzbuzz.webViewController

class McFragment : Fragment() {

    private var _binding: FragmentMcBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        ViewModelProvider(this).get(McViewModel::class.java)

        _binding = FragmentMcBinding.inflate(inflater, container, false)
        val root: View = binding.root



        var webView: WebView
        webView = root.findViewById(R.id.webViewMC)
        webView.loadUrl("https://www.moneycontrol.com/")
webView.setWebViewClient( webViewController())



    return root
}



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}