/**
 * Copyright © Temenos Headquarters SA 2009-2019.  All rights reserved.
*/

import java.io.PrintStream;

/**
 * Simple class provided along with Rules Engine, to verify that CALLJ is
 * working.
 * 
 * @author nlaurance
 */
public class Test {

    private static final String EOL = System.getProperty("line.separator");
    private static final PrintStream CONSOLE = System.out;

    /**
     * Entry point for CALLJ.
     * 
     * @param in an example input parameter.
     * @return string containing <list>
     *         <li>The input parameter</li>
     *         <li>The java version</li>
     *         <li>The java vendor</li>
     *         </list>
     */
    public String test(final String in) {
        StringBuilder sb = new StringBuilder();
        sb.append("Input: ").append(in).append(EOL);
        sb.append("java.version: ").append(System.getProperty("java.version")).append(EOL);
        sb.append("java.vendor: ").append(System.getProperty("java.vendor")).append(EOL);
        return sb.toString();
    }

    /**
     * Entry point for testing from command line.
     * 
     * @param args not used.
     */
    public static void main(final String[] args) {
        CONSOLE.println(new Test().test("param"));
    }
}
