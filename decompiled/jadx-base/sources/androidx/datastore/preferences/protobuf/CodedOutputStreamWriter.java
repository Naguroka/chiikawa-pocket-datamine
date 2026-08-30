package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
final class CodedOutputStreamWriter implements androidx.datastore.preferences.protobuf.Writer {
    private final androidx.datastore.preferences.protobuf.CodedOutputStream output;

    public static androidx.datastore.preferences.protobuf.CodedOutputStreamWriter forCodedOutput(androidx.datastore.preferences.protobuf.CodedOutputStream output) {
        if (output.wrapper != null) {
            return output.wrapper;
        }
        return new androidx.datastore.preferences.protobuf.CodedOutputStreamWriter(output);
    }

    private CodedOutputStreamWriter(androidx.datastore.preferences.protobuf.CodedOutputStream output) {
        androidx.datastore.preferences.protobuf.CodedOutputStream codedOutputStream = (androidx.datastore.preferences.protobuf.CodedOutputStream) androidx.datastore.preferences.protobuf.Internal.checkNotNull(output, org.jacoco.core.runtime.AgentOptions.OUTPUT);
        this.output = codedOutputStream;
        codedOutputStream.wrapper = this;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public androidx.datastore.preferences.protobuf.Writer.FieldOrder fieldOrder() {
        return androidx.datastore.preferences.protobuf.Writer.FieldOrder.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32(int fieldNumber, int value) throws java.io.IOException {
        this.output.writeSFixed32(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64(int fieldNumber, long value) throws java.io.IOException {
        this.output.writeInt64(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64(int fieldNumber, long value) throws java.io.IOException {
        this.output.writeSFixed64(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFloat(int fieldNumber, float value) throws java.io.IOException {
        this.output.writeFloat(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeDouble(int fieldNumber, double value) throws java.io.IOException {
        this.output.writeDouble(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEnum(int fieldNumber, int value) throws java.io.IOException {
        this.output.writeEnum(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64(int fieldNumber, long value) throws java.io.IOException {
        this.output.writeUInt64(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32(int fieldNumber, int value) throws java.io.IOException {
        this.output.writeInt32(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64(int fieldNumber, long value) throws java.io.IOException {
        this.output.writeFixed64(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32(int fieldNumber, int value) throws java.io.IOException {
        this.output.writeFixed32(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBool(int fieldNumber, boolean value) throws java.io.IOException {
        this.output.writeBool(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeString(int fieldNumber, java.lang.String value) throws java.io.IOException {
        this.output.writeString(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBytes(int fieldNumber, androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException {
        this.output.writeBytes(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32(int fieldNumber, int value) throws java.io.IOException {
        this.output.writeUInt32(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32(int fieldNumber, int value) throws java.io.IOException {
        this.output.writeSInt32(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64(int fieldNumber, long value) throws java.io.IOException {
        this.output.writeSInt64(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessage(int fieldNumber, java.lang.Object value) throws java.io.IOException {
        this.output.writeMessage(fieldNumber, (androidx.datastore.preferences.protobuf.MessageLite) value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessage(int fieldNumber, java.lang.Object value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
        this.output.writeMessage(fieldNumber, (androidx.datastore.preferences.protobuf.MessageLite) value, schema);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @java.lang.Deprecated
    public void writeGroup(int fieldNumber, java.lang.Object value) throws java.io.IOException {
        this.output.writeGroup(fieldNumber, (androidx.datastore.preferences.protobuf.MessageLite) value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroup(int fieldNumber, java.lang.Object value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
        this.output.writeGroup(fieldNumber, (androidx.datastore.preferences.protobuf.MessageLite) value, schema);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @java.lang.Deprecated
    public void writeStartGroup(int fieldNumber) throws java.io.IOException {
        this.output.writeTag(fieldNumber, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @java.lang.Deprecated
    public void writeEndGroup(int fieldNumber) throws java.io.IOException {
        this.output.writeTag(fieldNumber, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageSetItem(int fieldNumber, java.lang.Object value) throws java.io.IOException {
        if (value instanceof androidx.datastore.preferences.protobuf.ByteString) {
            this.output.writeRawMessageSetExtension(fieldNumber, (androidx.datastore.preferences.protobuf.ByteString) value);
        } else {
            this.output.writeMessageSetExtension(fieldNumber, (androidx.datastore.preferences.protobuf.MessageLite) value);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32List(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        if (value instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            writeInt32ListInternal(fieldNumber, (androidx.datastore.preferences.protobuf.IntArrayList) value, packed);
        } else {
            writeInt32ListInternal(fieldNumber, value, packed);
        }
    }

    private void writeInt32ListInternal(int fieldNumber, androidx.datastore.preferences.protobuf.IntArrayList value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeInt32SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeInt32SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt32SizeNoTag(value.getInt(i2));
            }
            this.output.writeUInt32NoTag(iComputeInt32SizeNoTag);
            while (i < value.size()) {
                this.output.writeInt32NoTag(value.getInt(i));
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeInt32(fieldNumber, value.getInt(i));
            i++;
        }
    }

    private void writeInt32ListInternal(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeInt32SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeInt32SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt32SizeNoTag(value.get(i2).intValue());
            }
            this.output.writeUInt32NoTag(iComputeInt32SizeNoTag);
            while (i < value.size()) {
                this.output.writeInt32NoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeInt32(fieldNumber, value.get(i).intValue());
            i++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32List(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        if (value instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            writeFixed32ListInternal(fieldNumber, (androidx.datastore.preferences.protobuf.IntArrayList) value, packed);
        } else {
            writeFixed32ListInternal(fieldNumber, value, packed);
        }
    }

    private void writeFixed32ListInternal(int fieldNumber, androidx.datastore.preferences.protobuf.IntArrayList value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeFixed32SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeFixed32SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed32SizeNoTag(value.getInt(i2));
            }
            this.output.writeUInt32NoTag(iComputeFixed32SizeNoTag);
            while (i < value.size()) {
                this.output.writeFixed32NoTag(value.getInt(i));
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeFixed32(fieldNumber, value.getInt(i));
            i++;
        }
    }

    private void writeFixed32ListInternal(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeFixed32SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeFixed32SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed32SizeNoTag(value.get(i2).intValue());
            }
            this.output.writeUInt32NoTag(iComputeFixed32SizeNoTag);
            while (i < value.size()) {
                this.output.writeFixed32NoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeFixed32(fieldNumber, value.get(i).intValue());
            i++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64List(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException {
        if (value instanceof androidx.datastore.preferences.protobuf.LongArrayList) {
            writeInt64ListInternal(fieldNumber, (androidx.datastore.preferences.protobuf.LongArrayList) value, packed);
        } else {
            writeInt64ListInternal(fieldNumber, value, packed);
        }
    }

    private void writeInt64ListInternal(int fieldNumber, androidx.datastore.preferences.protobuf.LongArrayList value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeInt64SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeInt64SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt64SizeNoTag(value.getLong(i2));
            }
            this.output.writeUInt32NoTag(iComputeInt64SizeNoTag);
            while (i < value.size()) {
                this.output.writeInt64NoTag(value.getLong(i));
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeInt64(fieldNumber, value.getLong(i));
            i++;
        }
    }

    private void writeInt64ListInternal(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeInt64SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeInt64SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt64SizeNoTag(value.get(i2).longValue());
            }
            this.output.writeUInt32NoTag(iComputeInt64SizeNoTag);
            while (i < value.size()) {
                this.output.writeInt64NoTag(value.get(i).longValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeInt64(fieldNumber, value.get(i).longValue());
            i++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64List(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException {
        if (value instanceof androidx.datastore.preferences.protobuf.LongArrayList) {
            writeUInt64ListInternal(fieldNumber, (androidx.datastore.preferences.protobuf.LongArrayList) value, packed);
        } else {
            writeUInt64ListInternal(fieldNumber, value, packed);
        }
    }

    private void writeUInt64ListInternal(int fieldNumber, androidx.datastore.preferences.protobuf.LongArrayList value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeUInt64SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeUInt64SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64SizeNoTag(value.getLong(i2));
            }
            this.output.writeUInt32NoTag(iComputeUInt64SizeNoTag);
            while (i < value.size()) {
                this.output.writeUInt64NoTag(value.getLong(i));
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeUInt64(fieldNumber, value.getLong(i));
            i++;
        }
    }

    private void writeUInt64ListInternal(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeUInt64SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeUInt64SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64SizeNoTag(value.get(i2).longValue());
            }
            this.output.writeUInt32NoTag(iComputeUInt64SizeNoTag);
            while (i < value.size()) {
                this.output.writeUInt64NoTag(value.get(i).longValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeUInt64(fieldNumber, value.get(i).longValue());
            i++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64List(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException {
        if (value instanceof androidx.datastore.preferences.protobuf.LongArrayList) {
            writeFixed64ListInternal(fieldNumber, (androidx.datastore.preferences.protobuf.LongArrayList) value, packed);
        } else {
            writeFixed64ListInternal(fieldNumber, value, packed);
        }
    }

    private void writeFixed64ListInternal(int fieldNumber, androidx.datastore.preferences.protobuf.LongArrayList value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeFixed64SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeFixed64SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed64SizeNoTag(value.getLong(i2));
            }
            this.output.writeUInt32NoTag(iComputeFixed64SizeNoTag);
            while (i < value.size()) {
                this.output.writeFixed64NoTag(value.getLong(i));
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeFixed64(fieldNumber, value.getLong(i));
            i++;
        }
    }

    private void writeFixed64ListInternal(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeFixed64SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeFixed64SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed64SizeNoTag(value.get(i2).longValue());
            }
            this.output.writeUInt32NoTag(iComputeFixed64SizeNoTag);
            while (i < value.size()) {
                this.output.writeFixed64NoTag(value.get(i).longValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeFixed64(fieldNumber, value.get(i).longValue());
            i++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFloatList(int fieldNumber, java.util.List<java.lang.Float> value, boolean packed) throws java.io.IOException {
        if (value instanceof androidx.datastore.preferences.protobuf.FloatArrayList) {
            writeFloatListInternal(fieldNumber, (androidx.datastore.preferences.protobuf.FloatArrayList) value, packed);
        } else {
            writeFloatListInternal(fieldNumber, value, packed);
        }
    }

    private void writeFloatListInternal(int fieldNumber, androidx.datastore.preferences.protobuf.FloatArrayList value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeFloatSizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeFloatSizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeFloatSizeNoTag(value.getFloat(i2));
            }
            this.output.writeUInt32NoTag(iComputeFloatSizeNoTag);
            while (i < value.size()) {
                this.output.writeFloatNoTag(value.getFloat(i));
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeFloat(fieldNumber, value.getFloat(i));
            i++;
        }
    }

    private void writeFloatListInternal(int fieldNumber, java.util.List<java.lang.Float> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeFloatSizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeFloatSizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeFloatSizeNoTag(value.get(i2).floatValue());
            }
            this.output.writeUInt32NoTag(iComputeFloatSizeNoTag);
            while (i < value.size()) {
                this.output.writeFloatNoTag(value.get(i).floatValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeFloat(fieldNumber, value.get(i).floatValue());
            i++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeDoubleList(int fieldNumber, java.util.List<java.lang.Double> value, boolean packed) throws java.io.IOException {
        if (value instanceof androidx.datastore.preferences.protobuf.DoubleArrayList) {
            writeDoubleListInternal(fieldNumber, (androidx.datastore.preferences.protobuf.DoubleArrayList) value, packed);
        } else {
            writeDoubleListInternal(fieldNumber, value, packed);
        }
    }

    private void writeDoubleListInternal(int fieldNumber, androidx.datastore.preferences.protobuf.DoubleArrayList value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeDoubleSizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeDoubleSizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeDoubleSizeNoTag(value.getDouble(i2));
            }
            this.output.writeUInt32NoTag(iComputeDoubleSizeNoTag);
            while (i < value.size()) {
                this.output.writeDoubleNoTag(value.getDouble(i));
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeDouble(fieldNumber, value.getDouble(i));
            i++;
        }
    }

    private void writeDoubleListInternal(int fieldNumber, java.util.List<java.lang.Double> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeDoubleSizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeDoubleSizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeDoubleSizeNoTag(value.get(i2).doubleValue());
            }
            this.output.writeUInt32NoTag(iComputeDoubleSizeNoTag);
            while (i < value.size()) {
                this.output.writeDoubleNoTag(value.get(i).doubleValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeDouble(fieldNumber, value.get(i).doubleValue());
            i++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEnumList(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        if (value instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            writeEnumListInternal(fieldNumber, (androidx.datastore.preferences.protobuf.IntArrayList) value, packed);
        } else {
            writeEnumListInternal(fieldNumber, value, packed);
        }
    }

    private void writeEnumListInternal(int fieldNumber, androidx.datastore.preferences.protobuf.IntArrayList value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeEnumSizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeEnumSizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(value.getInt(i2));
            }
            this.output.writeUInt32NoTag(iComputeEnumSizeNoTag);
            while (i < value.size()) {
                this.output.writeEnumNoTag(value.getInt(i));
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeEnum(fieldNumber, value.getInt(i));
            i++;
        }
    }

    private void writeEnumListInternal(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeEnumSizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeEnumSizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(value.get(i2).intValue());
            }
            this.output.writeUInt32NoTag(iComputeEnumSizeNoTag);
            while (i < value.size()) {
                this.output.writeEnumNoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeEnum(fieldNumber, value.get(i).intValue());
            i++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBoolList(int fieldNumber, java.util.List<java.lang.Boolean> value, boolean packed) throws java.io.IOException {
        if (value instanceof androidx.datastore.preferences.protobuf.BooleanArrayList) {
            writeBoolListInternal(fieldNumber, (androidx.datastore.preferences.protobuf.BooleanArrayList) value, packed);
        } else {
            writeBoolListInternal(fieldNumber, value, packed);
        }
    }

    private void writeBoolListInternal(int fieldNumber, androidx.datastore.preferences.protobuf.BooleanArrayList value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeBoolSizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeBoolSizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeBoolSizeNoTag(value.getBoolean(i2));
            }
            this.output.writeUInt32NoTag(iComputeBoolSizeNoTag);
            while (i < value.size()) {
                this.output.writeBoolNoTag(value.getBoolean(i));
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeBool(fieldNumber, value.getBoolean(i));
            i++;
        }
    }

    private void writeBoolListInternal(int fieldNumber, java.util.List<java.lang.Boolean> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeBoolSizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeBoolSizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeBoolSizeNoTag(value.get(i2).booleanValue());
            }
            this.output.writeUInt32NoTag(iComputeBoolSizeNoTag);
            while (i < value.size()) {
                this.output.writeBoolNoTag(value.get(i).booleanValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeBool(fieldNumber, value.get(i).booleanValue());
            i++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeStringList(int fieldNumber, java.util.List<java.lang.String> value) throws java.io.IOException {
        int i = 0;
        if (value instanceof androidx.datastore.preferences.protobuf.LazyStringList) {
            androidx.datastore.preferences.protobuf.LazyStringList lazyStringList = (androidx.datastore.preferences.protobuf.LazyStringList) value;
            while (i < value.size()) {
                writeLazyString(fieldNumber, lazyStringList.getRaw(i));
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeString(fieldNumber, value.get(i));
            i++;
        }
    }

    private void writeLazyString(int fieldNumber, java.lang.Object value) throws java.io.IOException {
        if (value instanceof java.lang.String) {
            this.output.writeString(fieldNumber, (java.lang.String) value);
        } else {
            this.output.writeBytes(fieldNumber, (androidx.datastore.preferences.protobuf.ByteString) value);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBytesList(int fieldNumber, java.util.List<androidx.datastore.preferences.protobuf.ByteString> value) throws java.io.IOException {
        for (int i = 0; i < value.size(); i++) {
            this.output.writeBytes(fieldNumber, value.get(i));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32List(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        if (value instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            writeUInt32ListInternal(fieldNumber, (androidx.datastore.preferences.protobuf.IntArrayList) value, packed);
        } else {
            writeUInt32ListInternal(fieldNumber, value, packed);
        }
    }

    private void writeUInt32ListInternal(int fieldNumber, androidx.datastore.preferences.protobuf.IntArrayList value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeUInt32SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeUInt32SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(value.getInt(i2));
            }
            this.output.writeUInt32NoTag(iComputeUInt32SizeNoTag);
            while (i < value.size()) {
                this.output.writeUInt32NoTag(value.getInt(i));
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeUInt32(fieldNumber, value.getInt(i));
            i++;
        }
    }

    public void writeUInt32ListInternal(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeUInt32SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeUInt32SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(value.get(i2).intValue());
            }
            this.output.writeUInt32NoTag(iComputeUInt32SizeNoTag);
            while (i < value.size()) {
                this.output.writeUInt32NoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeUInt32(fieldNumber, value.get(i).intValue());
            i++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32List(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        if (value instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            writeSFixed32ListInternal(fieldNumber, (androidx.datastore.preferences.protobuf.IntArrayList) value, packed);
        } else {
            writeSFixed32ListInternal(fieldNumber, value, packed);
        }
    }

    private void writeSFixed32ListInternal(int fieldNumber, androidx.datastore.preferences.protobuf.IntArrayList value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeSFixed32SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeSFixed32SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(value.getInt(i2));
            }
            this.output.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
            while (i < value.size()) {
                this.output.writeSFixed32NoTag(value.getInt(i));
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeSFixed32(fieldNumber, value.getInt(i));
            i++;
        }
    }

    private void writeSFixed32ListInternal(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeSFixed32SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeSFixed32SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(value.get(i2).intValue());
            }
            this.output.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
            while (i < value.size()) {
                this.output.writeSFixed32NoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeSFixed32(fieldNumber, value.get(i).intValue());
            i++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64List(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException {
        if (value instanceof androidx.datastore.preferences.protobuf.LongArrayList) {
            writeSFixed64ListInternal(fieldNumber, (androidx.datastore.preferences.protobuf.LongArrayList) value, packed);
        } else {
            writeSFixed64ListInternal(fieldNumber, value, packed);
        }
    }

    private void writeSFixed64ListInternal(int fieldNumber, androidx.datastore.preferences.protobuf.LongArrayList value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeSFixed64SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeSFixed64SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(value.getLong(i2));
            }
            this.output.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
            while (i < value.size()) {
                this.output.writeSFixed64NoTag(value.getLong(i));
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeSFixed64(fieldNumber, value.getLong(i));
            i++;
        }
    }

    private void writeSFixed64ListInternal(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeSFixed64SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeSFixed64SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(value.get(i2).longValue());
            }
            this.output.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
            while (i < value.size()) {
                this.output.writeSFixed64NoTag(value.get(i).longValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeSFixed64(fieldNumber, value.get(i).longValue());
            i++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32List(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        if (value instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            writeSInt32ListInternal(fieldNumber, (androidx.datastore.preferences.protobuf.IntArrayList) value, packed);
        } else {
            writeSInt32ListInternal(fieldNumber, value, packed);
        }
    }

    private void writeSInt32ListInternal(int fieldNumber, androidx.datastore.preferences.protobuf.IntArrayList value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeSInt32SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeSInt32SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt32SizeNoTag(value.getInt(i2));
            }
            this.output.writeUInt32NoTag(iComputeSInt32SizeNoTag);
            while (i < value.size()) {
                this.output.writeSInt32NoTag(value.getInt(i));
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeSInt32(fieldNumber, value.getInt(i));
            i++;
        }
    }

    public void writeSInt32ListInternal(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeSInt32SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeSInt32SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt32SizeNoTag(value.get(i2).intValue());
            }
            this.output.writeUInt32NoTag(iComputeSInt32SizeNoTag);
            while (i < value.size()) {
                this.output.writeSInt32NoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeSInt32(fieldNumber, value.get(i).intValue());
            i++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64List(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException {
        if (value instanceof androidx.datastore.preferences.protobuf.LongArrayList) {
            writeSInt64ListInternal(fieldNumber, (androidx.datastore.preferences.protobuf.LongArrayList) value, packed);
        } else {
            writeSInt64ListInternal(fieldNumber, value, packed);
        }
    }

    private void writeSInt64ListInternal(int fieldNumber, androidx.datastore.preferences.protobuf.LongArrayList value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeSInt64SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeSInt64SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt64SizeNoTag(value.getLong(i2));
            }
            this.output.writeUInt32NoTag(iComputeSInt64SizeNoTag);
            while (i < value.size()) {
                this.output.writeSInt64NoTag(value.getLong(i));
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeSInt64(fieldNumber, value.getLong(i));
            i++;
        }
    }

    private void writeSInt64ListInternal(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int iComputeSInt64SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeSInt64SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt64SizeNoTag(value.get(i2).longValue());
            }
            this.output.writeUInt32NoTag(iComputeSInt64SizeNoTag);
            while (i < value.size()) {
                this.output.writeSInt64NoTag(value.get(i).longValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeSInt64(fieldNumber, value.get(i).longValue());
            i++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessageList(int fieldNumber, java.util.List<?> value) throws java.io.IOException {
        for (int i = 0; i < value.size(); i++) {
            writeMessage(fieldNumber, value.get(i));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessageList(int fieldNumber, java.util.List<?> value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
        for (int i = 0; i < value.size(); i++) {
            writeMessage(fieldNumber, value.get(i), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @java.lang.Deprecated
    public void writeGroupList(int fieldNumber, java.util.List<?> value) throws java.io.IOException {
        for (int i = 0; i < value.size(); i++) {
            writeGroup(fieldNumber, value.get(i));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroupList(int fieldNumber, java.util.List<?> value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
        for (int i = 0; i < value.size(); i++) {
            writeGroup(fieldNumber, value.get(i), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public <K, V> void writeMap(int fieldNumber, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> map) throws java.io.IOException {
        if (this.output.isSerializationDeterministic()) {
            writeDeterministicMap(fieldNumber, metadata, map);
            return;
        }
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            this.output.writeTag(fieldNumber, 2);
            this.output.writeUInt32NoTag(androidx.datastore.preferences.protobuf.MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
            androidx.datastore.preferences.protobuf.MapEntryLite.writeTo(this.output, metadata, entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    private <K, V> void writeDeterministicMap(int fieldNumber, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> map) throws java.io.IOException {
        switch (androidx.datastore.preferences.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[metadata.keyType.ordinal()]) {
            case 1:
                V v = map.get(java.lang.Boolean.FALSE);
                if (v != null) {
                    writeDeterministicBooleanMapEntry(fieldNumber, false, v, metadata);
                }
                V v2 = map.get(java.lang.Boolean.TRUE);
                if (v2 != null) {
                    writeDeterministicBooleanMapEntry(fieldNumber, true, v2, metadata);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                writeDeterministicIntegerMap(fieldNumber, metadata, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                writeDeterministicLongMap(fieldNumber, metadata, map);
                return;
            case 12:
                writeDeterministicStringMap(fieldNumber, metadata, map);
                return;
            default:
                throw new java.lang.IllegalArgumentException("does not support key type: " + metadata.keyType);
        }
    }

    private <V> void writeDeterministicBooleanMapEntry(int fieldNumber, boolean key, V value, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<java.lang.Boolean, V> metadata) throws java.io.IOException {
        this.output.writeTag(fieldNumber, 2);
        this.output.writeUInt32NoTag(androidx.datastore.preferences.protobuf.MapEntryLite.computeSerializedSize(metadata, java.lang.Boolean.valueOf(key), value));
        androidx.datastore.preferences.protobuf.MapEntryLite.writeTo(this.output, metadata, java.lang.Boolean.valueOf(key), value);
    }

    private <V> void writeDeterministicIntegerMap(int fieldNumber, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<java.lang.Integer, V> metadata, java.util.Map<java.lang.Integer, V> map) throws java.io.IOException {
        int size = map.size();
        int[] iArr = new int[size];
        java.util.Iterator<java.lang.Integer> it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        java.util.Arrays.sort(iArr);
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = iArr[i2];
            V v = map.get(java.lang.Integer.valueOf(i3));
            this.output.writeTag(fieldNumber, 2);
            this.output.writeUInt32NoTag(androidx.datastore.preferences.protobuf.MapEntryLite.computeSerializedSize(metadata, java.lang.Integer.valueOf(i3), v));
            androidx.datastore.preferences.protobuf.MapEntryLite.writeTo(this.output, metadata, java.lang.Integer.valueOf(i3), v);
        }
    }

    private <V> void writeDeterministicLongMap(int fieldNumber, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<java.lang.Long, V> metadata, java.util.Map<java.lang.Long, V> map) throws java.io.IOException {
        int size = map.size();
        long[] jArr = new long[size];
        java.util.Iterator<java.lang.Long> it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        java.util.Arrays.sort(jArr);
        for (int i2 = 0; i2 < size; i2++) {
            long j = jArr[i2];
            V v = map.get(java.lang.Long.valueOf(j));
            this.output.writeTag(fieldNumber, 2);
            this.output.writeUInt32NoTag(androidx.datastore.preferences.protobuf.MapEntryLite.computeSerializedSize(metadata, java.lang.Long.valueOf(j), v));
            androidx.datastore.preferences.protobuf.MapEntryLite.writeTo(this.output, metadata, java.lang.Long.valueOf(j), v);
        }
    }

    private <V> void writeDeterministicStringMap(int fieldNumber, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<java.lang.String, V> metadata, java.util.Map<java.lang.String, V> map) throws java.io.IOException {
        int size = map.size();
        java.lang.String[] strArr = new java.lang.String[size];
        java.util.Iterator<java.lang.String> it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            strArr[i] = it.next();
            i++;
        }
        java.util.Arrays.sort(strArr);
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.String str = strArr[i2];
            V v = map.get(str);
            this.output.writeTag(fieldNumber, 2);
            this.output.writeUInt32NoTag(androidx.datastore.preferences.protobuf.MapEntryLite.computeSerializedSize(metadata, str, v));
            androidx.datastore.preferences.protobuf.MapEntryLite.writeTo(this.output, metadata, str, v);
        }
    }
}
