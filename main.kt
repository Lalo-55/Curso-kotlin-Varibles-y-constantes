fun main(args: Array<String>) {
  //Leccion 1
  // variblesYConstantes()

  //Leccion 2
  //tiposDeDatos()

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