package meetingrooms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Office {

    private static List<MeetingRoom> meetingRooms = new ArrayList<>();

    public static List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public static void setMeetingRooms(List<MeetingRoom> meetingRooms) {
        Office.meetingRooms = meetingRooms;
    }

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public static void printNames() {
        System.out.println("Tárgyalók sorrendben:");
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName());
        }
    }

    public void printNamesReverse() {
        System.out.println("Tárgyalók forditott sorrendben:");
        List<MeetingRoom> meetingRoomsReverse = new ArrayList<>();
        for (int i = meetingRooms.size() - 1; 0 <= i; i--) {
            meetingRoomsReverse.add(meetingRooms.get(i));
        }
        System.out.println(meetingRoomsReverse);
    }

    public void printEvenNames() {
        System.out.println("Minden második tárgyaló:");
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(meetingRooms.get(i).getName());
            }
        }
    }

    public void printAreas() {
        System.out.println("Területek:");
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println("Név: " + meetingRoom.getName() + ", szélesség: " + meetingRoom.getWidth() +
                    ", hosszúság: " + meetingRoom.getLength() + ", terület: " + meetingRoom.getArea());
        }
    }

    public void printMeetingRoomsWithName() {
        System.out.println("Keresés pontos név alapján:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem, adja meg a keresett tárgyaló nevét:");
        String nameOfMeetingRoom = scanner.nextLine();

        for (int i = 0; i < meetingRooms.size(); i++) {
            if (nameOfMeetingRoom.equals(meetingRooms.get(i).getName())) {
                System.out.println("Terem neve: " + meetingRooms.get(i).getName() + ", területe: " +
                        meetingRooms.get(i).getArea());
            }
        }
    }

    public void printMeetingRoomsContains() {
        System.out.println("Keresés névtöredék alapján:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem, adja meg a keresett tárgyaló nevének töredékét:");
        String partOfMeetingRoomName = scanner.nextLine();

        for (int i = 0; i < meetingRooms.size(); i++) {
            if (meetingRooms.get(i).getName().contains(partOfMeetingRoomName)) {
                System.out.println("Terem neve: " + meetingRooms.get(i).getName() + ", területe: " +
                        meetingRooms.get(i).getArea());
            }
        }
    }


    public void printAreasLargerThan(int area) {
        System.out.println("Keresés terület alapján");
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getArea() > area) {
                System.out.println(meetingRoom.getName() + " (" + meetingRoom.getWidth()
                        + " * " + meetingRoom.getLength() + " = " + meetingRoom.getArea() + ")");
            }
        }
    }
}
