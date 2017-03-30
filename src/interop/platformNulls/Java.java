package interop.platformNulls;

class Java {
  public static void main(String[] args) {
    new Kotlin().hello(null);
  }
}

// What will it print?
// a) Hello
// b) Hello null
// c) NullPointerException
// d) IllegalArgumentException