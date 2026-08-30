package com.google.firebase.sessions.dagger.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class Preconditions {
    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    public static <T> T checkNotNull(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static <T> T checkNotNullFromProvides(T t) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static <T> T checkNotNullFromComponent(T t) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    public static <T> T checkNotNull(T t, java.lang.String str, java.lang.Object obj) {
        java.lang.String strValueOf;
        if (t != null) {
            return t;
        }
        if (!str.contains("%s")) {
            throw new java.lang.IllegalArgumentException("errorMessageTemplate has no format specifiers");
        }
        if (str.indexOf("%s") != str.lastIndexOf("%s")) {
            throw new java.lang.IllegalArgumentException("errorMessageTemplate has more than one format specifier");
        }
        if (obj instanceof java.lang.Class) {
            strValueOf = ((java.lang.Class) obj).getCanonicalName();
        } else {
            strValueOf = java.lang.String.valueOf(obj);
        }
        throw new java.lang.NullPointerException(str.replace("%s", strValueOf));
    }

    public static <T> void checkBuilderRequirement(T t, java.lang.Class<T> cls) {
        if (t == null) {
            throw new java.lang.IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    private Preconditions() {
    }
}
