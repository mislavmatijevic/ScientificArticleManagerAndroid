package hr.foi.scientificarticlemanager.models

import java.time.LocalDateTime

data class ScientificArticle(
    val title : String,
    val authors : ScientificArticleAuthorsList,
    val abstract : String,
    val publicationDate : LocalDateTime,
    val keywords : List<String>,
    val doi : String,
    val citation : String,
)