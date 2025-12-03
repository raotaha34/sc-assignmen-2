public enum UserType {
REGULAR (1 , 5.0) ,
PREMIUM (2 , 10.0) ,
VIP (3 ,  15.0) ,
ADMIN (4 ,  20.0);

private final int code ;
private final double discountRate ;

UserType ( int code , double discountRate ); public int getCode ();
public double getDiscountRate ();
} 

