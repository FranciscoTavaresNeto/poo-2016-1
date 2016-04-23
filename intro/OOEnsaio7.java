public class OOEnsaio7 {
  public static void main(String[] args) {
    Coordenada c1 = new Coordenada();
    c1.latitude = 10;
    c1.longitude = 20;
    System.out.println(c1 instanceof Object); // true
    System.out.println(c1 instanceof Coordenada); // true
    // Object:
    System.out.println(c1); // toString herdado de Object
    Coordenada c2 = new Coordenada();
    c2.latitude = 10;
    c2.longitude = 20;
    System.out.println(c1 == c2); // false
    System.out.println(c1.equals(c2)); // false (executa o ==)

  }
}
class Coordenada { // é filha de Object, é subclasse de Object
  double latitude, longitude;

  @Override
  public String toString() {
    return latitude + "° " + longitude + "°";
  }

  @Override
  public boolean equals(Object o) {
    //        c <-- Coordenada <- o -
    Coordenada c = (Coordenada) o;
    return this.latitude == c.latitude
        && this.longitude == c.longitude;
  }
}
