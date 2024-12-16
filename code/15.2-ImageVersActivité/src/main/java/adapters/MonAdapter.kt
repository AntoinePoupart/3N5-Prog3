package adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import models.Version
import org.poupart.databinding.MonItemBinding


class VersionAdapter : ListAdapter<Version, VersionAdapter.VersionItemViewHolder>(VersionItemDiffCallback) {

//Changer version par le nom du models en faisant ctrl + r
    inner class VersionItemViewHolder(private val binding: MonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(version: Version) {
            binding.tvVersion.text = version.version
            binding.tvNomVersion.text = version.nomVersion

            // Définir l'action lors du clic sur l'item
            binding.root.setOnClickListener {
                val intent: Intent = Intent(binding.root.context, DetailVersion::class.java)
                // Récupérer les même intent donne que dans le DetailVersion
                intent.putExtra("version", version.version)
                intent.putExtra("nomVersion", version.nomVersion)
                // Démarrer l'activité SecondActivity
                binding.root.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VersionItemViewHolder {
        val binding: MonItemBinding = MonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VersionItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VersionItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object VersionItemDiffCallback : DiffUtil.ItemCallback<Version>() {
    override fun areItemsTheSame(oldItem: Version, newItem: Version): Boolean {
        return oldItem == newItem
    }

    //Changer le nom du olditem et newitem par les noms données dans le models
    override fun areContentsTheSame(oldItem: Version, newItem: Version): Boolean {
        return oldItem.version == newItem.version &&
                oldItem.nomVersion == newItem.nomVersion
    }
}