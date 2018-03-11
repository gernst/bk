BK Library
===========

Non-local goto and backtracking in Scala

Author: Gidon Ernst <gidonernst@gmail.com>

Feedback is welcome! I'd appreciate to hear whether anyone found this library useful.

Usage:

    import bk._

    def first = backtrack()
    def second = ...

    def result = { first } or { second }
