package meetingrooms;

import java.util.Scanner;

public class Controller {

    private final Office office = new Office();

    public void readOffice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a rögzítendő tárgyalók számát:");
        int numberOfMeetingRooms = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfMeetingRooms; i++) {
            System.out.println("Tárgyaló neve:");
            String nameOfMeetingRoom = scanner.nextLine();

            System.out.println("Tárgyaló szélessége méterben:");
            int widthOfMeetingRoom = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Tárgyaló hosszúsága méterben:");
            int lengthOfMeetingRoom = scanner.nextInt();
            scanner.nextLine();

            MeetingRoom meetingRoom = new MeetingRoom(nameOfMeetingRoom, lengthOfMeetingRoom, widthOfMeetingRoom);
            office.addMeetingRoom(meetingRoom);
        }
        System.out.println(Office.getMeetingRooms());
    }

    public void printMenu() {
        System.out.println("" +
                "1. Tárgyalók sorrendben\n" +
                "2. Tárgyalók visszafelé sorrendben\n" +
                "3. Minden második tárgyaló\n" +
                "4. Területek\n" +
                "5. Keresés pontos név alapján\n" +
                "6. Keresés névtöredék alapján\n" +
                "7. Keresés terület alapján");
    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem, adja meg a választott menü számát:");
        int menuChoosen = scanner.nextInt();
        scanner.nextLine();

        if (menuChoosen == 1) {
            Office.printNames();
        }
        if (menuChoosen == 2) {
            office.printNamesReverse();
        }
        if (menuChoosen == 3) {
            office.printEvenNames();
        }
        if (menuChoosen == 4) {
            office.printAreas();
        }
        if (menuChoosen == 5) {
            office.printMeetingRoomsWithName();
        }
        if (menuChoosen == 6) {
            office.printMeetingRoomsContains();
        }
        if (menuChoosen == 7) {
            System.out.println("Mekkoránál nagyobbat keres?");
            int areaRequested = scanner.nextInt();
            scanner.nextLine();
            office.printAreasLargerThan(areaRequested);
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
    }
}
