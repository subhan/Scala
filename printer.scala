#!/bin/sh
scala $0 $@
exit
!#

def printer() = {
    println(args(0));
}

printer()
