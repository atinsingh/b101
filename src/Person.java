public class Person implements IPerson {

    private String name;
    private String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }


    @Override
    public void setName(String name) {
            this.name= name;
    }

    @Override
    public void changeAddress(String address) {
            this.address = address;
    }

    @Override
    public void printDetails() {
        System.out.println("Name is :"+name);
        System.out.println("Address is :"+address);
    }
}
