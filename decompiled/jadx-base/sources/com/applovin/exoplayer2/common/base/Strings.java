package com.applovin.exoplayer2.common.base;

/* JADX INFO: loaded from: classes3.dex */
public final class Strings {
    private Strings() {
    }

    public static java.lang.String commonPrefix(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charSequence);
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charSequence2);
        int iMin = java.lang.Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < iMin && charSequence.charAt(i) == charSequence2.charAt(i)) {
            i++;
        }
        int i2 = i - 1;
        if (validSurrogatePairAt(charSequence, i2) || validSurrogatePairAt(charSequence2, i2)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    public static java.lang.String commonSuffix(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charSequence);
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(charSequence2);
        int iMin = java.lang.Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < iMin && charSequence.charAt((charSequence.length() - i) - 1) == charSequence2.charAt((charSequence2.length() - i) - 1)) {
            i++;
        }
        if (validSurrogatePairAt(charSequence, (charSequence.length() - i) - 1) || validSurrogatePairAt(charSequence2, (charSequence2.length() - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(charSequence.length() - i, charSequence.length()).toString();
    }

    public static java.lang.String lenientFormat(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object... objArr) {
        int iIndexOf;
        java.lang.String strValueOf = java.lang.String.valueOf(str);
        int i = 0;
        if (objArr == null) {
            objArr = new java.lang.Object[]{"(Object[])null"};
        } else {
            for (int i2 = 0; i2 < objArr.length; i2++) {
                objArr[i2] = lenientToString(objArr[i2]);
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((java.lang.CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((java.lang.CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static java.lang.String lenientToString(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        try {
            return java.lang.String.valueOf(obj);
        } catch (java.lang.Exception e) {
            java.lang.String str = obj.getClass().getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
            java.util.logging.Logger.getLogger("com.applovin.exoplayer2.common.base.Strings").log(java.util.logging.Level.WARNING, "Exception during lenientFormat for " + str, (java.lang.Throwable) e);
            return "<" + str + " threw " + e.getClass().getName() + ">";
        }
    }

    public static java.lang.String padEnd(java.lang.String str, int i, char c) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(str);
        if (str.length() >= i) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i);
        sb.append(str);
        for (int length = str.length(); length < i; length++) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static java.lang.String padStart(java.lang.String str, int i, char c) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(str);
        if (str.length() >= i) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i);
        for (int length = str.length(); length < i; length++) {
            sb.append(c);
        }
        sb.append(str);
        return sb.toString();
    }

    public static java.lang.String repeat(java.lang.String str, int i) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(str);
        if (i <= 1) {
            com.applovin.exoplayer2.common.base.Preconditions.checkArgument(i >= 0, "invalid count: %s", i);
            return i == 0 ? "" : str;
        }
        int length = str.length();
        long j = ((long) length) * ((long) i);
        int i2 = (int) j;
        if (i2 != j) {
            throw new java.lang.ArrayIndexOutOfBoundsException("Required array size too large: " + j);
        }
        char[] cArr = new char[i2];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i3 = i2 - length;
            if (length >= i3) {
                java.lang.System.arraycopy(cArr, 0, cArr, length, i3);
                return new java.lang.String(cArr);
            }
            java.lang.System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }

    static boolean validSurrogatePairAt(java.lang.CharSequence charSequence, int i) {
        return i >= 0 && i <= charSequence.length() + (-2) && java.lang.Character.isHighSurrogate(charSequence.charAt(i)) && java.lang.Character.isLowSurrogate(charSequence.charAt(i + 1));
    }
}
