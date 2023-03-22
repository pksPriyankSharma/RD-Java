public class HelloWorld {
    //global variable

    public static int yGlobal = 20;

    public int zGlobal = 50;

    // access modifiers - default by default = accessible at package level
    // access modifiers - private - within the class
    // access modifiers - protected - can be accessed by Child classes // need an example to try it out
    // access modifiers - public - can be accessed by any other class


    //main - as the entry point, Method Name
    //public - for JVM to access, accessible for all
    //void - no return, not possible to use int, String in place of void
    //manifest file contains Class Name, and absolute path for main() method. Manifest file is used for Prodn level App.
    //static - no need instantiate the Method, and JVM can still call the Method w/o creating the Object
    //String is the Array, for arguments to be passed into - is a data type
    //args - are the parameters to be passed into
    public static void main(String[] args) {
        //local variable
        int x = 12;

        // amazonWebServices - example of variable, Camel case
        //amazonWebServices - example of method name, Camel case

        System.out.println(x+" : value of x" );
        System.out.println(yGlobal+" : global variable in the same class");
        HelloWorld lzGlobal = new HelloWorld(); //new will allocate the Memory in HEAP(dynamic memory allocation), using malloc
        System.out.println(lzGlobal.zGlobal+" :created with new and Class template");
    }
}
//task - develop a calculator for basic mathematically computation - 2 methods - add & subtract
// Java keywords - tbd
// Operators