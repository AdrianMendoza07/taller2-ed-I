public class cliente {

    private int id;
    private String name;
    private String lastName;
    private int phone;
    private boolean active;

    public void Usuario(int id, String name, String lastName, int phone, boolean active) {

        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.active = active;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public int getPhone(){
        return phone;
    }
    public boolean getActive(){
        return active;
    }

    public String toString(){
        return(id+","+ name+","+ lastName+","+ phone+","+ active);
    }
}