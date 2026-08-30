package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class UnknownFieldSetLite {
    private static final androidx.datastore.preferences.protobuf.UnknownFieldSetLite DEFAULT_INSTANCE = new androidx.datastore.preferences.protobuf.UnknownFieldSetLite(0, new int[0], new java.lang.Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private java.lang.Object[] objects;
    private int[] tags;

    public static androidx.datastore.preferences.protobuf.UnknownFieldSetLite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    static androidx.datastore.preferences.protobuf.UnknownFieldSetLite newInstance() {
        return new androidx.datastore.preferences.protobuf.UnknownFieldSetLite();
    }

    static androidx.datastore.preferences.protobuf.UnknownFieldSetLite mutableCopyOf(androidx.datastore.preferences.protobuf.UnknownFieldSetLite first, androidx.datastore.preferences.protobuf.UnknownFieldSetLite second) {
        int i = first.count + second.count;
        int[] iArrCopyOf = java.util.Arrays.copyOf(first.tags, i);
        java.lang.System.arraycopy(second.tags, 0, iArrCopyOf, first.count, second.count);
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(first.objects, i);
        java.lang.System.arraycopy(second.objects, 0, objArrCopyOf, first.count, second.count);
        return new androidx.datastore.preferences.protobuf.UnknownFieldSetLite(i, iArrCopyOf, objArrCopyOf, true);
    }

    private UnknownFieldSetLite() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private UnknownFieldSetLite(int count, int[] tags, java.lang.Object[] objects, boolean isMutable) {
        this.memoizedSerializedSize = -1;
        this.count = count;
        this.tags = tags;
        this.objects = objects;
        this.isMutable = isMutable;
    }

    public void makeImmutable() {
        if (this.isMutable) {
            this.isMutable = false;
        }
    }

    void checkMutable() {
        if (!this.isMutable) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public void writeTo(androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
        for (int i = 0; i < this.count; i++) {
            int i2 = this.tags[i];
            int tagFieldNumber = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(i2);
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(i2);
            if (tagWireType == 0) {
                output.writeUInt64(tagFieldNumber, ((java.lang.Long) this.objects[i]).longValue());
            } else if (tagWireType == 1) {
                output.writeFixed64(tagFieldNumber, ((java.lang.Long) this.objects[i]).longValue());
            } else if (tagWireType == 2) {
                output.writeBytes(tagFieldNumber, (androidx.datastore.preferences.protobuf.ByteString) this.objects[i]);
            } else if (tagWireType == 3) {
                output.writeTag(tagFieldNumber, 3);
                ((androidx.datastore.preferences.protobuf.UnknownFieldSetLite) this.objects[i]).writeTo(output);
                output.writeTag(tagFieldNumber, 4);
            } else if (tagWireType == 5) {
                output.writeFixed32(tagFieldNumber, ((java.lang.Integer) this.objects[i]).intValue());
            } else {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    public void writeAsMessageSetTo(androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
        for (int i = 0; i < this.count; i++) {
            output.writeRawMessageSetExtension(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(this.tags[i]), (androidx.datastore.preferences.protobuf.ByteString) this.objects[i]);
        }
    }

    void writeAsMessageSetTo(androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (writer.fieldOrder() == androidx.datastore.preferences.protobuf.Writer.FieldOrder.DESCENDING) {
            for (int i = this.count - 1; i >= 0; i--) {
                writer.writeMessageSetItem(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(this.tags[i]), this.objects[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            writer.writeMessageSetItem(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(this.tags[i2]), this.objects[i2]);
        }
    }

    public void writeTo(androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (this.count == 0) {
            return;
        }
        if (writer.fieldOrder() == androidx.datastore.preferences.protobuf.Writer.FieldOrder.ASCENDING) {
            for (int i = 0; i < this.count; i++) {
                writeField(this.tags[i], this.objects[i], writer);
            }
            return;
        }
        for (int i2 = this.count - 1; i2 >= 0; i2--) {
            writeField(this.tags[i2], this.objects[i2], writer);
        }
    }

    private static void writeField(int tag, java.lang.Object object, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        int tagFieldNumber = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag);
        int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            writer.writeInt64(tagFieldNumber, ((java.lang.Long) object).longValue());
            return;
        }
        if (tagWireType == 1) {
            writer.writeFixed64(tagFieldNumber, ((java.lang.Long) object).longValue());
            return;
        }
        if (tagWireType == 2) {
            writer.writeBytes(tagFieldNumber, (androidx.datastore.preferences.protobuf.ByteString) object);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                writer.writeFixed32(tagFieldNumber, ((java.lang.Integer) object).intValue());
                return;
            }
            throw new java.lang.RuntimeException(androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType());
        }
        if (writer.fieldOrder() == androidx.datastore.preferences.protobuf.Writer.FieldOrder.ASCENDING) {
            writer.writeStartGroup(tagFieldNumber);
            ((androidx.datastore.preferences.protobuf.UnknownFieldSetLite) object).writeTo(writer);
            writer.writeEndGroup(tagFieldNumber);
        } else {
            writer.writeEndGroup(tagFieldNumber);
            ((androidx.datastore.preferences.protobuf.UnknownFieldSetLite) object).writeTo(writer);
            writer.writeStartGroup(tagFieldNumber);
        }
    }

    public int getSerializedSizeAsMessageSet() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i2 = 0; i2 < this.count; i2++) {
            iComputeRawMessageSetExtensionSize += androidx.datastore.preferences.protobuf.CodedOutputStream.computeRawMessageSetExtensionSize(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(this.tags[i2]), (androidx.datastore.preferences.protobuf.ByteString) this.objects[i2]);
        }
        this.memoizedSerializedSize = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    public int getSerializedSize() {
        int iComputeUInt64Size;
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.tags[i3];
            int tagFieldNumber = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(i4);
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(i4);
            if (tagWireType == 0) {
                iComputeUInt64Size = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64Size(tagFieldNumber, ((java.lang.Long) this.objects[i3]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed64Size(tagFieldNumber, ((java.lang.Long) this.objects[i3]).longValue());
            } else if (tagWireType == 2) {
                iComputeUInt64Size = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSize(tagFieldNumber, (androidx.datastore.preferences.protobuf.ByteString) this.objects[i3]);
            } else if (tagWireType == 3) {
                iComputeUInt64Size = (androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + ((androidx.datastore.preferences.protobuf.UnknownFieldSetLite) this.objects[i3]).getSerializedSize();
            } else if (tagWireType == 5) {
                iComputeUInt64Size = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed32Size(tagFieldNumber, ((java.lang.Integer) this.objects[i3]).intValue());
            } else {
                throw new java.lang.IllegalStateException(androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType());
            }
            i2 += iComputeUInt64Size;
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    private static boolean tagsEquals(int[] tags1, int[] tags2, int count) {
        for (int i = 0; i < count; i++) {
            if (tags1[i] != tags2[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean objectsEquals(java.lang.Object[] objects1, java.lang.Object[] objects2, int count) {
        for (int i = 0; i < count; i++) {
            if (!objects1[i].equals(objects2[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof androidx.datastore.preferences.protobuf.UnknownFieldSetLite)) {
            return false;
        }
        androidx.datastore.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) obj;
        int i = this.count;
        return i == unknownFieldSetLite.count && tagsEquals(this.tags, unknownFieldSetLite.tags, i) && objectsEquals(this.objects, unknownFieldSetLite.objects, this.count);
    }

    private static int hashCode(int[] tags, int count) {
        int i = 17;
        for (int i2 = 0; i2 < count; i2++) {
            i = (i * 31) + tags[i2];
        }
        return i;
    }

    private static int hashCode(java.lang.Object[] objects, int count) {
        int iHashCode = 17;
        for (int i = 0; i < count; i++) {
            iHashCode = (iHashCode * 31) + objects[i].hashCode();
        }
        return iHashCode;
    }

    public int hashCode() {
        int i = this.count;
        return ((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i) * 31) + hashCode(this.tags, i)) * 31) + hashCode(this.objects, this.count);
    }

    final void printWithIndent(java.lang.StringBuilder buffer, int indent) {
        for (int i = 0; i < this.count; i++) {
            androidx.datastore.preferences.protobuf.MessageLiteToString.printField(buffer, indent, java.lang.String.valueOf(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(this.tags[i])), this.objects[i]);
        }
    }

    void storeField(int tag, java.lang.Object value) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i = this.count;
        iArr[i] = tag;
        this.objects[i] = value;
        this.count = i + 1;
    }

    private void ensureCapacity(int minCapacity) {
        int[] iArr = this.tags;
        if (minCapacity > iArr.length) {
            int i = this.count;
            int i2 = i + (i / 2);
            if (i2 >= minCapacity) {
                minCapacity = i2;
            }
            if (minCapacity < 8) {
                minCapacity = 8;
            }
            this.tags = java.util.Arrays.copyOf(iArr, minCapacity);
            this.objects = java.util.Arrays.copyOf(this.objects, minCapacity);
        }
    }

    boolean mergeFieldFrom(final int tag, final androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
        checkMutable();
        int tagFieldNumber = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag);
        int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            storeField(tag, java.lang.Long.valueOf(input.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            storeField(tag, java.lang.Long.valueOf(input.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            storeField(tag, input.readBytes());
            return true;
        }
        if (tagWireType == 3) {
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite = new androidx.datastore.preferences.protobuf.UnknownFieldSetLite();
            unknownFieldSetLite.mergeFrom(input);
            input.checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(tagFieldNumber, 4));
            storeField(tag, unknownFieldSetLite);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            storeField(tag, java.lang.Integer.valueOf(input.readFixed32()));
            return true;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    androidx.datastore.preferences.protobuf.UnknownFieldSetLite mergeVarintField(int fieldNumber, int value) {
        checkMutable();
        if (fieldNumber == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 0), java.lang.Long.valueOf(value));
        return this;
    }

    androidx.datastore.preferences.protobuf.UnknownFieldSetLite mergeLengthDelimitedField(final int fieldNumber, final androidx.datastore.preferences.protobuf.ByteString value) {
        checkMutable();
        if (fieldNumber == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 2), value);
        return this;
    }

    private androidx.datastore.preferences.protobuf.UnknownFieldSetLite mergeFrom(final androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
        int tag;
        do {
            tag = input.readTag();
            if (tag == 0) {
                break;
            }
        } while (mergeFieldFrom(tag, input));
        return this;
    }

    androidx.datastore.preferences.protobuf.UnknownFieldSetLite mergeFrom(androidx.datastore.preferences.protobuf.UnknownFieldSetLite other) {
        if (other.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i = this.count + other.count;
        ensureCapacity(i);
        java.lang.System.arraycopy(other.tags, 0, this.tags, this.count, other.count);
        java.lang.System.arraycopy(other.objects, 0, this.objects, this.count, other.count);
        this.count = i;
        return this;
    }
}
