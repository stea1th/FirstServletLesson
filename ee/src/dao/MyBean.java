package dao;

import javax.enterprise.context.*;

/**
 * бин для всех, для всего приложения
 */
//@ApplicationScoped
/**
 * бин для сессий, можно шарить его среди множества реквестов
 */
//@SessionScoped
/**
 * бин создается в реквесте
 * один бин на целый реквест
 */
@RequestScoped
/**
 * расскажет в следующем уроке
 */
//@ConversationScoped

/**
 * По умолчанию все бины такие
 * при вызове будут разные бины
 */
//@Dependent
public class MyBean {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
