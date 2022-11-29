package Interface;

public abstract class SpartanFactory {

    public Spartan makeSpartan(String type) {
        Spartan spartan = createSpartan(type);
        spartan.codingLanguage();
        spartan.description();
        spartan.occupation();
        spartan.salary();
        return spartan;

    }



    public abstract Spartan createSpartan(String type);

}
