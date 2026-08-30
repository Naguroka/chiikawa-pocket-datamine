package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Strings {
    private Strings() {
    }

    public static java.lang.String nullToEmpty(@javax.annotation.CheckForNull java.lang.String string) {
        return com.google.common.base.Platform.nullToEmpty(string);
    }

    @javax.annotation.CheckForNull
    public static java.lang.String emptyToNull(@javax.annotation.CheckForNull java.lang.String string) {
        return com.google.common.base.Platform.emptyToNull(string);
    }

    public static boolean isNullOrEmpty(@javax.annotation.CheckForNull java.lang.String string) {
        return com.google.common.base.Platform.stringIsNullOrEmpty(string);
    }

    public static java.lang.String padStart(java.lang.String string, int minLength, char padChar) {
        com.google.common.base.Preconditions.checkNotNull(string);
        if (string.length() >= minLength) {
            return string;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(minLength);
        for (int length = string.length(); length < minLength; length++) {
            sb.append(padChar);
        }
        sb.append(string);
        return sb.toString();
    }

    public static java.lang.String padEnd(java.lang.String string, int minLength, char padChar) {
        com.google.common.base.Preconditions.checkNotNull(string);
        if (string.length() >= minLength) {
            return string;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(minLength);
        sb.append(string);
        for (int length = string.length(); length < minLength; length++) {
            sb.append(padChar);
        }
        return sb.toString();
    }

    public static java.lang.String repeat(java.lang.String string, int count) {
        com.google.common.base.Preconditions.checkNotNull(string);
        if (count <= 1) {
            com.google.common.base.Preconditions.checkArgument(count >= 0, "invalid count: %s", count);
            return count == 0 ? "" : string;
        }
        int length = string.length();
        long j = ((long) length) * ((long) count);
        int i = (int) j;
        if (i != j) {
            throw new java.lang.ArrayIndexOutOfBoundsException("Required array size too large: " + j);
        }
        char[] cArr = new char[i];
        string.getChars(0, length, cArr, 0);
        while (true) {
            int i2 = i - length;
            if (length < i2) {
                java.lang.System.arraycopy(cArr, 0, cArr, length, length);
                length <<= 1;
            } else {
                java.lang.System.arraycopy(cArr, 0, cArr, length, i2);
                return new java.lang.String(cArr);
            }
        }
    }

    public static java.lang.String commonPrefix(java.lang.CharSequence a2, java.lang.CharSequence b) {
        com.google.common.base.Preconditions.checkNotNull(a2);
        com.google.common.base.Preconditions.checkNotNull(b);
        int iMin = java.lang.Math.min(a2.length(), b.length());
        int i = 0;
        while (i < iMin && a2.charAt(i) == b.charAt(i)) {
            i++;
        }
        int i2 = i - 1;
        if (validSurrogatePairAt(a2, i2) || validSurrogatePairAt(b, i2)) {
            i--;
        }
        return a2.subSequence(0, i).toString();
    }

    public static java.lang.String commonSuffix(java.lang.CharSequence a2, java.lang.CharSequence b) {
        com.google.common.base.Preconditions.checkNotNull(a2);
        com.google.common.base.Preconditions.checkNotNull(b);
        int iMin = java.lang.Math.min(a2.length(), b.length());
        int i = 0;
        while (i < iMin && a2.charAt((a2.length() - i) - 1) == b.charAt((b.length() - i) - 1)) {
            i++;
        }
        if (validSurrogatePairAt(a2, (a2.length() - i) - 1) || validSurrogatePairAt(b, (b.length() - i) - 1)) {
            i--;
        }
        return a2.subSequence(a2.length() - i, a2.length()).toString();
    }

    static boolean validSurrogatePairAt(java.lang.CharSequence string, int index) {
        return index >= 0 && index <= string.length() + (-2) && java.lang.Character.isHighSurrogate(string.charAt(index)) && java.lang.Character.isLowSurrogate(string.charAt(index + 1));
    }

    public static java.lang.String lenientFormat(@javax.annotation.CheckForNull java.lang.String template, @javax.annotation.CheckForNull java.lang.Object... args) {
        int iIndexOf;
        java.lang.String strValueOf = java.lang.String.valueOf(template);
        int i = 0;
        if (args == null) {
            args = new java.lang.Object[]{"(Object[])null"};
        } else {
            for (int i2 = 0; i2 < args.length; i2++) {
                args[i2] = lenientToString(args[i2]);
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + (args.length * 16));
        int i3 = 0;
        while (i < args.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((java.lang.CharSequence) strValueOf, i3, iIndexOf);
            sb.append(args[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((java.lang.CharSequence) strValueOf, i3, strValueOf.length());
        if (i < args.length) {
            sb.append(" [");
            sb.append(args[i]);
            for (int i4 = i + 1; i4 < args.length; i4++) {
                sb.append(", ");
                sb.append(args[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static java.lang.String lenientToString(@javax.annotation.CheckForNull java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        try {
            return o.toString();
        } catch (java.lang.Exception e) {
            java.lang.String str = o.getClass().getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(o));
            java.util.logging.Logger.getLogger("com.google.common.base.Strings").log(java.util.logging.Level.WARNING, "Exception during lenientFormat for " + str, (java.lang.Throwable) e);
            return "<" + str + " threw " + e.getClass().getName() + ">";
        }
    }
}
