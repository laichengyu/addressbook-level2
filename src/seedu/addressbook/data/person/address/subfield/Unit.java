package seedu.addressbook.data.person.address.subfield;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address' unit in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidUnit(String)}
 */
public class Unit {

    public static final String EXAMPLE = "#12-34";
    public static final String MESSAGE_UNIT_CONSTRAINTS =
            "Address unit should start with a '#' followed by two numbers separated by '-'";
    public static final String UNIT_VALIDATION_REGEX = "#\\d+-\\d+";

    public final String value;

    /**
     * Validates given address unit.
     *
     * @throws IllegalValueException if given address unit string is invalid.
     */
    public Unit(String unit) throws IllegalValueException {
        if (!isValidUnit(unit)) {
            throw new IllegalValueException(MESSAGE_UNIT_CONSTRAINTS);
        }
        this.value = unit;
    }

    /**
     * Returns true if the given string is a valid address unit.
     */
    public static boolean isValidUnit(String test) {
        return test.matches(UNIT_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Unit // instanceof handles nulls
                && this.value.equals(((Unit) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
