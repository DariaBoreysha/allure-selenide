package LESSONS;

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;

    private WeekDays(String mood){
        this.mood = mood;
    }

    public String getMood(){
        return mood;
    }
}
