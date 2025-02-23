package JavaProgramming2.Part9.ClassInheritance.Warehousing;

public class ProductWarehouseWithHistory extends  ProductWarehouse{

    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName,capacity);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }
    public String history(){
        return changeHistory.toString();
    }

}
