object LearningScala3 {
  // Functions
  
  // Format is def <function name>(parameter name: type...) : return type = { expression }
  // Don't forget the = before the expression!
  def squareIt(x: Int) : Int = {
  	x * x
  }                                               //> squareIt: (x: Int)Int
  
  def cubeIt(x: Int): Int = {x * x * x}           //> cubeIt: (x: Int)Int
  
  println(squareIt(3))                            //> 9
  
  println(cubeIt(4))                              //> 64
  
  // Functions can take other functions as parameters
  
  def transformInt(x: Int, f: Int => Int) : Int = {
  	f(x)
  }                                               //> transformInt: (x: Int, f: Int => Int)Int
  
  val result = transformInt(2, cubeIt)            //> result  : Int = 8
  println (result)                                //> 8
  
  // "Lambda functions", "anonymous functions", "function literals"
  // You can declare functions inline without even giving them a name
  // This happens a lot in Spark.
  transformInt(3, x => x * x * x)                 //> res0: Int = 27
  
  transformInt(10, x => x / 2)                    //> res1: Int = 5
  
  transformInt(2, x => {val y = x * 2; y * y})    //> res2: Int = 16
  
  // This is really important!
  
  // EXERCISE
  // Strings have a built-in .toUpperCase method. For example, "foo".toUpperCase gives you back FOO.
  // Write a function that converts a string to upper-case, and use that function of a few test strings.
  // Then, do the same thing using a function literal instead of a separate, named function.
  
  def myToUpper( lowerCase: String) : String = {lowerCase.toUpperCase}
                                                  //> myToUpper: (lowerCase: String)String
  
  val upperCase = myToUpper("colin p clark")      //> upperCase  : String = COLIN P CLARK
  
  def transformString( aString: String, f: String => String) : String = {
 	 	f(aString)
  	}                                         //> transformString: (aString: String, f: String => String)String
  	
  
  val literalUpperCase = transformString("colin p clark", newString => newString.toUpperCase)
                                                  //> literalUpperCase  : String = COLIN P CLARK
  
}