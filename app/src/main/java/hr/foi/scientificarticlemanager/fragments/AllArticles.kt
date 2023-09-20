package hr.foi.scientificarticlemanager.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import hr.foi.scientificarticlemanager.R
import hr.foi.scientificarticlemanager.viewmodels.AllArticlesViewModel

class AllArticles : Fragment() {

    companion object {
        fun newInstance() = AllArticles()
    }

    private lateinit var viewModel: AllArticlesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_all_articles, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[AllArticlesViewModel::class.java]
    }
}