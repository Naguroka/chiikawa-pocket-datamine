package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
final class MessageSetSchema<T> implements androidx.datastore.preferences.protobuf.Schema<T> {
    private final androidx.datastore.preferences.protobuf.MessageLite defaultInstance;
    private final androidx.datastore.preferences.protobuf.ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema;

    private MessageSetSchema(androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema<?> extensionSchema, androidx.datastore.preferences.protobuf.MessageLite defaultInstance) {
        this.unknownFieldSchema = unknownFieldSchema;
        this.hasExtensions = extensionSchema.hasExtensions(defaultInstance);
        this.extensionSchema = extensionSchema;
        this.defaultInstance = defaultInstance;
    }

    static <T> androidx.datastore.preferences.protobuf.MessageSetSchema<T> newSchema(androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema<?> extensionSchema, androidx.datastore.preferences.protobuf.MessageLite defaultInstance) {
        return new androidx.datastore.preferences.protobuf.MessageSetSchema<>(unknownFieldSchema, extensionSchema, defaultInstance);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public T newInstance() {
        androidx.datastore.preferences.protobuf.MessageLite messageLite = this.defaultInstance;
        if (messageLite instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite) {
            return (T) ((androidx.datastore.preferences.protobuf.GeneratedMessageLite) messageLite).newMutableInstance();
        }
        return (T) messageLite.newBuilderForType().buildPartial();
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public boolean equals(T message, T other) {
        if (!this.unknownFieldSchema.getFromMessage(message).equals(this.unknownFieldSchema.getFromMessage(other))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(message).equals(this.extensionSchema.getExtensions(other));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int hashCode(T message) {
        int iHashCode = this.unknownFieldSchema.getFromMessage(message).hashCode();
        return this.hasExtensions ? (iHashCode * 53) + this.extensionSchema.getExtensions(message).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T message, T other) {
        androidx.datastore.preferences.protobuf.SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, message, other);
        if (this.hasExtensions) {
            androidx.datastore.preferences.protobuf.SchemaUtil.mergeExtensions(this.extensionSchema, message, other);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void writeTo(T message, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        for (T t : this.extensionSchema.getExtensions(message)) {
            androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite fieldDescriptorLite = (androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) t.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (t instanceof androidx.datastore.preferences.protobuf.LazyField.LazyEntry) {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), ((androidx.datastore.preferences.protobuf.LazyField.LazyEntry) t).getField().toByteString());
            } else {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), t.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, message, writer);
    }

    private <UT, UB> void writeUnknownFieldsHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, T message, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        unknownFieldSchema.writeAsMessageSetTo(unknownFieldSchema.getFromMessage(message), writer);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb BREAK  A[LOOP:1: B:18:0x006d->B:61:0x006d], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T message, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.GeneratedMessageLite generatedMessageLite = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) message;
        androidx.datastore.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLiteNewInstance = generatedMessageLite.unknownFields;
        if (unknownFieldSetLiteNewInstance == androidx.datastore.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLiteNewInstance = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        }
        androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSetEnsureExtensionsAreMutable = ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) message).ensureExtensionsAreMutable();
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        while (position < limit) {
            int iDecodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(data, position, registers);
            int i = registers.int1;
            if (i == androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG) {
                int i2 = 0;
                androidx.datastore.preferences.protobuf.ByteString byteString = null;
                while (iDecodeVarint32 < limit) {
                    iDecodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(data, iDecodeVarint32, registers);
                    int i3 = registers.int1;
                    int tagFieldNumber = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(i3);
                    int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(i3);
                    if (tagFieldNumber != 2) {
                        if (tagFieldNumber == 3) {
                            if (generatedExtension != null) {
                                iDecodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeMessageField(androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) generatedExtension.getMessageDefaultInstance().getClass()), data, iDecodeVarint32, limit, registers);
                                fieldSetEnsureExtensionsAreMutable.setField(generatedExtension.descriptor, registers.object1);
                            } else if (tagWireType == 2) {
                                iDecodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeBytes(data, iDecodeVarint32, registers);
                                byteString = (androidx.datastore.preferences.protobuf.ByteString) registers.object1;
                            }
                        }
                        if (i3 == androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                        } else {
                            iDecodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.skipField(i3, data, iDecodeVarint32, limit, registers);
                        }
                    } else if (tagWireType == 0) {
                        iDecodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(data, iDecodeVarint32, registers);
                        i2 = registers.int1;
                        generatedExtension = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(registers.extensionRegistry, this.defaultInstance, i2);
                    } else {
                        if (i3 == androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                            break;
                        }
                        iDecodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.skipField(i3, data, iDecodeVarint32, limit, registers);
                    }
                }
                if (byteString != null) {
                    unknownFieldSetLiteNewInstance.storeField(androidx.datastore.preferences.protobuf.WireFormat.makeTag(i2, 2), byteString);
                }
                position = iDecodeVarint32;
            } else if (androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(i) == 2) {
                androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension2 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(registers.extensionRegistry, this.defaultInstance, androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(i));
                if (generatedExtension2 != null) {
                    position = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeMessageField(androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) generatedExtension2.getMessageDefaultInstance().getClass()), data, iDecodeVarint32, limit, registers);
                    fieldSetEnsureExtensionsAreMutable.setField(generatedExtension2.descriptor, registers.object1);
                } else {
                    position = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeUnknownField(i, data, iDecodeVarint32, limit, unknownFieldSetLiteNewInstance, registers);
                }
                generatedExtension = generatedExtension2;
            } else {
                position = androidx.datastore.preferences.protobuf.ArrayDecoders.skipField(i, data, iDecodeVarint32, limit, registers);
            }
        }
        if (position != limit) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T message, androidx.datastore.preferences.protobuf.Reader reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, message, reader, extensionRegistry);
    }

    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema<ET> extensionSchema, T message, androidx.datastore.preferences.protobuf.Reader reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        UB builderFromMessage = unknownFieldSchema.getBuilderFromMessage(message);
        androidx.datastore.preferences.protobuf.FieldSet<ET> mutableExtensions = extensionSchema.getMutableExtensions(message);
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                if (!parseMessageSetItemOrUnknownField(reader, extensionRegistry, extensionSchema, mutableExtensions, unknownFieldSchema, builderFromMessage)) {
                    return;
                }
            } finally {
                unknownFieldSchema.setBuilderToMessage(message, builderFromMessage);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void makeImmutable(T message) {
        this.unknownFieldSchema.makeImmutable(message);
        this.extensionSchema.makeImmutable(message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(androidx.datastore.preferences.protobuf.Reader reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, androidx.datastore.preferences.protobuf.ExtensionSchema<ET> extensionSchema, androidx.datastore.preferences.protobuf.FieldSet<ET> extensions, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, UB unknownFields) throws java.io.IOException {
        int tag = reader.getTag();
        int uInt32 = 0;
        if (tag != androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG) {
            if (androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag) == 2) {
                java.lang.Object objFindExtensionByNumber = extensionSchema.findExtensionByNumber(extensionRegistry, this.defaultInstance, androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag));
                if (objFindExtensionByNumber != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, objFindExtensionByNumber, extensionRegistry, extensions);
                    return true;
                }
                return unknownFieldSchema.mergeOneFieldFrom(unknownFields, reader, 0);
            }
            return reader.skipField();
        }
        java.lang.Object objFindExtensionByNumber2 = null;
        androidx.datastore.preferences.protobuf.ByteString bytes = null;
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = reader.getTag();
            if (tag2 == androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                uInt32 = reader.readUInt32();
                objFindExtensionByNumber2 = extensionSchema.findExtensionByNumber(extensionRegistry, this.defaultInstance, uInt32);
            } else if (tag2 == androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (objFindExtensionByNumber2 != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, objFindExtensionByNumber2, extensionRegistry, extensions);
                } else {
                    bytes = reader.readBytes();
                }
            } else if (!reader.skipField()) {
                break;
            }
        }
        if (reader.getTag() != androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objFindExtensionByNumber2 != null) {
                extensionSchema.parseMessageSetItem(bytes, objFindExtensionByNumber2, extensionRegistry, extensions);
            } else {
                unknownFieldSchema.addLengthDelimited(unknownFields, uInt32, bytes);
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(T message) {
        return this.extensionSchema.getExtensions(message).isInitialized();
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int getSerializedSize(T message) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, message) + 0;
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(message).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> schema, T message) {
        return schema.getSerializedSizeAsMessageSet(schema.getFromMessage(message));
    }
}
