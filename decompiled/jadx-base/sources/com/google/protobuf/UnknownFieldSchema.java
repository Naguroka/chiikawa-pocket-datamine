package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
abstract class UnknownFieldSchema<T, B> {
    abstract void addFixed32(B b, int i, int i2);

    abstract void addFixed64(B b, int i, long j);

    abstract void addGroup(B b, int i, T t);

    abstract void addLengthDelimited(B b, int i, com.google.protobuf.ByteString byteString);

    abstract void addVarint(B b, int i, long j);

    abstract B getBuilderFromMessage(java.lang.Object obj);

    abstract T getFromMessage(java.lang.Object obj);

    abstract int getSerializedSize(T t);

    abstract int getSerializedSizeAsMessageSet(T t);

    abstract void makeImmutable(java.lang.Object obj);

    abstract T merge(T t, T t2);

    abstract B newBuilder();

    abstract void setBuilderToMessage(java.lang.Object obj, B b);

    abstract void setToMessage(java.lang.Object obj, T t);

    abstract boolean shouldDiscardUnknownFields(com.google.protobuf.Reader reader);

    abstract T toImmutable(B b);

    abstract void writeAsMessageSetTo(T t, com.google.protobuf.Writer writer) throws java.io.IOException;

    abstract void writeTo(T t, com.google.protobuf.Writer writer) throws java.io.IOException;

    UnknownFieldSchema() {
    }

    final boolean mergeOneFieldFrom(B b, com.google.protobuf.Reader reader) throws java.io.IOException {
        int tag = reader.getTag();
        int tagFieldNumber = com.google.protobuf.WireFormat.getTagFieldNumber(tag);
        int tagWireType = com.google.protobuf.WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(b, tagFieldNumber, reader.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(b, tagFieldNumber, reader.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(b, tagFieldNumber, reader.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                addFixed32(b, tagFieldNumber, reader.readFixed32());
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        B bNewBuilder = newBuilder();
        int iMakeTag = com.google.protobuf.WireFormat.makeTag(tagFieldNumber, 4);
        mergeFrom(bNewBuilder, reader);
        if (iMakeTag != reader.getTag()) {
            throw com.google.protobuf.InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(b, tagFieldNumber, toImmutable(bNewBuilder));
        return true;
    }

    final void mergeFrom(B b, com.google.protobuf.Reader reader) throws java.io.IOException {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b, reader)) {
        }
    }
}
