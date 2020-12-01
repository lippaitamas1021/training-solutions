package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {

    public List<week02.MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(week02.MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        System.out.println("printNames");
        for (week02.MeetingRoom meetingRoom: meetingRooms) {
            System.out.println(meetingRoom.getName());
        }
    }



    public void printAreasLargerThan(int area) {
        System.out.println("printAreasLargerThan");
        for (week02.MeetingRoom meetingRoom: meetingRooms) {
            if (meetingRoom.getArea() > area) {
                System.out.println(meetingRoom.getName() +" (" + meetingRoom.getWidth()
                        + " * "  + meetingRoom.getLength() + " = " + meetingRoom.getArea() + ")");
            }
        }
    }

    public List<week02.MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public void setMeetingRooms(List<week02.MeetingRoom> meetingRooms) {
        this.meetingRooms = meetingRooms;
    }

}