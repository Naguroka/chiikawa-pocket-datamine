package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
public abstract class ByteString implements java.lang.Iterable<java.lang.Byte>, java.io.Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final androidx.datastore.preferences.protobuf.ByteString EMPTY = new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final java.util.Comparator<androidx.datastore.preferences.protobuf.ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier byteArrayCopier;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    private interface ByteArrayCopier {
        byte[] copyFrom(byte[] bytes, int offset, int size);
    }

    public interface ByteIterator extends java.util.Iterator<java.lang.Byte> {
        byte nextByte();
    }

    private static int hexDigit(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'A';
        if (c < 'A' || c > 'F') {
            c2 = 'a';
            if (c < 'a' || c > 'f') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte value) {
        return value & 255;
    }

    public abstract java.nio.ByteBuffer asReadOnlyByteBuffer();

    public abstract java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int index);

    public abstract void copyTo(java.nio.ByteBuffer target);

    protected abstract void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy);

    public abstract boolean equals(java.lang.Object o);

    protected abstract int getTreeDepth();

    abstract byte internalByteAt(int index);

    protected abstract boolean isBalanced();

    public abstract boolean isValidUtf8();

    public abstract androidx.datastore.preferences.protobuf.CodedInputStream newCodedInput();

    public abstract java.io.InputStream newInput();

    protected abstract int partialHash(int h, int offset, int length);

    protected abstract int partialIsValidUtf8(int state, int offset, int length);

    public abstract int size();

    public abstract androidx.datastore.preferences.protobuf.ByteString substring(int beginIndex, int endIndex);

    protected abstract java.lang.String toStringInternal(java.nio.charset.Charset charset);

    abstract void writeTo(androidx.datastore.preferences.protobuf.ByteOutput byteOutput) throws java.io.IOException;

    public abstract void writeTo(java.io.OutputStream out) throws java.io.IOException;

    abstract void writeToInternal(java.io.OutputStream out, int sourceOffset, int numberToWrite) throws java.io.IOException;

    abstract void writeToReverse(androidx.datastore.preferences.protobuf.ByteOutput byteOutput) throws java.io.IOException;

    static {
        byteArrayCopier = androidx.datastore.preferences.protobuf.Android.isOnAndroidDevice() ? new androidx.datastore.preferences.protobuf.ByteString.SystemByteArrayCopier() : new androidx.datastore.preferences.protobuf.ByteString.ArraysByteArrayCopier();
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new java.util.Comparator<androidx.datastore.preferences.protobuf.ByteString>() { // from class: androidx.datastore.preferences.protobuf.ByteString.2
            /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.ByteString$ByteIterator] */
            /* JADX WARN: Type inference failed for: r1v0, types: [androidx.datastore.preferences.protobuf.ByteString$ByteIterator] */
            @Override // java.util.Comparator
            public int compare(androidx.datastore.preferences.protobuf.ByteString former, androidx.datastore.preferences.protobuf.ByteString latter) {
                ?? Iterator2 = former.iterator2();
                ?? Iterator3 = latter.iterator2();
                while (Iterator2.hasNext() && Iterator3.hasNext()) {
                    int iCompareTo = java.lang.Integer.valueOf(androidx.datastore.preferences.protobuf.ByteString.toInt(Iterator2.nextByte())).compareTo(java.lang.Integer.valueOf(androidx.datastore.preferences.protobuf.ByteString.toInt(Iterator3.nextByte())));
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                return java.lang.Integer.valueOf(former.size()).compareTo(java.lang.Integer.valueOf(latter.size()));
            }
        };
    }

    private static final class SystemByteArrayCopier implements androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier {
        private SystemByteArrayCopier() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bytes, int offset, int size) {
            byte[] bArr = new byte[size];
            java.lang.System.arraycopy(bytes, offset, bArr, 0, size);
            return bArr;
        }
    }

    private static final class ArraysByteArrayCopier implements androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier {
        private ArraysByteArrayCopier() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bytes, int offset, int size) {
            return java.util.Arrays.copyOfRange(bytes, offset, size + offset);
        }
    }

    ByteString() {
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public java.util.Iterator<java.lang.Byte> iterator2() {
        return new androidx.datastore.preferences.protobuf.ByteString.AbstractByteIterator() { // from class: androidx.datastore.preferences.protobuf.ByteString.1
            private final int limit;
            private int position = 0;

            {
                this.limit = androidx.datastore.preferences.protobuf.ByteString.this.size();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.position < this.limit;
            }

            @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
            public byte nextByte() {
                int i = this.position;
                if (i >= this.limit) {
                    throw new java.util.NoSuchElementException();
                }
                this.position = i + 1;
                return androidx.datastore.preferences.protobuf.ByteString.this.internalByteAt(i);
            }
        };
    }

    static abstract class AbstractByteIterator implements androidx.datastore.preferences.protobuf.ByteString.ByteIterator {
        AbstractByteIterator() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public final java.lang.Byte next() {
            return java.lang.Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public static final androidx.datastore.preferences.protobuf.ByteString empty() {
        return EMPTY;
    }

    private static int extractHexDigit(java.lang.String hexString, int index) {
        int iHexDigit = hexDigit(hexString.charAt(index));
        if (iHexDigit != -1) {
            return iHexDigit;
        }
        throw new java.lang.NumberFormatException("Invalid hexString " + hexString + " must only contain [0-9a-fA-F] but contained " + hexString.charAt(index) + " at index " + index);
    }

    public static java.util.Comparator<androidx.datastore.preferences.protobuf.ByteString> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public final androidx.datastore.preferences.protobuf.ByteString substring(int beginIndex) {
        return substring(beginIndex, size());
    }

    public final boolean startsWith(androidx.datastore.preferences.protobuf.ByteString prefix) {
        return size() >= prefix.size() && substring(0, prefix.size()).equals(prefix);
    }

    public final boolean endsWith(androidx.datastore.preferences.protobuf.ByteString suffix) {
        return size() >= suffix.size() && substring(size() - suffix.size()).equals(suffix);
    }

    public static androidx.datastore.preferences.protobuf.ByteString fromHex(java.lang.String hexString) {
        if (hexString.length() % 2 != 0) {
            throw new java.lang.NumberFormatException("Invalid hexString " + hexString + " of length " + hexString.length() + " must be even.");
        }
        int length = hexString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (extractHexDigit(hexString, i2 + 1) | (extractHexDigit(hexString, i2) << 4));
        }
        return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(bArr);
    }

    public static androidx.datastore.preferences.protobuf.ByteString copyFrom(byte[] bytes, int offset, int size) {
        checkRange(offset, offset + size, bytes.length);
        return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(byteArrayCopier.copyFrom(bytes, offset, size));
    }

    public static androidx.datastore.preferences.protobuf.ByteString copyFrom(byte[] bytes) {
        return copyFrom(bytes, 0, bytes.length);
    }

    static androidx.datastore.preferences.protobuf.ByteString wrap(java.nio.ByteBuffer buffer) {
        if (buffer.hasArray()) {
            return wrap(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
        }
        return new androidx.datastore.preferences.protobuf.ByteString.NioByteString(buffer);
    }

    static androidx.datastore.preferences.protobuf.ByteString nioByteString(java.nio.ByteBuffer buffer) {
        return new androidx.datastore.preferences.protobuf.ByteString.NioByteString(buffer);
    }

    static androidx.datastore.preferences.protobuf.ByteString wrap(byte[] bytes) {
        return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(bytes);
    }

    static androidx.datastore.preferences.protobuf.ByteString wrap(byte[] bytes, int offset, int length) {
        return new androidx.datastore.preferences.protobuf.ByteString.BoundedByteString(bytes, offset, length);
    }

    public static androidx.datastore.preferences.protobuf.ByteString copyFrom(java.nio.ByteBuffer bytes, int size) {
        checkRange(0, size, bytes.remaining());
        byte[] bArr = new byte[size];
        bytes.get(bArr);
        return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(bArr);
    }

    public static androidx.datastore.preferences.protobuf.ByteString copyFrom(java.nio.ByteBuffer bytes) {
        return copyFrom(bytes, bytes.remaining());
    }

    public static androidx.datastore.preferences.protobuf.ByteString copyFrom(java.lang.String text, java.lang.String charsetName) throws java.io.UnsupportedEncodingException {
        return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(text.getBytes(charsetName));
    }

    public static androidx.datastore.preferences.protobuf.ByteString copyFrom(java.lang.String text, java.nio.charset.Charset charset) {
        return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(text.getBytes(charset));
    }

    public static androidx.datastore.preferences.protobuf.ByteString copyFromUtf8(java.lang.String text) {
        return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(text.getBytes(androidx.datastore.preferences.protobuf.Internal.UTF_8));
    }

    public static androidx.datastore.preferences.protobuf.ByteString readFrom(java.io.InputStream streamToDrain) throws java.io.IOException {
        return readFrom(streamToDrain, 256, 8192);
    }

    public static androidx.datastore.preferences.protobuf.ByteString readFrom(java.io.InputStream streamToDrain, int chunkSize) throws java.io.IOException {
        return readFrom(streamToDrain, chunkSize, chunkSize);
    }

    public static androidx.datastore.preferences.protobuf.ByteString readFrom(java.io.InputStream streamToDrain, int minChunkSize, int maxChunkSize) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            androidx.datastore.preferences.protobuf.ByteString chunk = readChunk(streamToDrain, minChunkSize);
            if (chunk != null) {
                arrayList.add(chunk);
                minChunkSize = java.lang.Math.min(minChunkSize * 2, maxChunkSize);
            } else {
                return copyFrom(arrayList);
            }
        }
    }

    private static androidx.datastore.preferences.protobuf.ByteString readChunk(java.io.InputStream in, final int chunkSize) throws java.io.IOException {
        byte[] bArr = new byte[chunkSize];
        int i = 0;
        while (i < chunkSize) {
            int i2 = in.read(bArr, i, chunkSize - i);
            if (i2 == -1) {
                break;
            }
            i += i2;
        }
        if (i == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i);
    }

    public final androidx.datastore.preferences.protobuf.ByteString concat(androidx.datastore.preferences.protobuf.ByteString other) {
        if (Integer.MAX_VALUE - size() < other.size()) {
            throw new java.lang.IllegalArgumentException("ByteString would be too long: " + size() + "+" + other.size());
        }
        return androidx.datastore.preferences.protobuf.RopeByteString.concatenate(this, other);
    }

    public static androidx.datastore.preferences.protobuf.ByteString copyFrom(java.lang.Iterable<androidx.datastore.preferences.protobuf.ByteString> byteStrings) {
        int size;
        if (!(byteStrings instanceof java.util.Collection)) {
            java.util.Iterator<androidx.datastore.preferences.protobuf.ByteString> it = byteStrings.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((java.util.Collection) byteStrings).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return balancedConcat(byteStrings.iterator(), size);
    }

    private static androidx.datastore.preferences.protobuf.ByteString balancedConcat(java.util.Iterator<androidx.datastore.preferences.protobuf.ByteString> iterator, int length) {
        if (length < 1) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("length (%s) must be >= 1", java.lang.Integer.valueOf(length)));
        }
        if (length == 1) {
            return iterator.next();
        }
        int i = length >>> 1;
        return balancedConcat(iterator, i).concat(balancedConcat(iterator, length - i));
    }

    public void copyTo(byte[] target, int offset) {
        copyTo(target, 0, offset, size());
    }

    @java.lang.Deprecated
    public final void copyTo(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        checkRange(sourceOffset, sourceOffset + numberToCopy, size());
        checkRange(targetOffset, targetOffset + numberToCopy, target.length);
        if (numberToCopy > 0) {
            copyToInternal(target, sourceOffset, targetOffset, numberToCopy);
        }
    }

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    final void writeTo(java.io.OutputStream out, int sourceOffset, int numberToWrite) throws java.io.IOException {
        checkRange(sourceOffset, sourceOffset + numberToWrite, size());
        if (numberToWrite > 0) {
            writeToInternal(out, sourceOffset, numberToWrite);
        }
    }

    public final java.lang.String toString(java.lang.String charsetName) throws java.io.UnsupportedEncodingException {
        try {
            return toString(java.nio.charset.Charset.forName(charsetName));
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            java.io.UnsupportedEncodingException unsupportedEncodingException = new java.io.UnsupportedEncodingException(charsetName);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    public final java.lang.String toString(java.nio.charset.Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public final java.lang.String toStringUtf8() {
        return toString(androidx.datastore.preferences.protobuf.Internal.UTF_8);
    }

    static abstract class LeafByteString extends androidx.datastore.preferences.protobuf.ByteString {
        private static final long serialVersionUID = 1;

        abstract boolean equalsRange(androidx.datastore.preferences.protobuf.ByteString other, int offset, int length);

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected final int getTreeDepth() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected final boolean isBalanced() {
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
            return super.iterator2();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        void writeToReverse(androidx.datastore.preferences.protobuf.ByteOutput byteOutput) throws java.io.IOException {
            writeTo(byteOutput);
        }

        private LeafByteString() {
        }
    }

    public final int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    public static androidx.datastore.preferences.protobuf.ByteString.Output newOutput(int initialCapacity) {
        return new androidx.datastore.preferences.protobuf.ByteString.Output(initialCapacity);
    }

    public static androidx.datastore.preferences.protobuf.ByteString.Output newOutput() {
        return new androidx.datastore.preferences.protobuf.ByteString.Output(128);
    }

    public static final class Output extends java.io.OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final java.util.ArrayList<androidx.datastore.preferences.protobuf.ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        Output(int initialCapacity) {
            if (initialCapacity < 0) {
                throw new java.lang.IllegalArgumentException("Buffer size < 0");
            }
            this.initialCapacity = initialCapacity;
            this.flushedBuffers = new java.util.ArrayList<>();
            this.buffer = new byte[initialCapacity];
        }

        @Override // java.io.OutputStream
        public synchronized void write(int b) {
            if (this.bufferPos == this.buffer.length) {
                flushFullBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i = this.bufferPos;
            this.bufferPos = i + 1;
            bArr[i] = (byte) b;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] b, int offset, int length) {
            byte[] bArr = this.buffer;
            int length2 = bArr.length;
            int i = this.bufferPos;
            if (length <= length2 - i) {
                java.lang.System.arraycopy(b, offset, bArr, i, length);
                this.bufferPos += length;
            } else {
                int length3 = bArr.length - i;
                java.lang.System.arraycopy(b, offset, bArr, i, length3);
                int i2 = length - length3;
                flushFullBuffer(i2);
                java.lang.System.arraycopy(b, offset + length3, this.buffer, 0, i2);
                this.bufferPos = i2;
            }
        }

        public synchronized androidx.datastore.preferences.protobuf.ByteString toByteString() {
            flushLastBuffer();
            return androidx.datastore.preferences.protobuf.ByteString.copyFrom(this.flushedBuffers);
        }

        public void writeTo(java.io.OutputStream out) throws java.io.IOException {
            int i;
            androidx.datastore.preferences.protobuf.ByteString[] byteStringArr;
            byte[] bArr;
            int i2;
            synchronized (this) {
                byteStringArr = (androidx.datastore.preferences.protobuf.ByteString[]) this.flushedBuffers.toArray(new androidx.datastore.preferences.protobuf.ByteString[0]);
                bArr = this.buffer;
                i2 = this.bufferPos;
            }
            for (androidx.datastore.preferences.protobuf.ByteString byteString : byteStringArr) {
                byteString.writeTo(out);
            }
            out.write(java.util.Arrays.copyOf(bArr, i2));
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized void reset() {
            this.flushedBuffers.clear();
            this.flushedBuffersTotalBytes = 0;
            this.bufferPos = 0;
        }

        public java.lang.String toString() {
            return java.lang.String.format("<ByteString.Output@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()));
        }

        private void flushFullBuffer(int minSize) {
            this.flushedBuffers.add(new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[java.lang.Math.max(this.initialCapacity, java.lang.Math.max(minSize, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i >= bArr.length) {
                this.flushedBuffers.add(new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i > 0) {
                this.flushedBuffers.add(new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(java.util.Arrays.copyOf(bArr, i)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }
    }

    static androidx.datastore.preferences.protobuf.ByteString.CodedBuilder newCodedBuilder(int size) {
        return new androidx.datastore.preferences.protobuf.ByteString.CodedBuilder(size);
    }

    static final class CodedBuilder {
        private final byte[] buffer;
        private final androidx.datastore.preferences.protobuf.CodedOutputStream output;

        private CodedBuilder(int size) {
            byte[] bArr = new byte[size];
            this.buffer = bArr;
            this.output = androidx.datastore.preferences.protobuf.CodedOutputStream.newInstance(bArr);
        }

        public androidx.datastore.preferences.protobuf.ByteString build() {
            this.output.checkNoSpaceLeft();
            return new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(this.buffer);
        }

        public androidx.datastore.preferences.protobuf.CodedOutputStream getCodedOutput() {
            return this.output;
        }
    }

    protected final int peekCachedHashCode() {
        return this.hash;
    }

    static void checkIndex(int index, int size) {
        if (((size - (index + 1)) | index) < 0) {
            if (index < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException("Index < 0: " + index);
            }
            throw new java.lang.ArrayIndexOutOfBoundsException("Index > length: " + index + ", " + size);
        }
    }

    static int checkRange(int startIndex, int endIndex, int size) {
        int i = endIndex - startIndex;
        if ((startIndex | endIndex | i | (size - endIndex)) >= 0) {
            return i;
        }
        if (startIndex < 0) {
            throw new java.lang.IndexOutOfBoundsException("Beginning index: " + startIndex + " < 0");
        }
        if (endIndex < startIndex) {
            throw new java.lang.IndexOutOfBoundsException("Beginning index larger than ending index: " + startIndex + ", " + endIndex);
        }
        throw new java.lang.IndexOutOfBoundsException("End index: " + endIndex + " >= " + size);
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()), truncateAndEscapeForDisplay());
    }

    private java.lang.String truncateAndEscapeForDisplay() {
        return size() <= 50 ? androidx.datastore.preferences.protobuf.TextFormatEscaper.escapeBytes(this) : androidx.datastore.preferences.protobuf.TextFormatEscaper.escapeBytes(substring(0, 47)) + "...";
    }

    private static class LiteralByteString extends androidx.datastore.preferences.protobuf.ByteString.LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        protected int getOffsetIntoBytes() {
            return 0;
        }

        LiteralByteString(byte[] bytes) {
            super();
            bytes.getClass();
            this.bytes = bytes;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte byteAt(int index) {
            return this.bytes[index];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        byte internalByteAt(int index) {
            return this.bytes[index];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final androidx.datastore.preferences.protobuf.ByteString substring(int beginIndex, int endIndex) {
            int iCheckRange = checkRange(beginIndex, endIndex, size());
            if (iCheckRange == 0) {
                return androidx.datastore.preferences.protobuf.ByteString.EMPTY;
            }
            return new androidx.datastore.preferences.protobuf.ByteString.BoundedByteString(this.bytes, getOffsetIntoBytes() + beginIndex, iCheckRange);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            java.lang.System.arraycopy(this.bytes, sourceOffset, target, targetOffset, numberToCopy);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void copyTo(java.nio.ByteBuffer target) {
            target.put(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final java.nio.ByteBuffer asReadOnlyByteBuffer() {
            return java.nio.ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() {
            return java.util.Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
            outputStream.write(toByteArray());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        final void writeToInternal(java.io.OutputStream outputStream, int sourceOffset, int numberToWrite) throws java.io.IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + sourceOffset, numberToWrite);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        final void writeTo(androidx.datastore.preferences.protobuf.ByteOutput output) throws java.io.IOException {
            output.writeLazy(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected final java.lang.String toStringInternal(java.nio.charset.Charset charset) {
            return new java.lang.String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return androidx.datastore.preferences.protobuf.Utf8.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected final int partialIsValidUtf8(int state, int offset, int length) {
            int offsetIntoBytes = getOffsetIntoBytes() + offset;
            return androidx.datastore.preferences.protobuf.Utf8.partialIsValidUtf8(state, this.bytes, offsetIntoBytes, length + offsetIntoBytes);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(java.lang.Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof androidx.datastore.preferences.protobuf.ByteString) || size() != ((androidx.datastore.preferences.protobuf.ByteString) other).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (other instanceof androidx.datastore.preferences.protobuf.ByteString.LiteralByteString) {
                androidx.datastore.preferences.protobuf.ByteString.LiteralByteString literalByteString = (androidx.datastore.preferences.protobuf.ByteString.LiteralByteString) other;
                int iPeekCachedHashCode = peekCachedHashCode();
                int iPeekCachedHashCode2 = literalByteString.peekCachedHashCode();
                if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                    return equalsRange(literalByteString, 0, size());
                }
                return false;
            }
            return other.equals(this);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        final boolean equalsRange(androidx.datastore.preferences.protobuf.ByteString other, int offset, int length) {
            if (length > other.size()) {
                throw new java.lang.IllegalArgumentException("Length too large: " + length + size());
            }
            int i = offset + length;
            if (i > other.size()) {
                throw new java.lang.IllegalArgumentException("Ran off end of other: " + offset + ", " + length + ", " + other.size());
            }
            if (other instanceof androidx.datastore.preferences.protobuf.ByteString.LiteralByteString) {
                androidx.datastore.preferences.protobuf.ByteString.LiteralByteString literalByteString = (androidx.datastore.preferences.protobuf.ByteString.LiteralByteString) other;
                byte[] bArr = this.bytes;
                byte[] bArr2 = literalByteString.bytes;
                int offsetIntoBytes = getOffsetIntoBytes() + length;
                int offsetIntoBytes2 = getOffsetIntoBytes();
                int offsetIntoBytes3 = literalByteString.getOffsetIntoBytes() + offset;
                while (offsetIntoBytes2 < offsetIntoBytes) {
                    if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                        return false;
                    }
                    offsetIntoBytes2++;
                    offsetIntoBytes3++;
                }
                return true;
            }
            return other.substring(offset, i).equals(substring(0, length));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected final int partialHash(int h, int offset, int length) {
            return androidx.datastore.preferences.protobuf.Internal.partialHash(h, this.bytes, getOffsetIntoBytes() + offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final java.io.InputStream newInput() {
            return new java.io.ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final androidx.datastore.preferences.protobuf.CodedInputStream newCodedInput() {
            return androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(this.bytes, getOffsetIntoBytes(), size(), true);
        }
    }

    private static final class BoundedByteString extends androidx.datastore.preferences.protobuf.ByteString.LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        BoundedByteString(byte[] bytes, int offset, int length) {
            super(bytes);
            checkRange(offset, offset + length, bytes.length);
            this.bytesOffset = offset;
            this.bytesLength = length;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte byteAt(int index) {
            checkIndex(index, size());
            return this.bytes[this.bytesOffset + index];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        byte internalByteAt(int index) {
            return this.bytes[this.bytesOffset + index];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.bytesLength;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        protected int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        protected void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            java.lang.System.arraycopy(this.bytes, getOffsetIntoBytes() + sourceOffset, target, targetOffset, numberToCopy);
        }

        java.lang.Object writeReplace() {
            return androidx.datastore.preferences.protobuf.ByteString.wrap(toByteArray());
        }

        private void readObject(java.io.ObjectInputStream in) throws java.io.IOException {
            throw new java.io.InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }
    }

    private static final class NioByteString extends androidx.datastore.preferences.protobuf.ByteString.LeafByteString {
        private final java.nio.ByteBuffer buffer;

        NioByteString(java.nio.ByteBuffer buffer) {
            super();
            androidx.datastore.preferences.protobuf.Internal.checkNotNull(buffer, "buffer");
            this.buffer = buffer.slice().order(java.nio.ByteOrder.nativeOrder());
        }

        private java.lang.Object writeReplace() {
            return androidx.datastore.preferences.protobuf.ByteString.copyFrom(this.buffer.slice());
        }

        private void readObject(java.io.ObjectInputStream in) throws java.io.IOException {
            throw new java.io.InvalidObjectException("NioByteString instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte byteAt(int index) {
            try {
                return this.buffer.get(index);
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                throw e;
            } catch (java.lang.IndexOutOfBoundsException e2) {
                throw new java.lang.ArrayIndexOutOfBoundsException(e2.getMessage());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte internalByteAt(int index) {
            return byteAt(index);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.buffer.remaining();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public androidx.datastore.preferences.protobuf.ByteString substring(int beginIndex, int endIndex) {
            try {
                return new androidx.datastore.preferences.protobuf.ByteString.NioByteString(slice(beginIndex, endIndex));
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                throw e;
            } catch (java.lang.IndexOutOfBoundsException e2) {
                throw new java.lang.ArrayIndexOutOfBoundsException(e2.getMessage());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            java.nio.ByteBuffer byteBufferSlice = this.buffer.slice();
            androidx.datastore.preferences.protobuf.Java8Compatibility.position(byteBufferSlice, sourceOffset);
            byteBufferSlice.get(target, targetOffset, numberToCopy);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void copyTo(java.nio.ByteBuffer target) {
            target.put(this.buffer.slice());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void writeTo(java.io.OutputStream out) throws java.io.IOException {
            out.write(toByteArray());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        boolean equalsRange(androidx.datastore.preferences.protobuf.ByteString other, int offset, int length) {
            return substring(0, length).equals(other.substring(offset, length + offset));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        void writeToInternal(java.io.OutputStream out, int sourceOffset, int numberToWrite) throws java.io.IOException {
            if (this.buffer.hasArray()) {
                out.write(this.buffer.array(), this.buffer.arrayOffset() + this.buffer.position() + sourceOffset, numberToWrite);
            } else {
                androidx.datastore.preferences.protobuf.ByteBufferWriter.write(slice(sourceOffset, numberToWrite + sourceOffset), out);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        void writeTo(androidx.datastore.preferences.protobuf.ByteOutput output) throws java.io.IOException {
            output.writeLazy(this.buffer.slice());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public java.nio.ByteBuffer asReadOnlyByteBuffer() {
            return this.buffer.asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() {
            return java.util.Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected java.lang.String toStringInternal(java.nio.charset.Charset charset) {
            byte[] byteArray;
            int length;
            int iArrayOffset;
            if (this.buffer.hasArray()) {
                byteArray = this.buffer.array();
                iArrayOffset = this.buffer.arrayOffset() + this.buffer.position();
                length = this.buffer.remaining();
            } else {
                byteArray = toByteArray();
                length = byteArray.length;
                iArrayOffset = 0;
            }
            return new java.lang.String(byteArray, iArrayOffset, length, charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public boolean isValidUtf8() {
            return androidx.datastore.preferences.protobuf.Utf8.isValidUtf8(this.buffer);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected int partialIsValidUtf8(int state, int offset, int length) {
            return androidx.datastore.preferences.protobuf.Utf8.partialIsValidUtf8(state, this.buffer, offset, length + offset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public boolean equals(java.lang.Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof androidx.datastore.preferences.protobuf.ByteString)) {
                return false;
            }
            androidx.datastore.preferences.protobuf.ByteString byteString = (androidx.datastore.preferences.protobuf.ByteString) other;
            if (size() != byteString.size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (other instanceof androidx.datastore.preferences.protobuf.ByteString.NioByteString) {
                return this.buffer.equals(((androidx.datastore.preferences.protobuf.ByteString.NioByteString) other).buffer);
            }
            if (other instanceof androidx.datastore.preferences.protobuf.RopeByteString) {
                return other.equals(this);
            }
            return this.buffer.equals(byteString.asReadOnlyByteBuffer());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected int partialHash(int h, int offset, int length) {
            for (int i = offset; i < offset + length; i++) {
                h = (h * 31) + this.buffer.get(i);
            }
            return h;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public java.io.InputStream newInput() {
            return new java.io.InputStream() { // from class: androidx.datastore.preferences.protobuf.ByteString.NioByteString.1
                private final java.nio.ByteBuffer buf;

                @Override // java.io.InputStream
                public boolean markSupported() {
                    return true;
                }

                {
                    this.buf = androidx.datastore.preferences.protobuf.ByteString.NioByteString.this.buffer.slice();
                }

                @Override // java.io.InputStream
                public void mark(int readlimit) {
                    androidx.datastore.preferences.protobuf.Java8Compatibility.mark(this.buf);
                }

                @Override // java.io.InputStream
                public void reset() throws java.io.IOException {
                    try {
                        androidx.datastore.preferences.protobuf.Java8Compatibility.reset(this.buf);
                    } catch (java.nio.InvalidMarkException e) {
                        throw new java.io.IOException(e);
                    }
                }

                @Override // java.io.InputStream
                public int available() throws java.io.IOException {
                    return this.buf.remaining();
                }

                @Override // java.io.InputStream
                public int read() throws java.io.IOException {
                    if (this.buf.hasRemaining()) {
                        return this.buf.get() & 255;
                    }
                    return -1;
                }

                @Override // java.io.InputStream
                public int read(byte[] bytes, int off, int len) throws java.io.IOException {
                    if (!this.buf.hasRemaining()) {
                        return -1;
                    }
                    int iMin = java.lang.Math.min(len, this.buf.remaining());
                    this.buf.get(bytes, off, iMin);
                    return iMin;
                }
            };
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public androidx.datastore.preferences.protobuf.CodedInputStream newCodedInput() {
            return androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(this.buffer, true);
        }

        private java.nio.ByteBuffer slice(int beginIndex, int endIndex) {
            if (beginIndex < this.buffer.position() || endIndex > this.buffer.limit() || beginIndex > endIndex) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid indices [%d, %d]", java.lang.Integer.valueOf(beginIndex), java.lang.Integer.valueOf(endIndex)));
            }
            java.nio.ByteBuffer byteBufferSlice = this.buffer.slice();
            androidx.datastore.preferences.protobuf.Java8Compatibility.position(byteBufferSlice, beginIndex - this.buffer.position());
            androidx.datastore.preferences.protobuf.Java8Compatibility.limit(byteBufferSlice, endIndex - this.buffer.position());
            return byteBufferSlice;
        }
    }
}
