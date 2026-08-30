package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final androidx.datastore.preferences.protobuf.Utf8.Processor processor;

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1) {
        if (byte1 > -12) {
            return -1;
        }
        return byte1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1, int byte2) {
        if (byte1 > -12 || byte2 > -65) {
            return -1;
        }
        return byte1 ^ (byte2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1, int byte2, int byte3) {
        if (byte1 > -12 || byte2 > -65 || byte3 > -65) {
            return -1;
        }
        return (byte1 ^ (byte2 << 8)) ^ (byte3 << 16);
    }

    static {
        androidx.datastore.preferences.protobuf.Utf8.Processor safeProcessor;
        if (androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.isAvailable() && !androidx.datastore.preferences.protobuf.Android.isOnAndroidDevice()) {
            safeProcessor = new androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor();
        } else {
            safeProcessor = new androidx.datastore.preferences.protobuf.Utf8.SafeProcessor();
        }
        processor = safeProcessor;
    }

    static boolean isValidUtf8(byte[] bytes) {
        return processor.isValidUtf8(bytes, 0, bytes.length);
    }

    static boolean isValidUtf8(byte[] bytes, int index, int limit) {
        return processor.isValidUtf8(bytes, index, limit);
    }

    static int partialIsValidUtf8(int state, byte[] bytes, int index, int limit) {
        return processor.partialIsValidUtf8(state, bytes, index, limit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bytes, int index, int limit) {
        byte b = bytes[index - 1];
        int i = limit - index;
        if (i == 0) {
            return incompleteStateFor(b);
        }
        if (i == 1) {
            return incompleteStateFor(b, bytes[index]);
        }
        if (i == 2) {
            return incompleteStateFor(b, bytes[index], bytes[index + 1]);
        }
        throw new java.lang.AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(final java.nio.ByteBuffer buffer, final int byte1, final int index, final int remaining) {
        if (remaining == 0) {
            return incompleteStateFor(byte1);
        }
        if (remaining == 1) {
            return incompleteStateFor(byte1, buffer.get(index));
        }
        if (remaining == 2) {
            return incompleteStateFor(byte1, buffer.get(index), buffer.get(index + 1));
        }
        throw new java.lang.AssertionError();
    }

    static class UnpairedSurrogateException extends java.lang.IllegalArgumentException {
        UnpairedSurrogateException(int index, int length) {
            super("Unpaired surrogate at index " + index + " of " + length);
        }
    }

    static int encodedLength(java.lang.String string) {
        int length = string.length();
        int i = 0;
        while (i < length && string.charAt(i) < 128) {
            i++;
        }
        int iEncodedLengthGeneral = length;
        while (i < length) {
            char cCharAt = string.charAt(i);
            if (cCharAt >= 2048) {
                iEncodedLengthGeneral += encodedLengthGeneral(string, i);
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

    private static int encodedLengthGeneral(java.lang.String string, int start) {
        int length = string.length();
        int i = 0;
        while (start < length) {
            char cCharAt = string.charAt(start);
            if (cCharAt < 2048) {
                i += (127 - cCharAt) >>> 31;
            } else {
                i += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (java.lang.Character.codePointAt(string, start) < 65536) {
                        throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(start, length);
                    }
                    start++;
                }
            }
            start++;
        }
        return i;
    }

    static int encode(java.lang.String in, byte[] out, int offset, int length) {
        return processor.encodeUtf8(in, out, offset, length);
    }

    static boolean isValidUtf8(java.nio.ByteBuffer buffer) {
        return processor.isValidUtf8(buffer, buffer.position(), buffer.remaining());
    }

    static int partialIsValidUtf8(int state, java.nio.ByteBuffer buffer, int index, int limit) {
        return processor.partialIsValidUtf8(state, buffer, index, limit);
    }

    static java.lang.String decodeUtf8(java.nio.ByteBuffer buffer, int index, int size) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return processor.decodeUtf8(buffer, index, size);
    }

    static java.lang.String decodeUtf8(byte[] bytes, int index, int size) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return processor.decodeUtf8(bytes, index, size);
    }

    static void encodeUtf8(java.lang.String in, java.nio.ByteBuffer out) {
        processor.encodeUtf8(in, out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(java.nio.ByteBuffer buffer, int index, int limit) {
        int i = limit - 7;
        int i2 = index;
        while (i2 < i && (buffer.getLong(i2) & ASCII_MASK_LONG) == 0) {
            i2 += 8;
        }
        return i2 - index;
    }

    static abstract class Processor {
        abstract java.lang.String decodeUtf8(byte[] bytes, int index, int size) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

        abstract java.lang.String decodeUtf8Direct(java.nio.ByteBuffer buffer, int index, int size) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

        abstract int encodeUtf8(java.lang.String in, byte[] out, int offset, int length);

        abstract void encodeUtf8Direct(java.lang.String in, java.nio.ByteBuffer out);

        abstract int partialIsValidUtf8(int state, byte[] bytes, int index, int limit);

        abstract int partialIsValidUtf8Direct(final int state, final java.nio.ByteBuffer buffer, int index, final int limit);

        Processor() {
        }

        final boolean isValidUtf8(byte[] bytes, int index, int limit) {
            return partialIsValidUtf8(0, bytes, index, limit) == 0;
        }

        final boolean isValidUtf8(java.nio.ByteBuffer buffer, int index, int limit) {
            return partialIsValidUtf8(0, buffer, index, limit) == 0;
        }

        final int partialIsValidUtf8(final int state, final java.nio.ByteBuffer buffer, int index, final int limit) {
            if (buffer.hasArray()) {
                int iArrayOffset = buffer.arrayOffset();
                return partialIsValidUtf8(state, buffer.array(), index + iArrayOffset, iArrayOffset + limit);
            }
            if (buffer.isDirect()) {
                return partialIsValidUtf8Direct(state, buffer, index, limit);
            }
            return partialIsValidUtf8Default(state, buffer, index, limit);
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
        final int partialIsValidUtf8Default(final int state, final java.nio.ByteBuffer buffer, int index, final int limit) {
            byte b;
            int i;
            int i2;
            if (state != 0) {
                if (index >= limit) {
                    return state;
                }
                byte b2 = (byte) state;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        i2 = index + 1;
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte b3 = (byte) (~(state >> 8));
                    if (b3 == 0) {
                        int i3 = index + 1;
                        byte b4 = buffer.get(index);
                        if (i3 >= limit) {
                            return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(b2, b4);
                        }
                        index = i3;
                        b3 = b4;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i2 = index + 1;
                    }
                    return -1;
                }
                byte b5 = (byte) (~(state >> 8));
                if (b5 == 0) {
                    i = index + 1;
                    b5 = buffer.get(index);
                    if (i >= limit) {
                        return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(b2, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (state >> 16);
                    i = index;
                }
                if (b == 0) {
                    int i4 = i + 1;
                    byte b6 = buffer.get(i);
                    if (i4 >= limit) {
                        return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(b2, b5, b6);
                    }
                    b = b6;
                    i = i4;
                }
                if (b5 <= -65 && (((b2 << 28) + (b5 + 112)) >> 30) == 0 && b <= -65) {
                    index = i + 1;
                }
                return -1;
                index = i2;
            }
            return partialIsValidUtf8(buffer, index, limit);
        }

        private static int partialIsValidUtf8(final java.nio.ByteBuffer buffer, int index, final int limit) {
            int iEstimateConsecutiveAscii = index + androidx.datastore.preferences.protobuf.Utf8.estimateConsecutiveAscii(buffer, index, limit);
            while (iEstimateConsecutiveAscii < limit) {
                int i = iEstimateConsecutiveAscii + 1;
                byte b = buffer.get(iEstimateConsecutiveAscii);
                if (b < 0) {
                    if (b < -32) {
                        if (i >= limit) {
                            return b;
                        }
                        if (b < -62 || buffer.get(i) > -65) {
                            return -1;
                        }
                        i++;
                    } else {
                        if (b >= -16) {
                            if (i >= limit - 2) {
                                return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(buffer, b, i, limit - i);
                            }
                            int i2 = i + 1;
                            byte b2 = buffer.get(i);
                            if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                                int i3 = i2 + 1;
                                if (buffer.get(i2) <= -65) {
                                    i = i3 + 1;
                                    if (buffer.get(i3) > -65) {
                                    }
                                }
                            }
                            return -1;
                        }
                        if (i >= limit - 1) {
                            return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(buffer, b, i, limit - i);
                        }
                        int i4 = i + 1;
                        byte b3 = buffer.get(i);
                        if (b3 > -65 || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || buffer.get(i4) > -65))) {
                            return -1;
                        }
                        iEstimateConsecutiveAscii = i4 + 1;
                    }
                }
                iEstimateConsecutiveAscii = i;
            }
            return 0;
        }

        final java.lang.String decodeUtf8(java.nio.ByteBuffer buffer, int index, int size) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (buffer.hasArray()) {
                return decodeUtf8(buffer.array(), buffer.arrayOffset() + index, size);
            }
            if (buffer.isDirect()) {
                return decodeUtf8Direct(buffer, index, size);
            }
            return decodeUtf8Default(buffer, index, size);
        }

        final java.lang.String decodeUtf8Default(java.nio.ByteBuffer buffer, int index, int size) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if ((index | size | ((buffer.limit() - index) - size)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(buffer.limit()), java.lang.Integer.valueOf(index), java.lang.Integer.valueOf(size)));
            }
            int i = index + size;
            char[] cArr = new char[size];
            int i2 = 0;
            while (index < i) {
                byte b = buffer.get(index);
                if (!androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.isOneByte(b)) {
                    break;
                }
                index++;
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleOneByte(b, cArr, i2);
                i2++;
            }
            int i3 = i2;
            while (index < i) {
                int i4 = index + 1;
                byte b2 = buffer.get(index);
                if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.isOneByte(b2)) {
                    int i5 = i3 + 1;
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleOneByte(b2, cArr, i3);
                    while (i4 < i) {
                        byte b3 = buffer.get(i4);
                        if (!androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.isOneByte(b3)) {
                            break;
                        }
                        i4++;
                        androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleOneByte(b3, cArr, i5);
                        i5++;
                    }
                    index = i4;
                    i3 = i5;
                } else if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.isTwoBytes(b2)) {
                    if (i4 >= i) {
                        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleTwoBytes(b2, buffer.get(i4), cArr, i3);
                    index = i4 + 1;
                    i3++;
                } else if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.isThreeBytes(b2)) {
                    if (i4 >= i - 1) {
                        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i6 = i4 + 1;
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleThreeBytes(b2, buffer.get(i4), buffer.get(i6), cArr, i3);
                    index = i6 + 1;
                    i3++;
                } else {
                    if (i4 >= i - 2) {
                        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i7 = i4 + 1;
                    byte b4 = buffer.get(i4);
                    int i8 = i7 + 1;
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleFourBytes(b2, b4, buffer.get(i7), buffer.get(i8), cArr, i3);
                    index = i8 + 1;
                    i3 = i3 + 1 + 1;
                }
            }
            return new java.lang.String(cArr, 0, i3);
        }

        final void encodeUtf8(java.lang.String in, java.nio.ByteBuffer out) {
            if (out.hasArray()) {
                int iArrayOffset = out.arrayOffset();
                androidx.datastore.preferences.protobuf.Java8Compatibility.position(out, androidx.datastore.preferences.protobuf.Utf8.encode(in, out.array(), out.position() + iArrayOffset, out.remaining()) - iArrayOffset);
            } else if (out.isDirect()) {
                encodeUtf8Direct(in, out);
            } else {
                encodeUtf8Default(in, out);
            }
        }

        final void encodeUtf8Default(java.lang.String in, java.nio.ByteBuffer out) {
            int length = in.length();
            int iPosition = out.position();
            int i = 0;
            while (i < length) {
                try {
                    char cCharAt = in.charAt(i);
                    if (cCharAt >= 128) {
                        break;
                    }
                    out.put(iPosition + i, (byte) cCharAt);
                    i++;
                } catch (java.lang.IndexOutOfBoundsException unused) {
                }
            }
            if (i == length) {
                androidx.datastore.preferences.protobuf.Java8Compatibility.position(out, iPosition + i);
                return;
            }
            iPosition += i;
            while (i < length) {
                char cCharAt2 = in.charAt(i);
                if (cCharAt2 < 128) {
                    out.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i2 = iPosition + 1;
                    try {
                        out.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        out.put(i2, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i2;
                    } catch (java.lang.IndexOutOfBoundsException unused2) {
                        iPosition = i2;
                    }
                } else if (cCharAt2 < 55296 || 57343 < cCharAt2) {
                    int i3 = iPosition + 1;
                    out.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition = i3 + 1;
                    out.put(i3, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    out.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    int i4 = i + 1;
                    if (i4 != length) {
                        try {
                            char cCharAt3 = in.charAt(i4);
                            if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                                int i5 = iPosition + 1;
                                try {
                                    out.put(iPosition, (byte) ((codePoint >>> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK));
                                    iPosition = i5 + 1;
                                    out.put(i5, (byte) (((codePoint >>> 12) & 63) | 128));
                                    i5 = iPosition + 1;
                                    out.put(iPosition, (byte) (((codePoint >>> 6) & 63) | 128));
                                    out.put(i5, (byte) ((codePoint & 63) | 128));
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
                        throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(i) + " at index " + (out.position() + java.lang.Math.max(i, (iPosition - out.position()) + 1)));
                    }
                    throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(i, length);
                }
                i++;
                iPosition++;
            }
            androidx.datastore.preferences.protobuf.Java8Compatibility.position(out, iPosition);
        }
    }

    static final class SafeProcessor extends androidx.datastore.preferences.protobuf.Utf8.Processor {
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
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int partialIsValidUtf8(int state, byte[] bytes, int index, int limit) {
            byte b;
            int i;
            int i2;
            if (state != 0) {
                if (index >= limit) {
                    return state;
                }
                byte b2 = (byte) state;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        i2 = index + 1;
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte b3 = (byte) (~(state >> 8));
                    if (b3 == 0) {
                        int i3 = index + 1;
                        byte b4 = bytes[index];
                        if (i3 >= limit) {
                            return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(b2, b4);
                        }
                        index = i3;
                        b3 = b4;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i2 = index + 1;
                    }
                    return -1;
                }
                byte b5 = (byte) (~(state >> 8));
                if (b5 == 0) {
                    i = index + 1;
                    b5 = bytes[index];
                    if (i >= limit) {
                        return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(b2, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (state >> 16);
                    i = index;
                }
                if (b == 0) {
                    int i4 = i + 1;
                    byte b6 = bytes[i];
                    if (i4 >= limit) {
                        return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(b2, b5, b6);
                    }
                    b = b6;
                    i = i4;
                }
                if (b5 <= -65 && (((b2 << 28) + (b5 + 112)) >> 30) == 0 && b <= -65) {
                    index = i + 1;
                }
                return -1;
                index = i2;
            }
            return partialIsValidUtf8(bytes, index, limit);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int partialIsValidUtf8Direct(int state, java.nio.ByteBuffer buffer, int index, int limit) {
            return partialIsValidUtf8Default(state, buffer, index, limit);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        java.lang.String decodeUtf8(byte[] bytes, int index, int size) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if ((index | size | ((bytes.length - index) - size)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(bytes.length), java.lang.Integer.valueOf(index), java.lang.Integer.valueOf(size)));
            }
            int i = index + size;
            char[] cArr = new char[size];
            int i2 = 0;
            while (index < i) {
                byte b = bytes[index];
                if (!androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.isOneByte(b)) {
                    break;
                }
                index++;
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleOneByte(b, cArr, i2);
                i2++;
            }
            int i3 = i2;
            while (index < i) {
                int i4 = index + 1;
                byte b2 = bytes[index];
                if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.isOneByte(b2)) {
                    int i5 = i3 + 1;
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleOneByte(b2, cArr, i3);
                    while (i4 < i) {
                        byte b3 = bytes[i4];
                        if (!androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.isOneByte(b3)) {
                            break;
                        }
                        i4++;
                        androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleOneByte(b3, cArr, i5);
                        i5++;
                    }
                    index = i4;
                    i3 = i5;
                } else if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.isTwoBytes(b2)) {
                    if (i4 >= i) {
                        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleTwoBytes(b2, bytes[i4], cArr, i3);
                    index = i4 + 1;
                    i3++;
                } else if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.isThreeBytes(b2)) {
                    if (i4 >= i - 1) {
                        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i6 = i4 + 1;
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleThreeBytes(b2, bytes[i4], bytes[i6], cArr, i3);
                    index = i6 + 1;
                    i3++;
                } else {
                    if (i4 >= i - 2) {
                        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i7 = i4 + 1;
                    byte b4 = bytes[i4];
                    int i8 = i7 + 1;
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleFourBytes(b2, b4, bytes[i7], bytes[i8], cArr, i3);
                    index = i8 + 1;
                    i3 = i3 + 1 + 1;
                }
            }
            return new java.lang.String(cArr, 0, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        java.lang.String decodeUtf8Direct(java.nio.ByteBuffer buffer, int index, int size) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return decodeUtf8Default(buffer, index, size);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int encodeUtf8(java.lang.String in, byte[] out, int offset, int length) {
            int i;
            int i2;
            int i3;
            char cCharAt;
            int length2 = in.length();
            int i4 = length + offset;
            int i5 = 0;
            while (i5 < length2 && (i3 = i5 + offset) < i4 && (cCharAt = in.charAt(i5)) < 128) {
                out[i3] = (byte) cCharAt;
                i5++;
            }
            if (i5 == length2) {
                return offset + length2;
            }
            int i6 = offset + i5;
            while (i5 < length2) {
                char cCharAt2 = in.charAt(i5);
                if (cCharAt2 >= 128 || i6 >= i4) {
                    if (cCharAt2 < 2048 && i6 <= i4 - 2) {
                        int i7 = i6 + 1;
                        out[i6] = (byte) ((cCharAt2 >>> 6) | 960);
                        i6 = i7 + 1;
                        out[i7] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i6 > i4 - 3) {
                            if (i6 <= i4 - 4) {
                                int i8 = i5 + 1;
                                if (i8 != in.length()) {
                                    char cCharAt3 = in.charAt(i8);
                                    if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                                        int i9 = i6 + 1;
                                        out[i6] = (byte) ((codePoint >>> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
                                        int i10 = i9 + 1;
                                        out[i9] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i11 = i10 + 1;
                                        out[i10] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i6 = i11 + 1;
                                        out[i11] = (byte) ((codePoint & 63) | 128);
                                        i5 = i8;
                                    } else {
                                        i5 = i8;
                                    }
                                }
                                throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(i5 - 1, length2);
                            }
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i2 = i5 + 1) == in.length() || !java.lang.Character.isSurrogatePair(cCharAt2, in.charAt(i2)))) {
                                throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(i5, length2);
                            }
                            throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i6);
                        }
                        int i12 = i6 + 1;
                        out[i6] = (byte) ((cCharAt2 >>> '\f') | 480);
                        int i13 = i12 + 1;
                        out[i12] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        i = i13 + 1;
                        out[i13] = (byte) ((cCharAt2 & '?') | 128);
                    }
                    i5++;
                } else {
                    i = i6 + 1;
                    out[i6] = (byte) cCharAt2;
                }
                i6 = i;
                i5++;
            }
            return i6;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        void encodeUtf8Direct(java.lang.String in, java.nio.ByteBuffer out) {
            encodeUtf8Default(in, out);
        }

        private static int partialIsValidUtf8(byte[] bytes, int index, int limit) {
            while (index < limit && bytes[index] >= 0) {
                index++;
            }
            if (index >= limit) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bytes, index, limit);
        }

        private static int partialIsValidUtf8NonAscii(byte[] bytes, int index, int limit) {
            while (index < limit) {
                int i = index + 1;
                byte b = bytes[index];
                if (b < 0) {
                    if (b < -32) {
                        if (i >= limit) {
                            return b;
                        }
                        if (b >= -62) {
                            index = i + 1;
                            if (bytes[i] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b >= -16) {
                        if (i >= limit - 2) {
                            return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(bytes, i, limit);
                        }
                        int i2 = i + 1;
                        byte b2 = bytes[i];
                        if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                            int i3 = i2 + 1;
                            if (bytes[i2] <= -65) {
                                i = i3 + 1;
                                if (bytes[i3] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i >= limit - 1) {
                        return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(bytes, i, limit);
                    }
                    int i4 = i + 1;
                    byte b3 = bytes[i];
                    if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                        index = i4 + 1;
                        if (bytes[i4] > -65) {
                        }
                    }
                    return -1;
                }
                index = i;
            }
            return 0;
        }
    }

    static final class UnsafeProcessor extends androidx.datastore.preferences.protobuf.Utf8.Processor {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
            return androidx.datastore.preferences.protobuf.UnsafeUtil.hasUnsafeArrayOperations() && androidx.datastore.preferences.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r13, r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r13, r2) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int partialIsValidUtf8(int state, byte[] bytes, final int index, final int limit) {
            long j;
            byte b = 0;
            if ((index | limit | (bytes.length - limit)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("Array length=%d, index=%d, limit=%d", java.lang.Integer.valueOf(bytes.length), java.lang.Integer.valueOf(index), java.lang.Integer.valueOf(limit)));
            }
            long j2 = index;
            long j3 = limit;
            if (state != 0) {
                if (j2 >= j3) {
                    return state;
                }
                byte b2 = (byte) state;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        long j4 = 1 + j2;
                        if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(bytes, j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte b3 = (byte) (~(state >> 8));
                    if (b3 == 0) {
                        long j5 = j2 + 1;
                        b3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(bytes, j2);
                        if (j5 >= j3) {
                            return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(b2, b3);
                        }
                        j2 = j5;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        j = j2 + 1;
                    }
                    return -1;
                }
                byte b4 = (byte) (~(state >> 8));
                if (b4 == 0) {
                    long j6 = j2 + 1;
                    b4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(bytes, j2);
                    if (j6 >= j3) {
                        return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(b2, b4);
                    }
                    j2 = j6;
                } else {
                    b = (byte) (state >> 16);
                }
                if (b == 0) {
                    long j7 = j2 + 1;
                    b = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(bytes, j2);
                    if (j7 >= j3) {
                        return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(b2, b4, b);
                    }
                    j2 = j7;
                }
                if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0 && b <= -65) {
                    j = j2 + 1;
                }
                return -1;
                j2 = j;
            }
            return partialIsValidUtf8(bytes, j2, (int) (j3 - j2));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r2) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int partialIsValidUtf8Direct(final int state, java.nio.ByteBuffer buffer, final int index, final int limit) {
            long j;
            byte b = 0;
            if ((index | limit | (buffer.limit() - limit)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(buffer.limit()), java.lang.Integer.valueOf(index), java.lang.Integer.valueOf(limit)));
            }
            long jAddressOffset = androidx.datastore.preferences.protobuf.UnsafeUtil.addressOffset(buffer) + ((long) index);
            long j2 = ((long) (limit - index)) + jAddressOffset;
            if (state != 0) {
                if (jAddressOffset >= j2) {
                    return state;
                }
                byte b2 = (byte) state;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        long j3 = 1 + jAddressOffset;
                        if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(jAddressOffset) <= -65) {
                            jAddressOffset = j3;
                        }
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte b3 = (byte) (~(state >> 8));
                    if (b3 == 0) {
                        long j4 = jAddressOffset + 1;
                        b3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(jAddressOffset);
                        if (j4 >= j2) {
                            return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(b2, b3);
                        }
                        jAddressOffset = j4;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        j = jAddressOffset + 1;
                    }
                    return -1;
                }
                byte b4 = (byte) (~(state >> 8));
                if (b4 == 0) {
                    long j5 = jAddressOffset + 1;
                    b4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(jAddressOffset);
                    if (j5 >= j2) {
                        return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(b2, b4);
                    }
                    jAddressOffset = j5;
                } else {
                    b = (byte) (state >> 16);
                }
                if (b == 0) {
                    long j6 = jAddressOffset + 1;
                    b = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(jAddressOffset);
                    if (j6 >= j2) {
                        return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(b2, b4, b);
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

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        java.lang.String decodeUtf8(byte[] bytes, int index, int size) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            java.lang.String str = new java.lang.String(bytes, index, size, androidx.datastore.preferences.protobuf.Internal.UTF_8);
            if (str.indexOf(okio.Utf8.REPLACEMENT_CODE_POINT) >= 0 && !java.util.Arrays.equals(str.getBytes(androidx.datastore.preferences.protobuf.Internal.UTF_8), java.util.Arrays.copyOfRange(bytes, index, size + index))) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        java.lang.String decodeUtf8Direct(java.nio.ByteBuffer buffer, int index, int size) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if ((index | size | ((buffer.limit() - index) - size)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(buffer.limit()), java.lang.Integer.valueOf(index), java.lang.Integer.valueOf(size)));
            }
            long jAddressOffset = androidx.datastore.preferences.protobuf.UnsafeUtil.addressOffset(buffer) + ((long) index);
            long j = ((long) size) + jAddressOffset;
            char[] cArr = new char[size];
            int i = 0;
            while (jAddressOffset < j) {
                byte b = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(jAddressOffset);
                if (!androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.isOneByte(b)) {
                    break;
                }
                jAddressOffset++;
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleOneByte(b, cArr, i);
                i++;
            }
            while (true) {
                int i2 = i;
                while (jAddressOffset < j) {
                    long j2 = jAddressOffset + 1;
                    byte b2 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(jAddressOffset);
                    if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.isOneByte(b2)) {
                        int i3 = i2 + 1;
                        androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleOneByte(b2, cArr, i2);
                        while (j2 < j) {
                            byte b3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j2);
                            if (!androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.isOneByte(b3)) {
                                break;
                            }
                            j2++;
                            androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleOneByte(b3, cArr, i3);
                            i3++;
                        }
                        i2 = i3;
                        jAddressOffset = j2;
                    } else if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.isTwoBytes(b2)) {
                        if (j2 >= j) {
                            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8();
                        }
                        jAddressOffset = j2 + 1;
                        androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleTwoBytes(b2, androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j2), cArr, i2);
                        i2++;
                    } else if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.isThreeBytes(b2)) {
                        if (j2 >= j - 1) {
                            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8();
                        }
                        long j3 = j2 + 1;
                        androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleThreeBytes(b2, androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j2), androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j3), cArr, i2);
                        i2++;
                        jAddressOffset = j3 + 1;
                    } else {
                        if (j2 >= j - 2) {
                            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8();
                        }
                        long j4 = j2 + 1;
                        byte b4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j2);
                        long j5 = j4 + 1;
                        byte b5 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4);
                        jAddressOffset = j5 + 1;
                        androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleFourBytes(b2, b4, b5, androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j5), cArr, i2);
                        i = i2 + 1 + 1;
                    }
                }
                return new java.lang.String(cArr, 0, i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int encodeUtf8(final java.lang.String in, final byte[] out, final int offset, final int length) {
            char c;
            long j;
            long j2;
            long j3;
            char c2;
            int i;
            char cCharAt;
            long j4 = offset;
            long j5 = ((long) length) + j4;
            int length2 = in.length();
            if (length2 > length || out.length - length < offset) {
                throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(length2 - 1) + " at index " + (offset + length));
            }
            int i2 = 0;
            while (true) {
                c = 128;
                j = 1;
                if (i2 >= length2 || (cCharAt = in.charAt(i2)) >= 128) {
                    break;
                }
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(out, j4, (byte) cCharAt);
                i2++;
                j4 = 1 + j4;
            }
            if (i2 == length2) {
                return (int) j4;
            }
            while (i2 < length2) {
                char cCharAt2 = in.charAt(i2);
                if (cCharAt2 < c && j4 < j5) {
                    long j6 = j4 + j;
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(out, j4, (byte) cCharAt2);
                    j3 = j;
                    j2 = j6;
                    c2 = c;
                } else if (cCharAt2 < 2048 && j4 <= j5 - 2) {
                    long j7 = j4 + j;
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(out, j4, (byte) ((cCharAt2 >>> 6) | 960));
                    long j8 = j7 + j;
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(out, j7, (byte) ((cCharAt2 & '?') | 128));
                    long j9 = j;
                    c2 = 128;
                    j2 = j8;
                    j3 = j9;
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                        if (j4 <= j5 - 4) {
                            int i3 = i2 + 1;
                            if (i3 != length2) {
                                char cCharAt3 = in.charAt(i3);
                                if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                                    long j10 = j4 + 1;
                                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(out, j4, (byte) ((codePoint >>> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK));
                                    long j11 = j10 + 1;
                                    c2 = 128;
                                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(out, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j12 = j11 + 1;
                                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(out, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j3 = 1;
                                    j2 = j12 + 1;
                                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(out, j12, (byte) ((codePoint & 63) | 128));
                                    i2 = i3;
                                } else {
                                    i2 = i3;
                                }
                            }
                            throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(i2 - 1, length2);
                        }
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i = i2 + 1) == length2 || !java.lang.Character.isSurrogatePair(cCharAt2, in.charAt(i)))) {
                            throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(i2, length2);
                        }
                        throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                    }
                    long j13 = j4 + j;
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(out, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j14 = j13 + j;
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(out, j13, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(out, j14, (byte) ((cCharAt2 & '?') | 128));
                    j2 = j14 + 1;
                    j3 = 1;
                    c2 = 128;
                }
                i2++;
                c = c2;
                long j15 = j3;
                j4 = j2;
                j = j15;
            }
            return (int) j4;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        void encodeUtf8Direct(java.lang.String in, java.nio.ByteBuffer out) {
            char c;
            long j;
            int i;
            int i2;
            char c2;
            char cCharAt;
            long jAddressOffset = androidx.datastore.preferences.protobuf.UnsafeUtil.addressOffset(out);
            long jPosition = ((long) out.position()) + jAddressOffset;
            long jLimit = ((long) out.limit()) + jAddressOffset;
            int length = in.length();
            if (length > jLimit - jPosition) {
                throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(length - 1) + " at index " + out.limit());
            }
            int i3 = 0;
            while (true) {
                c = 128;
                if (i3 >= length || (cCharAt = in.charAt(i3)) >= 128) {
                    break;
                }
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i3++;
                jPosition++;
            }
            if (i3 == length) {
                androidx.datastore.preferences.protobuf.Java8Compatibility.position(out, (int) (jPosition - jAddressOffset));
                return;
            }
            while (i3 < length) {
                char cCharAt2 = in.charAt(i3);
                if (cCharAt2 >= c || jPosition >= jLimit) {
                    if (cCharAt2 >= 2048 || jPosition > jLimit - 2) {
                        j = jAddressOffset;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            if (jPosition <= jLimit - 4) {
                                i2 = i3 + 1;
                                if (i2 != length) {
                                    char cCharAt3 = in.charAt(i2);
                                    if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                                        long j2 = jPosition + 1;
                                        androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(jPosition, (byte) ((codePoint >>> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK));
                                        long j3 = j2 + 1;
                                        c2 = 128;
                                        androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j4 = j3 + 1;
                                        androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(j3, (byte) (((codePoint >>> 6) & 63) | 128));
                                        androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(j4, (byte) ((codePoint & 63) | 128));
                                        jPosition = j4 + 1;
                                    } else {
                                        i3 = i2;
                                    }
                                }
                                throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(i3 - 1, length);
                            }
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i = i3 + 1) == length || !java.lang.Character.isSurrogatePair(cCharAt2, in.charAt(i)))) {
                                throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(i3, length);
                            }
                            throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                        }
                        long j5 = jPosition + 1;
                        androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j6 = j5 + 1;
                        androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(j5, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(j6, (byte) ((cCharAt2 & '?') | 128));
                        jPosition = j6 + 1;
                    } else {
                        j = jAddressOffset;
                        long j7 = jPosition + 1;
                        androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(j7, (byte) ((cCharAt2 & '?') | 128));
                        jPosition = j7 + 1;
                    }
                    i2 = i3;
                    c2 = 128;
                } else {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(jPosition, (byte) cCharAt2);
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
            androidx.datastore.preferences.protobuf.Java8Compatibility.position(out, (int) (jPosition - jAddressOffset));
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bytes, long offset, final int maxChars) {
            int i = 0;
            if (maxChars < 16) {
                return 0;
            }
            int i2 = 8 - (((int) offset) & 7);
            while (i < i2) {
                long j = 1 + offset;
                if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(bytes, offset) < 0) {
                    return i;
                }
                i++;
                offset = j;
            }
            while (true) {
                int i3 = i + 8;
                if (i3 > maxChars || (androidx.datastore.preferences.protobuf.UnsafeUtil.getLong((java.lang.Object) bytes, androidx.datastore.preferences.protobuf.UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + offset) & androidx.datastore.preferences.protobuf.Utf8.ASCII_MASK_LONG) != 0) {
                    break;
                }
                offset += 8;
                i = i3;
            }
            while (i < maxChars) {
                long j2 = offset + 1;
                if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(bytes, offset) < 0) {
                    return i;
                }
                i++;
                offset = j2;
            }
            return maxChars;
        }

        private static int unsafeEstimateConsecutiveAscii(long address, final int maxChars) {
            if (maxChars < 16) {
                return 0;
            }
            int i = (int) ((-address) & 7);
            int i2 = i;
            while (i2 > 0) {
                long j = 1 + address;
                if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(address) < 0) {
                    return i - i2;
                }
                i2--;
                address = j;
            }
            int i3 = maxChars - i;
            while (i3 >= 8 && (androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(address) & androidx.datastore.preferences.protobuf.Utf8.ASCII_MASK_LONG) == 0) {
                address += 8;
                i3 -= 8;
            }
            return maxChars - i3;
        }

        private static int partialIsValidUtf8(final byte[] bytes, long offset, int remaining) {
            long j;
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bytes, offset, remaining);
            int i = remaining - iUnsafeEstimateConsecutiveAscii;
            long j2 = offset + ((long) iUnsafeEstimateConsecutiveAscii);
            while (true) {
                byte b = 0;
                while (i > 0) {
                    long j3 = j2 + 1;
                    b = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(bytes, j2);
                    if (b < 0) {
                        j2 = j3;
                        break;
                    }
                    i--;
                    j2 = j3;
                }
                if (i == 0) {
                    return 0;
                }
                int i2 = i - 1;
                if (b < -32) {
                    if (i2 == 0) {
                        return b;
                    }
                    i = i2 - 1;
                    if (b >= -62) {
                        j = 1 + j2;
                        if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(bytes, j2) > -65) {
                        }
                    }
                    return -1;
                }
                if (b >= -16) {
                    if (i2 < 3) {
                        return unsafeIncompleteStateFor(bytes, b, j2, i2);
                    }
                    i = i2 - 3;
                    long j4 = j2 + 1;
                    byte b2 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(bytes, j2);
                    if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                        long j5 = j4 + 1;
                        if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(bytes, j4) <= -65) {
                            j = 1 + j5;
                            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(bytes, j5) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i2 < 2) {
                    return unsafeIncompleteStateFor(bytes, b, j2, i2);
                }
                i = i2 - 2;
                long j6 = j2 + 1;
                byte b3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(bytes, j2);
                if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                    j = 1 + j6;
                    if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(bytes, j6) > -65) {
                    }
                }
                return -1;
                j2 = j;
            }
        }

        private static int partialIsValidUtf8(long address, int remaining) {
            long j;
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(address, remaining);
            long j2 = address + ((long) iUnsafeEstimateConsecutiveAscii);
            int i = remaining - iUnsafeEstimateConsecutiveAscii;
            while (true) {
                byte b = 0;
                while (i > 0) {
                    long j3 = j2 + 1;
                    b = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j2);
                    if (b < 0) {
                        j2 = j3;
                        break;
                    }
                    i--;
                    j2 = j3;
                }
                if (i == 0) {
                    return 0;
                }
                int i2 = i - 1;
                if (b < -32) {
                    if (i2 == 0) {
                        return b;
                    }
                    i = i2 - 1;
                    if (b >= -62) {
                        j = 1 + j2;
                        if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j2) > -65) {
                        }
                    }
                    return -1;
                }
                if (b >= -16) {
                    if (i2 < 3) {
                        return unsafeIncompleteStateFor(j2, b, i2);
                    }
                    i = i2 - 3;
                    long j4 = j2 + 1;
                    byte b2 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j2);
                    if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                        long j5 = j4 + 1;
                        if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4) <= -65) {
                            j = 1 + j5;
                            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j5) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i2 < 2) {
                    return unsafeIncompleteStateFor(j2, b, i2);
                }
                i = i2 - 2;
                long j6 = j2 + 1;
                byte b3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j2);
                if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                    j = 1 + j6;
                    if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j6) > -65) {
                    }
                }
                return -1;
                j2 = j;
            }
        }

        private static int unsafeIncompleteStateFor(byte[] bytes, int byte1, long offset, int remaining) {
            if (remaining == 0) {
                return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(byte1);
            }
            if (remaining == 1) {
                return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(byte1, androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(bytes, offset));
            }
            if (remaining == 2) {
                return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(byte1, androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(bytes, offset), androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(bytes, offset + 1));
            }
            throw new java.lang.AssertionError();
        }

        private static int unsafeIncompleteStateFor(long address, final int byte1, int remaining) {
            if (remaining == 0) {
                return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(byte1);
            }
            if (remaining == 1) {
                return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(byte1, androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(address));
            }
            if (remaining == 2) {
                return androidx.datastore.preferences.protobuf.Utf8.incompleteStateFor(byte1, androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(address), androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(address + 1));
            }
            throw new java.lang.AssertionError();
        }
    }

    private static class DecodeUtil {
        private static char highSurrogate(int codePoint) {
            return (char) ((codePoint >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
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

        private static char lowSurrogate(int codePoint) {
            return (char) ((codePoint & 1023) + okio.Utf8.LOG_SURROGATE_HEADER);
        }

        private static int trailingByteValue(byte b) {
            return b & okio.Utf8.REPLACEMENT_BYTE;
        }

        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte byte1, char[] resultArr, int resultPos) {
            resultArr[resultPos] = (char) byte1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte byte1, byte byte2, char[] resultArr, int resultPos) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (byte1 < -62 || isNotTrailingByte(byte2)) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8();
            }
            resultArr[resultPos] = (char) (((byte1 & 31) << 6) | trailingByteValue(byte2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte byte1, byte byte2, byte byte3, char[] resultArr, int resultPos) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (isNotTrailingByte(byte2) || ((byte1 == -32 && byte2 < -96) || ((byte1 == -19 && byte2 >= -96) || isNotTrailingByte(byte3)))) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8();
            }
            resultArr[resultPos] = (char) (((byte1 & 15) << 12) | (trailingByteValue(byte2) << 6) | trailingByteValue(byte3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte byte1, byte byte2, byte byte3, byte byte4, char[] resultArr, int resultPos) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (isNotTrailingByte(byte2) || (((byte1 << 28) + (byte2 + 112)) >> 30) != 0 || isNotTrailingByte(byte3) || isNotTrailingByte(byte4)) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8();
            }
            int iTrailingByteValue = ((byte1 & 7) << 18) | (trailingByteValue(byte2) << 12) | (trailingByteValue(byte3) << 6) | trailingByteValue(byte4);
            resultArr[resultPos] = highSurrogate(iTrailingByteValue);
            resultArr[resultPos + 1] = lowSurrogate(iTrailingByteValue);
        }
    }

    private Utf8() {
    }
}
