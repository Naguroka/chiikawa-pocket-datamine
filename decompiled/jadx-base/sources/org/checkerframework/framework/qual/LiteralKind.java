package org.checkerframework.framework.qual;

/* JADX INFO: loaded from: classes6.dex */
public enum LiteralKind {
    NULL,
    INT,
    LONG,
    FLOAT,
    DOUBLE,
    BOOLEAN,
    CHAR,
    STRING,
    ALL,
    PRIMITIVE;

    public static java.util.List<org.checkerframework.framework.qual.LiteralKind> allLiteralKinds() {
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(values()));
        arrayList.remove(ALL);
        arrayList.remove(PRIMITIVE);
        return arrayList;
    }

    public static java.util.List<org.checkerframework.framework.qual.LiteralKind> primitiveLiteralKinds() {
        return java.util.Arrays.asList(INT, LONG, FLOAT, DOUBLE, BOOLEAN, CHAR);
    }
}
