package com.google.common.escape;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.escape.ElementTypesAreNonnullByDefault
public abstract class UnicodeEscaper extends com.google.common.escape.Escaper {
    private static final int DEST_PAD = 32;

    @javax.annotation.CheckForNull
    protected abstract char[] escape(int cp);

    protected UnicodeEscaper() {
    }

    @Override // com.google.common.escape.Escaper
    public java.lang.String escape(java.lang.String string) {
        com.google.common.base.Preconditions.checkNotNull(string);
        int length = string.length();
        int iNextEscapeIndex = nextEscapeIndex(string, 0, length);
        return iNextEscapeIndex == length ? string : escapeSlow(string, iNextEscapeIndex);
    }

    protected int nextEscapeIndex(java.lang.CharSequence csq, int start, int end) {
        while (start < end) {
            int iCodePointAt = codePointAt(csq, start, end);
            if (iCodePointAt < 0 || escape(iCodePointAt) != null) {
                break;
            }
            start += java.lang.Character.isSupplementaryCodePoint(iCodePointAt) ? 2 : 1;
        }
        return start;
    }

    protected final java.lang.String escapeSlow(java.lang.String s, int index) {
        int length = s.length();
        char[] cArrCharBufferFromThreadLocal = com.google.common.escape.Platform.charBufferFromThreadLocal();
        int i = 0;
        int length2 = 0;
        while (index < length) {
            int iCodePointAt = codePointAt(s, index, length);
            if (iCodePointAt < 0) {
                throw new java.lang.IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] cArrEscape = escape(iCodePointAt);
            int i2 = (java.lang.Character.isSupplementaryCodePoint(iCodePointAt) ? 2 : 1) + index;
            if (cArrEscape != null) {
                int i3 = index - i;
                int i4 = length2 + i3;
                int length3 = cArrEscape.length + i4;
                if (cArrCharBufferFromThreadLocal.length < length3) {
                    cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, length2, length3 + (length - index) + 32);
                }
                if (i3 > 0) {
                    s.getChars(i, index, cArrCharBufferFromThreadLocal, length2);
                    length2 = i4;
                }
                if (cArrEscape.length > 0) {
                    java.lang.System.arraycopy(cArrEscape, 0, cArrCharBufferFromThreadLocal, length2, cArrEscape.length);
                    length2 += cArrEscape.length;
                }
                i = i2;
            }
            index = nextEscapeIndex(s, i2, length);
        }
        int i5 = length - i;
        if (i5 > 0) {
            int i6 = i5 + length2;
            if (cArrCharBufferFromThreadLocal.length < i6) {
                cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, length2, i6);
            }
            s.getChars(i, length, cArrCharBufferFromThreadLocal, length2);
            length2 = i6;
        }
        return new java.lang.String(cArrCharBufferFromThreadLocal, 0, length2);
    }

    protected static int codePointAt(java.lang.CharSequence seq, int index, int end) {
        com.google.common.base.Preconditions.checkNotNull(seq);
        if (index < end) {
            int i = index + 1;
            char cCharAt = seq.charAt(index);
            if (cCharAt < 55296 || cCharAt > 57343) {
                return cCharAt;
            }
            if (cCharAt > 56319) {
                throw new java.lang.IllegalArgumentException("Unexpected low surrogate character '" + cCharAt + "' with value " + ((int) cCharAt) + " at index " + (i - 1) + " in '" + ((java.lang.Object) seq) + "'");
            }
            if (i == end) {
                return -cCharAt;
            }
            char cCharAt2 = seq.charAt(i);
            if (java.lang.Character.isLowSurrogate(cCharAt2)) {
                return java.lang.Character.toCodePoint(cCharAt, cCharAt2);
            }
            throw new java.lang.IllegalArgumentException("Expected low surrogate but got char '" + cCharAt2 + "' with value " + ((int) cCharAt2) + " at index " + i + " in '" + ((java.lang.Object) seq) + "'");
        }
        throw new java.lang.IndexOutOfBoundsException("Index exceeds specified range");
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
