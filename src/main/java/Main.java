/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scanner = new Scanner(System.in);
      int choice = 0;
      

      while (choice != 3) {
        System.out.println("Wybierz opcje:");
        System.out.println("1. Dodaj studenta");
        System.out.println("2. Wyswietl studentow");
        System.out.println("3. Wyjscie z programu");
        System.out.print("Wybierz opcje: ");
        choice = scanner.nextInt();

        switch (choice) {
          case 1:
            System.out.print("Podaj imie studenta: ");
            String newName = scanner.next();

            System.out.print("Podaj nazwisko studenta: ");
            String newNazwisko = scanner.next();
            
            System.out.print("Podaj wiek studenta: ");
            int newAge = scanner.nextInt();
            s.addStudent(new Student(newName,newNazwisko, newAge));
            break;
            
          case 2:
            var students = s.getStudents();
            for (Student current : students) {
              System.out.println(current.ToString());
            }
            break;
          case 3:
            
            System.out.println("Koniec.");
            break;
          default:
            System.out.println("Wybierz jeszcze raz");
            break;
        }
      }
    } catch (IOException e) {
      // Handle IOException
    }
  }
}