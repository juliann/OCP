package de.gfn.ocp.aufgabe1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author tlubowiecki
 */
public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Kalender cal = new Kalender();

        app:
        while (true) {

            switch (getInput(scanner, "Eingabe:").toUpperCase()) {

                case "E": {
                    // TODO: Datum validieren
                    LocalDate datum = LocalDate.parse(getInput(scanner, "Datum:"), IOHelper.DATE_FORMAT);
                    LocalTime zeit = LocalTime.parse(getInput(scanner, "Zeit:"), IOHelper.TIME_FORMAT);
                    String titel = getInput(scanner, "Titel:");
                    String beschreibung = getInput(scanner, "Beschreibung:");
                    cal.addTermin(datum, new Termin(zeit, titel, beschreibung));
                }
                break;

                case "D": {
                        // TODO: Datum validieren
                        try {
                            LocalDate datum = LocalDate.parse(getInput(scanner, "Datum:"), IOHelper.DATE_FORMAT);
                            cal.showByDate(datum);
                        } catch (RuntimeException e) {
                            System.out.println("Keine Termine gefunden.");
                        }
                    }
                break;

                case "W":
                    try {
                        cal.showWeekByDate();
                    } catch (RuntimeException e) {
                        System.out.println("Keine Termine gefunden.");
                    }
                    break;

                case "X":
                    break app;

                default:
                    System.out.println("Falsche Eingabe.");
            }
        }

        System.out.println("Programmende.");
    }

    private static String getInput(Scanner s, String label) {
        System.out.print(label);
        return s.nextLine().trim();
    }
}
