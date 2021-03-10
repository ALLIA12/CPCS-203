package pkg1945958_ali_mohamad_aa;

class Patient extends Person {

    private String phoneN;

    public Patient(String phoneN, int id, String name) {
        super(id, name);
        this.phoneN = phoneN;
    }

    public String getPhoneN() {
        return phoneN;
    }

    public void setPhoneN(String phoneN) {
        this.phoneN = phoneN;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + super.getId() + ", name=" + super.getName() + ",phoneN=" + phoneN + '}';
    }

}
