import java.util.*;
class Main{
    public static void main(String[] args) {
        List<Integer> st = new ArrayList();
        st.add(12);
        st.add(14);
        st.add(15);
        st.add(16);
        st.add(17);
        st.add(17);
        Iterator a = st.iterator();
        while (a.hasNext()){
            System.out.print(a.next()+" ");
        }

        System.out.println("\n*********");

        Set str = new HashSet(st);
       // str.add(st);
        Iterator ab = str.iterator();
        while (ab.hasNext()) {
            System.out.print(ab.next()+" ");
        }
    }
}