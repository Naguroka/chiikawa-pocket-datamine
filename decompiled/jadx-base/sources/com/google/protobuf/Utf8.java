package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final com.google.protobuf.Utf8.Processor processor;

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    static {
        com.google.protobuf.Utf8.Processor safeProcessor;
        if (com.google.protobuf.Utf8.UnsafeProcessor.isAvailable() && !com.google.protobuf.Android.isOnAndroidDevice()) {
            safeProcessor = new com.google.protobuf.Utf8.UnsafeProcessor();
        } else {
            safeProcessor = new com.google.protobuf.Utf8.SafeProcessor();
        }
        processor = safeProcessor;
    }

    static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    static boolean isValidUtf8(byte[] bArr, int i, int i2) {
        return processor.isValidUtf8(bArr, i, i2);
    }

    static int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
        return processor.partialIsValidUtf8(i, bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return incompleteStateFor(b);
        }
        if (i3 == 1) {
            return incompleteStateFor(b, bArr[i]);
        }
        if (i3 == 2) {
            return incompleteStateFor(b, bArr[i], bArr[i + 1]);
        }
        throw new java.lang.AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(java.nio.ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            return incompleteStateFor(i);
        }
        if (i3 == 1) {
            return incompleteStateFor(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return incompleteStateFor(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        throw new java.lang.AssertionError();
    }

    static class UnpairedSurrogateException extends java.lang.IllegalArgumentException {
        UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    static int encodedLength(java.lang.CharSequence charSequence) {
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
                        throw new com.google.protobuf.Utf8.UnpairedSurrogateException(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    static int encode(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2) {
        return processor.encodeUtf8(charSequence, bArr, i, i2);
    }

    static boolean isValidUtf8(java.nio.ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    static int partialIsValidUtf8(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3) {
        return processor.partialIsValidUtf8(i, byteBuffer, i2, i3);
    }

    static java.lang.String decodeUtf8(java.nio.ByteBuffer byteBuffer, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
        return processor.decodeUtf8(byteBuffer, i, i2);
    }

    static java.lang.String decodeUtf8(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
        return processor.decodeUtf8(bArr, i, i2);
    }

    static void encodeUtf8(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & ASCII_MASK_LONG) == 0) {
            i4 += 8;
        }
        return i4 - i;
    }

    static abstract class Processor {
        abstract java.lang.String decodeUtf8(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException;

        abstract java.lang.String decodeUtf8Direct(java.nio.ByteBuffer byteBuffer, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException;

        abstract int encodeUtf8(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2);

        abstract void encodeUtf8Direct(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer);

        abstract int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3);

        abstract int partialIsValidUtf8Direct(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3);

        Processor() {
        }

        final boolean isValidUtf8(byte[] bArr, int i, int i2) {
            return partialIsValidUtf8(0, bArr, i, i2) == 0;
        }

        final boolean isValidUtf8(java.nio.ByteBuffer byteBuffer, int i, int i2) {
            return partialIsValidUtf8(0, byteBuffer, i, i2) == 0;
        }

        final int partialIsValidUtf8(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                return partialIsValidUtf8(i, byteBuffer.array(), i2 + iArrayOffset, iArrayOffset + i3);
            }
            if (byteBuffer.isDirect()) {
                return partialIsValidUtf8Direct(i, byteBuffer, i2, i3);
            }
            return partialIsValidUtf8Default(i, byteBuffer, i2, i3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final int partialIsValidUtf8Default(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3) {
            byte b;
            int i4;
            int i5;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        i5 = i2 + 1;
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte b3 = (byte) (~(i >> 8));
                    if (b3 == 0) {
                        int i6 = i2 + 1;
                        byte b4 = byteBuffer.get(i2);
                        if (i6 >= i3) {
                            return com.google.protobuf.Utf8.incompleteStateFor(b2, b4);
                        }
                        i2 = i6;
                        b3 = b4;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i5 = i2 + 1;
                    }
                    return -1;
                }
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    i4 = i2 + 1;
                    b5 = byteBuffer.get(i2);
                    if (i4 >= i3) {
                        return com.google.protobuf.Utf8.incompleteStateFor(b2, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                    i4 = i2;
                }
                if (b == 0) {
                    int i7 = i4 + 1;
                    byte b6 = byteBuffer.get(i4);
                    if (i7 >= i3) {
                        return com.google.protobuf.Utf8.incompleteStateFor(b2, b5, b6);
                    }
                    b = b6;
                    i4 = i7;
                }
                if (b5 <= -65 && (((b2 << 28) + (b5 + 112)) >> 30) == 0 && b <= -65) {
                    i2 = i4 + 1;
                }
                return -1;
                i2 = i5;
            }
            return partialIsValidUtf8(byteBuffer, i2, i3);
        }

        private static int partialIsValidUtf8(java.nio.ByteBuffer byteBuffer, int i, int i2) {
            int iEstimateConsecutiveAscii = i + com.google.protobuf.Utf8.estimateConsecutiveAscii(byteBuffer, i, i2);
            while (iEstimateConsecutiveAscii < i2) {
                int i3 = iEstimateConsecutiveAscii + 1;
                byte b = byteBuffer.get(iEstimateConsecutiveAscii);
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b < -62 || byteBuffer.get(i3) > -65) {
                            return -1;
                        }
                        i3++;
                    } else {
                        if (b >= -16) {
                            if (i3 >= i2 - 2) {
                                return com.google.protobuf.Utf8.incompleteStateFor(byteBuffer, b, i3, i2 - i3);
                            }
                            int i4 = i3 + 1;
                            byte b2 = byteBuffer.get(i3);
                            if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                                int i5 = i4 + 1;
                                if (byteBuffer.get(i4) <= -65) {
                                    i3 = i5 + 1;
                                    if (byteBuffer.get(i5) > -65) {
                                    }
                                }
                            }
                            return -1;
                        }
                        if (i3 >= i2 - 1) {
                            return com.google.protobuf.Utf8.incompleteStateFor(byteBuffer, b, i3, i2 - i3);
                        }
                        int i6 = i3 + 1;
                        byte b3 = byteBuffer.get(i3);
                        if (b3 > -65 || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || byteBuffer.get(i6) > -65))) {
                            return -1;
                        }
                        iEstimateConsecutiveAscii = i6 + 1;
                    }
                }
                iEstimateConsecutiveAscii = i3;
            }
            return 0;
        }

        final java.lang.String decodeUtf8(java.nio.ByteBuffer byteBuffer, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            }
            if (byteBuffer.isDirect()) {
                return decodeUtf8Direct(byteBuffer, i, i2);
            }
            return decodeUtf8Default(byteBuffer, i, i2);
        }

        final java.lang.String decodeUtf8Default(java.nio.ByteBuffer byteBuffer, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!com.google.protobuf.Utf8.DecodeUtil.isOneByte(b)) {
                    break;
                }
                i++;
                com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (com.google.protobuf.Utf8.DecodeUtil.isOneByte(b2)) {
                    int i7 = i5 + 1;
                    com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b2, cArr, i5);
                    while (i6 < i3) {
                        byte b3 = byteBuffer.get(i6);
                        if (!com.google.protobuf.Utf8.DecodeUtil.isOneByte(b3)) {
                            break;
                        }
                        i6++;
                        com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b3, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (com.google.protobuf.Utf8.DecodeUtil.isTwoBytes(b2)) {
                    if (i6 >= i3) {
                        throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    com.google.protobuf.Utf8.DecodeUtil.handleTwoBytes(b2, byteBuffer.get(i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (com.google.protobuf.Utf8.DecodeUtil.isThreeBytes(b2)) {
                    if (i6 >= i3 - 1) {
                        throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i8 = i6 + 1;
                    com.google.protobuf.Utf8.DecodeUtil.handleThreeBytes(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i9 = i6 + 1;
                    byte b4 = byteBuffer.get(i6);
                    int i10 = i9 + 1;
                    com.google.protobuf.Utf8.DecodeUtil.handleFourBytes(b2, b4, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                    i = i10 + 1;
                    i5 = i5 + 1 + 1;
                }
            }
            return new java.lang.String(cArr, 0, i5);
        }

        final void encodeUtf8(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        final void encodeUtf8Default(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
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
                    throw new com.google.protobuf.Utf8.UnpairedSurrogateException(i, length);
                }
                i++;
                iPosition++;
            }
        }
    }

    static final class SafeProcessor extends com.google.protobuf.Utf8.Processor {
        SafeProcessor() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
            byte b;
            int i4;
            int i5;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        i5 = i2 + 1;
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte b3 = (byte) (~(i >> 8));
                    if (b3 == 0) {
                        int i6 = i2 + 1;
                        byte b4 = bArr[i2];
                        if (i6 >= i3) {
                            return com.google.protobuf.Utf8.incompleteStateFor(b2, b4);
                        }
                        i2 = i6;
                        b3 = b4;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i5 = i2 + 1;
                    }
                    return -1;
                }
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    i4 = i2 + 1;
                    b5 = bArr[i2];
                    if (i4 >= i3) {
                        return com.google.protobuf.Utf8.incompleteStateFor(b2, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                    i4 = i2;
                }
                if (b == 0) {
                    int i7 = i4 + 1;
                    byte b6 = bArr[i4];
                    if (i7 >= i3) {
                        return com.google.protobuf.Utf8.incompleteStateFor(b2, b5, b6);
                    }
                    b = b6;
                    i4 = i7;
                }
                if (b5 <= -65 && (((b2 << 28) + (b5 + 112)) >> 30) == 0 && b <= -65) {
                    i2 = i4 + 1;
                }
                return -1;
                i2 = i5;
            }
            return partialIsValidUtf8(bArr, i2, i3);
        }

        @Override // com.google.protobuf.Utf8.Processor
        int partialIsValidUtf8Direct(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3) {
            return partialIsValidUtf8Default(i, byteBuffer, i2, i3);
        }

        @Override // com.google.protobuf.Utf8.Processor
        java.lang.String decodeUtf8(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!com.google.protobuf.Utf8.DecodeUtil.isOneByte(b)) {
                    break;
                }
                i++;
                com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (com.google.protobuf.Utf8.DecodeUtil.isOneByte(b2)) {
                    int i7 = i5 + 1;
                    com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b2, cArr, i5);
                    while (i6 < i3) {
                        byte b3 = bArr[i6];
                        if (!com.google.protobuf.Utf8.DecodeUtil.isOneByte(b3)) {
                            break;
                        }
                        i6++;
                        com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b3, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (com.google.protobuf.Utf8.DecodeUtil.isTwoBytes(b2)) {
                    if (i6 >= i3) {
                        throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    com.google.protobuf.Utf8.DecodeUtil.handleTwoBytes(b2, bArr[i6], cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (com.google.protobuf.Utf8.DecodeUtil.isThreeBytes(b2)) {
                    if (i6 >= i3 - 1) {
                        throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i8 = i6 + 1;
                    com.google.protobuf.Utf8.DecodeUtil.handleThreeBytes(b2, bArr[i6], bArr[i8], cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i9 = i6 + 1;
                    byte b4 = bArr[i6];
                    int i10 = i9 + 1;
                    com.google.protobuf.Utf8.DecodeUtil.handleFourBytes(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                    i = i10 + 1;
                    i5 = i5 + 1 + 1;
                }
            }
            return new java.lang.String(cArr, 0, i5);
        }

        @Override // com.google.protobuf.Utf8.Processor
        java.lang.String decodeUtf8Direct(java.nio.ByteBuffer byteBuffer, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
            return decodeUtf8Default(byteBuffer, i, i2);
        }

        @Override // com.google.protobuf.Utf8.Processor
        int encodeUtf8(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                                throw new com.google.protobuf.Utf8.UnpairedSurrogateException(i7 - 1, length);
                            }
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !java.lang.Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                                throw new com.google.protobuf.Utf8.UnpairedSurrogateException(i7, length);
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

        @Override // com.google.protobuf.Utf8.Processor
        void encodeUtf8Direct(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i, i2);
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i = i3 + 1;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b >= -16) {
                        if (i3 >= i2 - 2) {
                            return com.google.protobuf.Utf8.incompleteStateFor(bArr, i3, i2);
                        }
                        int i4 = i3 + 1;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                            int i5 = i4 + 1;
                            if (bArr[i4] <= -65) {
                                i3 = i5 + 1;
                                if (bArr[i5] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 1) {
                        return com.google.protobuf.Utf8.incompleteStateFor(bArr, i3, i2);
                    }
                    int i6 = i3 + 1;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                        i = i6 + 1;
                        if (bArr[i6] > -65) {
                        }
                    }
                    return -1;
                }
                i = i3;
            }
            return 0;
        }
    }

    static final class UnsafeProcessor extends com.google.protobuf.Utf8.Processor {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
            return com.google.protobuf.UnsafeUtil.hasUnsafeArrayOperations() && com.google.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r13, r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r13, r2) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
            long j;
            byte b = 0;
            if ((i2 | i3 | (bArr.length - i3)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("Array length=%d, index=%d, limit=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
            }
            long j2 = i2;
            long j3 = i3;
            if (i != 0) {
                if (j2 >= j3) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        long j4 = 1 + j2;
                        if (com.google.protobuf.UnsafeUtil.getByte(bArr, j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte b3 = (byte) (~(i >> 8));
                    if (b3 == 0) {
                        long j5 = j2 + 1;
                        b3 = com.google.protobuf.UnsafeUtil.getByte(bArr, j2);
                        if (j5 >= j3) {
                            return com.google.protobuf.Utf8.incompleteStateFor(b2, b3);
                        }
                        j2 = j5;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        j = j2 + 1;
                    }
                    return -1;
                }
                byte b4 = (byte) (~(i >> 8));
                if (b4 == 0) {
                    long j6 = j2 + 1;
                    b4 = com.google.protobuf.UnsafeUtil.getByte(bArr, j2);
                    if (j6 >= j3) {
                        return com.google.protobuf.Utf8.incompleteStateFor(b2, b4);
                    }
                    j2 = j6;
                } else {
                    b = (byte) (i >> 16);
                }
                if (b == 0) {
                    long j7 = j2 + 1;
                    b = com.google.protobuf.UnsafeUtil.getByte(bArr, j2);
                    if (j7 >= j3) {
                        return com.google.protobuf.Utf8.incompleteStateFor(b2, b4, b);
                    }
                    j2 = j7;
                }
                if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0 && b <= -65) {
                    j = j2 + 1;
                }
                return -1;
                j2 = j;
            }
            return partialIsValidUtf8(bArr, j2, (int) (j3 - j2));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r2) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int partialIsValidUtf8Direct(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3) {
            long j;
            byte b = 0;
            if ((i2 | i3 | (byteBuffer.limit() - i3)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
            }
            long jAddressOffset = com.google.protobuf.UnsafeUtil.addressOffset(byteBuffer) + ((long) i2);
            long j2 = ((long) (i3 - i2)) + jAddressOffset;
            if (i != 0) {
                if (jAddressOffset >= j2) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        long j3 = 1 + jAddressOffset;
                        if (com.google.protobuf.UnsafeUtil.getByte(jAddressOffset) <= -65) {
                            jAddressOffset = j3;
                        }
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte b3 = (byte) (~(i >> 8));
                    if (b3 == 0) {
                        long j4 = jAddressOffset + 1;
                        b3 = com.google.protobuf.UnsafeUtil.getByte(jAddressOffset);
                        if (j4 >= j2) {
                            return com.google.protobuf.Utf8.incompleteStateFor(b2, b3);
                        }
                        jAddressOffset = j4;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        j = jAddressOffset + 1;
                    }
                    return -1;
                }
                byte b4 = (byte) (~(i >> 8));
                if (b4 == 0) {
                    long j5 = jAddressOffset + 1;
                    b4 = com.google.protobuf.UnsafeUtil.getByte(jAddressOffset);
                    if (j5 >= j2) {
                        return com.google.protobuf.Utf8.incompleteStateFor(b2, b4);
                    }
                    jAddressOffset = j5;
                } else {
                    b = (byte) (i >> 16);
                }
                if (b == 0) {
                    long j6 = jAddressOffset + 1;
                    b = com.google.protobuf.UnsafeUtil.getByte(jAddressOffset);
                    if (j6 >= j2) {
                        return com.google.protobuf.Utf8.incompleteStateFor(b2, b4, b);
                    }
                    jAddressOffset = j6;
                }
                if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0 && b <= -65) {
                    j = jAddressOffset + 1;
                }
                return -1;
                jAddressOffset = j;
            }
            return partialIsValidUtf8(jAddressOffset, (int) (j2 - jAddressOffset));
        }

        @Override // com.google.protobuf.Utf8.Processor
        java.lang.String decodeUtf8(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
            java.lang.String str = new java.lang.String(bArr, i, i2, com.google.protobuf.Internal.UTF_8);
            if (str.contains("�") && !java.util.Arrays.equals(str.getBytes(com.google.protobuf.Internal.UTF_8), java.util.Arrays.copyOfRange(bArr, i, i2 + i))) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // com.google.protobuf.Utf8.Processor
        java.lang.String decodeUtf8Direct(java.nio.ByteBuffer byteBuffer, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            }
            long jAddressOffset = com.google.protobuf.UnsafeUtil.addressOffset(byteBuffer) + ((long) i);
            long j = ((long) i2) + jAddressOffset;
            char[] cArr = new char[i2];
            int i3 = 0;
            while (jAddressOffset < j) {
                byte b = com.google.protobuf.UnsafeUtil.getByte(jAddressOffset);
                if (!com.google.protobuf.Utf8.DecodeUtil.isOneByte(b)) {
                    break;
                }
                jAddressOffset++;
                com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b, cArr, i3);
                i3++;
            }
            while (true) {
                int i4 = i3;
                while (jAddressOffset < j) {
                    long j2 = jAddressOffset + 1;
                    byte b2 = com.google.protobuf.UnsafeUtil.getByte(jAddressOffset);
                    if (com.google.protobuf.Utf8.DecodeUtil.isOneByte(b2)) {
                        int i5 = i4 + 1;
                        com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b2, cArr, i4);
                        while (j2 < j) {
                            byte b3 = com.google.protobuf.UnsafeUtil.getByte(j2);
                            if (!com.google.protobuf.Utf8.DecodeUtil.isOneByte(b3)) {
                                break;
                            }
                            j2++;
                            com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b3, cArr, i5);
                            i5++;
                        }
                        i4 = i5;
                        jAddressOffset = j2;
                    } else if (com.google.protobuf.Utf8.DecodeUtil.isTwoBytes(b2)) {
                        if (j2 >= j) {
                            throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                        }
                        jAddressOffset = j2 + 1;
                        com.google.protobuf.Utf8.DecodeUtil.handleTwoBytes(b2, com.google.protobuf.UnsafeUtil.getByte(j2), cArr, i4);
                        i4++;
                    } else if (com.google.protobuf.Utf8.DecodeUtil.isThreeBytes(b2)) {
                        if (j2 >= j - 1) {
                            throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                        }
                        long j3 = j2 + 1;
                        com.google.protobuf.Utf8.DecodeUtil.handleThreeBytes(b2, com.google.protobuf.UnsafeUtil.getByte(j2), com.google.protobuf.UnsafeUtil.getByte(j3), cArr, i4);
                        i4++;
                        jAddressOffset = j3 + 1;
                    } else {
                        if (j2 >= j - 2) {
                            throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                        }
                        long j4 = j2 + 1;
                        byte b4 = com.google.protobuf.UnsafeUtil.getByte(j2);
                        long j5 = j4 + 1;
                        byte b5 = com.google.protobuf.UnsafeUtil.getByte(j4);
                        jAddressOffset = j5 + 1;
                        com.google.protobuf.Utf8.DecodeUtil.handleFourBytes(b2, b4, b5, com.google.protobuf.UnsafeUtil.getByte(j5), cArr, i4);
                        i3 = i4 + 1 + 1;
                    }
                }
                return new java.lang.String(cArr, 0, i4);
            }
        }

        @Override // com.google.protobuf.Utf8.Processor
        int encodeUtf8(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2) {
            char c;
            long j;
            long j2;
            long j3;
            char c2;
            int i3;
            char cCharAt;
            long j4 = i;
            long j5 = ((long) i2) + j4;
            int length = charSequence.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                c = 128;
                j = 1;
                if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                com.google.protobuf.UnsafeUtil.putByte(bArr, j4, (byte) cCharAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char cCharAt2 = charSequence.charAt(i4);
                if (cCharAt2 < c && j4 < j5) {
                    long j6 = j4 + j;
                    com.google.protobuf.UnsafeUtil.putByte(bArr, j4, (byte) cCharAt2);
                    j3 = j;
                    j2 = j6;
                    c2 = c;
                } else if (cCharAt2 < 2048 && j4 <= j5 - 2) {
                    long j7 = j4 + j;
                    com.google.protobuf.UnsafeUtil.putByte(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                    long j8 = j7 + j;
                    com.google.protobuf.UnsafeUtil.putByte(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                    long j9 = j;
                    c2 = 128;
                    j2 = j8;
                    j3 = j9;
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                        if (j4 <= j5 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char cCharAt3 = charSequence.charAt(i5);
                                if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                                    long j10 = j4 + 1;
                                    com.google.protobuf.UnsafeUtil.putByte(bArr, j4, (byte) ((codePoint >>> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK));
                                    long j11 = j10 + 1;
                                    c2 = 128;
                                    com.google.protobuf.UnsafeUtil.putByte(bArr, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j12 = j11 + 1;
                                    com.google.protobuf.UnsafeUtil.putByte(bArr, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j3 = 1;
                                    j2 = j12 + 1;
                                    com.google.protobuf.UnsafeUtil.putByte(bArr, j12, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new com.google.protobuf.Utf8.UnpairedSurrogateException(i4 - 1, length);
                        }
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !java.lang.Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                            throw new com.google.protobuf.Utf8.UnpairedSurrogateException(i4, length);
                        }
                        throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                    }
                    long j13 = j4 + j;
                    com.google.protobuf.UnsafeUtil.putByte(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j14 = j13 + j;
                    com.google.protobuf.UnsafeUtil.putByte(bArr, j13, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    com.google.protobuf.UnsafeUtil.putByte(bArr, j14, (byte) ((cCharAt2 & '?') | 128));
                    j2 = j14 + 1;
                    j3 = 1;
                    c2 = 128;
                }
                i4++;
                c = c2;
                long j15 = j3;
                j4 = j2;
                j = j15;
            }
            return (int) j4;
        }

        @Override // com.google.protobuf.Utf8.Processor
        void encodeUtf8Direct(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
            char c;
            long j;
            int i;
            int i2;
            char c2;
            char cCharAt;
            long jAddressOffset = com.google.protobuf.UnsafeUtil.addressOffset(byteBuffer);
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            long jLimit = ((long) byteBuffer.limit()) + jAddressOffset;
            int length = charSequence.length();
            if (length > jLimit - jPosition) {
                throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i3 = 0;
            while (true) {
                c = 128;
                if (i3 >= length || (cCharAt = charSequence.charAt(i3)) >= 128) {
                    break;
                }
                com.google.protobuf.UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i3++;
                jPosition++;
            }
            if (i3 == length) {
                return;
            }
            while (i3 < length) {
                char cCharAt2 = charSequence.charAt(i3);
                if (cCharAt2 >= c || jPosition >= jLimit) {
                    if (cCharAt2 >= 2048 || jPosition > jLimit - 2) {
                        j = jAddressOffset;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            if (jPosition <= jLimit - 4) {
                                i2 = i3 + 1;
                                if (i2 != length) {
                                    char cCharAt3 = charSequence.charAt(i2);
                                    if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                                        long j2 = jPosition + 1;
                                        com.google.protobuf.UnsafeUtil.putByte(jPosition, (byte) ((codePoint >>> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK));
                                        long j3 = j2 + 1;
                                        c2 = 128;
                                        com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j4 = j3 + 1;
                                        com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((codePoint >>> 6) & 63) | 128));
                                        com.google.protobuf.UnsafeUtil.putByte(j4, (byte) ((codePoint & 63) | 128));
                                        jPosition = j4 + 1;
                                    } else {
                                        i3 = i2;
                                    }
                                }
                                throw new com.google.protobuf.Utf8.UnpairedSurrogateException(i3 - 1, length);
                            }
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i = i3 + 1) == length || !java.lang.Character.isSurrogatePair(cCharAt2, charSequence.charAt(i)))) {
                                throw new com.google.protobuf.Utf8.UnpairedSurrogateException(i3, length);
                            }
                            throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                        }
                        long j5 = jPosition + 1;
                        com.google.protobuf.UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j6 = j5 + 1;
                        com.google.protobuf.UnsafeUtil.putByte(j5, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        com.google.protobuf.UnsafeUtil.putByte(j6, (byte) ((cCharAt2 & '?') | 128));
                        jPosition = j6 + 1;
                    } else {
                        j = jAddressOffset;
                        long j7 = jPosition + 1;
                        com.google.protobuf.UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        com.google.protobuf.UnsafeUtil.putByte(j7, (byte) ((cCharAt2 & '?') | 128));
                        jPosition = j7 + 1;
                    }
                    i2 = i3;
                    c2 = 128;
                } else {
                    com.google.protobuf.UnsafeUtil.putByte(jPosition, (byte) cCharAt2);
                    i2 = i3;
                    c2 = c;
                    jPosition++;
                    j = jAddressOffset;
                }
                c = c2;
                jAddressOffset = j;
                jLimit = jLimit;
                i3 = i2 + 1;
            }
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            int i3 = 8 - (((int) j) & 7);
            while (i2 < i3) {
                long j2 = 1 + j;
                if (com.google.protobuf.UnsafeUtil.getByte(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            while (true) {
                int i4 = i2 + 8;
                if (i4 > i || (com.google.protobuf.UnsafeUtil.getLong((java.lang.Object) bArr, com.google.protobuf.UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j) & com.google.protobuf.Utf8.ASCII_MASK_LONG) != 0) {
                    break;
                }
                j += 8;
                i2 = i4;
            }
            while (i2 < i) {
                long j3 = j + 1;
                if (com.google.protobuf.UnsafeUtil.getByte(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j3;
            }
            return i;
        }

        private static int unsafeEstimateConsecutiveAscii(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = (int) ((-j) & 7);
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (com.google.protobuf.UnsafeUtil.getByte(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (com.google.protobuf.UnsafeUtil.getLong(j) & com.google.protobuf.Utf8.ASCII_MASK_LONG) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        private static int partialIsValidUtf8(byte[] bArr, long j, int i) {
            long j2;
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bArr, j, i);
            int i2 = i - iUnsafeEstimateConsecutiveAscii;
            long j3 = j + ((long) iUnsafeEstimateConsecutiveAscii);
            while (true) {
                byte b = 0;
                while (i2 > 0) {
                    long j4 = j3 + 1;
                    b = com.google.protobuf.UnsafeUtil.getByte(bArr, j3);
                    if (b < 0) {
                        j3 = j4;
                        break;
                    }
                    i2--;
                    j3 = j4;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (b < -32) {
                    if (i3 == 0) {
                        return b;
                    }
                    i2 = i3 - 1;
                    if (b >= -62) {
                        j2 = 1 + j3;
                        if (com.google.protobuf.UnsafeUtil.getByte(bArr, j3) > -65) {
                        }
                    }
                    return -1;
                }
                if (b >= -16) {
                    if (i3 < 3) {
                        return unsafeIncompleteStateFor(bArr, b, j3, i3);
                    }
                    i2 = i3 - 3;
                    long j5 = j3 + 1;
                    byte b2 = com.google.protobuf.UnsafeUtil.getByte(bArr, j3);
                    if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                        long j6 = j5 + 1;
                        if (com.google.protobuf.UnsafeUtil.getByte(bArr, j5) <= -65) {
                            j2 = 1 + j6;
                            if (com.google.protobuf.UnsafeUtil.getByte(bArr, j6) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 < 2) {
                    return unsafeIncompleteStateFor(bArr, b, j3, i3);
                }
                i2 = i3 - 2;
                long j7 = j3 + 1;
                byte b3 = com.google.protobuf.UnsafeUtil.getByte(bArr, j3);
                if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                    j2 = 1 + j7;
                    if (com.google.protobuf.UnsafeUtil.getByte(bArr, j7) > -65) {
                    }
                }
                return -1;
                j3 = j2;
            }
        }

        private static int partialIsValidUtf8(long j, int i) {
            long j2;
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(j, i);
            long j3 = j + ((long) iUnsafeEstimateConsecutiveAscii);
            int i2 = i - iUnsafeEstimateConsecutiveAscii;
            while (true) {
                byte b = 0;
                while (i2 > 0) {
                    long j4 = j3 + 1;
                    b = com.google.protobuf.UnsafeUtil.getByte(j3);
                    if (b < 0) {
                        j3 = j4;
                        break;
                    }
                    i2--;
                    j3 = j4;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (b < -32) {
                    if (i3 == 0) {
                        return b;
                    }
                    i2 = i3 - 1;
                    if (b >= -62) {
                        j2 = 1 + j3;
                        if (com.google.protobuf.UnsafeUtil.getByte(j3) > -65) {
                        }
                    }
                    return -1;
                }
                if (b >= -16) {
                    if (i3 < 3) {
                        return unsafeIncompleteStateFor(j3, b, i3);
                    }
                    i2 = i3 - 3;
                    long j5 = j3 + 1;
                    byte b2 = com.google.protobuf.UnsafeUtil.getByte(j3);
                    if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                        long j6 = j5 + 1;
                        if (com.google.protobuf.UnsafeUtil.getByte(j5) <= -65) {
                            j2 = 1 + j6;
                            if (com.google.protobuf.UnsafeUtil.getByte(j6) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 < 2) {
                    return unsafeIncompleteStateFor(j3, b, i3);
                }
                i2 = i3 - 2;
                long j7 = j3 + 1;
                byte b3 = com.google.protobuf.UnsafeUtil.getByte(j3);
                if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                    j2 = 1 + j7;
                    if (com.google.protobuf.UnsafeUtil.getByte(j7) > -65) {
                    }
                }
                return -1;
                j3 = j2;
            }
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return com.google.protobuf.Utf8.incompleteStateFor(i);
            }
            if (i2 == 1) {
                return com.google.protobuf.Utf8.incompleteStateFor(i, com.google.protobuf.UnsafeUtil.getByte(bArr, j));
            }
            if (i2 == 2) {
                return com.google.protobuf.Utf8.incompleteStateFor(i, com.google.protobuf.UnsafeUtil.getByte(bArr, j), com.google.protobuf.UnsafeUtil.getByte(bArr, j + 1));
            }
            throw new java.lang.AssertionError();
        }

        private static int unsafeIncompleteStateFor(long j, int i, int i2) {
            if (i2 == 0) {
                return com.google.protobuf.Utf8.incompleteStateFor(i);
            }
            if (i2 == 1) {
                return com.google.protobuf.Utf8.incompleteStateFor(i, com.google.protobuf.UnsafeUtil.getByte(j));
            }
            if (i2 == 2) {
                return com.google.protobuf.Utf8.incompleteStateFor(i, com.google.protobuf.UnsafeUtil.getByte(j), com.google.protobuf.UnsafeUtil.getByte(j + 1));
            }
            throw new java.lang.AssertionError();
        }
    }

    private static class DecodeUtil {
        private static char highSurrogate(int i) {
            return (char) ((i >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean isNotTrailingByte(byte b) {
            return b > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b) {
            return b >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b) {
            return b < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b) {
            return b < -32;
        }

        private static char lowSurrogate(int i) {
            return (char) ((i & 1023) + okio.Utf8.LOG_SURROGATE_HEADER);
        }

        private static int trailingByteValue(byte b) {
            return b & okio.Utf8.REPLACEMENT_BYTE;
        }

        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b, byte b2, char[] cArr, int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (b < -62 || isNotTrailingByte(b2)) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 31) << 6) | trailingByteValue(b2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b, byte b2, byte b3, char[] cArr, int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (isNotTrailingByte(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || isNotTrailingByte(b3)))) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 15) << 12) | (trailingByteValue(b2) << 6) | trailingByteValue(b3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (isNotTrailingByte(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || isNotTrailingByte(b3) || isNotTrailingByte(b4)) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
            }
            int iTrailingByteValue = ((b & 7) << 18) | (trailingByteValue(b2) << 12) | (trailingByteValue(b3) << 6) | trailingByteValue(b4);
            cArr[i] = highSurrogate(iTrailingByteValue);
            cArr[i + 1] = lowSurrogate(iTrailingByteValue);
        }
    }

    private Utf8() {
    }
}
