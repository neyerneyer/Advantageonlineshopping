package co.com.tyba.reto.advantageonlineshopping.models;

public class ModeloContacto {
    private final String category;
    private final String product;
    private final String email;
    private final String subject;

    public ModeloContacto(String category, String product, String email, String subject) {
        this.category = category;
        this.product = product;
        this.email = email;
        this.subject = subject;
    }

    public String getCategory() {
        return category;
    }

    public String getProduct() {
        return product;
    }

    public String getEmail() {
        return email;
    }

    public String getSubject() {
        return subject;
    }
}
