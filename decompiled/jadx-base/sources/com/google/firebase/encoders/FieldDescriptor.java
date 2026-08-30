package com.google.firebase.encoders;

/* JADX INFO: loaded from: classes5.dex */
public final class FieldDescriptor {
    private final java.lang.String name;
    private final java.util.Map<java.lang.Class<?>, java.lang.Object> properties;

    private FieldDescriptor(java.lang.String str, java.util.Map<java.lang.Class<?>, java.lang.Object> map) {
        this.name = str;
        this.properties = map;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public <T extends java.lang.annotation.Annotation> T getProperty(java.lang.Class<T> cls) {
        return (T) this.properties.get(cls);
    }

    public static com.google.firebase.encoders.FieldDescriptor of(java.lang.String str) {
        return new com.google.firebase.encoders.FieldDescriptor(str, java.util.Collections.emptyMap());
    }

    public static com.google.firebase.encoders.FieldDescriptor.Builder builder(java.lang.String str) {
        return new com.google.firebase.encoders.FieldDescriptor.Builder(str);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.encoders.FieldDescriptor)) {
            return false;
        }
        com.google.firebase.encoders.FieldDescriptor fieldDescriptor = (com.google.firebase.encoders.FieldDescriptor) obj;
        return this.name.equals(fieldDescriptor.name) && this.properties.equals(fieldDescriptor.properties);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.properties.hashCode();
    }

    public java.lang.String toString() {
        return "FieldDescriptor{name=" + this.name + ", properties=" + this.properties.values() + "}";
    }

    public static final class Builder {
        private final java.lang.String name;
        private java.util.Map<java.lang.Class<?>, java.lang.Object> properties = null;

        Builder(java.lang.String str) {
            this.name = str;
        }

        public <T extends java.lang.annotation.Annotation> com.google.firebase.encoders.FieldDescriptor.Builder withProperty(T t) {
            if (this.properties == null) {
                this.properties = new java.util.HashMap();
            }
            this.properties.put(t.annotationType(), t);
            return this;
        }

        public com.google.firebase.encoders.FieldDescriptor build() {
            java.util.Map mapUnmodifiableMap;
            java.lang.String str = this.name;
            if (this.properties == null) {
                mapUnmodifiableMap = java.util.Collections.emptyMap();
            } else {
                mapUnmodifiableMap = java.util.Collections.unmodifiableMap(new java.util.HashMap(this.properties));
            }
            return new com.google.firebase.encoders.FieldDescriptor(str, mapUnmodifiableMap);
        }
    }
}
