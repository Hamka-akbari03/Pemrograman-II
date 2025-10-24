package soal2;

public class Country {
    private String name;
    private String leadershipType;
    private String leaderName;
    private int independenceDay;
    private int independenceMonth;
    private int independenceYear;

    public Country(String name, String leadershipType, String leaderName, int day, int month, int year) {
        this.name = name;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
        this.independenceDay = day;
        this.independenceMonth = month;
        this.independenceYear = year;
    }

    public Country(String name, String leadershipType, String leaderName) {
        this.name = name;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
        this.independenceDay = 0;
        this.independenceMonth = 0;
        this.independenceYear = 0;
    }

    public String getName() {
        return name;
    }

    public String getLeadershipType() {
        return leadershipType;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public int getIndependenceDay() {
        return independenceDay;
    }

    public int getIndependenceMonth() {
        return independenceMonth;
    }

    public int getIndependenceYear() {
        return independenceYear;
    }

    public String getDisplayLeadership() {
        switch (this.leadershipType.toLowerCase()) {
            case "monarki":
                return "Raja";
            case "presiden":
                return "Presiden";
            case "perdana menteri":
                return "Perdana Menteri";
            default:
                return this.leadershipType.substring(0, 1).toUpperCase() + this.leadershipType.substring(1);
        }
    }
}
