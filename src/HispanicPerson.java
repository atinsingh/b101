public class HispanicPerson implements IPerson {
    String name;
    String address;
    String ethinicity = "Hispanic";

    public HispanicPerson(String name, String address){
        this.address  = address;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name  = name;
    }

    @Override
    public void changeAddress(String address) {
            this.address  = address;
    }

    @Override
    public void printDetails() {
        System.out.println("Name is "+ name);
        System.out.println("Address is "+ address);
        System.out.println("Enthicity is "+ ethinicity);
    }
}
