package org.example;

public class Course {

    private String name;
    private String coach;
    private String room;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", coach='" + coach + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
