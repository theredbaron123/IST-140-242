/**
 * MusicStore
 */
public class MusicStore implements Measurable, Comparable<MusicStore> {

    private String storeName; 
    private Integer lessonCostPerHour; 
    private Integer violinsInInventory; 
    private Integer costs;
    private Integer revenue;
    
    public MusicStore (String storeName, Integer lessonCostPerHour, Integer violinsInInventory, Integer costs, Integer revenue)
    {
        this.storeName = storeName; 
        this.lessonCostPerHour = lessonCostPerHour; 
        this.violinsInInventory = violinsInInventory; 
        this.costs = costs; 
        this.revenue = revenue; 
    }

    public String getStoreName()
    {
        return this.storeName; 
    }

    public Integer getLessonCostPerHour()
    {
        return this.lessonCostPerHour; 
    }

    public Integer getViolinsInInventory()
    {
        return this.violinsInInventory; 
    }

    public Integer getCosts()
    {
        return this.costs; 
    }

    public Integer getRevenue()
    {
        return this.revenue; 
    }

    @Override
    public String toString()
    {
        return " Store name: " + this.storeName + " Lesson cost per hour: " + this.lessonCostPerHour
        + " Number of violins in inventory: " + this.violinsInInventory + " Costs: " + this.costs
        + " Revenue: " + this.revenue;
    }

    @Override
    public double calcLessonPrice()
    {
        double lessonPrice = BASE_LESSON_PRICE + lessonCostPerHour; 
        return lessonPrice; 
    }

    @Override
    public int findViolinsInInventory()
    {
        return violinsInInventory; 
    }

    @Override
    public double calcGrossProfit()
    {
        double grossProfit = revenue - costs; 
        return grossProfit; 
    }

    @Override
    public int compareTo(MusicStore musicStore)
    {
        int compare = this.lessonCostPerHour.compareTo(musicStore.lessonCostPerHour);
        return compare; 
    }
    
}