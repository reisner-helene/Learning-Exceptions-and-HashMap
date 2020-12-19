package Learning_exceptions;

public class Subject {

    private int id;
    private String name;
    private int STARTING_VALUE = 1001;

    public Subject(String name){
        this.name = name;
        int random = (int) (Math.random() * (100 - 0 + 1) + 0);
        String generatedID = "" + STARTING_VALUE + random;
        this.id = Integer.valueOf(generatedID);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        } 
        if (!(obj instanceof Subject)){
            return false;
        }

        Subject s = (Subject) obj;

        return id == s.getId();
    }

    @Override
    public String toString(){
        return "Name " + name + " ID " + id;
    }

}
