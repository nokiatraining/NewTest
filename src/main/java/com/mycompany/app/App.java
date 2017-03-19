package com.mycompany.app;
import java.lang.*;
/**
 * Hello world!
 *
 */
public class App 
{
	private void APP(){
		System.err.prinln("Construct");
	}
    public static void main( String[] args )
    {
        System.err.println( "Hello World!" );

        System.err.println("A NullPointerException is a drag...");
        //Object myObject = null;
        /**
         * Checker prevents this from compiling...
         */
//        System.out.println("myObject: " + myObject.toString());
        /**
         * ... which is simply fantastic. It shows:
         *
         * error: [dereference.of.nullable] dereference of possibly-null
         * reference myObject
         *
         * http://checkerframework.org
         */
        System.err.println("... but thankfully, Checker has our back: http://checkerframework.org");
    }
}
