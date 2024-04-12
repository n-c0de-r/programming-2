public class ArrayelementTest {
    public static void main(String[] args) {
        byte[] byteArray = new byte[] { 1, 2, 3, 4, 4, 5, 2, 2, 5, 5, 5, 5, 5 };
        byte[] häufigsteElemente = Arrayelement.haeufigstesElem(byteArray);
        for (byte elem : häufigsteElemente) {
            System.out.println(elem);
        }
    }
}
