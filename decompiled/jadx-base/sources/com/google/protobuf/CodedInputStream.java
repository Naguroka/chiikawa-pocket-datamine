package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    com.google.protobuf.CodedInputStreamReader wrapper;

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract void checkLastTagWas(int i) throws com.google.protobuf.InvalidProtocolBufferException;

    public abstract void enableAliasing(boolean z);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws java.io.IOException;

    public abstract void popLimit(int i);

    public abstract int pushLimit(int i) throws com.google.protobuf.InvalidProtocolBufferException;

    public abstract boolean readBool() throws java.io.IOException;

    public abstract byte[] readByteArray() throws java.io.IOException;

    public abstract java.nio.ByteBuffer readByteBuffer() throws java.io.IOException;

    public abstract com.google.protobuf.ByteString readBytes() throws java.io.IOException;

    public abstract double readDouble() throws java.io.IOException;

    public abstract int readEnum() throws java.io.IOException;

    public abstract int readFixed32() throws java.io.IOException;

    public abstract long readFixed64() throws java.io.IOException;

    public abstract float readFloat() throws java.io.IOException;

    public abstract <T extends com.google.protobuf.MessageLite> T readGroup(int i, com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    public abstract void readGroup(int i, com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    public abstract int readInt32() throws java.io.IOException;

    public abstract long readInt64() throws java.io.IOException;

    public abstract <T extends com.google.protobuf.MessageLite> T readMessage(com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    public abstract void readMessage(com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    public abstract byte readRawByte() throws java.io.IOException;

    public abstract byte[] readRawBytes(int i) throws java.io.IOException;

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
    public abstract void readUnknownGroup(int i, com.google.protobuf.MessageLite.Builder builder) throws java.io.IOException;

    public abstract void resetSizeCounter();

    public abstract boolean skipField(int i) throws java.io.IOException;

    @java.lang.Deprecated
    public abstract boolean skipField(int i, com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException;

    public abstract void skipMessage() throws java.io.IOException;

    public abstract void skipMessage(com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException;

    public abstract void skipRawBytes(int i) throws java.io.IOException;

    public static com.google.protobuf.CodedInputStream newInstance(java.io.InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static com.google.protobuf.CodedInputStream newInstance(java.io.InputStream inputStream, int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("bufferSize must be > 0");
        }
        if (inputStream == null) {
            return newInstance(com.google.protobuf.Internal.EMPTY_BYTE_ARRAY);
        }
        return new com.google.protobuf.CodedInputStream.StreamDecoder(inputStream, i);
    }

    public static com.google.protobuf.CodedInputStream newInstance(java.lang.Iterable<java.nio.ByteBuffer> iterable) {
        if (!com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.isSupported()) {
            return newInstance(new com.google.protobuf.IterableByteBufferInputStream(iterable));
        }
        return newInstance(iterable, false);
    }

    static com.google.protobuf.CodedInputStream newInstance(java.lang.Iterable<java.nio.ByteBuffer> iterable, boolean z) {
        int i = 0;
        int iRemaining = 0;
        for (java.nio.ByteBuffer byteBuffer : iterable) {
            iRemaining += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i |= 1;
            } else {
                i = byteBuffer.isDirect() ? i | 2 : i | 4;
            }
        }
        if (i == 2) {
            return new com.google.protobuf.CodedInputStream.IterableDirectByteBufferDecoder(iterable, iRemaining, z);
        }
        return newInstance(new com.google.protobuf.IterableByteBufferInputStream(iterable));
    }

    public static com.google.protobuf.CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static com.google.protobuf.CodedInputStream newInstance(byte[] bArr, int i, int i2) {
        return newInstance(bArr, i, i2, false);
    }

    static com.google.protobuf.CodedInputStream newInstance(byte[] bArr, int i, int i2, boolean z) {
        com.google.protobuf.CodedInputStream.ArrayDecoder arrayDecoder = new com.google.protobuf.CodedInputStream.ArrayDecoder(bArr, i, i2, z);
        try {
            arrayDecoder.pushLimit(i2);
            return arrayDecoder;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static com.google.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    static com.google.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.isSupported()) {
            return new com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder(byteBuffer, z);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, iRemaining, true);
    }

    public void checkRecursionLimit() throws com.google.protobuf.InvalidProtocolBufferException {
        if (this.recursionDepth >= this.recursionLimit) {
            throw com.google.protobuf.InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    private CodedInputStream() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public final int setRecursionLimit(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Recursion limit cannot be negative: " + i);
        }
        int i2 = this.recursionLimit;
        this.recursionLimit = i;
        return i2;
    }

    public final int setSizeLimit(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Size limit cannot be negative: " + i);
        }
        int i2 = this.sizeLimit;
        this.sizeLimit = i;
        return i2;
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

    public static int readRawVarint32(int i, java.io.InputStream inputStream) throws java.io.IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
    }

    static int readRawVarint32(java.io.InputStream inputStream) throws java.io.IOException {
        int i = inputStream.read();
        if (i == -1) {
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        return readRawVarint32(i, inputStream);
    }

    private static final class ArrayDecoder extends com.google.protobuf.CodedInputStream {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        private ArrayDecoder(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = bArr;
            this.limit = i2 + i;
            this.pos = i;
            this.startPos = i;
            this.immutable = z;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (com.google.protobuf.WireFormat.getTagFieldNumber(rawVarint32) == 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (this.lastTag != i) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i) throws java.io.IOException {
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
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
                checkLastTagWas(com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i, com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                com.google.protobuf.ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int iMakeTag = com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage() throws java.io.IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage(com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, codedOutputStream));
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= this.limit - this.pos) {
                java.lang.String str = new java.lang.String(this.buffer, this.pos, rawVarint32, com.google.protobuf.Internal.UTF_8);
                this.pos += rawVarint32;
                return str;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (rawVarint32 <= i - i2) {
                    java.lang.String strDecodeUtf8 = com.google.protobuf.Utf8.decodeUtf8(this.buffer, i2, rawVarint32);
                    this.pos += rawVarint32;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i, com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(com.google.protobuf.WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends com.google.protobuf.MessageLite> T readGroup(int i, com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(com.google.protobuf.WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(int i, com.google.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(i, builder, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends com.google.protobuf.MessageLite> T readMessage(com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public com.google.protobuf.ByteString readBytes() throws java.io.IOException {
            com.google.protobuf.ByteString byteStringCopyFrom;
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (rawVarint32 <= i - i2) {
                    if (this.immutable && this.enableAliasing) {
                        byteStringCopyFrom = com.google.protobuf.ByteString.wrap(this.buffer, i2, rawVarint32);
                    } else {
                        byteStringCopyFrom = com.google.protobuf.ByteString.copyFrom(this.buffer, i2, rawVarint32);
                    }
                    this.pos += rawVarint32;
                    return byteStringCopyFrom;
                }
            }
            if (rawVarint32 == 0) {
                return com.google.protobuf.ByteString.EMPTY;
            }
            return com.google.protobuf.ByteString.wrap(readRawBytes(rawVarint32));
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
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
                return com.google.protobuf.Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        @Override // com.google.protobuf.CodedInputStream
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
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        @Override // com.google.protobuf.CodedInputStream
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

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte rawByte = readRawByte();
                j |= ((long) (rawByte & 127)) << i;
                if ((rawByte & 128) == 0) {
                    return j;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
            int i = this.pos;
            if (this.limit - i < 4) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
            int i = this.pos;
            if (this.limit - i < 8) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z) {
            this.enableAliasing = z;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (i < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i + getTotalBytesRead();
            if (totalBytesRead < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
            }
            int i2 = this.currentLimit;
            if (totalBytesRead > i2) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i2;
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

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.pos - this.startPos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
            int i = this.pos;
            if (i == this.limit) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 1;
            return bArr[i];
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i) throws java.io.IOException {
            if (i > 0) {
                int i2 = this.limit;
                int i3 = this.pos;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.pos = i4;
                    return java.util.Arrays.copyOfRange(this.buffer, i3, i4);
                }
            }
            if (i > 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (i == 0) {
                return com.google.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i) throws java.io.IOException {
            if (i >= 0) {
                int i2 = this.limit;
                int i3 = this.pos;
                if (i <= i2 - i3) {
                    this.pos = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private static final class UnsafeDirectNioDecoder extends com.google.protobuf.CodedInputStream {
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
            return com.google.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private UnsafeDirectNioDecoder(java.nio.ByteBuffer byteBuffer, boolean z) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = byteBuffer;
            long jAddressOffset = com.google.protobuf.UnsafeUtil.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            this.limit = ((long) byteBuffer.limit()) + jAddressOffset;
            long jPosition = jAddressOffset + ((long) byteBuffer.position());
            this.pos = jPosition;
            this.startPos = jPosition;
            this.immutable = z;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (com.google.protobuf.WireFormat.getTagFieldNumber(rawVarint32) == 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (this.lastTag != i) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i) throws java.io.IOException {
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
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
                checkLastTagWas(com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i, com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                com.google.protobuf.ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int iMakeTag = com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage() throws java.io.IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage(com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, codedOutputStream));
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[rawVarint32];
            long j = rawVarint32;
            com.google.protobuf.UnsafeUtil.copyMemory(this.pos, bArr, 0L, j);
            java.lang.String str = new java.lang.String(bArr, com.google.protobuf.Internal.UTF_8);
            this.pos += j;
            return str;
        }

        @Override // com.google.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                java.lang.String strDecodeUtf8 = com.google.protobuf.Utf8.decodeUtf8(this.buffer, bufferPos(this.pos), rawVarint32);
                this.pos += (long) rawVarint32;
                return strDecodeUtf8;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i, com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(com.google.protobuf.WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends com.google.protobuf.MessageLite> T readGroup(int i, com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(com.google.protobuf.WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(int i, com.google.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(i, builder, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends com.google.protobuf.MessageLite> T readMessage(com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public com.google.protobuf.ByteString readBytes() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return com.google.protobuf.ByteString.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable && this.enableAliasing) {
                long j = this.pos;
                long j2 = rawVarint32;
                java.nio.ByteBuffer byteBufferSlice = slice(j, j + j2);
                this.pos += j2;
                return com.google.protobuf.ByteString.wrap(byteBufferSlice);
            }
            byte[] bArr = new byte[rawVarint32];
            long j3 = rawVarint32;
            com.google.protobuf.UnsafeUtil.copyMemory(this.pos, bArr, 0L, j3);
            this.pos += j3;
            return com.google.protobuf.ByteString.wrap(bArr);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return com.google.protobuf.Internal.EMPTY_BYTE_BUFFER;
                }
                if (rawVarint32 < 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
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
            com.google.protobuf.UnsafeUtil.copyMemory(this.pos, bArr, 0L, j3);
            this.pos += j3;
            return java.nio.ByteBuffer.wrap(bArr);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r4) < 0) goto L34;
         */
        @Override // com.google.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int readRawVarint32() throws java.io.IOException {
            int i;
            long j = this.pos;
            if (this.limit != j) {
                long j2 = j + 1;
                byte b = com.google.protobuf.UnsafeUtil.getByte(j);
                if (b >= 0) {
                    this.pos = j2;
                    return b;
                }
                if (this.limit - j2 >= 9) {
                    long j3 = j2 + 1;
                    int i2 = b ^ (com.google.protobuf.UnsafeUtil.getByte(j2) << 7);
                    if (i2 < 0) {
                        i = i2 ^ (-128);
                    } else {
                        long j4 = j3 + 1;
                        int i3 = i2 ^ (com.google.protobuf.UnsafeUtil.getByte(j3) << 14);
                        if (i3 >= 0) {
                            i = i3 ^ 16256;
                        } else {
                            j3 = j4 + 1;
                            int i4 = i3 ^ (com.google.protobuf.UnsafeUtil.getByte(j4) << 21);
                            if (i4 < 0) {
                                i = i4 ^ (-2080896);
                            } else {
                                j4 = j3 + 1;
                                byte b2 = com.google.protobuf.UnsafeUtil.getByte(j3);
                                i = (i4 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    j3 = j4 + 1;
                                    if (com.google.protobuf.UnsafeUtil.getByte(j4) < 0) {
                                        j4 = j3 + 1;
                                        if (com.google.protobuf.UnsafeUtil.getByte(j3) < 0) {
                                            j3 = j4 + 1;
                                            if (com.google.protobuf.UnsafeUtil.getByte(j4) < 0) {
                                                j4 = j3 + 1;
                                                if (com.google.protobuf.UnsafeUtil.getByte(j3) < 0) {
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
                if (com.google.protobuf.UnsafeUtil.getByte(j) >= 0) {
                    return;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() throws java.io.IOException {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.pos;
            if (this.limit != j4) {
                long j5 = j4 + 1;
                byte b = com.google.protobuf.UnsafeUtil.getByte(j4);
                if (b >= 0) {
                    this.pos = j5;
                    return b;
                }
                if (this.limit - j5 >= 9) {
                    long j6 = j5 + 1;
                    int i2 = b ^ (com.google.protobuf.UnsafeUtil.getByte(j5) << 7);
                    if (i2 >= 0) {
                        long j7 = j6 + 1;
                        int i3 = i2 ^ (com.google.protobuf.UnsafeUtil.getByte(j6) << 14);
                        if (i3 < 0) {
                            j6 = j7 + 1;
                            int i4 = i3 ^ (com.google.protobuf.UnsafeUtil.getByte(j7) << 21);
                            if (i4 < 0) {
                                i = i4 ^ (-2080896);
                            } else {
                                j7 = j6 + 1;
                                long j8 = ((long) i4) ^ (((long) com.google.protobuf.UnsafeUtil.getByte(j6)) << 28);
                                if (j8 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j9 = j7 + 1;
                                    long j10 = j8 ^ (((long) com.google.protobuf.UnsafeUtil.getByte(j7)) << 35);
                                    if (j10 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j9 + 1;
                                        j8 = j10 ^ (((long) com.google.protobuf.UnsafeUtil.getByte(j9)) << 42);
                                        if (j8 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j9 = j7 + 1;
                                            j10 = j8 ^ (((long) com.google.protobuf.UnsafeUtil.getByte(j7)) << 49);
                                            if (j10 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j9 + 1;
                                                j = (j10 ^ (((long) com.google.protobuf.UnsafeUtil.getByte(j9)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j11 = 1 + j7;
                                                    if (com.google.protobuf.UnsafeUtil.getByte(j7) >= 0) {
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

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte rawByte = readRawByte();
                j |= ((long) (rawByte & 127)) << i;
                if ((rawByte & 128) == 0) {
                    return j;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
            long j = this.pos;
            if (this.limit - j < 4) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 4 + j;
            return ((com.google.protobuf.UnsafeUtil.getByte(j + 3) & 255) << 24) | (com.google.protobuf.UnsafeUtil.getByte(j) & 255) | ((com.google.protobuf.UnsafeUtil.getByte(1 + j) & 255) << 8) | ((com.google.protobuf.UnsafeUtil.getByte(2 + j) & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
            long j = this.pos;
            if (this.limit - j < 8) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 8 + j;
            return ((((long) com.google.protobuf.UnsafeUtil.getByte(j + 7)) & 255) << 56) | (((long) com.google.protobuf.UnsafeUtil.getByte(j)) & 255) | ((((long) com.google.protobuf.UnsafeUtil.getByte(1 + j)) & 255) << 8) | ((((long) com.google.protobuf.UnsafeUtil.getByte(2 + j)) & 255) << 16) | ((((long) com.google.protobuf.UnsafeUtil.getByte(3 + j)) & 255) << 24) | ((((long) com.google.protobuf.UnsafeUtil.getByte(4 + j)) & 255) << 32) | ((((long) com.google.protobuf.UnsafeUtil.getByte(5 + j)) & 255) << 40) | ((((long) com.google.protobuf.UnsafeUtil.getByte(6 + j)) & 255) << 48);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z) {
            this.enableAliasing = z;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (i < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i + getTotalBytesRead();
            int i2 = this.currentLimit;
            if (totalBytesRead > i2) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (this.pos - this.startPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
            long j = this.pos;
            if (j == this.limit) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 1 + j;
            return com.google.protobuf.UnsafeUtil.getByte(j);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i) throws java.io.IOException {
            if (i < 0 || i > remaining()) {
                if (i > 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
                }
                if (i == 0) {
                    return com.google.protobuf.Internal.EMPTY_BYTE_ARRAY;
                }
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArr = new byte[i];
            long j = this.pos;
            long j2 = i;
            slice(j, j + j2).get(bArr);
            this.pos += j2;
            return bArr;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i) throws java.io.IOException {
            if (i >= 0 && i <= remaining()) {
                this.pos += (long) i;
            } else {
                if (i < 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
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

        private int bufferPos(long j) {
            return (int) (j - this.address);
        }

        private java.nio.ByteBuffer slice(long j, long j2) throws java.io.IOException {
            int iPosition = this.buffer.position();
            int iLimit = this.buffer.limit();
            java.nio.ByteBuffer byteBuffer = this.buffer;
            try {
                try {
                    byteBuffer.position(bufferPos(j));
                    byteBuffer.limit(bufferPos(j2));
                    java.nio.ByteBuffer byteBufferSlice = this.buffer.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (java.lang.IllegalArgumentException e) {
                    com.google.protobuf.InvalidProtocolBufferException invalidProtocolBufferExceptionTruncatedMessage = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
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

    private static final class StreamDecoder extends com.google.protobuf.CodedInputStream {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final java.io.InputStream input;
        private int lastTag;
        private int pos;
        private com.google.protobuf.CodedInputStream.StreamDecoder.RefillCallback refillCallback;
        private int totalBytesRetired;

        private interface RefillCallback {
            void onRefill();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z) {
        }

        private StreamDecoder(java.io.InputStream inputStream, int i) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.refillCallback = null;
            com.google.protobuf.Internal.checkNotNull(inputStream, "input");
            this.input = inputStream;
            this.buffer = new byte[i];
            this.bufferSize = 0;
            this.pos = 0;
            this.totalBytesRetired = 0;
        }

        private static int read(java.io.InputStream inputStream, byte[] bArr, int i, int i2) throws java.io.IOException {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private static long skip(java.io.InputStream inputStream, long j) throws java.io.IOException {
            try {
                return inputStream.skip(j);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private static int available(java.io.InputStream inputStream) throws java.io.IOException {
            try {
                return inputStream.available();
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (com.google.protobuf.WireFormat.getTagFieldNumber(rawVarint32) == 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (this.lastTag != i) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i) throws java.io.IOException {
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
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
                checkLastTagWas(com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i, com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                com.google.protobuf.ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int iMakeTag = com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage() throws java.io.IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage(com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, codedOutputStream));
        }

        private class SkippedDataSink implements com.google.protobuf.CodedInputStream.StreamDecoder.RefillCallback {
            private java.io.ByteArrayOutputStream byteArrayStream;
            private int lastPos;

            private SkippedDataSink() {
                this.lastPos = com.google.protobuf.CodedInputStream.StreamDecoder.this.pos;
            }

            @Override // com.google.protobuf.CodedInputStream.StreamDecoder.RefillCallback
            public void onRefill() {
                if (this.byteArrayStream == null) {
                    this.byteArrayStream = new java.io.ByteArrayOutputStream();
                }
                this.byteArrayStream.write(com.google.protobuf.CodedInputStream.StreamDecoder.this.buffer, this.lastPos, com.google.protobuf.CodedInputStream.StreamDecoder.this.pos - this.lastPos);
                this.lastPos = 0;
            }

            java.nio.ByteBuffer getSkippedData() {
                java.io.ByteArrayOutputStream byteArrayOutputStream = this.byteArrayStream;
                if (byteArrayOutputStream == null) {
                    return java.nio.ByteBuffer.wrap(com.google.protobuf.CodedInputStream.StreamDecoder.this.buffer, this.lastPos, com.google.protobuf.CodedInputStream.StreamDecoder.this.pos - this.lastPos);
                }
                byteArrayOutputStream.write(com.google.protobuf.CodedInputStream.StreamDecoder.this.buffer, this.lastPos, com.google.protobuf.CodedInputStream.StreamDecoder.this.pos);
                return java.nio.ByteBuffer.wrap(this.byteArrayStream.toByteArray());
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= this.bufferSize - this.pos) {
                java.lang.String str = new java.lang.String(this.buffer, this.pos, rawVarint32, com.google.protobuf.Internal.UTF_8);
                this.pos += rawVarint32;
                return str;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= this.bufferSize) {
                refillBuffer(rawVarint32);
                java.lang.String str2 = new java.lang.String(this.buffer, this.pos, rawVarint32, com.google.protobuf.Internal.UTF_8);
                this.pos += rawVarint32;
                return str2;
            }
            return new java.lang.String(readRawBytesSlowPath(rawVarint32, false), com.google.protobuf.Internal.UTF_8);
        }

        @Override // com.google.protobuf.CodedInputStream
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
                i = 0;
                if (rawVarint32 <= i2) {
                    refillBuffer(rawVarint32);
                    rawBytesSlowPath = this.buffer;
                    this.pos = rawVarint32 + 0;
                } else {
                    rawBytesSlowPath = readRawBytesSlowPath(rawVarint32, false);
                }
            }
            return com.google.protobuf.Utf8.decodeUtf8(rawBytesSlowPath, i, rawVarint32);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i, com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(com.google.protobuf.WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends com.google.protobuf.MessageLite> T readGroup(int i, com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(com.google.protobuf.WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(int i, com.google.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(i, builder, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends com.google.protobuf.MessageLite> T readMessage(com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public com.google.protobuf.ByteString readBytes() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i2 = this.pos;
            if (rawVarint32 > i - i2 || rawVarint32 <= 0) {
                if (rawVarint32 == 0) {
                    return com.google.protobuf.ByteString.EMPTY;
                }
                return readBytesSlowPath(rawVarint32);
            }
            com.google.protobuf.ByteString byteStringCopyFrom = com.google.protobuf.ByteString.copyFrom(this.buffer, i2, rawVarint32);
            this.pos += rawVarint32;
            return byteStringCopyFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i2 = this.pos;
            if (rawVarint32 <= i - i2 && rawVarint32 > 0) {
                byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(this.buffer, i2, i2 + rawVarint32);
                this.pos += rawVarint32;
                return bArrCopyOfRange;
            }
            return readRawBytesSlowPath(rawVarint32, false);
        }

        @Override // com.google.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i2 = this.pos;
            if (rawVarint32 > i - i2 || rawVarint32 <= 0) {
                if (rawVarint32 == 0) {
                    return com.google.protobuf.Internal.EMPTY_BYTE_BUFFER;
                }
                return java.nio.ByteBuffer.wrap(readRawBytesSlowPath(rawVarint32, true));
            }
            java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(java.util.Arrays.copyOfRange(this.buffer, i2, i2 + rawVarint32));
            this.pos += rawVarint32;
            return byteBufferWrap;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        @Override // com.google.protobuf.CodedInputStream
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
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        @Override // com.google.protobuf.CodedInputStream
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

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte rawByte = readRawByte();
                j |= ((long) (rawByte & 127)) << i;
                if ((rawByte & 128) == 0) {
                    return j;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
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

        @Override // com.google.protobuf.CodedInputStream
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

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.totalBytesRetired = -this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (i < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int i2 = i + this.totalBytesRetired + this.pos;
            int i3 = this.currentLimit;
            if (i2 > i3) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = i2;
            recomputeBufferSizeAfterLimit();
            return i3;
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

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.totalBytesRetired + this.pos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
            return this.pos == this.bufferSize && !tryRefillBuffer(1);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.totalBytesRetired + this.pos;
        }

        private void refillBuffer(int i) throws java.io.IOException {
            if (tryRefillBuffer(i)) {
                return;
            }
            if (i > (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                throw com.google.protobuf.InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        private boolean tryRefillBuffer(int i) throws java.io.IOException {
            if (this.pos + i <= this.bufferSize) {
                throw new java.lang.IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
            int i2 = this.sizeLimit;
            int i3 = this.totalBytesRetired;
            int i4 = this.pos;
            if (i > (i2 - i3) - i4 || i3 + i4 + i > this.currentLimit) {
                return false;
            }
            com.google.protobuf.CodedInputStream.StreamDecoder.RefillCallback refillCallback = this.refillCallback;
            if (refillCallback != null) {
                refillCallback.onRefill();
            }
            int i5 = this.pos;
            if (i5 > 0) {
                int i6 = this.bufferSize;
                if (i6 > i5) {
                    byte[] bArr = this.buffer;
                    java.lang.System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                }
                this.totalBytesRetired += i5;
                this.bufferSize -= i5;
                this.pos = 0;
            }
            java.io.InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i7 = this.bufferSize;
            int i8 = read(inputStream, bArr2, i7, java.lang.Math.min(bArr2.length - i7, (this.sizeLimit - this.totalBytesRetired) - this.bufferSize));
            if (i8 == 0 || i8 < -1 || i8 > this.buffer.length) {
                throw new java.lang.IllegalStateException(this.input.getClass() + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
            }
            if (i8 <= 0) {
                return false;
            }
            this.bufferSize += i8;
            recomputeBufferSizeAfterLimit();
            if (this.bufferSize >= i) {
                return true;
            }
            return tryRefillBuffer(i);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
            if (this.pos == this.bufferSize) {
                refillBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i = this.pos;
            this.pos = i + 1;
            return bArr[i];
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i) throws java.io.IOException {
            int i2 = this.pos;
            if (i <= this.bufferSize - i2 && i > 0) {
                int i3 = i + i2;
                this.pos = i3;
                return java.util.Arrays.copyOfRange(this.buffer, i2, i3);
            }
            return readRawBytesSlowPath(i, false);
        }

        private byte[] readRawBytesSlowPath(int i, boolean z) throws java.io.IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i);
            if (rawBytesSlowPathOneChunk != null) {
                return z ? (byte[]) rawBytesSlowPathOneChunk.clone() : rawBytesSlowPathOneChunk;
            }
            int i2 = this.pos;
            int i3 = this.bufferSize;
            int length = i3 - i2;
            this.totalBytesRetired += i3;
            this.pos = 0;
            this.bufferSize = 0;
            java.util.List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i - length);
            byte[] bArr = new byte[i];
            java.lang.System.arraycopy(this.buffer, i2, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                java.lang.System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] readRawBytesSlowPathOneChunk(int i) throws java.io.IOException {
            if (i == 0) {
                return com.google.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            if (i < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.totalBytesRetired + this.pos + i;
            if (i2 - this.sizeLimit > 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i3 = this.currentLimit;
            if (i2 > i3) {
                skipRawBytes((i3 - this.totalBytesRetired) - this.pos);
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            int i4 = this.bufferSize - this.pos;
            int i5 = i - i4;
            if (i5 >= 4096 && i5 > available(this.input)) {
                return null;
            }
            byte[] bArr = new byte[i];
            java.lang.System.arraycopy(this.buffer, this.pos, bArr, 0, i4);
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            while (i4 < i) {
                int i6 = read(this.input, bArr, i4, i - i4);
                if (i6 == -1) {
                    throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += i6;
                i4 += i6;
            }
            return bArr;
        }

        private java.util.List<byte[]> readRawBytesSlowPathRemainingChunks(int i) throws java.io.IOException {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (i > 0) {
                int iMin = java.lang.Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.input.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.totalBytesRetired += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private com.google.protobuf.ByteString readBytesSlowPath(int i) throws java.io.IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i);
            if (rawBytesSlowPathOneChunk != null) {
                return com.google.protobuf.ByteString.copyFrom(rawBytesSlowPathOneChunk);
            }
            int i2 = this.pos;
            int i3 = this.bufferSize;
            int length = i3 - i2;
            this.totalBytesRetired += i3;
            this.pos = 0;
            this.bufferSize = 0;
            java.util.List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i - length);
            byte[] bArr = new byte[i];
            java.lang.System.arraycopy(this.buffer, i2, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                java.lang.System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return com.google.protobuf.ByteString.wrap(bArr);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i) throws java.io.IOException {
            int i2 = this.bufferSize;
            int i3 = this.pos;
            if (i <= i2 - i3 && i >= 0) {
                this.pos = i3 + i;
            } else {
                skipRawBytesSlowPath(i);
            }
        }

        private void skipRawBytesSlowPath(int i) throws java.io.IOException {
            if (i < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.totalBytesRetired;
            int i3 = this.pos;
            int i4 = i2 + i3 + i;
            int i5 = this.currentLimit;
            if (i4 > i5) {
                skipRawBytes((i5 - i2) - i3);
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            int i6 = 0;
            if (this.refillCallback == null) {
                this.totalBytesRetired = i2 + i3;
                int i7 = this.bufferSize - i3;
                this.bufferSize = 0;
                this.pos = 0;
                i6 = i7;
                while (i6 < i) {
                    try {
                        long j = i - i6;
                        long jSkip = skip(this.input, j);
                        if (jSkip < 0 || jSkip > j) {
                            throw new java.lang.IllegalStateException(this.input.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i6 += (int) jSkip;
                        }
                    } catch (java.lang.Throwable th) {
                        this.totalBytesRetired += i6;
                        recomputeBufferSizeAfterLimit();
                        throw th;
                    }
                }
                this.totalBytesRetired += i6;
                recomputeBufferSizeAfterLimit();
            }
            if (i6 >= i) {
                return;
            }
            int i8 = this.bufferSize;
            int i9 = i8 - this.pos;
            this.pos = i8;
            refillBuffer(1);
            while (true) {
                int i10 = i - i9;
                int i11 = this.bufferSize;
                if (i10 > i11) {
                    i9 += i11;
                    this.pos = i11;
                    refillBuffer(1);
                } else {
                    this.pos = i10;
                    return;
                }
            }
        }
    }

    private static final class IterableDirectByteBufferDecoder extends com.google.protobuf.CodedInputStream {
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

        private IterableDirectByteBufferDecoder(java.lang.Iterable<java.nio.ByteBuffer> iterable, int i, boolean z) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.totalBufferSize = i;
            this.input = iterable;
            this.iterator = iterable.iterator();
            this.immutable = z;
            this.totalBytesRead = 0;
            this.startOffset = 0;
            if (i == 0) {
                this.currentByteBuffer = com.google.protobuf.Internal.EMPTY_BYTE_BUFFER;
                this.currentByteBufferPos = 0L;
                this.currentByteBufferStartPos = 0L;
                this.currentByteBufferLimit = 0L;
                this.currentAddress = 0L;
                return;
            }
            tryGetNextByteBuffer();
        }

        private void getNextByteBuffer() throws com.google.protobuf.InvalidProtocolBufferException {
            if (!this.iterator.hasNext()) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
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
            long jAddressOffset = com.google.protobuf.UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentAddress = jAddressOffset;
            this.currentByteBufferPos += jAddressOffset;
            this.currentByteBufferStartPos += jAddressOffset;
            this.currentByteBufferLimit += jAddressOffset;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (com.google.protobuf.WireFormat.getTagFieldNumber(rawVarint32) == 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (this.lastTag != i) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i) throws java.io.IOException {
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
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
                checkLastTagWas(com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i, com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                com.google.protobuf.ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int iMakeTag = com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage() throws java.io.IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage(com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, codedOutputStream));
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j = rawVarint32;
                long j2 = this.currentByteBufferLimit;
                long j3 = this.currentByteBufferPos;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[rawVarint32];
                    com.google.protobuf.UnsafeUtil.copyMemory(j3, bArr, 0L, j);
                    java.lang.String str = new java.lang.String(bArr, com.google.protobuf.Internal.UTF_8);
                    this.currentByteBufferPos += j;
                    return str;
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return new java.lang.String(bArr2, com.google.protobuf.Internal.UTF_8);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j = rawVarint32;
                long j2 = this.currentByteBufferLimit;
                long j3 = this.currentByteBufferPos;
                if (j <= j2 - j3) {
                    java.lang.String strDecodeUtf8 = com.google.protobuf.Utf8.decodeUtf8(this.currentByteBuffer, (int) (j3 - this.currentByteBufferStartPos), rawVarint32);
                    this.currentByteBufferPos += j;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 >= 0 && rawVarint32 <= remaining()) {
                byte[] bArr = new byte[rawVarint32];
                readRawBytesTo(bArr, 0, rawVarint32);
                return com.google.protobuf.Utf8.decodeUtf8(bArr, 0, rawVarint32);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i, com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(com.google.protobuf.WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends com.google.protobuf.MessageLite> T readGroup(int i, com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(com.google.protobuf.WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(int i, com.google.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(i, builder, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends com.google.protobuf.MessageLite> T readMessage(com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public com.google.protobuf.ByteString readBytes() throws java.io.IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j = rawVarint32;
                long j2 = this.currentByteBufferLimit;
                long j3 = this.currentByteBufferPos;
                if (j <= j2 - j3) {
                    if (this.immutable && this.enableAliasing) {
                        int i = (int) (j3 - this.currentAddress);
                        com.google.protobuf.ByteString byteStringWrap = com.google.protobuf.ByteString.wrap(slice(i, rawVarint32 + i));
                        this.currentByteBufferPos += j;
                        return byteStringWrap;
                    }
                    byte[] bArr = new byte[rawVarint32];
                    com.google.protobuf.UnsafeUtil.copyMemory(j3, bArr, 0L, j);
                    this.currentByteBufferPos += j;
                    return com.google.protobuf.ByteString.wrap(bArr);
                }
            }
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return com.google.protobuf.ByteString.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable && this.enableAliasing) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (rawVarint32 > 0) {
                    if (currentRemaining() == 0) {
                        getNextByteBuffer();
                    }
                    int iMin = java.lang.Math.min(rawVarint32, (int) currentRemaining());
                    int i2 = (int) (this.currentByteBufferPos - this.currentAddress);
                    arrayList.add(com.google.protobuf.ByteString.wrap(slice(i2, i2 + iMin)));
                    rawVarint32 -= iMin;
                    this.currentByteBufferPos += (long) iMin;
                }
                return com.google.protobuf.ByteString.copyFrom(arrayList);
            }
            byte[] bArr2 = new byte[rawVarint32];
            readRawBytesTo(bArr2, 0, rawVarint32);
            return com.google.protobuf.ByteString.wrap(bArr2);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
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
                    com.google.protobuf.UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j);
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
                return com.google.protobuf.Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r4) < 0) goto L34;
         */
        @Override // com.google.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int readRawVarint32() throws java.io.IOException {
            int i;
            long j = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j) {
                long j2 = j + 1;
                byte b = com.google.protobuf.UnsafeUtil.getByte(j);
                if (b >= 0) {
                    this.currentByteBufferPos++;
                    return b;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j3 = j2 + 1;
                    int i2 = b ^ (com.google.protobuf.UnsafeUtil.getByte(j2) << 7);
                    if (i2 < 0) {
                        i = i2 ^ (-128);
                    } else {
                        long j4 = j3 + 1;
                        int i3 = i2 ^ (com.google.protobuf.UnsafeUtil.getByte(j3) << 14);
                        if (i3 >= 0) {
                            i = i3 ^ 16256;
                        } else {
                            j3 = j4 + 1;
                            int i4 = i3 ^ (com.google.protobuf.UnsafeUtil.getByte(j4) << 21);
                            if (i4 < 0) {
                                i = i4 ^ (-2080896);
                            } else {
                                j4 = j3 + 1;
                                byte b2 = com.google.protobuf.UnsafeUtil.getByte(j3);
                                i = (i4 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    j3 = j4 + 1;
                                    if (com.google.protobuf.UnsafeUtil.getByte(j4) < 0) {
                                        j4 = j3 + 1;
                                        if (com.google.protobuf.UnsafeUtil.getByte(j3) < 0) {
                                            j3 = j4 + 1;
                                            if (com.google.protobuf.UnsafeUtil.getByte(j4) < 0) {
                                                j4 = j3 + 1;
                                                if (com.google.protobuf.UnsafeUtil.getByte(j3) < 0) {
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

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() throws java.io.IOException {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j4) {
                long j5 = j4 + 1;
                byte b = com.google.protobuf.UnsafeUtil.getByte(j4);
                if (b >= 0) {
                    this.currentByteBufferPos++;
                    return b;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j6 = j5 + 1;
                    int i2 = b ^ (com.google.protobuf.UnsafeUtil.getByte(j5) << 7);
                    if (i2 >= 0) {
                        long j7 = j6 + 1;
                        int i3 = i2 ^ (com.google.protobuf.UnsafeUtil.getByte(j6) << 14);
                        if (i3 < 0) {
                            j6 = j7 + 1;
                            int i4 = i3 ^ (com.google.protobuf.UnsafeUtil.getByte(j7) << 21);
                            if (i4 < 0) {
                                i = i4 ^ (-2080896);
                            } else {
                                j7 = j6 + 1;
                                long j8 = ((long) i4) ^ (((long) com.google.protobuf.UnsafeUtil.getByte(j6)) << 28);
                                if (j8 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j9 = j7 + 1;
                                    long j10 = j8 ^ (((long) com.google.protobuf.UnsafeUtil.getByte(j7)) << 35);
                                    if (j10 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j9 + 1;
                                        j8 = j10 ^ (((long) com.google.protobuf.UnsafeUtil.getByte(j9)) << 42);
                                        if (j8 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j9 = j7 + 1;
                                            j10 = j8 ^ (((long) com.google.protobuf.UnsafeUtil.getByte(j7)) << 49);
                                            if (j10 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j9 + 1;
                                                j = (j10 ^ (((long) com.google.protobuf.UnsafeUtil.getByte(j9)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j11 = 1 + j7;
                                                    if (com.google.protobuf.UnsafeUtil.getByte(j7) >= 0) {
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

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte rawByte = readRawByte();
                j |= ((long) (rawByte & 127)) << i;
                if ((rawByte & 128) == 0) {
                    return j;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
            if (currentRemaining() >= 4) {
                long j = this.currentByteBufferPos;
                this.currentByteBufferPos = 4 + j;
                return ((com.google.protobuf.UnsafeUtil.getByte(j + 3) & 255) << 24) | (com.google.protobuf.UnsafeUtil.getByte(j) & 255) | ((com.google.protobuf.UnsafeUtil.getByte(1 + j) & 255) << 8) | ((com.google.protobuf.UnsafeUtil.getByte(2 + j) & 255) << 16);
            }
            return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
            long rawByte;
            byte rawByte2;
            if (currentRemaining() >= 8) {
                long j = this.currentByteBufferPos;
                this.currentByteBufferPos = 8 + j;
                rawByte = (((long) com.google.protobuf.UnsafeUtil.getByte(j)) & 255) | ((((long) com.google.protobuf.UnsafeUtil.getByte(1 + j)) & 255) << 8) | ((((long) com.google.protobuf.UnsafeUtil.getByte(2 + j)) & 255) << 16) | ((((long) com.google.protobuf.UnsafeUtil.getByte(3 + j)) & 255) << 24) | ((((long) com.google.protobuf.UnsafeUtil.getByte(4 + j)) & 255) << 32) | ((((long) com.google.protobuf.UnsafeUtil.getByte(5 + j)) & 255) << 40) | ((((long) com.google.protobuf.UnsafeUtil.getByte(6 + j)) & 255) << 48);
                rawByte2 = com.google.protobuf.UnsafeUtil.getByte(j + 7);
            } else {
                rawByte = (((long) readRawByte()) & 255) | ((((long) readRawByte()) & 255) << 8) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48);
                rawByte2 = readRawByte();
            }
            return ((((long) rawByte2) & 255) << 56) | rawByte;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z) {
            this.enableAliasing = z;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startOffset = (int) ((((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (i < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i + getTotalBytesRead();
            int i2 = this.currentLimit;
            if (totalBytesRead > i2) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i2;
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

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
            return (((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos == ((long) this.totalBufferSize);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) ((((long) (this.totalBytesRead - this.startOffset)) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            long j = this.currentByteBufferPos;
            this.currentByteBufferPos = 1 + j;
            return com.google.protobuf.UnsafeUtil.getByte(j);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i) throws java.io.IOException {
            if (i >= 0) {
                long j = i;
                if (j <= currentRemaining()) {
                    byte[] bArr = new byte[i];
                    com.google.protobuf.UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j);
                    this.currentByteBufferPos += j;
                    return bArr;
                }
            }
            if (i >= 0 && i <= remaining()) {
                byte[] bArr2 = new byte[i];
                readRawBytesTo(bArr2, 0, i);
                return bArr2;
            }
            if (i > 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (i == 0) {
                return com.google.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        }

        private void readRawBytesTo(byte[] bArr, int i, int i2) throws java.io.IOException {
            if (i2 < 0 || i2 > remaining()) {
                if (i2 > 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
                }
                if (i2 != 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i3 = i2;
            while (i3 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = java.lang.Math.min(i3, (int) currentRemaining());
                long j = iMin;
                com.google.protobuf.UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, (i2 - i3) + i, j);
                i3 -= iMin;
                this.currentByteBufferPos += j;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i) throws java.io.IOException {
            if (i < 0 || i > (((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos) {
                if (i < 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            while (i > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = java.lang.Math.min(i, (int) currentRemaining());
                i -= iMin;
                this.currentByteBufferPos += (long) iMin;
            }
        }

        private void skipRawVarint() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private int remaining() {
            return (int) ((((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
        }

        private long currentRemaining() {
            return this.currentByteBufferLimit - this.currentByteBufferPos;
        }

        private java.nio.ByteBuffer slice(int i, int i2) throws java.io.IOException {
            int iPosition = this.currentByteBuffer.position();
            int iLimit = this.currentByteBuffer.limit();
            java.nio.ByteBuffer byteBuffer = this.currentByteBuffer;
            try {
                try {
                    byteBuffer.position(i);
                    byteBuffer.limit(i2);
                    java.nio.ByteBuffer byteBufferSlice = this.currentByteBuffer.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (java.lang.IllegalArgumentException unused) {
                    throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
                }
            } catch (java.lang.Throwable th) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th;
            }
        }
    }
}
