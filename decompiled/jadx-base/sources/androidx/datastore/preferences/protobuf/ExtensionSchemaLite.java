package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
final class ExtensionSchemaLite extends androidx.datastore.preferences.protobuf.ExtensionSchema<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> {
    ExtensionSchemaLite() {
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    boolean hasExtensions(androidx.datastore.preferences.protobuf.MessageLite prototype) {
        return prototype instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> getExtensions(java.lang.Object message) {
        return ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) message).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    void setExtensions(java.lang.Object message, androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> extensions) {
        ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) message).extensions = extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> getMutableExtensions(java.lang.Object message) {
        return ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) message).ensureExtensionsAreMutable();
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    void makeImmutable(java.lang.Object message) {
        getExtensions(message).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    <UT, UB> UB parseExtension(java.lang.Object obj, androidx.datastore.preferences.protobuf.Reader reader, java.lang.Object obj2, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite, androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet, UB ub, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema) throws java.io.IOException {
        java.lang.Object objValueOf;
        java.lang.Object field;
        java.util.ArrayList arrayList;
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) obj2;
        int number = generatedExtension.getNumber();
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (androidx.datastore.preferences.protobuf.ExtensionSchemaLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new java.util.ArrayList();
                    reader.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new java.util.ArrayList();
                    reader.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new java.util.ArrayList();
                    reader.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new java.util.ArrayList();
                    reader.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new java.util.ArrayList();
                    reader.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new java.util.ArrayList();
                    reader.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new java.util.ArrayList();
                    reader.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new java.util.ArrayList();
                    reader.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new java.util.ArrayList();
                    reader.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new java.util.ArrayList();
                    reader.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new java.util.ArrayList();
                    reader.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new java.util.ArrayList();
                    reader.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new java.util.ArrayList();
                    reader.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new java.util.ArrayList();
                    reader.readEnumList(arrayList);
                    ub = (UB) androidx.datastore.preferences.protobuf.SchemaUtil.filterUnknownEnumList(obj, number, arrayList, generatedExtension.descriptor.getEnumType(), ub, unknownFieldSchema);
                    break;
                default:
                    throw new java.lang.IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
            fieldSet.setField(generatedExtension.descriptor, arrayList);
        } else {
            if (generatedExtension.getLiteType() == androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM) {
                int int32 = reader.readInt32();
                if (generatedExtension.descriptor.getEnumType().findValueByNumber(int32) == null) {
                    return (UB) androidx.datastore.preferences.protobuf.SchemaUtil.storeUnknownEnum(obj, number, int32, ub, unknownFieldSchema);
                }
                objValueOf = java.lang.Integer.valueOf(int32);
            } else {
                switch (androidx.datastore.preferences.protobuf.ExtensionSchemaLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                    case 1:
                        objValueOf = java.lang.Double.valueOf(reader.readDouble());
                        break;
                    case 2:
                        objValueOf = java.lang.Float.valueOf(reader.readFloat());
                        break;
                    case 3:
                        objValueOf = java.lang.Long.valueOf(reader.readInt64());
                        break;
                    case 4:
                        objValueOf = java.lang.Long.valueOf(reader.readUInt64());
                        break;
                    case 5:
                        objValueOf = java.lang.Integer.valueOf(reader.readInt32());
                        break;
                    case 6:
                        objValueOf = java.lang.Long.valueOf(reader.readFixed64());
                        break;
                    case 7:
                        objValueOf = java.lang.Integer.valueOf(reader.readFixed32());
                        break;
                    case 8:
                        objValueOf = java.lang.Boolean.valueOf(reader.readBool());
                        break;
                    case 9:
                        objValueOf = java.lang.Integer.valueOf(reader.readUInt32());
                        break;
                    case 10:
                        objValueOf = java.lang.Integer.valueOf(reader.readSFixed32());
                        break;
                    case 11:
                        objValueOf = java.lang.Long.valueOf(reader.readSFixed64());
                        break;
                    case 12:
                        objValueOf = java.lang.Integer.valueOf(reader.readSInt32());
                        break;
                    case 13:
                        objValueOf = java.lang.Long.valueOf(reader.readSInt64());
                        break;
                    case 14:
                        throw new java.lang.IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = reader.readBytes();
                        break;
                    case 16:
                        objValueOf = reader.readString();
                        break;
                    case 17:
                        if (!generatedExtension.isRepeated()) {
                            java.lang.Object field2 = fieldSet.getField(generatedExtension.descriptor);
                            if (field2 instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite) {
                                androidx.datastore.preferences.protobuf.Schema schemaSchemaFor = androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor(field2);
                                if (!((androidx.datastore.preferences.protobuf.GeneratedMessageLite) field2).isMutable()) {
                                    java.lang.Object objNewInstance = schemaSchemaFor.newInstance();
                                    schemaSchemaFor.mergeFrom(objNewInstance, field2);
                                    fieldSet.setField(generatedExtension.descriptor, objNewInstance);
                                    field2 = objNewInstance;
                                }
                                reader.mergeGroupField(field2, schemaSchemaFor, extensionRegistryLite);
                                return ub;
                            }
                        }
                        objValueOf = reader.readGroup(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    case 18:
                        if (!generatedExtension.isRepeated()) {
                            java.lang.Object field3 = fieldSet.getField(generatedExtension.descriptor);
                            if (field3 instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite) {
                                androidx.datastore.preferences.protobuf.Schema schemaSchemaFor2 = androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor(field3);
                                if (!((androidx.datastore.preferences.protobuf.GeneratedMessageLite) field3).isMutable()) {
                                    java.lang.Object objNewInstance2 = schemaSchemaFor2.newInstance();
                                    schemaSchemaFor2.mergeFrom(objNewInstance2, field3);
                                    fieldSet.setField(generatedExtension.descriptor, objNewInstance2);
                                    field3 = objNewInstance2;
                                }
                                reader.mergeMessageField(field3, schemaSchemaFor2, extensionRegistryLite);
                                return ub;
                            }
                        }
                        objValueOf = reader.readMessage(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            }
            if (generatedExtension.isRepeated()) {
                fieldSet.addRepeatedField(generatedExtension.descriptor, objValueOf);
            } else {
                int i = androidx.datastore.preferences.protobuf.ExtensionSchemaLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()];
                if ((i == 17 || i == 18) && (field = fieldSet.getField(generatedExtension.descriptor)) != null) {
                    objValueOf = androidx.datastore.preferences.protobuf.Internal.mergeMessage(field, objValueOf);
                }
                fieldSet.setField(generatedExtension.descriptor, objValueOf);
            }
        }
        return ub;
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ExtensionSchemaLite$1, reason: invalid class name */
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 11;
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

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    int extensionNumber(java.util.Map.Entry<?, ?> extension) {
        return ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor) extension.getKey()).getNumber();
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    void serializeExtension(androidx.datastore.preferences.protobuf.Writer writer, java.util.Map.Entry<?, ?> extension) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor) extension.getKey();
        if (extensionDescriptor.isRepeated()) {
            switch (androidx.datastore.preferences.protobuf.ExtensionSchemaLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[extensionDescriptor.getLiteType().ordinal()]) {
                case 1:
                    androidx.datastore.preferences.protobuf.SchemaUtil.writeDoubleList(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 2:
                    androidx.datastore.preferences.protobuf.SchemaUtil.writeFloatList(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 3:
                    androidx.datastore.preferences.protobuf.SchemaUtil.writeInt64List(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 4:
                    androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt64List(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 5:
                    androidx.datastore.preferences.protobuf.SchemaUtil.writeInt32List(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 6:
                    androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed64List(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 7:
                    androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed32List(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 8:
                    androidx.datastore.preferences.protobuf.SchemaUtil.writeBoolList(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 9:
                    androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt32List(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 10:
                    androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed32List(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 11:
                    androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed64List(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 12:
                    androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt32List(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 13:
                    androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt64List(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 14:
                    androidx.datastore.preferences.protobuf.SchemaUtil.writeInt32List(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 15:
                    androidx.datastore.preferences.protobuf.SchemaUtil.writeBytesList(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer);
                    break;
                case 16:
                    androidx.datastore.preferences.protobuf.SchemaUtil.writeStringList(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer);
                    break;
                case 17:
                    java.util.List list = (java.util.List) extension.getValue();
                    if (list != null && !list.isEmpty()) {
                        androidx.datastore.preferences.protobuf.SchemaUtil.writeGroupList(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer, androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    java.util.List list2 = (java.util.List) extension.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        androidx.datastore.preferences.protobuf.SchemaUtil.writeMessageList(extensionDescriptor.getNumber(), (java.util.List) extension.getValue(), writer, androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (androidx.datastore.preferences.protobuf.ExtensionSchemaLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[extensionDescriptor.getLiteType().ordinal()]) {
            case 1:
                writer.writeDouble(extensionDescriptor.getNumber(), ((java.lang.Double) extension.getValue()).doubleValue());
                break;
            case 2:
                writer.writeFloat(extensionDescriptor.getNumber(), ((java.lang.Float) extension.getValue()).floatValue());
                break;
            case 3:
                writer.writeInt64(extensionDescriptor.getNumber(), ((java.lang.Long) extension.getValue()).longValue());
                break;
            case 4:
                writer.writeUInt64(extensionDescriptor.getNumber(), ((java.lang.Long) extension.getValue()).longValue());
                break;
            case 5:
                writer.writeInt32(extensionDescriptor.getNumber(), ((java.lang.Integer) extension.getValue()).intValue());
                break;
            case 6:
                writer.writeFixed64(extensionDescriptor.getNumber(), ((java.lang.Long) extension.getValue()).longValue());
                break;
            case 7:
                writer.writeFixed32(extensionDescriptor.getNumber(), ((java.lang.Integer) extension.getValue()).intValue());
                break;
            case 8:
                writer.writeBool(extensionDescriptor.getNumber(), ((java.lang.Boolean) extension.getValue()).booleanValue());
                break;
            case 9:
                writer.writeUInt32(extensionDescriptor.getNumber(), ((java.lang.Integer) extension.getValue()).intValue());
                break;
            case 10:
                writer.writeSFixed32(extensionDescriptor.getNumber(), ((java.lang.Integer) extension.getValue()).intValue());
                break;
            case 11:
                writer.writeSFixed64(extensionDescriptor.getNumber(), ((java.lang.Long) extension.getValue()).longValue());
                break;
            case 12:
                writer.writeSInt32(extensionDescriptor.getNumber(), ((java.lang.Integer) extension.getValue()).intValue());
                break;
            case 13:
                writer.writeSInt64(extensionDescriptor.getNumber(), ((java.lang.Long) extension.getValue()).longValue());
                break;
            case 14:
                writer.writeInt32(extensionDescriptor.getNumber(), ((java.lang.Integer) extension.getValue()).intValue());
                break;
            case 15:
                writer.writeBytes(extensionDescriptor.getNumber(), (androidx.datastore.preferences.protobuf.ByteString) extension.getValue());
                break;
            case 16:
                writer.writeString(extensionDescriptor.getNumber(), (java.lang.String) extension.getValue());
                break;
            case 17:
                writer.writeGroup(extensionDescriptor.getNumber(), extension.getValue(), androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) extension.getValue().getClass()));
                break;
            case 18:
                writer.writeMessage(extensionDescriptor.getNumber(), extension.getValue(), androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) extension.getValue().getClass()));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    java.lang.Object findExtensionByNumber(androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, androidx.datastore.preferences.protobuf.MessageLite defaultInstance, int number) {
        return extensionRegistry.findLiteExtensionByNumber(defaultInstance, number);
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    void parseLengthPrefixedMessageSetItem(androidx.datastore.preferences.protobuf.Reader reader, java.lang.Object extensionObject, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> extensions) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) extensionObject;
        extensions.setField(generatedExtension.descriptor, reader.readMessage(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistry));
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    void parseMessageSetItem(androidx.datastore.preferences.protobuf.ByteString data, java.lang.Object extensionObject, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> extensions) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) extensionObject;
        androidx.datastore.preferences.protobuf.MessageLite.Builder builderNewBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
        androidx.datastore.preferences.protobuf.CodedInputStream codedInputStreamNewCodedInput = data.newCodedInput();
        builderNewBuilderForType.mergeFrom(codedInputStreamNewCodedInput, extensionRegistry);
        extensions.setField(generatedExtension.descriptor, builderNewBuilderForType.buildPartial());
        codedInputStreamNewCodedInput.checkLastTagWas(0);
    }
}
