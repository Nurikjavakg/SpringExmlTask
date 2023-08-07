package peaksoft;

public class Group {
    private Course course;
    private String name;

    public Group(Course course) {
        this.course = course;
    }

    public Group() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Group{" +
                "course=" + course +
                ", name='" + name + '\'' +
                '}';
    }
}
