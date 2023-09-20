package session2.D_Constructors.exercise;

import feedback.Feedback;

import java.util.Objects;

/**
 * Exercise:
 *  * Now a Person can have a first name, a last name and, optionally, a middle name.
 *  a) Create two constructors for this class.
 *      * A constructor to create Person objects with middle name.
 *      * A constructor to create Person objects without middle name.
 *  b) Add a method that return true/false to indicate if the person has or does not have a middle name.
 *  c) Add a method that outputs the person's information as a string formatted as:
 *      * E.g. ”Anders, Madsen” if there is no middle name.
 *      * E.g. ”Anders, M., Madsen” if there is a middle name.
 **/
class Person {

    String firstName;

    String middleName;
    String lastName;


    Person(String fn, String mn, String ln) {
        this.firstName = fn;
        this.middleName = mn;
        this.lastName = ln;
    }
    Person(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    boolean hasMiddleName() { return this.middleName != null;}

    void information() {
        if (this.hasMiddleName()) {
            System.out.println(this.firstName + ", " + this.middleName.substring(0,1) +"., " + this.lastName);
        }
        else {
            System.out.println(this.firstName + ", " + this.lastName);
        }
    }


    public static void main(String[] args) {

        //Create the object
        Person person = new Person("Anders", "Madsen", "Madsen");
        System.out.println("Has middle name: " + person.hasMiddleName());
        person.information();

        //String out = person.toStringOutput();
        //System.out.println(out);


        Person person2 = new Person("Anders", "Madsen");


        System.out.println("Has middle name: " + person2.hasMiddleName());
        person2.information();

        //String out2 = person2.toStringOutput();
        //System.out.println(out2);

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/


        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session2_D_Constructors", I_did_finish, I_did_understand, comment);


    }
}
