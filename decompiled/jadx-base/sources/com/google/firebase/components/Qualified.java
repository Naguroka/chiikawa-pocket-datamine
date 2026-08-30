package com.google.firebase.components;

/* JADX INFO: loaded from: classes5.dex */
public final class Qualified<T> {
    private final java.lang.Class<? extends java.lang.annotation.Annotation> qualifier;
    private final java.lang.Class<T> type;

    private @interface Unqualified {
    }

    public Qualified(java.lang.Class<? extends java.lang.annotation.Annotation> cls, java.lang.Class<T> cls2) {
        this.qualifier = cls;
        this.type = cls2;
    }

    public static <T> com.google.firebase.components.Qualified<T> unqualified(java.lang.Class<T> cls) {
        return new com.google.firebase.components.Qualified<>(com.google.firebase.components.Qualified.Unqualified.class, cls);
    }

    public static <T> com.google.firebase.components.Qualified<T> qualified(java.lang.Class<? extends java.lang.annotation.Annotation> cls, java.lang.Class<T> cls2) {
        return new com.google.firebase.components.Qualified<>(cls, cls2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.firebase.components.Qualified qualified = (com.google.firebase.components.Qualified) obj;
        if (this.type.equals(qualified.type)) {
            return this.qualifier.equals(qualified.qualifier);
        }
        return false;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.qualifier.hashCode();
    }

    public java.lang.String toString() {
        if (this.qualifier == com.google.firebase.components.Qualified.Unqualified.class) {
            return this.type.getName();
        }
        return "@" + this.qualifier.getName() + " " + this.type.getName();
    }
}
