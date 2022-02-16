fun main(args: Array<String>) {
  //Leccion 1
  // variblesYConstantes()

  //Leccion 2
  //tiposDeDatos()

  //Leccion 3
  //sentenciaIf()

  //Leccion 4
  //sentenciaWhen()

  //Leccion 5
  //arrays()

  //Leccion 6
  // maps()

  //Leccion 7
  loops()


}
/*Variables y constantes
*/
private fun variblesYConstantes(){

  ///Variables

  var myFirstVariable = "Hola mundo!! "
  var myFirstNumber=10 
 
  var mysecondVariable ="Suscribete"


  println(myFirstVariable)
  myFirstVariable="Cambiando de valor a la variable"
  println(myFirstVariable)

  println("Valor de mi variable número: "+ myFirstNumber)


 //constantes
 //Una constante no puede cambiar de valor una vez que se le asigno un valor
  val myFirstConstant = "Esto es una constante"
  println("\n"+myFirstConstant)
  
}
/*Tipo de datos (data types)*/
private fun tiposDeDatos(){
  //String
  val myString: String = "Hola hackermen!"
  val myString2= "Bienvenidos al curso"
  val myString3: String = myString +" "+myString2
  println(myString3)

  //Enteros (Byte, Short, Int, Long)

  val myInt = 2
  val myInt2 = 6
  val myInt3: Int = myInt + myInt2
  println(myInt3)

  //Decimales (Float, Double)

  val myDouble: Float = 1.5f
  val myDouble2 = 1.5
  val myDouble3 =2
  val myDouble4: Double= myDouble + myDouble2+ myDouble3 +myInt3
  println(myDouble4)

  //Boolean (bool)

  val myBool: Boolean= true
  val myBool2 = false
  println(myBool == myBool2)
  println(myBool && myBool2)


}

/*Sentencia If*/
private fun sentenciaIf(){

  val myNumber = 91
  //Operadores concionales
  // > mayor que
  // < menor que
  // >= mayor o igual que
  // <= menor o igual que
  // == igual
  // != desigualdad

  // Operadores Logicos
  // && operador "y"
  // || operador "o"
  // ! operador "no"

  if((myNumber <= 10 && myNumber > 5) || (myNumber == 53)){
    println("$myNumber es menor que 10")

  }else if(!(myNumber > 90)){
    //Sentencia else if
    println("$myNumber es diferente  a 90")
    
  }
   else if(myNumber != 100){
    //Sentencia else if
    println("$myNumber es diferente a  100")
    
  }else{
    //Sentencia else
    println("$myNumber es mayor que 10 o igual o menor a 5 y no es igual a 53")
  }
  


}

/*sentencia When*/
private fun sentenciaWhen(){
  val country = "Francia"
  //When coin String
  when(country){

    "España","Mexico","Peru","Colombia" ->{
      println("El idioma es español")
    }"EEUU" ->{
      println("El idioma es ingles")
    }"Francia" ->{
      println("El idioma es frances")
    } else->{
      println("No conecemos el idioma")
    }


  }
  //When con Int 
  val age = 101

  when(age){
    0,1,2-> {
      println("Eres un bebé")
    }in 3..10 ->{
      println("Eres un niño")
    }in 11..17->{
      println("Eres un adolescente")
    }in 18..69->{
      println("Eres  adulto")
    }in 70..99->{
      println("Eres anciano")
    }else->{
      println("OMG")
    }
  }




}

/*array o arreglos*/
private fun arrays(){
  val name = "Lalo"
  val surname ="007"
  val company ="SDP"
  val age = "39"

  //Creacion del un Array

  val myArray = arrayListOf<String>()


 //Agregar elementos al array
  myArray.add(name)
  myArray.add(surname)
  myArray.add(company)
  myArray.add(age)
 //myArray.add(age)
 //myArray.add(age)

 //Añadir un conjunto de datos
 myArray.addAll(listOf("Hola","Bienvenidos al tuto", "De kotlin", "Esto es un elemento del Array"))
 println(myArray)

 //Acceso a datos
 val myCompany = myArray[2]
 println(myCompany)

 //Modificacion de datos
 myArray[7] = "Esto es un elemento del array modificado"
 println(myArray)

 //Eliminar datos
 myArray.removeAt(7)
 println(myArray)

 //Recorrer los elementos de array
 myArray.forEach{
   println(it)
 }

 //otras operaciones
println(myArray.first()) //Acceder al primer elemento del array
println(myArray.last()) //Acceder al ultimo elemento del array

 println(myArray.count()) //contar los datos en el array

 myArray.clear() //limpiar el array, es decir, dejarlo vacio

 println(myArray.count())



  


}


/*Aqui vamos a hablar de maps*/
private fun maps(){
  //Sintaxis 
  var myMap: Map<String,Int> =mapOf()
  println(myMap)

  //Añadir elementos
  myMap = mutableMapOf("Brais" to 1, "Pedro" to 10, "Juan" to 3)
  println(myMap)



  //añadir un solo valor
  myMap["lalo"]=9
  myMap.put("Edu",2)
  println(myMap)

 //Actualizar un dato
  myMap.put("Brais",3)
  myMap.put("Edu",3)
  println(myMap)

  //Aceso a un dato
  println(myMap["Edu"]) //Tenemos que escribir la clave

  //eliminar un dato
  myMap.remove("Pedro")
  println(myMap)




}


/*Aqui vamos a hablar de loops, tambien llamados bucles*/
private fun loops(){
  var myArray: List<String> = listOf("Uno","dos","tres")
  var myMap: MutableMap<String,Int> = mutableMapOf("Brais" to 10,"Edu" to 2,"lalo" to 3, "lulu " to 6)


  //for
  
  for(myString in myArray){ 
    println(myString)//Imprimiendo todos los elementos del Array
  }
  for(myBook in myMap){
    println(myBook)//Imprimiendo todos los elementos del mapa
    println("${myBook.key} - ${myBook.value} ")
  }
  for(x in 0..10){
    println(x)
  }
  for(x in 9 until 20){
    println(x)
  }

  for(x in 1..20 step 10){
    println(x)
  }

  for(x in 20 downTo 0 step 3){
    println(x)
  }
  val myNumberArray =(1..10)
  for(myArray in myNumberArray){
    println(myArray)
  }
  
  //while
  var x = 0

  while(x <= 10){
    println("$x es menor o igual a 10")
    x += 2
  }

  //do while

  x = 0

  do{
    println("$x es menor a 10")
    x++

  }while(x < 10)

  



}


