/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 * 
 * <TODO: add @author info here for all group-mates!>
 *
 *	@version 1.0
 **/

//TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountryOfOrigin() : String 
+ getBirthday() : int
+ getValidFromDate() : int
+ getExipirationDate() : int
+ getSex() : int

+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(ucisNumber : String) : void
+ setCountryOfOrigin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExipirationDate(expirationDate : int) : void
+ setSex(sex : int) : void

+ setAll(surname : String, givenName : String, ucisNumber : String, countryOfOrigin : String, birthday : int, validFromDate : int, expirationDate : int, sex : char) : void
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	//TODO: Declare the instance variables. 
    private String surname;
    private String givenName;
    private String uscisNumber;
    private String countryOfOrigin;
    private int birthday, validFromDate, expirationDate;
    private char sex;


	/***** ACCESSORS *****/
	//TODO: Write the getter for each instance variable. Remember to include documentation for each method.
	
	/**
	 * Returns surname of calling object
	 * 
	 * @return String representing surname
	 */
	public String getSurname() {
	    return this.surname;
	}
	
	public String getGivenName() {
        return this.givenName;
    }
    
    public String getUscisNumber() {
        return this.uscisNumber;
    }
    
    public String getCountryOfOrigin() {
        return this.countryOfOrigin;
    }
    
    public int getBirthday() {
        return this.birthday;
    }
    
    public int getValidFromDate() {
        return this.validFromDate;
    }
    
    public int getExpirationDate() {
        return this.expirationDate;
    }
    
    public char getSex() {
        return this.sex;
    }

	
	
	/***** MUTATORS *****/
	//TODO: Write the setter for each instance variable. Remember to include documentation for each method.
	
	/**
	 * Sets surname to parameter value of calling object
	 * 
	 * @param surname String representing last name, assume it exists and is valid
	 */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    
    public void setUscisNumber(String uscisNumber) {
        this.uscisNumber = uscisNumber;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
    
    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
    
    public void setValidFromDate(int validFromDate) {
        this.validFromDate = validFromDate;
    }
    
    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    public void setSex(char sex) {
        this.sex = sex;
    }
        
	//TODO: Write the setAll method. Remember to include documentation.
	
	/**
	 * sets all data for object
	 * 
	 * @param surname String representing lastName, assume it exists and is valid
	 * @param givenName String representing firstName, assume it exists and is valid
	 * @param ucisNumber String representing 3-part ucis number with dashes
	 * @param countryOfOrigin country name, assume valid country
	 * @param birthday Julian Day Number for birthday
	 * @param validFromDate Julian Day Number for valid from date
	 * @param expirationDate Julian Day Number for expiration date
	 * @param sex char representing sex
	 */
	public void setAll(String surname, String givenName, String uscisNumber, String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex) {
	    
	    this.setSurname(surname);
	    this.setGivenName(givenName);
	    this.setUscisNumber(uscisNumber);
	    this.setCountryOfOrigin(countryOfOrigin);
	    this.setBirthday(birthday);
	    this.setValidFromDate(validFromDate);
	    this.setExpirationDate(expirationDate);
	    this.setSex(sex);
	    
	}
	
	

}