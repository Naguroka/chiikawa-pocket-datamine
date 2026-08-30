package com.google.flatbuffers;

/* JADX INFO: loaded from: classes5.dex */
public final class Utf8Safe extends com.google.flatbuffers.Utf8 {
    private static int computeEncodedLength(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iEncodedLengthGeneral = length;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt >= 2048) {
                iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i);
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

    private static int encodedLengthGeneral(java.lang.CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (java.lang.Character.codePointAt(charSequence, i) < 65536) {
                        throw new com.google.flatbuffers.Utf8Safe.UnpairedSurrogateException(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    public static java.lang.String decodeUtf8Array(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!com.google.flatbuffers.Utf8.DecodeUtil.isOneByte(b)) {
                break;
            }
            i++;
            com.google.flatbuffers.Utf8.DecodeUtil.handleOneByte(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (com.google.flatbuffers.Utf8.DecodeUtil.isOneByte(b2)) {
                int i7 = i5 + 1;
                com.google.flatbuffers.Utf8.DecodeUtil.handleOneByte(b2, cArr, i5);
                while (i6 < i3) {
                    byte b3 = bArr[i6];
                    if (!com.google.flatbuffers.Utf8.DecodeUtil.isOneByte(b3)) {
                        break;
                    }
                    i6++;
                    com.google.flatbuffers.Utf8.DecodeUtil.handleOneByte(b3, cArr, i7);
                    i7++;
                }
                i = i6;
                i5 = i7;
            } else if (com.google.flatbuffers.Utf8.DecodeUtil.isTwoBytes(b2)) {
                if (i6 >= i3) {
                    throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                }
                com.google.flatbuffers.Utf8.DecodeUtil.handleTwoBytes(b2, bArr[i6], cArr, i5);
                i = i6 + 1;
                i5++;
            } else if (com.google.flatbuffers.Utf8.DecodeUtil.isThreeBytes(b2)) {
                if (i6 >= i3 - 1) {
                    throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                }
                int i8 = i6 + 1;
                com.google.flatbuffers.Utf8.DecodeUtil.handleThreeBytes(b2, bArr[i6], bArr[i8], cArr, i5);
                i = i8 + 1;
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                }
                int i9 = i6 + 1;
                byte b4 = bArr[i6];
                int i10 = i9 + 1;
                com.google.flatbuffers.Utf8.DecodeUtil.handleFourBytes(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                i = i10 + 1;
                i5 = i5 + 1 + 1;
            }
        }
        return new java.lang.String(cArr, 0, i5);
    }

    public static java.lang.String decodeUtf8Buffer(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!com.google.flatbuffers.Utf8.DecodeUtil.isOneByte(b)) {
                break;
            }
            i++;
            com.google.flatbuffers.Utf8.DecodeUtil.handleOneByte(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (com.google.flatbuffers.Utf8.DecodeUtil.isOneByte(b2)) {
                int i7 = i5 + 1;
                com.google.flatbuffers.Utf8.DecodeUtil.handleOneByte(b2, cArr, i5);
                while (i6 < i3) {
                    byte b3 = byteBuffer.get(i6);
                    if (!com.google.flatbuffers.Utf8.DecodeUtil.isOneByte(b3)) {
                        break;
                    }
                    i6++;
                    com.google.flatbuffers.Utf8.DecodeUtil.handleOneByte(b3, cArr, i7);
                    i7++;
                }
                i = i6;
                i5 = i7;
            } else if (com.google.flatbuffers.Utf8.DecodeUtil.isTwoBytes(b2)) {
                if (i6 >= i3) {
                    throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                }
                com.google.flatbuffers.Utf8.DecodeUtil.handleTwoBytes(b2, byteBuffer.get(i6), cArr, i5);
                i = i6 + 1;
                i5++;
            } else if (com.google.flatbuffers.Utf8.DecodeUtil.isThreeBytes(b2)) {
                if (i6 >= i3 - 1) {
                    throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                }
                int i8 = i6 + 1;
                com.google.flatbuffers.Utf8.DecodeUtil.handleThreeBytes(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                i = i8 + 1;
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                }
                int i9 = i6 + 1;
                byte b4 = byteBuffer.get(i6);
                int i10 = i9 + 1;
                com.google.flatbuffers.Utf8.DecodeUtil.handleFourBytes(b2, b4, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                i = i10 + 1;
                i5 = i5 + 1 + 1;
            }
        }
        return new java.lang.String(cArr, 0, i5);
    }

    @Override // com.google.flatbuffers.Utf8
    public int encodedLength(java.lang.CharSequence charSequence) {
        return computeEncodedLength(charSequence);
    }

    @Override // com.google.flatbuffers.Utf8
    public java.lang.String decodeUtf8(java.nio.ByteBuffer byteBuffer, int i, int i2) throws java.lang.IllegalArgumentException {
        if (byteBuffer.hasArray()) {
            return decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        return decodeUtf8Buffer(byteBuffer, i, i2);
    }

    private static void encodeUtf8Buffer(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i, (byte) cCharAt);
                i++;
            } catch (java.lang.IndexOutOfBoundsException unused) {
            }
        }
        if (i == length) {
            byteBuffer.position(iPosition + i);
            return;
        }
        iPosition += i;
        while (i < length) {
            char cCharAt2 = charSequence.charAt(i);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i2 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i2, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i2;
                } catch (java.lang.IndexOutOfBoundsException unused2) {
                    iPosition = i2;
                }
            } else if (cCharAt2 < 55296 || 57343 < cCharAt2) {
                int i3 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                iPosition = i3 + 1;
                byteBuffer.put(i3, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            } else {
                int i4 = i + 1;
                if (i4 != length) {
                    try {
                        char cCharAt3 = charSequence.charAt(i4);
                        if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                            int i5 = iPosition + 1;
                            try {
                                byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK));
                                iPosition = i5 + 1;
                                byteBuffer.put(i5, (byte) (((codePoint >>> 12) & 63) | 128));
                                i5 = iPosition + 1;
                                byteBuffer.put(iPosition, (byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put(i5, (byte) ((codePoint & 63) | 128));
                                iPosition = i5;
                                i = i4;
                            } catch (java.lang.IndexOutOfBoundsException unused3) {
                                iPosition = i5;
                            }
                        } else {
                            i = i4;
                        }
                    } catch (java.lang.IndexOutOfBoundsException unused4) {
                    }
                    i = i4;
                    throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (byteBuffer.position() + java.lang.Math.max(i, (iPosition - byteBuffer.position()) + 1)));
                }
                throw new com.google.flatbuffers.Utf8Safe.UnpairedSurrogateException(i, length);
            }
            i++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    private static int encodeUtf8Array(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char cCharAt;
        int length = charSequence.length();
        int i6 = i2 + i;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i) < i6 && (cCharAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) cCharAt;
            i7++;
        }
        if (i7 == length) {
            return i + length;
        }
        int i8 = i + i7;
        while (i7 < length) {
            char cCharAt2 = charSequence.charAt(i7);
            if (cCharAt2 >= 128 || i8 >= i6) {
                if (cCharAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i8 > i6 - 3) {
                        if (i8 <= i6 - 4) {
                            int i10 = i7 + 1;
                            if (i10 != charSequence.length()) {
                                char cCharAt3 = charSequence.charAt(i10);
                                if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i11 = i8 + 1;
                                    bArr[i8] = (byte) ((codePoint >>> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
                                    int i12 = i11 + 1;
                                    bArr[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i13 = i12 + 1;
                                    bArr[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i8 = i13 + 1;
                                    bArr[i13] = (byte) ((codePoint & 63) | 128);
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new com.google.flatbuffers.Utf8Safe.UnpairedSurrogateException(i7 - 1, length);
                        }
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !java.lang.Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                            throw new com.google.flatbuffers.Utf8Safe.UnpairedSurrogateException(i7, length);
                        }
                        throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i8);
                    }
                    int i14 = i8 + 1;
                    bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i3 = i15 + 1;
                    bArr[i15] = (byte) ((cCharAt2 & '?') | 128);
                }
                i7++;
            } else {
                i3 = i8 + 1;
                bArr[i8] = (byte) cCharAt2;
            }
            i8 = i3;
            i7++;
        }
        return i8;
    }

    @Override // com.google.flatbuffers.Utf8
    public void encodeUtf8(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(encodeUtf8Array(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
        } else {
            encodeUtf8Buffer(charSequence, byteBuffer);
        }
    }

    static class UnpairedSurrogateException extends java.lang.IllegalArgumentException {
        UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }
}
