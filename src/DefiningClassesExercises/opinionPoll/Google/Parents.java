package DefiningClassesExercises.opinionPoll.Google;

public class Parents {
    private String name;
    private String birthday;

    public Parents(String name, String birthday){
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s\n",name,birthday);
    }
}
