package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Utf8 {
    public static int encodedLength(java.lang.CharSequence sequence) {
        int length = sequence.length();
        int i = 0;
        while (i < length && sequence.charAt(i) < 128) {
            i++;
        }
        int iEncodedLengthGeneral = length;
        while (i < length) {
            char cCharAt = sequence.charAt(i);
            if (cCharAt >= 2048) {
                iEncodedLengthGeneral += encodedLengthGeneral(sequence, i);
                break;
            }
            iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
            i++;
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new java.lang.IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(java.lang.CharSequence sequence, int start) {
        int length = sequence.length();
        int i = 0;
        while (start < length) {
            char cCharAt = sequence.charAt(start);
            if (cCharAt < 2048) {
                i += (127 - cCharAt) >>> 31;
            } else {
                i += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (java.lang.Character.codePointAt(sequence, start) == cCharAt) {
                        throw new java.lang.IllegalArgumentException(unpairedSurrogateMsg(start));
                    }
                    start++;
                }
            }
            start++;
        }
        return i;
    }

    public static boolean isWellFormed(byte[] bytes) {
        return isWellFormed(bytes, 0, bytes.length);
    }

    public static boolean isWellFormed(byte[] bytes, int off, int len) {
        int i = len + off;
        com.google.common.base.Preconditions.checkPositionIndexes(off, i, bytes.length);
        while (off < i) {
            if (bytes[off] < 0) {
                return isWellFormedSlowPath(bytes, off, i);
            }
            off++;
        }
        return true;
    }

    private static boolean isWellFormedSlowPath(byte[] bytes, int off, int end) {
        byte b;
        while (off < end) {
            int i = off + 1;
            byte b2 = bytes[off];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i != end && b2 >= -62) {
                        off = i + 1;
                        if (bytes[i] > -65) {
                        }
                    }
                    return false;
                }
                if (b2 < -16) {
                    int i2 = i + 1;
                    if (i2 < end && (b = bytes[i]) <= -65 && ((b2 != -32 || b >= -96) && (b2 != -19 || -96 > b))) {
                        off = i2 + 1;
                        if (bytes[i2] > -65) {
                        }
                    }
                    return false;
                }
                if (i + 2 >= end) {
                    return false;
                }
                int i3 = i + 1;
                byte b3 = bytes[i];
                if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                    int i4 = i3 + 1;
                    if (bytes[i3] <= -65) {
                        i = i4 + 1;
                        if (bytes[i4] > -65) {
                        }
                    }
                }
                return false;
            }
            off = i;
        }
        return true;
    }

    private static java.lang.String unpairedSurrogateMsg(int i) {
        return "Unpaired surrogate at index " + i;
    }

    private Utf8() {
    }
}
