package org.example;

public class Main {
    public static void main(String[] args) {
        AbstractPhone firstPhone = new TomasEdisonPhone(1879);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone videoPhone = new VideoPhone(2018);
        User user = new User("Андрей");
        //user.callAnotherUser(224466, firstPhone);
        //user.callAnotherUser(224466, phone);
        user.callAnotherUser(224466, videoPhone);
        firstPhone.ring(556677);
    }
}