#!/bin/sh
scala $0 $@
exit
!#

def printer() = {
    println("subhan is greatest programmer ever made");
}

def ext_printer(name: String) = {
    println(name + " is greatest programmer ever made");
}

/*def extend_printer(argvs: Array[String]) = {*/
def extend_printer() = {
    //val myArgs = new Array[String](args.length);
    // Copy method 1:
    //for (i <- 0 until args.length) 
    //    myArgs.update(i,args(i))
    println(args(0) + " is greatest programmer ever made");
}

printer()
ext_printer("mahaboob")
extend_printer()
