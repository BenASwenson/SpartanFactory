# SpartanFactory

## A factory method design pattern to create a Spartan

#### The following Spartans are each given their own concrete classes to be instantiated:
- Java Developer
- Java SDET
- C# Developer
- C# SDET
- Data Engineer
- Business Analyst
- DevOps Engineer

#### The Spartan interface establishes the occupation, description, salary and coding language details which each concrete class seperately defines

#### The abstract Spartan factory establishes the createSpartan() method for the child class ConveyorBelt to implement.