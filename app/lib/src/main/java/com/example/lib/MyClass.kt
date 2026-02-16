package com.example.lib

    //Crea un program, que tenga un precio de comida y un porcentaje de propina e imprimir cuanto es el total a bapagar
    //String Interpolation
    //que es un Hilo??????? Null Sef

    fun main (){
        println("Hola mundo")
        //1.
        val price : Double = 150.0
        val percentage : Double = 0.10
        val tip : Double = price * percentage
        val total : Double = price + tip
        println("El costo de la comida es: " + total)

        //El portero de la discoteca Verifica que una persona pueda entrar en la disco si
        //Solo si es mayor de edad
        println("Pon una edad: ")
        val input = readlnOrNull()
        val age = input?.toIntOrNull()

        //Utilizar when en ves de if else
//        when(age){
//            in 1..17 println("Tas chavo no puedes pasar")
//            in 18..200("Puedes pasar a la disco")
//            else -> println("Ingresa un valor valido")
//        }
//        if(age == null){
//            println("El numero que pusiste no es un numero entero, insertalo bien!!")
//        }
//        else if(age > 17){
//            println("Eres mayor de edad puedes pasar a la discoteca")
//        }
//        else{
//            println("No puedes pasar")
//        }

        //Rangos
//        for (i in 1..10){
//            println(i)
//        }
//
//        //Ciclo for al reves
//        for (i in 10 downTo 2){
//            println(i)
//        }
//
//        //Saltos de numeros
//        for (i in 100 downTo 0 step 10){
//            println(i)
//        }

        //WHEN
        when(age){
            null -> println("Ingresa un numero valido")
            in 18.. Integer.MAX_VALUE -> println("Eres mayor de edad puedes pasar")
            else -> println("Tas chavo no puedes pasar")
        }

        //WHILE
        var counter :Int = 12
        while(counter < 20){
            println("El contador es menor que 20")
            counter++
        }

        //DO WHILE -> Primero ejecuta la linea de codigo y desppues evalua la condición
        //Operadores logicos: && ||
        //Operador aritmeticos: + - * / %
        do{
            println("El contador vale 20")
            counter++
        } while (counter <30)

        //Determinar si un numero ingresado por el usuario es un numero primo
        println("Pon una numero: ")
        val v = readlnOrNull()
        val num1 = v?.toIntOrNull() ?: 0
        val div1: Double = num1.toDouble() / 1.0
        val div2: Double = num1.toDouble() /num1.toDouble()
        //Si
        //Cambio pendiente
        //Cambio que se me olvido por tonto
        //Ultimo cambio de menso
    }