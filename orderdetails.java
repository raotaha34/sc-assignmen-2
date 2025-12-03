public class OrderDetails {
// Private fields private String userName ; private int productId ; private int quantity ; private double price ; private String address;
private boolean urgentFlag ; private String notes; private LocalDate orderDate ;

//  Constructor
public OrderDetails( String userName , int productId ,
int quantity , double price ,
String address , boolean urgentFlag , String notes , LocalDate orderDate );

//  Getters
public String getUserName (); public int getProductId (); public int getQuantity (); public double getPrice (); public String getAddress (); public boolean isUrgentFlag (); public String getNotes ();
public LocalDate getOrderDate ();

// Business methods public boolean isValid ();
public double calculate Subtotal (); public String getFormatted Date ();
}
