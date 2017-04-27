package es.josehector.app.kotlin.trainingapp

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

import kotlinx.android.synthetic.main.view_item.view.*

/**
 * Created by Usuario on 27/04/2017.
 */

class ItemAdapter(val items : List<Item>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.view_item))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = with(holder.itemView) {
            item_title.text = items[position].title
            item_image.loadUrl(items[position].url)

    }

    override fun getItemCount(): Int = items.size


    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    }
}