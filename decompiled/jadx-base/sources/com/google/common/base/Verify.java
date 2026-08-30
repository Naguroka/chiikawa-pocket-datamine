package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Verify {
    public static void verify(boolean expression) {
        if (!expression) {
            throw new com.google.common.base.VerifyException();
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object... errorMessageArgs) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, errorMessageArgs));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, char p1) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1)));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, int p1) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1)));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, long p1) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1)));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, char p1, char p2) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1), java.lang.Character.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, int p1, char p2) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1), java.lang.Character.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, long p1, char p2) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1), java.lang.Character.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, char p2) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, java.lang.Character.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, char p1, int p2) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1), java.lang.Integer.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, int p1, int p2) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1), java.lang.Integer.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, long p1, int p2) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1), java.lang.Integer.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, int p2) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, java.lang.Integer.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, char p1, long p2) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1), java.lang.Long.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, int p1, long p2) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1), java.lang.Long.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, long p1, long p2) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1), java.lang.Long.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, long p2) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, java.lang.Long.valueOf(p2)));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, char p1, @javax.annotation.CheckForNull java.lang.Object p2) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Character.valueOf(p1), p2));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, int p1, @javax.annotation.CheckForNull java.lang.Object p2) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Integer.valueOf(p1), p2));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, long p1, @javax.annotation.CheckForNull java.lang.Object p2) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, java.lang.Long.valueOf(p1), p2));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, @javax.annotation.CheckForNull java.lang.Object p2) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, p2));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, @javax.annotation.CheckForNull java.lang.Object p2, @javax.annotation.CheckForNull java.lang.Object p3) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, p2, p3));
        }
    }

    public static void verify(boolean expression, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object p1, @javax.annotation.CheckForNull java.lang.Object p2, @javax.annotation.CheckForNull java.lang.Object p3, @javax.annotation.CheckForNull java.lang.Object p4) {
        if (!expression) {
            throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, p1, p2, p3, p4));
        }
    }

    public static <T> T verifyNotNull(@javax.annotation.CheckForNull T t) {
        return (T) verifyNotNull(t, "expected a non-null reference", new java.lang.Object[0]);
    }

    public static <T> T verifyNotNull(@javax.annotation.CheckForNull T reference, java.lang.String errorMessageTemplate, @javax.annotation.CheckForNull java.lang.Object... errorMessageArgs) {
        if (reference != null) {
            return reference;
        }
        throw new com.google.common.base.VerifyException(com.google.common.base.Strings.lenientFormat(errorMessageTemplate, errorMessageArgs));
    }

    private Verify() {
    }
}
