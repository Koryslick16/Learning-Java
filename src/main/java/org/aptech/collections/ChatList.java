package org.aptech.collections;

public class ChatList {
    private int id;
    private String name;

    public ChatList(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Queue{" +
                " name='" + name + '\'' +
                '}';
    }
}
