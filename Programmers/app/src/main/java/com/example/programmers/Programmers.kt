package com.example.programmers

class Solution {
    fun solution(n: Long): Int {
        var answerList = n.toString().toCharArray().sortedArrayDescending()
        var answer =answerList.joinToString().toInt()
        return answer
    }
}