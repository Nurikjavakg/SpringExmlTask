package peaksoft;

public class Java implements Course{
    @Override
    public String toString() {
        return "Java{}";
    }

    @Override
    public void getGroupName() {
        System.out.println("Java10");
    }
}
