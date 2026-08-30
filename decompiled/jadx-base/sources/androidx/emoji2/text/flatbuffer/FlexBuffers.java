package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public class FlexBuffers {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final androidx.emoji2.text.flatbuffer.ReadBuf EMPTY_BB = new androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf(new byte[]{0}, 1);
    public static final int FBT_BLOB = 25;
    public static final int FBT_BOOL = 26;
    public static final int FBT_FLOAT = 3;
    public static final int FBT_INDIRECT_FLOAT = 8;
    public static final int FBT_INDIRECT_INT = 6;
    public static final int FBT_INDIRECT_UINT = 7;
    public static final int FBT_INT = 1;
    public static final int FBT_KEY = 4;
    public static final int FBT_MAP = 9;
    public static final int FBT_NULL = 0;
    public static final int FBT_STRING = 5;
    public static final int FBT_UINT = 2;
    public static final int FBT_VECTOR = 10;
    public static final int FBT_VECTOR_BOOL = 36;
    public static final int FBT_VECTOR_FLOAT = 13;
    public static final int FBT_VECTOR_FLOAT2 = 18;
    public static final int FBT_VECTOR_FLOAT3 = 21;
    public static final int FBT_VECTOR_FLOAT4 = 24;
    public static final int FBT_VECTOR_INT = 11;
    public static final int FBT_VECTOR_INT2 = 16;
    public static final int FBT_VECTOR_INT3 = 19;
    public static final int FBT_VECTOR_INT4 = 22;
    public static final int FBT_VECTOR_KEY = 14;
    public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
    public static final int FBT_VECTOR_UINT = 12;
    public static final int FBT_VECTOR_UINT2 = 17;
    public static final int FBT_VECTOR_UINT3 = 20;
    public static final int FBT_VECTOR_UINT4 = 23;

    static boolean isTypeInline(int i) {
        return i <= 3 || i == 26;
    }

    static boolean isTypedVector(int i) {
        return (i >= 11 && i <= 15) || i == 36;
    }

    static boolean isTypedVectorElementType(int i) {
        return (i >= 1 && i <= 4) || i == 26;
    }

    static int toTypedVector(int i, int i2) {
        if (i2 == 0) {
            return (i - 1) + 11;
        }
        if (i2 == 2) {
            return (i - 1) + 16;
        }
        if (i2 == 3) {
            return (i - 1) + 19;
        }
        if (i2 != 4) {
            return 0;
        }
        return (i - 1) + 22;
    }

    static int toTypedVectorElementType(int i) {
        return (i - 11) + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indirect(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
        return (int) (((long) i) - readUInt(readBuf, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readUInt(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
        if (i2 == 1) {
            return androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.byteToUnsignedInt(readBuf.get(i));
        }
        if (i2 == 2) {
            return androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.shortToUnsignedInt(readBuf.getShort(i));
        }
        if (i2 == 4) {
            return androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.intToUnsignedLong(readBuf.getInt(i));
        }
        if (i2 != 8) {
            return -1L;
        }
        return readBuf.getLong(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readInt(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
        return (int) readLong(readBuf, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readLong(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = readBuf.get(i);
        } else if (i2 == 2) {
            i3 = readBuf.getShort(i);
        } else {
            if (i2 != 4) {
                if (i2 != 8) {
                    return -1L;
                }
                return readBuf.getLong(i);
            }
            i3 = readBuf.getInt(i);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double readDouble(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
        if (i2 == 4) {
            return readBuf.getFloat(i);
        }
        if (i2 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i);
    }

    @java.lang.Deprecated
    public static androidx.emoji2.text.flatbuffer.FlexBuffers.Reference getRoot(java.nio.ByteBuffer byteBuffer) {
        return getRoot(byteBuffer.hasArray() ? new androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf(byteBuffer.array(), byteBuffer.limit()) : new androidx.emoji2.text.flatbuffer.ByteBufferReadWriteBuf(byteBuffer));
    }

    public static androidx.emoji2.text.flatbuffer.FlexBuffers.Reference getRoot(androidx.emoji2.text.flatbuffer.ReadBuf readBuf) {
        int iLimit = readBuf.limit() - 1;
        byte b = readBuf.get(iLimit);
        int i = iLimit - 1;
        return new androidx.emoji2.text.flatbuffer.FlexBuffers.Reference(readBuf, i - b, b, androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.byteToUnsignedInt(readBuf.get(i)));
    }

    public static class Reference {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.Reference NULL_REFERENCE = new androidx.emoji2.text.flatbuffer.FlexBuffers.Reference(androidx.emoji2.text.flatbuffer.FlexBuffers.EMPTY_BB, 0, 1, 0);
        private androidx.emoji2.text.flatbuffer.ReadBuf bb;
        private int byteWidth;
        private int end;
        private int parentWidth;
        private int type;

        Reference(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2, int i3) {
            this(readBuf, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        Reference(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2, int i3, int i4) {
            this.bb = readBuf;
            this.end = i;
            this.parentWidth = i2;
            this.byteWidth = i3;
            this.type = i4;
        }

        public int getType() {
            return this.type;
        }

        public boolean isNull() {
            return this.type == 0;
        }

        public boolean isBoolean() {
            return this.type == 26;
        }

        public boolean isNumeric() {
            return isIntOrUInt() || isFloat();
        }

        public boolean isIntOrUInt() {
            return isInt() || isUInt();
        }

        public boolean isFloat() {
            int i = this.type;
            return i == 3 || i == 8;
        }

        public boolean isInt() {
            int i = this.type;
            return i == 1 || i == 6;
        }

        public boolean isUInt() {
            int i = this.type;
            return i == 2 || i == 7;
        }

        public boolean isString() {
            return this.type == 5;
        }

        public boolean isKey() {
            return this.type == 4;
        }

        public boolean isVector() {
            int i = this.type;
            return i == 10 || i == 9;
        }

        public boolean isTypedVector() {
            return androidx.emoji2.text.flatbuffer.FlexBuffers.isTypedVector(this.type);
        }

        public boolean isMap() {
            return this.type == 9;
        }

        public boolean isBlob() {
            return this.type == 25;
        }

        public int asInt() {
            int i = this.type;
            if (i == 1) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
            }
            if (i == 2) {
                return (int) androidx.emoji2.text.flatbuffer.FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (int) androidx.emoji2.text.flatbuffer.FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                return java.lang.Integer.parseInt(asString());
            }
            if (i == 6) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.bb;
                return androidx.emoji2.text.flatbuffer.FlexBuffers.readInt(readBuf, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 7) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf2 = this.bb;
                return (int) androidx.emoji2.text.flatbuffer.FlexBuffers.readUInt(readBuf2, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            }
            if (i == 8) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf3 = this.bb;
                return (int) androidx.emoji2.text.flatbuffer.FlexBuffers.readDouble(readBuf3, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i != 26) {
                return 0;
            }
            return androidx.emoji2.text.flatbuffer.FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
        }

        public long asUInt() {
            int i = this.type;
            if (i == 2) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            if (i == 1) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.readLong(this.bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (long) androidx.emoji2.text.flatbuffer.FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i == 26) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                return java.lang.Long.parseLong(asString());
            }
            if (i == 6) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.bb;
                return androidx.emoji2.text.flatbuffer.FlexBuffers.readLong(readBuf, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 7) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf2 = this.bb;
                return androidx.emoji2.text.flatbuffer.FlexBuffers.readUInt(readBuf2, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
            }
            if (i != 8) {
                return 0L;
            }
            androidx.emoji2.text.flatbuffer.ReadBuf readBuf3 = this.bb;
            return (long) androidx.emoji2.text.flatbuffer.FlexBuffers.readDouble(readBuf3, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.parentWidth);
        }

        public long asLong() {
            int i = this.type;
            if (i == 1) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.readLong(this.bb, this.end, this.parentWidth);
            }
            if (i == 2) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (long) androidx.emoji2.text.flatbuffer.FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                try {
                    return java.lang.Long.parseLong(asString());
                } catch (java.lang.NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i == 6) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.bb;
                return androidx.emoji2.text.flatbuffer.FlexBuffers.readLong(readBuf, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 7) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf2 = this.bb;
                return androidx.emoji2.text.flatbuffer.FlexBuffers.readUInt(readBuf2, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            }
            if (i == 8) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf3 = this.bb;
                return (long) androidx.emoji2.text.flatbuffer.FlexBuffers.readDouble(readBuf3, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i != 26) {
                return 0L;
            }
            return androidx.emoji2.text.flatbuffer.FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
        }

        public double asFloat() {
            int i = this.type;
            if (i == 3) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        return java.lang.Double.parseDouble(asString());
                    }
                    if (i == 6) {
                        androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.bb;
                        return androidx.emoji2.text.flatbuffer.FlexBuffers.readInt(readBuf, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                    }
                    if (i == 7) {
                        androidx.emoji2.text.flatbuffer.ReadBuf readBuf2 = this.bb;
                        return androidx.emoji2.text.flatbuffer.FlexBuffers.readUInt(readBuf2, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
                    }
                    if (i == 8) {
                        androidx.emoji2.text.flatbuffer.ReadBuf readBuf3 = this.bb;
                        return androidx.emoji2.text.flatbuffer.FlexBuffers.readDouble(readBuf3, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                    }
                    if (i == 10) {
                        return asVector().size();
                    }
                    if (i != 26) {
                        return 0.0d;
                    }
                }
                return androidx.emoji2.text.flatbuffer.FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            return androidx.emoji2.text.flatbuffer.FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Key asKey() {
            if (isKey()) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.bb;
                return new androidx.emoji2.text.flatbuffer.FlexBuffers.Key(readBuf, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            return androidx.emoji2.text.flatbuffer.FlexBuffers.Key.empty();
        }

        public java.lang.String asString() {
            if (isString()) {
                int iIndirect = androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(this.bb, this.end, this.parentWidth);
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.bb;
                int i = this.byteWidth;
                return this.bb.getString(iIndirect, (int) androidx.emoji2.text.flatbuffer.FlexBuffers.readUInt(readBuf, iIndirect - i, i));
            }
            if (!isKey()) {
                return "";
            }
            int iIndirect2 = androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(this.bb, this.end, this.byteWidth);
            int i2 = iIndirect2;
            while (this.bb.get(i2) != 0) {
                i2++;
            }
            return this.bb.getString(iIndirect2, i2 - iIndirect2);
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Map asMap() {
            if (isMap()) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.bb;
                return new androidx.emoji2.text.flatbuffer.FlexBuffers.Map(readBuf, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            return androidx.emoji2.text.flatbuffer.FlexBuffers.Map.empty();
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Vector asVector() {
            if (isVector()) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.bb;
                return new androidx.emoji2.text.flatbuffer.FlexBuffers.Vector(readBuf, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            int i = this.type;
            if (i == 15) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf2 = this.bb;
                return new androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector(readBuf2, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth, 4);
            }
            if (androidx.emoji2.text.flatbuffer.FlexBuffers.isTypedVector(i)) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf3 = this.bb;
                return new androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector(readBuf3, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth, androidx.emoji2.text.flatbuffer.FlexBuffers.toTypedVectorElementType(this.type));
            }
            return androidx.emoji2.text.flatbuffer.FlexBuffers.Vector.empty();
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Blob asBlob() {
            if (isBlob() || isString()) {
                androidx.emoji2.text.flatbuffer.ReadBuf readBuf = this.bb;
                return new androidx.emoji2.text.flatbuffer.FlexBuffers.Blob(readBuf, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            return androidx.emoji2.text.flatbuffer.FlexBuffers.Blob.empty();
        }

        public boolean asBoolean() {
            if (isBoolean()) {
                return this.bb.get(this.end) != 0;
            }
            return asUInt() != 0;
        }

        public java.lang.String toString() {
            return toString(new java.lang.StringBuilder(128)).toString();
        }

        java.lang.StringBuilder toString(java.lang.StringBuilder sb) {
            int i = this.type;
            if (i != 36) {
                switch (i) {
                    case 0:
                        return sb.append("null");
                    case 1:
                    case 6:
                        return sb.append(asLong());
                    case 2:
                    case 7:
                        return sb.append(asUInt());
                    case 3:
                    case 8:
                        return sb.append(asFloat());
                    case 4:
                        return asKey().toString(sb.append(kotlin.text.Typography.quote)).append(kotlin.text.Typography.quote);
                    case 5:
                        return sb.append(kotlin.text.Typography.quote).append(asString()).append(kotlin.text.Typography.quote);
                    case 9:
                        return asMap().toString(sb);
                    case 10:
                        return asVector().toString(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new androidx.emoji2.text.flatbuffer.FlexBuffers.FlexBufferException("not_implemented:" + this.type);
                    case 25:
                        return asBlob().toString(sb);
                    case 26:
                        return sb.append(asBoolean());
                    default:
                        return sb;
                }
            }
            return sb.append(asVector());
        }
    }

    private static abstract class Object {
        androidx.emoji2.text.flatbuffer.ReadBuf bb;
        int byteWidth;
        int end;

        public abstract java.lang.StringBuilder toString(java.lang.StringBuilder sb);

        Object(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
            this.bb = readBuf;
            this.end = i;
            this.byteWidth = i2;
        }

        public java.lang.String toString() {
            return toString(new java.lang.StringBuilder(128)).toString();
        }
    }

    private static abstract class Sized extends androidx.emoji2.text.flatbuffer.FlexBuffers.Object {
        protected final int size;

        Sized(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
            this.size = androidx.emoji2.text.flatbuffer.FlexBuffers.readInt(this.bb, i - i2, i2);
        }

        public int size() {
            return this.size;
        }
    }

    public static class Blob extends androidx.emoji2.text.flatbuffer.FlexBuffers.Sized {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final androidx.emoji2.text.flatbuffer.FlexBuffers.Blob EMPTY = new androidx.emoji2.text.flatbuffer.FlexBuffers.Blob(androidx.emoji2.text.flatbuffer.FlexBuffers.EMPTY_BB, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        Blob(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.Blob empty() {
            return EMPTY;
        }

        public java.nio.ByteBuffer data() {
            java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(this.bb.data());
            byteBufferWrap.position(this.end);
            byteBufferWrap.limit(this.end + size());
            return byteBufferWrap.asReadOnlyBuffer().slice();
        }

        public byte[] getBytes() {
            int size = size();
            byte[] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                bArr[i] = this.bb.get(this.end + i);
            }
            return bArr;
        }

        public byte get(int i) {
            return this.bb.get(this.end + i);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.String toString() {
            return this.bb.getString(this.end, size());
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder sb) {
            sb.append(kotlin.text.Typography.quote);
            sb.append(this.bb.getString(this.end, size()));
            return sb.append(kotlin.text.Typography.quote);
        }
    }

    public static class Key extends androidx.emoji2.text.flatbuffer.FlexBuffers.Object {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.Key EMPTY = new androidx.emoji2.text.flatbuffer.FlexBuffers.Key(androidx.emoji2.text.flatbuffer.FlexBuffers.EMPTY_BB, 0, 0);

        Key(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.Key empty() {
            return EMPTY;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder sb) {
            return sb.append(toString());
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.String toString() {
            int i = this.end;
            while (this.bb.get(i) != 0) {
                i++;
            }
            return this.bb.getString(this.end, i - this.end);
        }

        int compareTo(byte[] bArr) {
            byte b;
            byte b2;
            int i = this.end;
            int i2 = 0;
            do {
                b = this.bb.get(i);
                b2 = bArr[i2];
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
                if (i2 == bArr.length) {
                    return b - b2;
                }
            } while (b == b2);
            return b - b2;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.emoji2.text.flatbuffer.FlexBuffers.Key)) {
                return false;
            }
            androidx.emoji2.text.flatbuffer.FlexBuffers.Key key = (androidx.emoji2.text.flatbuffer.FlexBuffers.Key) obj;
            return key.end == this.end && key.byteWidth == this.byteWidth;
        }

        public int hashCode() {
            return this.end ^ this.byteWidth;
        }
    }

    public static class Map extends androidx.emoji2.text.flatbuffer.FlexBuffers.Vector {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.Map EMPTY_MAP = new androidx.emoji2.text.flatbuffer.FlexBuffers.Map(androidx.emoji2.text.flatbuffer.FlexBuffers.EMPTY_BB, 1, 1);

        Map(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.Map empty() {
            return EMPTY_MAP;
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Reference get(java.lang.String str) {
            return get(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Reference get(byte[] bArr) {
            androidx.emoji2.text.flatbuffer.FlexBuffers.KeyVector keyVectorKeys = keys();
            int size = keyVectorKeys.size();
            int iBinarySearch = binarySearch(keyVectorKeys, bArr);
            if (iBinarySearch < 0 || iBinarySearch >= size) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.Reference.NULL_REFERENCE;
            }
            return get(iBinarySearch);
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.KeyVector keys() {
            int i = this.end - (this.byteWidth * 3);
            return new androidx.emoji2.text.flatbuffer.FlexBuffers.KeyVector(new androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector(this.bb, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(this.bb, i, this.byteWidth), androidx.emoji2.text.flatbuffer.FlexBuffers.readInt(this.bb, i + this.byteWidth, this.byteWidth), 4));
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Vector values() {
            return new androidx.emoji2.text.flatbuffer.FlexBuffers.Vector(this.bb, this.end, this.byteWidth);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder sb) {
            sb.append("{ ");
            androidx.emoji2.text.flatbuffer.FlexBuffers.KeyVector keyVectorKeys = keys();
            int size = size();
            androidx.emoji2.text.flatbuffer.FlexBuffers.Vector vectorValues = values();
            for (int i = 0; i < size; i++) {
                sb.append(kotlin.text.Typography.quote).append(keyVectorKeys.get(i).toString()).append("\" : ");
                sb.append(vectorValues.get(i).toString());
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        private int binarySearch(androidx.emoji2.text.flatbuffer.FlexBuffers.KeyVector keyVector, byte[] bArr) {
            int size = keyVector.size() - 1;
            int i = 0;
            while (i <= size) {
                int i2 = (i + size) >>> 1;
                int iCompareTo = keyVector.get(i2).compareTo(bArr);
                if (iCompareTo < 0) {
                    i = i2 + 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i2;
                    }
                    size = i2 - 1;
                }
            }
            return -(i + 1);
        }
    }

    public static class Vector extends androidx.emoji2.text.flatbuffer.FlexBuffers.Sized {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.Vector EMPTY_VECTOR = new androidx.emoji2.text.flatbuffer.FlexBuffers.Vector(androidx.emoji2.text.flatbuffer.FlexBuffers.EMPTY_BB, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public /* bridge */ /* synthetic */ java.lang.String toString() {
            return super.toString();
        }

        Vector(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.Vector empty() {
            return EMPTY_VECTOR;
        }

        public boolean isEmpty() {
            return this == EMPTY_VECTOR;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder sb) {
            sb.append("[ ");
            int size = size();
            for (int i = 0; i < size; i++) {
                get(i).toString(sb);
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Reference get(int i) {
            long size = size();
            long j = i;
            if (j >= size) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.Reference.NULL_REFERENCE;
            }
            return new androidx.emoji2.text.flatbuffer.FlexBuffers.Reference(this.bb, this.end + (i * this.byteWidth), this.byteWidth, androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.byteToUnsignedInt(this.bb.get((int) (((long) this.end) + (size * ((long) this.byteWidth)) + j))));
        }
    }

    public static class TypedVector extends androidx.emoji2.text.flatbuffer.FlexBuffers.Vector {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector EMPTY_VECTOR = new androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector(androidx.emoji2.text.flatbuffer.FlexBuffers.EMPTY_BB, 1, 1, 1);
        private final int elemType;

        TypedVector(androidx.emoji2.text.flatbuffer.ReadBuf readBuf, int i, int i2, int i3) {
            super(readBuf, i, i2);
            this.elemType = i3;
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector empty() {
            return EMPTY_VECTOR;
        }

        public boolean isEmptyVector() {
            return this == EMPTY_VECTOR;
        }

        public int getElemType() {
            return this.elemType;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public androidx.emoji2.text.flatbuffer.FlexBuffers.Reference get(int i) {
            if (i >= size()) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.Reference.NULL_REFERENCE;
            }
            return new androidx.emoji2.text.flatbuffer.FlexBuffers.Reference(this.bb, this.end + (i * this.byteWidth), this.byteWidth, 1, this.elemType);
        }
    }

    public static class KeyVector {
        private final androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector vec;

        KeyVector(androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector typedVector) {
            this.vec = typedVector;
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Key get(int i) {
            if (i >= size()) {
                return androidx.emoji2.text.flatbuffer.FlexBuffers.Key.EMPTY;
            }
            return new androidx.emoji2.text.flatbuffer.FlexBuffers.Key(this.vec.bb, androidx.emoji2.text.flatbuffer.FlexBuffers.indirect(this.vec.bb, this.vec.end + (i * this.vec.byteWidth), this.vec.byteWidth), 1);
        }

        public int size() {
            return this.vec.size();
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append('[');
            for (int i = 0; i < this.vec.size(); i++) {
                this.vec.get(i).toString(sb);
                if (i != this.vec.size() - 1) {
                    sb.append(", ");
                }
            }
            return sb.append(com.ironsource.y8.i.e).toString();
        }
    }

    public static class FlexBufferException extends java.lang.RuntimeException {
        FlexBufferException(java.lang.String str) {
            super(str);
        }
    }

    static class Unsigned {
        static int byteToUnsignedInt(byte b) {
            return b & 255;
        }

        static long intToUnsignedLong(int i) {
            return ((long) i) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE;
        }

        static int shortToUnsignedInt(short s) {
            return s & kotlin.UShort.MAX_VALUE;
        }

        Unsigned() {
        }
    }
}
