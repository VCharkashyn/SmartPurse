package org.example.entity;

public class UserAttribute {

    private int userId;
    private String attributeName;
    private String attributeValue;

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserAttribute that = (UserAttribute) o;

        if (userId != that.userId) return false;
        return attributeName.equals(that.attributeName);
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + attributeName.hashCode();
        return result;
    }
}
