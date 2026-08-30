package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class UsingToStringOrdering extends com.google.common.collect.Ordering<java.lang.Object> implements java.io.Serializable {
    static final com.google.common.collect.UsingToStringOrdering INSTANCE = new com.google.common.collect.UsingToStringOrdering();
    private static final long serialVersionUID = 0;

    public java.lang.String toString() {
        return "Ordering.usingToString()";
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(java.lang.Object left, java.lang.Object right) {
        return left.toString().compareTo(right.toString());
    }

    private java.lang.Object readResolve() {
        return INSTANCE;
    }

    private UsingToStringOrdering() {
    }
}
