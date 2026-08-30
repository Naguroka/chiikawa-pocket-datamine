package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public class FlatBufferBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    java.nio.ByteBuffer bb;
    androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory bb_factory;
    boolean finished;
    boolean force_defaults;
    int minalign;
    boolean nested;
    int num_vtables;
    int object_start;
    int space;
    final androidx.emoji2.text.flatbuffer.Utf8 utf8;
    int vector_num_elems;
    int[] vtable;
    int vtable_in_use;
    int[] vtables;

    public static abstract class ByteBufferFactory {
        public abstract java.nio.ByteBuffer newByteBuffer(int i);

        public void releaseByteBuffer(java.nio.ByteBuffer byteBuffer) {
        }
    }

    public FlatBufferBuilder(int i, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory byteBufferFactory) {
        this(i, byteBufferFactory, null, androidx.emoji2.text.flatbuffer.Utf8.getDefault());
    }

    public FlatBufferBuilder(int i, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory byteBufferFactory, java.nio.ByteBuffer byteBuffer, androidx.emoji2.text.flatbuffer.Utf8 utf8) {
        this.minalign = 1;
        this.vtable = null;
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.vtables = new int[16];
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        this.force_defaults = false;
        i = i <= 0 ? 1 : i;
        this.bb_factory = byteBufferFactory;
        if (byteBuffer != null) {
            this.bb = byteBuffer;
            byteBuffer.clear();
            this.bb.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        } else {
            this.bb = byteBufferFactory.newByteBuffer(i);
        }
        this.utf8 = utf8;
        this.space = this.bb.capacity();
    }

    public FlatBufferBuilder(int i) {
        this(i, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.HeapByteBufferFactory.INSTANCE, null, androidx.emoji2.text.flatbuffer.Utf8.getDefault());
    }

    public FlatBufferBuilder() {
        this(1024);
    }

    public FlatBufferBuilder(java.nio.ByteBuffer byteBuffer, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory byteBufferFactory) {
        this(byteBuffer.capacity(), byteBufferFactory, byteBuffer, androidx.emoji2.text.flatbuffer.Utf8.getDefault());
    }

    public FlatBufferBuilder(java.nio.ByteBuffer byteBuffer) {
        this(byteBuffer, new androidx.emoji2.text.flatbuffer.FlatBufferBuilder.HeapByteBufferFactory());
    }

    public androidx.emoji2.text.flatbuffer.FlatBufferBuilder init(java.nio.ByteBuffer byteBuffer, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory byteBufferFactory) {
        this.bb_factory = byteBufferFactory;
        this.bb = byteBuffer;
        byteBuffer.clear();
        this.bb.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        this.minalign = 1;
        this.space = this.bb.capacity();
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.object_start = 0;
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        return this;
    }

    public static final class HeapByteBufferFactory extends androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory {
        public static final androidx.emoji2.text.flatbuffer.FlatBufferBuilder.HeapByteBufferFactory INSTANCE = new androidx.emoji2.text.flatbuffer.FlatBufferBuilder.HeapByteBufferFactory();

        @Override // androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory
        public java.nio.ByteBuffer newByteBuffer(int i) {
            return java.nio.ByteBuffer.allocate(i).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        }
    }

    public static boolean isFieldPresent(androidx.emoji2.text.flatbuffer.Table table, int i) {
        return table.__offset(i) != 0;
    }

    public void clear() {
        this.space = this.bb.capacity();
        this.bb.clear();
        this.minalign = 1;
        while (true) {
            int i = this.vtable_in_use;
            if (i <= 0) {
                this.vtable_in_use = 0;
                this.nested = false;
                this.finished = false;
                this.object_start = 0;
                this.num_vtables = 0;
                this.vector_num_elems = 0;
                return;
            }
            int[] iArr = this.vtable;
            int i2 = i - 1;
            this.vtable_in_use = i2;
            iArr[i2] = 0;
        }
    }

    static java.nio.ByteBuffer growByteBuffer(java.nio.ByteBuffer byteBuffer, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory byteBufferFactory) {
        int iCapacity = byteBuffer.capacity();
        if (((-1073741824) & iCapacity) != 0) {
            throw new java.lang.AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
        }
        int i = iCapacity == 0 ? 1 : iCapacity << 1;
        byteBuffer.position(0);
        java.nio.ByteBuffer byteBufferNewByteBuffer = byteBufferFactory.newByteBuffer(i);
        byteBufferNewByteBuffer.position(byteBufferNewByteBuffer.clear().capacity() - iCapacity);
        byteBufferNewByteBuffer.put(byteBuffer);
        return byteBufferNewByteBuffer;
    }

    public int offset() {
        return this.bb.capacity() - this.space;
    }

    public void pad(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            java.nio.ByteBuffer byteBuffer = this.bb;
            int i3 = this.space - 1;
            this.space = i3;
            byteBuffer.put(i3, (byte) 0);
        }
    }

    public void prep(int i, int i2) {
        if (i > this.minalign) {
            this.minalign = i;
        }
        int i3 = ((~((this.bb.capacity() - this.space) + i2)) + 1) & (i - 1);
        while (this.space < i3 + i + i2) {
            int iCapacity = this.bb.capacity();
            java.nio.ByteBuffer byteBuffer = this.bb;
            java.nio.ByteBuffer byteBufferGrowByteBuffer = growByteBuffer(byteBuffer, this.bb_factory);
            this.bb = byteBufferGrowByteBuffer;
            if (byteBuffer != byteBufferGrowByteBuffer) {
                this.bb_factory.releaseByteBuffer(byteBuffer);
            }
            this.space += this.bb.capacity() - iCapacity;
        }
        pad(i3);
    }

    public void putBoolean(boolean z) {
        java.nio.ByteBuffer byteBuffer = this.bb;
        int i = this.space - 1;
        this.space = i;
        byteBuffer.put(i, z ? (byte) 1 : (byte) 0);
    }

    public void putByte(byte b) {
        java.nio.ByteBuffer byteBuffer = this.bb;
        int i = this.space - 1;
        this.space = i;
        byteBuffer.put(i, b);
    }

    public void putShort(short s) {
        java.nio.ByteBuffer byteBuffer = this.bb;
        int i = this.space - 2;
        this.space = i;
        byteBuffer.putShort(i, s);
    }

    public void putInt(int i) {
        java.nio.ByteBuffer byteBuffer = this.bb;
        int i2 = this.space - 4;
        this.space = i2;
        byteBuffer.putInt(i2, i);
    }

    public void putLong(long j) {
        java.nio.ByteBuffer byteBuffer = this.bb;
        int i = this.space - 8;
        this.space = i;
        byteBuffer.putLong(i, j);
    }

    public void putFloat(float f) {
        java.nio.ByteBuffer byteBuffer = this.bb;
        int i = this.space - 4;
        this.space = i;
        byteBuffer.putFloat(i, f);
    }

    public void putDouble(double d) {
        java.nio.ByteBuffer byteBuffer = this.bb;
        int i = this.space - 8;
        this.space = i;
        byteBuffer.putDouble(i, d);
    }

    public void addBoolean(boolean z) {
        prep(1, 0);
        putBoolean(z);
    }

    public void addByte(byte b) {
        prep(1, 0);
        putByte(b);
    }

    public void addShort(short s) {
        prep(2, 0);
        putShort(s);
    }

    public void addInt(int i) {
        prep(4, 0);
        putInt(i);
    }

    public void addLong(long j) {
        prep(8, 0);
        putLong(j);
    }

    public void addFloat(float f) {
        prep(4, 0);
        putFloat(f);
    }

    public void addDouble(double d) {
        prep(8, 0);
        putDouble(d);
    }

    public void addOffset(int i) {
        prep(4, 0);
        putInt((offset() - i) + 4);
    }

    public void startVector(int i, int i2, int i3) {
        notNested();
        this.vector_num_elems = i2;
        int i4 = i * i2;
        prep(4, i4);
        prep(i3, i4);
        this.nested = true;
    }

    public int endVector() {
        if (!this.nested) {
            throw new java.lang.AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.nested = false;
        putInt(this.vector_num_elems);
        return offset();
    }

    public java.nio.ByteBuffer createUnintializedVector(int i, int i2, int i3) {
        int i4 = i * i2;
        startVector(i, i2, i3);
        java.nio.ByteBuffer byteBuffer = this.bb;
        int i5 = this.space - i4;
        this.space = i5;
        byteBuffer.position(i5);
        java.nio.ByteBuffer byteBufferOrder = this.bb.slice().order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.limit(i4);
        return byteBufferOrder;
    }

    public int createVectorOfTables(int[] iArr) {
        notNested();
        startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            addOffset(iArr[length]);
        }
        return endVector();
    }

    public <T extends androidx.emoji2.text.flatbuffer.Table> int createSortedVectorOfTables(T t, int[] iArr) {
        t.sortTables(iArr, this.bb);
        return createVectorOfTables(iArr);
    }

    public int createString(java.lang.CharSequence charSequence) {
        int iEncodedLength = this.utf8.encodedLength(charSequence);
        addByte((byte) 0);
        startVector(1, iEncodedLength, 1);
        java.nio.ByteBuffer byteBuffer = this.bb;
        int i = this.space - iEncodedLength;
        this.space = i;
        byteBuffer.position(i);
        this.utf8.encodeUtf8(charSequence, this.bb);
        return endVector();
    }

    public int createString(java.nio.ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        addByte((byte) 0);
        startVector(1, iRemaining, 1);
        java.nio.ByteBuffer byteBuffer2 = this.bb;
        int i = this.space - iRemaining;
        this.space = i;
        byteBuffer2.position(i);
        this.bb.put(byteBuffer);
        return endVector();
    }

    public int createByteVector(byte[] bArr) {
        int length = bArr.length;
        startVector(1, length, 1);
        java.nio.ByteBuffer byteBuffer = this.bb;
        int i = this.space - length;
        this.space = i;
        byteBuffer.position(i);
        this.bb.put(bArr);
        return endVector();
    }

    public int createByteVector(byte[] bArr, int i, int i2) {
        startVector(1, i2, 1);
        java.nio.ByteBuffer byteBuffer = this.bb;
        int i3 = this.space - i2;
        this.space = i3;
        byteBuffer.position(i3);
        this.bb.put(bArr, i, i2);
        return endVector();
    }

    public int createByteVector(java.nio.ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        startVector(1, iRemaining, 1);
        java.nio.ByteBuffer byteBuffer2 = this.bb;
        int i = this.space - iRemaining;
        this.space = i;
        byteBuffer2.position(i);
        this.bb.put(byteBuffer);
        return endVector();
    }

    public void finished() {
        if (!this.finished) {
            throw new java.lang.AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public void notNested() {
        if (this.nested) {
            throw new java.lang.AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public void Nested(int i) {
        if (i != offset()) {
            throw new java.lang.AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void startTable(int i) {
        notNested();
        int[] iArr = this.vtable;
        if (iArr == null || iArr.length < i) {
            this.vtable = new int[i];
        }
        this.vtable_in_use = i;
        java.util.Arrays.fill(this.vtable, 0, i, 0);
        this.nested = true;
        this.object_start = offset();
    }

    public void addBoolean(int i, boolean z, boolean z2) {
        if (this.force_defaults || z != z2) {
            addBoolean(z);
            slot(i);
        }
    }

    public void addByte(int i, byte b, int i2) {
        if (this.force_defaults || b != i2) {
            addByte(b);
            slot(i);
        }
    }

    public void addShort(int i, short s, int i2) {
        if (this.force_defaults || s != i2) {
            addShort(s);
            slot(i);
        }
    }

    public void addInt(int i, int i2, int i3) {
        if (this.force_defaults || i2 != i3) {
            addInt(i2);
            slot(i);
        }
    }

    public void addLong(int i, long j, long j2) {
        if (this.force_defaults || j != j2) {
            addLong(j);
            slot(i);
        }
    }

    public void addFloat(int i, float f, double d) {
        if (this.force_defaults || f != d) {
            addFloat(f);
            slot(i);
        }
    }

    public void addDouble(int i, double d, double d2) {
        if (this.force_defaults || d != d2) {
            addDouble(d);
            slot(i);
        }
    }

    public void addOffset(int i, int i2, int i3) {
        if (this.force_defaults || i2 != i3) {
            addOffset(i2);
            slot(i);
        }
    }

    public void addStruct(int i, int i2, int i3) {
        if (i2 != i3) {
            Nested(i2);
            slot(i);
        }
    }

    public void slot(int i) {
        this.vtable[i] = offset();
    }

    public int endTable() {
        int i;
        if (this.vtable == null || !this.nested) {
            throw new java.lang.AssertionError("FlatBuffers: endTable called without startTable");
        }
        addInt(0);
        int iOffset = offset();
        int i2 = this.vtable_in_use - 1;
        while (i2 >= 0 && this.vtable[i2] == 0) {
            i2--;
        }
        int i3 = i2 + 1;
        while (i2 >= 0) {
            int i4 = this.vtable[i2];
            addShort((short) (i4 != 0 ? iOffset - i4 : 0));
            i2--;
        }
        addShort((short) (iOffset - this.object_start));
        addShort((short) ((i3 + 2) * 2));
        int i5 = 0;
        loop2: while (true) {
            if (i5 >= this.num_vtables) {
                i = 0;
                break;
            }
            int iCapacity = this.bb.capacity() - this.vtables[i5];
            int i6 = this.space;
            short s = this.bb.getShort(iCapacity);
            if (s == this.bb.getShort(i6)) {
                int i7 = 2;
                while (true) {
                    if (i7 < s) {
                        if (this.bb.getShort(iCapacity + i7) != this.bb.getShort(i6 + i7)) {
                            break;
                        }
                        i7 += 2;
                    } else {
                        i = this.vtables[i5];
                        break loop2;
                    }
                }
            }
            i5++;
        }
        if (i != 0) {
            int iCapacity2 = this.bb.capacity() - iOffset;
            this.space = iCapacity2;
            this.bb.putInt(iCapacity2, i - iOffset);
        } else {
            int i8 = this.num_vtables;
            int[] iArr = this.vtables;
            if (i8 == iArr.length) {
                this.vtables = java.util.Arrays.copyOf(iArr, i8 * 2);
            }
            int[] iArr2 = this.vtables;
            int i9 = this.num_vtables;
            this.num_vtables = i9 + 1;
            iArr2[i9] = offset();
            java.nio.ByteBuffer byteBuffer = this.bb;
            byteBuffer.putInt(byteBuffer.capacity() - iOffset, offset() - iOffset);
        }
        this.nested = false;
        return iOffset;
    }

    public void required(int i, int i2) {
        int iCapacity = this.bb.capacity() - i;
        if (!(this.bb.getShort((iCapacity - this.bb.getInt(iCapacity)) + i2) != 0)) {
            throw new java.lang.AssertionError("FlatBuffers: field " + i2 + " must be set");
        }
    }

    protected void finish(int i, boolean z) {
        prep(this.minalign, (z ? 4 : 0) + 4);
        addOffset(i);
        if (z) {
            addInt(this.bb.capacity() - this.space);
        }
        this.bb.position(this.space);
        this.finished = true;
    }

    public void finish(int i) {
        finish(i, false);
    }

    public void finishSizePrefixed(int i) {
        finish(i, true);
    }

    protected void finish(int i, java.lang.String str, boolean z) {
        prep(this.minalign, (z ? 4 : 0) + 8);
        if (str.length() != 4) {
            throw new java.lang.AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i2 = 3; i2 >= 0; i2--) {
            addByte((byte) str.charAt(i2));
        }
        finish(i, z);
    }

    public void finish(int i, java.lang.String str) {
        finish(i, str, false);
    }

    public void finishSizePrefixed(int i, java.lang.String str) {
        finish(i, str, true);
    }

    public androidx.emoji2.text.flatbuffer.FlatBufferBuilder forceDefaults(boolean z) {
        this.force_defaults = z;
        return this;
    }

    public java.nio.ByteBuffer dataBuffer() {
        finished();
        return this.bb;
    }

    @java.lang.Deprecated
    private int dataStart() {
        finished();
        return this.space;
    }

    public byte[] sizedByteArray(int i, int i2) {
        finished();
        byte[] bArr = new byte[i2];
        this.bb.position(i);
        this.bb.get(bArr);
        return bArr;
    }

    public byte[] sizedByteArray() {
        return sizedByteArray(this.space, this.bb.capacity() - this.space);
    }

    public java.io.InputStream sizedInputStream() {
        finished();
        java.nio.ByteBuffer byteBufferDuplicate = this.bb.duplicate();
        byteBufferDuplicate.position(this.space);
        byteBufferDuplicate.limit(this.bb.capacity());
        return new androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferBackedInputStream(byteBufferDuplicate);
    }

    static class ByteBufferBackedInputStream extends java.io.InputStream {
        java.nio.ByteBuffer buf;

        public ByteBufferBackedInputStream(java.nio.ByteBuffer byteBuffer) {
            this.buf = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            try {
                return this.buf.get() & 255;
            } catch (java.nio.BufferUnderflowException unused) {
                return -1;
            }
        }
    }
}
