/**********************************************************                                                   *
 *  CSCI 502        Assignment 5           Fall 2018      *
 *                                                        *
 *  Developer:  Pooja Jangir, Z1831882                    *
 *                                                        *
 *  Due Date/Time:  10/15/2018, 11:59 PM                  *
 *                                                        *
 *  Purpose: Address Book Java Application                *
 *                                                        *
 **********************************************************/
public class AddressBookEntry            //class with constructor, instance variables, set and get methods
{
private String name;
private String email;                   //private instance variables name, email, cellnUmber declared as String type 
private String cellNumber;

AddressBookEntry(String name, String email, String cellNumber) //constructor with arguments of name, email, and cellNumber all of string type
{
  this.name = name;               //instatitaion of instance variables
  this.email =email;
  this.cellNumber = cellNumber;
}

public void setName(String name) //set method for name
{
  this.name = name;  //sets name value with passed argument value
}
public void setEmail(String email) //set method for email
{
  this.email = email; //sets email value with passed argument value
}
public void setCellNumber(String cellNumber) //set method for cellNumber
{
  this.cellNumber = cellNumber; //sets cellNumber value with passed argument value
}
public String getName()  //returns name
{
  return name;
}
public String getEmail()  //returns email
{
  return email;
}
public String getCellNumber() //returns cellNumber
{
  return cellNumber;
}
}
