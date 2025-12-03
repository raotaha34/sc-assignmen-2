public class OrderProcessor {
//  Dependencies
private Logger logger;
private  PaymentHandler  paymentHandler ;
private DiscountCalculator discountCalculator ; private  Shipping Calculator  shipping Calculator ;

//  Constructor
public  OrderProcessor ( Logger  logger ,
PaymentHandler paymentHandler , DiscountCalculator discountCalculator , Shipping Calculator shipping Calculator );

//  Public  API
public  OrderResult  processOrder( OrderDetails  orderDetails ,
UserType  userType );

// Private helper methods private void
private void private void validate Order( OrderDetails  orderDetails);
private void  apply UrgentHandling ( OrderDetails orderDetails); 
private void generate OrderReport ( OrderDetails orderDetails ,double total);
private void save OrderTo File ( OrderDetails orderDetails ,double total);
}
