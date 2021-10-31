package part1


object CharFinder {

    fun findTheFirstNonRepeatedChar(str: String): Char {
        val map = HashMap<Char, Int>()

        val chars = str.toCharArray()
        for (ch in chars) {
            val count = if (map.containsKey(ch)) map[ch] else 0
            count?.let {
                map[ch] = (it + 1)
            }
        }

        for (ch in chars) {
            if (map[ch] == 1)
                return ch
        }

        return Char.MIN_VALUE
    }

    fun findTheFirstRepeatedChar(str: String): Char {
        val set = HashSet<Char>()

        for (ch in str.toCharArray()) {
            if (set.contains(ch))
                return ch
            set.add(ch)
        }
        return Char.MIN_VALUE
    }

}