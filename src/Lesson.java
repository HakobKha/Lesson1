import java.util.Arrays;

public class Lesson {
    public static void main(String[] args) {
        /**---------------haytararelu tex-------------**/
        int a = 210, b = 411, c = 611, d = 8;
        /**---------------haytararelu tex-------------**/
        //23//33
        System.out.print("22,33: ");
        if (a == 1 || b == 1 || c == 1 || d == 1) {
            System.out.println(true);
        } else System.out.println(false);
        //24
        System.out.print("24: ");
        if (a == 2 && b == 2 || a == 2 && c == 2 || b == 2 && c == 2) {
            System.out.println(true);
        } else System.out.println(false);
        //25
        System.out.print("25: ");
        if (a + b > c && a + c > b && c + b > a) {
            System.out.println("y=1");
        } else System.out.println("y=2");
        //26
        System.out.print("26: ");
        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            System.out.println(1);
        } else System.out.println(2);
        //27//37
        System.out.print("27,37: ");
        if (d - c == c - b && c - b == b - a) {
            System.out.println(true);
        } else System.out.println(false);
        //28//38
        System.out.print("28,38: ");
        /**---------------haytararelu tex-------------**/
        double e = 4, f = 8, g = 16, h = 32;
        /**---------------haytararelu tex-------------**/
        if (h / g == g / f && g / f == f / e) {
            System.out.println(true);
        } else System.out.println(false);
        //29
        System.out.print("29: ");
        if ((a < b && a < c) && b < c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if ((a < b && a < c) && c < b) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        } else if ((b < a && b < c) && a < c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if ((b < a && b < c) && c < a) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if ((b < a && b < c) && c < a) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if ((c < a && c < b) && b < a) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        } else if ((c < a && c < b) && a < b) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
        //30
        System.out.print("30: ");
        if ((a > b && a > c) && b > c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if ((a > b && a > c) && c > b) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        } else if ((b > a && b > c) && a > c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if ((b > a && b > c) && c > a) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if ((b > a && b > c) && c > a) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if ((c > a && c > b) && b > a) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        } else if ((c > a && c > b) && a > b) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
        //31
        System.out.print("31: ");
        if (a > b && a > c && a > d) {
            System.out.println(a);
        } else if (b > a && b > c && b > d) {
            System.out.println(b);
        } else if (c > b && c > a && c > d) {
            System.out.println(c);
        } else System.out.println(d);
        //32
        System.out.print("32: ");
        if (a < b && a < c && a < d) {
            System.out.println(a);
        } else if (b < a && b < c && b < d) {
            System.out.println(b);
        } else if (c < b && c < a && c < d) {
            System.out.println(c);
        } else System.out.println(d);
        //34
        System.out.print("34: ");
        if (a + b == c + d || a + c == b + d || b + c == a + d) {
            System.out.println(true);
        } else System.out.println(false);
        //35
        System.out.print("34: ");
        if (a == b + c + d || b == a + c + d || c == a + b + c || d == a + b + c) {
            System.out.println(true);
        } else System.out.println(false);
        //36
        System.out.print("36: ");
        if (a % 2 != 0 || b % 2 != 0 || c % 2 != 0 || d % 2 != 0) {
            System.out.println(1);
        } else System.out.println(2);
        //39
        System.out.print("39: ");
        if ((a < b && a < c && a < d) && (b < c && b < d) && c < d) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        } else if ((a < b && a < c && a < d) && (b < c && b < d) && d < c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(d);
            System.out.println(c);
        } else if ((a < b && a < c && a < d) && (c < b && c < d) && b < d) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
            System.out.println(d);
        } else if ((a < b && a < c && a < d) && (c < b && c < d) && d < b) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(d);
            System.out.println(b);
        } else if ((a < b && a < c && a < d) && (d < b && d < c) && b < c) {
            System.out.println(a);
            System.out.println(d);
            System.out.println(b);
            System.out.println(c);
        } else if ((a < b && a < c && a < d) && (d < b && d < c) && c < b) {
            System.out.println(a);
            System.out.println(d);
            System.out.println(c);
            System.out.println(b);
        } else if ((b < a && b < c && b < d) && (a < c && a < d) && c < d) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
            System.out.println(d);
        } else if ((b < a && b < c && b < d) && (a < c && a < d) && d < c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(d);
            System.out.println(c);
        } else if ((b < a && b < c && b < d) && (c < a && c < d) && a < d) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
            System.out.println(d);
        } else if ((b < a && b < c && b < d) && (c < a && c < d) && d < a) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(a);
        } else if ((b < a && b < c && b < d) && (d < a && d < c) && a < c) {
            System.out.println(b);
            System.out.println(d);
            System.out.println(a);
            System.out.println(c);
        } else if ((b < a && b < c && b < d) && (d < a && d < c) && c < a) {
            System.out.println(b);
            System.out.println(d);
            System.out.println(c);
            System.out.println(a);
        } else if ((c < b && c < a && c < d) && (b < a && b < d) && a < d) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
            System.out.println(d);
        } else if ((c < b && c < a && c < d) && (b < a && b < d) && d < a) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(d);
            System.out.println(a);
        } else if ((c < b && c < a && c < d) && (a < b && b < d) && b < d) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
            System.out.println(d);
        } else if ((c < b && c < a && c < d) && (a < b && b < d) && d < b) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(d);
            System.out.println(b);
        } else if ((c < b && c < a && c < d) && (d < b && d < a) && b < a) {
            System.out.println(c);
            System.out.println(d);
            System.out.println(b);
            System.out.println(a);
        } else if ((c < b && c < a && c < d) && (d < b && d < a) && a < b) {
            System.out.println(c);
            System.out.println(d);
            System.out.println(a);
            System.out.println(b);
        } else if ((d < b && d < c && d < a) && (b < c && b < a) && c < a) {
            System.out.println(d);
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if ((d < b && d < c && d < a) && (b < c && b < a) && a < c) {
            System.out.println(d);
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if ((d < b && d < c && d < a) && (c < b && c < a) && b < a) {
            System.out.println(d);
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else if ((d < b && d < c && d < a) && (c < b && c < a) && a < b) {
            System.out.println(d);
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else if ((d < b && d < c && d < a) && (a < b && d < c) && b < c) {
            System.out.println(d);
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if ((d < b && d < c && d < a) && (a < b && d < c) && c < b) {
            System.out.println(d);
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }
        //40
        System.out.print("40: ");
        if ((a > b && a > c && a > d) && (b > c && b > d) && c > d) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        } else if ((a > b && a > c && a > d) && (b > c && b > d) && d > c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(d);
            System.out.println(c);
        } else if ((a > b && a > c && a > d) && (c > b && c > d) && b > d) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
            System.out.println(d);
        } else if ((a > b && a > c && a > d) && (c > b && c > d) && d > b) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(d);
            System.out.println(b);
        } else if ((a > b && a > c && a > d) && (d > b && d > c) && b > c) {
            System.out.println(a);
            System.out.println(d);
            System.out.println(b);
            System.out.println(c);
        } else if ((a > b && a > c && a > d) && (d > b && d > c) && c > b) {
            System.out.println(a);
            System.out.println(d);
            System.out.println(c);
            System.out.println(b);
        } else if ((b > a && b > c && b > d) && (a > c && a > d) && c > d) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
            System.out.println(d);
        } else if ((b > a && b > c && b > d) && (a > c && a > d) && d > c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(d);
            System.out.println(c);
        } else if ((b > a && b > c && b > d) && (c > a && c > d) && a > d) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
            System.out.println(d);
        } else if ((b > a && b > c && b > d) && (c > a && c > d) && d > a) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(a);
        } else if ((b > a && b > c && b > d) && (d > a && d > c) && a > c) {
            System.out.println(b);
            System.out.println(d);
            System.out.println(a);
            System.out.println(c);
        } else if ((b > a && b > c && b > d) && (d > a && d > c) && c > a) {
            System.out.println(b);
            System.out.println(d);
            System.out.println(c);
            System.out.println(a);
        } else if ((c > b && c > a && c > d) && (b > a && b > d) && a > d) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
            System.out.println(d);
        } else if ((c > b && c > a && c > d) && (b > a && b > d) && d > a) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(d);
            System.out.println(a);
        } else if ((c > b && c > a && c > d) && (a > b && b > d) && b > d) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
            System.out.println(d);
        } else if ((c > b && c > a && c > d) && (a > b && b > d) && d > b) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(d);
            System.out.println(b);
        } else if ((c > b && c > a && c > d) && (d > b && d > a) && b > a) {
            System.out.println(c);
            System.out.println(d);
            System.out.println(b);
            System.out.println(a);
        } else if ((c > b && c > a && c > d) && (d > b && d > a) && a > b) {
            System.out.println(c);
            System.out.println(d);
            System.out.println(a);
            System.out.println(b);
        } else if ((d > b && d > c && d > a) && (b > c && b > a) && c > a) {
            System.out.println(d);
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if ((d > b && d > c && d > a) && (b > c && b > a) && a > c) {
            System.out.println(d);
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if ((d > b && d > c && d > a) && (c > b && c > a) && b > a) {
            System.out.println(d);
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else if ((d > b && d > c && d > a) && (c > b && c > a) && a > b) {
            System.out.println(d);
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else if ((d > b && d > c && d > a) && (a > b && d > c) && b > c) {
            System.out.println(d);
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        } else if ((d > b && d > c && d > a) && (a > b && d > c) && c > b) {
            System.out.println(d);
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }
        //51
        System.out.print("51: ");
        boolean t;
        int x, y, z;
        /**---------------haytararelu tex-------------**/
        int o = 225;
        /**---------------haytararelu tex-------------**/
        x = o / 100;
        y = (o / 10) % 10;
        z = o % 10;
        if (z == x + y) {
            t = true;
            System.out.println(t);
        } else {
            t = false;
            System.out.println(t);
        }
        //52
        System.out.print("52: ");
        if (x == y || x == z || z == y) {
            t = true;
            System.out.println(t);
        } else {
            t = false;
            System.out.println(t);
        }
    }
}
//ete ekelea 2,4,6 tpelua dasi enq... ete ekela 1,3,5 tpeluya dasi chenq... ete ekela 7 tpeluya dasi chenq...
// ete 07ic mec tpeluya shabatva ytenc or chka