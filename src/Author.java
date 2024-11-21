import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firsName, String lastName) {
        this.firstName = firsName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        return this.lastName.equals(author.lastName) && this.firstName.equals(author.firstName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
