package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
final class CodedInputStreamReader implements androidx.datastore.preferences.protobuf.Reader {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;
    private static final int NEXT_TAG_UNSET = 0;
    private int endGroupTag;
    private final androidx.datastore.preferences.protobuf.CodedInputStream input;
    private int nextTag = 0;
    private int tag;

    public static androidx.datastore.preferences.protobuf.CodedInputStreamReader forCodedInput(androidx.datastore.preferences.protobuf.CodedInputStream input) {
        if (input.wrapper != null) {
            return input.wrapper;
        }
        return new androidx.datastore.preferences.protobuf.CodedInputStreamReader(input);
    }

    private CodedInputStreamReader(androidx.datastore.preferences.protobuf.CodedInputStream input) {
        androidx.datastore.preferences.protobuf.CodedInputStream codedInputStream = (androidx.datastore.preferences.protobuf.CodedInputStream) androidx.datastore.preferences.protobuf.Internal.checkNotNull(input, "input");
        this.input = codedInputStream;
        codedInputStream.wrapper = this;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public boolean shouldDiscardUnknownFields() {
        return this.input.shouldDiscardUnknownFields();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int getFieldNumber() throws java.io.IOException {
        int i = this.nextTag;
        if (i != 0) {
            this.tag = i;
            this.nextTag = 0;
        } else {
            this.tag = this.input.readTag();
        }
        int i2 = this.tag;
        if (i2 == 0 || i2 == this.endGroupTag) {
            return Integer.MAX_VALUE;
        }
        return androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int getTag() {
        return this.tag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public boolean skipField() throws java.io.IOException {
        int i;
        if (this.input.isAtEnd() || (i = this.tag) == this.endGroupTag) {
            return false;
        }
        return this.input.skipField(i);
    }

    private void requireWireType(int requiredWireType) throws java.io.IOException {
        if (androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag) != requiredWireType) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public double readDouble() throws java.io.IOException {
        requireWireType(1);
        return this.input.readDouble();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public float readFloat() throws java.io.IOException {
        requireWireType(5);
        return this.input.readFloat();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readUInt64() throws java.io.IOException {
        requireWireType(0);
        return this.input.readUInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readInt64() throws java.io.IOException {
        requireWireType(0);
        return this.input.readInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readInt32() throws java.io.IOException {
        requireWireType(0);
        return this.input.readInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readFixed64() throws java.io.IOException {
        requireWireType(1);
        return this.input.readFixed64();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readFixed32() throws java.io.IOException {
        requireWireType(5);
        return this.input.readFixed32();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public boolean readBool() throws java.io.IOException {
        requireWireType(0);
        return this.input.readBool();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public java.lang.String readString() throws java.io.IOException {
        requireWireType(2);
        return this.input.readString();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public java.lang.String readStringRequireUtf8() throws java.io.IOException {
        requireWireType(2);
        return this.input.readStringRequireUtf8();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public <T> T readMessage(java.lang.Class<T> cls, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        requireWireType(2);
        return (T) readMessage(androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) cls), extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public <T> T readMessageBySchemaWithCheck(androidx.datastore.preferences.protobuf.Schema<T> schema, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        requireWireType(2);
        return (T) readMessage(schema, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    @java.lang.Deprecated
    public <T> T readGroup(java.lang.Class<T> cls, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        requireWireType(3);
        return (T) readGroup(androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) cls), extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    @java.lang.Deprecated
    public <T> T readGroupBySchemaWithCheck(androidx.datastore.preferences.protobuf.Schema<T> schema, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        requireWireType(3);
        return (T) readGroup(schema, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public <T> void mergeMessageField(T target, androidx.datastore.preferences.protobuf.Schema<T> schema, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        requireWireType(2);
        mergeMessageFieldInternal(target, schema, extensionRegistry);
    }

    private <T> void mergeMessageFieldInternal(T target, androidx.datastore.preferences.protobuf.Schema<T> schema, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        int uInt32 = this.input.readUInt32();
        if (this.input.recursionDepth >= this.input.recursionLimit) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iPushLimit = this.input.pushLimit(uInt32);
        this.input.recursionDepth++;
        schema.mergeFrom(target, this, extensionRegistry);
        this.input.checkLastTagWas(0);
        this.input.recursionDepth--;
        this.input.popLimit(iPushLimit);
    }

    private <T> T readMessage(androidx.datastore.preferences.protobuf.Schema<T> schema, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        T tNewInstance = schema.newInstance();
        mergeMessageFieldInternal(tNewInstance, schema, extensionRegistry);
        schema.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public <T> void mergeGroupField(T target, androidx.datastore.preferences.protobuf.Schema<T> schema, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        requireWireType(3);
        mergeGroupFieldInternal(target, schema, extensionRegistry);
    }

    private <T> void mergeGroupFieldInternal(T target, androidx.datastore.preferences.protobuf.Schema<T> schema, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        int i = this.endGroupTag;
        this.endGroupTag = androidx.datastore.preferences.protobuf.WireFormat.makeTag(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(this.tag), 4);
        try {
            schema.mergeFrom(target, this, extensionRegistry);
            if (this.tag != this.endGroupTag) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure();
            }
            this.endGroupTag = i;
        } catch (java.lang.Throwable th) {
            this.endGroupTag = i;
            throw th;
        }
    }

    private <T> T readGroup(androidx.datastore.preferences.protobuf.Schema<T> schema, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        T tNewInstance = schema.newInstance();
        mergeGroupFieldInternal(tNewInstance, schema, extensionRegistry);
        schema.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public androidx.datastore.preferences.protobuf.ByteString readBytes() throws java.io.IOException {
        requireWireType(2);
        return this.input.readBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readUInt32() throws java.io.IOException {
        requireWireType(0);
        return this.input.readUInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readEnum() throws java.io.IOException {
        requireWireType(0);
        return this.input.readEnum();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readSFixed32() throws java.io.IOException {
        requireWireType(5);
        return this.input.readSFixed32();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readSFixed64() throws java.io.IOException {
        requireWireType(1);
        return this.input.readSFixed64();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readSInt32() throws java.io.IOException {
        requireWireType(0);
        return this.input.readSInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readSInt64() throws java.io.IOException {
        requireWireType(0);
        return this.input.readSInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readDoubleList(java.util.List<java.lang.Double> target) throws java.io.IOException {
        int tag;
        int tag2;
        if (target instanceof androidx.datastore.preferences.protobuf.DoubleArrayList) {
            androidx.datastore.preferences.protobuf.DoubleArrayList doubleArrayList = (androidx.datastore.preferences.protobuf.DoubleArrayList) target;
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 1) {
                do {
                    doubleArrayList.addDouble(this.input.readDouble());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag2 = this.input.readTag();
                    }
                } while (tag2 == this.tag);
                this.nextTag = tag2;
                return;
            }
            if (tagWireType == 2) {
                int uInt32 = this.input.readUInt32();
                verifyPackedFixed64Length(uInt32);
                int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
                do {
                    doubleArrayList.addDouble(this.input.readDouble());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                return;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                target.add(java.lang.Double.valueOf(this.input.readDouble()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        if (tagWireType2 == 2) {
            int uInt33 = this.input.readUInt32();
            verifyPackedFixed64Length(uInt33);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
            do {
                target.add(java.lang.Double.valueOf(this.input.readDouble()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readFloatList(java.util.List<java.lang.Float> target) throws java.io.IOException {
        int tag;
        int tag2;
        if (target instanceof androidx.datastore.preferences.protobuf.FloatArrayList) {
            androidx.datastore.preferences.protobuf.FloatArrayList floatArrayList = (androidx.datastore.preferences.protobuf.FloatArrayList) target;
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 2) {
                int uInt32 = this.input.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
                do {
                    floatArrayList.addFloat(this.input.readFloat());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType == 5) {
                do {
                    floatArrayList.addFloat(this.input.readFloat());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag2 = this.input.readTag();
                    }
                } while (tag2 == this.tag);
                this.nextTag = tag2;
                return;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int uInt33 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt33);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
            do {
                target.add(java.lang.Float.valueOf(this.input.readFloat()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 == 5) {
            do {
                target.add(java.lang.Float.valueOf(this.input.readFloat()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readUInt64List(java.util.List<java.lang.Long> target) throws java.io.IOException {
        int tag;
        int tag2;
        if (target instanceof androidx.datastore.preferences.protobuf.LongArrayList) {
            androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) target;
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    longArrayList.addLong(this.input.readUInt64());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag2 = this.input.readTag();
                    }
                } while (tag2 == this.tag);
                this.nextTag = tag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    longArrayList.addLong(this.input.readUInt64());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                requirePosition(totalBytesRead);
                return;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                target.add(java.lang.Long.valueOf(this.input.readUInt64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                target.add(java.lang.Long.valueOf(this.input.readUInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            requirePosition(totalBytesRead2);
            return;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readInt64List(java.util.List<java.lang.Long> target) throws java.io.IOException {
        int tag;
        int tag2;
        if (target instanceof androidx.datastore.preferences.protobuf.LongArrayList) {
            androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) target;
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    longArrayList.addLong(this.input.readInt64());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag2 = this.input.readTag();
                    }
                } while (tag2 == this.tag);
                this.nextTag = tag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    longArrayList.addLong(this.input.readInt64());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                requirePosition(totalBytesRead);
                return;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                target.add(java.lang.Long.valueOf(this.input.readInt64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                target.add(java.lang.Long.valueOf(this.input.readInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            requirePosition(totalBytesRead2);
            return;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readInt32List(java.util.List<java.lang.Integer> target) throws java.io.IOException {
        int tag;
        int tag2;
        if (target instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) target;
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    intArrayList.addInt(this.input.readInt32());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag2 = this.input.readTag();
                    }
                } while (tag2 == this.tag);
                this.nextTag = tag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    intArrayList.addInt(this.input.readInt32());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                requirePosition(totalBytesRead);
                return;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                target.add(java.lang.Integer.valueOf(this.input.readInt32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                target.add(java.lang.Integer.valueOf(this.input.readInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            requirePosition(totalBytesRead2);
            return;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readFixed64List(java.util.List<java.lang.Long> target) throws java.io.IOException {
        int tag;
        int tag2;
        if (target instanceof androidx.datastore.preferences.protobuf.LongArrayList) {
            androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) target;
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 1) {
                do {
                    longArrayList.addLong(this.input.readFixed64());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag2 = this.input.readTag();
                    }
                } while (tag2 == this.tag);
                this.nextTag = tag2;
                return;
            }
            if (tagWireType == 2) {
                int uInt32 = this.input.readUInt32();
                verifyPackedFixed64Length(uInt32);
                int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
                do {
                    longArrayList.addLong(this.input.readFixed64());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                return;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                target.add(java.lang.Long.valueOf(this.input.readFixed64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        if (tagWireType2 == 2) {
            int uInt33 = this.input.readUInt32();
            verifyPackedFixed64Length(uInt33);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
            do {
                target.add(java.lang.Long.valueOf(this.input.readFixed64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readFixed32List(java.util.List<java.lang.Integer> target) throws java.io.IOException {
        int tag;
        int tag2;
        if (target instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) target;
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 2) {
                int uInt32 = this.input.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
                do {
                    intArrayList.addInt(this.input.readFixed32());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType == 5) {
                do {
                    intArrayList.addInt(this.input.readFixed32());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag2 = this.input.readTag();
                    }
                } while (tag2 == this.tag);
                this.nextTag = tag2;
                return;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int uInt33 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt33);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
            do {
                target.add(java.lang.Integer.valueOf(this.input.readFixed32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 == 5) {
            do {
                target.add(java.lang.Integer.valueOf(this.input.readFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readBoolList(java.util.List<java.lang.Boolean> target) throws java.io.IOException {
        int tag;
        int tag2;
        if (target instanceof androidx.datastore.preferences.protobuf.BooleanArrayList) {
            androidx.datastore.preferences.protobuf.BooleanArrayList booleanArrayList = (androidx.datastore.preferences.protobuf.BooleanArrayList) target;
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    booleanArrayList.addBoolean(this.input.readBool());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag2 = this.input.readTag();
                    }
                } while (tag2 == this.tag);
                this.nextTag = tag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    booleanArrayList.addBoolean(this.input.readBool());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                requirePosition(totalBytesRead);
                return;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                target.add(java.lang.Boolean.valueOf(this.input.readBool()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                target.add(java.lang.Boolean.valueOf(this.input.readBool()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            requirePosition(totalBytesRead2);
            return;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readStringList(java.util.List<java.lang.String> target) throws java.io.IOException {
        readStringListInternal(target, false);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readStringListRequireUtf8(java.util.List<java.lang.String> target) throws java.io.IOException {
        readStringListInternal(target, true);
    }

    public void readStringListInternal(java.util.List<java.lang.String> target, boolean requireUtf8) throws java.io.IOException {
        int tag;
        int tag2;
        if (androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag) != 2) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        if ((target instanceof androidx.datastore.preferences.protobuf.LazyStringList) && !requireUtf8) {
            androidx.datastore.preferences.protobuf.LazyStringList lazyStringList = (androidx.datastore.preferences.protobuf.LazyStringList) target;
            do {
                lazyStringList.add(readBytes());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        do {
            target.add(requireUtf8 ? readStringRequireUtf8() : readString());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag = this.input.readTag();
            }
        } while (tag == this.tag);
        this.nextTag = tag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public <T> void readMessageList(java.util.List<T> target, java.lang.Class<T> targetType, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        readMessageList(target, androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) targetType), extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.Reader
    public <T> void readMessageList(java.util.List<T> target, androidx.datastore.preferences.protobuf.Schema<T> schema, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        int tag;
        if (androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag) != 2) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.tag;
        do {
            target.add(readMessage(schema, extensionRegistry));
            if (this.input.isAtEnd() || this.nextTag != 0) {
                return;
            } else {
                tag = this.input.readTag();
            }
        } while (tag == i);
        this.nextTag = tag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    @java.lang.Deprecated
    public <T> void readGroupList(java.util.List<T> target, java.lang.Class<T> targetType, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        readGroupList(target, androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) targetType), extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.Reader
    @java.lang.Deprecated
    public <T> void readGroupList(java.util.List<T> target, androidx.datastore.preferences.protobuf.Schema<T> schema, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        int tag;
        if (androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag) != 3) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.tag;
        do {
            target.add(readGroup(schema, extensionRegistry));
            if (this.input.isAtEnd() || this.nextTag != 0) {
                return;
            } else {
                tag = this.input.readTag();
            }
        } while (tag == i);
        this.nextTag = tag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readBytesList(java.util.List<androidx.datastore.preferences.protobuf.ByteString> target) throws java.io.IOException {
        int tag;
        if (androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag) != 2) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        do {
            target.add(readBytes());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag = this.input.readTag();
            }
        } while (tag == this.tag);
        this.nextTag = tag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readUInt32List(java.util.List<java.lang.Integer> target) throws java.io.IOException {
        int tag;
        int tag2;
        if (target instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) target;
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    intArrayList.addInt(this.input.readUInt32());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag2 = this.input.readTag();
                    }
                } while (tag2 == this.tag);
                this.nextTag = tag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    intArrayList.addInt(this.input.readUInt32());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                requirePosition(totalBytesRead);
                return;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                target.add(java.lang.Integer.valueOf(this.input.readUInt32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                target.add(java.lang.Integer.valueOf(this.input.readUInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            requirePosition(totalBytesRead2);
            return;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readEnumList(java.util.List<java.lang.Integer> target) throws java.io.IOException {
        int tag;
        int tag2;
        if (target instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) target;
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    intArrayList.addInt(this.input.readEnum());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag2 = this.input.readTag();
                    }
                } while (tag2 == this.tag);
                this.nextTag = tag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    intArrayList.addInt(this.input.readEnum());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                requirePosition(totalBytesRead);
                return;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                target.add(java.lang.Integer.valueOf(this.input.readEnum()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                target.add(java.lang.Integer.valueOf(this.input.readEnum()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            requirePosition(totalBytesRead2);
            return;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSFixed32List(java.util.List<java.lang.Integer> target) throws java.io.IOException {
        int tag;
        int tag2;
        if (target instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) target;
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 2) {
                int uInt32 = this.input.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
                do {
                    intArrayList.addInt(this.input.readSFixed32());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType == 5) {
                do {
                    intArrayList.addInt(this.input.readSFixed32());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag2 = this.input.readTag();
                    }
                } while (tag2 == this.tag);
                this.nextTag = tag2;
                return;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int uInt33 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt33);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
            do {
                target.add(java.lang.Integer.valueOf(this.input.readSFixed32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 == 5) {
            do {
                target.add(java.lang.Integer.valueOf(this.input.readSFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSFixed64List(java.util.List<java.lang.Long> target) throws java.io.IOException {
        int tag;
        int tag2;
        if (target instanceof androidx.datastore.preferences.protobuf.LongArrayList) {
            androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) target;
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 1) {
                do {
                    longArrayList.addLong(this.input.readSFixed64());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag2 = this.input.readTag();
                    }
                } while (tag2 == this.tag);
                this.nextTag = tag2;
                return;
            }
            if (tagWireType == 2) {
                int uInt32 = this.input.readUInt32();
                verifyPackedFixed64Length(uInt32);
                int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
                do {
                    longArrayList.addLong(this.input.readSFixed64());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                return;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                target.add(java.lang.Long.valueOf(this.input.readSFixed64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        if (tagWireType2 == 2) {
            int uInt33 = this.input.readUInt32();
            verifyPackedFixed64Length(uInt33);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
            do {
                target.add(java.lang.Long.valueOf(this.input.readSFixed64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSInt32List(java.util.List<java.lang.Integer> target) throws java.io.IOException {
        int tag;
        int tag2;
        if (target instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) target;
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    intArrayList.addInt(this.input.readSInt32());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag2 = this.input.readTag();
                    }
                } while (tag2 == this.tag);
                this.nextTag = tag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    intArrayList.addInt(this.input.readSInt32());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                requirePosition(totalBytesRead);
                return;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                target.add(java.lang.Integer.valueOf(this.input.readSInt32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                target.add(java.lang.Integer.valueOf(this.input.readSInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            requirePosition(totalBytesRead2);
            return;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSInt64List(java.util.List<java.lang.Long> target) throws java.io.IOException {
        int tag;
        int tag2;
        if (target instanceof androidx.datastore.preferences.protobuf.LongArrayList) {
            androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) target;
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    longArrayList.addLong(this.input.readSInt64());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag2 = this.input.readTag();
                    }
                } while (tag2 == this.tag);
                this.nextTag = tag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    longArrayList.addLong(this.input.readSInt64());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                requirePosition(totalBytesRead);
                return;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                target.add(java.lang.Long.valueOf(this.input.readSInt64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                target.add(java.lang.Long.valueOf(this.input.readSInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            requirePosition(totalBytesRead2);
            return;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    private void verifyPackedFixed64Length(int bytes) throws java.io.IOException {
        if ((bytes & 7) != 0) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.Reader
    public <K, V> void readMap(java.util.Map<K, V> target, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        requireWireType(2);
        int iPushLimit = this.input.pushLimit(this.input.readUInt32());
        java.lang.Object field = metadata.defaultKey;
        java.lang.Object field2 = metadata.defaultValue;
        while (true) {
            try {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || this.input.isAtEnd()) {
                    break;
                }
                if (fieldNumber == 1) {
                    field = readField(metadata.keyType, null, null);
                } else if (fieldNumber == 2) {
                    field2 = readField(metadata.valueType, metadata.defaultValue.getClass(), extensionRegistry);
                } else {
                    try {
                        if (!skipField()) {
                            throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!skipField()) {
                            throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                this.input.popLimit(iPushLimit);
                throw th;
            }
        }
        target.put(field, field2);
        this.input.popLimit(iPushLimit);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.CodedInputStreamReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
        }
    }

    private java.lang.Object readField(androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, java.lang.Class<?> messageType, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        switch (androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
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
                return readMessage(messageType, extensionRegistry);
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
                throw new java.lang.IllegalArgumentException("unsupported field type.");
        }
    }

    private void verifyPackedFixed32Length(int bytes) throws java.io.IOException {
        if ((bytes & 3) != 0) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure();
        }
    }

    private void requirePosition(int expectedPosition) throws java.io.IOException {
        if (this.input.getTotalBytesRead() != expectedPosition) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
    }
}
