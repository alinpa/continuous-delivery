package org.terra.bs.entities;

// Generated Apr 23, 2014 8:29:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Genre generated by hbm2java
 */
@Entity
@Table(name = "GENRE", uniqueConstraints = @UniqueConstraint(columnNames = "GENRE") )
@XmlRootElement
@ApiModel(value = "Genre", description = "Genre model representation")
public class Genre implements java.io.Serializable {

    private int id;

    @ApiModelProperty(value = "Genre type", required = true)
    private String genre;

    public Genre() {
        super();
    }

    public Genre(int id, String genre) {
        super();
        this.id = id;
        this.genre = genre;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GENRE_ID", unique = true, nullable = false)
    public int getGenreId() {
        return this.id;
    }

    public void setGenreId(int genreId) {
        this.id = genreId;
    }

    @Column(name = "GENRE", unique = true, nullable = false, length = 20)
    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((genre == null) ? 0 : genre.hashCode());
        result = prime * result + id;
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
        Genre other = (Genre) obj;
        if (genre == null) {
            if (other.genre != null)
                return false;
        } else if (!genre.equals(other.genre))
            return false;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Genre [genreId=" + id + ", genre=" + genre + "]";
    }

}
