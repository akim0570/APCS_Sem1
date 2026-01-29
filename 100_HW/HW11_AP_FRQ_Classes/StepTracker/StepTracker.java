public class StepTracker {

    private int minSteps;        
    private int totalSteps;       
    private int daysTracked;      
    private int activeDaysCount;  

    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
        this.daysTracked = 0;
        this.activeDaysCount = 0;
    }

    public void addDailySteps(int steps) {
        totalSteps += steps;   
        daysTracked++;         

        if (steps >= minSteps) {
            activeDaysCount++; 
        }
    }

  
    public int activeDays() {
        return activeDaysCount;
    }

  
    public double averageSteps() {
        if (daysTracked == 0) {
            return 0.0; 
        }
        return totalSteps / daysTracked;
    }
}