/*
 * This file is generated by jOOQ.
 */

package edu.java.domain.jooq.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jetbrains.annotations.NotNull;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "https://www.jooq.org",
                "jOOQ version:3.18.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Chat implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    public Chat() {
    }

    public Chat(Chat value) {
        this.id = value.id;
    }

    @ConstructorProperties({"id"})
    public Chat(
            @NotNull Long id
    ) {
        this.id = id;
    }

    /**
     * Getter for <code>CHAT.ID</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>CHAT.ID</code>.
     */
    public void setId(@NotNull Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Chat other = (Chat) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        } else if (!this.id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Chat (");

        sb.append(id);

        sb.append(")");
        return sb.toString();
    }
}
