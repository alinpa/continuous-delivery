package org.terra.bs.entities;

// Generated Apr 25, 2014 12:34:44 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BookAuthor generated by hbm2java
 */
@Entity
@Table(name = "BOOK_AUTHOR")
public class BookAuthor implements java.io.Serializable {

    private BookAuthorId id;

    public BookAuthor() {
    }

    public BookAuthor(BookAuthorId id) {
        this.id = id;
    }

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "authorId", column = @Column(name = "AUTHOR_ID", nullable = false) ),
            @AttributeOverride(name = "bookId", column = @Column(name = "BOOK_ID", nullable = false) ) })
    public BookAuthorId getId() {
        return this.id;
    }

    public void setId(BookAuthorId id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BookAuthor other = (BookAuthor) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
