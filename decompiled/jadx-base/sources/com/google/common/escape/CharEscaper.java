package com.google.common.escape;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.escape.ElementTypesAreNonnullByDefault
public abstract class CharEscaper extends com.google.common.escape.Escaper {
    private static final int DEST_PAD_MULTIPLIER = 2;

    @javax.annotation.CheckForNull
    protected abstract char[] escape(char c);

    protected CharEscaper() {
    }

    @Override // com.google.common.escape.Escaper
    public java.lang.String escape(java.lang.String string) {
        com.google.common.base.Preconditions.checkNotNull(string);
        int length = string.length();
        for (int i = 0; i < length; i++) {
            if (escape(string.charAt(i)) != null) {
                return escapeSlow(string, i);
            }
        }
        return string;
    }

    protected final java.lang.String escapeSlow(java.lang.String s, int index) {
        int length = s.length();
        char[] cArrCharBufferFromThreadLocal = com.google.common.escape.Platform.charBufferFromThreadLocal();
        int length2 = cArrCharBufferFromThreadLocal.length;
        int i = 0;
        int i2 = 0;
        while (index < length) {
            char[] cArrEscape = escape(s.charAt(index));
            if (cArrEscape != null) {
                int length3 = cArrEscape.length;
                int i3 = index - i;
                int i4 = i2 + i3;
                int i5 = i4 + length3;
                if (length2 < i5) {
                    length2 = ((length - index) * 2) + i5;
                    cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, i2, length2);
                }
                if (i3 > 0) {
                    s.getChars(i, index, cArrCharBufferFromThreadLocal, i2);
                    i2 = i4;
                }
                if (length3 > 0) {
                    java.lang.System.arraycopy(cArrEscape, 0, cArrCharBufferFromThreadLocal, i2, length3);
                    i2 += length3;
                }
                i = index + 1;
            }
            index++;
        }
        int i6 = length - i;
        if (i6 > 0) {
            int i7 = i6 + i2;
            if (length2 < i7) {
                cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, i2, i7);
            }
            s.getChars(i, length, cArrCharBufferFromThreadLocal, i2);
            i2 = i7;
        }
        return new java.lang.String(cArrCharBufferFromThreadLocal, 0, i2);
    }

    private static char[] growBuffer(char[] dest, int index, int size) {
        if (size < 0) {
            throw new java.lang.AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr = new char[size];
        if (index > 0) {
            java.lang.System.arraycopy(dest, 0, cArr, 0, index);
        }
        return cArr;
    }
}
