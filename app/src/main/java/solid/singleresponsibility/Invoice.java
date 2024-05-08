package solid.singleresponsibility;

public class Invoice {
    Marker marker;
    Integer quantity;

    public Invoice(Marker marker) {
        this.marker = marker;
    }
    float calculatePrice (Marker marker, Integer qty){
        return marker.getPrice()*qty;
    }
    void printInvoice(Marker marker, Integer price){
        // logic for invoice

        //here we can see this class is doing both calculating price and invoice , in future maintaining this
        //piece of code will be difficult and hence they both should be separated  (invoice and calculation)
    }
}
