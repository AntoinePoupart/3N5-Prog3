package adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import models.Version
import org.poupart.databinding.MonItemBinding


class VersionAdapter : ListAdapter<Version, VersionAdapter.VersionItemViewHolder>(VersionItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout Version_item.xml
    inner class VersionItemViewHolder(private val binding: MonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(version: Version) {
            binding.tvVersion.text = version.version
            binding.tvCodeName.text = version.nomVersion

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

    override fun areContentsTheSame(oldItem: Version, newItem: Version): Boolean {
        return oldItem.version == newItem.version &&
                oldItem.nomVersion == newItem.nomVersion
    }
}