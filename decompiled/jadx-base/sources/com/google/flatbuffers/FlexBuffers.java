package com.google.flatbuffers;

/* JADX INFO: loaded from: classes5.dex */
public class FlexBuffers {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final com.google.flatbuffers.ReadBuf EMPTY_BB = new com.google.flatbuffers.ArrayReadWriteBuf(new byte[]{0}, 1);
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
    public static int indirect(com.google.flatbuffers.ReadBuf readBuf, int i, int i2) {
        return (int) (((long) i) - readUInt(readBuf, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readUInt(com.google.flatbuffers.ReadBuf readBuf, int i, int i2) {
        if (i2 == 1) {
            return com.google.flatbuffers.FlexBuffers.Unsigned.byteToUnsignedInt(readBuf.get(i));
        }
        if (i2 == 2) {
            return com.google.flatbuffers.FlexBuffers.Unsigned.shortToUnsignedInt(readBuf.getShort(i));
        }
        if (i2 == 4) {
            return com.google.flatbuffers.FlexBuffers.Unsigned.intToUnsignedLong(readBuf.getInt(i));
        }
        if (i2 != 8) {
            return -1L;
        }
        return readBuf.getLong(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readInt(com.google.flatbuffers.ReadBuf readBuf, int i, int i2) {
        return (int) readLong(readBuf, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readLong(com.google.flatbuffers.ReadBuf readBuf, int i, int i2) {
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
    public static double readDouble(com.google.flatbuffers.ReadBuf readBuf, int i, int i2) {
        if (i2 == 4) {
            return readBuf.getFloat(i);
        }
        if (i2 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i);
    }

    @java.lang.Deprecated
    public static com.google.flatbuffers.FlexBuffers.Reference getRoot(java.nio.ByteBuffer byteBuffer) {
        return getRoot(byteBuffer.hasArray() ? new com.google.flatbuffers.ArrayReadWriteBuf(byteBuffer.array(), byteBuffer.limit()) : new com.google.flatbuffers.ByteBufferReadWriteBuf(byteBuffer));
    }

    public static com.google.flatbuffers.FlexBuffers.Reference getRoot(com.google.flatbuffers.ReadBuf readBuf) {
        int iLimit = readBuf.limit() - 1;
        byte b = readBuf.get(iLimit);
        int i = iLimit - 1;
        return new com.google.flatbuffers.FlexBuffers.Reference(readBuf, i - b, b, com.google.flatbuffers.FlexBuffers.Unsigned.byteToUnsignedInt(readBuf.get(i)));
    }

    public static class Reference {
        private static final com.google.flatbuffers.FlexBuffers.Reference NULL_REFERENCE = new com.google.flatbuffers.FlexBuffers.Reference(com.google.flatbuffers.FlexBuffers.EMPTY_BB, 0, 1, 0);
        private com.google.flatbuffers.ReadBuf bb;
        private int byteWidth;
        private int end;
        private int parentWidth;
        private int type;

        Reference(com.google.flatbuffers.ReadBuf readBuf, int i, int i2, int i3) {
            this(readBuf, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        Reference(com.google.flatbuffers.ReadBuf readBuf, int i, int i2, int i3, int i4) {
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
            return com.google.flatbuffers.FlexBuffers.isTypedVector(this.type);
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
                return com.google.flatbuffers.FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
            }
            if (i == 2) {
                return (int) com.google.flatbuffers.FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (int) com.google.flatbuffers.FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                return java.lang.Integer.parseInt(asString());
            }
            if (i == 6) {
                com.google.flatbuffers.ReadBuf readBuf = this.bb;
                return com.google.flatbuffers.FlexBuffers.readInt(readBuf, com.google.flatbuffers.FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 7) {
                com.google.flatbuffers.ReadBuf readBuf2 = this.bb;
                return (int) com.google.flatbuffers.FlexBuffers.readUInt(readBuf2, com.google.flatbuffers.FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            }
            if (i == 8) {
                com.google.flatbuffers.ReadBuf readBuf3 = this.bb;
                return (int) com.google.flatbuffers.FlexBuffers.readDouble(readBuf3, com.google.flatbuffers.FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i != 26) {
                return 0;
            }
            return com.google.flatbuffers.FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
        }

        public long asUInt() {
            int i = this.type;
            if (i == 2) {
                return com.google.flatbuffers.FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            if (i == 1) {
                return com.google.flatbuffers.FlexBuffers.readLong(this.bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (long) com.google.flatbuffers.FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i == 26) {
                return com.google.flatbuffers.FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                return java.lang.Long.parseLong(asString());
            }
            if (i == 6) {
                com.google.flatbuffers.ReadBuf readBuf = this.bb;
                return com.google.flatbuffers.FlexBuffers.readLong(readBuf, com.google.flatbuffers.FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 7) {
                com.google.flatbuffers.ReadBuf readBuf2 = this.bb;
                return com.google.flatbuffers.FlexBuffers.readUInt(readBuf2, com.google.flatbuffers.FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
            }
            if (i != 8) {
                return 0L;
            }
            com.google.flatbuffers.ReadBuf readBuf3 = this.bb;
            return (long) com.google.flatbuffers.FlexBuffers.readDouble(readBuf3, com.google.flatbuffers.FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.parentWidth);
        }

        public long asLong() {
            int i = this.type;
            if (i == 1) {
                return com.google.flatbuffers.FlexBuffers.readLong(this.bb, this.end, this.parentWidth);
            }
            if (i == 2) {
                return com.google.flatbuffers.FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (long) com.google.flatbuffers.FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                try {
                    return java.lang.Long.parseLong(asString());
                } catch (java.lang.NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i == 6) {
                com.google.flatbuffers.ReadBuf readBuf = this.bb;
                return com.google.flatbuffers.FlexBuffers.readLong(readBuf, com.google.flatbuffers.FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 7) {
                com.google.flatbuffers.ReadBuf readBuf2 = this.bb;
                return com.google.flatbuffers.FlexBuffers.readUInt(readBuf2, com.google.flatbuffers.FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            }
            if (i == 8) {
                com.google.flatbuffers.ReadBuf readBuf3 = this.bb;
                return (long) com.google.flatbuffers.FlexBuffers.readDouble(readBuf3, com.google.flatbuffers.FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i != 26) {
                return 0L;
            }
            return com.google.flatbuffers.FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
        }

        public double asFloat() {
            int i = this.type;
            if (i == 3) {
                return com.google.flatbuffers.FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        return java.lang.Double.parseDouble(asString());
                    }
                    if (i == 6) {
                        com.google.flatbuffers.ReadBuf readBuf = this.bb;
                        return com.google.flatbuffers.FlexBuffers.readInt(readBuf, com.google.flatbuffers.FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                    }
                    if (i == 7) {
                        com.google.flatbuffers.ReadBuf readBuf2 = this.bb;
                        return com.google.flatbuffers.FlexBuffers.readUInt(readBuf2, com.google.flatbuffers.FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
                    }
                    if (i == 8) {
                        com.google.flatbuffers.ReadBuf readBuf3 = this.bb;
                        return com.google.flatbuffers.FlexBuffers.readDouble(readBuf3, com.google.flatbuffers.FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                    }
                    if (i == 10) {
                        return asVector().size();
                    }
                    if (i != 26) {
                        return 0.0d;
                    }
                }
                return com.google.flatbuffers.FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            return com.google.flatbuffers.FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
        }

        public com.google.flatbuffers.FlexBuffers.Key asKey() {
            if (isKey()) {
                com.google.flatbuffers.ReadBuf readBuf = this.bb;
                return new com.google.flatbuffers.FlexBuffers.Key(readBuf, com.google.flatbuffers.FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            return com.google.flatbuffers.FlexBuffers.Key.empty();
        }

        public java.lang.String asString() {
            if (isString()) {
                int iIndirect = com.google.flatbuffers.FlexBuffers.indirect(this.bb, this.end, this.parentWidth);
                com.google.flatbuffers.ReadBuf readBuf = this.bb;
                int i = this.byteWidth;
                return this.bb.getString(iIndirect, (int) com.google.flatbuffers.FlexBuffers.readUInt(readBuf, iIndirect - i, i));
            }
            if (!isKey()) {
                return "";
            }
            int iIndirect2 = com.google.flatbuffers.FlexBuffers.indirect(this.bb, this.end, this.byteWidth);
            int i2 = iIndirect2;
            while (this.bb.get(i2) != 0) {
                i2++;
            }
            return this.bb.getString(iIndirect2, i2 - iIndirect2);
        }

        public com.google.flatbuffers.FlexBuffers.Map asMap() {
            if (isMap()) {
                com.google.flatbuffers.ReadBuf readBuf = this.bb;
                return new com.google.flatbuffers.FlexBuffers.Map(readBuf, com.google.flatbuffers.FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            return com.google.flatbuffers.FlexBuffers.Map.empty();
        }

        public com.google.flatbuffers.FlexBuffers.Vector asVector() {
            if (isVector()) {
                com.google.flatbuffers.ReadBuf readBuf = this.bb;
                return new com.google.flatbuffers.FlexBuffers.Vector(readBuf, com.google.flatbuffers.FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            int i = this.type;
            if (i == 15) {
                com.google.flatbuffers.ReadBuf readBuf2 = this.bb;
                return new com.google.flatbuffers.FlexBuffers.TypedVector(readBuf2, com.google.flatbuffers.FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth, 4);
            }
            if (com.google.flatbuffers.FlexBuffers.isTypedVector(i)) {
                com.google.flatbuffers.ReadBuf readBuf3 = this.bb;
                return new com.google.flatbuffers.FlexBuffers.TypedVector(readBuf3, com.google.flatbuffers.FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth, com.google.flatbuffers.FlexBuffers.toTypedVectorElementType(this.type));
            }
            return com.google.flatbuffers.FlexBuffers.Vector.empty();
        }

        public com.google.flatbuffers.FlexBuffers.Blob asBlob() {
            if (isBlob() || isString()) {
                com.google.flatbuffers.ReadBuf readBuf = this.bb;
                return new com.google.flatbuffers.FlexBuffers.Blob(readBuf, com.google.flatbuffers.FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            return com.google.flatbuffers.FlexBuffers.Blob.empty();
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
                        throw new com.google.flatbuffers.FlexBuffers.FlexBufferException("not_implemented:" + this.type);
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
        com.google.flatbuffers.ReadBuf bb;
        int byteWidth;
        int end;

        public abstract java.lang.StringBuilder toString(java.lang.StringBuilder sb);

        Object(com.google.flatbuffers.ReadBuf readBuf, int i, int i2) {
            this.bb = readBuf;
            this.end = i;
            this.byteWidth = i2;
        }

        public java.lang.String toString() {
            return toString(new java.lang.StringBuilder(128)).toString();
        }
    }

    private static abstract class Sized extends com.google.flatbuffers.FlexBuffers.Object {
        protected final int size;

        Sized(com.google.flatbuffers.ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
            this.size = com.google.flatbuffers.FlexBuffers.readInt(this.bb, i - i2, i2);
        }

        public int size() {
            return this.size;
        }
    }

    public static class Blob extends com.google.flatbuffers.FlexBuffers.Sized {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final com.google.flatbuffers.FlexBuffers.Blob EMPTY = new com.google.flatbuffers.FlexBuffers.Blob(com.google.flatbuffers.FlexBuffers.EMPTY_BB, 1, 1);

        @Override // com.google.flatbuffers.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        Blob(com.google.flatbuffers.ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static com.google.flatbuffers.FlexBuffers.Blob empty() {
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

        @Override // com.google.flatbuffers.FlexBuffers.Object
        public java.lang.String toString() {
            return this.bb.getString(this.end, size());
        }

        @Override // com.google.flatbuffers.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder sb) {
            sb.append(kotlin.text.Typography.quote);
            sb.append(this.bb.getString(this.end, size()));
            return sb.append(kotlin.text.Typography.quote);
        }
    }

    public static class Key extends com.google.flatbuffers.FlexBuffers.Object {
        private static final com.google.flatbuffers.FlexBuffers.Key EMPTY = new com.google.flatbuffers.FlexBuffers.Key(com.google.flatbuffers.FlexBuffers.EMPTY_BB, 0, 0);

        Key(com.google.flatbuffers.ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static com.google.flatbuffers.FlexBuffers.Key empty() {
            return EMPTY;
        }

        @Override // com.google.flatbuffers.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder sb) {
            return sb.append(toString());
        }

        @Override // com.google.flatbuffers.FlexBuffers.Object
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
            if (!(obj instanceof com.google.flatbuffers.FlexBuffers.Key)) {
                return false;
            }
            com.google.flatbuffers.FlexBuffers.Key key = (com.google.flatbuffers.FlexBuffers.Key) obj;
            return key.end == this.end && key.byteWidth == this.byteWidth;
        }

        public int hashCode() {
            return this.end ^ this.byteWidth;
        }
    }

    public static class Map extends com.google.flatbuffers.FlexBuffers.Vector {
        private static final com.google.flatbuffers.FlexBuffers.Map EMPTY_MAP = new com.google.flatbuffers.FlexBuffers.Map(com.google.flatbuffers.FlexBuffers.EMPTY_BB, 1, 1);

        Map(com.google.flatbuffers.ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static com.google.flatbuffers.FlexBuffers.Map empty() {
            return EMPTY_MAP;
        }

        public com.google.flatbuffers.FlexBuffers.Reference get(java.lang.String str) {
            return get(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        }

        public com.google.flatbuffers.FlexBuffers.Reference get(byte[] bArr) {
            com.google.flatbuffers.FlexBuffers.KeyVector keyVectorKeys = keys();
            int size = keyVectorKeys.size();
            int iBinarySearch = binarySearch(keyVectorKeys, bArr);
            if (iBinarySearch < 0 || iBinarySearch >= size) {
                return com.google.flatbuffers.FlexBuffers.Reference.NULL_REFERENCE;
            }
            return get(iBinarySearch);
        }

        public com.google.flatbuffers.FlexBuffers.KeyVector keys() {
            int i = this.end - (this.byteWidth * 3);
            return new com.google.flatbuffers.FlexBuffers.KeyVector(new com.google.flatbuffers.FlexBuffers.TypedVector(this.bb, com.google.flatbuffers.FlexBuffers.indirect(this.bb, i, this.byteWidth), com.google.flatbuffers.FlexBuffers.readInt(this.bb, i + this.byteWidth, this.byteWidth), 4));
        }

        public com.google.flatbuffers.FlexBuffers.Vector values() {
            return new com.google.flatbuffers.FlexBuffers.Vector(this.bb, this.end, this.byteWidth);
        }

        @Override // com.google.flatbuffers.FlexBuffers.Vector, com.google.flatbuffers.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder sb) {
            sb.append("{ ");
            com.google.flatbuffers.FlexBuffers.KeyVector keyVectorKeys = keys();
            int size = size();
            com.google.flatbuffers.FlexBuffers.Vector vectorValues = values();
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

        private int binarySearch(com.google.flatbuffers.FlexBuffers.KeyVector keyVector, byte[] bArr) {
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

    public static class Vector extends com.google.flatbuffers.FlexBuffers.Sized {
        private static final com.google.flatbuffers.FlexBuffers.Vector EMPTY_VECTOR = new com.google.flatbuffers.FlexBuffers.Vector(com.google.flatbuffers.FlexBuffers.EMPTY_BB, 1, 1);

        @Override // com.google.flatbuffers.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // com.google.flatbuffers.FlexBuffers.Object
        public /* bridge */ /* synthetic */ java.lang.String toString() {
            return super.toString();
        }

        Vector(com.google.flatbuffers.ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static com.google.flatbuffers.FlexBuffers.Vector empty() {
            return EMPTY_VECTOR;
        }

        public boolean isEmpty() {
            return this == EMPTY_VECTOR;
        }

        @Override // com.google.flatbuffers.FlexBuffers.Object
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

        public com.google.flatbuffers.FlexBuffers.Reference get(int i) {
            long size = size();
            long j = i;
            if (j >= size) {
                return com.google.flatbuffers.FlexBuffers.Reference.NULL_REFERENCE;
            }
            return new com.google.flatbuffers.FlexBuffers.Reference(this.bb, this.end + (i * this.byteWidth), this.byteWidth, com.google.flatbuffers.FlexBuffers.Unsigned.byteToUnsignedInt(this.bb.get((int) (((long) this.end) + (size * ((long) this.byteWidth)) + j))));
        }
    }

    public static class TypedVector extends com.google.flatbuffers.FlexBuffers.Vector {
        private static final com.google.flatbuffers.FlexBuffers.TypedVector EMPTY_VECTOR = new com.google.flatbuffers.FlexBuffers.TypedVector(com.google.flatbuffers.FlexBuffers.EMPTY_BB, 1, 1, 1);
        private final int elemType;

        TypedVector(com.google.flatbuffers.ReadBuf readBuf, int i, int i2, int i3) {
            super(readBuf, i, i2);
            this.elemType = i3;
        }

        public static com.google.flatbuffers.FlexBuffers.TypedVector empty() {
            return EMPTY_VECTOR;
        }

        public boolean isEmptyVector() {
            return this == EMPTY_VECTOR;
        }

        public int getElemType() {
            return this.elemType;
        }

        @Override // com.google.flatbuffers.FlexBuffers.Vector
        public com.google.flatbuffers.FlexBuffers.Reference get(int i) {
            if (i >= size()) {
                return com.google.flatbuffers.FlexBuffers.Reference.NULL_REFERENCE;
            }
            return new com.google.flatbuffers.FlexBuffers.Reference(this.bb, this.end + (i * this.byteWidth), this.byteWidth, 1, this.elemType);
        }
    }

    public static class KeyVector {
        private final com.google.flatbuffers.FlexBuffers.TypedVector vec;

        KeyVector(com.google.flatbuffers.FlexBuffers.TypedVector typedVector) {
            this.vec = typedVector;
        }

        public com.google.flatbuffers.FlexBuffers.Key get(int i) {
            if (i >= size()) {
                return com.google.flatbuffers.FlexBuffers.Key.EMPTY;
            }
            return new com.google.flatbuffers.FlexBuffers.Key(this.vec.bb, com.google.flatbuffers.FlexBuffers.indirect(this.vec.bb, this.vec.end + (i * this.vec.byteWidth), this.vec.byteWidth), 1);
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
