
/**
 * BRANCHED 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Food
{
    // For now, keep it to carbs, cals, and proteins; if possible we can add sugars and other nutrients in the future.
    protected byte carbs, proteins;
    protected short calories;
    
    
    public Food()
    {
        this.carbs = 0;
        this.calories = 0;
        this.proteins = 0;
    }
    
    public Food(int carbs, int cals, int proteins)
    {
        this.carbs = (byte) carbs;
        this.calories = (short) cals;
        this.proteins = (byte) proteins;
    }
    
    // Getters and Setters
    public byte getCarbs()
    {
        return this.carbs;
    }
    
    public byte getProtein()
    {
        return this.proteins;
    }
    
    public short getCalories()
    {
        return this.calories;
    }
    
    public void setCarbs(int c)
    {
        this.carbs = (byte) Math.abs(c);
    }
    
    public void setProteins(int p)
    {
        this.proteins = (byte) Math.abs(p);
    }
    
    public void setCalories(int cal)
    {
        this.calories = (short) Math.abs(cal);
    }
}
