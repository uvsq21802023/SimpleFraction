
class Fraction{

  Integer num;
  Integer denom;

  public Fraction(int num, int denom){
    this.num = num;
    this.denom = denom;
  }

  public String toString(){
    return num.toString() + " / " + denom.toString();
  }
}
