package daniel.lop.io.marvelappstarter.repository

import daniel.lop.io.marvelappstarter.data.local.MarvelDao
import daniel.lop.io.marvelappstarter.data.model.character.CharacterModel
import daniel.lop.io.marvelappstarter.data.remote.ServiceApi
import javax.inject.Inject

class MarvelRepository @Inject constructor(
    private val api: ServiceApi,
    private val dao: MarvelDao
) {
    // Retrofit requests
    suspend fun list(nameStartWith: String? = null) = api.list(nameStartWith)
    suspend fun getComics(characterId: Int) = api.getComics(characterId)

    // Room Database requests
    suspend fun insert(characterModel: CharacterModel) = dao.insert(characterModel)
    fun getAll() = dao.getALl()
    suspend fun delete(characterModel: CharacterModel) = dao.delete(characterModel)

}