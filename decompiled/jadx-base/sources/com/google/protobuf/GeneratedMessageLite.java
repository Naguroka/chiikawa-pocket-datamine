package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public abstract class GeneratedMessageLite<MessageType extends com.google.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> extends com.google.protobuf.AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static java.util.Map<java.lang.Object, com.google.protobuf.GeneratedMessageLite<?, ?>> defaultInstanceMap = new java.util.concurrent.ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected com.google.protobuf.UnknownFieldSetLite unknownFields = com.google.protobuf.UnknownFieldSetLite.getDefaultInstance();

    public interface ExtendableMessageOrBuilder<MessageType extends com.google.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends com.google.protobuf.MessageLiteOrBuilder {
        <Type> Type getExtension(com.google.protobuf.ExtensionLite<MessageType, Type> extensionLite);

        <Type> Type getExtension(com.google.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, int i);

        <Type> int getExtensionCount(com.google.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite);

        <Type> boolean hasExtension(com.google.protobuf.ExtensionLite<MessageType, Type> extensionLite);
    }

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected abstract java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2);

    boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // com.google.protobuf.MessageLite
    public final com.google.protobuf.Parser<MessageType> getParserForType() {
        return (com.google.protobuf.Parser) dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.MessageLite
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER);
    }

    MessageType newMutableInstance() {
        return (MessageType) dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public java.lang.String toString() {
        return com.google.protobuf.MessageLiteToString.toString(this, super.toString());
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    int computeHashCode() {
        return com.google.protobuf.Protobuf.getInstance().schemaFor(this).hashCode(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return com.google.protobuf.Protobuf.getInstance().schemaFor(this).equals(this, (com.google.protobuf.GeneratedMessageLite) obj);
        }
        return false;
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == com.google.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = com.google.protobuf.UnknownFieldSetLite.newInstance();
        }
    }

    protected boolean parseUnknownField(int i, com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        if (com.google.protobuf.WireFormat.getTagWireType(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(i, codedInputStream);
    }

    protected void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(i, i2);
    }

    protected void mergeLengthDelimitedField(int i, com.google.protobuf.ByteString byteString) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(i, byteString);
    }

    protected void makeImmutable() {
        com.google.protobuf.Protobuf.getInstance().schemaFor(this).makeImmutable(this);
        markImmutable();
    }

    protected final <MessageType extends com.google.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER);
    }

    protected final <MessageType extends com.google.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((com.google.protobuf.GeneratedMessageLite) messagetype);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return isInitialized(this, java.lang.Boolean.TRUE.booleanValue());
    }

    @Override // com.google.protobuf.MessageLite
    public final BuilderType toBuilder() {
        return (BuilderType) ((com.google.protobuf.GeneratedMessageLite.Builder) dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER)).mergeFrom(this);
    }

    protected java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    protected java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    @Override // com.google.protobuf.AbstractMessageLite
    int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.AbstractMessageLite
    void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + i);
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        com.google.protobuf.Protobuf.getInstance().schemaFor(this).writeTo(this, com.google.protobuf.CodedOutputStreamWriter.forCodedOutput(codedOutputStream));
    }

    @Override // com.google.protobuf.AbstractMessageLite
    int getSerializedSize(com.google.protobuf.Schema schema) {
        if (isMutable()) {
            int iComputeSerializedSize = computeSerializedSize(schema);
            if (iComputeSerializedSize >= 0) {
                return iComputeSerializedSize;
            }
            throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + iComputeSerializedSize);
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int iComputeSerializedSize2 = computeSerializedSize(schema);
        setMemoizedSerializedSize(iComputeSerializedSize2);
        return iComputeSerializedSize2;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    private int computeSerializedSize(com.google.protobuf.Schema<?> schema) {
        if (schema == null) {
            return com.google.protobuf.Protobuf.getInstance().schemaFor(this).getSerializedSize(this);
        }
        return schema.getSerializedSize(this);
    }

    java.lang.Object buildMessageInfo() throws java.lang.Exception {
        return dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    static <T extends com.google.protobuf.GeneratedMessageLite<?, ?>> T getDefaultInstance(java.lang.Class<T> cls) {
        com.google.protobuf.GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = (T) ((com.google.protobuf.GeneratedMessageLite) com.google.protobuf.UnsafeUtil.allocateInstance(cls)).getDefaultInstanceForType();
            if (generatedMessageLite == null) {
                throw new java.lang.IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return (T) generatedMessageLite;
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<?, ?>> void registerDefaultInstance(java.lang.Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    protected static java.lang.Object newMessageInfo(com.google.protobuf.MessageLite messageLite, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.protobuf.RawMessageInfo(messageLite, str, objArr);
    }

    protected final void mergeUnknownFields(com.google.protobuf.UnknownFieldSetLite unknownFieldSetLite) {
        this.unknownFields = com.google.protobuf.UnknownFieldSetLite.mutableCopyOf(this.unknownFields, unknownFieldSetLite);
    }

    public static abstract class Builder<MessageType extends com.google.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> extends com.google.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;

        protected Builder(MessageType messagetype) {
            this.defaultInstance = messagetype;
            if (messagetype.isMutable()) {
                throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = (MessageType) newMutableInstance();
        }

        private MessageType newMutableInstance() {
            return (MessageType) this.defaultInstance.newMutableInstance();
        }

        protected final void copyOnWrite() {
            if (this.instance.isMutable()) {
                return;
            }
            copyOnWriteInternal();
        }

        protected void copyOnWriteInternal() {
            MessageType messagetype = (MessageType) newMutableInstance();
            mergeFromInstance(messagetype, this.instance);
            this.instance = messagetype;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return com.google.protobuf.GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public final BuilderType clear() {
            if (this.defaultInstance.isMutable()) {
                throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = (MessageType) newMutableInstance();
            return this;
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BuilderType mo888clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.instance = (MessageType) buildPartial();
            return buildertype;
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public MessageType buildPartial() {
            if (!this.instance.isMutable()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw newUninitializedMessageException(messagetype);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractMessageLite.Builder
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return (BuilderType) mergeFrom((com.google.protobuf.GeneratedMessageLite) messagetype);
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            copyOnWrite();
            mergeFromInstance(this.instance, messagetype);
            return this;
        }

        private static <MessageType> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            com.google.protobuf.Protobuf.getInstance().schemaFor(messagetype).mergeFrom(messagetype, messagetype2);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder
        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i, int i2, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            copyOnWrite();
            try {
                com.google.protobuf.Protobuf.getInstance().schemaFor(this.instance).mergeFrom(this.instance, bArr, i, i + i2, new com.google.protobuf.ArrayDecoders.Registers(extensionRegistryLite));
                return this;
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (java.lang.IndexOutOfBoundsException unused) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
            return (BuilderType) mergeFrom(bArr, i, i2, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            copyOnWrite();
            try {
                com.google.protobuf.Protobuf.getInstance().schemaFor(this.instance).mergeFrom(this.instance, com.google.protobuf.CodedInputStreamReader.forCodedInput(codedInputStream), extensionRegistryLite);
                return this;
            } catch (java.lang.RuntimeException e) {
                if (e.getCause() instanceof java.io.IOException) {
                    throw ((java.io.IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    public static abstract class ExtendableMessage<MessageType extends com.google.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends com.google.protobuf.GeneratedMessageLite<MessageType, BuilderType> implements com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> extensions = com.google.protobuf.FieldSet.emptySet();

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.protobuf.MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite
        public /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite
        public /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder toBuilder() {
            return super.toBuilder();
        }

        protected final void mergeExtensionFields(MessageType messagetype) {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m900clone();
            }
            this.extensions.mergeFrom(messagetype.extensions);
        }

        protected <MessageType extends com.google.protobuf.MessageLite> boolean parseUnknownField(MessageType messagetype, com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, int i) throws java.io.IOException {
            int tagFieldNumber = com.google.protobuf.WireFormat.getTagFieldNumber(i);
            return parseExtension(codedInputStream, extensionRegistryLite, extensionRegistryLite.findLiteExtensionByNumber(messagetype, tagFieldNumber), i, tagFieldNumber);
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0008  */
        private boolean parseExtension(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, int i, int i2) throws java.io.IOException {
            boolean z;
            boolean z2;
            java.lang.Object objBuild;
            com.google.protobuf.MessageLite messageLite;
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
            if (generatedExtension == null) {
                z2 = true;
                z = false;
            } else if (tagWireType == com.google.protobuf.FieldSet.getWireFormatForFieldType(generatedExtension.descriptor.getLiteType(), false)) {
                z2 = false;
                z = false;
            } else if (generatedExtension.descriptor.isRepeated && generatedExtension.descriptor.type.isPackable() && tagWireType == com.google.protobuf.FieldSet.getWireFormatForFieldType(generatedExtension.descriptor.getLiteType(), true)) {
                z = true;
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
            if (z2) {
                return parseUnknownField(i, codedInputStream);
            }
            ensureExtensionsAreMutable();
            if (z) {
                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                if (generatedExtension.descriptor.getLiteType() == com.google.protobuf.WireFormat.FieldType.ENUM) {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        com.google.protobuf.Internal.EnumLite enumLiteFindValueByNumber = generatedExtension.descriptor.getEnumType().findValueByNumber(codedInputStream.readEnum());
                        if (enumLiteFindValueByNumber == null) {
                            return true;
                        }
                        this.extensions.addRepeatedField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(enumLiteFindValueByNumber));
                    }
                } else {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        this.extensions.addRepeatedField(generatedExtension.descriptor, com.google.protobuf.FieldSet.readPrimitiveField(codedInputStream, generatedExtension.descriptor.getLiteType(), false));
                    }
                }
                codedInputStream.popLimit(iPushLimit);
            } else {
                int i3 = com.google.protobuf.GeneratedMessageLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[generatedExtension.descriptor.getLiteJavaType().ordinal()];
                if (i3 == 1) {
                    com.google.protobuf.MessageLite.Builder builder = (generatedExtension.descriptor.isRepeated() || (messageLite = (com.google.protobuf.MessageLite) this.extensions.getField(generatedExtension.descriptor)) == null) ? null : messageLite.toBuilder();
                    if (builder == null) {
                        builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
                    }
                    if (generatedExtension.descriptor.getLiteType() == com.google.protobuf.WireFormat.FieldType.GROUP) {
                        codedInputStream.readGroup(generatedExtension.getNumber(), builder, extensionRegistryLite);
                    } else {
                        codedInputStream.readMessage(builder, extensionRegistryLite);
                    }
                    objBuild = builder.build();
                } else if (i3 == 2) {
                    int i4 = codedInputStream.readEnum();
                    com.google.protobuf.Internal.EnumLite enumLiteFindValueByNumber2 = generatedExtension.descriptor.getEnumType().findValueByNumber(i4);
                    if (enumLiteFindValueByNumber2 == null) {
                        mergeVarintField(i2, i4);
                        return true;
                    }
                    objBuild = enumLiteFindValueByNumber2;
                } else {
                    objBuild = com.google.protobuf.FieldSet.readPrimitiveField(codedInputStream, generatedExtension.descriptor.getLiteType(), false);
                }
                if (generatedExtension.descriptor.isRepeated()) {
                    this.extensions.addRepeatedField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(objBuild));
                } else {
                    this.extensions.setField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(objBuild));
                }
            }
            return true;
        }

        protected <MessageType extends com.google.protobuf.MessageLite> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, int i) throws java.io.IOException {
            if (i == com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG) {
                mergeMessageSetExtensionFromCodedStream(messagetype, codedInputStream, extensionRegistryLite);
                return true;
            }
            if (com.google.protobuf.WireFormat.getTagWireType(i) == 2) {
                return parseUnknownField(messagetype, codedInputStream, extensionRegistryLite, i);
            }
            return codedInputStream.skipField(i);
        }

        private <MessageType extends com.google.protobuf.MessageLite> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int uInt32 = 0;
            com.google.protobuf.ByteString bytes = null;
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtensionFindLiteExtensionByNumber = null;
            while (true) {
                int tag = codedInputStream.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == com.google.protobuf.WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                    uInt32 = codedInputStream.readUInt32();
                    if (uInt32 != 0) {
                        generatedExtensionFindLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(messagetype, uInt32);
                    }
                } else if (tag == com.google.protobuf.WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                    if (uInt32 != 0 && generatedExtensionFindLiteExtensionByNumber != null) {
                        eagerlyMergeMessageSetExtension(codedInputStream, generatedExtensionFindLiteExtensionByNumber, extensionRegistryLite, uInt32);
                        bytes = null;
                    } else {
                        bytes = codedInputStream.readBytes();
                    }
                } else if (!codedInputStream.skipField(tag)) {
                    break;
                }
            }
            codedInputStream.checkLastTagWas(com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG);
            if (bytes == null || uInt32 == 0) {
                return;
            }
            if (generatedExtensionFindLiteExtensionByNumber != null) {
                mergeMessageSetExtensionFromBytes(bytes, extensionRegistryLite, generatedExtensionFindLiteExtensionByNumber);
            } else if (bytes != null) {
                mergeLengthDelimitedField(uInt32, bytes);
            }
        }

        private void eagerlyMergeMessageSetExtension(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, int i) throws java.io.IOException {
            parseExtension(codedInputStream, extensionRegistryLite, generatedExtension, com.google.protobuf.WireFormat.makeTag(i, 2), i);
        }

        private void mergeMessageSetExtensionFromBytes(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) throws java.io.IOException {
            com.google.protobuf.MessageLite messageLite = (com.google.protobuf.MessageLite) this.extensions.getField(generatedExtension.descriptor);
            com.google.protobuf.MessageLite.Builder builder = messageLite != null ? messageLite.toBuilder() : null;
            if (builder == null) {
                builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(byteString, extensionRegistryLite);
            ensureExtensionsAreMutable().setField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(builder.build()));
        }

        com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable() {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m900clone();
            }
            return this.extensions;
        }

        private void verifyExtensionContainingType(com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(com.google.protobuf.ExtensionLite<MessageType, Type> extensionLite) {
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = com.google.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            return this.extensions.hasField(generatedExtensionCheckIsLite.descriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(com.google.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite) {
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = com.google.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            return this.extensions.getRepeatedFieldCount(generatedExtensionCheckIsLite.descriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.protobuf.ExtensionLite<MessageType, Type> extensionLite) {
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = com.google.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            java.lang.Object field = this.extensions.getField(generatedExtensionCheckIsLite.descriptor);
            if (field == null) {
                return generatedExtensionCheckIsLite.defaultValue;
            }
            return (Type) generatedExtensionCheckIsLite.fromFieldSetType(field);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, int i) {
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = com.google.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            return (Type) generatedExtensionCheckIsLite.singularFromFieldSetType(this.extensions.getRepeatedField(generatedExtensionCheckIsLite.descriptor, i));
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        protected class ExtensionWriter {
            private final java.util.Iterator<java.util.Map.Entry<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object>> iter;
            private final boolean messageSetWireFormat;
            private java.util.Map.Entry<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> next;

            /* synthetic */ ExtensionWriter(com.google.protobuf.GeneratedMessageLite.ExtendableMessage extendableMessage, boolean z, com.google.protobuf.GeneratedMessageLite.AnonymousClass1 anonymousClass1) {
                this(z);
            }

            private ExtensionWriter(boolean z) {
                java.util.Iterator it = com.google.protobuf.GeneratedMessageLite.ExtendableMessage.this.extensions.iterator();
                this.iter = it;
                if (it.hasNext()) {
                    this.next = (java.util.Map.Entry) it.next();
                }
                this.messageSetWireFormat = z;
            }

            public void writeUntil(int i, com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
                while (true) {
                    java.util.Map.Entry<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> entry = this.next;
                    if (entry == null || entry.getKey().getNumber() >= i) {
                        return;
                    }
                    com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor key = this.next.getKey();
                    if (this.messageSetWireFormat && key.getLiteJavaType() == com.google.protobuf.WireFormat.JavaType.MESSAGE && !key.isRepeated()) {
                        codedOutputStream.writeMessageSetExtension(key.getNumber(), (com.google.protobuf.MessageLite) this.next.getValue());
                    } else {
                        com.google.protobuf.FieldSet.writeField(key, this.next.getValue(), codedOutputStream);
                    }
                    if (this.iter.hasNext()) {
                        this.next = this.iter.next();
                    } else {
                        this.next = null;
                    }
                }
            }
        }

        protected com.google.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newExtensionWriter() {
            return new com.google.protobuf.GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this, false, null);
        }

        protected com.google.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newMessageSetExtensionWriter() {
            return new com.google.protobuf.GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this, true, null);
        }

        protected int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        protected int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.getMessageSetSerializedSize();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[com.google.protobuf.WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr;
            try {
                iArr[com.google.protobuf.WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.protobuf.WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends com.google.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends com.google.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType> implements com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected ExtendableBuilder(MessageType messagetype) {
            super(messagetype);
        }

        void internalSetExtensionSet(com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet) {
            copyOnWrite();
            ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions = fieldSet;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.Builder
        protected void copyOnWriteInternal() {
            super.copyOnWriteInternal();
            if (((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions != com.google.protobuf.FieldSet.emptySet()) {
                ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions = ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions.m900clone();
            }
        }

        private com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable() {
            com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions;
            if (!fieldSet.isImmutable()) {
                return fieldSet;
            }
            com.google.protobuf.FieldSet fieldSetClone = fieldSet.m900clone();
            ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions = fieldSetClone;
            return fieldSetClone;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public final MessageType buildPartial() {
            if (!((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).isMutable()) {
                return (MessageType) this.instance;
            }
            ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions.makeImmutable();
            return (MessageType) super.buildPartial();
        }

        private void verifyExtensionContainingType(com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(com.google.protobuf.ExtensionLite<MessageType, Type> extensionLite) {
            return ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).hasExtension(extensionLite);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(com.google.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite) {
            return ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).getExtensionCount(extensionLite);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.protobuf.ExtensionLite<MessageType, Type> extensionLite) {
            return (Type) ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).getExtension(extensionLite);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, int i) {
            return (Type) ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).getExtension(extensionLite, i);
        }

        public final <Type> BuilderType setExtension(com.google.protobuf.ExtensionLite<MessageType, Type> extensionLite, Type type) {
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = com.google.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().setField(generatedExtensionCheckIsLite.descriptor, generatedExtensionCheckIsLite.toFieldSetType(type));
            return this;
        }

        public final <Type> BuilderType setExtension(com.google.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, int i, Type type) {
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = com.google.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().setRepeatedField(generatedExtensionCheckIsLite.descriptor, i, generatedExtensionCheckIsLite.singularToFieldSetType(type));
            return this;
        }

        public final <Type> BuilderType addExtension(com.google.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, Type type) {
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = com.google.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().addRepeatedField(generatedExtensionCheckIsLite.descriptor, generatedExtensionCheckIsLite.singularToFieldSetType(type));
            return this;
        }

        public final BuilderType clearExtension(com.google.protobuf.ExtensionLite<MessageType, ?> extensionLite) {
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = com.google.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().clearField(generatedExtensionCheckIsLite.descriptor);
            return this;
        }
    }

    public static <ContainingType extends com.google.protobuf.MessageLite, Type> com.google.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, com.google.protobuf.MessageLite messageLite, com.google.protobuf.Internal.EnumLiteMap<?> enumLiteMap, int i, com.google.protobuf.WireFormat.FieldType fieldType, java.lang.Class cls) {
        return new com.google.protobuf.GeneratedMessageLite.GeneratedExtension<>(containingtype, type, messageLite, new com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor(enumLiteMap, i, fieldType, false, false), cls);
    }

    public static <ContainingType extends com.google.protobuf.MessageLite, Type> com.google.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, com.google.protobuf.MessageLite messageLite, com.google.protobuf.Internal.EnumLiteMap<?> enumLiteMap, int i, com.google.protobuf.WireFormat.FieldType fieldType, boolean z, java.lang.Class cls) {
        return new com.google.protobuf.GeneratedMessageLite.GeneratedExtension<>(containingtype, java.util.Collections.emptyList(), messageLite, new com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor(enumLiteMap, i, fieldType, true, z), cls);
    }

    static final class ExtensionDescriptor implements com.google.protobuf.FieldSet.FieldDescriptorLite<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> {
        final com.google.protobuf.Internal.EnumLiteMap<?> enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final com.google.protobuf.WireFormat.FieldType type;

        ExtensionDescriptor(com.google.protobuf.Internal.EnumLiteMap<?> enumLiteMap, int i, com.google.protobuf.WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.enumTypeMap = enumLiteMap;
            this.number = i;
            this.type = fieldType;
            this.isRepeated = z;
            this.isPacked = z2;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
            return this.number;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public com.google.protobuf.WireFormat.FieldType getLiteType() {
            return this.type;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public com.google.protobuf.WireFormat.JavaType getLiteJavaType() {
            return this.type.getJavaType();
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
            return this.isRepeated;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
            return this.isPacked;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public com.google.protobuf.Internal.EnumLiteMap<?> getEnumType() {
            return this.enumTypeMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public com.google.protobuf.MessageLite.Builder internalMergeFrom(com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.MessageLite messageLite) {
            return ((com.google.protobuf.GeneratedMessageLite.Builder) builder).mergeFrom((com.google.protobuf.GeneratedMessageLite) messageLite);
        }

        @Override // java.lang.Comparable
        public int compareTo(com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor) {
            return this.number - extensionDescriptor.number;
        }
    }

    static java.lang.reflect.Method getMethodOrDie(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    static java.lang.Object invokeOrDie(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static class GeneratedExtension<ContainingType extends com.google.protobuf.MessageLite, Type> extends com.google.protobuf.ExtensionLite<ContainingType, Type> {
        final ContainingType containingTypeDefaultInstance;
        final Type defaultValue;
        final com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor descriptor;
        final com.google.protobuf.MessageLite messageDefaultInstance;

        GeneratedExtension(ContainingType containingtype, Type type, com.google.protobuf.MessageLite messageLite, com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor, java.lang.Class cls) {
            if (containingtype == null) {
                throw new java.lang.IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (extensionDescriptor.getLiteType() == com.google.protobuf.WireFormat.FieldType.MESSAGE && messageLite == null) {
                throw new java.lang.IllegalArgumentException("Null messageDefaultInstance");
            }
            this.containingTypeDefaultInstance = containingtype;
            this.defaultValue = type;
            this.messageDefaultInstance = messageLite;
            this.descriptor = extensionDescriptor;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        @Override // com.google.protobuf.ExtensionLite
        public int getNumber() {
            return this.descriptor.getNumber();
        }

        @Override // com.google.protobuf.ExtensionLite
        public com.google.protobuf.MessageLite getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        java.lang.Object fromFieldSetType(java.lang.Object obj) {
            if (this.descriptor.isRepeated()) {
                if (this.descriptor.getLiteJavaType() != com.google.protobuf.WireFormat.JavaType.ENUM) {
                    return obj;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(singularFromFieldSetType(it.next()));
                }
                return arrayList;
            }
            return singularFromFieldSetType(obj);
        }

        java.lang.Object singularFromFieldSetType(java.lang.Object obj) {
            return this.descriptor.getLiteJavaType() == com.google.protobuf.WireFormat.JavaType.ENUM ? this.descriptor.enumTypeMap.findValueByNumber(((java.lang.Integer) obj).intValue()) : obj;
        }

        java.lang.Object toFieldSetType(java.lang.Object obj) {
            if (this.descriptor.isRepeated()) {
                if (this.descriptor.getLiteJavaType() != com.google.protobuf.WireFormat.JavaType.ENUM) {
                    return obj;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(singularToFieldSetType(it.next()));
                }
                return arrayList;
            }
            return singularToFieldSetType(obj);
        }

        java.lang.Object singularToFieldSetType(java.lang.Object obj) {
            return this.descriptor.getLiteJavaType() == com.google.protobuf.WireFormat.JavaType.ENUM ? java.lang.Integer.valueOf(((com.google.protobuf.Internal.EnumLite) obj).getNumber()) : obj;
        }

        @Override // com.google.protobuf.ExtensionLite
        public com.google.protobuf.WireFormat.FieldType getLiteType() {
            return this.descriptor.getLiteType();
        }

        @Override // com.google.protobuf.ExtensionLite
        public boolean isRepeated() {
            return this.descriptor.isRepeated;
        }

        @Override // com.google.protobuf.ExtensionLite
        public Type getDefaultValue() {
            return this.defaultValue;
        }
    }

    protected static final class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final java.lang.Class<?> messageClass;
        private final java.lang.String messageClassName;

        public static com.google.protobuf.GeneratedMessageLite.SerializedForm of(com.google.protobuf.MessageLite messageLite) {
            return new com.google.protobuf.GeneratedMessageLite.SerializedForm(messageLite);
        }

        SerializedForm(com.google.protobuf.MessageLite messageLite) {
            java.lang.Class<?> cls = messageLite.getClass();
            this.messageClass = cls;
            this.messageClassName = cls.getName();
            this.asBytes = messageLite.toByteArray();
        }

        protected java.lang.Object readResolve() throws java.io.ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((com.google.protobuf.MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw new java.lang.RuntimeException("Unable to understand proto buffer", e);
            } catch (java.lang.ClassNotFoundException e2) {
                throw new java.lang.RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e2);
            } catch (java.lang.IllegalAccessException e3) {
                throw new java.lang.RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (java.lang.NoSuchFieldException unused) {
                return readResolveFallback();
            } catch (java.lang.SecurityException e4) {
                throw new java.lang.RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, e4);
            }
        }

        @java.lang.Deprecated
        private java.lang.Object readResolveFallback() throws java.io.ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((com.google.protobuf.MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw new java.lang.RuntimeException("Unable to understand proto buffer", e);
            } catch (java.lang.ClassNotFoundException e2) {
                throw new java.lang.RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e2);
            } catch (java.lang.IllegalAccessException e3) {
                throw new java.lang.RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (java.lang.NoSuchFieldException e4) {
                throw new java.lang.RuntimeException("Unable to find defaultInstance in " + this.messageClassName, e4);
            } catch (java.lang.SecurityException e5) {
                throw new java.lang.RuntimeException("Unable to call defaultInstance in " + this.messageClassName, e5);
            }
        }

        private java.lang.Class<?> resolveMessageClass() throws java.lang.ClassNotFoundException {
            java.lang.Class<?> cls = this.messageClass;
            return cls != null ? cls : java.lang.Class.forName(this.messageClassName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends com.google.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>, T> com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, T> checkIsLite(com.google.protobuf.ExtensionLite<MessageType, T> extensionLite) {
        if (!extensionLite.isLite()) {
            throw new java.lang.IllegalArgumentException("Expected a lite extension.");
        }
        return (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) extensionLite;
    }

    protected static final <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        byte bByteValue = ((java.lang.Byte) t.dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = com.google.protobuf.Protobuf.getInstance().schemaFor(t).isInitialized(t);
        if (z) {
            t.dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? t : null);
        }
        return zIsInitialized;
    }

    protected static com.google.protobuf.Internal.IntList emptyIntList() {
        return com.google.protobuf.IntArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$IntList] */
    protected static com.google.protobuf.Internal.IntList mutableCopy(com.google.protobuf.Internal.IntList intList) {
        int size = intList.size();
        return intList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static com.google.protobuf.Internal.LongList emptyLongList() {
        return com.google.protobuf.LongArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$LongList] */
    protected static com.google.protobuf.Internal.LongList mutableCopy(com.google.protobuf.Internal.LongList longList) {
        int size = longList.size();
        return longList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static com.google.protobuf.Internal.FloatList emptyFloatList() {
        return com.google.protobuf.FloatArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$FloatList] */
    protected static com.google.protobuf.Internal.FloatList mutableCopy(com.google.protobuf.Internal.FloatList floatList) {
        int size = floatList.size();
        return floatList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static com.google.protobuf.Internal.DoubleList emptyDoubleList() {
        return com.google.protobuf.DoubleArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$DoubleList] */
    protected static com.google.protobuf.Internal.DoubleList mutableCopy(com.google.protobuf.Internal.DoubleList doubleList) {
        int size = doubleList.size();
        return doubleList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static com.google.protobuf.Internal.BooleanList emptyBooleanList() {
        return com.google.protobuf.BooleanArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$BooleanList] */
    protected static com.google.protobuf.Internal.BooleanList mutableCopy(com.google.protobuf.Internal.BooleanList booleanList) {
        int size = booleanList.size();
        return booleanList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static <E> com.google.protobuf.Internal.ProtobufList<E> emptyProtobufList() {
        return com.google.protobuf.ProtobufArrayList.emptyList();
    }

    protected static <E> com.google.protobuf.Internal.ProtobufList<E> mutableCopy(com.google.protobuf.Internal.ProtobufList<E> protobufList) {
        int size = protobufList.size();
        return protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class DefaultInstanceBasedParser<T extends com.google.protobuf.GeneratedMessageLite<T, ?>> extends com.google.protobuf.AbstractParser<T> {
        private final T defaultInstance;

        public DefaultInstanceBasedParser(T t) {
            this.defaultInstance = t;
        }

        @Override // com.google.protobuf.Parser
        public T parsePartialFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (T) com.google.protobuf.GeneratedMessageLite.parsePartialFrom(this.defaultInstance, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public T parsePartialFrom(byte[] bArr, int i, int i2, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (T) com.google.protobuf.GeneratedMessageLite.parsePartialFrom(this.defaultInstance, bArr, i, i2, extensionRegistryLite);
        }
    }

    static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        T t2 = (T) t.newMutableInstance();
        try {
            com.google.protobuf.Schema schemaSchemaFor = com.google.protobuf.Protobuf.getInstance().schemaFor(t2);
            schemaSchemaFor.mergeFrom(t2, com.google.protobuf.CodedInputStreamReader.forCodedInput(codedInputStream), extensionRegistryLite);
            schemaSchemaFor.makeImmutable(t2);
            return t2;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            e = e;
            if (e.getThrownFromInputStream()) {
                e = new com.google.protobuf.InvalidProtocolBufferException((java.io.IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (com.google.protobuf.UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof com.google.protobuf.InvalidProtocolBufferException) {
                throw ((com.google.protobuf.InvalidProtocolBufferException) e3.getCause());
            }
            throw new com.google.protobuf.InvalidProtocolBufferException(e3).setUnfinishedMessage(t2);
        } catch (java.lang.RuntimeException e4) {
            if (e4.getCause() instanceof com.google.protobuf.InvalidProtocolBufferException) {
                throw ((com.google.protobuf.InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        T t2 = (T) t.newMutableInstance();
        try {
            com.google.protobuf.Schema schemaSchemaFor = com.google.protobuf.Protobuf.getInstance().schemaFor(t2);
            schemaSchemaFor.mergeFrom(t2, bArr, i, i + i2, new com.google.protobuf.ArrayDecoders.Registers(extensionRegistryLite));
            schemaSchemaFor.makeImmutable(t2);
            return t2;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            e = e;
            if (e.getThrownFromInputStream()) {
                e = new com.google.protobuf.InvalidProtocolBufferException((java.io.IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (com.google.protobuf.UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof com.google.protobuf.InvalidProtocolBufferException) {
                throw ((com.google.protobuf.InvalidProtocolBufferException) e3.getCause());
            }
            throw new com.google.protobuf.InvalidProtocolBufferException(e3).setUnfinishedMessage(t2);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(t2);
        }
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, com.google.protobuf.CodedInputStream codedInputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) parsePartialFrom(t, codedInputStream, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    private static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t) throws com.google.protobuf.InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t, com.google.protobuf.CodedInputStream.newInstance(byteBuffer), extensionRegistryLite));
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) parseFrom(t, byteBuffer, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t, byteString, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, byteString, extensionRegistryLite));
    }

    private static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.protobuf.CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
        T t2 = (T) parsePartialFrom(t, codedInputStreamNewCodedInput, extensionRegistryLite);
        try {
            codedInputStreamNewCodedInput.checkLastTagWas(0);
            return t2;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(t2);
        }
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, extensionRegistryLite));
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.io.InputStream inputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, com.google.protobuf.CodedInputStream.newInstance(inputStream), com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, com.google.protobuf.CodedInputStream.newInstance(inputStream), extensionRegistryLite));
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, com.google.protobuf.CodedInputStream codedInputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) parseFrom(t, codedInputStream, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, codedInputStream, extensionRegistryLite));
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, java.io.InputStream inputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, extensionRegistryLite));
    }

    private static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t, java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            com.google.protobuf.CodedInputStream codedInputStreamNewInstance = com.google.protobuf.CodedInputStream.newInstance(new com.google.protobuf.AbstractMessageLite.Builder.LimitedInputStream(inputStream, com.google.protobuf.CodedInputStream.readRawVarint32(i, inputStream)));
            T t2 = (T) parsePartialFrom(t, codedInputStreamNewInstance, extensionRegistryLite);
            try {
                codedInputStreamNewInstance.checkLastTagWas(0);
                return t2;
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(t2);
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e2) {
            if (e2.getThrownFromInputStream()) {
                throw new com.google.protobuf.InvalidProtocolBufferException((java.io.IOException) e2);
            }
            throw e2;
        } catch (java.io.IOException e3) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e3);
        }
    }
}
