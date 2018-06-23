BK Library
===========

Non-local goto and backtracking in Scala

Author: Gidon Ernst <gidonernst@gmail.com>

Feedback is welcome! I'd appreciate to hear whether anyone found this library useful.

Installation
------------

    sbt compile
    sbt package
    sbt publishLocal # if you want to use it in other projects locally

Usage
-----

    import bk._

    def first = backtrack()
    def second = ...

    def result = { first } or { second }
