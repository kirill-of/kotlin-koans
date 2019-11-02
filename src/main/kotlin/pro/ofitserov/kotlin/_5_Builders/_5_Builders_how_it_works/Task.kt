package pro.ofitserov.kotlin._5_Builders._5_Builders_how_it_works

/*Builders: how it works

Look at the questions below and give your answers*/

enum class Answer { a, b, c }

val answers = mapOf<Int, Answer?>(
    1 to Answer.c, 2 to Answer.b, 3 to Answer.b, 4 to Answer.c
)

