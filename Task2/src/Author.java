public class Author {
    private String name;
    private String email;
    private boolean isMale;

    Author(String name, String email, boolean isMale) {
        this.name = name;
        this.email = email;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        char gender = isMale ? 'М': 'Ж';
        return name + " (" + gender + ") " + email + "\n";
    }
}
