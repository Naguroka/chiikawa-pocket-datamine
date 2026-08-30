package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CodedOutputStream extends com.google.protobuf.ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @java.lang.Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    com.google.protobuf.CodedOutputStreamWriter wrapper;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.protobuf.CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = com.google.protobuf.UnsafeUtil.hasUnsafeArrayOperations();

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeDoubleSizeNoTag(double d) {
        return 8;
    }

    public static int computeFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeFloatSizeNoTag(float f) {
        return 4;
    }

    static int computePreferredBufferSize(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeUInt32SizeNoTag(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64SizeNoTag(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public abstract void flush() throws java.io.IOException;

    public abstract int getTotalBytesWritten();

    public abstract int spaceLeft();

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte b) throws java.io.IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract void writeBool(int i, boolean z) throws java.io.IOException;

    public abstract void writeByteArray(int i, byte[] bArr) throws java.io.IOException;

    public abstract void writeByteArray(int i, byte[] bArr, int i2, int i3) throws java.io.IOException;

    abstract void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract void writeByteBuffer(int i, java.nio.ByteBuffer byteBuffer) throws java.io.IOException;

    public abstract void writeBytes(int i, com.google.protobuf.ByteString byteString) throws java.io.IOException;

    public abstract void writeBytesNoTag(com.google.protobuf.ByteString byteString) throws java.io.IOException;

    public abstract void writeFixed32(int i, int i2) throws java.io.IOException;

    public abstract void writeFixed32NoTag(int i) throws java.io.IOException;

    public abstract void writeFixed64(int i, long j) throws java.io.IOException;

    public abstract void writeFixed64NoTag(long j) throws java.io.IOException;

    public abstract void writeInt32(int i, int i2) throws java.io.IOException;

    public abstract void writeInt32NoTag(int i) throws java.io.IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(java.nio.ByteBuffer byteBuffer) throws java.io.IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract void writeMessage(int i, com.google.protobuf.MessageLite messageLite) throws java.io.IOException;

    abstract void writeMessage(int i, com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) throws java.io.IOException;

    public abstract void writeMessageNoTag(com.google.protobuf.MessageLite messageLite) throws java.io.IOException;

    abstract void writeMessageNoTag(com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) throws java.io.IOException;

    public abstract void writeMessageSetExtension(int i, com.google.protobuf.MessageLite messageLite) throws java.io.IOException;

    public abstract void writeRawBytes(java.nio.ByteBuffer byteBuffer) throws java.io.IOException;

    public abstract void writeRawMessageSetExtension(int i, com.google.protobuf.ByteString byteString) throws java.io.IOException;

    public abstract void writeString(int i, java.lang.String str) throws java.io.IOException;

    public abstract void writeStringNoTag(java.lang.String str) throws java.io.IOException;

    public abstract void writeTag(int i, int i2) throws java.io.IOException;

    public abstract void writeUInt32(int i, int i2) throws java.io.IOException;

    public abstract void writeUInt32NoTag(int i) throws java.io.IOException;

    public abstract void writeUInt64(int i, long j) throws java.io.IOException;

    public abstract void writeUInt64NoTag(long j) throws java.io.IOException;

    public static com.google.protobuf.CodedOutputStream newInstance(java.io.OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public static com.google.protobuf.CodedOutputStream newInstance(java.io.OutputStream outputStream, int i) {
        return new com.google.protobuf.CodedOutputStream.OutputStreamEncoder(outputStream, i);
    }

    public static com.google.protobuf.CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static com.google.protobuf.CodedOutputStream newInstance(byte[] bArr, int i, int i2) {
        return new com.google.protobuf.CodedOutputStream.ArrayEncoder(bArr, i, i2);
    }

    public static com.google.protobuf.CodedOutputStream newInstance(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new com.google.protobuf.CodedOutputStream.HeapNioEncoder(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (com.google.protobuf.CodedOutputStream.UnsafeDirectNioEncoder.isSupported()) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new java.lang.IllegalArgumentException("ByteBuffer is read-only");
    }

    static com.google.protobuf.CodedOutputStream newUnsafeInstance(java.nio.ByteBuffer byteBuffer) {
        return new com.google.protobuf.CodedOutputStream.UnsafeDirectNioEncoder(byteBuffer);
    }

    static com.google.protobuf.CodedOutputStream newSafeInstance(java.nio.ByteBuffer byteBuffer) {
        return new com.google.protobuf.CodedOutputStream.SafeDirectNioEncoder(byteBuffer);
    }

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    @java.lang.Deprecated
    public static com.google.protobuf.CodedOutputStream newInstance(java.nio.ByteBuffer byteBuffer, int i) {
        return newInstance(byteBuffer);
    }

    static com.google.protobuf.CodedOutputStream newInstance(com.google.protobuf.ByteOutput byteOutput, int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("bufferSize must be positive");
        }
        return new com.google.protobuf.CodedOutputStream.ByteOutputEncoder(byteOutput, i);
    }

    private CodedOutputStream() {
    }

    public final void writeSInt32(int i, int i2) throws java.io.IOException {
        writeUInt32(i, encodeZigZag32(i2));
    }

    public final void writeSFixed32(int i, int i2) throws java.io.IOException {
        writeFixed32(i, i2);
    }

    public final void writeInt64(int i, long j) throws java.io.IOException {
        writeUInt64(i, j);
    }

    public final void writeSInt64(int i, long j) throws java.io.IOException {
        writeUInt64(i, encodeZigZag64(j));
    }

    public final void writeSFixed64(int i, long j) throws java.io.IOException {
        writeFixed64(i, j);
    }

    public final void writeFloat(int i, float f) throws java.io.IOException {
        writeFixed32(i, java.lang.Float.floatToRawIntBits(f));
    }

    public final void writeDouble(int i, double d) throws java.io.IOException {
        writeFixed64(i, java.lang.Double.doubleToRawLongBits(d));
    }

    public final void writeEnum(int i, int i2) throws java.io.IOException {
        writeInt32(i, i2);
    }

    public final void writeRawByte(byte b) throws java.io.IOException {
        write(b);
    }

    public final void writeRawByte(int i) throws java.io.IOException {
        write((byte) i);
    }

    public final void writeRawBytes(byte[] bArr) throws java.io.IOException {
        write(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(byte[] bArr, int i, int i2) throws java.io.IOException {
        write(bArr, i, i2);
    }

    public final void writeRawBytes(com.google.protobuf.ByteString byteString) throws java.io.IOException {
        byteString.writeTo(this);
    }

    public final void writeSInt32NoTag(int i) throws java.io.IOException {
        writeUInt32NoTag(encodeZigZag32(i));
    }

    public final void writeSFixed32NoTag(int i) throws java.io.IOException {
        writeFixed32NoTag(i);
    }

    public final void writeInt64NoTag(long j) throws java.io.IOException {
        writeUInt64NoTag(j);
    }

    public final void writeSInt64NoTag(long j) throws java.io.IOException {
        writeUInt64NoTag(encodeZigZag64(j));
    }

    public final void writeSFixed64NoTag(long j) throws java.io.IOException {
        writeFixed64NoTag(j);
    }

    public final void writeFloatNoTag(float f) throws java.io.IOException {
        writeFixed32NoTag(java.lang.Float.floatToRawIntBits(f));
    }

    public final void writeDoubleNoTag(double d) throws java.io.IOException {
        writeFixed64NoTag(java.lang.Double.doubleToRawLongBits(d));
    }

    public final void writeBoolNoTag(boolean z) throws java.io.IOException {
        write(z ? (byte) 1 : (byte) 0);
    }

    public final void writeEnumNoTag(int i) throws java.io.IOException {
        writeInt32NoTag(i);
    }

    public final void writeByteArrayNoTag(byte[] bArr) throws java.io.IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public static int computeInt32Size(int i, int i2) {
        return computeTagSize(i) + computeInt32SizeNoTag(i2);
    }

    public static int computeUInt32Size(int i, int i2) {
        return computeTagSize(i) + computeUInt32SizeNoTag(i2);
    }

    public static int computeSInt32Size(int i, int i2) {
        return computeTagSize(i) + computeSInt32SizeNoTag(i2);
    }

    public static int computeFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeFixed32SizeNoTag(i2);
    }

    public static int computeSFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeSFixed32SizeNoTag(i2);
    }

    public static int computeInt64Size(int i, long j) {
        return computeTagSize(i) + computeInt64SizeNoTag(j);
    }

    public static int computeUInt64Size(int i, long j) {
        return computeTagSize(i) + computeUInt64SizeNoTag(j);
    }

    public static int computeSInt64Size(int i, long j) {
        return computeTagSize(i) + computeSInt64SizeNoTag(j);
    }

    public static int computeFixed64Size(int i, long j) {
        return computeTagSize(i) + computeFixed64SizeNoTag(j);
    }

    public static int computeSFixed64Size(int i, long j) {
        return computeTagSize(i) + computeSFixed64SizeNoTag(j);
    }

    public static int computeFloatSize(int i, float f) {
        return computeTagSize(i) + computeFloatSizeNoTag(f);
    }

    public static int computeDoubleSize(int i, double d) {
        return computeTagSize(i) + computeDoubleSizeNoTag(d);
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeTagSize(i) + computeBoolSizeNoTag(z);
    }

    public static int computeEnumSize(int i, int i2) {
        return computeTagSize(i) + computeEnumSizeNoTag(i2);
    }

    public static int computeStringSize(int i, java.lang.String str) {
        return computeTagSize(i) + computeStringSizeNoTag(str);
    }

    public static int computeBytesSize(int i, com.google.protobuf.ByteString byteString) {
        return computeTagSize(i) + computeBytesSizeNoTag(byteString);
    }

    public static int computeByteArraySize(int i, byte[] bArr) {
        return computeTagSize(i) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteBufferSize(int i, java.nio.ByteBuffer byteBuffer) {
        return computeTagSize(i) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeLazyFieldSize(int i, com.google.protobuf.LazyFieldLite lazyFieldLite) {
        return computeTagSize(i) + computeLazyFieldSizeNoTag(lazyFieldLite);
    }

    public static int computeMessageSize(int i, com.google.protobuf.MessageLite messageLite) {
        return computeTagSize(i) + computeMessageSizeNoTag(messageLite);
    }

    static int computeMessageSize(int i, com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) {
        return computeTagSize(i) + computeMessageSizeNoTag(messageLite, schema);
    }

    public static int computeMessageSetExtensionSize(int i, com.google.protobuf.MessageLite messageLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i) + computeMessageSize(3, messageLite);
    }

    public static int computeRawMessageSetExtensionSize(int i, com.google.protobuf.ByteString byteString) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i) + computeBytesSize(3, byteString);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i, com.google.protobuf.LazyFieldLite lazyFieldLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i) + computeLazyFieldSize(3, lazyFieldLite);
    }

    public static int computeTagSize(int i) {
        return computeUInt32SizeNoTag(com.google.protobuf.WireFormat.makeTag(i, 0));
    }

    public static int computeInt32SizeNoTag(int i) {
        if (i >= 0) {
            return computeUInt32SizeNoTag(i);
        }
        return 10;
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeUInt32SizeNoTag(encodeZigZag32(i));
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(j);
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(encodeZigZag64(j));
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeStringSizeNoTag(java.lang.String str) {
        int length;
        try {
            length = com.google.protobuf.Utf8.encodedLength(str);
        } catch (com.google.protobuf.Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(com.google.protobuf.Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeLazyFieldSizeNoTag(com.google.protobuf.LazyFieldLite lazyFieldLite) {
        return computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    public static int computeBytesSizeNoTag(com.google.protobuf.ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSizeNoTag(java.nio.ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeMessageSizeNoTag(com.google.protobuf.MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    static int computeMessageSizeNoTag(com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) {
        return computeLengthDelimitedFieldSize(((com.google.protobuf.AbstractMessageLite) messageLite).getSerializedSize(schema));
    }

    static int computeLengthDelimitedFieldSize(int i) {
        return computeUInt32SizeNoTag(i) + i;
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
    }

    public static class OutOfSpaceException extends java.io.IOException {
        private static final java.lang.String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super(MESSAGE);
        }

        OutOfSpaceException(java.lang.String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        OutOfSpaceException(java.lang.Throwable th) {
            super(MESSAGE, th);
        }

        OutOfSpaceException(java.lang.String str, java.lang.Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    final void inefficientWriteStringNoTag(java.lang.String str, com.google.protobuf.Utf8.UnpairedSurrogateException unpairedSurrogateException) throws java.io.IOException {
        logger.log(java.util.logging.Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(com.google.protobuf.Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(e);
        }
    }

    @java.lang.Deprecated
    public final void writeGroup(int i, com.google.protobuf.MessageLite messageLite) throws java.io.IOException {
        writeTag(i, 3);
        writeGroupNoTag(messageLite);
        writeTag(i, 4);
    }

    @java.lang.Deprecated
    final void writeGroup(int i, com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) throws java.io.IOException {
        writeTag(i, 3);
        writeGroupNoTag(messageLite, schema);
        writeTag(i, 4);
    }

    @java.lang.Deprecated
    public final void writeGroupNoTag(com.google.protobuf.MessageLite messageLite) throws java.io.IOException {
        messageLite.writeTo(this);
    }

    @java.lang.Deprecated
    final void writeGroupNoTag(com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) throws java.io.IOException {
        schema.writeTo(messageLite, this.wrapper);
    }

    @java.lang.Deprecated
    public static int computeGroupSize(int i, com.google.protobuf.MessageLite messageLite) {
        return (computeTagSize(i) * 2) + messageLite.getSerializedSize();
    }

    @java.lang.Deprecated
    static int computeGroupSize(int i, com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) {
        return (computeTagSize(i) * 2) + computeGroupSizeNoTag(messageLite, schema);
    }

    @java.lang.Deprecated
    public static int computeGroupSizeNoTag(com.google.protobuf.MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    @java.lang.Deprecated
    static int computeGroupSizeNoTag(com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) {
        return ((com.google.protobuf.AbstractMessageLite) messageLite).getSerializedSize(schema);
    }

    @java.lang.Deprecated
    public final void writeRawVarint32(int i) throws java.io.IOException {
        writeUInt32NoTag(i);
    }

    @java.lang.Deprecated
    public final void writeRawVarint64(long j) throws java.io.IOException {
        writeUInt64NoTag(j);
    }

    @java.lang.Deprecated
    public static int computeRawVarint32Size(int i) {
        return computeUInt32SizeNoTag(i);
    }

    @java.lang.Deprecated
    public static int computeRawVarint64Size(long j) {
        return computeUInt64SizeNoTag(j);
    }

    @java.lang.Deprecated
    public final void writeRawLittleEndian32(int i) throws java.io.IOException {
        writeFixed32NoTag(i);
    }

    @java.lang.Deprecated
    public final void writeRawLittleEndian64(long j) throws java.io.IOException {
        writeFixed64NoTag(j);
    }

    private static class ArrayEncoder extends com.google.protobuf.CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
        }

        ArrayEncoder(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new java.lang.NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            }
            this.buffer = bArr;
            this.offset = i;
            this.position = i;
            this.limit = i3;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeTag(int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(com.google.protobuf.WireFormat.makeTag(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32(int i, int i2) throws java.io.IOException {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32(int i, int i2) throws java.io.IOException {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32(int i, int i2) throws java.io.IOException {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64(int i, long j) throws java.io.IOException {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64(int i, long j) throws java.io.IOException {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBool(int i, boolean z) throws java.io.IOException {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeString(int i, java.lang.String str) throws java.io.IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytes(int i, com.google.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i, byte[] bArr) throws java.io.IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytesNoTag(com.google.protobuf.ByteString byteString) throws java.io.IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawBytes(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessage(int i, com.google.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        final void writeMessage(int i, com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(((com.google.protobuf.AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i, com.google.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i, com.google.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageNoTag(com.google.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        final void writeMessageNoTag(com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeUInt32NoTag(((com.google.protobuf.AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(byte b) throws java.io.IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i) throws java.io.IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i) throws java.io.IOException {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr2 = this.buffer;
            int i3 = this.position;
            this.position = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i) throws java.io.IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.position = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j) throws java.io.IOException {
            if (com.google.protobuf.CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS && spaceLeft() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    com.google.protobuf.UnsafeUtil.putByte(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                com.google.protobuf.UnsafeUtil.putByte(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j) throws java.io.IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.position = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            try {
                java.lang.System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), java.lang.Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i, int i2) throws java.io.IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.buffer, this.position, iRemaining);
                this.position += iRemaining;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), java.lang.Integer.valueOf(iRemaining)), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void writeLazy(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeStringNoTag(java.lang.String str) throws java.io.IOException {
            int i = this.position;
            try {
                int iComputeUInt32SizeNoTag = computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int i2 = i + iComputeUInt32SizeNoTag2;
                    this.position = i2;
                    int iEncode = com.google.protobuf.Utf8.encode(str, this.buffer, i2, spaceLeft());
                    this.position = i;
                    writeUInt32NoTag((iEncode - i) - iComputeUInt32SizeNoTag2);
                    this.position = iEncode;
                } else {
                    writeUInt32NoTag(com.google.protobuf.Utf8.encodedLength(str));
                    this.position = com.google.protobuf.Utf8.encode(str, this.buffer, this.position, spaceLeft());
                }
            } catch (com.google.protobuf.Utf8.UnpairedSurrogateException e) {
                this.position = i;
                inefficientWriteStringNoTag(str, e);
            } catch (java.lang.IndexOutOfBoundsException e2) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.limit - this.position;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }
    }

    private static final class HeapNioEncoder extends com.google.protobuf.CodedOutputStream.ArrayEncoder {
        private final java.nio.ByteBuffer byteBuffer;
        private int initialPosition;

        HeapNioEncoder(java.nio.ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        @Override // com.google.protobuf.CodedOutputStream.ArrayEncoder, com.google.protobuf.CodedOutputStream
        public void flush() {
        }
    }

    private static final class SafeDirectNioEncoder extends com.google.protobuf.CodedOutputStream {
        private final java.nio.ByteBuffer buffer;
        private final int initialPosition;
        private final java.nio.ByteBuffer originalBuffer;

        SafeDirectNioEncoder(java.nio.ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(java.nio.ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = byteBuffer.position();
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(com.google.protobuf.WireFormat.makeTag(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i, int i2) throws java.io.IOException {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i, int i2) throws java.io.IOException {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i, int i2) throws java.io.IOException {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i, long j) throws java.io.IOException {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i, long j) throws java.io.IOException {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i, boolean z) throws java.io.IOException {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i, java.lang.String str) throws java.io.IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i, com.google.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr) throws java.io.IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i, com.google.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i, com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i, com.google.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i, com.google.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(com.google.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeUInt32NoTag(((com.google.protobuf.AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b) throws java.io.IOException {
            try {
                this.buffer.put(b);
            } catch (java.nio.BufferOverflowException e) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(com.google.protobuf.ByteString byteString) throws java.io.IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i) throws java.io.IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i) throws java.io.IOException {
            while ((i & (-128)) != 0) {
                try {
                    this.buffer.put((byte) ((i & 127) | 128));
                    i >>>= 7;
                } catch (java.nio.BufferOverflowException e) {
                    throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(e);
                }
            }
            this.buffer.put((byte) i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i) throws java.io.IOException {
            try {
                this.buffer.putInt(i);
            } catch (java.nio.BufferOverflowException e) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j) throws java.io.IOException {
            while (((-128) & j) != 0) {
                try {
                    this.buffer.put((byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } catch (java.nio.BufferOverflowException e) {
                    throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(e);
                }
            }
            this.buffer.put((byte) j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j) throws java.io.IOException {
            try {
                this.buffer.putLong(j);
            } catch (java.nio.BufferOverflowException e) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            try {
                this.buffer.put(bArr, i, i2);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(e);
            } catch (java.nio.BufferOverflowException e2) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i, int i2) throws java.io.IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            try {
                this.buffer.put(byteBuffer);
            } catch (java.nio.BufferOverflowException e) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(java.lang.String str) throws java.io.IOException {
            int iPosition = this.buffer.position();
            try {
                int iComputeUInt32SizeNoTag = computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int iPosition2 = this.buffer.position() + iComputeUInt32SizeNoTag2;
                    encode(str);
                    int iPosition3 = this.buffer.position();
                    writeUInt32NoTag(iPosition3 - iPosition2);
                } else {
                    writeUInt32NoTag(com.google.protobuf.Utf8.encodedLength(str));
                    encode(str);
                }
            } catch (com.google.protobuf.Utf8.UnpairedSurrogateException e) {
                inefficientWriteStringNoTag(str, e);
            } catch (java.lang.IllegalArgumentException e2) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.buffer.remaining();
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        private void encode(java.lang.String str) throws java.io.IOException {
            try {
                com.google.protobuf.Utf8.encodeUtf8(str, this.buffer);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(e);
            }
        }
    }

    private static final class UnsafeDirectNioEncoder extends com.google.protobuf.CodedOutputStream {
        private final long address;
        private final java.nio.ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit;
        private final java.nio.ByteBuffer originalBuffer;
        private long position;

        UnsafeDirectNioEncoder(java.nio.ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(java.nio.ByteOrder.LITTLE_ENDIAN);
            long jAddressOffset = com.google.protobuf.UnsafeUtil.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            this.initialPosition = jPosition;
            long jLimit = jAddressOffset + ((long) byteBuffer.limit());
            this.limit = jLimit;
            this.oneVarintLimit = jLimit - 10;
            this.position = jPosition;
        }

        static boolean isSupported() {
            return com.google.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(com.google.protobuf.WireFormat.makeTag(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i, int i2) throws java.io.IOException {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i, int i2) throws java.io.IOException {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i, int i2) throws java.io.IOException {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i, long j) throws java.io.IOException {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i, long j) throws java.io.IOException {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i, boolean z) throws java.io.IOException {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i, java.lang.String str) throws java.io.IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i, com.google.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr) throws java.io.IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i, com.google.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i, com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i, com.google.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i, com.google.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(com.google.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeUInt32NoTag(((com.google.protobuf.AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b) throws java.io.IOException {
            long j = this.position;
            if (j >= this.limit) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(this.position), java.lang.Long.valueOf(this.limit), 1));
            }
            this.position = 1 + j;
            com.google.protobuf.UnsafeUtil.putByte(j, b);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(com.google.protobuf.ByteString byteString) throws java.io.IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i) throws java.io.IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i) throws java.io.IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((i & (-128)) != 0) {
                    long j = this.position;
                    this.position = j + 1;
                    com.google.protobuf.UnsafeUtil.putByte(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.position;
                this.position = 1 + j2;
                com.google.protobuf.UnsafeUtil.putByte(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.position;
                if (j3 >= this.limit) {
                    throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(this.position), java.lang.Long.valueOf(this.limit), 1));
                }
                if ((i & (-128)) == 0) {
                    this.position = 1 + j3;
                    com.google.protobuf.UnsafeUtil.putByte(j3, (byte) i);
                    return;
                } else {
                    this.position = j3 + 1;
                    com.google.protobuf.UnsafeUtil.putByte(j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i) throws java.io.IOException {
            this.buffer.putInt(bufferPos(this.position), i);
            this.position += 4;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j) throws java.io.IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((j & (-128)) != 0) {
                    long j2 = this.position;
                    this.position = j2 + 1;
                    com.google.protobuf.UnsafeUtil.putByte(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.position;
                this.position = 1 + j3;
                com.google.protobuf.UnsafeUtil.putByte(j3, (byte) j);
                return;
            }
            while (true) {
                long j4 = this.position;
                if (j4 >= this.limit) {
                    throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(this.position), java.lang.Long.valueOf(this.limit), 1));
                }
                if ((j & (-128)) == 0) {
                    this.position = 1 + j4;
                    com.google.protobuf.UnsafeUtil.putByte(j4, (byte) j);
                    return;
                } else {
                    this.position = j4 + 1;
                    com.google.protobuf.UnsafeUtil.putByte(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j) throws java.io.IOException {
            this.buffer.putLong(bufferPos(this.position), j);
            this.position += 8;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = i2;
                long j2 = this.limit - j;
                long j3 = this.position;
                if (j2 >= j3) {
                    com.google.protobuf.UnsafeUtil.copyMemory(bArr, i, j3, j);
                    this.position += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new java.lang.NullPointerException("value");
            }
            throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(this.position), java.lang.Long.valueOf(this.limit), java.lang.Integer.valueOf(i2)));
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i, int i2) throws java.io.IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            try {
                int iRemaining = byteBuffer.remaining();
                repositionBuffer(this.position);
                this.buffer.put(byteBuffer);
                this.position += (long) iRemaining;
            } catch (java.nio.BufferOverflowException e) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(java.lang.String str) throws java.io.IOException {
            long j = this.position;
            try {
                int iComputeUInt32SizeNoTag = computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int iBufferPos = bufferPos(this.position) + iComputeUInt32SizeNoTag2;
                    com.google.protobuf.Utf8.encodeUtf8(str, this.buffer);
                    int iPosition = this.buffer.position() - iBufferPos;
                    writeUInt32NoTag(iPosition);
                    this.position += (long) iPosition;
                } else {
                    int iEncodedLength = com.google.protobuf.Utf8.encodedLength(str);
                    writeUInt32NoTag(iEncodedLength);
                    repositionBuffer(this.position);
                    com.google.protobuf.Utf8.encodeUtf8(str, this.buffer);
                    this.position += (long) iEncodedLength;
                }
            } catch (com.google.protobuf.Utf8.UnpairedSurrogateException e) {
                this.position = j;
                repositionBuffer(j);
                inefficientWriteStringNoTag(str, e);
            } catch (java.lang.IllegalArgumentException e2) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(e2);
            } catch (java.lang.IndexOutOfBoundsException e3) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.limit - this.position);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.position - this.initialPosition);
        }

        private void repositionBuffer(long j) {
        }

        private int bufferPos(long j) {
            return (int) (j - this.address);
        }
    }

    private static abstract class AbstractBufferedEncoder extends com.google.protobuf.CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        AbstractBufferedEncoder(int i) {
            super();
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[java.lang.Math.max(i, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new java.lang.UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        final void buffer(byte b) {
            byte[] bArr = this.buffer;
            int i = this.position;
            this.position = i + 1;
            bArr[i] = b;
            this.totalBytesWritten++;
        }

        final void bufferTag(int i, int i2) {
            bufferUInt32NoTag(com.google.protobuf.WireFormat.makeTag(i, i2));
        }

        final void bufferInt32NoTag(int i) {
            if (i >= 0) {
                bufferUInt32NoTag(i);
            } else {
                bufferUInt64NoTag(i);
            }
        }

        final void bufferUInt32NoTag(int i) {
            if (com.google.protobuf.CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j = this.position;
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    com.google.protobuf.UnsafeUtil.putByte(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                com.google.protobuf.UnsafeUtil.putByte(bArr2, i3, (byte) i);
                this.totalBytesWritten += (int) (((long) this.position) - j);
                return;
            }
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.totalBytesWritten++;
                i >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i5 = this.position;
            this.position = i5 + 1;
            bArr4[i5] = (byte) i;
            this.totalBytesWritten++;
        }

        final void bufferUInt64NoTag(long j) {
            if (com.google.protobuf.CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j2 = this.position;
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    com.google.protobuf.UnsafeUtil.putByte(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                com.google.protobuf.UnsafeUtil.putByte(bArr2, i2, (byte) j);
                this.totalBytesWritten += (int) (((long) this.position) - j2);
                return;
            }
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.totalBytesWritten++;
                j >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr4[i4] = (byte) j;
            this.totalBytesWritten++;
        }

        final void bufferFixed32NoTag(int i) {
            byte[] bArr = this.buffer;
            int i2 = this.position;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.position = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.totalBytesWritten += 4;
        }

        final void bufferFixed64NoTag(long j) {
            byte[] bArr = this.buffer;
            int i = this.position;
            int i2 = i + 1;
            bArr[i] = (byte) (j & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.position = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.totalBytesWritten += 8;
        }
    }

    private static final class ByteOutputEncoder extends com.google.protobuf.CodedOutputStream.AbstractBufferedEncoder {
        private final com.google.protobuf.ByteOutput out;

        ByteOutputEncoder(com.google.protobuf.ByteOutput byteOutput, int i) {
            super(i);
            if (byteOutput == null) {
                throw new java.lang.NullPointerException("out");
            }
            this.out = byteOutput;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(com.google.protobuf.WireFormat.makeTag(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i, int i2) throws java.io.IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferInt32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i, int i2) throws java.io.IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i, int i2) throws java.io.IOException {
            flushIfNotAvailable(14);
            bufferTag(i, 5);
            bufferFixed32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i, long j) throws java.io.IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i, long j) throws java.io.IOException {
            flushIfNotAvailable(18);
            bufferTag(i, 1);
            bufferFixed64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i, boolean z) throws java.io.IOException {
            flushIfNotAvailable(11);
            bufferTag(i, 0);
            buffer(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i, java.lang.String str) throws java.io.IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i, com.google.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr) throws java.io.IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(com.google.protobuf.ByteString byteString) throws java.io.IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i, com.google.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i, com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i, com.google.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i, com.google.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(com.google.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeUInt32NoTag(((com.google.protobuf.AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b) throws java.io.IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i) throws java.io.IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i) throws java.io.IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i) throws java.io.IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j) throws java.io.IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j) throws java.io.IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(java.lang.String str) throws java.io.IOException {
            int length = str.length() * 3;
            int iComputeUInt32SizeNoTag = computeUInt32SizeNoTag(length);
            int i = iComputeUInt32SizeNoTag + length;
            if (i > this.limit) {
                byte[] bArr = new byte[length];
                int iEncode = com.google.protobuf.Utf8.encode(str, bArr, 0, length);
                writeUInt32NoTag(iEncode);
                writeLazy(bArr, 0, iEncode);
                return;
            }
            if (i > this.limit - this.position) {
                doFlush();
            }
            int i2 = this.position;
            try {
                int iComputeUInt32SizeNoTag2 = computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    this.position = i2 + iComputeUInt32SizeNoTag2;
                    int iEncode2 = com.google.protobuf.Utf8.encode(str, this.buffer, this.position, this.limit - this.position);
                    this.position = i2;
                    int i3 = (iEncode2 - i2) - iComputeUInt32SizeNoTag2;
                    bufferUInt32NoTag(i3);
                    this.position = iEncode2;
                    this.totalBytesWritten += i3;
                } else {
                    int iEncodedLength = com.google.protobuf.Utf8.encodedLength(str);
                    bufferUInt32NoTag(iEncodedLength);
                    this.position = com.google.protobuf.Utf8.encode(str, this.buffer, this.position, iEncodedLength);
                    this.totalBytesWritten += iEncodedLength;
                }
            } catch (com.google.protobuf.Utf8.UnpairedSurrogateException e) {
                this.totalBytesWritten -= this.position - i2;
                this.position = i2;
                inefficientWriteStringNoTag(str, e);
            } catch (java.lang.IndexOutOfBoundsException e2) {
                throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() throws java.io.IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            flush();
            this.out.write(bArr, i, i2);
            this.totalBytesWritten += i2;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i, int i2) throws java.io.IOException {
            flush();
            this.out.writeLazy(bArr, i, i2);
            this.totalBytesWritten += i2;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.write(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.writeLazy(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }

        private void flushIfNotAvailable(int i) throws java.io.IOException {
            if (this.limit - this.position < i) {
                doFlush();
            }
        }

        private void doFlush() throws java.io.IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }
    }

    private static final class OutputStreamEncoder extends com.google.protobuf.CodedOutputStream.AbstractBufferedEncoder {
        private final java.io.OutputStream out;

        OutputStreamEncoder(java.io.OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new java.lang.NullPointerException("out");
            }
            this.out = outputStream;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(com.google.protobuf.WireFormat.makeTag(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i, int i2) throws java.io.IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferInt32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i, int i2) throws java.io.IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i, int i2) throws java.io.IOException {
            flushIfNotAvailable(14);
            bufferTag(i, 5);
            bufferFixed32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i, long j) throws java.io.IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i, long j) throws java.io.IOException {
            flushIfNotAvailable(18);
            bufferTag(i, 1);
            bufferFixed64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i, boolean z) throws java.io.IOException {
            flushIfNotAvailable(11);
            bufferTag(i, 0);
            buffer(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i, java.lang.String str) throws java.io.IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i, com.google.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr) throws java.io.IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(com.google.protobuf.ByteString byteString) throws java.io.IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws java.io.IOException {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i, com.google.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i, com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i, com.google.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i, com.google.protobuf.ByteString byteString) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(com.google.protobuf.MessageLite messageLite) throws java.io.IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(com.google.protobuf.MessageLite messageLite, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeUInt32NoTag(((com.google.protobuf.AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b) throws java.io.IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i) throws java.io.IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i) throws java.io.IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i) throws java.io.IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j) throws java.io.IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j) throws java.io.IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(java.lang.String str) throws java.io.IOException {
            int iEncodedLength;
            try {
                int length = str.length() * 3;
                int iComputeUInt32SizeNoTag = computeUInt32SizeNoTag(length);
                int i = iComputeUInt32SizeNoTag + length;
                if (i > this.limit) {
                    byte[] bArr = new byte[length];
                    int iEncode = com.google.protobuf.Utf8.encode(str, bArr, 0, length);
                    writeUInt32NoTag(iEncode);
                    writeLazy(bArr, 0, iEncode);
                    return;
                }
                if (i > this.limit - this.position) {
                    doFlush();
                }
                int iComputeUInt32SizeNoTag2 = computeUInt32SizeNoTag(str.length());
                int i2 = this.position;
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        this.position = i2 + iComputeUInt32SizeNoTag2;
                        int iEncode2 = com.google.protobuf.Utf8.encode(str, this.buffer, this.position, this.limit - this.position);
                        this.position = i2;
                        iEncodedLength = (iEncode2 - i2) - iComputeUInt32SizeNoTag2;
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = iEncode2;
                    } else {
                        iEncodedLength = com.google.protobuf.Utf8.encodedLength(str);
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = com.google.protobuf.Utf8.encode(str, this.buffer, this.position, iEncodedLength);
                    }
                    this.totalBytesWritten += iEncodedLength;
                } catch (com.google.protobuf.Utf8.UnpairedSurrogateException e) {
                    this.totalBytesWritten -= this.position - i2;
                    this.position = i2;
                    throw e;
                } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
                    throw new com.google.protobuf.CodedOutputStream.OutOfSpaceException(e2);
                }
            } catch (com.google.protobuf.Utf8.UnpairedSurrogateException e3) {
                inefficientWriteStringNoTag(str, e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() throws java.io.IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            if (this.limit - this.position >= i2) {
                java.lang.System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
                this.totalBytesWritten += i2;
                return;
            }
            int i3 = this.limit - this.position;
            java.lang.System.arraycopy(bArr, i, this.buffer, this.position, i3);
            int i4 = i + i3;
            int i5 = i2 - i3;
            this.position = this.limit;
            this.totalBytesWritten += i3;
            doFlush();
            if (i5 <= this.limit) {
                java.lang.System.arraycopy(bArr, i4, this.buffer, 0, i5);
                this.position = i5;
            } else {
                this.out.write(bArr, i4, i5);
            }
            this.totalBytesWritten += i5;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i, int i2) throws java.io.IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            int iRemaining = byteBuffer.remaining();
            if (this.limit - this.position >= iRemaining) {
                byteBuffer.get(this.buffer, this.position, iRemaining);
                this.position += iRemaining;
                this.totalBytesWritten += iRemaining;
                return;
            }
            int i = this.limit - this.position;
            byteBuffer.get(this.buffer, this.position, i);
            int i2 = iRemaining - i;
            this.position = this.limit;
            this.totalBytesWritten += i;
            doFlush();
            while (i2 > this.limit) {
                byteBuffer.get(this.buffer, 0, this.limit);
                this.out.write(this.buffer, 0, this.limit);
                i2 -= this.limit;
                this.totalBytesWritten += this.limit;
            }
            byteBuffer.get(this.buffer, 0, i2);
            this.position = i2;
            this.totalBytesWritten += i2;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            write(byteBuffer);
        }

        private void flushIfNotAvailable(int i) throws java.io.IOException {
            if (this.limit - this.position < i) {
                doFlush();
            }
        }

        private void doFlush() throws java.io.IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }
    }
}
