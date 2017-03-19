package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
	private void APP(){
		System.err("Construct");
	}
    public static void main( String[] args )
    {
        System.err( "Hello World!" );

        System.err("A NullPointerException is a drag...");
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
        System.err("... but thankfully, Checker has our back: http://checkerframework.org");
    }
}
