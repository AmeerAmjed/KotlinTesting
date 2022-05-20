import java.text.DecimalFormat

fun main(){
    var listLetter : List<String> =listOf("a", "b", "c")
    print(percentageLetterA(listLetter))
}


fun percentageLetterA(listLetter :List<String> ) : Any {
    if(!checkValidationListContains(listLetter)) {
        return -1
    }
    var count :Int =  listLetter.count { it == "a" }
    val dFormat = DecimalFormat("#.#")
    val result : Double = (( count.toDouble() /3) *100)
    return dFormat.format(result).toDouble()
}

fun checkValidationListContains(list :List<String>) :Boolean {
    if (!list.contains("a")) return false
    for (index in list){
        if(index.length !=1) return false
    }
    return true
}



