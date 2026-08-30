package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public class Table {
    protected java.nio.ByteBuffer bb;
    protected int bb_pos;
    androidx.emoji2.text.flatbuffer.Utf8 utf8 = androidx.emoji2.text.flatbuffer.Utf8.getDefault();
    private int vtable_size;
    private int vtable_start;

    protected int keysCompare(java.lang.Integer num, java.lang.Integer num2, java.nio.ByteBuffer byteBuffer) {
        return 0;
    }

    public java.nio.ByteBuffer getByteBuffer() {
        return this.bb;
    }

    protected int __offset(int i) {
        if (i < this.vtable_size) {
            return this.bb.getShort(this.vtable_start + i);
        }
        return 0;
    }

    protected static int __offset(int i, int i2, java.nio.ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity() - i2;
        return byteBuffer.getShort((i + iCapacity) - byteBuffer.getInt(iCapacity)) + iCapacity;
    }

    protected int __indirect(int i) {
        return i + this.bb.getInt(i);
    }

    protected static int __indirect(int i, java.nio.ByteBuffer byteBuffer) {
        return i + byteBuffer.getInt(i);
    }

    protected java.lang.String __string(int i) {
        return __string(i, this.bb, this.utf8);
    }

    protected static java.lang.String __string(int i, java.nio.ByteBuffer byteBuffer, androidx.emoji2.text.flatbuffer.Utf8 utf8) {
        int i2 = i + byteBuffer.getInt(i);
        return utf8.decodeUtf8(byteBuffer, i2 + 4, byteBuffer.getInt(i2));
    }

    protected int __vector_len(int i) {
        int i2 = i + this.bb_pos;
        return this.bb.getInt(i2 + this.bb.getInt(i2));
    }

    protected int __vector(int i) {
        int i2 = i + this.bb_pos;
        return i2 + this.bb.getInt(i2) + 4;
    }

    protected java.nio.ByteBuffer __vector_as_bytebuffer(int i, int i2) {
        int i__offset = __offset(i);
        if (i__offset == 0) {
            return null;
        }
        java.nio.ByteBuffer byteBufferOrder = this.bb.duplicate().order(java.nio.ByteOrder.LITTLE_ENDIAN);
        int i__vector = __vector(i__offset);
        byteBufferOrder.position(i__vector);
        byteBufferOrder.limit(i__vector + (__vector_len(i__offset) * i2));
        return byteBufferOrder;
    }

    protected java.nio.ByteBuffer __vector_in_bytebuffer(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        int i__offset = __offset(i);
        if (i__offset == 0) {
            return null;
        }
        int i__vector = __vector(i__offset);
        byteBuffer.rewind();
        byteBuffer.limit((__vector_len(i__offset) * i2) + i__vector);
        byteBuffer.position(i__vector);
        return byteBuffer;
    }

    protected androidx.emoji2.text.flatbuffer.Table __union(androidx.emoji2.text.flatbuffer.Table table, int i) {
        return __union(table, i, this.bb);
    }

    protected static androidx.emoji2.text.flatbuffer.Table __union(androidx.emoji2.text.flatbuffer.Table table, int i, java.nio.ByteBuffer byteBuffer) {
        table.__reset(__indirect(i, byteBuffer), byteBuffer);
        return table;
    }

    protected static boolean __has_identifier(java.nio.ByteBuffer byteBuffer, java.lang.String str) {
        if (str.length() != 4) {
            throw new java.lang.AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i = 0; i < 4; i++) {
            if (str.charAt(i) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i))) {
                return false;
            }
        }
        return true;
    }

    protected void sortTables(int[] iArr, final java.nio.ByteBuffer byteBuffer) {
        java.lang.Integer[] numArr = new java.lang.Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = java.lang.Integer.valueOf(iArr[i]);
        }
        java.util.Arrays.sort(numArr, new java.util.Comparator<java.lang.Integer>() { // from class: androidx.emoji2.text.flatbuffer.Table.1
            @Override // java.util.Comparator
            public int compare(java.lang.Integer num, java.lang.Integer num2) {
                return androidx.emoji2.text.flatbuffer.Table.this.keysCompare(num, num2, byteBuffer);
            }
        });
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
    }

    protected static int compareStrings(int i, int i2, java.nio.ByteBuffer byteBuffer) {
        int i3 = i + byteBuffer.getInt(i);
        int i4 = i2 + byteBuffer.getInt(i2);
        int i5 = byteBuffer.getInt(i3);
        int i6 = byteBuffer.getInt(i4);
        int i7 = i3 + 4;
        int i8 = i4 + 4;
        int iMin = java.lang.Math.min(i5, i6);
        for (int i9 = 0; i9 < iMin; i9++) {
            int i10 = i9 + i7;
            int i11 = i9 + i8;
            if (byteBuffer.get(i10) != byteBuffer.get(i11)) {
                return byteBuffer.get(i10) - byteBuffer.get(i11);
            }
        }
        return i5 - i6;
    }

    protected static int compareStrings(int i, byte[] bArr, java.nio.ByteBuffer byteBuffer) {
        int i2 = i + byteBuffer.getInt(i);
        int i3 = byteBuffer.getInt(i2);
        int length = bArr.length;
        int i4 = i2 + 4;
        int iMin = java.lang.Math.min(i3, length);
        for (int i5 = 0; i5 < iMin; i5++) {
            int i6 = i5 + i4;
            if (byteBuffer.get(i6) != bArr[i5]) {
                return byteBuffer.get(i6) - bArr[i5];
            }
        }
        return i3 - length;
    }

    protected void __reset(int i, java.nio.ByteBuffer byteBuffer) {
        this.bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i;
            int i2 = i - byteBuffer.getInt(i);
            this.vtable_start = i2;
            this.vtable_size = this.bb.getShort(i2);
            return;
        }
        this.bb_pos = 0;
        this.vtable_start = 0;
        this.vtable_size = 0;
    }

    public void __reset() {
        __reset(0, null);
    }
}
