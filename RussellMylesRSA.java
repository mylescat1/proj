/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author m
 */
public class RussellMylesRSA {
    
//-------- MAIN ---------------------------------------------------------------------------//    

   /**
     * MAIN RSA 
     * @param args
     */
     public static void main (String[] args){
            // test implementaion examples for gcd
            int e = 29;        
            int f = 30;
            int g = 149;
            int z = 288;
            
            testGcd(e, f, z);
            testXgcd(e, g, z);
    }


//-------- GCD ---------------------------------------------------------------------------//    
    /**
     *
     * Performs the Greatest Common Denominator (GCD) on two integer parameters
     *      gcd(a,b) = gcd(b, a mod b)
     * 
     * @param  inE        First integer input.  29     b
     * @param  inZ        Second integer input. 288    a
     * @return The GCD of the two integer inputs.
     *///                     b          a
    public static int gcd (int inE, int inZ) {
           
        int temp;
        int mod;

        System.out.println("(inZ,inZ mod inE) = (" + inZ + ", " + inE + ")");

        if (inE >= 0 && inZ >= 0) {
            do {
                mod = inZ%inE;      // mod = a mod b
                inZ = inE;          // a becomes b
                inE = mod;          // b becomes mod
              System.out.println("(inZ,inZ mod inE) = (" + inZ + ", " + inE + ")");
            } while (inE != 0);
            System.out.println("\tgcd = " + inZ + "\n");
        } else {
            System.out.println("CANNOT PERFORM GCD. "
                    + "Integers passed are less than 0.");
        }
        
        return 0;
    } //end gcd  
        
    
    /**
     * Outputs the Greatest Common Denominator (GCD) on two integer parameters
     * @param e
     * @param f
     * @param z
     */
    public static void testGcd(int e, int f, int z) {
            gcd(e, z);
            gcd(f, z);          
    } //end testGcd
    
    
//-------- XGCD ---------------------------------------------------------------------------//    
    
    /**
     *
     * Performs the Extended Euclidean Algorithm on two integer parameters
     *
     * @param  inE        First integer input.      29    b
     * @param  inZ        Second integer input.     288   a
     * @return The Extended Euclidean Algorithm of the two integer inputs.
     *///                        b        a
    public static int xgcd (int inE, int inZ) {
           
        int tempE = inE;
        int tempZ = inZ;
        int mod;
        int quo;
        int x1 = 1;         // x^-1
        int x0 = 0;         // x^0
        int y1 = 0;         // y^-1
        int y0 = 1;         // y^0
        int x = 0;
        int y = 0;           // x^1 , y^1


        System.out.println("(inZ,inZ mod inE) = (" + inZ + ", " + inE + ")");

        if (inE >= 0 && inZ >= 0) {
            do {
                mod = inZ%inE;              // mod = a mod b
                quo = (inZ - mod)/inE;      //obtains quotient: (a - r)/b

                if (mod != 0) {
                    //x
                    x = x1 - (quo * x0);        //x1 = x^-1
                    x1 = x0;                    //increment by 1
                    x0 = x;                     //increment by 1
                    //y
                    y = y1 - (quo * y0);        //y1 = y^-1
                    y1 = y0;                    //increment by 1
                    y0 = y;                     //increment by 1
                    
                    System.out.println("x = " + x + "\ny = " + y);
                }
                    //rotate through mod
                    inZ = inE;          // a becomes b
                    inE = mod;          // b becomes mod
                  System.out.println("(inZ,inZ mod inE) = (" + inZ + ", " + inE + ")");
            } while (inE != 0);
            
            //ax + by
            int eqToOne = (tempZ * x) + (tempE * y);
            int xgcd;
            
            System.out.println("\n(" + tempZ + " * " + x + ")" + " + (" + tempE + " * " + y + ") = " + eqToOne);
            
            if (eqToOne == 1) {
                if (y < 0) {
                    xgcd = tempZ + y; 
                    System.out.println("\txgcd = " + xgcd + "\n");

                } else {
                    xgcd = y % tempZ;
                    System.out.println("\txgcd = " + xgcd + "\n");
                }
            } else {
                System.out.println("XGCD NOT FOUND.");
            }
            
            
        } else {
            System.out.println("CANNOT PERFORM XGCD. "
                    + "Integers passed are less than 0.");
        }    
        
        return 0;
    } //end xgcd  
    
    /**
     * Outputs the Extended Euclidean Algorithm on two integer parameters
     */
    public static void testXgcd(int e, int f, int z) {
        // test implementaion examples for gcd
            xgcd(e, z);
            xgcd(f, z);           
    } //end textGcd
    
    
  //-------- KEYGEN ---------------------------------------------------------------------------//    
     
    /**
     *
     * Performs the RSA key generation
     *
     * @param  inP        First integer input.
     * @param  inQ        Second integer input.
     * @param  inE        Third integer input.
     * returns The key of the three integer inputs (e, N, d).
     */
    public int keygen (int inP, int inQ, int inE) {
           System.out.println("key: ");  
        return 0;
    } //end xgcd  
    
    
    
  //-------- ENCRYPT ---------------------------------------------------------------------------//    
     
    /**
     *
     * Performs the RSA encryption
     *
     * @param  message        First integer input.
     * @param  inE        Second integer input.
     * @param  inP        Third integer input.
     * returns c = m^e mod N.
     */
    public int encrypt (int message, int inE, int inP) {
           System.out.println("key: ");  
        return 0;
    } //end encrypt  

        
  //-------- DECRYPT ---------------------------------------------------------------------------//    
     
    /**
     *
     * Performs the RSA encryption
     *
     * @param  ciphertext        First integer input.
     * @param  inD               Second integer input.
     * @param  inN               Third integer input.
     * returns c = m^e mod N.
     */
    public int Decrypt (int ciphertext, int inD, int inN) {
           System.out.println("key: ");  
        return 0;
    } //end decrypt  
    
 
//-------- testSubroutine ---------------------------------------------------------------------------//    

   /**
     * tests the RSA subroutine
     */
    public void testSubroutine() {
        // test implementaion examples for gcd
            int e = 29;        
            int f = 30;
            int z = 288;
            
            xgcd(e, z);
            System.out.println("xgcd: ");
            xgcd(f, z);
            System.out.println("xgcd: ");
            
    } //end textGcd
    
    
    
     

}
