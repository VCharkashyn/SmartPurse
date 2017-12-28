package org.example.entity;

import java.io.Serializable;

public abstract class AbstractModel<ID extends Serializable> implements Model<ID> {

    @Override
    public boolean isNew() {
        return getId() == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractModel)) return false;

        AbstractModel that = (AbstractModel) o;

        return getId() != null ? getId().equals(that.getId()) : that.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
