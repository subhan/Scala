#!/bin/bsh
scala $0 $@
exit
!#

def fact(n: BigInt): BigInt = {
    if (n <= 0){
        return 1
    }else{
        return n*fact(n-1)
    }
}

println(fact(9110))
