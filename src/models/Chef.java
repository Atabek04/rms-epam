package models;

import java.util.List;

public class Chef {
    private int chefId;
    private String name;
    private List<String> specializations;

    public Chef(int chefId, String name, List<String> specializations) {
        this.chefId = chefId;
        this.name = name;
        this.specializations = specializations;
    }

    public int getChefId() {
        return chefId;
    }

    public String getName() {
        return name;
    }

    public List<String> getSpecializations() {
        return specializations;
    }

    public void conductClass() {
    }

    public void login(String username, String password) {
    }
}
