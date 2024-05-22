public class Student {

  private String Name;
  private String Nazwisko;
  private String Data;
  
  private int Age;

  public Student(String name, String nazwisko, int age, String data) {
    Name = name;
    Nazwisko = nazwisko;
    Age = age;
    Data = data;
  }

  public String GetName() {return Name;}
  public String GetNazwisko() {return Nazwisko;}
  public String GetData() {return Data;}
  
  public int GetAge() {return Age;}

  public String ToString() {
    return Name + " " + Nazwisko + " " + Integer.toString(Age) + " " + Data  ;
  }

  
  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error","Parse Error", -1, "Parse Error");
    return new Student(data[0],data[1], Integer.parseInt(data[2]), data[3]);
  }
}