fun main(args: Array<String>) {
  //Leccion 1
  // variblesYConstantes()

  //Leccion 2
  //tiposDeDatos()

  //Leccion 3
  //sentenciaIf()

  //Leccion 4
  sentenciaWhen()


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
  val country = "FRAcia"

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


}






