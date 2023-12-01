package daniel.lop.io.marvelappstarter.data.model.comics

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ComicModelData (// CommicDataContainer
    @SerializedName("results")
    val results: List<ComicModel>
): Serializable