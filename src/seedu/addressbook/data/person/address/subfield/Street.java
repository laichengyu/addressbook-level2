package seedu.addressbook.data.person.address.subfield;

/**
 * Represents a Person's address' street in the address book.
 * Guarantees: immutable;
 */
public class Street {

    public static final String EXAMPLE = "Clementi Ave 3";

    public final String value;
    
    public Street(String street) {
        this.value = street;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Street // instanceof handles nulls
                && this.value.equals(((Street) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
