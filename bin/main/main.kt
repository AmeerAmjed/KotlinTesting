import java.text.DecimalFormat

fun main(){

}


fun percentageLetterA(list :List<String> ) : Any {
    if(!checkValidationListContains(list)) {
        return -1
    }
    var count :Int =  list.count { it == "a" }
    val dFormat = DecimalFormat("#.#")
    val result : Double = (( count /3).toDouble() *100)
    return dFormat.format(result)
}

fun checkValidationListContains(list :List<String>) :Boolean {
    if (!list.contains("a")) return false
    for (index in list){
        if(index.length !=1) return false
    }
    return true
}



