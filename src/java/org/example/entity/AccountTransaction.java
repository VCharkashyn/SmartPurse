package org.example.entity;

import java.time.LocalDateTime;

public class AccountTransaction {

    private long id;
    private long accountId;
    private double quantity;
    private long userId;
    private LocalDateTime creationDate;
    private long correctedTransactionId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public long getCorrectedTransactionId() {
        return correctedTransactionId;
    }

    public void setCorrectedTransactionId(long correctedTransactionId) {
        this.correctedTransactionId = correctedTransactionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountTransaction transaction = (AccountTransaction) o;
        return id == transaction.id;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (accountId ^ (accountId >>> 32));
        temp = Double.doubleToLongBits(quantity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + creationDate.hashCode();
        result = 31 * result + (int) (correctedTransactionId ^ (correctedTransactionId >>> 32));
        return result;
    }
}
