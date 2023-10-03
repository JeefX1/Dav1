package com.example.dgbdgbdfdfgbdbf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
                                {1}
    fun isPalindrome(num: Int): Boolean {
        val str = num.toString()
        return str == str.reversed()
    }

    fun findPalindromeSquaresInRange(n: Int, m: Int): List<Int> {
        val result = mutableListOf<Int>()

        for (num in n..m) {
            if (isPalindrome(num)) {
                val squared = num * num
                if (isPalindrome(squared)) {
                    result.add(num)
                }
            }
        }

        return result
    }

    fun main() {
        val n = 1
        val m = 1000

        val palindromes = findPalindromeSquaresInRange(n, m)
        println("Number-palindromes whose squares are also palindromes in the range $n to $m:")
        println(palindromes)
    }



                                        {2}

    fun subtractKDigitsToMaximize(number: Long, k: Int): Long {
        val numStr = number.toString()
        val stack = mutableListOf<Char>()

        for (digit in numStr) {
            while (k > 0 && stack.isNotEmpty() && digit < stack.last()) {
                stack.removeAt(stack.size - 1)
                k--
            }
            stack.add(digit)
        }


        while (k > 0 && stack.isNotEmpty()) {
            stack.removeAt(stack.size - 1)
            k--
        }

        val resultStr = stack.joinToString("")
        return resultStr.toLong()
    }

    fun main() {
        val number = 1432219L
        val k = 3

        val result = subtractKDigitsToMaximize(number, k)
        println("The largest number after subtracting $k digits is: $result")
    }




                                                {3}
    fun findPrimeDivisors(n: Int): List<Int> {
        val primeDivisors = mutableListOf<Int>()
        var num = n
        var divisor = 2

        while (num > 1 && divisor * divisor <= n) {
            if (num % divisor == 0) {
                primeDivisors.add(divisor)
                while (num % divisor == 0) {
                    num /= divisor
                }
            }
            divisor++
        }

        if (num > 1) {
            primeDivisors.add(num)
        }

        return primeDivisors
    }

    fun main() {
        val n = 36

        val primeDivisors = findPrimeDivisors(n)
        println("Prime divisors of $n are: $primeDivisors")
    }












}