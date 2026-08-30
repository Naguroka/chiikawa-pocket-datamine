package com.google.common.reflect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.reflect.ElementTypesAreNonnullByDefault
public abstract class TypeParameter<T> extends com.google.common.reflect.TypeCapture<T> {
    final java.lang.reflect.TypeVariable<?> typeVariable;

    protected TypeParameter() {
        java.lang.reflect.Type typeCapture = capture();
        com.google.common.base.Preconditions.checkArgument(typeCapture instanceof java.lang.reflect.TypeVariable, "%s should be a type variable.", typeCapture);
        this.typeVariable = (java.lang.reflect.TypeVariable) typeCapture;
    }

    public final int hashCode() {
        return this.typeVariable.hashCode();
    }

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
        if (o instanceof com.google.common.reflect.TypeParameter) {
            return this.typeVariable.equals(((com.google.common.reflect.TypeParameter) o).typeVariable);
        }
        return false;
    }

    public java.lang.String toString() {
        return this.typeVariable.toString();
    }
}
