public enum PaymentType {
CASH (" Cash    payment"), CARD (" Card payment"), BANK_TRANSFER (" Bank transfer"),
DIGITAL_WALLET (" Digital wallet payment");

private final String description ;

PaymentType ( String description ); public String getDescription ();
}
