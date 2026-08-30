package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean expression) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void checkArgument(boolean expression, @javax.annotation.CheckForNull java.lang.Object errorMessage) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(errorMessage));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object... errorMessageArgs) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, errorMessageArgs));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, char p1) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1)));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, int p1) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1)));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, long p1) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1)));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, char p1, char p2) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1), java.lang.Character.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, char p1, int p2) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1), java.lang.Integer.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, char p1, long p2) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1), java.lang.Long.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, char p1, @javax.annotation.CheckForNull java.lang.Object p2) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1), p2));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, int p1, char p2) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1), java.lang.Character.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, int p1, int p2) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1), java.lang.Integer.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, int p1, long p2) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1), java.lang.Long.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, int p1, @javax.annotation.CheckForNull java.lang.Object p2) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1), p2));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, long p1, char p2) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1), java.lang.Character.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, long p1, int p2) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1), java.lang.Integer.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, long p1, long p2) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1), java.lang.Long.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, long p1, @javax.annotation.CheckForNull java.lang.Object p2) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1), p2));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, char p2) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, java.lang.Character.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, int p2) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, java.lang.Integer.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, long p2) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, java.lang.Long.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, @javax.annotation.CheckForNull java.lang.Object p2) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, @javax.annotation.CheckForNull java.lang.Object p2, @javax.annotation.CheckForNull java.lang.Object p3) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, p2, p3));
        }
    }

    public static void checkArgument(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, @javax.annotation.CheckForNull java.lang.Object p2, @javax.annotation.CheckForNull java.lang.Object p3, @javax.annotation.CheckForNull java.lang.Object p4) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, p2, p3, p4));
        }
    }

    public static void checkState(boolean expression) {
        if (!expression) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void checkState(boolean expression, @javax.annotation.CheckForNull java.lang.Object errorMessage) {
        if (!expression) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(errorMessage));
        }
    }

    public static void checkState(boolean expression, @javax.annotation.CheckForNull java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object... errorMessageArgs) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, errorMessageArgs));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, char p1) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1)));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, int p1) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1)));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, long p1) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1)));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, char p1, char p2) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1), java.lang.Character.valueOf(p2)));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, char p1, int p2) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1), java.lang.Integer.valueOf(p2)));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, char p1, long p2) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1), java.lang.Long.valueOf(p2)));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, char p1, @javax.annotation.CheckForNull java.lang.Object p2) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1), p2));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, int p1, char p2) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1), java.lang.Character.valueOf(p2)));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, int p1, int p2) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1), java.lang.Integer.valueOf(p2)));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, int p1, long p2) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1), java.lang.Long.valueOf(p2)));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, int p1, @javax.annotation.CheckForNull java.lang.Object p2) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1), p2));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, long p1, char p2) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1), java.lang.Character.valueOf(p2)));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, long p1, int p2) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1), java.lang.Integer.valueOf(p2)));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, long p1, long p2) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1), java.lang.Long.valueOf(p2)));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, long p1, @javax.annotation.CheckForNull java.lang.Object p2) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1), p2));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, char p2) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, java.lang.Character.valueOf(p2)));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, int p2) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, java.lang.Integer.valueOf(p2)));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, long p2) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, java.lang.Long.valueOf(p2)));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, @javax.annotation.CheckForNull java.lang.Object p2) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, @javax.annotation.CheckForNull java.lang.Object p2, @javax.annotation.CheckForNull java.lang.Object p3) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, p2, p3));
        }
    }

    public static void checkState(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, @javax.annotation.CheckForNull java.lang.Object p2, @javax.annotation.CheckForNull java.lang.Object p3, @javax.annotation.CheckForNull java.lang.Object p4) {
        if (!expression) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, p2, p3, p4));
        }
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference) {
        reference.getClass();
        return reference;
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, @javax.annotation.CheckForNull java.lang.Object errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(errorMessage));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object... errorMessageArgs) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, errorMessageArgs));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, char p1) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1)));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, int p1) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1)));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, long p1) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1)));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, char p1, char p2) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1), java.lang.Character.valueOf(p2)));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, char p1, int p2) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1), java.lang.Integer.valueOf(p2)));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, char p1, long p2) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1), java.lang.Long.valueOf(p2)));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, char p1, @javax.annotation.CheckForNull java.lang.Object p2) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1), p2));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, int p1, char p2) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1), java.lang.Character.valueOf(p2)));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, int p1, int p2) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1), java.lang.Integer.valueOf(p2)));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, int p1, long p2) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1), java.lang.Long.valueOf(p2)));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, int p1, @javax.annotation.CheckForNull java.lang.Object p2) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1), p2));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, long p1, char p2) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1), java.lang.Character.valueOf(p2)));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, long p1, int p2) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1), java.lang.Integer.valueOf(p2)));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, long p1, long p2) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1), java.lang.Long.valueOf(p2)));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, long p1, @javax.annotation.CheckForNull java.lang.Object p2) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1), p2));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, char p2) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, java.lang.Character.valueOf(p2)));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, int p2) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, java.lang.Integer.valueOf(p2)));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, long p2) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, java.lang.Long.valueOf(p2)));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, @javax.annotation.CheckForNull java.lang.Object p2) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, p2));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, @javax.annotation.CheckForNull java.lang.Object p2, @javax.annotation.CheckForNull java.lang.Object p3) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, p2, p3));
    }

    public static <T> T checkNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, @javax.annotation.CheckForNull java.lang.Object p2, @javax.annotation.CheckForNull java.lang.Object p3, @javax.annotation.CheckForNull java.lang.Object p4) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, p2, p3, p4));
    }

    public static int checkElementIndex(int index, int size) {
        return checkElementIndex(index, size, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
    }

    public static int checkElementIndex(int index, int size, java.lang.String desc) {
        if (index < 0 || index >= size) {
            throw new java.lang.IndexOutOfBoundsException(badElementIndex(index, size, desc));
        }
        return index;
    }

    private static java.lang.String badElementIndex(int index, int size, java.lang.String desc) {
        if (index < 0) {
            return com.google.common.base.Strings.lenientFormat("%s (%s) must not be negative", desc, java.lang.Integer.valueOf(index));
        }
        if (size >= 0) {
            return com.google.common.base.Strings.lenientFormat("%s (%s) must be less than size (%s)", desc, java.lang.Integer.valueOf(index), java.lang.Integer.valueOf(size));
        }
        throw new java.lang.IllegalArgumentException("negative size: " + size);
    }

    public static int checkPositionIndex(int index, int size) {
        return checkPositionIndex(index, size, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
    }

    public static int checkPositionIndex(int index, int size, java.lang.String desc) {
        if (index < 0 || index > size) {
            throw new java.lang.IndexOutOfBoundsException(badPositionIndex(index, size, desc));
        }
        return index;
    }

    private static java.lang.String badPositionIndex(int index, int size, java.lang.String desc) {
        if (index < 0) {
            return com.google.common.base.Strings.lenientFormat("%s (%s) must not be negative", desc, java.lang.Integer.valueOf(index));
        }
        if (size >= 0) {
            return com.google.common.base.Strings.lenientFormat("%s (%s) must not be greater than size (%s)", desc, java.lang.Integer.valueOf(index), java.lang.Integer.valueOf(size));
        }
        throw new java.lang.IllegalArgumentException("negative size: " + size);
    }

    public static void checkPositionIndexes(int start, int end, int size) {
        if (start < 0 || end < start || end > size) {
            throw new java.lang.IndexOutOfBoundsException(badPositionIndexes(start, end, size));
        }
    }

    private static java.lang.String badPositionIndexes(int start, int end, int size) {
        if (start < 0 || start > size) {
            return badPositionIndex(start, size, "start index");
        }
        return (end < 0 || end > size) ? badPositionIndex(end, size, "end index") : com.google.common.base.Strings.lenientFormat("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(end), java.lang.Integer.valueOf(start));
    }
}
