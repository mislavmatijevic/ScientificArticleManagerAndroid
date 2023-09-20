package hr.foi.scientificarticlemanager.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import hr.foi.scientificarticlemanager.databinding.ListItemArticleBinding
import hr.foi.scientificarticlemanager.viewmodels.ArticleItemViewModel

class ScientificArticleAdapter(private val articleViewModels: List<ArticleItemViewModel>) :
    RecyclerView.Adapter<ScientificArticleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListItemArticleBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = articleViewModels.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val articleViewModel = articleViewModels[position]
        holder.bind(articleViewModel)
    }

    inner class ViewHolder(private val binding: ListItemArticleBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(articleViewModel: ArticleItemViewModel) {
            binding.article = articleViewModel
            binding.executePendingBindings()
        }
    }
}