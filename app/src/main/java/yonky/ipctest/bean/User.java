package yonky.ipctest.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/4/14.
 */

public class User implements Serializable {
    private int userId;
    private String name;
    private boolean isMale;

    private static final long serialVersionUID = 1234;

    public User(int userId, String name, boolean isMale) {
        this.userId = userId;
        this.name = name;
        this.isMale = isMale;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
