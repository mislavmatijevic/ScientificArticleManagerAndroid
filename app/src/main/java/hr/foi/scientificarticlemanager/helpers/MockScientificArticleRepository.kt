package hr.foi.scientificarticlemanager.helpers

import hr.foi.scientificarticlemanager.models.ScientificArticle
import hr.foi.scientificarticlemanager.models.ScientificArticleAuthor
import hr.foi.scientificarticlemanager.models.ScientificArticleAuthorsList
import java.time.LocalDateTime

object MockScientificArticleRepository {
    private val _articles = listOf(
        ScientificArticle(
            "Exploring Quantum Computing",
            ScientificArticleAuthorsList().apply {
                add(ScientificArticleAuthor("Alice", "Johnson", "Institute of Physics", "PhD"))
            },
            "This article delves into the principles of quantum computing...",
            LocalDateTime.of(2023, 1, 15, 0, 0),
            listOf("quantum computing", "physics"),
            "doi-12345",
            "Johnson, A. (2023). Exploring Quantum Computing. Institute of Physics."
        ),
        ScientificArticle(
            "Advancements in Artificial Intelligence",
            ScientificArticleAuthorsList().apply {
                add(ScientificArticleAuthor("Robert", "Smith", "AI Research Institute", "PhD"))
            },
            "This paper discusses recent breakthroughs in AI and machine learning...",
            LocalDateTime.of(2023, 2, 20, 0, 0),
            listOf("artificial intelligence", "machine learning"),
            "doi-67890",
            "Smith, R. (2023). Advancements in Artificial Intelligence. AI Research Institute."
        ),
        ScientificArticle(
            "Climate Change and Global Impacts",
            ScientificArticleAuthorsList().apply
            {
                add(ScientificArticleAuthor("Emily", "Davis", "Environmental Institute", "PhD"))
                add(ScientificArticleAuthor("James", "Brown", "Climate Research Center", "MSc"))
            },
            "This study analyzes the effects of climate change on various ecosystems...",
            LocalDateTime.of(2023, 3, 10, 0, 0),
            listOf("climate change", "environment", "ecosystems"),
            "doi-54321",
            "Davis, E., & Brown, J. (2023). Climate Change and Global Impacts. Environmental Institute, Climate Research Center."
        )
    )

    fun getArticles() = _articles
}