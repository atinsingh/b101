public interface IPerson {
    /**
     * This method should return name of the person
     * @return
     */
    default String getName(){
     return "Vivek";
    }
    void setName(String name);
    void changeAddress(String address);
    void printDetails();
}

