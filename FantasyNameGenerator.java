import java.util.Random;
/**
 * Part - a
 * FantasyNameGenerator.
 * Creates fantasy names for gaming purposes, based on 
 * soem information about a person
 *
 * @author Marcel Gonzalez
 * @version 1.0 Wed 5 2022
 */

public class FantasyNameGenerator
{
    /**
     * Part - a
     * Fields for the FantasyNameGenerator class
     */
    private String name;
    private String place;
    private String animal;

    /**
     * Part - b
     * Constructor for objects of class FantasyNameGenerator
     * @param aName the user's name
     * @param aPlace the user's place of birth
     * @param anAnimal the user's favourite animal
     */
    public FantasyNameGenerator(String aName, String aPlace, String anAnimal)
    {
        // initialise instance variables
        name = aName.trim().toLowerCase();
        place = aPlace.trim().toLowerCase();
        animal = anAnimal.trim().toLowerCase();
    }

    /**
     * Part - c
     * Return a random value between 1 and 3 inclusive
     * 
     * @return a random int between 1 and 3 inclusive
     */
    public int ran3()
    {
        Random ran = new Random();
        return ran.nextInt(3) + 1;
    }
    
    /**
     * Part - c
     * generates a random number using ran3 and returns a String
     * that is a substring with that length from the beginning of the name field 
     */
    public String generateNameSubstring()
    {
        return name.substring(0, ran3());
    }
    
    /**
     * Part - c
     * A method that returns a substring of a place of a random length between 
     * 1 and 3 (inclusive) 
     */
    public String generatePlaceSubstring()
    {
        return place.substring(place.length() - ran3());
    }
    
    /**
     * Part - c 
     * A method that returns a substring of name of a random length
     * between 1 and 3 (inclusive) from the beginning of animal.
     *
     * @return a substring of between 1 and 3 of the initial
     * characters of the user's animal
     */
    public String generateAnimalSubstring()
    {
        return animal.substring(0, ran3());
    }
    
    /**
     * Part - d
     * A method that returns a single fantasy name string formed by
     * concatenating the three substrings.
     *
     * @return a single fantasy name string
     */
    public String generateFantasyName()
    {
        return generateNameSubstring() + generatePlaceSubstring() + generateAnimalSubstring();
    }
    
    /**
     * Part - e
     * Generate and print out the fantasy name.
     */
    public void printName()
    {
        System.out.println("Your fantasy name is " + generateFantasyName());
    }
    
    /**
     * Part - f
     * A method that puts together the three substrings in a permutation
     * picked at random and returns the resulting fantasy name.
     *
     * @return a fantasy name
     */
    public String generateFantasyName2()
    {
        String fantasyName = "";
        String na = generateNameSubstring();
        String pl = generatePlaceSubstring();
        String an = generateAnimalSubstring();
        
        Random ran = new Random();
        int permutation = ran.nextInt(6);
        
        switch (permutation)
        {
            case 0:
                fantasyName = an + na + pl;
                break;
            case 1:
                fantasyName = an + pl + na;
                break;
            case 2:
                fantasyName = pl + an + na;
                break;
            case 3:
                fantasyName = pl + na + an;
                break;
            case 4:
                fantasyName = na + an + pl;
                break;
            case 5:
                fantasyName = na + pl + an;
                break;
            default:
                System.out.println("Invalid fantasy name case");
        }
        return fantasyName;
    }
    
    /**
     * Part - g
     *  Returns a version of its String parameter where
     *  the first letter is capitalised while the other 
     *  letters remain as lower case.
     *
     * @param  aString a string that is to be capitalised.
     * @return the capitalised string.
     */
    public String capitalise(String cap)
    {
        return cap.substring(0, 1).toUpperCase() + cap.substring(1);
    }
    
    
    
    /**
     * Part - h
     * Generate and print out the permutated fantasy name
     * with the first letter capitalised.
     */
    public void printName2()
    {
        String fantasyName = "My fantasy name is "
            + capitalise(generateFantasyName2());
        System.out.println(fantasyName);
    }
    
}
