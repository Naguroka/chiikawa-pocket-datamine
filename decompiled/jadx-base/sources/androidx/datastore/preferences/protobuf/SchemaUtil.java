package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final java.lang.Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_FULL_SCHEMA = getUnknownFieldSetSchema();
    private static final androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = new androidx.datastore.preferences.protobuf.UnknownFieldSetLiteSchema();

    public static boolean shouldUseTableSwitch(int lo, int hi, int numFields) {
        if (hi < 40) {
            return true;
        }
        long j = (((long) hi) - ((long) lo)) + 1;
        long j2 = numFields;
        return j + 9 <= ((2 * j2) + 3) + ((j2 + 3) * 3);
    }

    private SchemaUtil() {
    }

    public static void requireGeneratedMessage(java.lang.Class<?> messageType) {
        java.lang.Class<?> cls;
        if (!androidx.datastore.preferences.protobuf.GeneratedMessageLite.class.isAssignableFrom(messageType) && !androidx.datastore.preferences.protobuf.Protobuf.assumeLiteRuntime && (cls = GENERATED_MESSAGE_CLASS) != null && !cls.isAssignableFrom(messageType)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void writeDouble(int fieldNumber, double value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (java.lang.Double.doubleToRawLongBits(value) != 0) {
            writer.writeDouble(fieldNumber, value);
        }
    }

    public static void writeFloat(int fieldNumber, float value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (java.lang.Float.floatToRawIntBits(value) != 0) {
            writer.writeFloat(fieldNumber, value);
        }
    }

    public static void writeInt64(int fieldNumber, long value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeInt64(fieldNumber, value);
        }
    }

    public static void writeUInt64(int fieldNumber, long value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeUInt64(fieldNumber, value);
        }
    }

    public static void writeSInt64(int fieldNumber, long value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeSInt64(fieldNumber, value);
        }
    }

    public static void writeFixed64(int fieldNumber, long value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeFixed64(fieldNumber, value);
        }
    }

    public static void writeSFixed64(int fieldNumber, long value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeSFixed64(fieldNumber, value);
        }
    }

    public static void writeInt32(int fieldNumber, int value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeInt32(fieldNumber, value);
        }
    }

    public static void writeUInt32(int fieldNumber, int value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeUInt32(fieldNumber, value);
        }
    }

    public static void writeSInt32(int fieldNumber, int value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeSInt32(fieldNumber, value);
        }
    }

    public static void writeFixed32(int fieldNumber, int value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeFixed32(fieldNumber, value);
        }
    }

    public static void writeSFixed32(int fieldNumber, int value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeSFixed32(fieldNumber, value);
        }
    }

    public static void writeEnum(int fieldNumber, int value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeEnum(fieldNumber, value);
        }
    }

    public static void writeBool(int fieldNumber, boolean value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value) {
            writer.writeBool(fieldNumber, true);
        }
    }

    public static void writeString(int fieldNumber, java.lang.Object value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value instanceof java.lang.String) {
            writeStringInternal(fieldNumber, (java.lang.String) value, writer);
        } else {
            writeBytes(fieldNumber, (androidx.datastore.preferences.protobuf.ByteString) value, writer);
        }
    }

    private static void writeStringInternal(int fieldNumber, java.lang.String value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeString(fieldNumber, value);
    }

    public static void writeBytes(int fieldNumber, androidx.datastore.preferences.protobuf.ByteString value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBytes(fieldNumber, value);
    }

    public static void writeMessage(int fieldNumber, java.lang.Object value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != null) {
            writer.writeMessage(fieldNumber, value);
        }
    }

    public static void writeDoubleList(int fieldNumber, java.util.List<java.lang.Double> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeDoubleList(fieldNumber, value, packed);
    }

    public static void writeFloatList(int fieldNumber, java.util.List<java.lang.Float> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFloatList(fieldNumber, value, packed);
    }

    public static void writeInt64List(int fieldNumber, java.util.List<java.lang.Long> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeInt64List(fieldNumber, value, packed);
    }

    public static void writeUInt64List(int fieldNumber, java.util.List<java.lang.Long> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeUInt64List(fieldNumber, value, packed);
    }

    public static void writeSInt64List(int fieldNumber, java.util.List<java.lang.Long> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSInt64List(fieldNumber, value, packed);
    }

    public static void writeFixed64List(int fieldNumber, java.util.List<java.lang.Long> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFixed64List(fieldNumber, value, packed);
    }

    public static void writeSFixed64List(int fieldNumber, java.util.List<java.lang.Long> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(fieldNumber, value, packed);
    }

    public static void writeInt32List(int fieldNumber, java.util.List<java.lang.Integer> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeInt32List(fieldNumber, value, packed);
    }

    public static void writeUInt32List(int fieldNumber, java.util.List<java.lang.Integer> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeUInt32List(fieldNumber, value, packed);
    }

    public static void writeSInt32List(int fieldNumber, java.util.List<java.lang.Integer> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSInt32List(fieldNumber, value, packed);
    }

    public static void writeFixed32List(int fieldNumber, java.util.List<java.lang.Integer> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFixed32List(fieldNumber, value, packed);
    }

    public static void writeSFixed32List(int fieldNumber, java.util.List<java.lang.Integer> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(fieldNumber, value, packed);
    }

    public static void writeEnumList(int fieldNumber, java.util.List<java.lang.Integer> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeEnumList(fieldNumber, value, packed);
    }

    public static void writeBoolList(int fieldNumber, java.util.List<java.lang.Boolean> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBoolList(fieldNumber, value, packed);
    }

    public static void writeStringList(int fieldNumber, java.util.List<java.lang.String> value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeStringList(fieldNumber, value);
    }

    public static void writeBytesList(int fieldNumber, java.util.List<androidx.datastore.preferences.protobuf.ByteString> value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBytesList(fieldNumber, value);
    }

    public static void writeMessageList(int fieldNumber, java.util.List<?> value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeMessageList(fieldNumber, value);
    }

    public static void writeMessageList(int fieldNumber, java.util.List<?> value, androidx.datastore.preferences.protobuf.Writer writer, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeMessageList(fieldNumber, value, schema);
    }

    public static void writeLazyFieldList(int fieldNumber, java.util.List<?> value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        java.util.Iterator<?> it = value.iterator();
        while (it.hasNext()) {
            ((androidx.datastore.preferences.protobuf.LazyFieldLite) it.next()).writeTo(writer, fieldNumber);
        }
    }

    public static void writeGroupList(int fieldNumber, java.util.List<?> value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeGroupList(fieldNumber, value);
    }

    public static void writeGroupList(int fieldNumber, java.util.List<?> value, androidx.datastore.preferences.protobuf.Writer writer, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeGroupList(fieldNumber, value, schema);
    }

    static int computeSizeInt64ListNoTag(java.util.List<java.lang.Long> list) {
        int iComputeInt64SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.LongArrayList) {
            androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) list;
            iComputeInt64SizeNoTag = 0;
            while (i < size) {
                iComputeInt64SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i));
                i++;
            }
        } else {
            iComputeInt64SizeNoTag = 0;
            while (i < size) {
                iComputeInt64SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
        }
        return iComputeInt64SizeNoTag;
    }

    static int computeSizeInt64List(int fieldNumber, java.util.List<java.lang.Long> list, boolean packed) {
        if (list.size() == 0) {
            return 0;
        }
        int iComputeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt64ListNoTag);
        }
        return iComputeSizeInt64ListNoTag + (list.size() * androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber));
    }

    static int computeSizeUInt64ListNoTag(java.util.List<java.lang.Long> list) {
        int iComputeUInt64SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.LongArrayList) {
            androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) list;
            iComputeUInt64SizeNoTag = 0;
            while (i < size) {
                iComputeUInt64SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i));
                i++;
            }
        } else {
            iComputeUInt64SizeNoTag = 0;
            while (i < size) {
                iComputeUInt64SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
        }
        return iComputeUInt64SizeNoTag;
    }

    static int computeSizeUInt64List(int fieldNumber, java.util.List<java.lang.Long> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt64ListNoTag);
        }
        return iComputeSizeUInt64ListNoTag + (size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber));
    }

    static int computeSizeSInt64ListNoTag(java.util.List<java.lang.Long> list) {
        int iComputeSInt64SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.LongArrayList) {
            androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) list;
            iComputeSInt64SizeNoTag = 0;
            while (i < size) {
                iComputeSInt64SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i));
                i++;
            }
        } else {
            iComputeSInt64SizeNoTag = 0;
            while (i < size) {
                iComputeSInt64SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
        }
        return iComputeSInt64SizeNoTag;
    }

    static int computeSizeSInt64List(int fieldNumber, java.util.List<java.lang.Long> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt64ListNoTag);
        }
        return iComputeSizeSInt64ListNoTag + (size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber));
    }

    static int computeSizeEnumListNoTag(java.util.List<java.lang.Integer> list) {
        int iComputeEnumSizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) list;
            iComputeEnumSizeNoTag = 0;
            while (i < size) {
                iComputeEnumSizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i));
                i++;
            }
        } else {
            iComputeEnumSizeNoTag = 0;
            while (i < size) {
                iComputeEnumSizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeEnumSizeNoTag;
    }

    static int computeSizeEnumList(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeEnumListNoTag);
        }
        return iComputeSizeEnumListNoTag + (size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber));
    }

    static int computeSizeInt32ListNoTag(java.util.List<java.lang.Integer> list) {
        int iComputeInt32SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) list;
            iComputeInt32SizeNoTag = 0;
            while (i < size) {
                iComputeInt32SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i));
                i++;
            }
        } else {
            iComputeInt32SizeNoTag = 0;
            while (i < size) {
                iComputeInt32SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeInt32SizeNoTag;
    }

    static int computeSizeInt32List(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt32ListNoTag);
        }
        return iComputeSizeInt32ListNoTag + (size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber));
    }

    static int computeSizeUInt32ListNoTag(java.util.List<java.lang.Integer> list) {
        int iComputeUInt32SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) list;
            iComputeUInt32SizeNoTag = 0;
            while (i < size) {
                iComputeUInt32SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i));
                i++;
            }
        } else {
            iComputeUInt32SizeNoTag = 0;
            while (i < size) {
                iComputeUInt32SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeUInt32SizeNoTag;
    }

    static int computeSizeUInt32List(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt32ListNoTag);
        }
        return iComputeSizeUInt32ListNoTag + (size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber));
    }

    static int computeSizeSInt32ListNoTag(java.util.List<java.lang.Integer> list) {
        int iComputeSInt32SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) list;
            iComputeSInt32SizeNoTag = 0;
            while (i < size) {
                iComputeSInt32SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i));
                i++;
            }
        } else {
            iComputeSInt32SizeNoTag = 0;
            while (i < size) {
                iComputeSInt32SizeNoTag += androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeSInt32SizeNoTag;
    }

    static int computeSizeSInt32List(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt32ListNoTag);
        }
        return iComputeSizeSInt32ListNoTag + (size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber));
    }

    static int computeSizeFixed32ListNoTag(java.util.List<?> list) {
        return list.size() * 4;
    }

    static int computeSizeFixed32List(int fieldNumber, java.util.List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(size * 4);
        }
        return size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed32Size(fieldNumber, 0);
    }

    static int computeSizeFixed64ListNoTag(java.util.List<?> list) {
        return list.size() * 8;
    }

    static int computeSizeFixed64List(int fieldNumber, java.util.List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(size * 8);
        }
        return size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed64Size(fieldNumber, 0L);
    }

    static int computeSizeBoolListNoTag(java.util.List<?> list) {
        return list.size();
    }

    static int computeSizeBoolList(int fieldNumber, java.util.List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(size);
        }
        return size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeBoolSize(fieldNumber, true);
    }

    static int computeSizeStringList(int fieldNumber, java.util.List<?> list) {
        int iComputeStringSizeNoTag;
        int iComputeStringSizeNoTag2;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) * size;
        if (list instanceof androidx.datastore.preferences.protobuf.LazyStringList) {
            androidx.datastore.preferences.protobuf.LazyStringList lazyStringList = (androidx.datastore.preferences.protobuf.LazyStringList) list;
            while (i < size) {
                java.lang.Object raw = lazyStringList.getRaw(i);
                if (raw instanceof androidx.datastore.preferences.protobuf.ByteString) {
                    iComputeStringSizeNoTag2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag((androidx.datastore.preferences.protobuf.ByteString) raw);
                } else {
                    iComputeStringSizeNoTag2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeStringSizeNoTag((java.lang.String) raw);
                }
                iComputeTagSize += iComputeStringSizeNoTag2;
                i++;
            }
        } else {
            while (i < size) {
                java.lang.Object obj = list.get(i);
                if (obj instanceof androidx.datastore.preferences.protobuf.ByteString) {
                    iComputeStringSizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag((androidx.datastore.preferences.protobuf.ByteString) obj);
                } else {
                    iComputeStringSizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeStringSizeNoTag((java.lang.String) obj);
                }
                iComputeTagSize += iComputeStringSizeNoTag;
                i++;
            }
        }
        return iComputeTagSize;
    }

    static int computeSizeMessage(int fieldNumber, java.lang.Object value, androidx.datastore.preferences.protobuf.Schema schema) {
        if (value instanceof androidx.datastore.preferences.protobuf.LazyFieldLite) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeLazyFieldSize(fieldNumber, (androidx.datastore.preferences.protobuf.LazyFieldLite) value);
        }
        return androidx.datastore.preferences.protobuf.CodedOutputStream.computeMessageSize(fieldNumber, (androidx.datastore.preferences.protobuf.MessageLite) value, schema);
    }

    static int computeSizeMessageList(int fieldNumber, java.util.List<?> list) {
        int iComputeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) * size;
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = list.get(i);
            if (obj instanceof androidx.datastore.preferences.protobuf.LazyFieldLite) {
                iComputeMessageSizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag((androidx.datastore.preferences.protobuf.LazyFieldLite) obj);
            } else {
                iComputeMessageSizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeMessageSizeNoTag((androidx.datastore.preferences.protobuf.MessageLite) obj);
            }
            iComputeTagSize += iComputeMessageSizeNoTag;
        }
        return iComputeTagSize;
    }

    static int computeSizeMessageList(int fieldNumber, java.util.List<?> list, androidx.datastore.preferences.protobuf.Schema schema) {
        int iComputeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) * size;
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = list.get(i);
            if (obj instanceof androidx.datastore.preferences.protobuf.LazyFieldLite) {
                iComputeMessageSizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag((androidx.datastore.preferences.protobuf.LazyFieldLite) obj);
            } else {
                iComputeMessageSizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeMessageSizeNoTag((androidx.datastore.preferences.protobuf.MessageLite) obj, schema);
            }
            iComputeTagSize += iComputeMessageSizeNoTag;
        }
        return iComputeTagSize;
    }

    static int computeSizeByteStringList(int fieldNumber, java.util.List<androidx.datastore.preferences.protobuf.ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber);
        for (int i = 0; i < list.size(); i++) {
            iComputeTagSize += androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag(list.get(i));
        }
        return iComputeTagSize;
    }

    static int computeSizeGroupList(int fieldNumber, java.util.List<androidx.datastore.preferences.protobuf.MessageLite> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i = 0; i < size; i++) {
            iComputeGroupSize += androidx.datastore.preferences.protobuf.CodedOutputStream.computeGroupSize(fieldNumber, list.get(i));
        }
        return iComputeGroupSize;
    }

    static int computeSizeGroupList(int fieldNumber, java.util.List<androidx.datastore.preferences.protobuf.MessageLite> list, androidx.datastore.preferences.protobuf.Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i = 0; i < size; i++) {
            iComputeGroupSize += androidx.datastore.preferences.protobuf.CodedOutputStream.computeGroupSize(fieldNumber, list.get(i), schema);
        }
        return iComputeGroupSize;
    }

    public static boolean shouldUseTableSwitch(androidx.datastore.preferences.protobuf.FieldInfo[] fields) {
        if (fields.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(fields[0].getFieldNumber(), fields[fields.length - 1].getFieldNumber(), fields.length);
    }

    public static androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSetFullSchema() {
        return UNKNOWN_FIELD_SET_FULL_SCHEMA;
    }

    public static androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    private static androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> getUnknownFieldSetSchema() {
        try {
            java.lang.Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (androidx.datastore.preferences.protobuf.UnknownFieldSchema) unknownFieldSetSchemaClass.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.Class<?> getGeneratedMessageClass() {
        if (androidx.datastore.preferences.protobuf.Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return java.lang.Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.Class<?> getUnknownFieldSetSchemaClass() {
        if (androidx.datastore.preferences.protobuf.Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return java.lang.Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static java.lang.Object getMapDefaultEntry(java.lang.Class<?> clazz, java.lang.String name) {
        try {
            java.lang.reflect.Field[] declaredFields = java.lang.Class.forName(clazz.getName() + "$" + toCamelCase(name, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length != 1) {
                throw new java.lang.IllegalStateException("Unable to look up map field default entry holder class for " + name + " in " + clazz.getName());
            }
            return androidx.datastore.preferences.protobuf.UnsafeUtil.getStaticObject(declaredFields[0]);
        } catch (java.lang.Throwable th) {
            throw new java.lang.RuntimeException(th);
        }
    }

    static java.lang.String toCamelCase(java.lang.String name, boolean capNext) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char cCharAt = name.charAt(i);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb.append(cCharAt);
                    }
                    capNext = true;
                } else if (i == 0 && !capNext) {
                    sb.append((char) (cCharAt + ' '));
                } else {
                    sb.append(cCharAt);
                }
            } else if (capNext) {
                sb.append((char) (cCharAt - ' '));
            } else {
                sb.append(cCharAt);
            }
            capNext = false;
        }
        return sb.toString();
    }

    static boolean safeEquals(java.lang.Object a2, java.lang.Object b) {
        return a2 == b || (a2 != null && a2.equals(b));
    }

    static <T> void mergeMap(androidx.datastore.preferences.protobuf.MapFieldSchema mapFieldSchema, T message, T o, long offset) {
        androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(message, offset, mapFieldSchema.mergeFrom(androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset), androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(o, offset)));
    }

    static <T, FT extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(androidx.datastore.preferences.protobuf.ExtensionSchema<FT> schema, T message, T other) {
        androidx.datastore.preferences.protobuf.FieldSet<T> extensions = schema.getExtensions(other);
        if (extensions.isEmpty()) {
            return;
        }
        schema.getMutableExtensions(message).mergeFrom(extensions);
    }

    static <T, UT, UB> void mergeUnknownFields(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> schema, T message, T other) {
        schema.setToMessage(message, schema.merge(schema.getFromMessage(message), schema.getFromMessage(other)));
    }

    static <UT, UB> UB filterUnknownEnumList(java.lang.Object obj, int i, java.util.List<java.lang.Integer> list, androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> enumLiteMap, UB ub, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumLiteMap == null) {
            return ub;
        }
        if (list instanceof java.util.RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = list.get(i3).intValue();
                if (enumLiteMap.findValueByNumber(iIntValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, java.lang.Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i, iIntValue, ub, unknownFieldSchema);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            java.util.Iterator<java.lang.Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (enumLiteMap.findValueByNumber(iIntValue2) == null) {
                    ub = (UB) storeUnknownEnum(obj, i, iIntValue2, ub, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB filterUnknownEnumList(java.lang.Object obj, int i, java.util.List<java.lang.Integer> list, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier, UB ub, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumVerifier == null) {
            return ub;
        }
        if (list instanceof java.util.RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = list.get(i3).intValue();
                if (enumVerifier.isInRange(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, java.lang.Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i, iIntValue, ub, unknownFieldSchema);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            java.util.Iterator<java.lang.Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!enumVerifier.isInRange(iIntValue2)) {
                    ub = (UB) storeUnknownEnum(obj, i, iIntValue2, ub, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB storeUnknownEnum(java.lang.Object obj, int i, int i2, UB ub, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (ub == null) {
            ub = unknownFieldSchema.getBuilderFromMessage(obj);
        }
        unknownFieldSchema.addVarint(ub, i, i2);
        return ub;
    }
}
