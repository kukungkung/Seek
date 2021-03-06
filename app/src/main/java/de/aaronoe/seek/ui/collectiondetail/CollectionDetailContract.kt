package de.aaronoe.seek.ui.collectiondetail

import de.aaronoe.seek.data.model.photos.PhotosReply
import de.aaronoe.seek.data.model.collections.Collection

/**
 * Created by aaron on 07.06.17.
 *
 */
class CollectionDetailContract {

    interface View {
        fun showImages(photosList: List<PhotosReply>)
        fun showError()
        fun showLoading()
        fun addMoreImages(otherList: List<PhotosReply>)
        fun moveToPosition(position: Int)
        fun onCollectionDeleted()
        fun showSnackbarWithMessage(message: String)
    }

    interface Presenter {
        fun downloadImages(collection: Collection, page: Int, isFirstLoad: Boolean)
        fun deleteCollection(collection: Collection)
    }

}