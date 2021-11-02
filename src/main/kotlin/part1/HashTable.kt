package part1

import java.util.LinkedList
import kotlin.Array

class HashTable {
    private val entries: Array<LinkedList<Entry>?> = arrayOfNulls(1)

    private data class Entry(
        val key: Int,
        var value: String
    )

    fun put(key: Int, value: String) {
        val entry = getEntry(key)
        if (entry != null) {
            entry.value = value
            return
        }
        getOrCreateBucket(key)?.add(Entry(key, value))
    }

    operator fun get(key: Int): String? {
        val entry = getEntry(key)
        return entry?.value
    }

    fun remove(key: Int) {
        val entry = getEntry(key) ?: throw IllegalStateException()
        getBucket(key)?.remove(entry)
    }


    private fun getOrCreateBucket(key: Int): LinkedList<Entry>? {
        val index = hash(key)
        val bucket = entries[index]
        if (bucket == null)
            entries[index] = LinkedList()
        return bucket ?: entries[index]
    }

    private fun getBucket(key: Int): LinkedList<Entry>? {
        return entries[hash(key)]
    }

    private fun getEntry(key: Int): Entry? {
        val bucket = getBucket(key)
        if (bucket != null)
            for (entry in bucket)
                if (entry.key == key)
                    return entry
        return null
    }

    private fun hash(key: Int): Int {
        return key % entries.size
    }


}
