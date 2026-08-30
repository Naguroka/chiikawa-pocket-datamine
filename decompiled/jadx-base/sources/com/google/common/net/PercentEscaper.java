package com.google.common.net;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.net.ElementTypesAreNonnullByDefault
public final class PercentEscaper extends com.google.common.escape.UnicodeEscaper {
    private static final char[] PLUS_SIGN = {org.objectweb.asm.signature.SignatureVisitor.EXTENDS};
    private static final char[] UPPER_HEX_DIGITS = "0123456789ABCDEF".toCharArray();
    private final boolean plusForSpace;
    private final boolean[] safeOctets;

    public PercentEscaper(java.lang.String safeChars, boolean plusForSpace) {
        com.google.common.base.Preconditions.checkNotNull(safeChars);
        if (safeChars.matches(".*[0-9A-Za-z].*")) {
            throw new java.lang.IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        java.lang.String str = safeChars + "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        if (plusForSpace && str.contains(" ")) {
            throw new java.lang.IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.plusForSpace = plusForSpace;
        this.safeOctets = createSafeOctets(str);
    }

    private static boolean[] createSafeOctets(java.lang.String safeChars) {
        char[] charArray = safeChars.toCharArray();
        int iMax = -1;
        for (char c : charArray) {
            iMax = java.lang.Math.max((int) c, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        return zArr;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    protected int nextEscapeIndex(java.lang.CharSequence csq, int index, int end) {
        com.google.common.base.Preconditions.checkNotNull(csq);
        while (index < end) {
            char cCharAt = csq.charAt(index);
            boolean[] zArr = this.safeOctets;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            }
            index++;
        }
        return index;
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public java.lang.String escape(java.lang.String s) {
        com.google.common.base.Preconditions.checkNotNull(s);
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = s.charAt(i);
            boolean[] zArr = this.safeOctets;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                return escapeSlow(s, i);
            }
        }
        return s;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    @javax.annotation.CheckForNull
    protected char[] escape(int cp) {
        boolean[] zArr = this.safeOctets;
        if (cp < zArr.length && zArr[cp]) {
            return null;
        }
        if (cp == 32 && this.plusForSpace) {
            return PLUS_SIGN;
        }
        if (cp <= 127) {
            char[] cArr = UPPER_HEX_DIGITS;
            return new char[]{'%', cArr[cp >>> 4], cArr[cp & 15]};
        }
        if (cp <= 2047) {
            char[] cArr2 = UPPER_HEX_DIGITS;
            char[] cArr3 = {'%', cArr2[(i >>> 4) | 12], cArr2[i & 15], '%', cArr2[(i & 3) | 8], cArr2[cp & 15]};
            int i = cp >>> 4;
            int i2 = i >>> 2;
            return cArr3;
        }
        if (cp <= 65535) {
            char[] cArr4 = UPPER_HEX_DIGITS;
            char[] cArr5 = {'%', 'E', cArr4[i >>> 2], '%', cArr4[(i & 3) | 8], cArr4[i & 15], '%', cArr4[(i & 3) | 8], cArr4[cp & 15]};
            int i3 = cp >>> 4;
            int i4 = i3 >>> 2;
            int i5 = i4 >>> 4;
            return cArr5;
        }
        if (cp <= 1114111) {
            char[] cArr6 = UPPER_HEX_DIGITS;
            char[] cArr7 = {'%', 'F', cArr6[(i >>> 2) & 7], '%', cArr6[(i & 3) | 8], cArr6[i & 15], '%', cArr6[(i & 3) | 8], cArr6[i & 15], '%', cArr6[(i & 3) | 8], cArr6[cp & 15]};
            int i6 = cp >>> 4;
            int i7 = i6 >>> 2;
            int i8 = i7 >>> 4;
            int i9 = i8 >>> 2;
            int i10 = i9 >>> 4;
            return cArr7;
        }
        throw new java.lang.IllegalArgumentException("Invalid unicode character value " + cp);
    }
}
