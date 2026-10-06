class StringVsCharArray {
    public static void main(String[] args) {
        String strPwd = "password";
        char[] charPwd = {'p', 'a', 's', 's', 'w', 'o', 'r', 'd'};
        System.out.println("String password: " + strPwd);
        System.out.println("Char array password: " + charPwd);
        System.out.println("Char array password: " + new String(charPwd));
        for (char c : charPwd) {
            System.out.print(c);
        }   
    }
}