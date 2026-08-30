package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
final class ProtobufLists {
    private ProtobufLists() {
    }

    public static <E> com.google.protobuf.Internal.ProtobufList<E> emptyProtobufList() {
        return com.google.protobuf.ProtobufArrayList.emptyList();
    }

    public static <E> com.google.protobuf.Internal.ProtobufList<E> mutableCopy(com.google.protobuf.Internal.ProtobufList<E> protobufList) {
        int size = protobufList.size();
        return protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static com.google.protobuf.Internal.BooleanList emptyBooleanList() {
        return com.google.protobuf.BooleanArrayList.emptyList();
    }

    public static com.google.protobuf.Internal.BooleanList newBooleanList() {
        return new com.google.protobuf.BooleanArrayList();
    }

    public static com.google.protobuf.Internal.IntList emptyIntList() {
        return com.google.protobuf.IntArrayList.emptyList();
    }

    public static com.google.protobuf.Internal.IntList newIntList() {
        return new com.google.protobuf.IntArrayList();
    }

    public static com.google.protobuf.Internal.LongList emptyLongList() {
        return com.google.protobuf.LongArrayList.emptyList();
    }

    public static com.google.protobuf.Internal.LongList newLongList() {
        return new com.google.protobuf.LongArrayList();
    }

    public static com.google.protobuf.Internal.FloatList emptyFloatList() {
        return com.google.protobuf.FloatArrayList.emptyList();
    }

    public static com.google.protobuf.Internal.FloatList newFloatList() {
        return new com.google.protobuf.FloatArrayList();
    }

    public static com.google.protobuf.Internal.DoubleList emptyDoubleList() {
        return com.google.protobuf.DoubleArrayList.emptyList();
    }

    public static com.google.protobuf.Internal.DoubleList newDoubleList() {
        return new com.google.protobuf.DoubleArrayList();
    }
}
