package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class CollectPreconditions {
    CollectPreconditions() {
    }

    static void checkEntryNotNull(java.lang.Object key, java.lang.Object value) {
        if (key == null) {
            throw new java.lang.NullPointerException("null key in entry: null=" + value);
        }
        if (value == null) {
            throw new java.lang.NullPointerException("null value in entry: " + key + "=null");
        }
    }

    static int checkNonnegative(int value, java.lang.String name) {
        if (value >= 0) {
            return value;
        }
        throw new java.lang.IllegalArgumentException(name + " cannot be negative but was: " + value);
    }

    static long checkNonnegative(long value, java.lang.String name) {
        if (value >= 0) {
            return value;
        }
        throw new java.lang.IllegalArgumentException(name + " cannot be negative but was: " + value);
    }

    static void checkPositive(int value, java.lang.String name) {
        if (value <= 0) {
            throw new java.lang.IllegalArgumentException(name + " must be positive but was: " + value);
        }
    }

    static void checkRemove(boolean canRemove) {
        com.google.common.base.Preconditions.checkState(canRemove, "no calls to next() since the last call to remove()");
    }
}
