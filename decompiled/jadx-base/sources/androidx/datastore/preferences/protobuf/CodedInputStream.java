package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    androidx.datastore.preferences.protobuf.CodedInputStreamReader wrapper;

    public static int decodeZigZag32(final int n) {
        return (-(n & 1)) ^ (n >>> 1);
    }

    public static long decodeZigZag64(final long n) {
        return (-(n & 1)) ^ (n >>> 1);
    }

    public abstract void checkLastTagWas(final int value) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    public abstract void enableAliasing(boolean enabled);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws java.io.IOException;

    public abstract void popLimit(final int oldLimit);

    public abstract int pushLimit(int byteLimit) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    public abstract boolean readBool() throws java.io.IOException;

    public abstract byte[] readByteArray() throws java.io.IOException;

    public abstract java.nio.ByteBuffer readByteBuffer() throws java.io.IOException;

    public abstract androidx.datastore.preferences.protobuf.ByteString readBytes() throws java.io.IOException;

    public abstract double readDouble() throws java.io.IOException;

    public abstract int readEnum() throws java.io.IOException;

    public abstract int readFixed32() throws java.io.IOException;

    public abstract long readFixed64() throws java.io.IOException;

    public abstract float readFloat() throws java.io.IOException;

    public abstract <T extends androidx.datastore.preferences.protobuf.MessageLite> T readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

    public abstract void readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

    public abstract int readInt32() throws java.io.IOException;

    public abstract long readInt64() throws java.io.IOException;

    public abstract <T extends androidx.datastore.preferences.protobuf.MessageLite> T readMessage(final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

    public abstract void readMessage(final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

    public abstract byte readRawByte() throws java.io.IOException;

    public abstract byte[] readRawBytes(final int size) throws java.io.IOException;

    public abstract int readRawLittleEndian32() throws java.io.IOException;

    public abstract long readRawLittleEndian64() throws java.io.IOException;

    public abstract int readRawVarint32() throws java.io.IOException;

    public abstract long readRawVarint64() throws java.io.IOException;

    abstract long readRawVarint64SlowPath() throws java.io.IOException;

    public abstract int readSFixed32() throws java.io.IOException;

    public abstract long readSFixed64() throws java.io.IOException;

    public abstract int readSInt32() throws java.io.IOException;

    public abstract long readSInt64() throws java.io.IOException;

    public abstract java.lang.String readString() throws java.io.IOException;

    public abstract java.lang.String readStringRequireUtf8() throws java.io.IOException;

    public abstract int readTag() throws java.io.IOException;

    public abstract int readUInt32() throws java.io.IOException;

    public abstract long readUInt64() throws java.io.IOException;

    @java.lang.Deprecated
    public abstract void readUnknownGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder) throws java.io.IOException;

    public abstract void resetSizeCounter();

    public abstract boolean skipField(final int tag) throws java.io.IOException;

    @java.lang.Deprecated
    public abstract boolean skipField(final int tag, final androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException;

    public abstract void skipRawBytes(final int size) throws java.io.IOException;

    public static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(final java.io.InputStream input) {
        return newInstance(input, 4096);
    }

    public static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(final java.io.InputStream input, int bufferSize) {
        if (bufferSize <= 0) {
            throw new java.lang.IllegalArgumentException("bufferSize must be > 0");
        }
        if (input == null) {
            return newInstance(androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY);
        }
        return new androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder(input, bufferSize);
    }

    public static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(final java.lang.Iterable<java.nio.ByteBuffer> input) {
        if (!androidx.datastore.preferences.protobuf.CodedInputStream.UnsafeDirectNioDecoder.isSupported()) {
            return newInstance(new androidx.datastore.preferences.protobuf.IterableByteBufferInputStream(input));
        }
        return newInstance(input, false);
    }

    static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(final java.lang.Iterable<java.nio.ByteBuffer> bufs, final boolean bufferIsImmutable) {
        int i = 0;
        int iRemaining = 0;
        for (java.nio.ByteBuffer byteBuffer : bufs) {
            iRemaining += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i |= 1;
            } else {
                i = byteBuffer.isDirect() ? i | 2 : i | 4;
            }
        }
        if (i == 2) {
            return new androidx.datastore.preferences.protobuf.CodedInputStream.IterableDirectByteBufferDecoder(bufs, iRemaining, bufferIsImmutable);
        }
        return newInstance(new androidx.datastore.preferences.protobuf.IterableByteBufferInputStream(bufs));
    }

    public static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(final byte[] buf) {
        return newInstance(buf, 0, buf.length);
    }

    public static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(final byte[] buf, final int off, final int len) {
        return newInstance(buf, off, len, false);
    }

    static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(final byte[] buf, final int off, final int len, final boolean bufferIsImmutable) {
        androidx.datastore.preferences.protobuf.CodedInputStream.ArrayDecoder arrayDecoder = new androidx.datastore.preferences.protobuf.CodedInputStream.ArrayDecoder(buf, off, len, bufferIsImmutable);
        try {
            arrayDecoder.pushLimit(len);
            return arrayDecoder;
        } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer buf) {
        return newInstance(buf, false);
    }

    static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer buf, boolean bufferIsImmutable) {
        if (buf.hasArray()) {
            return newInstance(buf.array(), buf.arrayOffset() + buf.position(), buf.remaining(), bufferIsImmutable);
        }
        if (buf.isDirect() && androidx.datastore.preferences.protobuf.CodedInputStream.UnsafeDirectNioDecoder.isSupported()) {
            return new androidx.datastore.preferences.protobuf.CodedInputStream.UnsafeDirectNioDecoder(buf, bufferIsImmutable);
        }
        int iRemaining = buf.remaining();
        byte[] bArr = new byte[iRemaining];
        buf.duplicate().get(bArr);
        return newInstance(bArr, 0, iRemaining, true);
    }

    public void checkRecursionLimit() throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        if (this.recursionDepth >= this.recursionLimit) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    private CodedInputStream() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public void skipMessage() throws java.io.IOException {
        boolean zSkipField;
        do {
            int tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            zSkipField = skipField(tag);
            this.recursionDepth--;
        } while (zSkipField);
    }

    public void skipMessage(androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
        boolean zSkipField;
        do {
            int tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            zSkipField = skipField(tag, output);
            this.recursionDepth--;
        } while (zSkipField);
    }

    public final int setRecursionLimit(final int limit) {
        if (limit < 0) {
            throw new java.lang.IllegalArgumentException("Recursion limit cannot be negative: " + limit);
        }
        int i = this.recursionLimit;
        this.recursionLimit = limit;
        return i;
    }

    public final int setSizeLimit(final int limit) {
        if (limit < 0) {
            throw new java.lang.IllegalArgumentException("Size limit cannot be negative: " + limit);
        }
        int i = this.sizeLimit;
        this.sizeLimit = limit;
        return i;
    }

    final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public static int readRawVarint32(final int firstByte, final java.io.InputStream input) throws java.io.IOException {
        if ((firstByte & 128) == 0) {
            return firstByte;
        }
        int i = firstByte & 127;
        int i2 = 7;
        while (i2 < 32) {
            int i3 = input.read();
            if (i3 == -1) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            i |= (i3 & 127) << i2;
            if ((i3 & 128) == 0) {
                return i;
            }
            i2 += 7;
        }
        while (i2 < 64) {
            int i4 = input.read();
            if (i4 == -1) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i4 & 128) == 0) {
                return i;
            }
            i2 += 7;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
    }

    static int readRawVarint32(final java.io.InputStream input) throws java.io.IOException {
        int i = input.read();
        if (i == -1) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        return readRawVarint32(i, input);
    }

    private static final class ArrayDecoder extends androidx.datastore.preferences.protobuf.CodedInputStream {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        private ArrayDecoder(final byte[] buffer, final int offset, final int len, boolean immutable) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = buffer;
            this.limit = len + offset;
            this.pos = offset;
            this.startPos = offset;
            this.immutable = immutable;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(rawVarint32) == 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(final int value) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (this.lastTag != value) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(final int tag) throws java.io.IOException {
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(final int tag, final androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                long int64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                androidx.datastore.preferences.protobuf.ByteString bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iMakeTag = androidx.datastore.preferences.protobuf.WireFormat.makeTag(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag), 4);
                checkLastTagWas(iMakeTag);
                output.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                output.writeUInt32NoTag(tag);
                output.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= this.limit - this.pos) {
                java.lang.String str = new java.lang.String(this.buffer, this.pos, rawVarint32, androidx.datastore.preferences.protobuf.Internal.UTF_8);
                this.pos += rawVarint32;
                return str;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (rawVarint32 <= i - i2) {
                    java.lang.String strDecodeUtf8 = androidx.datastore.preferences.protobuf.Utf8.decodeUtf8(this.buffer, i2, rawVarint32);
                    this.pos += rawVarint32;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends androidx.datastore.preferences.protobuf.MessageLite> T readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(fieldNumber, builder, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends androidx.datastore.preferences.protobuf.MessageLite> T readMessage(final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public androidx.datastore.preferences.protobuf.ByteString readBytes() throws java.io.IOException {
            androidx.datastore.preferences.protobuf.ByteString byteStringCopyFrom;
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (rawVarint32 <= i - i2) {
                    if (this.immutable && this.enableAliasing) {
                        byteStringCopyFrom = androidx.datastore.preferences.protobuf.ByteString.wrap(this.buffer, i2, rawVarint32);
                    } else {
                        byteStringCopyFrom = androidx.datastore.preferences.protobuf.ByteString.copyFrom(this.buffer, i2, rawVarint32);
                    }
                    this.pos += rawVarint32;
                    return byteStringCopyFrom;
                }
            }
            if (rawVarint32 == 0) {
                return androidx.datastore.preferences.protobuf.ByteString.EMPTY;
            }
            return androidx.datastore.preferences.protobuf.ByteString.wrap(readRawBytes(rawVarint32));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
            java.nio.ByteBuffer byteBufferWrap;
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (rawVarint32 <= i - i2) {
                    if (!this.immutable && this.enableAliasing) {
                        byteBufferWrap = java.nio.ByteBuffer.wrap(this.buffer, i2, rawVarint32).slice();
                    } else {
                        byteBufferWrap = java.nio.ByteBuffer.wrap(java.util.Arrays.copyOfRange(this.buffer, i2, i2 + rawVarint32));
                    }
                    this.pos += rawVarint32;
                    return byteBufferWrap;
                }
            }
            if (rawVarint32 == 0) {
                return androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int readRawVarint32() throws java.io.IOException {
            int i;
            int i2 = this.pos;
            int i3 = this.limit;
            if (i3 != i2) {
                byte[] bArr = this.buffer;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.pos = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                i7 = i5 + 1;
                                byte b2 = bArr[i5];
                                i = (i9 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i5 = i7 + 1;
                                    if (bArr[i7] < 0) {
                                        i7 = i5 + 1;
                                        if (bArr[i5] < 0) {
                                            i5 = i7 + 1;
                                            if (bArr[i7] < 0) {
                                                i7 = i5 + 1;
                                                if (bArr[i5] < 0) {
                                                    i5 = i7 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i5 = i7;
                    }
                    this.pos = i5;
                    return i;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        private void skipRawVarint() throws java.io.IOException {
            if (this.limit - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.buffer;
                int i2 = this.pos;
                this.pos = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long readRawVarint64() throws java.io.IOException {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.pos;
            int i3 = this.limit;
            if (i3 != i2) {
                byte[] bArr = this.buffer;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.pos = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 >= 0) {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            i5 = i7;
                            j = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                long j4 = i9;
                                int i10 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i5 = i10 + 1;
                                    long j6 = j5 ^ (((long) bArr[i10]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i10 = i5 + 1;
                                        j5 = j6 ^ (((long) bArr[i5]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i5 = i10 + 1;
                                            j6 = j5 ^ (((long) bArr[i10]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i11 = i5 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i5]) << 56)) ^ 71499008037633920L;
                                                i5 = j7 < 0 ? i11 + 1 : i11;
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i5 = i10;
                            }
                        }
                        this.pos = i5;
                        return j;
                    }
                    i = i6 ^ (-128);
                    j = i;
                    this.pos = i5;
                    return j;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte rawByte = readRawByte();
                j |= ((long) (rawByte & 127)) << i;
                if ((rawByte & 128) == 0) {
                    return j;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
            int i = this.pos;
            if (this.limit - i < 4) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
            int i = this.pos;
            if (this.limit - i < 8) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean enabled) {
            this.enableAliasing = enabled;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int byteLimit) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (byteLimit < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            if (totalBytesRead < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure();
            }
            int i = this.currentLimit;
            if (totalBytesRead > i) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i = this.limit + this.bufferSizeAfterLimit;
            this.limit = i;
            int i2 = i - this.startPos;
            int i3 = this.currentLimit;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.bufferSizeAfterLimit = i4;
                this.limit = i - i4;
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(final int oldLimit) {
            this.currentLimit = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
            return this.pos == this.limit;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.pos - this.startPos;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
            int i = this.pos;
            if (i == this.limit) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 1;
            return bArr[i];
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(final int length) throws java.io.IOException {
            if (length > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (length <= i - i2) {
                    int i3 = length + i2;
                    this.pos = i3;
                    return java.util.Arrays.copyOfRange(this.buffer, i2, i3);
                }
            }
            if (length > 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (length == 0) {
                return androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(final int length) throws java.io.IOException {
            if (length >= 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (length <= i - i2) {
                    this.pos = i2 + length;
                    return;
                }
            }
            if (length < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private static final class UnsafeDirectNioDecoder extends androidx.datastore.preferences.protobuf.CodedInputStream {
        private final long address;
        private final java.nio.ByteBuffer buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private long limit;
        private long pos;
        private long startPos;

        static boolean isSupported() {
            return androidx.datastore.preferences.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private UnsafeDirectNioDecoder(java.nio.ByteBuffer buffer, boolean immutable) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = buffer;
            long jAddressOffset = androidx.datastore.preferences.protobuf.UnsafeUtil.addressOffset(buffer);
            this.address = jAddressOffset;
            this.limit = ((long) buffer.limit()) + jAddressOffset;
            long jPosition = jAddressOffset + ((long) buffer.position());
            this.pos = jPosition;
            this.startPos = jPosition;
            this.immutable = immutable;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(rawVarint32) == 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(final int value) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (this.lastTag != value) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(final int tag) throws java.io.IOException {
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(final int tag, final androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                long int64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                androidx.datastore.preferences.protobuf.ByteString bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iMakeTag = androidx.datastore.preferences.protobuf.WireFormat.makeTag(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag), 4);
                checkLastTagWas(iMakeTag);
                output.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                output.writeUInt32NoTag(tag);
                output.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[rawVarint32];
            long j = rawVarint32;
            androidx.datastore.preferences.protobuf.UnsafeUtil.copyMemory(this.pos, bArr, 0L, j);
            java.lang.String str = new java.lang.String(bArr, androidx.datastore.preferences.protobuf.Internal.UTF_8);
            this.pos += j;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                java.lang.String strDecodeUtf8 = androidx.datastore.preferences.protobuf.Utf8.decodeUtf8(this.buffer, bufferPos(this.pos), rawVarint32);
                this.pos += (long) rawVarint32;
                return strDecodeUtf8;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends androidx.datastore.preferences.protobuf.MessageLite> T readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(fieldNumber, builder, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends androidx.datastore.preferences.protobuf.MessageLite> T readMessage(final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public androidx.datastore.preferences.protobuf.ByteString readBytes() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return androidx.datastore.preferences.protobuf.ByteString.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable && this.enableAliasing) {
                long j = this.pos;
                long j2 = rawVarint32;
                java.nio.ByteBuffer byteBufferSlice = slice(j, j + j2);
                this.pos += j2;
                return androidx.datastore.preferences.protobuf.ByteString.wrap(byteBufferSlice);
            }
            byte[] bArr = new byte[rawVarint32];
            long j3 = rawVarint32;
            androidx.datastore.preferences.protobuf.UnsafeUtil.copyMemory(this.pos, bArr, 0L, j3);
            this.pos += j3;
            return androidx.datastore.preferences.protobuf.ByteString.wrap(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER;
                }
                if (rawVarint32 < 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (!this.immutable && this.enableAliasing) {
                long j = this.pos;
                long j2 = rawVarint32;
                java.nio.ByteBuffer byteBufferSlice = slice(j, j + j2);
                this.pos += j2;
                return byteBufferSlice;
            }
            byte[] bArr = new byte[rawVarint32];
            long j3 = rawVarint32;
            androidx.datastore.preferences.protobuf.UnsafeUtil.copyMemory(this.pos, bArr, 0L, j3);
            this.pos += j3;
            return java.nio.ByteBuffer.wrap(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r4) < 0) goto L34;
         */
        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int readRawVarint32() throws java.io.IOException {
            int i;
            long j = this.pos;
            if (this.limit != j) {
                long j2 = j + 1;
                byte b = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j);
                if (b >= 0) {
                    this.pos = j2;
                    return b;
                }
                if (this.limit - j2 >= 9) {
                    long j3 = j2 + 1;
                    int i2 = b ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j2) << 7);
                    if (i2 < 0) {
                        i = i2 ^ (-128);
                    } else {
                        long j4 = j3 + 1;
                        int i3 = i2 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j3) << 14);
                        if (i3 >= 0) {
                            i = i3 ^ 16256;
                        } else {
                            j3 = j4 + 1;
                            int i4 = i3 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4) << 21);
                            if (i4 < 0) {
                                i = i4 ^ (-2080896);
                            } else {
                                j4 = j3 + 1;
                                byte b2 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j3);
                                i = (i4 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    j3 = j4 + 1;
                                    if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4) < 0) {
                                        j4 = j3 + 1;
                                        if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j3) < 0) {
                                            j3 = j4 + 1;
                                            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4) < 0) {
                                                j4 = j3 + 1;
                                                if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j3) < 0) {
                                                    j3 = j4 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        j3 = j4;
                    }
                    this.pos = j3;
                    return i;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        private void skipRawVarint() throws java.io.IOException {
            if (remaining() >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                long j = this.pos;
                this.pos = 1 + j;
                if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j) >= 0) {
                    return;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() throws java.io.IOException {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.pos;
            if (this.limit != j4) {
                long j5 = j4 + 1;
                byte b = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4);
                if (b >= 0) {
                    this.pos = j5;
                    return b;
                }
                if (this.limit - j5 >= 9) {
                    long j6 = j5 + 1;
                    int i2 = b ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j5) << 7);
                    if (i2 >= 0) {
                        long j7 = j6 + 1;
                        int i3 = i2 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j6) << 14);
                        if (i3 < 0) {
                            j6 = j7 + 1;
                            int i4 = i3 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j7) << 21);
                            if (i4 < 0) {
                                i = i4 ^ (-2080896);
                            } else {
                                j7 = j6 + 1;
                                long j8 = ((long) i4) ^ (((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j6)) << 28);
                                if (j8 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j9 = j7 + 1;
                                    long j10 = j8 ^ (((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j7)) << 35);
                                    if (j10 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j9 + 1;
                                        j8 = j10 ^ (((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j9)) << 42);
                                        if (j8 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j9 = j7 + 1;
                                            j10 = j8 ^ (((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j7)) << 49);
                                            if (j10 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j9 + 1;
                                                j = (j10 ^ (((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j9)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j11 = 1 + j7;
                                                    if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j7) >= 0) {
                                                        j6 = j11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = j10 ^ j2;
                                    j6 = j9;
                                }
                                j = j8 ^ j3;
                            }
                            this.pos = j6;
                            return j;
                        }
                        j = i3 ^ 16256;
                        j6 = j7;
                        this.pos = j6;
                        return j;
                    }
                    i = i2 ^ (-128);
                    j = i;
                    this.pos = j6;
                    return j;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte rawByte = readRawByte();
                j |= ((long) (rawByte & 127)) << i;
                if ((rawByte & 128) == 0) {
                    return j;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
            long j = this.pos;
            if (this.limit - j < 4) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 4 + j;
            return ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j + 3) & 255) << 24) | (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j) & 255) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(1 + j) & 255) << 8) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(2 + j) & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
            long j = this.pos;
            if (this.limit - j < 8) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 8 + j;
            return ((((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j + 7)) & 255) << 56) | (((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j)) & 255) | ((((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(1 + j)) & 255) << 8) | ((((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(2 + j)) & 255) << 16) | ((((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(3 + j)) & 255) << 24) | ((((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(4 + j)) & 255) << 32) | ((((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(5 + j)) & 255) << 40) | ((((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(6 + j)) & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean enabled) {
            this.enableAliasing = enabled;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int byteLimit) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (byteLimit < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            int i = this.currentLimit;
            if (totalBytesRead > i) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(final int oldLimit) {
            this.currentLimit = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
            return this.pos == this.limit;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (this.pos - this.startPos);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
            long j = this.pos;
            if (j == this.limit) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 1 + j;
            return androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(final int length) throws java.io.IOException {
            if (length < 0 || length > remaining()) {
                if (length > 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
                }
                if (length == 0) {
                    return androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY;
                }
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArr = new byte[length];
            long j = this.pos;
            long j2 = length;
            slice(j, j + j2).get(bArr);
            this.pos += j2;
            return bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(final int length) throws java.io.IOException {
            if (length >= 0 && length <= remaining()) {
                this.pos += (long) length;
            } else {
                if (length < 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private void recomputeBufferSizeAfterLimit() {
            long j = this.limit + ((long) this.bufferSizeAfterLimit);
            this.limit = j;
            int i = (int) (j - this.startPos);
            int i2 = this.currentLimit;
            if (i > i2) {
                int i3 = i - i2;
                this.bufferSizeAfterLimit = i3;
                this.limit = j - ((long) i3);
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        private int remaining() {
            return (int) (this.limit - this.pos);
        }

        private int bufferPos(long pos) {
            return (int) (pos - this.address);
        }

        private java.nio.ByteBuffer slice(long begin, long end) throws java.io.IOException {
            int iPosition = this.buffer.position();
            int iLimit = this.buffer.limit();
            java.nio.ByteBuffer byteBuffer = this.buffer;
            try {
                try {
                    byteBuffer.position(bufferPos(begin));
                    byteBuffer.limit(bufferPos(end));
                    java.nio.ByteBuffer byteBufferSlice = this.buffer.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (java.lang.IllegalArgumentException e) {
                    androidx.datastore.preferences.protobuf.InvalidProtocolBufferException invalidProtocolBufferExceptionTruncatedMessage = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
                    invalidProtocolBufferExceptionTruncatedMessage.initCause(e);
                    throw invalidProtocolBufferExceptionTruncatedMessage;
                }
            } catch (java.lang.Throwable th) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th;
            }
        }
    }

    private static final class StreamDecoder extends androidx.datastore.preferences.protobuf.CodedInputStream {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final java.io.InputStream input;
        private int lastTag;
        private int pos;
        private androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.RefillCallback refillCallback;
        private int totalBytesRetired;

        private interface RefillCallback {
            void onRefill();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean enabled) {
        }

        private StreamDecoder(final java.io.InputStream input, int bufferSize) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.refillCallback = null;
            androidx.datastore.preferences.protobuf.Internal.checkNotNull(input, "input");
            this.input = input;
            this.buffer = new byte[bufferSize];
            this.bufferSize = 0;
            this.pos = 0;
            this.totalBytesRetired = 0;
        }

        private static int read(java.io.InputStream input, byte[] data, int offset, int length) throws java.io.IOException {
            try {
                return input.read(data, offset, length);
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private static long skip(java.io.InputStream input, long length) throws java.io.IOException {
            try {
                return input.skip(length);
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private static int available(java.io.InputStream input) throws java.io.IOException {
            try {
                return input.available();
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(rawVarint32) == 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(final int value) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (this.lastTag != value) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(final int tag) throws java.io.IOException {
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(final int tag, final androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                long int64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                androidx.datastore.preferences.protobuf.ByteString bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iMakeTag = androidx.datastore.preferences.protobuf.WireFormat.makeTag(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag), 4);
                checkLastTagWas(iMakeTag);
                output.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                output.writeUInt32NoTag(tag);
                output.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        private class SkippedDataSink implements androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.RefillCallback {
            private java.io.ByteArrayOutputStream byteArrayStream;
            private int lastPos;

            private SkippedDataSink() {
                this.lastPos = androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.this.pos;
            }

            @Override // androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.RefillCallback
            public void onRefill() {
                if (this.byteArrayStream == null) {
                    this.byteArrayStream = new java.io.ByteArrayOutputStream();
                }
                this.byteArrayStream.write(androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.this.buffer, this.lastPos, androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.this.pos - this.lastPos);
                this.lastPos = 0;
            }

            java.nio.ByteBuffer getSkippedData() {
                java.io.ByteArrayOutputStream byteArrayOutputStream = this.byteArrayStream;
                if (byteArrayOutputStream == null) {
                    return java.nio.ByteBuffer.wrap(androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.this.buffer, this.lastPos, androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.this.pos - this.lastPos);
                }
                byteArrayOutputStream.write(androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.this.buffer, this.lastPos, androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.this.pos);
                return java.nio.ByteBuffer.wrap(this.byteArrayStream.toByteArray());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= this.bufferSize - this.pos) {
                java.lang.String str = new java.lang.String(this.buffer, this.pos, rawVarint32, androidx.datastore.preferences.protobuf.Internal.UTF_8);
                this.pos += rawVarint32;
                return str;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            if (rawVarint32 <= this.bufferSize) {
                refillBuffer(rawVarint32);
                java.lang.String str2 = new java.lang.String(this.buffer, this.pos, rawVarint32, androidx.datastore.preferences.protobuf.Internal.UTF_8);
                this.pos += rawVarint32;
                return str2;
            }
            return new java.lang.String(readRawBytesSlowPath(rawVarint32, false), androidx.datastore.preferences.protobuf.Internal.UTF_8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
            byte[] rawBytesSlowPath;
            int rawVarint32 = readRawVarint32();
            int i = this.pos;
            int i2 = this.bufferSize;
            if (rawVarint32 <= i2 - i && rawVarint32 > 0) {
                rawBytesSlowPath = this.buffer;
                this.pos = i + rawVarint32;
            } else {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                i = 0;
                if (rawVarint32 <= i2) {
                    refillBuffer(rawVarint32);
                    rawBytesSlowPath = this.buffer;
                    this.pos = rawVarint32 + 0;
                } else {
                    rawBytesSlowPath = readRawBytesSlowPath(rawVarint32, false);
                }
            }
            return androidx.datastore.preferences.protobuf.Utf8.decodeUtf8(rawBytesSlowPath, i, rawVarint32);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends androidx.datastore.preferences.protobuf.MessageLite> T readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(fieldNumber, builder, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends androidx.datastore.preferences.protobuf.MessageLite> T readMessage(final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public androidx.datastore.preferences.protobuf.ByteString readBytes() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i2 = this.pos;
            if (rawVarint32 <= i - i2 && rawVarint32 > 0) {
                androidx.datastore.preferences.protobuf.ByteString byteStringCopyFrom = androidx.datastore.preferences.protobuf.ByteString.copyFrom(this.buffer, i2, rawVarint32);
                this.pos += rawVarint32;
                return byteStringCopyFrom;
            }
            if (rawVarint32 == 0) {
                return androidx.datastore.preferences.protobuf.ByteString.EMPTY;
            }
            if (rawVarint32 < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            return readBytesSlowPath(rawVarint32);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i2 = this.pos;
            if (rawVarint32 > i - i2 || rawVarint32 <= 0) {
                if (rawVarint32 < 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                return readRawBytesSlowPath(rawVarint32, false);
            }
            byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(this.buffer, i2, i2 + rawVarint32);
            this.pos += rawVarint32;
            return bArrCopyOfRange;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i2 = this.pos;
            if (rawVarint32 <= i - i2 && rawVarint32 > 0) {
                java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(java.util.Arrays.copyOfRange(this.buffer, i2, i2 + rawVarint32));
                this.pos += rawVarint32;
                return byteBufferWrap;
            }
            if (rawVarint32 == 0) {
                return androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            return java.nio.ByteBuffer.wrap(readRawBytesSlowPath(rawVarint32, true));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int readRawVarint32() throws java.io.IOException {
            int i;
            int i2 = this.pos;
            int i3 = this.bufferSize;
            if (i3 != i2) {
                byte[] bArr = this.buffer;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.pos = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                i7 = i5 + 1;
                                byte b2 = bArr[i5];
                                i = (i9 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i5 = i7 + 1;
                                    if (bArr[i7] < 0) {
                                        i7 = i5 + 1;
                                        if (bArr[i5] < 0) {
                                            i5 = i7 + 1;
                                            if (bArr[i7] < 0) {
                                                i7 = i5 + 1;
                                                if (bArr[i5] < 0) {
                                                    i5 = i7 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i5 = i7;
                    }
                    this.pos = i5;
                    return i;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        private void skipRawVarint() throws java.io.IOException {
            if (this.bufferSize - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.buffer;
                int i2 = this.pos;
                this.pos = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long readRawVarint64() throws java.io.IOException {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.pos;
            int i3 = this.bufferSize;
            if (i3 != i2) {
                byte[] bArr = this.buffer;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.pos = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 >= 0) {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            i5 = i7;
                            j = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                long j4 = i9;
                                int i10 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i5 = i10 + 1;
                                    long j6 = j5 ^ (((long) bArr[i10]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i10 = i5 + 1;
                                        j5 = j6 ^ (((long) bArr[i5]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i5 = i10 + 1;
                                            j6 = j5 ^ (((long) bArr[i10]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i11 = i5 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i5]) << 56)) ^ 71499008037633920L;
                                                i5 = j7 < 0 ? i11 + 1 : i11;
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i5 = i10;
                            }
                        }
                        this.pos = i5;
                        return j;
                    }
                    i = i6 ^ (-128);
                    j = i;
                    this.pos = i5;
                    return j;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte rawByte = readRawByte();
                j |= ((long) (rawByte & 127)) << i;
                if ((rawByte & 128) == 0) {
                    return j;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
            int i = this.pos;
            if (this.bufferSize - i < 4) {
                refillBuffer(4);
                i = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
            int i = this.pos;
            if (this.bufferSize - i < 8) {
                refillBuffer(8);
                i = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.totalBytesRetired = -this.pos;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int byteLimit) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (byteLimit < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int i = byteLimit + this.totalBytesRetired + this.pos;
            if (i < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure();
            }
            int i2 = this.currentLimit;
            if (i > i2) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
            return i2;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i = this.bufferSize + this.bufferSizeAfterLimit;
            this.bufferSize = i;
            int i2 = this.totalBytesRetired + i;
            int i3 = this.currentLimit;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.bufferSizeAfterLimit = i4;
                this.bufferSize = i - i4;
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(final int oldLimit) {
            this.currentLimit = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.totalBytesRetired + this.pos);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
            return this.pos == this.bufferSize && !tryRefillBuffer(1);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.totalBytesRetired + this.pos;
        }

        private void refillBuffer(int n) throws java.io.IOException {
            if (tryRefillBuffer(n)) {
                return;
            }
            if (n > (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        private boolean tryRefillBuffer(int n) throws java.io.IOException {
            if (this.pos + n <= this.bufferSize) {
                throw new java.lang.IllegalStateException("refillBuffer() called when " + n + " bytes were already available in buffer");
            }
            int i = this.sizeLimit;
            int i2 = this.totalBytesRetired;
            int i3 = this.pos;
            if (n > (i - i2) - i3 || i2 + i3 + n > this.currentLimit) {
                return false;
            }
            androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.RefillCallback refillCallback = this.refillCallback;
            if (refillCallback != null) {
                refillCallback.onRefill();
            }
            int i4 = this.pos;
            if (i4 > 0) {
                int i5 = this.bufferSize;
                if (i5 > i4) {
                    byte[] bArr = this.buffer;
                    java.lang.System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.totalBytesRetired += i4;
                this.bufferSize -= i4;
                this.pos = 0;
            }
            java.io.InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i6 = this.bufferSize;
            int i7 = read(inputStream, bArr2, i6, java.lang.Math.min(bArr2.length - i6, (this.sizeLimit - this.totalBytesRetired) - this.bufferSize));
            if (i7 == 0 || i7 < -1 || i7 > this.buffer.length) {
                throw new java.lang.IllegalStateException(this.input.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
            }
            if (i7 <= 0) {
                return false;
            }
            this.bufferSize += i7;
            recomputeBufferSizeAfterLimit();
            if (this.bufferSize >= n) {
                return true;
            }
            return tryRefillBuffer(n);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
            if (this.pos == this.bufferSize) {
                refillBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i = this.pos;
            this.pos = i + 1;
            return bArr[i];
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(final int size) throws java.io.IOException {
            int i = this.pos;
            if (size <= this.bufferSize - i && size > 0) {
                int i2 = size + i;
                this.pos = i2;
                return java.util.Arrays.copyOfRange(this.buffer, i, i2);
            }
            return readRawBytesSlowPath(size, false);
        }

        private byte[] readRawBytesSlowPath(final int size, boolean ensureNoLeakedReferences) throws java.io.IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(size);
            if (rawBytesSlowPathOneChunk != null) {
                return ensureNoLeakedReferences ? (byte[]) rawBytesSlowPathOneChunk.clone() : rawBytesSlowPathOneChunk;
            }
            int i = this.pos;
            int i2 = this.bufferSize;
            int length = i2 - i;
            this.totalBytesRetired += i2;
            this.pos = 0;
            this.bufferSize = 0;
            java.util.List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(size - length);
            byte[] bArr = new byte[size];
            java.lang.System.arraycopy(this.buffer, i, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                java.lang.System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] readRawBytesSlowPathOneChunk(final int size) throws java.io.IOException {
            if (size == 0) {
                return androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            if (size < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int i = this.totalBytesRetired + this.pos + size;
            if (i - this.sizeLimit > 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i2 = this.currentLimit;
            if (i > i2) {
                skipRawBytes((i2 - this.totalBytesRetired) - this.pos);
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            int i3 = this.bufferSize - this.pos;
            int i4 = size - i3;
            if (i4 >= 4096 && i4 > available(this.input)) {
                return null;
            }
            byte[] bArr = new byte[size];
            java.lang.System.arraycopy(this.buffer, this.pos, bArr, 0, i3);
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            while (i3 < size) {
                int i5 = read(this.input, bArr, i3, size - i3);
                if (i5 == -1) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += i5;
                i3 += i5;
            }
            return bArr;
        }

        private java.util.List<byte[]> readRawBytesSlowPathRemainingChunks(int sizeLeft) throws java.io.IOException {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sizeLeft > 0) {
                int iMin = java.lang.Math.min(sizeLeft, 4096);
                byte[] bArr = new byte[iMin];
                int i = 0;
                while (i < iMin) {
                    int i2 = this.input.read(bArr, i, iMin - i);
                    if (i2 == -1) {
                        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.totalBytesRetired += i2;
                    i += i2;
                }
                sizeLeft -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private androidx.datastore.preferences.protobuf.ByteString readBytesSlowPath(final int size) throws java.io.IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(size);
            if (rawBytesSlowPathOneChunk != null) {
                return androidx.datastore.preferences.protobuf.ByteString.copyFrom(rawBytesSlowPathOneChunk);
            }
            int i = this.pos;
            int i2 = this.bufferSize;
            int length = i2 - i;
            this.totalBytesRetired += i2;
            this.pos = 0;
            this.bufferSize = 0;
            java.util.List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(size - length);
            byte[] bArr = new byte[size];
            java.lang.System.arraycopy(this.buffer, i, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                java.lang.System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return androidx.datastore.preferences.protobuf.ByteString.wrap(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(final int size) throws java.io.IOException {
            int i = this.bufferSize;
            int i2 = this.pos;
            if (size <= i - i2 && size >= 0) {
                this.pos = i2 + size;
            } else {
                skipRawBytesSlowPath(size);
            }
        }

        private void skipRawBytesSlowPath(final int size) throws java.io.IOException {
            if (size < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int i = this.totalBytesRetired;
            int i2 = this.pos;
            int i3 = i + i2 + size;
            int i4 = this.currentLimit;
            if (i3 > i4) {
                skipRawBytes((i4 - i) - i2);
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            int i5 = 0;
            if (this.refillCallback == null) {
                this.totalBytesRetired = i + i2;
                int i6 = this.bufferSize - i2;
                this.bufferSize = 0;
                this.pos = 0;
                i5 = i6;
                while (i5 < size) {
                    try {
                        long j = size - i5;
                        long jSkip = skip(this.input, j);
                        if (jSkip < 0 || jSkip > j) {
                            throw new java.lang.IllegalStateException(this.input.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i5 += (int) jSkip;
                        }
                    } catch (java.lang.Throwable th) {
                        this.totalBytesRetired += i5;
                        recomputeBufferSizeAfterLimit();
                        throw th;
                    }
                }
                this.totalBytesRetired += i5;
                recomputeBufferSizeAfterLimit();
            }
            if (i5 >= size) {
                return;
            }
            int i7 = this.bufferSize;
            int i8 = i7 - this.pos;
            this.pos = i7;
            refillBuffer(1);
            while (true) {
                int i9 = size - i8;
                int i10 = this.bufferSize;
                if (i9 > i10) {
                    i8 += i10;
                    this.pos = i10;
                    refillBuffer(1);
                } else {
                    this.pos = i9;
                    return;
                }
            }
        }
    }

    private static final class IterableDirectByteBufferDecoder extends androidx.datastore.preferences.protobuf.CodedInputStream {
        private int bufferSizeAfterCurrentLimit;
        private long currentAddress;
        private java.nio.ByteBuffer currentByteBuffer;
        private long currentByteBufferLimit;
        private long currentByteBufferPos;
        private long currentByteBufferStartPos;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private final java.lang.Iterable<java.nio.ByteBuffer> input;
        private final java.util.Iterator<java.nio.ByteBuffer> iterator;
        private int lastTag;
        private int startOffset;
        private int totalBufferSize;
        private int totalBytesRead;

        private IterableDirectByteBufferDecoder(java.lang.Iterable<java.nio.ByteBuffer> inputBufs, int size, boolean immutableFlag) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.totalBufferSize = size;
            this.input = inputBufs;
            this.iterator = inputBufs.iterator();
            this.immutable = immutableFlag;
            this.totalBytesRead = 0;
            this.startOffset = 0;
            if (size == 0) {
                this.currentByteBuffer = androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER;
                this.currentByteBufferPos = 0L;
                this.currentByteBufferStartPos = 0L;
                this.currentByteBufferLimit = 0L;
                this.currentAddress = 0L;
                return;
            }
            tryGetNextByteBuffer();
        }

        private void getNextByteBuffer() throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (!this.iterator.hasNext()) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            tryGetNextByteBuffer();
        }

        private void tryGetNextByteBuffer() {
            java.nio.ByteBuffer next = this.iterator.next();
            this.currentByteBuffer = next;
            this.totalBytesRead += (int) (this.currentByteBufferPos - this.currentByteBufferStartPos);
            long jPosition = next.position();
            this.currentByteBufferPos = jPosition;
            this.currentByteBufferStartPos = jPosition;
            this.currentByteBufferLimit = this.currentByteBuffer.limit();
            long jAddressOffset = androidx.datastore.preferences.protobuf.UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentAddress = jAddressOffset;
            this.currentByteBufferPos += jAddressOffset;
            this.currentByteBufferStartPos += jAddressOffset;
            this.currentByteBufferLimit += jAddressOffset;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(rawVarint32) == 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(final int value) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (this.lastTag != value) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(final int tag) throws java.io.IOException {
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(final int tag, final androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                long int64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                androidx.datastore.preferences.protobuf.ByteString bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iMakeTag = androidx.datastore.preferences.protobuf.WireFormat.makeTag(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag), 4);
                checkLastTagWas(iMakeTag);
                output.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                output.writeUInt32NoTag(tag);
                output.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j = rawVarint32;
                long j2 = this.currentByteBufferLimit;
                long j3 = this.currentByteBufferPos;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[rawVarint32];
                    androidx.datastore.preferences.protobuf.UnsafeUtil.copyMemory(j3, bArr, 0L, j);
                    java.lang.String str = new java.lang.String(bArr, androidx.datastore.preferences.protobuf.Internal.UTF_8);
                    this.currentByteBufferPos += j;
                    return str;
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return new java.lang.String(bArr2, androidx.datastore.preferences.protobuf.Internal.UTF_8);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j = rawVarint32;
                long j2 = this.currentByteBufferLimit;
                long j3 = this.currentByteBufferPos;
                if (j <= j2 - j3) {
                    java.lang.String strDecodeUtf8 = androidx.datastore.preferences.protobuf.Utf8.decodeUtf8(this.currentByteBuffer, (int) (j3 - this.currentByteBufferStartPos), rawVarint32);
                    this.currentByteBufferPos += j;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 >= 0 && rawVarint32 <= remaining()) {
                byte[] bArr = new byte[rawVarint32];
                readRawBytesTo(bArr, 0, rawVarint32);
                return androidx.datastore.preferences.protobuf.Utf8.decodeUtf8(bArr, 0, rawVarint32);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends androidx.datastore.preferences.protobuf.MessageLite> T readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(fieldNumber, builder, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends androidx.datastore.preferences.protobuf.MessageLite> T readMessage(final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public androidx.datastore.preferences.protobuf.ByteString readBytes() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j = rawVarint32;
                long j2 = this.currentByteBufferLimit;
                long j3 = this.currentByteBufferPos;
                if (j <= j2 - j3) {
                    if (this.immutable && this.enableAliasing) {
                        int i = (int) (j3 - this.currentAddress);
                        androidx.datastore.preferences.protobuf.ByteString byteStringWrap = androidx.datastore.preferences.protobuf.ByteString.wrap(slice(i, rawVarint32 + i));
                        this.currentByteBufferPos += j;
                        return byteStringWrap;
                    }
                    byte[] bArr = new byte[rawVarint32];
                    androidx.datastore.preferences.protobuf.UnsafeUtil.copyMemory(j3, bArr, 0L, j);
                    this.currentByteBufferPos += j;
                    return androidx.datastore.preferences.protobuf.ByteString.wrap(bArr);
                }
            }
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return androidx.datastore.preferences.protobuf.ByteString.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable && this.enableAliasing) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (rawVarint32 > 0) {
                    if (currentRemaining() == 0) {
                        getNextByteBuffer();
                    }
                    int iMin = java.lang.Math.min(rawVarint32, (int) currentRemaining());
                    int i2 = (int) (this.currentByteBufferPos - this.currentAddress);
                    arrayList.add(androidx.datastore.preferences.protobuf.ByteString.wrap(slice(i2, i2 + iMin)));
                    rawVarint32 -= iMin;
                    this.currentByteBufferPos += (long) iMin;
                }
                return androidx.datastore.preferences.protobuf.ByteString.copyFrom(arrayList);
            }
            byte[] bArr2 = new byte[rawVarint32];
            readRawBytesTo(bArr2, 0, rawVarint32);
            return androidx.datastore.preferences.protobuf.ByteString.wrap(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j = rawVarint32;
                if (j <= currentRemaining()) {
                    if (!this.immutable && this.enableAliasing) {
                        long j2 = this.currentByteBufferPos + j;
                        this.currentByteBufferPos = j2;
                        long j3 = this.currentAddress;
                        return slice((int) ((j2 - j3) - j), (int) (j2 - j3));
                    }
                    byte[] bArr = new byte[rawVarint32];
                    androidx.datastore.preferences.protobuf.UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j);
                    this.currentByteBufferPos += j;
                    return java.nio.ByteBuffer.wrap(bArr);
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return java.nio.ByteBuffer.wrap(bArr2);
            }
            if (rawVarint32 == 0) {
                return androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r4) < 0) goto L34;
         */
        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int readRawVarint32() throws java.io.IOException {
            int i;
            long j = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j) {
                long j2 = j + 1;
                byte b = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j);
                if (b >= 0) {
                    this.currentByteBufferPos++;
                    return b;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j3 = j2 + 1;
                    int i2 = b ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j2) << 7);
                    if (i2 < 0) {
                        i = i2 ^ (-128);
                    } else {
                        long j4 = j3 + 1;
                        int i3 = i2 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j3) << 14);
                        if (i3 >= 0) {
                            i = i3 ^ 16256;
                        } else {
                            j3 = j4 + 1;
                            int i4 = i3 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4) << 21);
                            if (i4 < 0) {
                                i = i4 ^ (-2080896);
                            } else {
                                j4 = j3 + 1;
                                byte b2 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j3);
                                i = (i4 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    j3 = j4 + 1;
                                    if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4) < 0) {
                                        j4 = j3 + 1;
                                        if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j3) < 0) {
                                            j3 = j4 + 1;
                                            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4) < 0) {
                                                j4 = j3 + 1;
                                                if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j3) < 0) {
                                                    j3 = j4 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        j3 = j4;
                    }
                    this.currentByteBufferPos = j3;
                    return i;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() throws java.io.IOException {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j4) {
                long j5 = j4 + 1;
                byte b = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4);
                if (b >= 0) {
                    this.currentByteBufferPos++;
                    return b;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j6 = j5 + 1;
                    int i2 = b ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j5) << 7);
                    if (i2 >= 0) {
                        long j7 = j6 + 1;
                        int i3 = i2 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j6) << 14);
                        if (i3 < 0) {
                            j6 = j7 + 1;
                            int i4 = i3 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j7) << 21);
                            if (i4 < 0) {
                                i = i4 ^ (-2080896);
                            } else {
                                j7 = j6 + 1;
                                long j8 = ((long) i4) ^ (((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j6)) << 28);
                                if (j8 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j9 = j7 + 1;
                                    long j10 = j8 ^ (((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j7)) << 35);
                                    if (j10 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j9 + 1;
                                        j8 = j10 ^ (((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j9)) << 42);
                                        if (j8 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j9 = j7 + 1;
                                            j10 = j8 ^ (((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j7)) << 49);
                                            if (j10 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j9 + 1;
                                                j = (j10 ^ (((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j9)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j11 = 1 + j7;
                                                    if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j7) >= 0) {
                                                        j6 = j11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = j10 ^ j2;
                                    j6 = j9;
                                }
                                j = j8 ^ j3;
                            }
                            this.currentByteBufferPos = j6;
                            return j;
                        }
                        j = i3 ^ 16256;
                        j6 = j7;
                        this.currentByteBufferPos = j6;
                        return j;
                    }
                    i = i2 ^ (-128);
                    j = i;
                    this.currentByteBufferPos = j6;
                    return j;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte rawByte = readRawByte();
                j |= ((long) (rawByte & 127)) << i;
                if ((rawByte & 128) == 0) {
                    return j;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
            if (currentRemaining() >= 4) {
                long j = this.currentByteBufferPos;
                this.currentByteBufferPos = 4 + j;
                return ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j + 3) & 255) << 24) | (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j) & 255) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(1 + j) & 255) << 8) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(2 + j) & 255) << 16);
            }
            return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
            long rawByte;
            byte rawByte2;
            if (currentRemaining() >= 8) {
                long j = this.currentByteBufferPos;
                this.currentByteBufferPos = 8 + j;
                rawByte = (((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j)) & 255) | ((((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(1 + j)) & 255) << 8) | ((((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(2 + j)) & 255) << 16) | ((((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(3 + j)) & 255) << 24) | ((((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(4 + j)) & 255) << 32) | ((((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(5 + j)) & 255) << 40) | ((((long) androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(6 + j)) & 255) << 48);
                rawByte2 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j + 7);
            } else {
                rawByte = (((long) readRawByte()) & 255) | ((((long) readRawByte()) & 255) << 8) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48);
                rawByte2 = readRawByte();
            }
            return ((((long) rawByte2) & 255) << 56) | rawByte;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean enabled) {
            this.enableAliasing = enabled;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startOffset = (int) ((((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int byteLimit) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (byteLimit < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            int i = this.currentLimit;
            if (totalBytesRead > i) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i = this.totalBufferSize + this.bufferSizeAfterCurrentLimit;
            this.totalBufferSize = i;
            int i2 = i - this.startOffset;
            int i3 = this.currentLimit;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.bufferSizeAfterCurrentLimit = i4;
                this.totalBufferSize = i - i4;
                return;
            }
            this.bufferSizeAfterCurrentLimit = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(final int oldLimit) {
            this.currentLimit = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
            return (((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos == ((long) this.totalBufferSize);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) ((((long) (this.totalBytesRead - this.startOffset)) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            long j = this.currentByteBufferPos;
            this.currentByteBufferPos = 1 + j;
            return androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(final int length) throws java.io.IOException {
            if (length >= 0) {
                long j = length;
                if (j <= currentRemaining()) {
                    byte[] bArr = new byte[length];
                    androidx.datastore.preferences.protobuf.UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j);
                    this.currentByteBufferPos += j;
                    return bArr;
                }
            }
            if (length >= 0 && length <= remaining()) {
                byte[] bArr2 = new byte[length];
                readRawBytesTo(bArr2, 0, length);
                return bArr2;
            }
            if (length > 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (length == 0) {
                return androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
        }

        private void readRawBytesTo(byte[] bytes, int offset, final int length) throws java.io.IOException {
            if (length < 0 || length > remaining()) {
                if (length > 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
                }
                if (length != 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i = length;
            while (i > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = java.lang.Math.min(i, (int) currentRemaining());
                long j = iMin;
                androidx.datastore.preferences.protobuf.UnsafeUtil.copyMemory(this.currentByteBufferPos, bytes, (length - i) + offset, j);
                i -= iMin;
                this.currentByteBufferPos += j;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(final int length) throws java.io.IOException {
            if (length < 0 || length > (((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos) {
                if (length < 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            while (length > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = java.lang.Math.min(length, (int) currentRemaining());
                length -= iMin;
                this.currentByteBufferPos += (long) iMin;
            }
        }

        private void skipRawVarint() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private int remaining() {
            return (int) ((((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
        }

        private long currentRemaining() {
            return this.currentByteBufferLimit - this.currentByteBufferPos;
        }

        private java.nio.ByteBuffer slice(int begin, int end) throws java.io.IOException {
            int iPosition = this.currentByteBuffer.position();
            int iLimit = this.currentByteBuffer.limit();
            java.nio.ByteBuffer byteBuffer = this.currentByteBuffer;
            try {
                try {
                    byteBuffer.position(begin);
                    byteBuffer.limit(end);
                    java.nio.ByteBuffer byteBufferSlice = this.currentByteBuffer.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (java.lang.IllegalArgumentException unused) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
                }
            } catch (java.lang.Throwable th) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th;
            }
        }
    }
}
