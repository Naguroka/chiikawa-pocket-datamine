package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
final class CodedOutputStreamWriter implements com.google.protobuf.Writer {
    private final com.google.protobuf.CodedOutputStream output;

    public static com.google.protobuf.CodedOutputStreamWriter forCodedOutput(com.google.protobuf.CodedOutputStream codedOutputStream) {
        if (codedOutputStream.wrapper != null) {
            return codedOutputStream.wrapper;
        }
        return new com.google.protobuf.CodedOutputStreamWriter(codedOutputStream);
    }

    private CodedOutputStreamWriter(com.google.protobuf.CodedOutputStream codedOutputStream) {
        com.google.protobuf.CodedOutputStream codedOutputStream2 = (com.google.protobuf.CodedOutputStream) com.google.protobuf.Internal.checkNotNull(codedOutputStream, org.jacoco.core.runtime.AgentOptions.OUTPUT);
        this.output = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }

    @Override // com.google.protobuf.Writer
    public com.google.protobuf.Writer.FieldOrder fieldOrder() {
        return com.google.protobuf.Writer.FieldOrder.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    @Override // com.google.protobuf.Writer
    public void writeSFixed32(int i, int i2) throws java.io.IOException {
        this.output.writeSFixed32(i, i2);
    }

    @Override // com.google.protobuf.Writer
    public void writeInt64(int i, long j) throws java.io.IOException {
        this.output.writeInt64(i, j);
    }

    @Override // com.google.protobuf.Writer
    public void writeSFixed64(int i, long j) throws java.io.IOException {
        this.output.writeSFixed64(i, j);
    }

    @Override // com.google.protobuf.Writer
    public void writeFloat(int i, float f) throws java.io.IOException {
        this.output.writeFloat(i, f);
    }

    @Override // com.google.protobuf.Writer
    public void writeDouble(int i, double d) throws java.io.IOException {
        this.output.writeDouble(i, d);
    }

    @Override // com.google.protobuf.Writer
    public void writeEnum(int i, int i2) throws java.io.IOException {
        this.output.writeEnum(i, i2);
    }

    @Override // com.google.protobuf.Writer
    public void writeUInt64(int i, long j) throws java.io.IOException {
        this.output.writeUInt64(i, j);
    }

    @Override // com.google.protobuf.Writer
    public void writeInt32(int i, int i2) throws java.io.IOException {
        this.output.writeInt32(i, i2);
    }

    @Override // com.google.protobuf.Writer
    public void writeFixed64(int i, long j) throws java.io.IOException {
        this.output.writeFixed64(i, j);
    }

    @Override // com.google.protobuf.Writer
    public void writeFixed32(int i, int i2) throws java.io.IOException {
        this.output.writeFixed32(i, i2);
    }

    @Override // com.google.protobuf.Writer
    public void writeBool(int i, boolean z) throws java.io.IOException {
        this.output.writeBool(i, z);
    }

    @Override // com.google.protobuf.Writer
    public void writeString(int i, java.lang.String str) throws java.io.IOException {
        this.output.writeString(i, str);
    }

    @Override // com.google.protobuf.Writer
    public void writeBytes(int i, com.google.protobuf.ByteString byteString) throws java.io.IOException {
        this.output.writeBytes(i, byteString);
    }

    @Override // com.google.protobuf.Writer
    public void writeUInt32(int i, int i2) throws java.io.IOException {
        this.output.writeUInt32(i, i2);
    }

    @Override // com.google.protobuf.Writer
    public void writeSInt32(int i, int i2) throws java.io.IOException {
        this.output.writeSInt32(i, i2);
    }

    @Override // com.google.protobuf.Writer
    public void writeSInt64(int i, long j) throws java.io.IOException {
        this.output.writeSInt64(i, j);
    }

    @Override // com.google.protobuf.Writer
    public void writeMessage(int i, java.lang.Object obj) throws java.io.IOException {
        this.output.writeMessage(i, (com.google.protobuf.MessageLite) obj);
    }

    @Override // com.google.protobuf.Writer
    public void writeMessage(int i, java.lang.Object obj, com.google.protobuf.Schema schema) throws java.io.IOException {
        this.output.writeMessage(i, (com.google.protobuf.MessageLite) obj, schema);
    }

    @Override // com.google.protobuf.Writer
    @java.lang.Deprecated
    public void writeGroup(int i, java.lang.Object obj) throws java.io.IOException {
        this.output.writeGroup(i, (com.google.protobuf.MessageLite) obj);
    }

    @Override // com.google.protobuf.Writer
    public void writeGroup(int i, java.lang.Object obj, com.google.protobuf.Schema schema) throws java.io.IOException {
        this.output.writeGroup(i, (com.google.protobuf.MessageLite) obj, schema);
    }

    @Override // com.google.protobuf.Writer
    @java.lang.Deprecated
    public void writeStartGroup(int i) throws java.io.IOException {
        this.output.writeTag(i, 3);
    }

    @Override // com.google.protobuf.Writer
    @java.lang.Deprecated
    public void writeEndGroup(int i) throws java.io.IOException {
        this.output.writeTag(i, 4);
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageSetItem(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof com.google.protobuf.ByteString) {
            this.output.writeRawMessageSetExtension(i, (com.google.protobuf.ByteString) obj);
        } else {
            this.output.writeMessageSetExtension(i, (com.google.protobuf.MessageLite) obj);
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeInt32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int iComputeInt32SizeNoTag = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iComputeInt32SizeNoTag += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(list.get(i3).intValue());
            }
            this.output.writeUInt32NoTag(iComputeInt32SizeNoTag);
            while (i2 < list.size()) {
                this.output.writeInt32NoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeInt32(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeFixed32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int iComputeFixed32SizeNoTag = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iComputeFixed32SizeNoTag += com.google.protobuf.CodedOutputStream.computeFixed32SizeNoTag(list.get(i3).intValue());
            }
            this.output.writeUInt32NoTag(iComputeFixed32SizeNoTag);
            while (i2 < list.size()) {
                this.output.writeFixed32NoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeFixed32(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeInt64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int iComputeInt64SizeNoTag = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iComputeInt64SizeNoTag += com.google.protobuf.CodedOutputStream.computeInt64SizeNoTag(list.get(i3).longValue());
            }
            this.output.writeUInt32NoTag(iComputeInt64SizeNoTag);
            while (i2 < list.size()) {
                this.output.writeInt64NoTag(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeInt64(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeUInt64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int iComputeUInt64SizeNoTag = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iComputeUInt64SizeNoTag += com.google.protobuf.CodedOutputStream.computeUInt64SizeNoTag(list.get(i3).longValue());
            }
            this.output.writeUInt32NoTag(iComputeUInt64SizeNoTag);
            while (i2 < list.size()) {
                this.output.writeUInt64NoTag(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeUInt64(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeFixed64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int iComputeFixed64SizeNoTag = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iComputeFixed64SizeNoTag += com.google.protobuf.CodedOutputStream.computeFixed64SizeNoTag(list.get(i3).longValue());
            }
            this.output.writeUInt32NoTag(iComputeFixed64SizeNoTag);
            while (i2 < list.size()) {
                this.output.writeFixed64NoTag(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeFixed64(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeFloatList(int i, java.util.List<java.lang.Float> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int iComputeFloatSizeNoTag = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iComputeFloatSizeNoTag += com.google.protobuf.CodedOutputStream.computeFloatSizeNoTag(list.get(i3).floatValue());
            }
            this.output.writeUInt32NoTag(iComputeFloatSizeNoTag);
            while (i2 < list.size()) {
                this.output.writeFloatNoTag(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeFloat(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeDoubleList(int i, java.util.List<java.lang.Double> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int iComputeDoubleSizeNoTag = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iComputeDoubleSizeNoTag += com.google.protobuf.CodedOutputStream.computeDoubleSizeNoTag(list.get(i3).doubleValue());
            }
            this.output.writeUInt32NoTag(iComputeDoubleSizeNoTag);
            while (i2 < list.size()) {
                this.output.writeDoubleNoTag(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeDouble(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeEnumList(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int iComputeEnumSizeNoTag = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iComputeEnumSizeNoTag += com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(list.get(i3).intValue());
            }
            this.output.writeUInt32NoTag(iComputeEnumSizeNoTag);
            while (i2 < list.size()) {
                this.output.writeEnumNoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeEnum(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeBoolList(int i, java.util.List<java.lang.Boolean> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int iComputeBoolSizeNoTag = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iComputeBoolSizeNoTag += com.google.protobuf.CodedOutputStream.computeBoolSizeNoTag(list.get(i3).booleanValue());
            }
            this.output.writeUInt32NoTag(iComputeBoolSizeNoTag);
            while (i2 < list.size()) {
                this.output.writeBoolNoTag(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeBool(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeStringList(int i, java.util.List<java.lang.String> list) throws java.io.IOException {
        int i2 = 0;
        if (list instanceof com.google.protobuf.LazyStringList) {
            com.google.protobuf.LazyStringList lazyStringList = (com.google.protobuf.LazyStringList) list;
            while (i2 < list.size()) {
                writeLazyString(i, lazyStringList.getRaw(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeString(i, list.get(i2));
            i2++;
        }
    }

    private void writeLazyString(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            this.output.writeString(i, (java.lang.String) obj);
        } else {
            this.output.writeBytes(i, (com.google.protobuf.ByteString) obj);
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeBytesList(int i, java.util.List<com.google.protobuf.ByteString> list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.output.writeBytes(i, list.get(i2));
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeUInt32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int iComputeUInt32SizeNoTag = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iComputeUInt32SizeNoTag += com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(list.get(i3).intValue());
            }
            this.output.writeUInt32NoTag(iComputeUInt32SizeNoTag);
            while (i2 < list.size()) {
                this.output.writeUInt32NoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeUInt32(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeSFixed32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int iComputeSFixed32SizeNoTag = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iComputeSFixed32SizeNoTag += com.google.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(list.get(i3).intValue());
            }
            this.output.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
            while (i2 < list.size()) {
                this.output.writeSFixed32NoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeSFixed32(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeSFixed64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int iComputeSFixed64SizeNoTag = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iComputeSFixed64SizeNoTag += com.google.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(list.get(i3).longValue());
            }
            this.output.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
            while (i2 < list.size()) {
                this.output.writeSFixed64NoTag(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeSFixed64(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeSInt32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int iComputeSInt32SizeNoTag = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iComputeSInt32SizeNoTag += com.google.protobuf.CodedOutputStream.computeSInt32SizeNoTag(list.get(i3).intValue());
            }
            this.output.writeUInt32NoTag(iComputeSInt32SizeNoTag);
            while (i2 < list.size()) {
                this.output.writeSInt32NoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeSInt32(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeSInt64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int iComputeSInt64SizeNoTag = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iComputeSInt64SizeNoTag += com.google.protobuf.CodedOutputStream.computeSInt64SizeNoTag(list.get(i3).longValue());
            }
            this.output.writeUInt32NoTag(iComputeSInt64SizeNoTag);
            while (i2 < list.size()) {
                this.output.writeSInt64NoTag(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeSInt64(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeMessageList(int i, java.util.List<?> list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            writeMessage(i, list.get(i2));
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeMessageList(int i, java.util.List<?> list, com.google.protobuf.Schema schema) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            writeMessage(i, list.get(i2), schema);
        }
    }

    @Override // com.google.protobuf.Writer
    @java.lang.Deprecated
    public void writeGroupList(int i, java.util.List<?> list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            writeGroup(i, list.get(i2));
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeGroupList(int i, java.util.List<?> list, com.google.protobuf.Schema schema) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            writeGroup(i, list.get(i2), schema);
        }
    }

    @Override // com.google.protobuf.Writer
    public <K, V> void writeMap(int i, com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> map) throws java.io.IOException {
        if (this.output.isSerializationDeterministic()) {
            writeDeterministicMap(i, metadata, map);
            return;
        }
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(com.google.protobuf.MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
            com.google.protobuf.MapEntryLite.writeTo(this.output, metadata, entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    private <K, V> void writeDeterministicMap(int i, com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> map) throws java.io.IOException {
        switch (com.google.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[metadata.keyType.ordinal()]) {
            case 1:
                V v = map.get(java.lang.Boolean.FALSE);
                if (v != null) {
                    writeDeterministicBooleanMapEntry(i, false, v, metadata);
                }
                V v2 = map.get(java.lang.Boolean.TRUE);
                if (v2 != null) {
                    writeDeterministicBooleanMapEntry(i, true, v2, metadata);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                writeDeterministicIntegerMap(i, metadata, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                writeDeterministicLongMap(i, metadata, map);
                return;
            case 12:
                writeDeterministicStringMap(i, metadata, map);
                return;
            default:
                throw new java.lang.IllegalArgumentException("does not support key type: " + metadata.keyType);
        }
    }

    private <V> void writeDeterministicBooleanMapEntry(int i, boolean z, V v, com.google.protobuf.MapEntryLite.Metadata<java.lang.Boolean, V> metadata) throws java.io.IOException {
        this.output.writeTag(i, 2);
        this.output.writeUInt32NoTag(com.google.protobuf.MapEntryLite.computeSerializedSize(metadata, java.lang.Boolean.valueOf(z), v));
        com.google.protobuf.MapEntryLite.writeTo(this.output, metadata, java.lang.Boolean.valueOf(z), v);
    }

    private <V> void writeDeterministicIntegerMap(int i, com.google.protobuf.MapEntryLite.Metadata<java.lang.Integer, V> metadata, java.util.Map<java.lang.Integer, V> map) throws java.io.IOException {
        int size = map.size();
        int[] iArr = new int[size];
        java.util.Iterator<java.lang.Integer> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        java.util.Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(java.lang.Integer.valueOf(i4));
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(com.google.protobuf.MapEntryLite.computeSerializedSize(metadata, java.lang.Integer.valueOf(i4), v));
            com.google.protobuf.MapEntryLite.writeTo(this.output, metadata, java.lang.Integer.valueOf(i4), v);
        }
    }

    private <V> void writeDeterministicLongMap(int i, com.google.protobuf.MapEntryLite.Metadata<java.lang.Long, V> metadata, java.util.Map<java.lang.Long, V> map) throws java.io.IOException {
        int size = map.size();
        long[] jArr = new long[size];
        java.util.Iterator<java.lang.Long> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        java.util.Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(java.lang.Long.valueOf(j));
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(com.google.protobuf.MapEntryLite.computeSerializedSize(metadata, java.lang.Long.valueOf(j), v));
            com.google.protobuf.MapEntryLite.writeTo(this.output, metadata, java.lang.Long.valueOf(j), v);
        }
    }

    private <V> void writeDeterministicStringMap(int i, com.google.protobuf.MapEntryLite.Metadata<java.lang.String, V> metadata, java.util.Map<java.lang.String, V> map) throws java.io.IOException {
        int size = map.size();
        java.lang.String[] strArr = new java.lang.String[size];
        java.util.Iterator<java.lang.String> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            strArr[i2] = it.next();
            i2++;
        }
        java.util.Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            java.lang.String str = strArr[i3];
            V v = map.get(str);
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(com.google.protobuf.MapEntryLite.computeSerializedSize(metadata, str, v));
            com.google.protobuf.MapEntryLite.writeTo(this.output, metadata, str, v);
        }
    }
}
