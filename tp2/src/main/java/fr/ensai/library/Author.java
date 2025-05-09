package fr.ensai.library;

import java.util.Objects;

/**
 * Represents an Author.
 */
public class Author extends Person {

    // Attributes
    private String nationality;

    /**
     * Constructs a new Author object.
     */
    public Author(String name) {
        super(name, 0); // Assuming a default value of 0 for the int parameter
    }

    public String getName() {
        return this.name;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two authors are considered equal if their names are equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Author author = (Author) obj;
        return Objects.equals(name, author.name);
    }

    @Override
    public String toString() {
        return "Author " + name;
    }

}
