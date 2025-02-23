public class immutabilityproof {
    public static void main(String[] args) {
        String s = new String("Spring");
        System.out.println(s.hashCode());
        s = s.concat(" boot");
        System.out.println(s);
        System.out.println(s.hashCode());

        String s2 = new String("amit");
        String s1 = new String("amit");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
