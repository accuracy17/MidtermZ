package design;

public abstract class AbstractEmployeeInfo implements Employee {

    public abstract void employeeTerm();

    public void Benifits(){
        System.out.println("A paid day off for good performance");
    }
    public void Regularity(){
        System.out.println("Very important to maintain the performance");
    }

}
