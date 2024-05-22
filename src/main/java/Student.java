public class Student {

  private String Name;
  private String Nazwisko;
  private int Datadzien;
  private int Datamiesiac;
  private int Datarok;

  private int Age;

  public Student(String name, String nazwisko, int age, int datadzien, int datamiesiac, int datarok) {
    Name = name;
    Nazwisko = nazwisko;
    Age = age;
    Datadzien = datadzien;
    Datamiesiac = datamiesiac;
    Datarok = datarok;
  }

  public String GetName() {
    return Name;
  }

  public String GetNazwisko() {
    return Nazwisko;
  }

  public int GetDatadzien() {
    return Datadzien;
  }

  public int GetDatamiesiac() {
    return Datamiesiac;
  }

  public int GetDatarok() {
    return Datarok;
  }

  public int GetAge() {
    return Age;
  }

  public String ToString() {
    return Name + " " + Nazwisko + " " + ((Integer.toString(Age) != null) ? Integer.toString(Age) : "") + " "
        + ((Integer.toString(Datadzien) != null) ? (Integer.toString(Datadzien) + "-") : "")
        + ((Integer.toString(Datamiesiac) != null) ? (Integer.toString(Datamiesiac) + "-") : "")
        + ((Integer.toString(Datarok) != null) ? Integer.toString(Datarok) : "");
  }

  public static Student Parse(String str) {
    try {
      String[] data = str.split(" ");
      if (data.length != 6) {
        return new Student("Parse Error", "Parse Error", -1, -1, -1, -1);
      }
      return new Student(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]),
          Integer.parseInt(data[4]), Integer.parseInt(data[5]));
    } catch (Exception e) {
      return new Student("Parse Error", "Parse Error", -1, -1, -1, -1);
    }
  }
}