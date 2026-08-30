package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
final class MessageSetSchema<T> implements com.google.protobuf.Schema<T> {
    private final com.google.protobuf.MessageLite defaultInstance;
    private final com.google.protobuf.ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final com.google.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema;

    private MessageSetSchema(com.google.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, com.google.protobuf.ExtensionSchema<?> extensionSchema, com.google.protobuf.MessageLite messageLite) {
        this.unknownFieldSchema = unknownFieldSchema;
        this.hasExtensions = extensionSchema.hasExtensions(messageLite);
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
    }

    static <T> com.google.protobuf.MessageSetSchema<T> newSchema(com.google.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, com.google.protobuf.ExtensionSchema<?> extensionSchema, com.google.protobuf.MessageLite messageLite) {
        return new com.google.protobuf.MessageSetSchema<>(unknownFieldSchema, extensionSchema, messageLite);
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        com.google.protobuf.MessageLite messageLite = this.defaultInstance;
        if (messageLite instanceof com.google.protobuf.GeneratedMessageLite) {
            return (T) ((com.google.protobuf.GeneratedMessageLite) messageLite).newMutableInstance();
        }
        return (T) messageLite.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T t, T t2) {
        if (!this.unknownFieldSchema.getFromMessage(t).equals(this.unknownFieldSchema.getFromMessage(t2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t).equals(this.extensionSchema.getExtensions(t2));
        }
        return true;
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T t) {
        int iHashCode = this.unknownFieldSchema.getFromMessage(t).hashCode();
        return this.hasExtensions ? (iHashCode * 53) + this.extensionSchema.getExtensions(t).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t, T t2) {
        com.google.protobuf.SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t, t2);
        if (this.hasExtensions) {
            com.google.protobuf.SchemaUtil.mergeExtensions(this.extensionSchema, t, t2);
        }
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T t, com.google.protobuf.Writer writer) throws java.io.IOException {
        for (T t2 : this.extensionSchema.getExtensions(t)) {
            com.google.protobuf.FieldSet.FieldDescriptorLite fieldDescriptorLite = (com.google.protobuf.FieldSet.FieldDescriptorLite) t2.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != com.google.protobuf.WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (t2 instanceof com.google.protobuf.LazyField.LazyEntry) {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), ((com.google.protobuf.LazyField.LazyEntry) t2).getField().toByteString());
            } else {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), t2.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, t, writer);
    }

    private <UT, UB> void writeUnknownFieldsHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, com.google.protobuf.Writer writer) throws java.io.IOException {
        unknownFieldSchema.writeAsMessageSetTo(unknownFieldSchema.getFromMessage(t), writer);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb BREAK  A[LOOP:1: B:18:0x006d->B:61:0x006d], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t, byte[] bArr, int i, int i2, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.GeneratedMessageLite generatedMessageLite = (com.google.protobuf.GeneratedMessageLite) t;
        com.google.protobuf.UnknownFieldSetLite unknownFieldSetLiteNewInstance = generatedMessageLite.unknownFields;
        if (unknownFieldSetLiteNewInstance == com.google.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLiteNewInstance = com.google.protobuf.UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        }
        com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSetEnsureExtensionsAreMutable = ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) t).ensureExtensionsAreMutable();
        com.google.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        while (i < i2) {
            int iDecodeVarint32 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, i, registers);
            int i3 = registers.int1;
            if (i3 == com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG) {
                int i4 = 0;
                com.google.protobuf.ByteString byteString = null;
                while (iDecodeVarint32 < i2) {
                    iDecodeVarint32 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, iDecodeVarint32, registers);
                    int i5 = registers.int1;
                    int tagFieldNumber = com.google.protobuf.WireFormat.getTagFieldNumber(i5);
                    int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i5);
                    if (tagFieldNumber != 2) {
                        if (tagFieldNumber == 3) {
                            if (generatedExtension != null) {
                                iDecodeVarint32 = com.google.protobuf.ArrayDecoders.decodeMessageField(com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) generatedExtension.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint32, i2, registers);
                                fieldSetEnsureExtensionsAreMutable.setField(generatedExtension.descriptor, registers.object1);
                            } else if (tagWireType == 2) {
                                iDecodeVarint32 = com.google.protobuf.ArrayDecoders.decodeBytes(bArr, iDecodeVarint32, registers);
                                byteString = (com.google.protobuf.ByteString) registers.object1;
                            }
                        }
                        if (i5 == com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                        } else {
                            iDecodeVarint32 = com.google.protobuf.ArrayDecoders.skipField(i5, bArr, iDecodeVarint32, i2, registers);
                        }
                    } else if (tagWireType == 0) {
                        iDecodeVarint32 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, iDecodeVarint32, registers);
                        i4 = registers.int1;
                        generatedExtension = (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(registers.extensionRegistry, this.defaultInstance, i4);
                    } else {
                        if (i5 == com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                            break;
                        }
                        iDecodeVarint32 = com.google.protobuf.ArrayDecoders.skipField(i5, bArr, iDecodeVarint32, i2, registers);
                    }
                }
                if (byteString != null) {
                    unknownFieldSetLiteNewInstance.storeField(com.google.protobuf.WireFormat.makeTag(i4, 2), byteString);
                }
                i = iDecodeVarint32;
            } else if (com.google.protobuf.WireFormat.getTagWireType(i3) == 2) {
                com.google.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension2 = (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(registers.extensionRegistry, this.defaultInstance, com.google.protobuf.WireFormat.getTagFieldNumber(i3));
                if (generatedExtension2 != null) {
                    i = com.google.protobuf.ArrayDecoders.decodeMessageField(com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) generatedExtension2.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint32, i2, registers);
                    fieldSetEnsureExtensionsAreMutable.setField(generatedExtension2.descriptor, registers.object1);
                } else {
                    i = com.google.protobuf.ArrayDecoders.decodeUnknownField(i3, bArr, iDecodeVarint32, i2, unknownFieldSetLiteNewInstance, registers);
                }
                generatedExtension = generatedExtension2;
            } else {
                i = com.google.protobuf.ArrayDecoders.skipField(i3, bArr, iDecodeVarint32, i2, registers);
            }
        }
        if (i != i2) {
            throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t, com.google.protobuf.Reader reader, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t, reader, extensionRegistryLite);
    }

    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, com.google.protobuf.ExtensionSchema<ET> extensionSchema, T t, com.google.protobuf.Reader reader, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        UB builderFromMessage = unknownFieldSchema.getBuilderFromMessage(t);
        com.google.protobuf.FieldSet<ET> mutableExtensions = extensionSchema.getMutableExtensions(t);
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                if (!parseMessageSetItemOrUnknownField(reader, extensionRegistryLite, extensionSchema, mutableExtensions, unknownFieldSchema, builderFromMessage)) {
                    return;
                }
            } finally {
                unknownFieldSchema.setBuilderToMessage(t, builderFromMessage);
            }
        }
    }

    @Override // com.google.protobuf.Schema
    public void makeImmutable(T t) {
        this.unknownFieldSchema.makeImmutable(t);
        this.extensionSchema.makeImmutable(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(com.google.protobuf.Reader reader, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.ExtensionSchema<ET> extensionSchema, com.google.protobuf.FieldSet<ET> fieldSet, com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, UB ub) throws java.io.IOException {
        int tag = reader.getTag();
        if (tag != com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG) {
            if (com.google.protobuf.WireFormat.getTagWireType(tag) == 2) {
                java.lang.Object objFindExtensionByNumber = extensionSchema.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, com.google.protobuf.WireFormat.getTagFieldNumber(tag));
                if (objFindExtensionByNumber != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, objFindExtensionByNumber, extensionRegistryLite, fieldSet);
                    return true;
                }
                return unknownFieldSchema.mergeOneFieldFrom(ub, reader);
            }
            return reader.skipField();
        }
        java.lang.Object objFindExtensionByNumber2 = null;
        int uInt32 = 0;
        com.google.protobuf.ByteString bytes = null;
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = reader.getTag();
            if (tag2 == com.google.protobuf.WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                uInt32 = reader.readUInt32();
                objFindExtensionByNumber2 = extensionSchema.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, uInt32);
            } else if (tag2 == com.google.protobuf.WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (objFindExtensionByNumber2 != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
                } else {
                    bytes = reader.readBytes();
                }
            } else if (!reader.skipField()) {
                break;
            }
        }
        if (reader.getTag() != com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw com.google.protobuf.InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objFindExtensionByNumber2 != null) {
                extensionSchema.parseMessageSetItem(bytes, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
            } else {
                unknownFieldSchema.addLengthDelimited(ub, uInt32, bytes);
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T t) {
        return this.extensionSchema.getExtensions(t).isInitialized();
    }

    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T t) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, t) + 0;
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, T t) {
        return unknownFieldSchema.getSerializedSizeAsMessageSet(unknownFieldSchema.getFromMessage(t));
    }
}
