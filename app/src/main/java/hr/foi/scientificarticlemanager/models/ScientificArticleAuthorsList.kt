package hr.foi.scientificarticlemanager.models

class ScientificArticleAuthorsList : ArrayList<ScientificArticleAuthor>() {
    override fun toString(): String {
        val stringBuilder = StringBuilder()

        forEach { author ->
            stringBuilder.append(author.lastName)
                .append(' ')
                .append(author.firstName[0])
                .append(", ")
        }

        val appendedNames = stringBuilder.toString()
        return appendedNames.removeSuffix(", ")
    }
}
