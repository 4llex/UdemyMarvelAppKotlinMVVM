package daniel.lop.io.marvelappstarter.data.local

import androidx.room.TypeConverter
import com.google.gson.Gson
import daniel.lop.io.marvelappstarter.data.model.ThumbnailModel

class MarvelConverters {

    @TypeConverter
    fun fromThumbnail(thumbnailModel: ThumbnailModel): String {
      return Gson().toJson(thumbnailModel)
    }

    @TypeConverter
    fun toThumbnail(thumbnail: String): ThumbnailModel {
        return Gson().fromJson(thumbnail, ThumbnailModel::class.java)
    }

}