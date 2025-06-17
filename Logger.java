public class Logger{
private static Logger logger;
//constructor should be private for singleton pattern
private Logger()
{
System.out.println("Logger Intialised");
}

//object created with the help of method
public static Logger getLogger()
{
if (logger==null)
logger= new Logger();
return logger;
}


// test method to test the singleton implementation using hashcode to check that only one object instance of a class is created
public static void test()
{
 Logger logger1 = Logger.getLogger();
System.out.println(logger1.hashCode());
 Logger logger2 = Logger.getLogger();
System.out.println(logger2.hashCode());
if(logger1==logger2)
System.out.println("Singleton Design Pattern");
else
System.out.println("Singleton Design Pattern failed");
}
  // main method
public static void main(String args[]){
test();
}
}

