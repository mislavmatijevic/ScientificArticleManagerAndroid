package hr.foi.scientificarticlemanager

import hr.foi.scientificarticlemanager.models.ScientificArticleAuthor
import hr.foi.scientificarticlemanager.models.ScientificArticleAuthorsList
import org.junit.Assert
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ScientificArticleAuthorsListTest {
    @Test
    fun givenMockAuthorObjects_whenPutInAuthorsList_thenToStringReturnsCorrectFormat() {
        val mockAuthors = listOf(
            ScientificArticleAuthor("Emily", "Davis", "Environmental Institute", "PhD"),
            ScientificArticleAuthor("James", "Brown", "Climate Research Center", "MSc"),
            ScientificArticleAuthor("Robert", "Smith", "AI Research Institute", "PhD"),
        )

        val authorsList = ScientificArticleAuthorsList()
        authorsList.apply {
            addAll(mockAuthors)
        }

        Assert.assertEquals("Davis E, Brown J, Smith R", authorsList.toString())
    }
}