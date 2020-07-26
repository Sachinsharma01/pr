/*   Created by IntelliJ IDEA.
 *   Author: Nishant Mishra
 *   Date: 25-07-2020
 *   Time: 21:25
 *   File: LabTask1.java
 */
// 1. Create a program in Java that prints the following table.
package labTask;

public class LabTask1 {
    public static void main(String[] args) {
        System.out.printf("%-15s %-15s %-20s %-15s\n", "Data Types", "Size in bits" ,"Size in Bytes", "Range");
        System.out.printf("%-15s %-15d %-20d %-15s\n",      "byte",      Byte.SIZE,    Byte.BYTES,    "From " + Byte.MIN_VALUE+ " to " + Byte.MAX_VALUE);
        System.out.printf("%-15s %-15d %-20d %-15s\n",      "short",      Short.SIZE,    Short.BYTES,    "From " + Short.MIN_VALUE+ " to " + Short.MAX_VALUE);
        System.out.printf("%-15s %-15d %-20d %-15s\n",      "int",      Integer.SIZE,    Integer.BYTES,    "From " + Integer.MIN_VALUE+ " to " + Integer.MAX_VALUE);
        System.out.printf("%-15s %-15d %-20d %-15s\n",      "long",      Long.SIZE,    Long.BYTES,    "From " + Long.MIN_VALUE+ " to " + Long.MAX_VALUE);
        System.out.printf("%-15s %-15d %-20d %-15s\n",      "float",      Float.SIZE,    Float.BYTES,    "From " + Float.MIN_VALUE+ " to " + Float.MAX_VALUE);
        System.out.printf("%-15s %-15d %-20d %-15s\n",      "double",      Double.SIZE,    Double.BYTES,    "From " + Double.MIN_VALUE+ " to " + Double.MAX_VALUE);
        System.out.printf("%-15s %-15d %-20d %-15s\n",      "char",      Character.SIZE,    Character.BYTES,    "From " + Character.MIN_VALUE+ " to " + Character.MAX_VALUE);
        System.out.printf("%-15s %-15d %-20s %-20s\n",      "boolean",      1,    "not exactly defined",    "True or False");

    }
}

