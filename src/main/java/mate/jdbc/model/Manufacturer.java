package mate.jdbc.model;

public class Manufacturer {
    private Long id;
    private String name;
    private String country;
    private boolean isDeleted;

    public Manufacturer() {
    }

    public Manufacturer(Long id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public Manufacturer(Long id, String name, String country, boolean isDeleted) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.isDeleted = isDeleted;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    @Override
    public String toString() {
        return "Manufacturer{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", country='" + country + '\''
                + ", isDeleted=" + isDeleted
                + '}';
    }
}
