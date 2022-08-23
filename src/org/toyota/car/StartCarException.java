package org.toyota.car;

public class StartCarException extends Exception { //наследуемся от Exception, чтобы был доступ к конструкторы с message
    public StartCarException() {
    }

    public StartCarException(String message) {
        super(message);
    } //конструктор через alt+enter
}
//так как у нас теперь есть контструктор с message, то мы теперь можем выводить сообщения на экран