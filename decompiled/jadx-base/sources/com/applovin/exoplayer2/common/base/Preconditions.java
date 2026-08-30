package com.applovin.exoplayer2.common.base;

/* JADX INFO: loaded from: classes3.dex */
public final class Preconditions {
    private Preconditions() {
    }

    private static java.lang.String badElementIndex(int i, int i2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str) {
        if (i < 0) {
            return com.applovin.exoplayer2.common.base.Strings.lenientFormat("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return com.applovin.exoplayer2.common.base.Strings.lenientFormat("%s (%s) must be less than size (%s)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IllegalArgumentException("negative size: " + i2);
    }

    private static java.lang.String badPositionIndex(int i, int i2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str) {
        if (i < 0) {
            return com.applovin.exoplayer2.common.base.Strings.lenientFormat("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return com.applovin.exoplayer2.common.base.Strings.lenientFormat("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IllegalArgumentException("negative size: " + i2);
    }

    private static java.lang.String badPositionIndexes(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return badPositionIndex(i, i3, "start index");
        }
        return (i2 < 0 || i2 > i3) ? badPositionIndex(i2, i3, "end index") : com.applovin.exoplayer2.common.base.Strings.lenientFormat("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static int checkElementIndex(int i, int i2) {
        return checkElementIndex(i, i2, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t) {
        t.getClass();
        return t;
    }

    public static int checkPositionIndex(int i, int i2) {
        return checkPositionIndex(i, i2, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
    }

    public static void checkPositionIndexes(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new java.lang.IndexOutOfBoundsException(badPositionIndexes(i, i2, i3));
        }
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    public static int checkElementIndex(int i, int i2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str) {
        if (i < 0 || i >= i2) {
            throw new java.lang.IndexOutOfBoundsException(badElementIndex(i, i2, str));
        }
        return i;
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(obj));
    }

    public static int checkPositionIndex(int i, int i2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str) {
        if (i < 0 || i > i2) {
            throw new java.lang.IndexOutOfBoundsException(badPositionIndex(i, i2, str));
        }
        return i;
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object... objArr) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, objArr));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, objArr));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object... objArr) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, objArr));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, char c) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c)));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, char c) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c)));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, char c) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c)));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, int i) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i)));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, int i) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i)));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, int i) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i)));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, long j) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j)));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, long j) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j)));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, long j) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j)));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, char c, char c2) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Character.valueOf(c2)));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, char c, char c2) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Character.valueOf(c2)));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, char c, char c2) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Character.valueOf(c2)));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, char c, int i) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Integer.valueOf(i)));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, char c, int i) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Integer.valueOf(i)));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, char c, int i) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Integer.valueOf(i)));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, char c, long j) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Long.valueOf(j)));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, char c, long j) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Long.valueOf(j)));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, char c, long j) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Long.valueOf(j)));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, char c, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), obj));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, char c, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), obj));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, char c, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), obj));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, int i, char c) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Character.valueOf(c)));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, int i, char c) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Character.valueOf(c)));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, int i, char c) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Character.valueOf(c)));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, int i, int i2) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, int i, int i2) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, int i, int i2) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, int i, long j) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Long.valueOf(j)));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, int i, long j) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Long.valueOf(j)));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, int i, long j) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Long.valueOf(j)));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, int i, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), obj));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, int i, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), obj));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, int i, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), obj));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, long j, char c) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Character.valueOf(c)));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, long j, char c) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Character.valueOf(c)));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, long j, char c) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Character.valueOf(c)));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, long j, int i) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i)));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, long j, int i) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i)));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, long j, int i) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i)));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, long j, long j2) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, long j, long j2) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, long j, long j2) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, long j, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), obj));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, long j, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), obj));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, long j, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), obj));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, char c) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, java.lang.Character.valueOf(c)));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, char c) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, java.lang.Character.valueOf(c)));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, char c) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, java.lang.Character.valueOf(c)));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, int i) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, java.lang.Integer.valueOf(i)));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, int i) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, java.lang.Integer.valueOf(i)));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, int i) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, java.lang.Integer.valueOf(i)));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, long j) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, java.lang.Long.valueOf(j)));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, long j) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, java.lang.Long.valueOf(j)));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, long j) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, java.lang.Long.valueOf(j)));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj2) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, obj2));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj2) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, obj2));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj2) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, obj2));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj3) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, obj2, obj3));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj3) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, obj2, obj3));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj3) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj4) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj4) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, obj2, obj3, obj4));
    }

    public static void checkState(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj4) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.applovin.exoplayer2.common.base.Strings.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }
}
