package interview

import java.util.Stack

fun main() {
    val str="{[()()]}"
    if(isValidParenthesis(str)){
        println("Valid Parenthesis")
    }
    else{
        println("Not Valid")
    }

}
fun isValidParenthesis(s:String):Boolean{
    val stack=Stack<Char>()
    for (char in s) {
        when(char){
            '(','[','{' ->stack.push(char)
            ')'-> if (stack.isEmpty() || stack.pop()!='(') return false
            ']' -> if (stack.isEmpty() || stack.pop()!='[') return false
            '}' -> if (stack.isEmpty() || stack.pop()!='{') return false
        }
    }
    return stack.isEmpty()
}