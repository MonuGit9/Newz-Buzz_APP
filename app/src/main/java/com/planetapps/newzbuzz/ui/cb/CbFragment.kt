package com.planetapps.newzbuzz.ui.cb

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.planetapps.newzbuzz.R
import com.planetapps.newzbuzz.databinding.FragmentCbBinding
import com.planetapps.newzbuzz.webViewController


class GalleryFragment : Fragment() {

    private var _binding: FragmentCbBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentCbBinding.inflate(inflater, container, false)
        val root: View = binding.root


        var webView2: WebView
        webView2 = root.findViewById(R.id.webViewCB)
        webView2.loadUrl("https://www.cricbuzz.com/")
        webView2.setWebViewClient( webViewController())

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}