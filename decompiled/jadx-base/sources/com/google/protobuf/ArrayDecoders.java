package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
final class ArrayDecoders {
    private ArrayDecoders() {
    }

    static final class Registers {
        public final com.google.protobuf.ExtensionRegistryLite extensionRegistry;
        public int int1;
        public long long1;
        public java.lang.Object object1;

        Registers() {
            this.extensionRegistry = com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry();
        }

        Registers(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.extensionRegistry = extensionRegistryLite;
        }
    }

    static int decodeVarint32(byte[] bArr, int i, com.google.protobuf.ArrayDecoders.Registers registers) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            registers.int1 = b;
            return i2;
        }
        return decodeVarint32(b, bArr, i2, registers);
    }

    static int decodeVarint32(int i, byte[] bArr, int i2, com.google.protobuf.ArrayDecoders.Registers registers) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            registers.int1 = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            registers.int1 = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            registers.int1 = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            registers.int1 = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                registers.int1 = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int decodeVarint64(byte[] bArr, int i, com.google.protobuf.ArrayDecoders.Registers registers) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            registers.long1 = j;
            return i2;
        }
        return decodeVarint64(j, bArr, i2, registers);
    }

    static int decodeVarint64(long j, byte[] bArr, int i, com.google.protobuf.ArrayDecoders.Registers registers) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i3 = 7;
        while (b < 0) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            i3 += 7;
            j2 |= ((long) (b2 & 127)) << i3;
            i2 = i4;
            b = b2;
        }
        registers.long1 = j2;
        return i2;
    }

    static int decodeFixed32(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static long decodeFixed64(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static double decodeDouble(byte[] bArr, int i) {
        return java.lang.Double.longBitsToDouble(decodeFixed64(bArr, i));
    }

    static float decodeFloat(byte[] bArr, int i) {
        return java.lang.Float.intBitsToFloat(decodeFixed32(bArr, i));
    }

    static int decodeString(byte[] bArr, int i, com.google.protobuf.ArrayDecoders.Registers registers) throws com.google.protobuf.InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1;
        if (i2 < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            registers.object1 = "";
            return iDecodeVarint32;
        }
        registers.object1 = new java.lang.String(bArr, iDecodeVarint32, i2, com.google.protobuf.Internal.UTF_8);
        return iDecodeVarint32 + i2;
    }

    static int decodeStringRequireUtf8(byte[] bArr, int i, com.google.protobuf.ArrayDecoders.Registers registers) throws com.google.protobuf.InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1;
        if (i2 < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            registers.object1 = "";
            return iDecodeVarint32;
        }
        registers.object1 = com.google.protobuf.Utf8.decodeUtf8(bArr, iDecodeVarint32, i2);
        return iDecodeVarint32 + i2;
    }

    static int decodeBytes(byte[] bArr, int i, com.google.protobuf.ArrayDecoders.Registers registers) throws com.google.protobuf.InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1;
        if (i2 < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > bArr.length - iDecodeVarint32) {
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            registers.object1 = com.google.protobuf.ByteString.EMPTY;
            return iDecodeVarint32;
        }
        registers.object1 = com.google.protobuf.ByteString.copyFrom(bArr, iDecodeVarint32, i2);
        return iDecodeVarint32 + i2;
    }

    static int decodeMessageField(com.google.protobuf.Schema schema, byte[] bArr, int i, int i2, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        java.lang.Object objNewInstance = schema.newInstance();
        int iMergeMessageField = mergeMessageField(objNewInstance, schema, bArr, i, i2, registers);
        schema.makeImmutable(objNewInstance);
        registers.object1 = objNewInstance;
        return iMergeMessageField;
    }

    static int decodeGroupField(com.google.protobuf.Schema schema, byte[] bArr, int i, int i2, int i3, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        java.lang.Object objNewInstance = schema.newInstance();
        int iMergeGroupField = mergeGroupField(objNewInstance, schema, bArr, i, i2, i3, registers);
        schema.makeImmutable(objNewInstance);
        registers.object1 = objNewInstance;
        return iMergeGroupField;
    }

    static int mergeMessageField(java.lang.Object obj, com.google.protobuf.Schema schema, byte[] bArr, int i, int i2, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int iDecodeVarint32 = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iDecodeVarint32 = decodeVarint32(i3, bArr, iDecodeVarint32, registers);
            i3 = registers.int1;
        }
        int i4 = iDecodeVarint32;
        if (i3 < 0 || i3 > i2 - i4) {
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        int i5 = i3 + i4;
        schema.mergeFrom(obj, bArr, i4, i5, registers);
        registers.object1 = obj;
        return i5;
    }

    static int mergeGroupField(java.lang.Object obj, com.google.protobuf.Schema schema, byte[] bArr, int i, int i2, int i3, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int proto2Message = ((com.google.protobuf.MessageSchema) schema).parseProto2Message(obj, bArr, i, i2, i3, registers);
        registers.object1 = obj;
        return proto2Message;
    }

    static int decodeVarint32List(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
        intArrayList.addInt(registers.int1);
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, registers);
            intArrayList.addInt(registers.int1);
        }
        return iDecodeVarint32;
    }

    static int decodeVarint64List(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.LongArrayList longArrayList = (com.google.protobuf.LongArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i2, registers);
        longArrayList.addLong(registers.long1);
        while (iDecodeVarint64 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        return iDecodeVarint64;
    }

    static int decodeFixed32List(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) protobufList;
        intArrayList.addInt(decodeFixed32(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, i4, registers);
            if (i != registers.int1) {
                break;
            }
            intArrayList.addInt(decodeFixed32(bArr, iDecodeVarint32));
            i4 = iDecodeVarint32 + 4;
        }
        return i4;
    }

    static int decodeFixed64List(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.LongArrayList longArrayList = (com.google.protobuf.LongArrayList) protobufList;
        longArrayList.addLong(decodeFixed64(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, i4, registers);
            if (i != registers.int1) {
                break;
            }
            longArrayList.addLong(decodeFixed64(bArr, iDecodeVarint32));
            i4 = iDecodeVarint32 + 8;
        }
        return i4;
    }

    static int decodeFloatList(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.FloatArrayList floatArrayList = (com.google.protobuf.FloatArrayList) protobufList;
        floatArrayList.addFloat(decodeFloat(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, i4, registers);
            if (i != registers.int1) {
                break;
            }
            floatArrayList.addFloat(decodeFloat(bArr, iDecodeVarint32));
            i4 = iDecodeVarint32 + 4;
        }
        return i4;
    }

    static int decodeDoubleList(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.DoubleArrayList doubleArrayList = (com.google.protobuf.DoubleArrayList) protobufList;
        doubleArrayList.addDouble(decodeDouble(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, i4, registers);
            if (i != registers.int1) {
                break;
            }
            doubleArrayList.addDouble(decodeDouble(bArr, iDecodeVarint32));
            i4 = iDecodeVarint32 + 8;
        }
        return i4;
    }

    static int decodeBoolList(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.BooleanArrayList booleanArrayList = (com.google.protobuf.BooleanArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i2, registers);
        booleanArrayList.addBoolean(registers.long1 != 0);
        while (iDecodeVarint64 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        return iDecodeVarint64;
    }

    static int decodeSInt32List(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
        intArrayList.addInt(com.google.protobuf.CodedInputStream.decodeZigZag32(registers.int1));
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, registers);
            intArrayList.addInt(com.google.protobuf.CodedInputStream.decodeZigZag32(registers.int1));
        }
        return iDecodeVarint32;
    }

    static int decodeSInt64List(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.LongArrayList longArrayList = (com.google.protobuf.LongArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i2, registers);
        longArrayList.addLong(com.google.protobuf.CodedInputStream.decodeZigZag64(registers.long1));
        while (iDecodeVarint64 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(com.google.protobuf.CodedInputStream.decodeZigZag64(registers.long1));
        }
        return iDecodeVarint64;
    }

    static int decodePackedVarint32List(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, registers);
            intArrayList.addInt(registers.int1);
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedVarint64List(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.LongArrayList longArrayList = (com.google.protobuf.LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFixed32List(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            intArrayList.addInt(decodeFixed32(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFixed64List(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.LongArrayList longArrayList = (com.google.protobuf.LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            longArrayList.addLong(decodeFixed64(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFloatList(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.FloatArrayList floatArrayList = (com.google.protobuf.FloatArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            floatArrayList.addFloat(decodeFloat(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedDoubleList(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.DoubleArrayList doubleArrayList = (com.google.protobuf.DoubleArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            doubleArrayList.addDouble(decodeDouble(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedBoolList(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.BooleanArrayList booleanArrayList = (com.google.protobuf.BooleanArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedSInt32List(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, registers);
            intArrayList.addInt(com.google.protobuf.CodedInputStream.decodeZigZag32(registers.int1));
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedSInt64List(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.LongArrayList longArrayList = (com.google.protobuf.LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(com.google.protobuf.CodedInputStream.decodeZigZag64(registers.long1));
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodeStringList(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws com.google.protobuf.InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i4 = registers.int1;
        if (i4 < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            protobufList.add("");
        } else {
            protobufList.add(new java.lang.String(bArr, iDecodeVarint32, i4, com.google.protobuf.Internal.UTF_8));
            iDecodeVarint32 += i4;
        }
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, registers);
            int i5 = registers.int1;
            if (i5 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            if (i5 == 0) {
                protobufList.add("");
            } else {
                protobufList.add(new java.lang.String(bArr, iDecodeVarint32, i5, com.google.protobuf.Internal.UTF_8));
                iDecodeVarint32 += i5;
            }
        }
        return iDecodeVarint32;
    }

    static int decodeStringListRequireUtf8(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws com.google.protobuf.InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i4 = registers.int1;
        if (i4 < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            protobufList.add("");
        } else {
            int i5 = iDecodeVarint32 + i4;
            if (!com.google.protobuf.Utf8.isValidUtf8(bArr, iDecodeVarint32, i5)) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
            }
            protobufList.add(new java.lang.String(bArr, iDecodeVarint32, i4, com.google.protobuf.Internal.UTF_8));
            iDecodeVarint32 = i5;
        }
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, registers);
            int i6 = registers.int1;
            if (i6 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            if (i6 == 0) {
                protobufList.add("");
            } else {
                int i7 = iDecodeVarint32 + i6;
                if (!com.google.protobuf.Utf8.isValidUtf8(bArr, iDecodeVarint32, i7)) {
                    throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                }
                protobufList.add(new java.lang.String(bArr, iDecodeVarint32, i6, com.google.protobuf.Internal.UTF_8));
                iDecodeVarint32 = i7;
            }
        }
        return iDecodeVarint32;
    }

    static int decodeBytesList(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws com.google.protobuf.InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i4 = registers.int1;
        if (i4 < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i4 > bArr.length - iDecodeVarint32) {
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        if (i4 == 0) {
            protobufList.add(com.google.protobuf.ByteString.EMPTY);
        } else {
            protobufList.add(com.google.protobuf.ByteString.copyFrom(bArr, iDecodeVarint32, i4));
            iDecodeVarint32 += i4;
        }
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, registers);
            int i5 = registers.int1;
            if (i5 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            if (i5 > bArr.length - iDecodeVarint32) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (i5 == 0) {
                protobufList.add(com.google.protobuf.ByteString.EMPTY);
            } else {
                protobufList.add(com.google.protobuf.ByteString.copyFrom(bArr, iDecodeVarint32, i5));
                iDecodeVarint32 += i5;
            }
        }
        return iDecodeVarint32;
    }

    static int decodeMessageList(com.google.protobuf.Schema<?> schema, int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int iDecodeMessageField = decodeMessageField(schema, bArr, i2, i3, registers);
        protobufList.add(registers.object1);
        while (iDecodeMessageField < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeMessageField, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeMessageField = decodeMessageField(schema, bArr, iDecodeVarint32, i3, registers);
            protobufList.add(registers.object1);
        }
        return iDecodeMessageField;
    }

    static int decodeGroupList(com.google.protobuf.Schema schema, int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int i4 = (i & (-8)) | 4;
        int iDecodeGroupField = decodeGroupField(schema, bArr, i2, i3, i4, registers);
        protobufList.add(registers.object1);
        while (iDecodeGroupField < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeGroupField, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeGroupField = decodeGroupField(schema, bArr, iDecodeVarint32, i3, i4, registers);
            protobufList.add(registers.object1);
        }
        return iDecodeGroupField;
    }

    static int decodeExtensionOrUnknownField(int i, byte[] bArr, int i2, int i3, java.lang.Object obj, com.google.protobuf.MessageLite messageLite, com.google.protobuf.UnknownFieldSchema<com.google.protobuf.UnknownFieldSetLite, com.google.protobuf.UnknownFieldSetLite> unknownFieldSchema, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = registers.extensionRegistry.findLiteExtensionByNumber(messageLite, i >>> 3);
        if (generatedExtensionFindLiteExtensionByNumber == null) {
            return decodeUnknownField(i, bArr, i2, i3, com.google.protobuf.MessageSchema.getMutableUnknownFields(obj), registers);
        }
        com.google.protobuf.GeneratedMessageLite.ExtendableMessage extendableMessage = (com.google.protobuf.GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(i, bArr, i2, i3, extendableMessage, generatedExtensionFindLiteExtensionByNumber, unknownFieldSchema, registers);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int decodeExtension(int i, byte[] bArr, int i2, int i3, com.google.protobuf.GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, com.google.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, com.google.protobuf.UnknownFieldSchema<com.google.protobuf.UnknownFieldSetLite, com.google.protobuf.UnknownFieldSetLite> unknownFieldSchema, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        int i4 = i >>> 3;
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (com.google.protobuf.ArrayDecoders.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    com.google.protobuf.DoubleArrayList doubleArrayList = new com.google.protobuf.DoubleArrayList();
                    int iDecodePackedDoubleList = decodePackedDoubleList(bArr, i2, doubleArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, doubleArrayList);
                    return iDecodePackedDoubleList;
                case 2:
                    com.google.protobuf.FloatArrayList floatArrayList = new com.google.protobuf.FloatArrayList();
                    int iDecodePackedFloatList = decodePackedFloatList(bArr, i2, floatArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, floatArrayList);
                    return iDecodePackedFloatList;
                case 3:
                case 4:
                    com.google.protobuf.LongArrayList longArrayList = new com.google.protobuf.LongArrayList();
                    int iDecodePackedVarint64List = decodePackedVarint64List(bArr, i2, longArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList);
                    return iDecodePackedVarint64List;
                case 5:
                case 6:
                    com.google.protobuf.IntArrayList intArrayList = new com.google.protobuf.IntArrayList();
                    int iDecodePackedVarint32List = decodePackedVarint32List(bArr, i2, intArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList);
                    return iDecodePackedVarint32List;
                case 7:
                case 8:
                    com.google.protobuf.LongArrayList longArrayList2 = new com.google.protobuf.LongArrayList();
                    int iDecodePackedFixed64List = decodePackedFixed64List(bArr, i2, longArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList2);
                    return iDecodePackedFixed64List;
                case 9:
                case 10:
                    com.google.protobuf.IntArrayList intArrayList2 = new com.google.protobuf.IntArrayList();
                    int iDecodePackedFixed32List = decodePackedFixed32List(bArr, i2, intArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList2);
                    return iDecodePackedFixed32List;
                case 11:
                    com.google.protobuf.BooleanArrayList booleanArrayList = new com.google.protobuf.BooleanArrayList();
                    int iDecodePackedBoolList = decodePackedBoolList(bArr, i2, booleanArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, booleanArrayList);
                    return iDecodePackedBoolList;
                case 12:
                    com.google.protobuf.IntArrayList intArrayList3 = new com.google.protobuf.IntArrayList();
                    int iDecodePackedSInt32List = decodePackedSInt32List(bArr, i2, intArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList3);
                    return iDecodePackedSInt32List;
                case 13:
                    com.google.protobuf.LongArrayList longArrayList3 = new com.google.protobuf.LongArrayList();
                    int iDecodePackedSInt64List = decodePackedSInt64List(bArr, i2, longArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList3);
                    return iDecodePackedSInt64List;
                case 14:
                    com.google.protobuf.IntArrayList intArrayList4 = new com.google.protobuf.IntArrayList();
                    int iDecodePackedVarint32List2 = decodePackedVarint32List(bArr, i2, intArrayList4, registers);
                    com.google.protobuf.SchemaUtil.filterUnknownEnumList((java.lang.Object) extendableMessage, i4, (java.util.List<java.lang.Integer>) intArrayList4, generatedExtension.descriptor.getEnumType(), (java.lang.Object) null, (com.google.protobuf.UnknownFieldSchema<UT, java.lang.Object>) unknownFieldSchema);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList4);
                    return iDecodePackedVarint32List2;
                default:
                    throw new java.lang.IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
        }
        java.lang.Object objValueOf = null;
        if (generatedExtension.getLiteType() == com.google.protobuf.WireFormat.FieldType.ENUM) {
            i2 = decodeVarint32(bArr, i2, registers);
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(registers.int1) == null) {
                com.google.protobuf.SchemaUtil.storeUnknownEnum(extendableMessage, i4, registers.int1, null, unknownFieldSchema);
                return i2;
            }
            objValueOf = java.lang.Integer.valueOf(registers.int1);
        } else {
            switch (com.google.protobuf.ArrayDecoders.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = java.lang.Double.valueOf(decodeDouble(bArr, i2));
                    i2 += 8;
                    break;
                case 2:
                    objValueOf = java.lang.Float.valueOf(decodeFloat(bArr, i2));
                    i2 += 4;
                    break;
                case 3:
                case 4:
                    i2 = decodeVarint64(bArr, i2, registers);
                    objValueOf = java.lang.Long.valueOf(registers.long1);
                    break;
                case 5:
                case 6:
                    i2 = decodeVarint32(bArr, i2, registers);
                    objValueOf = java.lang.Integer.valueOf(registers.int1);
                    break;
                case 7:
                case 8:
                    objValueOf = java.lang.Long.valueOf(decodeFixed64(bArr, i2));
                    i2 += 8;
                    break;
                case 9:
                case 10:
                    objValueOf = java.lang.Integer.valueOf(decodeFixed32(bArr, i2));
                    i2 += 4;
                    break;
                case 11:
                    i2 = decodeVarint64(bArr, i2, registers);
                    objValueOf = java.lang.Boolean.valueOf(registers.long1 != 0);
                    break;
                case 12:
                    i2 = decodeVarint32(bArr, i2, registers);
                    objValueOf = java.lang.Integer.valueOf(com.google.protobuf.CodedInputStream.decodeZigZag32(registers.int1));
                    break;
                case 13:
                    i2 = decodeVarint64(bArr, i2, registers);
                    objValueOf = java.lang.Long.valueOf(com.google.protobuf.CodedInputStream.decodeZigZag64(registers.long1));
                    break;
                case 14:
                    throw new java.lang.IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = decodeBytes(bArr, i2, registers);
                    objValueOf = registers.object1;
                    break;
                case 16:
                    i2 = decodeString(bArr, i2, registers);
                    objValueOf = registers.object1;
                    break;
                case 17:
                    int i5 = (i4 << 3) | 4;
                    com.google.protobuf.Schema schemaSchemaFor = com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iDecodeGroupField = decodeGroupField(schemaSchemaFor, bArr, i2, i3, i5, registers);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, registers.object1);
                        return iDecodeGroupField;
                    }
                    java.lang.Object field = fieldSet.getField(generatedExtension.descriptor);
                    if (field == null) {
                        field = schemaSchemaFor.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field);
                    }
                    return mergeGroupField(field, schemaSchemaFor, bArr, i2, i3, i5, registers);
                case 18:
                    com.google.protobuf.Schema schemaSchemaFor2 = com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iDecodeMessageField = decodeMessageField(schemaSchemaFor2, bArr, i2, i3, registers);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, registers.object1);
                        return iDecodeMessageField;
                    }
                    java.lang.Object field2 = fieldSet.getField(generatedExtension.descriptor);
                    if (field2 == null) {
                        field2 = schemaSchemaFor2.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field2);
                    }
                    return mergeMessageField(field2, schemaSchemaFor2, bArr, i2, i3, registers);
            }
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.addRepeatedField(generatedExtension.descriptor, objValueOf);
        } else {
            fieldSet.setField(generatedExtension.descriptor, objValueOf);
        }
        return i2;
    }

    /* JADX INFO: renamed from: com.google.protobuf.ArrayDecoders$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[com.google.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[com.google.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT32.ordinal()] = 5;
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
        }
    }

    static int decodeUnknownField(int i, byte[] bArr, int i2, int i3, com.google.protobuf.UnknownFieldSetLite unknownFieldSetLite, com.google.protobuf.ArrayDecoders.Registers registers) throws com.google.protobuf.InvalidProtocolBufferException {
        if (com.google.protobuf.WireFormat.getTagFieldNumber(i) == 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            int iDecodeVarint64 = decodeVarint64(bArr, i2, registers);
            unknownFieldSetLite.storeField(i, java.lang.Long.valueOf(registers.long1));
            return iDecodeVarint64;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.storeField(i, java.lang.Long.valueOf(decodeFixed64(bArr, i2)));
            return i2 + 8;
        }
        if (tagWireType == 2) {
            int iDecodeVarint32 = decodeVarint32(bArr, i2, registers);
            int i4 = registers.int1;
            if (i4 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            if (i4 > bArr.length - iDecodeVarint32) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (i4 == 0) {
                unknownFieldSetLite.storeField(i, com.google.protobuf.ByteString.EMPTY);
            } else {
                unknownFieldSetLite.storeField(i, com.google.protobuf.ByteString.copyFrom(bArr, iDecodeVarint32, i4));
            }
            return iDecodeVarint32 + i4;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                unknownFieldSetLite.storeField(i, java.lang.Integer.valueOf(decodeFixed32(bArr, i2)));
                return i2 + 4;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidTag();
        }
        com.google.protobuf.UnknownFieldSetLite unknownFieldSetLiteNewInstance = com.google.protobuf.UnknownFieldSetLite.newInstance();
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            int iDecodeVarint33 = decodeVarint32(bArr, i2, registers);
            int i7 = registers.int1;
            if (i7 == i5) {
                i6 = i7;
                i2 = iDecodeVarint33;
                break;
            }
            i6 = i7;
            i2 = decodeUnknownField(i7, bArr, iDecodeVarint33, i3, unknownFieldSetLiteNewInstance, registers);
        }
        if (i2 > i3 || i6 != i5) {
            throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.storeField(i, unknownFieldSetLiteNewInstance);
        return i2;
    }

    static int skipField(int i, byte[] bArr, int i2, int i3, com.google.protobuf.ArrayDecoders.Registers registers) throws com.google.protobuf.InvalidProtocolBufferException {
        if (com.google.protobuf.WireFormat.getTagFieldNumber(i) == 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            return decodeVarint64(bArr, i2, registers);
        }
        if (tagWireType == 1) {
            return i2 + 8;
        }
        if (tagWireType == 2) {
            return decodeVarint32(bArr, i2, registers) + registers.int1;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i2 + 4;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidTag();
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = decodeVarint32(bArr, i2, registers);
            i5 = registers.int1;
            if (i5 == i4) {
                break;
            }
            i2 = skipField(i5, bArr, i2, i3, registers);
        }
        if (i2 > i3 || i5 != i4) {
            throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }
}
