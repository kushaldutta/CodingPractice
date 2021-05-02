// practice of using methods by comparing NBA players

public class PlayerStats {
    double height, weight;
    String name;
    int careerPointsZion = 2132;
    int careerReboundsZion = 571;
    int careerAssistsZion = 268;

    int pointsCompared, assistsCompared, reboundsCompared;
    
    public PlayerStats(String nameFull, double heightCm, double weightKg) {
        name = nameFull;
        height = heightCm;
        weight = weightKg;
    }
    
    public void bmi() {
        double bmi = (weight / height / height) * 10000;
        System.out.printf(name + "'s bmi is %.2f\n", bmi);
    }
    
    public void stats(int points, int rebounds, int assists) {
        pointsCompared = points - careerPointsZion;
        assistsCompared = assists - careerAssistsZion;
        reboundsCompared = rebounds - careerReboundsZion;
        System.out.println(name + " has " + pointsCompared + " more points, " + reboundsCompared 
                + " more rebounds, and " + assistsCompared + " more assists than Zion in his career\n");
    }
    
    public static void main(String[] args) {
        PlayerStats zion = new PlayerStats("Zion Williamson", 200.66, 127.006);
        zion.bmi();    
        zion.stats(2132, 571, 268);
        
        PlayerStats durant = new PlayerStats("Kevin Durant", 208.28, 108.862);
        durant.bmi();    
        durant.stats(23686, 6172, 3629);
        
        PlayerStats lebron = new PlayerStats("LeBron James", 205.74, 113.398);
        lebron.bmi();    
        lebron.stats(35299, 9736, 9676);
        
        
    }
}