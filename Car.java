package pratice;

public class Car{
  private int vehicalNumber;
  private String type;
  
  public Car(int vehicalNumber, String Type){
    this.vehicalNumber= vehicalNumber;
    this.type=type;
  }
  public void setNumber(int vehicleNumber){
    this.vehicleNumber= vehicleNumber;
  }
  
  public int getNumber(){
    return vehicleNumber;
  }

  public void setString(String type){
    this.type= type;
  }
  public String getString(){
    return type;
  }
}
