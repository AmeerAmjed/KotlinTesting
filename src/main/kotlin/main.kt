
import java.text.DecimalFormat

fun main(){
    var listLetter : List<String> =listOf("a", "b", "c")
    print(percentageLetterA(listLetter))
}

/*
Function calculate percentage Letter A
when get wrong return -1
 */
fun percentageLetterA(listLetter :List<String> ) : Any {
    //function check Validation List Contains
    if(!checkValidationListContains(listLetter)) {
        return -1
    }
    // Count letter a in list
    var count :Int =  listLetter.count { it == "a" }
    // Set Format Decimal
    val dFormat = DecimalFormat("#.#")
    val result : Double = (( count.toDouble() /listLetter.size) *100)
    // applay DecimalFormat on result
    return dFormat.format(result).toDouble()
}

/*
To check Validation list Contains
when get wrong list not contains letter a or index list not as chart return false
 */
fun checkValidationListContains(list :List<String>) :Boolean {
    // Check list contains letter a
    if (!list.contains("a")) return false
    // Check index list length as chart
    for (index in list){
         if(index.length !=1 || !index.contains(Regex("a|b"))) return false
    }
    return true
}
