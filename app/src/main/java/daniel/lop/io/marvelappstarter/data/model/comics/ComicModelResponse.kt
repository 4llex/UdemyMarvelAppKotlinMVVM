package daniel.lop.io.marvelappstarter.data.model.comics

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ComicModelResponse (//ComicDataWrapper
    @SerializedName("data")
    val data: ComicModelData
): Serializable