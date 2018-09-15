public class Test{
    public static void main(String[] args) {
        IPerson person = new Person("vivek", "brampton");
        IPerson person2 = new HispanicPerson("Alkarim","Brampton");

        investigatePerson(person);
        investigatePerson(person2);
    }

    static void investigatePerson(IPerson person){
        System.out.println(person.getName());
        person.printDetails();
    }
}
