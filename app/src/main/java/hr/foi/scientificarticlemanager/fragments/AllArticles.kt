package hr.foi.scientificarticlemanager.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import hr.foi.scientificarticlemanager.databinding.FragmentAllArticlesBinding
import hr.foi.scientificarticlemanager.viewmodels.AllArticlesViewModel

class AllArticles : Fragment() {
    private lateinit var viewModel: AllArticlesViewModel
    private lateinit var binding: FragmentAllArticlesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAllArticlesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[AllArticlesViewModel::class.java]
    }
}