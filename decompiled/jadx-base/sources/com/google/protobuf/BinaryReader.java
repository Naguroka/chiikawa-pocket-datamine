package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
abstract class BinaryReader implements com.google.protobuf.Reader {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;

    public abstract int getTotalBytesRead();

    @Override // com.google.protobuf.Reader
    public boolean shouldDiscardUnknownFields() {
        return false;
    }

    /* synthetic */ BinaryReader(com.google.protobuf.BinaryReader.AnonymousClass1 anonymousClass1) {
        this();
    }

    public static com.google.protobuf.BinaryReader newInstance(java.nio.ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new com.google.protobuf.BinaryReader.SafeHeapReader(byteBuffer, z);
        }
        throw new java.lang.IllegalArgumentException("Direct buffers not yet supported");
    }

    private BinaryReader() {
    }

    private static final class SafeHeapReader extends com.google.protobuf.BinaryReader {
        private final byte[] buffer;
        private final boolean bufferIsImmutable;
        private int endGroupTag;
        private final int initialPos;
        private int limit;
        private int pos;
        private int tag;

        public SafeHeapReader(java.nio.ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.bufferIsImmutable = z;
            this.buffer = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.pos = iArrayOffset;
            this.initialPos = iArrayOffset;
            this.limit = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean isAtEnd() {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.BinaryReader
        public int getTotalBytesRead() {
            return this.pos - this.initialPos;
        }

        @Override // com.google.protobuf.Reader
        public int getFieldNumber() throws java.io.IOException {
            if (isAtEnd()) {
                return Integer.MAX_VALUE;
            }
            int varint32 = readVarint32();
            this.tag = varint32;
            if (varint32 == this.endGroupTag) {
                return Integer.MAX_VALUE;
            }
            return com.google.protobuf.WireFormat.getTagFieldNumber(varint32);
        }

        @Override // com.google.protobuf.Reader
        public int getTag() {
            return this.tag;
        }

        @Override // com.google.protobuf.Reader
        public boolean skipField() throws java.io.IOException {
            int i;
            if (isAtEnd() || (i = this.tag) == this.endGroupTag) {
                return false;
            }
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                skipVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipBytes(readVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipGroup();
                return true;
            }
            if (tagWireType == 5) {
                skipBytes(4);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.Reader
        public double readDouble() throws java.io.IOException {
            requireWireType(1);
            return java.lang.Double.longBitsToDouble(readLittleEndian64());
        }

        @Override // com.google.protobuf.Reader
        public float readFloat() throws java.io.IOException {
            requireWireType(5);
            return java.lang.Float.intBitsToFloat(readLittleEndian32());
        }

        @Override // com.google.protobuf.Reader
        public long readUInt64() throws java.io.IOException {
            requireWireType(0);
            return readVarint64();
        }

        @Override // com.google.protobuf.Reader
        public long readInt64() throws java.io.IOException {
            requireWireType(0);
            return readVarint64();
        }

        @Override // com.google.protobuf.Reader
        public int readInt32() throws java.io.IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // com.google.protobuf.Reader
        public long readFixed64() throws java.io.IOException {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // com.google.protobuf.Reader
        public int readFixed32() throws java.io.IOException {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // com.google.protobuf.Reader
        public boolean readBool() throws java.io.IOException {
            requireWireType(0);
            return readVarint32() != 0;
        }

        @Override // com.google.protobuf.Reader
        public java.lang.String readString() throws java.io.IOException {
            return readStringInternal(false);
        }

        @Override // com.google.protobuf.Reader
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
            return readStringInternal(true);
        }

        public java.lang.String readStringInternal(boolean z) throws java.io.IOException {
            requireWireType(2);
            int varint32 = readVarint32();
            if (varint32 == 0) {
                return "";
            }
            requireBytes(varint32);
            if (z) {
                byte[] bArr = this.buffer;
                int i = this.pos;
                if (!com.google.protobuf.Utf8.isValidUtf8(bArr, i, i + varint32)) {
                    throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                }
            }
            java.lang.String str = new java.lang.String(this.buffer, this.pos, varint32, com.google.protobuf.Internal.UTF_8);
            this.pos += varint32;
            return str;
        }

        @Override // com.google.protobuf.Reader
        public <T> T readMessage(java.lang.Class<T> cls, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            requireWireType(2);
            return (T) readMessage(com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) cls), extensionRegistryLite);
        }

        @Override // com.google.protobuf.Reader
        public <T> T readMessageBySchemaWithCheck(com.google.protobuf.Schema<T> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            requireWireType(2);
            return (T) readMessage(schema, extensionRegistryLite);
        }

        private <T> T readMessage(com.google.protobuf.Schema<T> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            T tNewInstance = schema.newInstance();
            mergeMessageField(tNewInstance, schema, extensionRegistryLite);
            schema.makeImmutable(tNewInstance);
            return tNewInstance;
        }

        @Override // com.google.protobuf.Reader
        public <T> void mergeMessageField(T t, com.google.protobuf.Schema<T> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int varint32 = readVarint32();
            requireBytes(varint32);
            int i = this.limit;
            int i2 = this.pos + varint32;
            this.limit = i2;
            try {
                schema.mergeFrom(t, this, extensionRegistryLite);
                if (this.pos != i2) {
                    throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
                }
                this.limit = i;
            } catch (java.lang.Throwable th) {
                this.limit = i;
                throw th;
            }
        }

        @Override // com.google.protobuf.Reader
        @java.lang.Deprecated
        public <T> T readGroup(java.lang.Class<T> cls, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            requireWireType(3);
            return (T) readGroup(com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) cls), extensionRegistryLite);
        }

        @Override // com.google.protobuf.Reader
        @java.lang.Deprecated
        public <T> T readGroupBySchemaWithCheck(com.google.protobuf.Schema<T> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            requireWireType(3);
            return (T) readGroup(schema, extensionRegistryLite);
        }

        private <T> T readGroup(com.google.protobuf.Schema<T> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            T tNewInstance = schema.newInstance();
            mergeGroupField(tNewInstance, schema, extensionRegistryLite);
            schema.makeImmutable(tNewInstance);
            return tNewInstance;
        }

        @Override // com.google.protobuf.Reader
        public <T> void mergeGroupField(T t, com.google.protobuf.Schema<T> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int i = this.endGroupTag;
            this.endGroupTag = com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(this.tag), 4);
            try {
                schema.mergeFrom(t, this, extensionRegistryLite);
                if (this.tag != this.endGroupTag) {
                    throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
                }
                this.endGroupTag = i;
            } catch (java.lang.Throwable th) {
                this.endGroupTag = i;
                throw th;
            }
        }

        @Override // com.google.protobuf.Reader
        public com.google.protobuf.ByteString readBytes() throws java.io.IOException {
            com.google.protobuf.ByteString byteStringCopyFrom;
            requireWireType(2);
            int varint32 = readVarint32();
            if (varint32 == 0) {
                return com.google.protobuf.ByteString.EMPTY;
            }
            requireBytes(varint32);
            if (this.bufferIsImmutable) {
                byteStringCopyFrom = com.google.protobuf.ByteString.wrap(this.buffer, this.pos, varint32);
            } else {
                byteStringCopyFrom = com.google.protobuf.ByteString.copyFrom(this.buffer, this.pos, varint32);
            }
            this.pos += varint32;
            return byteStringCopyFrom;
        }

        @Override // com.google.protobuf.Reader
        public int readUInt32() throws java.io.IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // com.google.protobuf.Reader
        public int readEnum() throws java.io.IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // com.google.protobuf.Reader
        public int readSFixed32() throws java.io.IOException {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // com.google.protobuf.Reader
        public long readSFixed64() throws java.io.IOException {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // com.google.protobuf.Reader
        public int readSInt32() throws java.io.IOException {
            requireWireType(0);
            return com.google.protobuf.CodedInputStream.decodeZigZag32(readVarint32());
        }

        @Override // com.google.protobuf.Reader
        public long readSInt64() throws java.io.IOException {
            requireWireType(0);
            return com.google.protobuf.CodedInputStream.decodeZigZag64(readVarint64());
        }

        @Override // com.google.protobuf.Reader
        public void readDoubleList(java.util.List<java.lang.Double> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.protobuf.DoubleArrayList) {
                com.google.protobuf.DoubleArrayList doubleArrayList = (com.google.protobuf.DoubleArrayList) list;
                int tagWireType = com.google.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 1) {
                    do {
                        doubleArrayList.addDouble(readDouble());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed64Length(varint32);
                    int i3 = this.pos + varint32;
                    while (this.pos < i3) {
                        doubleArrayList.addDouble(java.lang.Double.longBitsToDouble(readLittleEndian64_NoCheck()));
                    }
                    return;
                }
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 1) {
                do {
                    list.add(java.lang.Double.valueOf(readDouble()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            if (tagWireType2 == 2) {
                int varint33 = readVarint32();
                verifyPackedFixed64Length(varint33);
                int i4 = this.pos + varint33;
                while (this.pos < i4) {
                    list.add(java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(readLittleEndian64_NoCheck())));
                }
                return;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.Reader
        public void readFloatList(java.util.List<java.lang.Float> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.protobuf.FloatArrayList) {
                com.google.protobuf.FloatArrayList floatArrayList = (com.google.protobuf.FloatArrayList) list;
                int tagWireType = com.google.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed32Length(varint32);
                    int i3 = this.pos + varint32;
                    while (this.pos < i3) {
                        floatArrayList.addFloat(java.lang.Float.intBitsToFloat(readLittleEndian32_NoCheck()));
                    }
                    return;
                }
                if (tagWireType == 5) {
                    do {
                        floatArrayList.addFloat(readFloat());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 2) {
                int varint33 = readVarint32();
                verifyPackedFixed32Length(varint33);
                int i4 = this.pos + varint33;
                while (this.pos < i4) {
                    list.add(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(readLittleEndian32_NoCheck())));
                }
                return;
            }
            if (tagWireType2 == 5) {
                do {
                    list.add(java.lang.Float.valueOf(readFloat()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.Reader
        public void readUInt64List(java.util.List<java.lang.Long> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.protobuf.LongArrayList) {
                com.google.protobuf.LongArrayList longArrayList = (com.google.protobuf.LongArrayList) list;
                int tagWireType = com.google.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 0) {
                    do {
                        longArrayList.addLong(readUInt64());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                if (tagWireType == 2) {
                    int varint32 = this.pos + readVarint32();
                    while (this.pos < varint32) {
                        longArrayList.addLong(readVarint64());
                    }
                    requirePosition(varint32);
                    return;
                }
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 0) {
                do {
                    list.add(java.lang.Long.valueOf(readUInt64()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            if (tagWireType2 == 2) {
                int varint33 = this.pos + readVarint32();
                while (this.pos < varint33) {
                    list.add(java.lang.Long.valueOf(readVarint64()));
                }
                requirePosition(varint33);
                return;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.Reader
        public void readInt64List(java.util.List<java.lang.Long> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.protobuf.LongArrayList) {
                com.google.protobuf.LongArrayList longArrayList = (com.google.protobuf.LongArrayList) list;
                int tagWireType = com.google.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 0) {
                    do {
                        longArrayList.addLong(readInt64());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                if (tagWireType == 2) {
                    int varint32 = this.pos + readVarint32();
                    while (this.pos < varint32) {
                        longArrayList.addLong(readVarint64());
                    }
                    requirePosition(varint32);
                    return;
                }
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 0) {
                do {
                    list.add(java.lang.Long.valueOf(readInt64()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            if (tagWireType2 == 2) {
                int varint33 = this.pos + readVarint32();
                while (this.pos < varint33) {
                    list.add(java.lang.Long.valueOf(readVarint64()));
                }
                requirePosition(varint33);
                return;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.Reader
        public void readInt32List(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.protobuf.IntArrayList) {
                com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) list;
                int tagWireType = com.google.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 0) {
                    do {
                        intArrayList.addInt(readInt32());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                if (tagWireType == 2) {
                    int varint32 = this.pos + readVarint32();
                    while (this.pos < varint32) {
                        intArrayList.addInt(readVarint32());
                    }
                    requirePosition(varint32);
                    return;
                }
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 0) {
                do {
                    list.add(java.lang.Integer.valueOf(readInt32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            if (tagWireType2 == 2) {
                int varint33 = this.pos + readVarint32();
                while (this.pos < varint33) {
                    list.add(java.lang.Integer.valueOf(readVarint32()));
                }
                requirePosition(varint33);
                return;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.Reader
        public void readFixed64List(java.util.List<java.lang.Long> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.protobuf.LongArrayList) {
                com.google.protobuf.LongArrayList longArrayList = (com.google.protobuf.LongArrayList) list;
                int tagWireType = com.google.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 1) {
                    do {
                        longArrayList.addLong(readFixed64());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed64Length(varint32);
                    int i3 = this.pos + varint32;
                    while (this.pos < i3) {
                        longArrayList.addLong(readLittleEndian64_NoCheck());
                    }
                    return;
                }
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 1) {
                do {
                    list.add(java.lang.Long.valueOf(readFixed64()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            if (tagWireType2 == 2) {
                int varint33 = readVarint32();
                verifyPackedFixed64Length(varint33);
                int i4 = this.pos + varint33;
                while (this.pos < i4) {
                    list.add(java.lang.Long.valueOf(readLittleEndian64_NoCheck()));
                }
                return;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.Reader
        public void readFixed32List(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.protobuf.IntArrayList) {
                com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) list;
                int tagWireType = com.google.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed32Length(varint32);
                    int i3 = this.pos + varint32;
                    while (this.pos < i3) {
                        intArrayList.addInt(readLittleEndian32_NoCheck());
                    }
                    return;
                }
                if (tagWireType == 5) {
                    do {
                        intArrayList.addInt(readFixed32());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 2) {
                int varint33 = readVarint32();
                verifyPackedFixed32Length(varint33);
                int i4 = this.pos + varint33;
                while (this.pos < i4) {
                    list.add(java.lang.Integer.valueOf(readLittleEndian32_NoCheck()));
                }
                return;
            }
            if (tagWireType2 == 5) {
                do {
                    list.add(java.lang.Integer.valueOf(readFixed32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.Reader
        public void readBoolList(java.util.List<java.lang.Boolean> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.protobuf.BooleanArrayList) {
                com.google.protobuf.BooleanArrayList booleanArrayList = (com.google.protobuf.BooleanArrayList) list;
                int tagWireType = com.google.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int varint32 = this.pos + readVarint32();
                        while (this.pos < varint32) {
                            booleanArrayList.addBoolean(readVarint32() != 0);
                        }
                        requirePosition(varint32);
                        return;
                    }
                    throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    booleanArrayList.addBoolean(readBool());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            int tagWireType2 = com.google.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int varint33 = this.pos + readVarint32();
                    while (this.pos < varint33) {
                        list.add(java.lang.Boolean.valueOf(readVarint32() != 0));
                    }
                    requirePosition(varint33);
                    return;
                }
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(java.lang.Boolean.valueOf(readBool()));
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i;
        }

        @Override // com.google.protobuf.Reader
        public void readStringList(java.util.List<java.lang.String> list) throws java.io.IOException {
            readStringListInternal(list, false);
        }

        @Override // com.google.protobuf.Reader
        public void readStringListRequireUtf8(java.util.List<java.lang.String> list) throws java.io.IOException {
            readStringListInternal(list, true);
        }

        public void readStringListInternal(java.util.List<java.lang.String> list, boolean z) throws java.io.IOException {
            int i;
            int i2;
            if (com.google.protobuf.WireFormat.getTagWireType(this.tag) != 2) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            if ((list instanceof com.google.protobuf.LazyStringList) && !z) {
                com.google.protobuf.LazyStringList lazyStringList = (com.google.protobuf.LazyStringList) list;
                do {
                    lazyStringList.add(readBytes());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            do {
                list.add(readStringInternal(z));
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i;
        }

        @Override // com.google.protobuf.Reader
        public <T> void readMessageList(java.util.List<T> list, java.lang.Class<T> cls, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            readMessageList(list, com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) cls), extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.Reader
        public <T> void readMessageList(java.util.List<T> list, com.google.protobuf.Schema<T> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int i;
            if (com.google.protobuf.WireFormat.getTagWireType(this.tag) != 2) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int i2 = this.tag;
            do {
                list.add(readMessage(schema, extensionRegistryLite));
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == i2);
            this.pos = i;
        }

        @Override // com.google.protobuf.Reader
        @java.lang.Deprecated
        public <T> void readGroupList(java.util.List<T> list, java.lang.Class<T> cls, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            readGroupList(list, com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) cls), extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.Reader
        @java.lang.Deprecated
        public <T> void readGroupList(java.util.List<T> list, com.google.protobuf.Schema<T> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int i;
            if (com.google.protobuf.WireFormat.getTagWireType(this.tag) != 3) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int i2 = this.tag;
            do {
                list.add(readGroup(schema, extensionRegistryLite));
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == i2);
            this.pos = i;
        }

        @Override // com.google.protobuf.Reader
        public void readBytesList(java.util.List<com.google.protobuf.ByteString> list) throws java.io.IOException {
            int i;
            if (com.google.protobuf.WireFormat.getTagWireType(this.tag) != 2) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(readBytes());
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i;
        }

        @Override // com.google.protobuf.Reader
        public void readUInt32List(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.protobuf.IntArrayList) {
                com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) list;
                int tagWireType = com.google.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int varint32 = this.pos + readVarint32();
                        while (this.pos < varint32) {
                            intArrayList.addInt(readVarint32());
                        }
                        return;
                    }
                    throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(readUInt32());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            int tagWireType2 = com.google.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int varint33 = this.pos + readVarint32();
                    while (this.pos < varint33) {
                        list.add(java.lang.Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(java.lang.Integer.valueOf(readUInt32()));
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i;
        }

        @Override // com.google.protobuf.Reader
        public void readEnumList(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.protobuf.IntArrayList) {
                com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) list;
                int tagWireType = com.google.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int varint32 = this.pos + readVarint32();
                        while (this.pos < varint32) {
                            intArrayList.addInt(readVarint32());
                        }
                        return;
                    }
                    throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(readEnum());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            int tagWireType2 = com.google.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int varint33 = this.pos + readVarint32();
                    while (this.pos < varint33) {
                        list.add(java.lang.Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(java.lang.Integer.valueOf(readEnum()));
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i;
        }

        @Override // com.google.protobuf.Reader
        public void readSFixed32List(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.protobuf.IntArrayList) {
                com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) list;
                int tagWireType = com.google.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed32Length(varint32);
                    int i3 = this.pos + varint32;
                    while (this.pos < i3) {
                        intArrayList.addInt(readLittleEndian32_NoCheck());
                    }
                    return;
                }
                if (tagWireType == 5) {
                    do {
                        intArrayList.addInt(readSFixed32());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 2) {
                int varint33 = readVarint32();
                verifyPackedFixed32Length(varint33);
                int i4 = this.pos + varint33;
                while (this.pos < i4) {
                    list.add(java.lang.Integer.valueOf(readLittleEndian32_NoCheck()));
                }
                return;
            }
            if (tagWireType2 == 5) {
                do {
                    list.add(java.lang.Integer.valueOf(readSFixed32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.Reader
        public void readSFixed64List(java.util.List<java.lang.Long> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.protobuf.LongArrayList) {
                com.google.protobuf.LongArrayList longArrayList = (com.google.protobuf.LongArrayList) list;
                int tagWireType = com.google.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 1) {
                    do {
                        longArrayList.addLong(readSFixed64());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed64Length(varint32);
                    int i3 = this.pos + varint32;
                    while (this.pos < i3) {
                        longArrayList.addLong(readLittleEndian64_NoCheck());
                    }
                    return;
                }
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 1) {
                do {
                    list.add(java.lang.Long.valueOf(readSFixed64()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            if (tagWireType2 == 2) {
                int varint33 = readVarint32();
                verifyPackedFixed64Length(varint33);
                int i4 = this.pos + varint33;
                while (this.pos < i4) {
                    list.add(java.lang.Long.valueOf(readLittleEndian64_NoCheck()));
                }
                return;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.Reader
        public void readSInt32List(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.protobuf.IntArrayList) {
                com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) list;
                int tagWireType = com.google.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int varint32 = this.pos + readVarint32();
                        while (this.pos < varint32) {
                            intArrayList.addInt(com.google.protobuf.CodedInputStream.decodeZigZag32(readVarint32()));
                        }
                        return;
                    }
                    throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(readSInt32());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            int tagWireType2 = com.google.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int varint33 = this.pos + readVarint32();
                    while (this.pos < varint33) {
                        list.add(java.lang.Integer.valueOf(com.google.protobuf.CodedInputStream.decodeZigZag32(readVarint32())));
                    }
                    return;
                }
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(java.lang.Integer.valueOf(readSInt32()));
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i;
        }

        @Override // com.google.protobuf.Reader
        public void readSInt64List(java.util.List<java.lang.Long> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.protobuf.LongArrayList) {
                com.google.protobuf.LongArrayList longArrayList = (com.google.protobuf.LongArrayList) list;
                int tagWireType = com.google.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int varint32 = this.pos + readVarint32();
                        while (this.pos < varint32) {
                            longArrayList.addLong(com.google.protobuf.CodedInputStream.decodeZigZag64(readVarint64()));
                        }
                        return;
                    }
                    throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    longArrayList.addLong(readSInt64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            int tagWireType2 = com.google.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int varint33 = this.pos + readVarint32();
                    while (this.pos < varint33) {
                        list.add(java.lang.Long.valueOf(com.google.protobuf.CodedInputStream.decodeZigZag64(readVarint64())));
                    }
                    return;
                }
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(java.lang.Long.valueOf(readSInt64()));
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.Reader
        public <K, V> void readMap(java.util.Map<K, V> map, com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            requireWireType(2);
            int varint32 = readVarint32();
            requireBytes(varint32);
            int i = this.limit;
            this.limit = this.pos + varint32;
            try {
                java.lang.Object field = metadata.defaultKey;
                java.lang.Object field2 = metadata.defaultValue;
                while (true) {
                    int fieldNumber = getFieldNumber();
                    if (fieldNumber == Integer.MAX_VALUE) {
                        map.put(field, field2);
                        this.limit = i;
                        return;
                    } else if (fieldNumber == 1) {
                        field = readField(metadata.keyType, null, null);
                    } else if (fieldNumber == 2) {
                        field2 = readField(metadata.valueType, metadata.defaultValue.getClass(), extensionRegistryLite);
                    } else {
                        try {
                            if (!skipField()) {
                                throw new com.google.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        } catch (com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!skipField()) {
                                throw new com.google.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                this.limit = i;
                throw th;
            }
        }

        private java.lang.Object readField(com.google.protobuf.WireFormat.FieldType fieldType, java.lang.Class<?> cls, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            switch (com.google.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
                case 1:
                    return java.lang.Boolean.valueOf(readBool());
                case 2:
                    return readBytes();
                case 3:
                    return java.lang.Double.valueOf(readDouble());
                case 4:
                    return java.lang.Integer.valueOf(readEnum());
                case 5:
                    return java.lang.Integer.valueOf(readFixed32());
                case 6:
                    return java.lang.Long.valueOf(readFixed64());
                case 7:
                    return java.lang.Float.valueOf(readFloat());
                case 8:
                    return java.lang.Integer.valueOf(readInt32());
                case 9:
                    return java.lang.Long.valueOf(readInt64());
                case 10:
                    return readMessage(cls, extensionRegistryLite);
                case 11:
                    return java.lang.Integer.valueOf(readSFixed32());
                case 12:
                    return java.lang.Long.valueOf(readSFixed64());
                case 13:
                    return java.lang.Integer.valueOf(readSInt32());
                case 14:
                    return java.lang.Long.valueOf(readSInt64());
                case 15:
                    return readStringRequireUtf8();
                case 16:
                    return java.lang.Integer.valueOf(readUInt32());
                case 17:
                    return java.lang.Long.valueOf(readUInt64());
                default:
                    throw new java.lang.RuntimeException("unsupported field type.");
            }
        }

        private int readVarint32() throws java.io.IOException {
            int i;
            int i2 = this.pos;
            int i3 = this.limit;
            if (i3 == i2) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.pos = i4;
                return b;
            }
            if (i3 - i4 < 9) {
                return (int) readVarint64SlowPath();
            }
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
                                            if (bArr[i7] < 0) {
                                                throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
                                            }
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

        public long readVarint64() throws java.io.IOException {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.pos;
            int i3 = this.limit;
            if (i3 == i2) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.pos = i4;
                return b;
            }
            if (i3 - i4 < 9) {
                return readVarint64SlowPath();
            }
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
                                        if (j7 < 0) {
                                            i5 = i11 + 1;
                                            if (bArr[i11] < 0) {
                                                throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
                                            }
                                        } else {
                                            i5 = i11;
                                        }
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

        private long readVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte b = readByte();
                j |= ((long) (b & 127)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private byte readByte() throws java.io.IOException {
            int i = this.pos;
            if (i == this.limit) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 1;
            return bArr[i];
        }

        private int readLittleEndian32() throws java.io.IOException {
            requireBytes(4);
            return readLittleEndian32_NoCheck();
        }

        private long readLittleEndian64() throws java.io.IOException {
            requireBytes(8);
            return readLittleEndian64_NoCheck();
        }

        private int readLittleEndian32_NoCheck() {
            int i = this.pos;
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        private long readLittleEndian64_NoCheck() {
            int i = this.pos;
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        private void skipVarint() throws java.io.IOException {
            int i = this.limit;
            int i2 = this.pos;
            if (i - i2 >= 10) {
                byte[] bArr = this.buffer;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.pos = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            skipVarintSlowPath();
        }

        private void skipVarintSlowPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readByte() >= 0) {
                    return;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private void skipBytes(int i) throws java.io.IOException {
            requireBytes(i);
            this.pos += i;
        }

        private void skipGroup() throws java.io.IOException {
            int i = this.endGroupTag;
            this.endGroupTag = com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(this.tag), 4);
            while (getFieldNumber() != Integer.MAX_VALUE && skipField()) {
            }
            if (this.tag != this.endGroupTag) {
                throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
            }
            this.endGroupTag = i;
        }

        private void requireBytes(int i) throws java.io.IOException {
            if (i < 0 || i > this.limit - this.pos) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private void requireWireType(int i) throws java.io.IOException {
            if (com.google.protobuf.WireFormat.getTagWireType(this.tag) != i) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
        }

        private void verifyPackedFixed64Length(int i) throws java.io.IOException {
            requireBytes(i);
            if ((i & 7) != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
            }
        }

        private void verifyPackedFixed32Length(int i) throws java.io.IOException {
            requireBytes(i);
            if ((i & 3) != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
            }
        }

        private void requirePosition(int i) throws java.io.IOException {
            if (this.pos != i) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.BinaryReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[com.google.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[com.google.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
        }
    }
}
