#!/bin/sh
scala $0 $@
exit
!#

/* scala functional programming */
def run() : Int = {
    var sum = 0
    var index = 0
    do {
        sum = sum + 2
        index += 1
    } while (index < 30)
    return sum
}
println("Total Sum " + run())

def factorial(n : Int) : Int = {

    if ( n <= 0) {
        return 1;
    }
    else{
        return n * factorial(n-1);
    }
} 
println("Factorial " + factorial(3));
