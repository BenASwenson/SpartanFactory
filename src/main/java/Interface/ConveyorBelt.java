package Interface;

import org.example.*;

public class ConveyorBelt extends SpartanFactory{
    @Override
    public Spartan createSpartan(String type) {
        switch(type) {
            case "BusinessAnalyst":
                return new BusinessAnalyst();
            case "CSharp":
                return new CSharp();
            case "CSharpSDET":
                return new CSharpSDET();
            case "DataEngineer":
                return new DataEngineer();
            case "DevOps":
                return new DevOps();
            case "JavaDev":
                return new JavaDev();
            case "JavaSDET":
                return new JavaSDET();
            default:
                throw new IllegalArgumentException("Unknown Spartan");
        }
    }
}
