package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
final class ArrayDecoders {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    private ArrayDecoders() {
    }

    static final class Registers {
        public final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry;
        public int int1;
        public long long1;
        public java.lang.Object object1;
        public int recursionDepth;

        Registers() {
            this.extensionRegistry = androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry();
        }

        Registers(androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) {
            extensionRegistry.getClass();
            this.extensionRegistry = extensionRegistry;
        }
    }

    static int decodeVarint32(byte[] data, int position, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        int i = position + 1;
        byte b = data[position];
        if (b >= 0) {
            registers.int1 = b;
            return i;
        }
        return decodeVarint32(b, data, i, registers);
    }

    static int decodeVarint32(int firstByte, byte[] data, int position, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        int i = firstByte & 127;
        int i2 = position + 1;
        byte b = data[position];
        if (b >= 0) {
            registers.int1 = i | (b << 7);
            return i2;
        }
        int i3 = i | ((b & 127) << 7);
        int i4 = i2 + 1;
        byte b2 = data[i2];
        if (b2 >= 0) {
            registers.int1 = i3 | (b2 << 14);
            return i4;
        }
        int i5 = i3 | ((b2 & 127) << 14);
        int i6 = i4 + 1;
        byte b3 = data[i4];
        if (b3 >= 0) {
            registers.int1 = i5 | (b3 << 21);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 21);
        int i8 = i6 + 1;
        byte b4 = data[i6];
        if (b4 >= 0) {
            registers.int1 = i7 | (b4 << 28);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 28);
        while (true) {
            int i10 = i8 + 1;
            if (data[i8] >= 0) {
                registers.int1 = i9;
                return i10;
            }
            i8 = i10;
        }
    }

    static int decodeVarint64(byte[] data, int position, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        int i = position + 1;
        long j = data[position];
        if (j >= 0) {
            registers.long1 = j;
            return i;
        }
        return decodeVarint64(j, data, i, registers);
    }

    static int decodeVarint64(long firstByte, byte[] data, int position, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        int i = position + 1;
        byte b = data[position];
        long j = (firstByte & 127) | (((long) (b & 127)) << 7);
        int i2 = 7;
        while (b < 0) {
            int i3 = i + 1;
            byte b2 = data[i];
            i2 += 7;
            j |= ((long) (b2 & 127)) << i2;
            i = i3;
            b = b2;
        }
        registers.long1 = j;
        return i;
    }

    static int decodeFixed32(byte[] data, int position) {
        return ((data[position + 3] & 255) << 24) | (data[position] & 255) | ((data[position + 1] & 255) << 8) | ((data[position + 2] & 255) << 16);
    }

    static long decodeFixed64(byte[] data, int position) {
        return ((((long) data[position + 7]) & 255) << 56) | (((long) data[position]) & 255) | ((((long) data[position + 1]) & 255) << 8) | ((((long) data[position + 2]) & 255) << 16) | ((((long) data[position + 3]) & 255) << 24) | ((((long) data[position + 4]) & 255) << 32) | ((((long) data[position + 5]) & 255) << 40) | ((((long) data[position + 6]) & 255) << 48);
    }

    static double decodeDouble(byte[] data, int position) {
        return java.lang.Double.longBitsToDouble(decodeFixed64(data, position));
    }

    static float decodeFloat(byte[] data, int position) {
        return java.lang.Float.intBitsToFloat(decodeFixed32(data, position));
    }

    static int decodeString(byte[] data, int position, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i = registers.int1;
        if (i < 0) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i == 0) {
            registers.object1 = "";
            return iDecodeVarint32;
        }
        registers.object1 = new java.lang.String(data, iDecodeVarint32, i, androidx.datastore.preferences.protobuf.Internal.UTF_8);
        return iDecodeVarint32 + i;
    }

    static int decodeStringRequireUtf8(byte[] data, int position, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i = registers.int1;
        if (i < 0) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i == 0) {
            registers.object1 = "";
            return iDecodeVarint32;
        }
        registers.object1 = androidx.datastore.preferences.protobuf.Utf8.decodeUtf8(data, iDecodeVarint32, i);
        return iDecodeVarint32 + i;
    }

    static int decodeBytes(byte[] data, int position, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i = registers.int1;
        if (i < 0) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i > data.length - iDecodeVarint32) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        if (i == 0) {
            registers.object1 = androidx.datastore.preferences.protobuf.ByteString.EMPTY;
            return iDecodeVarint32;
        }
        registers.object1 = androidx.datastore.preferences.protobuf.ByteString.copyFrom(data, iDecodeVarint32, i);
        return iDecodeVarint32 + i;
    }

    static int decodeMessageField(androidx.datastore.preferences.protobuf.Schema schema, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        java.lang.Object objNewInstance = schema.newInstance();
        int iMergeMessageField = mergeMessageField(objNewInstance, schema, data, position, limit, registers);
        schema.makeImmutable(objNewInstance);
        registers.object1 = objNewInstance;
        return iMergeMessageField;
    }

    static int decodeGroupField(androidx.datastore.preferences.protobuf.Schema schema, byte[] data, int position, int limit, int endGroup, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        java.lang.Object objNewInstance = schema.newInstance();
        int iMergeGroupField = mergeGroupField(objNewInstance, schema, data, position, limit, endGroup, registers);
        schema.makeImmutable(objNewInstance);
        registers.object1 = objNewInstance;
        return iMergeGroupField;
    }

    static int mergeMessageField(java.lang.Object msg, androidx.datastore.preferences.protobuf.Schema schema, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int iDecodeVarint32 = position + 1;
        int i = data[position];
        if (i < 0) {
            iDecodeVarint32 = decodeVarint32(i, data, iDecodeVarint32, registers);
            i = registers.int1;
        }
        int i2 = iDecodeVarint32;
        if (i < 0 || i > limit - i2) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        registers.recursionDepth++;
        checkRecursionLimit(registers.recursionDepth);
        int i3 = i + i2;
        schema.mergeFrom(msg, data, i2, i3, registers);
        registers.recursionDepth--;
        registers.object1 = msg;
        return i3;
    }

    static int mergeGroupField(java.lang.Object msg, androidx.datastore.preferences.protobuf.Schema schema, byte[] data, int position, int limit, int endGroup, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        registers.recursionDepth++;
        checkRecursionLimit(registers.recursionDepth);
        int message = ((androidx.datastore.preferences.protobuf.MessageSchema) schema).parseMessage(msg, data, position, limit, endGroup, registers);
        registers.recursionDepth--;
        registers.object1 = msg;
        return message;
    }

    static int decodeVarint32List(int tag, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        intArrayList.addInt(registers.int1);
        while (iDecodeVarint32 < limit) {
            int iDecodeVarint33 = decodeVarint32(data, iDecodeVarint32, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(data, iDecodeVarint33, registers);
            intArrayList.addInt(registers.int1);
        }
        return iDecodeVarint32;
    }

    static int decodeVarint64List(int tag, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) list;
        int iDecodeVarint64 = decodeVarint64(data, position, registers);
        longArrayList.addLong(registers.long1);
        while (iDecodeVarint64 < limit) {
            int iDecodeVarint32 = decodeVarint32(data, iDecodeVarint64, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(data, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        return iDecodeVarint64;
    }

    static int decodeFixed32List(int tag, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) list;
        intArrayList.addInt(decodeFixed32(data, position));
        int i = position + 4;
        while (i < limit) {
            int iDecodeVarint32 = decodeVarint32(data, i, registers);
            if (tag != registers.int1) {
                break;
            }
            intArrayList.addInt(decodeFixed32(data, iDecodeVarint32));
            i = iDecodeVarint32 + 4;
        }
        return i;
    }

    static int decodeFixed64List(int tag, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) list;
        longArrayList.addLong(decodeFixed64(data, position));
        int i = position + 8;
        while (i < limit) {
            int iDecodeVarint32 = decodeVarint32(data, i, registers);
            if (tag != registers.int1) {
                break;
            }
            longArrayList.addLong(decodeFixed64(data, iDecodeVarint32));
            i = iDecodeVarint32 + 8;
        }
        return i;
    }

    static int decodeFloatList(int tag, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.datastore.preferences.protobuf.FloatArrayList floatArrayList = (androidx.datastore.preferences.protobuf.FloatArrayList) list;
        floatArrayList.addFloat(decodeFloat(data, position));
        int i = position + 4;
        while (i < limit) {
            int iDecodeVarint32 = decodeVarint32(data, i, registers);
            if (tag != registers.int1) {
                break;
            }
            floatArrayList.addFloat(decodeFloat(data, iDecodeVarint32));
            i = iDecodeVarint32 + 4;
        }
        return i;
    }

    static int decodeDoubleList(int tag, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.datastore.preferences.protobuf.DoubleArrayList doubleArrayList = (androidx.datastore.preferences.protobuf.DoubleArrayList) list;
        doubleArrayList.addDouble(decodeDouble(data, position));
        int i = position + 8;
        while (i < limit) {
            int iDecodeVarint32 = decodeVarint32(data, i, registers);
            if (tag != registers.int1) {
                break;
            }
            doubleArrayList.addDouble(decodeDouble(data, iDecodeVarint32));
            i = iDecodeVarint32 + 8;
        }
        return i;
    }

    static int decodeBoolList(int tag, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.datastore.preferences.protobuf.BooleanArrayList booleanArrayList = (androidx.datastore.preferences.protobuf.BooleanArrayList) list;
        int iDecodeVarint64 = decodeVarint64(data, position, registers);
        booleanArrayList.addBoolean(registers.long1 != 0);
        while (iDecodeVarint64 < limit) {
            int iDecodeVarint32 = decodeVarint32(data, iDecodeVarint64, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(data, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        return iDecodeVarint64;
    }

    static int decodeSInt32List(int tag, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        intArrayList.addInt(androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag32(registers.int1));
        while (iDecodeVarint32 < limit) {
            int iDecodeVarint33 = decodeVarint32(data, iDecodeVarint32, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(data, iDecodeVarint33, registers);
            intArrayList.addInt(androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag32(registers.int1));
        }
        return iDecodeVarint32;
    }

    static int decodeSInt64List(int tag, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) list;
        int iDecodeVarint64 = decodeVarint64(data, position, registers);
        longArrayList.addLong(androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag64(registers.long1));
        while (iDecodeVarint64 < limit) {
            int iDecodeVarint32 = decodeVarint32(data, iDecodeVarint64, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(data, iDecodeVarint32, registers);
            longArrayList.addLong(androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag64(registers.long1));
        }
        return iDecodeVarint64;
    }

    static int decodePackedVarint32List(byte[] data, int position, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i) {
            iDecodeVarint32 = decodeVarint32(data, iDecodeVarint32, registers);
            intArrayList.addInt(registers.int1);
        }
        if (iDecodeVarint32 == i) {
            return iDecodeVarint32;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedVarint64List(byte[] data, int position, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i) {
            iDecodeVarint32 = decodeVarint64(data, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        if (iDecodeVarint32 == i) {
            return iDecodeVarint32;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFixed32List(byte[] data, int position, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i) {
            intArrayList.addInt(decodeFixed32(data, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i) {
            return iDecodeVarint32;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFixed64List(byte[] data, int position, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i) {
            longArrayList.addLong(decodeFixed64(data, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i) {
            return iDecodeVarint32;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFloatList(byte[] data, int position, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.FloatArrayList floatArrayList = (androidx.datastore.preferences.protobuf.FloatArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i) {
            floatArrayList.addFloat(decodeFloat(data, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i) {
            return iDecodeVarint32;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedDoubleList(byte[] data, int position, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.DoubleArrayList doubleArrayList = (androidx.datastore.preferences.protobuf.DoubleArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i) {
            doubleArrayList.addDouble(decodeDouble(data, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i) {
            return iDecodeVarint32;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedBoolList(byte[] data, int position, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.BooleanArrayList booleanArrayList = (androidx.datastore.preferences.protobuf.BooleanArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i) {
            iDecodeVarint32 = decodeVarint64(data, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        if (iDecodeVarint32 == i) {
            return iDecodeVarint32;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedSInt32List(byte[] data, int position, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i) {
            iDecodeVarint32 = decodeVarint32(data, iDecodeVarint32, registers);
            intArrayList.addInt(androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag32(registers.int1));
        }
        if (iDecodeVarint32 == i) {
            return iDecodeVarint32;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedSInt64List(byte[] data, int position, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) list;
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i) {
            iDecodeVarint32 = decodeVarint64(data, iDecodeVarint32, registers);
            longArrayList.addLong(androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag64(registers.long1));
        }
        if (iDecodeVarint32 == i) {
            return iDecodeVarint32;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodeStringList(int tag, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i = registers.int1;
        if (i < 0) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i == 0) {
            list.add("");
        } else {
            list.add(new java.lang.String(data, iDecodeVarint32, i, androidx.datastore.preferences.protobuf.Internal.UTF_8));
            iDecodeVarint32 += i;
        }
        while (iDecodeVarint32 < limit) {
            int iDecodeVarint33 = decodeVarint32(data, iDecodeVarint32, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(data, iDecodeVarint33, registers);
            int i2 = registers.int1;
            if (i2 < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            if (i2 == 0) {
                list.add("");
            } else {
                list.add(new java.lang.String(data, iDecodeVarint32, i2, androidx.datastore.preferences.protobuf.Internal.UTF_8));
                iDecodeVarint32 += i2;
            }
        }
        return iDecodeVarint32;
    }

    static int decodeStringListRequireUtf8(int tag, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i = registers.int1;
        if (i < 0) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i == 0) {
            list.add("");
        } else {
            int i2 = iDecodeVarint32 + i;
            if (!androidx.datastore.preferences.protobuf.Utf8.isValidUtf8(data, iDecodeVarint32, i2)) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8();
            }
            list.add(new java.lang.String(data, iDecodeVarint32, i, androidx.datastore.preferences.protobuf.Internal.UTF_8));
            iDecodeVarint32 = i2;
        }
        while (iDecodeVarint32 < limit) {
            int iDecodeVarint33 = decodeVarint32(data, iDecodeVarint32, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(data, iDecodeVarint33, registers);
            int i3 = registers.int1;
            if (i3 < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            if (i3 == 0) {
                list.add("");
            } else {
                int i4 = iDecodeVarint32 + i3;
                if (!androidx.datastore.preferences.protobuf.Utf8.isValidUtf8(data, iDecodeVarint32, i4)) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8();
                }
                list.add(new java.lang.String(data, iDecodeVarint32, i3, androidx.datastore.preferences.protobuf.Internal.UTF_8));
                iDecodeVarint32 = i4;
            }
        }
        return iDecodeVarint32;
    }

    static int decodeBytesList(int tag, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(data, position, registers);
        int i = registers.int1;
        if (i < 0) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i > data.length - iDecodeVarint32) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        if (i == 0) {
            list.add(androidx.datastore.preferences.protobuf.ByteString.EMPTY);
        } else {
            list.add(androidx.datastore.preferences.protobuf.ByteString.copyFrom(data, iDecodeVarint32, i));
            iDecodeVarint32 += i;
        }
        while (iDecodeVarint32 < limit) {
            int iDecodeVarint33 = decodeVarint32(data, iDecodeVarint32, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(data, iDecodeVarint33, registers);
            int i2 = registers.int1;
            if (i2 < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            if (i2 > data.length - iDecodeVarint32) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (i2 == 0) {
                list.add(androidx.datastore.preferences.protobuf.ByteString.EMPTY);
            } else {
                list.add(androidx.datastore.preferences.protobuf.ByteString.copyFrom(data, iDecodeVarint32, i2));
                iDecodeVarint32 += i2;
            }
        }
        return iDecodeVarint32;
    }

    static int decodeMessageList(androidx.datastore.preferences.protobuf.Schema<?> schema, int tag, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int iDecodeMessageField = decodeMessageField(schema, data, position, limit, registers);
        list.add(registers.object1);
        while (iDecodeMessageField < limit) {
            int iDecodeVarint32 = decodeVarint32(data, iDecodeMessageField, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeMessageField = decodeMessageField(schema, data, iDecodeVarint32, limit, registers);
            list.add(registers.object1);
        }
        return iDecodeMessageField;
    }

    static int decodeGroupList(androidx.datastore.preferences.protobuf.Schema schema, int tag, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> list, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int i = (tag & (-8)) | 4;
        int iDecodeGroupField = decodeGroupField(schema, data, position, limit, i, registers);
        list.add(registers.object1);
        while (iDecodeGroupField < limit) {
            int iDecodeVarint32 = decodeVarint32(data, iDecodeGroupField, registers);
            if (tag != registers.int1) {
                break;
            }
            iDecodeGroupField = decodeGroupField(schema, data, iDecodeVarint32, limit, i, registers);
            list.add(registers.object1);
        }
        return iDecodeGroupField;
    }

    static int decodeExtensionOrUnknownField(int tag, byte[] data, int position, int limit, java.lang.Object message, androidx.datastore.preferences.protobuf.MessageLite defaultInstance, androidx.datastore.preferences.protobuf.UnknownFieldSchema<androidx.datastore.preferences.protobuf.UnknownFieldSetLite, androidx.datastore.preferences.protobuf.UnknownFieldSetLite> unknownFieldSchema, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = registers.extensionRegistry.findLiteExtensionByNumber(defaultInstance, tag >>> 3);
        if (generatedExtensionFindLiteExtensionByNumber == null) {
            return decodeUnknownField(tag, data, position, limit, androidx.datastore.preferences.protobuf.MessageSchema.getMutableUnknownFields(message), registers);
        }
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage extendableMessage = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) message;
        extendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(tag, data, position, limit, extendableMessage, generatedExtensionFindLiteExtensionByNumber, unknownFieldSchema, registers);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int decodeExtension(int tag, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage<?, ?> message, androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> extension, androidx.datastore.preferences.protobuf.UnknownFieldSchema<androidx.datastore.preferences.protobuf.UnknownFieldSetLite, androidx.datastore.preferences.protobuf.UnknownFieldSetLite> unknownFieldSchema, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = message.extensions;
        int i = tag >>> 3;
        if (extension.descriptor.isRepeated() && extension.descriptor.isPacked()) {
            switch (androidx.datastore.preferences.protobuf.ArrayDecoders.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[extension.getLiteType().ordinal()]) {
                case 1:
                    androidx.datastore.preferences.protobuf.DoubleArrayList doubleArrayList = new androidx.datastore.preferences.protobuf.DoubleArrayList();
                    int iDecodePackedDoubleList = decodePackedDoubleList(data, position, doubleArrayList, registers);
                    fieldSet.setField(extension.descriptor, doubleArrayList);
                    return iDecodePackedDoubleList;
                case 2:
                    androidx.datastore.preferences.protobuf.FloatArrayList floatArrayList = new androidx.datastore.preferences.protobuf.FloatArrayList();
                    int iDecodePackedFloatList = decodePackedFloatList(data, position, floatArrayList, registers);
                    fieldSet.setField(extension.descriptor, floatArrayList);
                    return iDecodePackedFloatList;
                case 3:
                case 4:
                    androidx.datastore.preferences.protobuf.LongArrayList longArrayList = new androidx.datastore.preferences.protobuf.LongArrayList();
                    int iDecodePackedVarint64List = decodePackedVarint64List(data, position, longArrayList, registers);
                    fieldSet.setField(extension.descriptor, longArrayList);
                    return iDecodePackedVarint64List;
                case 5:
                case 6:
                    androidx.datastore.preferences.protobuf.IntArrayList intArrayList = new androidx.datastore.preferences.protobuf.IntArrayList();
                    int iDecodePackedVarint32List = decodePackedVarint32List(data, position, intArrayList, registers);
                    fieldSet.setField(extension.descriptor, intArrayList);
                    return iDecodePackedVarint32List;
                case 7:
                case 8:
                    androidx.datastore.preferences.protobuf.LongArrayList longArrayList2 = new androidx.datastore.preferences.protobuf.LongArrayList();
                    int iDecodePackedFixed64List = decodePackedFixed64List(data, position, longArrayList2, registers);
                    fieldSet.setField(extension.descriptor, longArrayList2);
                    return iDecodePackedFixed64List;
                case 9:
                case 10:
                    androidx.datastore.preferences.protobuf.IntArrayList intArrayList2 = new androidx.datastore.preferences.protobuf.IntArrayList();
                    int iDecodePackedFixed32List = decodePackedFixed32List(data, position, intArrayList2, registers);
                    fieldSet.setField(extension.descriptor, intArrayList2);
                    return iDecodePackedFixed32List;
                case 11:
                    androidx.datastore.preferences.protobuf.BooleanArrayList booleanArrayList = new androidx.datastore.preferences.protobuf.BooleanArrayList();
                    int iDecodePackedBoolList = decodePackedBoolList(data, position, booleanArrayList, registers);
                    fieldSet.setField(extension.descriptor, booleanArrayList);
                    return iDecodePackedBoolList;
                case 12:
                    androidx.datastore.preferences.protobuf.IntArrayList intArrayList3 = new androidx.datastore.preferences.protobuf.IntArrayList();
                    int iDecodePackedSInt32List = decodePackedSInt32List(data, position, intArrayList3, registers);
                    fieldSet.setField(extension.descriptor, intArrayList3);
                    return iDecodePackedSInt32List;
                case 13:
                    androidx.datastore.preferences.protobuf.LongArrayList longArrayList3 = new androidx.datastore.preferences.protobuf.LongArrayList();
                    int iDecodePackedSInt64List = decodePackedSInt64List(data, position, longArrayList3, registers);
                    fieldSet.setField(extension.descriptor, longArrayList3);
                    return iDecodePackedSInt64List;
                case 14:
                    androidx.datastore.preferences.protobuf.IntArrayList intArrayList4 = new androidx.datastore.preferences.protobuf.IntArrayList();
                    int iDecodePackedVarint32List2 = decodePackedVarint32List(data, position, intArrayList4, registers);
                    androidx.datastore.preferences.protobuf.SchemaUtil.filterUnknownEnumList((java.lang.Object) message, i, (java.util.List<java.lang.Integer>) intArrayList4, extension.descriptor.getEnumType(), (java.lang.Object) null, (androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, java.lang.Object>) unknownFieldSchema);
                    fieldSet.setField(extension.descriptor, intArrayList4);
                    return iDecodePackedVarint32List2;
                default:
                    throw new java.lang.IllegalStateException("Type cannot be packed: " + extension.descriptor.getLiteType());
            }
        }
        java.lang.Object objValueOf = null;
        if (extension.getLiteType() == androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM) {
            position = decodeVarint32(data, position, registers);
            if (extension.descriptor.getEnumType().findValueByNumber(registers.int1) == null) {
                androidx.datastore.preferences.protobuf.SchemaUtil.storeUnknownEnum(message, i, registers.int1, null, unknownFieldSchema);
                return position;
            }
            objValueOf = java.lang.Integer.valueOf(registers.int1);
        } else {
            switch (androidx.datastore.preferences.protobuf.ArrayDecoders.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[extension.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = java.lang.Double.valueOf(decodeDouble(data, position));
                    position += 8;
                    break;
                case 2:
                    objValueOf = java.lang.Float.valueOf(decodeFloat(data, position));
                    position += 4;
                    break;
                case 3:
                case 4:
                    position = decodeVarint64(data, position, registers);
                    objValueOf = java.lang.Long.valueOf(registers.long1);
                    break;
                case 5:
                case 6:
                    position = decodeVarint32(data, position, registers);
                    objValueOf = java.lang.Integer.valueOf(registers.int1);
                    break;
                case 7:
                case 8:
                    objValueOf = java.lang.Long.valueOf(decodeFixed64(data, position));
                    position += 8;
                    break;
                case 9:
                case 10:
                    objValueOf = java.lang.Integer.valueOf(decodeFixed32(data, position));
                    position += 4;
                    break;
                case 11:
                    position = decodeVarint64(data, position, registers);
                    objValueOf = java.lang.Boolean.valueOf(registers.long1 != 0);
                    break;
                case 12:
                    position = decodeVarint32(data, position, registers);
                    objValueOf = java.lang.Integer.valueOf(androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag32(registers.int1));
                    break;
                case 13:
                    position = decodeVarint64(data, position, registers);
                    objValueOf = java.lang.Long.valueOf(androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag64(registers.long1));
                    break;
                case 14:
                    throw new java.lang.IllegalStateException("Shouldn't reach here.");
                case 15:
                    position = decodeBytes(data, position, registers);
                    objValueOf = registers.object1;
                    break;
                case 16:
                    position = decodeString(data, position, registers);
                    objValueOf = registers.object1;
                    break;
                case 17:
                    int i2 = (i << 3) | 4;
                    androidx.datastore.preferences.protobuf.Schema schemaSchemaFor = androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) extension.getMessageDefaultInstance().getClass());
                    if (extension.isRepeated()) {
                        int iDecodeGroupField = decodeGroupField(schemaSchemaFor, data, position, limit, i2, registers);
                        fieldSet.addRepeatedField(extension.descriptor, registers.object1);
                        return iDecodeGroupField;
                    }
                    java.lang.Object field = fieldSet.getField(extension.descriptor);
                    if (field == null) {
                        field = schemaSchemaFor.newInstance();
                        fieldSet.setField(extension.descriptor, field);
                    }
                    return mergeGroupField(field, schemaSchemaFor, data, position, limit, i2, registers);
                case 18:
                    androidx.datastore.preferences.protobuf.Schema schemaSchemaFor2 = androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) extension.getMessageDefaultInstance().getClass());
                    if (extension.isRepeated()) {
                        int iDecodeMessageField = decodeMessageField(schemaSchemaFor2, data, position, limit, registers);
                        fieldSet.addRepeatedField(extension.descriptor, registers.object1);
                        return iDecodeMessageField;
                    }
                    java.lang.Object field2 = fieldSet.getField(extension.descriptor);
                    if (field2 == null) {
                        field2 = schemaSchemaFor2.newInstance();
                        fieldSet.setField(extension.descriptor, field2);
                    }
                    return mergeMessageField(field2, schemaSchemaFor2, data, position, limit, registers);
            }
        }
        if (extension.isRepeated()) {
            fieldSet.addRepeatedField(extension.descriptor, objValueOf);
        } else {
            fieldSet.setField(extension.descriptor, objValueOf);
        }
        return position;
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ArrayDecoders$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32.ordinal()] = 5;
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
        }
    }

    static int decodeUnknownField(int tag, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.UnknownFieldSetLite unknownFields, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        if (androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag) == 0) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            int iDecodeVarint64 = decodeVarint64(data, position, registers);
            unknownFields.storeField(tag, java.lang.Long.valueOf(registers.long1));
            return iDecodeVarint64;
        }
        if (tagWireType == 1) {
            unknownFields.storeField(tag, java.lang.Long.valueOf(decodeFixed64(data, position)));
            return position + 8;
        }
        if (tagWireType == 2) {
            int iDecodeVarint32 = decodeVarint32(data, position, registers);
            int i = registers.int1;
            if (i < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            if (i > data.length - iDecodeVarint32) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (i == 0) {
                unknownFields.storeField(tag, androidx.datastore.preferences.protobuf.ByteString.EMPTY);
            } else {
                unknownFields.storeField(tag, androidx.datastore.preferences.protobuf.ByteString.copyFrom(data, iDecodeVarint32, i));
            }
            return iDecodeVarint32 + i;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                unknownFields.storeField(tag, java.lang.Integer.valueOf(decodeFixed32(data, position)));
                return position + 4;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidTag();
        }
        androidx.datastore.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLiteNewInstance = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.newInstance();
        int i2 = (tag & (-8)) | 4;
        registers.recursionDepth++;
        checkRecursionLimit(registers.recursionDepth);
        int i3 = 0;
        while (position < limit) {
            int iDecodeVarint33 = decodeVarint32(data, position, registers);
            int i4 = registers.int1;
            if (i4 == i2) {
                i3 = i4;
                position = iDecodeVarint33;
                break;
            }
            i3 = i4;
            position = decodeUnknownField(i4, data, iDecodeVarint33, limit, unknownFieldSetLiteNewInstance, registers);
        }
        registers.recursionDepth--;
        if (position > limit || i3 != i2) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure();
        }
        unknownFields.storeField(tag, unknownFieldSetLiteNewInstance);
        return position;
    }

    static int skipField(int tag, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        if (androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag) == 0) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            return decodeVarint64(data, position, registers);
        }
        if (tagWireType == 1) {
            return position + 8;
        }
        if (tagWireType == 2) {
            return decodeVarint32(data, position, registers) + registers.int1;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return position + 4;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidTag();
        }
        int i = (tag & (-8)) | 4;
        int i2 = 0;
        while (position < limit) {
            position = decodeVarint32(data, position, registers);
            i2 = registers.int1;
            if (i2 == i) {
                break;
            }
            position = skipField(i2, data, position, limit, registers);
        }
        if (position > limit || i2 != i) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure();
        }
        return position;
    }

    public static void setRecursionLimit(int limit) {
        recursionLimit = limit;
    }

    private static void checkRecursionLimit(int depth) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        if (depth >= recursionLimit) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }
}
