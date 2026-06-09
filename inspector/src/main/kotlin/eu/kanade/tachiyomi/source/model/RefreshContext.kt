package eu.kanade.tachiyomi.source.model

data class RefreshContext(
    val mangaId: Long,
    val existingChapters: List<SChapter>,
    val lastFetchTime: Long,
    val forceRefresh: Boolean = false,
)
