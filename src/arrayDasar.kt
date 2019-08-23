import java.util.*

fun main (args : Array<String>){
        bilanganprima()
}
fun bilanganprima () {
    var scan = Scanner(System.`in`)
    println("Banyakanya bilangan")
//    var dasarprima = arrayOf<Int>()
    var bilangan=scan.nextInt()
    var dasarprima = IntArray(10)

    for(k in 1..bilangan){
        println("masukkan nomer ke- $k")
        dasarprima[k]=scan.nextInt()
    }
    var temp=0;
    var prima=true;
    for(i in 1..bilangan){
        for(j in 2..dasarprima[i]/2){
            temp = dasarprima[i]%j
            if(temp==0){
                prima = false ;
                break;
            }
        }
        if(prima && ((dasarprima[i]>0) && (dasarprima[i]!=1)))
            println("bilangan prima"+dasarprima[i])
    }
}

