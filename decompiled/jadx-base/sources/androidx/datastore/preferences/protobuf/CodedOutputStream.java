package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodedOutputStream extends androidx.datastore.preferences.protobuf.ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @java.lang.Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    androidx.datastore.preferences.protobuf.CodedOutputStreamWriter wrapper;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(androidx.datastore.preferences.protobuf.CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = androidx.datastore.preferences.protobuf.UnsafeUtil.hasUnsafeArrayOperations();

    public static int computeBoolSizeNoTag(final boolean unused) {
        return 1;
    }

    public static int computeDoubleSizeNoTag(final double unused) {
        return 8;
    }

    public static int computeFixed32SizeNoTag(final int unused) {
        return 4;
    }

    public static int computeFixed64SizeNoTag(final long unused) {
        return 8;
    }

    public static int computeFloatSizeNoTag(final float unused) {
        return 4;
    }

    static int computePreferredBufferSize(int dataLength) {
        if (dataLength > 4096) {
            return 4096;
        }
        return dataLength;
    }

    public static int computeSFixed32SizeNoTag(final int unused) {
        return 4;
    }

    public static int computeSFixed64SizeNoTag(final long unused) {
        return 8;
    }

    public static int encodeZigZag32(final int n) {
        return (n >> 31) ^ (n << 1);
    }

    public static long encodeZigZag64(final long n) {
        return (n >> 63) ^ (n << 1);
    }

    public abstract void flush() throws java.io.IOException;

    public abstract int getTotalBytesWritten();

    public abstract int spaceLeft();

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte value) throws java.io.IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(java.nio.ByteBuffer value) throws java.io.IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte[] value, int offset, int length) throws java.io.IOException;

    public abstract void writeBool(int fieldNumber, boolean value) throws java.io.IOException;

    public abstract void writeByteArray(int fieldNumber, byte[] value) throws java.io.IOException;

    public abstract void writeByteArray(int fieldNumber, byte[] value, int offset, int length) throws java.io.IOException;

    abstract void writeByteArrayNoTag(final byte[] value, final int offset, final int length) throws java.io.IOException;

    public abstract void writeByteBuffer(int fieldNumber, java.nio.ByteBuffer value) throws java.io.IOException;

    public abstract void writeBytes(int fieldNumber, androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException;

    public abstract void writeBytesNoTag(final androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException;

    public abstract void writeFixed32(int fieldNumber, int value) throws java.io.IOException;

    public abstract void writeFixed32NoTag(int value) throws java.io.IOException;

    public abstract void writeFixed64(int fieldNumber, long value) throws java.io.IOException;

    public abstract void writeFixed64NoTag(long value) throws java.io.IOException;

    public abstract void writeInt32(int fieldNumber, int value) throws java.io.IOException;

    public abstract void writeInt32NoTag(final int value) throws java.io.IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(java.nio.ByteBuffer value) throws java.io.IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(byte[] value, int offset, int length) throws java.io.IOException;

    public abstract void writeMessage(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException;

    abstract void writeMessage(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException;

    public abstract void writeMessageNoTag(final androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException;

    abstract void writeMessageNoTag(final androidx.datastore.preferences.protobuf.MessageLite value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException;

    public abstract void writeMessageSetExtension(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException;

    public abstract void writeRawBytes(final java.nio.ByteBuffer value) throws java.io.IOException;

    public abstract void writeRawMessageSetExtension(final int fieldNumber, final androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException;

    public abstract void writeString(int fieldNumber, java.lang.String value) throws java.io.IOException;

    public abstract void writeStringNoTag(java.lang.String value) throws java.io.IOException;

    public abstract void writeTag(int fieldNumber, int wireType) throws java.io.IOException;

    public abstract void writeUInt32(int fieldNumber, int value) throws java.io.IOException;

    public abstract void writeUInt32NoTag(int value) throws java.io.IOException;

    public abstract void writeUInt64(int fieldNumber, long value) throws java.io.IOException;

    public abstract void writeUInt64NoTag(long value) throws java.io.IOException;

    public static androidx.datastore.preferences.protobuf.CodedOutputStream newInstance(final java.io.OutputStream output) {
        return newInstance(output, 4096);
    }

    public static androidx.datastore.preferences.protobuf.CodedOutputStream newInstance(final java.io.OutputStream output, final int bufferSize) {
        return new androidx.datastore.preferences.protobuf.CodedOutputStream.OutputStreamEncoder(output, bufferSize);
    }

    public static androidx.datastore.preferences.protobuf.CodedOutputStream newInstance(final byte[] flatArray) {
        return newInstance(flatArray, 0, flatArray.length);
    }

    public static androidx.datastore.preferences.protobuf.CodedOutputStream newInstance(final byte[] flatArray, final int offset, final int length) {
        return new androidx.datastore.preferences.protobuf.CodedOutputStream.ArrayEncoder(flatArray, offset, length);
    }

    public static androidx.datastore.preferences.protobuf.CodedOutputStream newInstance(java.nio.ByteBuffer buffer) {
        if (buffer.hasArray()) {
            return new androidx.datastore.preferences.protobuf.CodedOutputStream.HeapNioEncoder(buffer);
        }
        if (buffer.isDirect() && !buffer.isReadOnly()) {
            if (androidx.datastore.preferences.protobuf.CodedOutputStream.UnsafeDirectNioEncoder.isSupported()) {
                return newUnsafeInstance(buffer);
            }
            return newSafeInstance(buffer);
        }
        throw new java.lang.IllegalArgumentException("ByteBuffer is read-only");
    }

    static androidx.datastore.preferences.protobuf.CodedOutputStream newUnsafeInstance(java.nio.ByteBuffer buffer) {
        return new androidx.datastore.preferences.protobuf.CodedOutputStream.UnsafeDirectNioEncoder(buffer);
    }

    static androidx.datastore.preferences.protobuf.CodedOutputStream newSafeInstance(java.nio.ByteBuffer buffer) {
        return new androidx.datastore.preferences.protobuf.CodedOutputStream.SafeDirectNioEncoder(buffer);
    }

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    @java.lang.Deprecated
    public static androidx.datastore.preferences.protobuf.CodedOutputStream newInstance(java.nio.ByteBuffer byteBuffer, int unused) {
        return newInstance(byteBuffer);
    }

    static androidx.datastore.preferences.protobuf.CodedOutputStream newInstance(androidx.datastore.preferences.protobuf.ByteOutput byteOutput, int bufferSize) {
        if (bufferSize < 0) {
            throw new java.lang.IllegalArgumentException("bufferSize must be positive");
        }
        return new androidx.datastore.preferences.protobuf.CodedOutputStream.ByteOutputEncoder(byteOutput, bufferSize);
    }

    private CodedOutputStream() {
    }

    public final void writeSInt32(final int fieldNumber, final int value) throws java.io.IOException {
        writeUInt32(fieldNumber, encodeZigZag32(value));
    }

    public final void writeSFixed32(final int fieldNumber, final int value) throws java.io.IOException {
        writeFixed32(fieldNumber, value);
    }

    public final void writeInt64(final int fieldNumber, final long value) throws java.io.IOException {
        writeUInt64(fieldNumber, value);
    }

    public final void writeSInt64(final int fieldNumber, final long value) throws java.io.IOException {
        writeUInt64(fieldNumber, encodeZigZag64(value));
    }

    public final void writeSFixed64(final int fieldNumber, final long value) throws java.io.IOException {
        writeFixed64(fieldNumber, value);
    }

    public final void writeFloat(final int fieldNumber, final float value) throws java.io.IOException {
        writeFixed32(fieldNumber, java.lang.Float.floatToRawIntBits(value));
    }

    public final void writeDouble(final int fieldNumber, final double value) throws java.io.IOException {
        writeFixed64(fieldNumber, java.lang.Double.doubleToRawLongBits(value));
    }

    public final void writeEnum(final int fieldNumber, final int value) throws java.io.IOException {
        writeInt32(fieldNumber, value);
    }

    public final void writeRawByte(final byte value) throws java.io.IOException {
        write(value);
    }

    public final void writeRawByte(final int value) throws java.io.IOException {
        write((byte) value);
    }

    public final void writeRawBytes(final byte[] value) throws java.io.IOException {
        write(value, 0, value.length);
    }

    public final void writeRawBytes(final byte[] value, int offset, int length) throws java.io.IOException {
        write(value, offset, length);
    }

    public final void writeRawBytes(final androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException {
        value.writeTo(this);
    }

    public final void writeSInt32NoTag(final int value) throws java.io.IOException {
        writeUInt32NoTag(encodeZigZag32(value));
    }

    public final void writeSFixed32NoTag(final int value) throws java.io.IOException {
        writeFixed32NoTag(value);
    }

    public final void writeInt64NoTag(final long value) throws java.io.IOException {
        writeUInt64NoTag(value);
    }

    public final void writeSInt64NoTag(final long value) throws java.io.IOException {
        writeUInt64NoTag(encodeZigZag64(value));
    }

    public final void writeSFixed64NoTag(final long value) throws java.io.IOException {
        writeFixed64NoTag(value);
    }

    public final void writeFloatNoTag(final float value) throws java.io.IOException {
        writeFixed32NoTag(java.lang.Float.floatToRawIntBits(value));
    }

    public final void writeDoubleNoTag(final double value) throws java.io.IOException {
        writeFixed64NoTag(java.lang.Double.doubleToRawLongBits(value));
    }

    public final void writeBoolNoTag(boolean z) throws java.io.IOException {
        write(z ? (byte) 1 : (byte) 0);
    }

    public final void writeEnumNoTag(final int value) throws java.io.IOException {
        writeInt32NoTag(value);
    }

    public final void writeByteArrayNoTag(final byte[] value) throws java.io.IOException {
        writeByteArrayNoTag(value, 0, value.length);
    }

    public static int computeInt32Size(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeInt32SizeNoTag(value);
    }

    public static int computeUInt32Size(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeUInt32SizeNoTag(value);
    }

    public static int computeSInt32Size(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeSInt32SizeNoTag(value);
    }

    public static int computeFixed32Size(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeFixed32SizeNoTag(value);
    }

    public static int computeSFixed32Size(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeSFixed32SizeNoTag(value);
    }

    public static int computeInt64Size(final int fieldNumber, final long value) {
        return computeTagSize(fieldNumber) + computeInt64SizeNoTag(value);
    }

    public static int computeUInt64Size(final int fieldNumber, final long value) {
        return computeTagSize(fieldNumber) + computeUInt64SizeNoTag(value);
    }

    public static int computeSInt64Size(final int fieldNumber, final long value) {
        return computeTagSize(fieldNumber) + computeSInt64SizeNoTag(value);
    }

    public static int computeFixed64Size(final int fieldNumber, final long value) {
        return computeTagSize(fieldNumber) + computeFixed64SizeNoTag(value);
    }

    public static int computeSFixed64Size(final int fieldNumber, final long value) {
        return computeTagSize(fieldNumber) + computeSFixed64SizeNoTag(value);
    }

    public static int computeFloatSize(final int fieldNumber, final float value) {
        return computeTagSize(fieldNumber) + computeFloatSizeNoTag(value);
    }

    public static int computeDoubleSize(final int fieldNumber, final double value) {
        return computeTagSize(fieldNumber) + computeDoubleSizeNoTag(value);
    }

    public static int computeBoolSize(final int fieldNumber, final boolean value) {
        return computeTagSize(fieldNumber) + computeBoolSizeNoTag(value);
    }

    public static int computeEnumSize(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeEnumSizeNoTag(value);
    }

    public static int computeStringSize(final int fieldNumber, final java.lang.String value) {
        return computeTagSize(fieldNumber) + computeStringSizeNoTag(value);
    }

    public static int computeBytesSize(final int fieldNumber, final androidx.datastore.preferences.protobuf.ByteString value) {
        return computeTagSize(fieldNumber) + computeBytesSizeNoTag(value);
    }

    public static int computeByteArraySize(final int fieldNumber, final byte[] value) {
        return computeTagSize(fieldNumber) + computeByteArraySizeNoTag(value);
    }

    public static int computeByteBufferSize(final int fieldNumber, final java.nio.ByteBuffer value) {
        return computeTagSize(fieldNumber) + computeByteBufferSizeNoTag(value);
    }

    public static int computeLazyFieldSize(final int fieldNumber, final androidx.datastore.preferences.protobuf.LazyFieldLite value) {
        return computeTagSize(fieldNumber) + computeLazyFieldSizeNoTag(value);
    }

    public static int computeMessageSize(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value) {
        return computeTagSize(fieldNumber) + computeMessageSizeNoTag(value);
    }

    static int computeMessageSize(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value, final androidx.datastore.preferences.protobuf.Schema schema) {
        return computeTagSize(fieldNumber) + computeMessageSizeNoTag(value, schema);
    }

    public static int computeMessageSetExtensionSize(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, fieldNumber) + computeMessageSize(3, value);
    }

    public static int computeRawMessageSetExtensionSize(final int fieldNumber, final androidx.datastore.preferences.protobuf.ByteString value) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, fieldNumber) + computeBytesSize(3, value);
    }

    public static int computeLazyFieldMessageSetExtensionSize(final int fieldNumber, final androidx.datastore.preferences.protobuf.LazyFieldLite value) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, fieldNumber) + computeLazyFieldSize(3, value);
    }

    public static int computeTagSize(final int fieldNumber) {
        return computeUInt32SizeNoTag(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 0));
    }

    public static int computeInt32SizeNoTag(final int value) {
        return computeUInt64SizeNoTag(value);
    }

    public static int computeUInt32SizeNoTag(final int value) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(value) * 9)) >>> 6;
    }

    public static int computeSInt32SizeNoTag(final int value) {
        return computeUInt32SizeNoTag(encodeZigZag32(value));
    }

    public static int computeInt64SizeNoTag(final long value) {
        return computeUInt64SizeNoTag(value);
    }

    public static int computeUInt64SizeNoTag(long value) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(value) * 9)) >>> 6;
    }

    public static int computeSInt64SizeNoTag(final long value) {
        return computeUInt64SizeNoTag(encodeZigZag64(value));
    }

    public static int computeEnumSizeNoTag(final int value) {
        return computeInt32SizeNoTag(value);
    }

    public static int computeStringSizeNoTag(final java.lang.String value) {
        int length;
        try {
            length = androidx.datastore.preferences.protobuf.Utf8.encodedLength(value);
        } catch (androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException unused) {
            length = value.getBytes(androidx.datastore.preferences.protobuf.Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeLazyFieldSizeNoTag(final androidx.datastore.preferences.protobuf.LazyFieldLite value) {
        return computeLengthDelimitedFieldSize(value.getSerializedSize());
    }

    public static int computeBytesSizeNoTag(final androidx.datastore.preferences.protobuf.ByteString value) {
        return computeLengthDelimitedFieldSize(value.size());
    }

    public static int computeByteArraySizeNoTag(final byte[] value) {
        return computeLengthDelimitedFieldSize(value.length);
    }

    public static int computeByteBufferSizeNoTag(final java.nio.ByteBuffer value) {
        return computeLengthDelimitedFieldSize(value.capacity());
    }

    public static int computeMessageSizeNoTag(final androidx.datastore.preferences.protobuf.MessageLite value) {
        return computeLengthDelimitedFieldSize(value.getSerializedSize());
    }

    static int computeMessageSizeNoTag(final androidx.datastore.preferences.protobuf.MessageLite value, final androidx.datastore.preferences.protobuf.Schema schema) {
        return computeLengthDelimitedFieldSize(((androidx.datastore.preferences.protobuf.AbstractMessageLite) value).getSerializedSize(schema));
    }

    static int computeLengthDelimitedFieldSize(int fieldLength) {
        return computeUInt32SizeNoTag(fieldLength) + fieldLength;
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

        OutOfSpaceException(java.lang.String explanationMessage) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + explanationMessage);
        }

        OutOfSpaceException(java.lang.Throwable cause) {
            super(MESSAGE, cause);
        }

        OutOfSpaceException(java.lang.String explanationMessage, java.lang.Throwable cause) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + explanationMessage, cause);
        }
    }

    final void inefficientWriteStringNoTag(java.lang.String value, androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException cause) throws java.io.IOException {
        logger.log(java.util.logging.Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) cause);
        byte[] bytes = value.getBytes(androidx.datastore.preferences.protobuf.Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
        }
    }

    @java.lang.Deprecated
    public final void writeGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException {
        writeTag(fieldNumber, 3);
        writeGroupNoTag(value);
        writeTag(fieldNumber, 4);
    }

    @java.lang.Deprecated
    final void writeGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
        writeTag(fieldNumber, 3);
        writeGroupNoTag(value, schema);
        writeTag(fieldNumber, 4);
    }

    @java.lang.Deprecated
    public final void writeGroupNoTag(final androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException {
        value.writeTo(this);
    }

    @java.lang.Deprecated
    final void writeGroupNoTag(final androidx.datastore.preferences.protobuf.MessageLite value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
        schema.writeTo(value, this.wrapper);
    }

    @java.lang.Deprecated
    public static int computeGroupSize(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value) {
        return (computeTagSize(fieldNumber) * 2) + value.getSerializedSize();
    }

    @java.lang.Deprecated
    static int computeGroupSize(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value, androidx.datastore.preferences.protobuf.Schema schema) {
        return (computeTagSize(fieldNumber) * 2) + computeGroupSizeNoTag(value, schema);
    }

    @java.lang.Deprecated
    public static int computeGroupSizeNoTag(final androidx.datastore.preferences.protobuf.MessageLite value) {
        return value.getSerializedSize();
    }

    @java.lang.Deprecated
    static int computeGroupSizeNoTag(final androidx.datastore.preferences.protobuf.MessageLite value, androidx.datastore.preferences.protobuf.Schema schema) {
        return ((androidx.datastore.preferences.protobuf.AbstractMessageLite) value).getSerializedSize(schema);
    }

    @java.lang.Deprecated
    public final void writeRawVarint32(int value) throws java.io.IOException {
        writeUInt32NoTag(value);
    }

    @java.lang.Deprecated
    public final void writeRawVarint64(long value) throws java.io.IOException {
        writeUInt64NoTag(value);
    }

    @java.lang.Deprecated
    public static int computeRawVarint32Size(final int value) {
        return computeUInt32SizeNoTag(value);
    }

    @java.lang.Deprecated
    public static int computeRawVarint64Size(long value) {
        return computeUInt64SizeNoTag(value);
    }

    @java.lang.Deprecated
    public final void writeRawLittleEndian32(final int value) throws java.io.IOException {
        writeFixed32NoTag(value);
    }

    @java.lang.Deprecated
    public final void writeRawLittleEndian64(final long value) throws java.io.IOException {
        writeFixed64NoTag(value);
    }

    private static class ArrayEncoder extends androidx.datastore.preferences.protobuf.CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
        }

        ArrayEncoder(byte[] buffer, int offset, int length) {
            super();
            if (buffer == null) {
                throw new java.lang.NullPointerException("buffer");
            }
            int i = offset + length;
            if ((offset | length | (buffer.length - i)) < 0) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(buffer.length), java.lang.Integer.valueOf(offset), java.lang.Integer.valueOf(length)));
            }
            this.buffer = buffer;
            this.offset = offset;
            this.position = offset;
            this.limit = i;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeTag(final int fieldNumber, final int wireType) throws java.io.IOException {
            writeUInt32NoTag(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(final int fieldNumber, final int value) throws java.io.IOException {
            writeTag(fieldNumber, 0);
            writeInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(final int fieldNumber, final int value) throws java.io.IOException {
            writeTag(fieldNumber, 0);
            writeUInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(final int fieldNumber, final int value) throws java.io.IOException {
            writeTag(fieldNumber, 5);
            writeFixed32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(final int fieldNumber, final long value) throws java.io.IOException {
            writeTag(fieldNumber, 0);
            writeUInt64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(final int fieldNumber, final long value) throws java.io.IOException {
            writeTag(fieldNumber, 1);
            writeFixed64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i, boolean z) throws java.io.IOException {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(final int fieldNumber, final java.lang.String value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytes(final int fieldNumber, final androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(final int fieldNumber, final byte[] value) throws java.io.IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(final int fieldNumber, final byte[] value, final int offset, final int length) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteBuffer(final int fieldNumber, final java.nio.ByteBuffer value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(final androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException {
            writeUInt32NoTag(value.size());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(final byte[] value, int offset, int length) throws java.io.IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawBytes(final java.nio.ByteBuffer value) throws java.io.IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            java.nio.ByteBuffer byteBufferDuplicate = value.duplicate();
            androidx.datastore.preferences.protobuf.Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessage(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        final void writeMessage(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(((androidx.datastore.preferences.protobuf.AbstractMessageLite) value).getSerializedSize(schema));
            schema.writeTo(value, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(final int fieldNumber, final androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(final androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        final void writeMessageNoTag(final androidx.datastore.preferences.protobuf.MessageLite value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
            writeUInt32NoTag(((androidx.datastore.preferences.protobuf.AbstractMessageLite) value).getSerializedSize(schema));
            schema.writeTo(value, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte value) throws java.io.IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = value;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int value) throws java.io.IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int value) throws java.io.IOException {
            while ((value & (-128)) != 0) {
                try {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    bArr[i] = (byte) ((value | 128) & 255);
                    value >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr2 = this.buffer;
            int i2 = this.position;
            this.position = i2 + 1;
            bArr2[i2] = (byte) value;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int value) throws java.io.IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i2 = i + 1;
                bArr[i] = (byte) (value & 255);
                int i3 = i2 + 1;
                bArr[i2] = (byte) ((value >> 8) & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((value >> 16) & 255);
                this.position = i4 + 1;
                bArr[i4] = (byte) ((value >> 24) & 255);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long value) throws java.io.IOException {
            if (androidx.datastore.preferences.protobuf.CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS && spaceLeft() >= 10) {
                while ((value & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(bArr, i, (byte) ((((int) value) | 128) & 255));
                    value >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(bArr2, i2, (byte) value);
                return;
            }
            while ((value & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    bArr3[i3] = (byte) ((((int) value) | 128) & 255);
                    value >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr4[i4] = (byte) value;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long value) throws java.io.IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) value) & 255);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (value >> 8)) & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (value >> 16)) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (value >> 24)) & 255);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (value >> 32)) & 255);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (value >> 40)) & 255);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (value >> 48)) & 255);
                this.position = i8 + 1;
                bArr[i8] = (byte) (((int) (value >> 56)) & 255);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte[] value, int offset, int length) throws java.io.IOException {
            try {
                java.lang.System.arraycopy(value, offset, this.buffer, this.position, length);
                this.position += length;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), java.lang.Integer.valueOf(length)), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] value, int offset, int length) throws java.io.IOException {
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(java.nio.ByteBuffer value) throws java.io.IOException {
            int iRemaining = value.remaining();
            try {
                value.get(this.buffer, this.position, iRemaining);
                this.position += iRemaining;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), java.lang.Integer.valueOf(iRemaining)), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(java.nio.ByteBuffer value) throws java.io.IOException {
            write(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(java.lang.String value) throws java.io.IOException {
            int i = this.position;
            try {
                int iComputeUInt32SizeNoTag = computeUInt32SizeNoTag(value.length() * 3);
                int iComputeUInt32SizeNoTag2 = computeUInt32SizeNoTag(value.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int i2 = i + iComputeUInt32SizeNoTag2;
                    this.position = i2;
                    int iEncode = androidx.datastore.preferences.protobuf.Utf8.encode(value, this.buffer, i2, spaceLeft());
                    this.position = i;
                    writeUInt32NoTag((iEncode - i) - iComputeUInt32SizeNoTag2);
                    this.position = iEncode;
                } else {
                    writeUInt32NoTag(androidx.datastore.preferences.protobuf.Utf8.encodedLength(value));
                    this.position = androidx.datastore.preferences.protobuf.Utf8.encode(value, this.buffer, this.position, spaceLeft());
                }
            } catch (androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException e) {
                this.position = i;
                inefficientWriteStringNoTag(value, e);
            } catch (java.lang.IndexOutOfBoundsException e2) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.limit - this.position;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }
    }

    private static final class HeapNioEncoder extends androidx.datastore.preferences.protobuf.CodedOutputStream.ArrayEncoder {
        private final java.nio.ByteBuffer byteBuffer;
        private int initialPosition;

        HeapNioEncoder(java.nio.ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream.ArrayEncoder, androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            androidx.datastore.preferences.protobuf.Java8Compatibility.position(this.byteBuffer, this.initialPosition + getTotalBytesWritten());
        }
    }

    private static final class SafeDirectNioEncoder extends androidx.datastore.preferences.protobuf.CodedOutputStream {
        private final java.nio.ByteBuffer buffer;
        private final int initialPosition;
        private final java.nio.ByteBuffer originalBuffer;

        SafeDirectNioEncoder(java.nio.ByteBuffer buffer) {
            super();
            this.originalBuffer = buffer;
            this.buffer = buffer.duplicate().order(java.nio.ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = buffer.position();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(final int fieldNumber, final int wireType) throws java.io.IOException {
            writeUInt32NoTag(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(final int fieldNumber, final int value) throws java.io.IOException {
            writeTag(fieldNumber, 0);
            writeInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(final int fieldNumber, final int value) throws java.io.IOException {
            writeTag(fieldNumber, 0);
            writeUInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(final int fieldNumber, final int value) throws java.io.IOException {
            writeTag(fieldNumber, 5);
            writeFixed32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(final int fieldNumber, final long value) throws java.io.IOException {
            writeTag(fieldNumber, 0);
            writeUInt64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(final int fieldNumber, final long value) throws java.io.IOException {
            writeTag(fieldNumber, 1);
            writeFixed64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i, boolean z) throws java.io.IOException {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(final int fieldNumber, final java.lang.String value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(final int fieldNumber, final androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(final int fieldNumber, final byte[] value) throws java.io.IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(final int fieldNumber, final byte[] value, final int offset, final int length) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(final int fieldNumber, final java.nio.ByteBuffer value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void writeMessage(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(final int fieldNumber, final androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(final androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void writeMessageNoTag(final androidx.datastore.preferences.protobuf.MessageLite value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
            writeUInt32NoTag(((androidx.datastore.preferences.protobuf.AbstractMessageLite) value).getSerializedSize(schema));
            schema.writeTo(value, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte value) throws java.io.IOException {
            try {
                this.buffer.put(value);
            } catch (java.nio.BufferOverflowException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(final androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException {
            writeUInt32NoTag(value.size());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(final byte[] value, int offset, int length) throws java.io.IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(final java.nio.ByteBuffer value) throws java.io.IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            java.nio.ByteBuffer byteBufferDuplicate = value.duplicate();
            androidx.datastore.preferences.protobuf.Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int value) throws java.io.IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int value) throws java.io.IOException {
            while ((value & (-128)) != 0) {
                try {
                    this.buffer.put((byte) ((value | 128) & 255));
                    value >>>= 7;
                } catch (java.nio.BufferOverflowException e) {
                    throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
                }
            }
            this.buffer.put((byte) value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int value) throws java.io.IOException {
            try {
                this.buffer.putInt(value);
            } catch (java.nio.BufferOverflowException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long value) throws java.io.IOException {
            while (((-128) & value) != 0) {
                try {
                    this.buffer.put((byte) ((((int) value) | 128) & 255));
                    value >>>= 7;
                } catch (java.nio.BufferOverflowException e) {
                    throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
                }
            }
            this.buffer.put((byte) value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long value) throws java.io.IOException {
            try {
                this.buffer.putLong(value);
            } catch (java.nio.BufferOverflowException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) throws java.io.IOException {
            try {
                this.buffer.put(value, offset, length);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
            } catch (java.nio.BufferOverflowException e2) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) throws java.io.IOException {
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer value) throws java.io.IOException {
            try {
                this.buffer.put(value);
            } catch (java.nio.BufferOverflowException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer value) throws java.io.IOException {
            write(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(java.lang.String value) throws java.io.IOException {
            int iPosition = this.buffer.position();
            try {
                int iComputeUInt32SizeNoTag = computeUInt32SizeNoTag(value.length() * 3);
                int iComputeUInt32SizeNoTag2 = computeUInt32SizeNoTag(value.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int iPosition2 = this.buffer.position() + iComputeUInt32SizeNoTag2;
                    androidx.datastore.preferences.protobuf.Java8Compatibility.position(this.buffer, iPosition2);
                    encode(value);
                    int iPosition3 = this.buffer.position();
                    androidx.datastore.preferences.protobuf.Java8Compatibility.position(this.buffer, iPosition);
                    writeUInt32NoTag(iPosition3 - iPosition2);
                    androidx.datastore.preferences.protobuf.Java8Compatibility.position(this.buffer, iPosition3);
                } else {
                    writeUInt32NoTag(androidx.datastore.preferences.protobuf.Utf8.encodedLength(value));
                    encode(value);
                }
            } catch (androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException e) {
                androidx.datastore.preferences.protobuf.Java8Compatibility.position(this.buffer, iPosition);
                inefficientWriteStringNoTag(value, e);
            } catch (java.lang.IllegalArgumentException e2) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            androidx.datastore.preferences.protobuf.Java8Compatibility.position(this.originalBuffer, this.buffer.position());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.buffer.remaining();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        private void encode(java.lang.String value) throws java.io.IOException {
            try {
                androidx.datastore.preferences.protobuf.Utf8.encodeUtf8(value, this.buffer);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
            }
        }
    }

    private static final class UnsafeDirectNioEncoder extends androidx.datastore.preferences.protobuf.CodedOutputStream {
        private final long address;
        private final java.nio.ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit;
        private final java.nio.ByteBuffer originalBuffer;
        private long position;

        UnsafeDirectNioEncoder(java.nio.ByteBuffer buffer) {
            super();
            this.originalBuffer = buffer;
            this.buffer = buffer.duplicate().order(java.nio.ByteOrder.LITTLE_ENDIAN);
            long jAddressOffset = androidx.datastore.preferences.protobuf.UnsafeUtil.addressOffset(buffer);
            this.address = jAddressOffset;
            long jPosition = ((long) buffer.position()) + jAddressOffset;
            this.initialPosition = jPosition;
            long jLimit = jAddressOffset + ((long) buffer.limit());
            this.limit = jLimit;
            this.oneVarintLimit = jLimit - 10;
            this.position = jPosition;
        }

        static boolean isSupported() {
            return androidx.datastore.preferences.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int fieldNumber, int wireType) throws java.io.IOException {
            writeUInt32NoTag(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int fieldNumber, int value) throws java.io.IOException {
            writeTag(fieldNumber, 0);
            writeInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int fieldNumber, int value) throws java.io.IOException {
            writeTag(fieldNumber, 0);
            writeUInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int fieldNumber, int value) throws java.io.IOException {
            writeTag(fieldNumber, 5);
            writeFixed32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int fieldNumber, long value) throws java.io.IOException {
            writeTag(fieldNumber, 0);
            writeUInt64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int fieldNumber, long value) throws java.io.IOException {
            writeTag(fieldNumber, 1);
            writeFixed64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i, boolean z) throws java.io.IOException {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int fieldNumber, java.lang.String value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int fieldNumber, androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int fieldNumber, byte[] value) throws java.io.IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int fieldNumber, byte[] value, int offset, int length) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int fieldNumber, java.nio.ByteBuffer value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int fieldNumber, androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void writeMessage(int fieldNumber, androidx.datastore.preferences.protobuf.MessageLite value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int fieldNumber, androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int fieldNumber, androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void writeMessageNoTag(androidx.datastore.preferences.protobuf.MessageLite value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
            writeUInt32NoTag(((androidx.datastore.preferences.protobuf.AbstractMessageLite) value).getSerializedSize(schema));
            schema.writeTo(value, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte value) throws java.io.IOException {
            long j = this.position;
            if (j >= this.limit) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(this.position), java.lang.Long.valueOf(this.limit), 1));
            }
            this.position = 1 + j;
            androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(j, value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException {
            writeUInt32NoTag(value.size());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] value, int offset, int length) throws java.io.IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(java.nio.ByteBuffer value) throws java.io.IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            java.nio.ByteBuffer byteBufferDuplicate = value.duplicate();
            androidx.datastore.preferences.protobuf.Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int value) throws java.io.IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int value) throws java.io.IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((value & (-128)) != 0) {
                    long j = this.position;
                    this.position = j + 1;
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(j, (byte) ((value | 128) & 255));
                    value >>>= 7;
                }
                long j2 = this.position;
                this.position = 1 + j2;
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(j2, (byte) value);
                return;
            }
            while (true) {
                long j3 = this.position;
                if (j3 >= this.limit) {
                    throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(this.position), java.lang.Long.valueOf(this.limit), 1));
                }
                if ((value & (-128)) == 0) {
                    this.position = 1 + j3;
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(j3, (byte) value);
                    return;
                } else {
                    this.position = j3 + 1;
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(j3, (byte) ((value | 128) & 255));
                    value >>>= 7;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int value) throws java.io.IOException {
            this.buffer.putInt(bufferPos(this.position), value);
            this.position += 4;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long value) throws java.io.IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((value & (-128)) != 0) {
                    long j = this.position;
                    this.position = j + 1;
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(j, (byte) ((((int) value) | 128) & 255));
                    value >>>= 7;
                }
                long j2 = this.position;
                this.position = 1 + j2;
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(j2, (byte) value);
                return;
            }
            while (true) {
                long j3 = this.position;
                if (j3 >= this.limit) {
                    throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(this.position), java.lang.Long.valueOf(this.limit), 1));
                }
                if ((value & (-128)) == 0) {
                    this.position = 1 + j3;
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(j3, (byte) value);
                    return;
                } else {
                    this.position = j3 + 1;
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(j3, (byte) ((((int) value) | 128) & 255));
                    value >>>= 7;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long value) throws java.io.IOException {
            this.buffer.putLong(bufferPos(this.position), value);
            this.position += 8;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) throws java.io.IOException {
            if (value != null && offset >= 0 && length >= 0 && value.length - length >= offset) {
                long j = length;
                long j2 = this.limit - j;
                long j3 = this.position;
                if (j2 >= j3) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.copyMemory(value, offset, j3, j);
                    this.position += j;
                    return;
                }
            }
            if (value == null) {
                throw new java.lang.NullPointerException("value");
            }
            throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(this.position), java.lang.Long.valueOf(this.limit), java.lang.Integer.valueOf(length)));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) throws java.io.IOException {
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer value) throws java.io.IOException {
            try {
                int iRemaining = value.remaining();
                repositionBuffer(this.position);
                this.buffer.put(value);
                this.position += (long) iRemaining;
            } catch (java.nio.BufferOverflowException e) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer value) throws java.io.IOException {
            write(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(java.lang.String value) throws java.io.IOException {
            long j = this.position;
            try {
                int iComputeUInt32SizeNoTag = computeUInt32SizeNoTag(value.length() * 3);
                int iComputeUInt32SizeNoTag2 = computeUInt32SizeNoTag(value.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int iBufferPos = bufferPos(this.position) + iComputeUInt32SizeNoTag2;
                    androidx.datastore.preferences.protobuf.Java8Compatibility.position(this.buffer, iBufferPos);
                    androidx.datastore.preferences.protobuf.Utf8.encodeUtf8(value, this.buffer);
                    int iPosition = this.buffer.position() - iBufferPos;
                    writeUInt32NoTag(iPosition);
                    this.position += (long) iPosition;
                } else {
                    int iEncodedLength = androidx.datastore.preferences.protobuf.Utf8.encodedLength(value);
                    writeUInt32NoTag(iEncodedLength);
                    repositionBuffer(this.position);
                    androidx.datastore.preferences.protobuf.Utf8.encodeUtf8(value, this.buffer);
                    this.position += (long) iEncodedLength;
                }
            } catch (androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException e) {
                this.position = j;
                repositionBuffer(j);
                inefficientWriteStringNoTag(value, e);
            } catch (java.lang.IllegalArgumentException e2) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e2);
            } catch (java.lang.IndexOutOfBoundsException e3) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            androidx.datastore.preferences.protobuf.Java8Compatibility.position(this.originalBuffer, bufferPos(this.position));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.limit - this.position);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.position - this.initialPosition);
        }

        private void repositionBuffer(long pos) {
            androidx.datastore.preferences.protobuf.Java8Compatibility.position(this.buffer, bufferPos(pos));
        }

        private int bufferPos(long pos) {
            return (int) (pos - this.address);
        }
    }

    private static abstract class AbstractBufferedEncoder extends androidx.datastore.preferences.protobuf.CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        AbstractBufferedEncoder(int bufferSize) {
            super();
            if (bufferSize < 0) {
                throw new java.lang.IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[java.lang.Math.max(bufferSize, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new java.lang.UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        final void buffer(byte value) {
            byte[] bArr = this.buffer;
            int i = this.position;
            this.position = i + 1;
            bArr[i] = value;
            this.totalBytesWritten++;
        }

        final void bufferTag(final int fieldNumber, final int wireType) {
            bufferUInt32NoTag(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, wireType));
        }

        final void bufferInt32NoTag(final int value) {
            if (value >= 0) {
                bufferUInt32NoTag(value);
            } else {
                bufferUInt64NoTag(value);
            }
        }

        final void bufferUInt32NoTag(int value) {
            if (androidx.datastore.preferences.protobuf.CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j = this.position;
                while ((value & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(bArr, i, (byte) ((value | 128) & 255));
                    value >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(bArr2, i2, (byte) value);
                this.totalBytesWritten += (int) (((long) this.position) - j);
                return;
            }
            while ((value & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr3[i3] = (byte) ((value | 128) & 255);
                this.totalBytesWritten++;
                value >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr4[i4] = (byte) value;
            this.totalBytesWritten++;
        }

        final void bufferUInt64NoTag(long value) {
            if (androidx.datastore.preferences.protobuf.CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j = this.position;
                while ((value & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(bArr, i, (byte) ((((int) value) | 128) & 255));
                    value >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(bArr2, i2, (byte) value);
                this.totalBytesWritten += (int) (((long) this.position) - j);
                return;
            }
            while ((value & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr3[i3] = (byte) ((((int) value) | 128) & 255);
                this.totalBytesWritten++;
                value >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr4[i4] = (byte) value;
            this.totalBytesWritten++;
        }

        final void bufferFixed32NoTag(int value) {
            byte[] bArr = this.buffer;
            int i = this.position;
            int i2 = i + 1;
            bArr[i] = (byte) (value & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((value >> 8) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((value >> 16) & 255);
            this.position = i4 + 1;
            bArr[i4] = (byte) ((value >> 24) & 255);
            this.totalBytesWritten += 4;
        }

        final void bufferFixed64NoTag(long value) {
            byte[] bArr = this.buffer;
            int i = this.position;
            int i2 = i + 1;
            bArr[i] = (byte) (value & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((value >> 8) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((value >> 16) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (255 & (value >> 24));
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (value >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (value >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (value >> 48)) & 255);
            this.position = i8 + 1;
            bArr[i8] = (byte) (((int) (value >> 56)) & 255);
            this.totalBytesWritten += 8;
        }
    }

    private static final class ByteOutputEncoder extends androidx.datastore.preferences.protobuf.CodedOutputStream.AbstractBufferedEncoder {
        private final androidx.datastore.preferences.protobuf.ByteOutput out;

        ByteOutputEncoder(androidx.datastore.preferences.protobuf.ByteOutput out, int bufferSize) {
            super(bufferSize);
            if (out == null) {
                throw new java.lang.NullPointerException("out");
            }
            this.out = out;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(final int fieldNumber, final int wireType) throws java.io.IOException {
            writeUInt32NoTag(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(final int fieldNumber, final int value) throws java.io.IOException {
            flushIfNotAvailable(20);
            bufferTag(fieldNumber, 0);
            bufferInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(final int fieldNumber, final int value) throws java.io.IOException {
            flushIfNotAvailable(20);
            bufferTag(fieldNumber, 0);
            bufferUInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(final int fieldNumber, final int value) throws java.io.IOException {
            flushIfNotAvailable(14);
            bufferTag(fieldNumber, 5);
            bufferFixed32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(final int fieldNumber, final long value) throws java.io.IOException {
            flushIfNotAvailable(20);
            bufferTag(fieldNumber, 0);
            bufferUInt64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(final int fieldNumber, final long value) throws java.io.IOException {
            flushIfNotAvailable(18);
            bufferTag(fieldNumber, 1);
            bufferFixed64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i, boolean z) throws java.io.IOException {
            flushIfNotAvailable(11);
            bufferTag(i, 0);
            buffer(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(final int fieldNumber, final java.lang.String value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(final int fieldNumber, final androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(final int fieldNumber, final byte[] value) throws java.io.IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(final int fieldNumber, final byte[] value, final int offset, final int length) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(final int fieldNumber, final java.nio.ByteBuffer value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(final androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException {
            writeUInt32NoTag(value.size());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(final byte[] value, int offset, int length) throws java.io.IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(final java.nio.ByteBuffer value) throws java.io.IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            java.nio.ByteBuffer byteBufferDuplicate = value.duplicate();
            androidx.datastore.preferences.protobuf.Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void writeMessage(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(final int fieldNumber, final androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(final androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void writeMessageNoTag(final androidx.datastore.preferences.protobuf.MessageLite value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
            writeUInt32NoTag(((androidx.datastore.preferences.protobuf.AbstractMessageLite) value).getSerializedSize(schema));
            schema.writeTo(value, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte value) throws java.io.IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int value) throws java.io.IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int value) throws java.io.IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(final int value) throws java.io.IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long value) throws java.io.IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(final long value) throws java.io.IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(java.lang.String value) throws java.io.IOException {
            int length = value.length() * 3;
            int iComputeUInt32SizeNoTag = computeUInt32SizeNoTag(length);
            int i = iComputeUInt32SizeNoTag + length;
            if (i > this.limit) {
                byte[] bArr = new byte[length];
                int iEncode = androidx.datastore.preferences.protobuf.Utf8.encode(value, bArr, 0, length);
                writeUInt32NoTag(iEncode);
                writeLazy(bArr, 0, iEncode);
                return;
            }
            if (i > this.limit - this.position) {
                doFlush();
            }
            int i2 = this.position;
            try {
                int iComputeUInt32SizeNoTag2 = computeUInt32SizeNoTag(value.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    this.position = i2 + iComputeUInt32SizeNoTag2;
                    int iEncode2 = androidx.datastore.preferences.protobuf.Utf8.encode(value, this.buffer, this.position, this.limit - this.position);
                    this.position = i2;
                    int i3 = (iEncode2 - i2) - iComputeUInt32SizeNoTag2;
                    bufferUInt32NoTag(i3);
                    this.position = iEncode2;
                    this.totalBytesWritten += i3;
                } else {
                    int iEncodedLength = androidx.datastore.preferences.protobuf.Utf8.encodedLength(value);
                    bufferUInt32NoTag(iEncodedLength);
                    this.position = androidx.datastore.preferences.protobuf.Utf8.encode(value, this.buffer, this.position, iEncodedLength);
                    this.totalBytesWritten += iEncodedLength;
                }
            } catch (androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException e) {
                this.totalBytesWritten -= this.position - i2;
                this.position = i2;
                inefficientWriteStringNoTag(value, e);
            } catch (java.lang.IndexOutOfBoundsException e2) {
                throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() throws java.io.IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) throws java.io.IOException {
            flush();
            this.out.write(value, offset, length);
            this.totalBytesWritten += length;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) throws java.io.IOException {
            flush();
            this.out.writeLazy(value, offset, length);
            this.totalBytesWritten += length;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer value) throws java.io.IOException {
            flush();
            int iRemaining = value.remaining();
            this.out.write(value);
            this.totalBytesWritten += iRemaining;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer value) throws java.io.IOException {
            flush();
            int iRemaining = value.remaining();
            this.out.writeLazy(value);
            this.totalBytesWritten += iRemaining;
        }

        private void flushIfNotAvailable(int requiredSize) throws java.io.IOException {
            if (this.limit - this.position < requiredSize) {
                doFlush();
            }
        }

        private void doFlush() throws java.io.IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }
    }

    private static final class OutputStreamEncoder extends androidx.datastore.preferences.protobuf.CodedOutputStream.AbstractBufferedEncoder {
        private final java.io.OutputStream out;

        OutputStreamEncoder(java.io.OutputStream out, int bufferSize) {
            super(bufferSize);
            if (out == null) {
                throw new java.lang.NullPointerException("out");
            }
            this.out = out;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(final int fieldNumber, final int wireType) throws java.io.IOException {
            writeUInt32NoTag(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(final int fieldNumber, final int value) throws java.io.IOException {
            flushIfNotAvailable(20);
            bufferTag(fieldNumber, 0);
            bufferInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(final int fieldNumber, final int value) throws java.io.IOException {
            flushIfNotAvailable(20);
            bufferTag(fieldNumber, 0);
            bufferUInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(final int fieldNumber, final int value) throws java.io.IOException {
            flushIfNotAvailable(14);
            bufferTag(fieldNumber, 5);
            bufferFixed32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(final int fieldNumber, final long value) throws java.io.IOException {
            flushIfNotAvailable(20);
            bufferTag(fieldNumber, 0);
            bufferUInt64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(final int fieldNumber, final long value) throws java.io.IOException {
            flushIfNotAvailable(18);
            bufferTag(fieldNumber, 1);
            bufferFixed64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i, boolean z) throws java.io.IOException {
            flushIfNotAvailable(11);
            bufferTag(i, 0);
            buffer(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(final int fieldNumber, final java.lang.String value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(final int fieldNumber, final androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(final int fieldNumber, final byte[] value) throws java.io.IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(final int fieldNumber, final byte[] value, final int offset, final int length) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(final int fieldNumber, final java.nio.ByteBuffer value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(final androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException {
            writeUInt32NoTag(value.size());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(final byte[] value, int offset, int length) throws java.io.IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(final java.nio.ByteBuffer value) throws java.io.IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            java.nio.ByteBuffer byteBufferDuplicate = value.duplicate();
            androidx.datastore.preferences.protobuf.Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void writeMessage(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(final int fieldNumber, final androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(final androidx.datastore.preferences.protobuf.MessageLite value) throws java.io.IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void writeMessageNoTag(final androidx.datastore.preferences.protobuf.MessageLite value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
            writeUInt32NoTag(((androidx.datastore.preferences.protobuf.AbstractMessageLite) value).getSerializedSize(schema));
            schema.writeTo(value, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte value) throws java.io.IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int value) throws java.io.IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int value) throws java.io.IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(final int value) throws java.io.IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long value) throws java.io.IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(final long value) throws java.io.IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(java.lang.String value) throws java.io.IOException {
            int iEncodedLength;
            try {
                int length = value.length() * 3;
                int iComputeUInt32SizeNoTag = computeUInt32SizeNoTag(length);
                int i = iComputeUInt32SizeNoTag + length;
                if (i > this.limit) {
                    byte[] bArr = new byte[length];
                    int iEncode = androidx.datastore.preferences.protobuf.Utf8.encode(value, bArr, 0, length);
                    writeUInt32NoTag(iEncode);
                    writeLazy(bArr, 0, iEncode);
                    return;
                }
                if (i > this.limit - this.position) {
                    doFlush();
                }
                int iComputeUInt32SizeNoTag2 = computeUInt32SizeNoTag(value.length());
                int i2 = this.position;
                try {
                    try {
                        if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                            this.position = i2 + iComputeUInt32SizeNoTag2;
                            int iEncode2 = androidx.datastore.preferences.protobuf.Utf8.encode(value, this.buffer, this.position, this.limit - this.position);
                            this.position = i2;
                            iEncodedLength = (iEncode2 - i2) - iComputeUInt32SizeNoTag2;
                            bufferUInt32NoTag(iEncodedLength);
                            this.position = iEncode2;
                        } else {
                            iEncodedLength = androidx.datastore.preferences.protobuf.Utf8.encodedLength(value);
                            bufferUInt32NoTag(iEncodedLength);
                            this.position = androidx.datastore.preferences.protobuf.Utf8.encode(value, this.buffer, this.position, iEncodedLength);
                        }
                        this.totalBytesWritten += iEncodedLength;
                    } catch (androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException e) {
                        this.totalBytesWritten -= this.position - i2;
                        this.position = i2;
                        throw e;
                    }
                } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
                    throw new androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException(e2);
                }
            } catch (androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException e3) {
                inefficientWriteStringNoTag(value, e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() throws java.io.IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) throws java.io.IOException {
            if (this.limit - this.position >= length) {
                java.lang.System.arraycopy(value, offset, this.buffer, this.position, length);
                this.position += length;
                this.totalBytesWritten += length;
                return;
            }
            int i = this.limit - this.position;
            java.lang.System.arraycopy(value, offset, this.buffer, this.position, i);
            int i2 = offset + i;
            int i3 = length - i;
            this.position = this.limit;
            this.totalBytesWritten += i;
            doFlush();
            if (i3 <= this.limit) {
                java.lang.System.arraycopy(value, i2, this.buffer, 0, i3);
                this.position = i3;
            } else {
                this.out.write(value, i2, i3);
            }
            this.totalBytesWritten += i3;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) throws java.io.IOException {
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer value) throws java.io.IOException {
            int iRemaining = value.remaining();
            if (this.limit - this.position >= iRemaining) {
                value.get(this.buffer, this.position, iRemaining);
                this.position += iRemaining;
                this.totalBytesWritten += iRemaining;
                return;
            }
            int i = this.limit - this.position;
            value.get(this.buffer, this.position, i);
            int i2 = iRemaining - i;
            this.position = this.limit;
            this.totalBytesWritten += i;
            doFlush();
            while (i2 > this.limit) {
                value.get(this.buffer, 0, this.limit);
                this.out.write(this.buffer, 0, this.limit);
                i2 -= this.limit;
                this.totalBytesWritten += this.limit;
            }
            value.get(this.buffer, 0, i2);
            this.position = i2;
            this.totalBytesWritten += i2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer value) throws java.io.IOException {
            write(value);
        }

        private void flushIfNotAvailable(int requiredSize) throws java.io.IOException {
            if (this.limit - this.position < requiredSize) {
                doFlush();
            }
        }

        private void doFlush() throws java.io.IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }
    }
}
