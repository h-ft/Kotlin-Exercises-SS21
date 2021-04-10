fun main() {
    print("Bitte eine Nummer eingeben")
    val input = readLine()?:"0"
    val obereGrenze = input.toLong() // conversion of input STRING to LONG
    if(obereGrenze > 0) {
        val result = calculateFibonacciSequence(obereGrenze)
        val m = result.size - 1
        for (i in 0..m) { // printing the result, separated by a comma
            if (i != m)
                print(result[i].toString() + ", ")
            else
                print(result[i].toString()) // for the last number without comma
        }
    }
    else println("Ungültig. Eingabe muss > 0") // input must be bigger than zero
}

fun calculateFibonacciSequence(n : Long) : Array<Long> {
    val m = n.toInt()
    val result = Array(m+1) { it.toLong() } // index as a placeholder
    for (i in 0..m) {
        when (i) {
            0 -> result[i] = 0L
            1,2 -> result[i] = 1L
            else -> result[i] = result[i - 1] + result[i - 2]
        }
    }
    return result
}

/*fun calculateFibonacciSequence(n : Long) : Array<Long> {
    val resultFixed: Array<Long> // container for fixed presets
    when (n) {  // fixed presets for input 0, 1, and 2
        0L -> {
            resultFixed = arrayOf(0L)
            return resultFixed
        }
        1L -> {
            resultFixed = arrayOf(0L, 1L)
            return resultFixed
        }
        2L -> {
            resultFixed = arrayOf(0L, 1L, 1L)
            return resultFixed
        }
        else -> {   // dynamic array using arrayList for anything bigger than 2
            val resultDyn = arrayListOf<Long>(0, 1, 1) // ---------------------- the test does not allow me to do this :( -----------------
            val m = n.toInt()
            for (i in 3..m) {
                val nextNumber = resultDyn[i - 1] + resultDyn[i - 2]
                resultDyn.add(nextNumber)
            }
            return resultDyn.toTypedArray() // converting the mutable list back into immutable
        }
    }
}

   CLARIFICATION: Comments are written in English to make it easier for me if i ever need to
   look back here again in the future. I've had a Prof doubting that the code is mine due to the
   comments being made in English and I hereby declare that this work is of my own unless specified otherwise
   (SIG: Henry Febrian).
   Anything copied from the internet will be specified (the link will be commented next or above the code)

   Die Kommentare sind in Englisch geschrieben, um es mir einfacher zu machen, falls ich in der Zukunft hier noch
   einmal nachschauen muss. Ich hatte einen Prof, der daran gezweifelt hat, dass der Code von mir ist, weil die
   Kommentare auf Englisch sind und ich erkläre hiermit, dass diese Arbeit meine eigene Leistung ist, sofern nicht
   anders angegeben. (SIG: Henry Febrian)
   Alles, was aus dem Internet kopiert wurde, wird hingewiesen (der Link wird neben oder über dem Code kommentiert).*/
