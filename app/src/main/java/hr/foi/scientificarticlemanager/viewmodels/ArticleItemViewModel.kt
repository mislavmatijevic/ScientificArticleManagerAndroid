package hr.foi.scientificarticlemanager.viewmodels

import androidx.lifecycle.ViewModel
import hr.foi.scientificarticlemanager.models.ScientificArticle

class ArticleItemViewModel(article: ScientificArticle) : ViewModel() {
    val title = article.title
    val authors = article.authors.toString()
    val publicationDate = "${article.publicationDate.month.name} ${article.publicationDate.year}"
}