package hr.foi.scientificarticlemanager

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import hr.foi.scientificarticlemanager.helpers.MockScientificArticleRepository
import hr.foi.scientificarticlemanager.models.ScientificArticle

class AllArticlesViewModel : ViewModel() {
    var articles: MutableLiveData<List<ScientificArticle>>

    init {
        this.articles = MutableLiveData<List<ScientificArticle>>()
        this.articles.value = MockScientificArticleRepository.getArticles()
    }
}