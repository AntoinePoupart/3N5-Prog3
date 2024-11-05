package adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import models.Album
import org.poupart.DetailAlbumActivity
import org.poupart.databinding.ActivityMainBinding
import org.poupart.databinding.ItemAlbumBinding

class MonAdapter : ListAdapter<Album, MonAdapter.MonItemViewHolder>(MonItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout mon_item.xml
    inner class MonItemViewHolder(private val binding: ItemAlbumBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Album) {
            binding.album.text = item.name // On affiche l'élément dans le TextView
            binding.artist.text = item.artistName
            // Définir l'action lors du clic sur l'item
            binding.root.setOnClickListener {
                val intent = Intent(binding.root.context, DetailAlbumActivity::class.java)

                // Passer l'objet Album via l'Intent
                intent.putExtra("albumName", item.name)
                intent.putExtra("albumArtist", item.artistName)


                // Démarrer l'activité de détails
                binding.root.context.startActivity(intent)
            }
            binding.btnSupprimer.setOnClickListener {
                val liste = currentList.toMutableList()

                val index = liste.indexOf(item)
                liste.removeAt(index)
                submitList(liste)

            }


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonItemViewHolder {
        val binding: ItemAlbumBinding = ItemAlbumBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MonItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MonItemViewHolder, position: Int) {
        val item: Album = getItem(position)
        holder.bind(item)
    }

}

object MonItemDiffCallback : DiffUtil.ItemCallback<Album>() {
    override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem == newItem
    }
}