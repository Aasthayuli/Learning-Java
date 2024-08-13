public class demons_1010 {

    public static void main(String[] args) {
        int[] array = new int[3];
        try {
            for (int i = 0; i < 4; i++) {
                array[i] = i;
            }
            System.out.println(array);
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                System.out.println("fill in: " + e.fillInStackTrace());
                System.out.println("cause: " + e.getCause());
                System.out.println("local: " + e.getLocalizedMessage());
                System.out.println("message: " + e.getMessage());
                System.out.println("trace: " + e.getStackTrace());
                System.out.print("Printing stack trace: ");
                e.printStackTrace();// prints the stack trace automatically, no need to print it manually
                System.out.print("string: " + e.toString());// toString() is need to be printed coz it returns String
                                                            // type
                System.out.println();
                // printed just to inform , we have entered catch block
                System.out.println("oops! we went too far, better to go back to 0!");
                throw (Exception) new Exception("new exception user defined");
            } catch (Exception e1) {
                System.out.println("Exception in catch block: " + e1.getCause());
            }
        } finally {
            System.out.println(array);
            // method call to continue the program
        }
    }
}
/*
 * getStackTrace():
 * the output "trace: [Ljava.lang.StackTraceElement;@15db9742" is the result of
 * calling System.out.println(e.getStackTrace()) where e is a Throwable object
 * (such as an Exception or an Error).
 * 
 * The getStackTrace() method returns an array of StackTraceElement objects,
 * which is an object of type StackTraceElement[].
 * 
 * When you call System.out.println(e.getStackTrace()), Java calls the
 * toString() method on the StackTraceElement[] array.
 * 
 * The toString() method for an array in Java returns a string in the format
 * [type@hashCode], where:
 * 
 * type is the type of the array elements (in this case,
 * Ljava.lang.StackTraceElement;).
 * hashCode is the hash code of the array object (in this case, 15db9742).
 * So, the output [Ljava.lang.StackTraceElement;@15db9742 is simply the string
 * representation of the StackTraceElement[] array object, which is not very
 * informative.
 */

// you can create an exception with a cause, like this:
/*
 * try {
 * throw new Exception("outer exception", new Exception("inner exception"));
 * } catch (Exception e) {
 * System.out.println("cause: " + e.getCause());
 * }
 * 
 * output- cause: java.lang.Exception: inner exception
 */