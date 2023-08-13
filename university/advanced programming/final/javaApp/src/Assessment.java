public class Assessment {
    private String name;
    private double mark;

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(double mark) {
        if(mark>=0 &&mark<=100) {
            this.mark = mark;
        }
        else{
            System.out.println("Invalid mark it will be automatically assigned to 50");
            this.mark=50;
        }
    }

    public Assessment(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }
    public Assessment(){

    }
}
