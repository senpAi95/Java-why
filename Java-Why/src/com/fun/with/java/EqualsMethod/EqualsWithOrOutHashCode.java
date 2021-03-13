package com.fun.with.java.EqualsMethod;

import java.util.Objects;

public class EqualsWithOrOutHashCode {

    private String field1;
    private int val;

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsWithOrOutHashCode that = (EqualsWithOrOutHashCode) o;
        return val == that.val &&
                field1.equals(that.field1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field1, val);
    }
}
