package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public enum JavaType {
    VOID(java.lang.Void.class, java.lang.Void.class, null),
    INT(java.lang.Integer.TYPE, java.lang.Integer.class, 0),
    LONG(java.lang.Long.TYPE, java.lang.Long.class, 0L),
    FLOAT(java.lang.Float.TYPE, java.lang.Float.class, java.lang.Float.valueOf(0.0f)),
    DOUBLE(java.lang.Double.TYPE, java.lang.Double.class, java.lang.Double.valueOf(0.0d)),
    BOOLEAN(java.lang.Boolean.TYPE, java.lang.Boolean.class, false),
    STRING(java.lang.String.class, java.lang.String.class, ""),
    BYTE_STRING(com.google.protobuf.ByteString.class, com.google.protobuf.ByteString.class, com.google.protobuf.ByteString.EMPTY),
    ENUM(java.lang.Integer.TYPE, java.lang.Integer.class, null),
    MESSAGE(java.lang.Object.class, java.lang.Object.class, null);

    private final java.lang.Class<?> boxedType;
    private final java.lang.Object defaultDefault;
    private final java.lang.Class<?> type;

    JavaType(java.lang.Class cls, java.lang.Class cls2, java.lang.Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public java.lang.Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public java.lang.Class<?> getType() {
        return this.type;
    }

    public java.lang.Class<?> getBoxedType() {
        return this.boxedType;
    }

    public boolean isValidType(java.lang.Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}
