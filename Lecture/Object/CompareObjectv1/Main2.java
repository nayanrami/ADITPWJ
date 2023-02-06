class Main2 {
    public static void main(String[] args) {
        String msg = "Welcome To ADIT";

        char om[] = msg.toCharArray();
        char cm[] = new char[om.length];

        for (int i = 0; i < om.length; i++) {
            char ch;
            if (Character.isLowerCase(om[i])) {
                ch = Character.toUpperCase(om[i]);
            } else {
                ch = Character.toLowerCase(om[i]);
            }
            cm[i] = ch;
        }
        String newmsg = String.valueOf(cm);
        System.out.println("Original Message : " + msg);
        System.out.println("New Message : " + newmsg);

        StringBuffer bf = new StringBuffer(newmsg);
        System.out.println(bf.reverse());
    }
}