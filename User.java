
/**
 * User class holds the preferences of each 
 *
 * @authors (Hasith A, Eddie G, Guilherme O.)
 * @version (a version number or a date)
 */
public class User
{
    private char gender;
    private short currCalories, calorieGoal, weight; // weight in lbs.
    private String name;
    private byte age;
    
    public User()
    {
        this.gender = '?';
        this.name = "N/A";
        this.age = 0;
        this.currCalories = 0;
        this.calorieGoal = calcRecommendedCal();
        this.weight = 0;
    }
    
    public User(String name, char gender, int age, int calGoal, int weight)
    {
        this.name = name;
        this.gender = gender;
        this.age = (byte) age;
        this.calorieGoal = (short) calGoal;
        this.weight = (short) weight;
    }
    
    public short calcRecommendedCal()
    {
        float genderWeight = 312.65f;
        
        if (Character.toUpperCase(this.gender) == 'M')
        {
            genderWeight = 329.3f;
        }
        else if (Character.toUpperCase(this.gender) == 'F')
        {
            genderWeight = 296.1f;
        }
        
        return (short) (1.76 * (66.47 + (13.563 * (this.weight / 2.20462)) + genderWeight - (4.676 * this.age))); 
    }
}
