package JavaProgramming2.Part9.ClassInheritance.Warehousing;

public class ProductWarehouse extends Warehouse {
    private  String prductName;


    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        this.prductName=productName;
    }

    public String getName() {
        return this.prductName;
    }

    @Override
    public String toString() {
        return this.getName() +": "+ super.toString();
    }
}
