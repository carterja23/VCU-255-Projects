/* <Jamiel Carter>
 * <CMSC 255, Section: 002>
 * <Homework Assignment 1: NameArt>
 */
 
   /**************************************************************************************
  *    NameArt
  ************************************************************************************
  * Function:
  *    Prints 'Jamiel' in ascii art
  *--------------------------------------------------------------------------------------
  *    Input:
  *          Parameters - None
  * 
  *    Output:
  *          Return - None
  *         
  *                              
  *--------------------------------------------------------------------------------------  
  * 
  *    @author Jamiel Carter  01/26/2018
  *    @version CMCS 255 Section 2 Spring of 2018
  *************************************************************************************/ 
  
 public class NameArt 
{ // Start NameArt Class

   /**************************************************************************************
  *    printHeading Method
  ************************************************************************************
  * Function:
  *   Prints header for program to console
  *--------------------------------------------------------------------------------------
  *    Input:
  *          Parameters - None
  *    Output:
  *          Return - None
  *-------------------------------------------------------------------------------------*/
  private static void printHeading()
  { // Begin printHeading
   System.out.println(" ");
   System.out.println("<Jamiel Carter>");
   System.out.println("<CMCS 255, Section: 002>");
   System.out.println("<NameArt>");
   System.out.println("<Homework 1>");
  } // End printHeading
  
   /**************************************************************************************
  *    main Method
  ************************************************************************************
  * Function:
  *   Prints 'Jamiel' in ascii to console
  *--------------------------------------------------------------------------------------
  *    Input:
  *          Parameters - None
  *    Output:
  *          Return - None
  *-------------------------------------------------------------------------------------*/
  
  public static void main(String[] args)
  { // Begin main  
   printHeading();
   
   System.out.println("       _                 _      _ ");
   System.out.println("      | |               (_)    | |");
   System.out.println("      | | __ _ _ __ ___  _  ___| |");
   System.out.println("  _   | |/ _` | '_ ` _ \\| |/ _ \\ |");
   System.out.println(" | |__| | (_| | | | | | | |  __/ |");
   System.out.println("  \\____/ \\__,_|_| |_| |_|_|\\___|_|");
  } // End main
 } // End NameArt Class