public class Student {

  private String Name;
  private String Nazwisko;
  private String Datadzien;
  private String Datamiesiac;
  private String Datarok;
  
  private int Age;

  public Student(String name, String nazwisko, int age, String datadzien,String datamiesiac,String datarok) {
    Name = name;
    Nazwisko = nazwisko;
    Age = age;
    Datadzien = datadzien;
    Datamiesiac=datamiesiac;
    Datarok=datarok;
  }

  public String GetName() {return Name;}
  public String GetNazwisko() {return Nazwisko;}
  public String GetDatadzien() {return Datadzien;}
  public String GetDatamiesiac() {return Datamiesiac;}
  public String GetDatarok() {return Datarok;}
  
  public int GetAge() {return Age;}

  public String ToString() {
    return Name + " " + Nazwisko + " " + Integer.toString(Age) + " " + Datadzien + "-" + Datamiesiac + "-" + Datarok;  
  }

  
  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 6) 
      return new Student("Parse Error","Parse Error", -1, "Parse Error","Parse Error","Parse Error");
    return new Student(data[0],data[1], Integer.parseInt(data[2]), data[3],data[4],data[5]);
  }
}