package org.example.entity;

import java.io.Serializable;

public interface Model<ID extends Serializable> {
    ID getId();
    boolean isNew();
}
