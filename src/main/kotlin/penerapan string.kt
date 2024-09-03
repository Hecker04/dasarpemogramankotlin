fun main(args: Array<String>) {
    // Character occurrence in a sentence analysis
// the string that we want to analyze
    var s = "A programmer gets stuck in the shower because the instructions on the shampoo were: Lather,Wash, and Repeat."
    println(s)//saya berpikir kenapa bisa 33 dan 55 dan ternyata ngitung huruf data vowels dan consonant
    s = s.toLowerCase()
// counters initialization
    var vowelCount = 0
    var consonantCount = 0
// definition of character groups
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"
// main loop
    for (c in s) {
        if (vowels.contains(c)) {
            vowelCount++
        } else if (consonants.contains(c)) {
            consonantCount++
        }
    }
    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")
    println("Other characters: ${s.length - (vowelCount + consonantCount)}")

}