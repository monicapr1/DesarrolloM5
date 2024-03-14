
package com.example.heroesapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.heroesapp.R;
import com.example.heroesapp.models.Item;
import com.squareup.picasso.Picasso;

class ItemsAdapter (private val items: List<Item>, private val onClick: (Item) -> Unit) :
    RecyclerView.Adapter<ItemsAdapter.ItemViewHolder>() {

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImageView: ImageView = itemView.findViewById(R.id.publisher_image_view)
        val itemNameTextView: TextView = itemView.findViewById(R.id.publisher_name_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.items_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.itemNameTextView.text = item.name
        Picasso.get().load(item.image).into(holder.itemImageView)
//        holder.itemImageView.setImageResource(item.image.toInt())
        holder.itemView.setOnClickListener {
            onClick(item)
        }
    }
}
