package org.example;

public class TomasEdisonPhone extends AbstractPhone{
    public TomasEdisonPhone(int year){
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Врвщайте ручку");
        System.out.println("Сообщите номер абонента, сэр");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит");
    }
}
