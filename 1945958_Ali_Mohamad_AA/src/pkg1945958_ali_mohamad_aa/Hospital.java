package pkg1945958_ali_mohamad_aa;

import java.util.ArrayList;
import java.util.Collections;

class Hospital<E extends Person> implements Findable<E> {

    private String name;
    private ArrayList<E> people = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<E> getPeople() {
        return people;
    }

    public void addToPeople(E obj) {
        people.add(obj);
    }

    @Override
    public E find(int id) {
        for (int i = 0; i < people.size(); i++) {
            if (id == people.get(i).getId()) {
                return people.get(i);
            }
        }
        return null;
    }

    public void sort() {
        Collections.sort(people);
    }

}
