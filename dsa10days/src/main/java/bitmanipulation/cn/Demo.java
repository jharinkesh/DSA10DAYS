package bitmanipulation.cn;

import java.io.Reader;
import java.util.function.Supplier;

interface i1 {

  public int add(Integer x);
}


public class Demo {

  Supplier x;


  static void s(Integer s) {
    System.out.println("s");
  }

  static void s(long s) {
    System.out.println("s2");
  }

  Reader p;


  static boolean isInt(String s) {
    try {
      Integer.parseInt(s);
    } catch (Exception e) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {

    byte b = 25;
    //System.out.println(b);

    // s(5);

    // Scanner sc = new Scanner(System.in);
    // String cmd = sc.nextLine();
    // String ls = cmd;

    // while (isInt(cmd) || cmd.equals("insert") || cmd.equals("retrieve")) {
    // if (isInt(cmd)) {
    // System.out.println("calling method for: " + ls);
    // }
    //
    // ls = cmd;
    // cmd = sc.nextLine();
    // }

    // i1 d = ((Integer x) -> return x * x);

    // List<String> ls = Arrays.asList("a","b","c");
    // Integer ic = 0;
    // ls.stream().forEach(i->{ ic++;});

    // List<Integer> ls = Arrays.asList(1, 2, 3);
    // // List<Integer> lst = ls.stream().filter(i->i == 0).collect(Collectors.toList());
    // Object obj = null;
    // Optional.of(obj);


    // System.out.println(7 << 1);
    // int x = 0b1001;
    // int k = 3;
    // System.out.println(x & (1 << (k - 1)));
    // List<?> s = new ArrayList<Integer>();
    // s.add(e)
    // new Stream();

    // List<Integer> ls = Stream.of(2,3,4)
    // .forEach(System.out:: println)
    // .collect(Collectors.toList());



  }
}
