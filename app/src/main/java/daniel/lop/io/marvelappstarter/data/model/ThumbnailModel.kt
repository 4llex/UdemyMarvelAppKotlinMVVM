package daniel.lop.io.marvelappstarter.data.model

import com.google.gson.annotations.SerializedName

data class ThumbnailModel(// represents: thumbnail/Image
    @SerializedName("path")
    val path: String,
    @SerializedName("extension")
    val extension: String
)