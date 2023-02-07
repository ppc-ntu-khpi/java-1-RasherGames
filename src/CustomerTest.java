public class CustomerTest 
{
   public static void main(String args[]) {
        Customer customer1 = new Customer();
        customer1.setID(228);
        System.out.println("ID: " + customer1.getID());
        customer1.setTotal(66.6);
        System.out.println("Status: " + customer1.getIsNew());
        customer1.setIsNew(Boolean.FALSE);
        System.out.println("Total:: " + customer1.getTotal());
    }
}
