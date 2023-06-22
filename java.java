class Power {
  public static void main(String[] args) {
      
    int base = 3, powerRaised = 4;
    int result = power(base, powerRaised);

    System.out.println(base + "^" + powerRaised + "=" + result);
  }

  public static int power(int base, int powerRaised) {
    if (powerRaised != 0) {

      // recursive call to power()
      return (base * power(base, powerRaised - 1));
    }
    else {
      return 1;
    }
  }
}
class Main {
  public static void main(String[] args) {

    String[] words = { "Ruby", "C", "Python", "Java" };

    for(int i = 0; i < 3; ++i) {
      for (int j = i + 1; j < 4; ++j) {

        if (words[i].compareTo(words[j]) > 0) {

          // swap words[i] with words[j[
          String temp = words[i];
          words[i] = words[j];
          words[j] = temp;
        }
      }
    }

    System.out.println("In lexicographical order:");

    for(int i = 0; i < 4; i++) {
      System.out.println(words[i]);
    }
  }
}
