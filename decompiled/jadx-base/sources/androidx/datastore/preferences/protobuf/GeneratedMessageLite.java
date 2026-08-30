package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static java.util.Map<java.lang.Object, androidx.datastore.preferences.protobuf.GeneratedMessageLite<?, ?>> defaultInstanceMap = new java.util.concurrent.ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected androidx.datastore.preferences.protobuf.UnknownFieldSetLite unknownFields = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance();

    public interface ExtendableMessageOrBuilder<MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
        <Type> Type getExtension(androidx.datastore.preferences.protobuf.ExtensionLite<MessageType, Type> extension);

        <Type> Type getExtension(androidx.datastore.preferences.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extension, int index);

        <Type> int getExtensionCount(androidx.datastore.preferences.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extension);

        <Type> boolean hasExtension(androidx.datastore.preferences.protobuf.ExtensionLite<MessageType, Type> extension);
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

    protected abstract java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke method, java.lang.Object arg0, java.lang.Object arg1);

    boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    void setMemoizedHashCode(int value) {
        this.memoizedHashCode = value;
    }

    void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final androidx.datastore.preferences.protobuf.Parser<MessageType> getParserForType() {
        return (androidx.datastore.preferences.protobuf.Parser) dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER);
    }

    MessageType newMutableInstance() {
        return (MessageType) dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public java.lang.String toString() {
        return androidx.datastore.preferences.protobuf.MessageLiteToString.toString(this, super.toString());
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
        return androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor(this).hashCode(this);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && getClass() == other.getClass()) {
            return androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor(this).equals(this, (androidx.datastore.preferences.protobuf.GeneratedMessageLite) other);
        }
        return false;
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == androidx.datastore.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.newInstance();
        }
    }

    protected boolean parseUnknownField(int tag, androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
        if (androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(tag, input);
    }

    protected void mergeVarintField(int tag, int value) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(tag, value);
    }

    protected void mergeLengthDelimitedField(int fieldNumber, androidx.datastore.preferences.protobuf.ByteString value) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(fieldNumber, value);
    }

    protected void makeImmutable() {
        androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor(this).makeImmutable(this);
        markImmutable();
    }

    protected final <MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER);
    }

    protected final <MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((androidx.datastore.preferences.protobuf.GeneratedMessageLite) messagetype);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final BuilderType toBuilder() {
        return (BuilderType) ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder) dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER)).mergeFrom(this);
    }

    protected java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke method, java.lang.Object arg0) {
        return dynamicMethod(method, arg0, null);
    }

    protected java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke method) {
        return dynamicMethod(method, null, null);
    }

    void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    void setMemoizedSerializedSize(int size) {
        if (size < 0) {
            throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + size);
        }
        this.memoizedSerializedSize = (size & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public void writeTo(androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor(this).writeTo(this, androidx.datastore.preferences.protobuf.CodedOutputStreamWriter.forCodedOutput(output));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    int getSerializedSize(androidx.datastore.preferences.protobuf.Schema schema) {
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

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    private int computeSerializedSize(androidx.datastore.preferences.protobuf.Schema<?> nullableSchema) {
        if (nullableSchema == null) {
            return androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor(this).getSerializedSize(this);
        }
        return nullableSchema.getSerializedSize(this);
    }

    java.lang.Object buildMessageInfo() throws java.lang.Exception {
        return dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<?, ?>> T getDefaultInstance(java.lang.Class<T> cls) {
        androidx.datastore.preferences.protobuf.GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = (T) ((androidx.datastore.preferences.protobuf.GeneratedMessageLite) androidx.datastore.preferences.protobuf.UnsafeUtil.allocateInstance(cls)).getDefaultInstanceForType();
            if (generatedMessageLite == null) {
                throw new java.lang.IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return (T) generatedMessageLite;
    }

    protected static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<?, ?>> void registerDefaultInstance(java.lang.Class<T> clazz, T defaultInstance) {
        defaultInstance.markImmutable();
        defaultInstanceMap.put(clazz, defaultInstance);
    }

    protected static java.lang.Object newMessageInfo(androidx.datastore.preferences.protobuf.MessageLite defaultInstance, java.lang.String info, java.lang.Object[] objects) {
        return new androidx.datastore.preferences.protobuf.RawMessageInfo(defaultInstance, info, objects);
    }

    protected final void mergeUnknownFields(androidx.datastore.preferences.protobuf.UnknownFieldSetLite unknownFields) {
        this.unknownFields = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.mutableCopyOf(this.unknownFields, unknownFields);
    }

    public static abstract class Builder<MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType> {
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

        @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return androidx.datastore.preferences.protobuf.GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final BuilderType clear() {
            if (this.defaultInstance.isMutable()) {
                throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = (MessageType) newMutableInstance();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BuilderType mo45clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.instance = (MessageType) buildPartial();
            return buildertype;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public MessageType buildPartial() {
            if (!this.instance.isMutable()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw newUninitializedMessageException(messagetype);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return (BuilderType) mergeFrom((androidx.datastore.preferences.protobuf.GeneratedMessageLite) messagetype);
        }

        public BuilderType mergeFrom(MessageType message) {
            if (getDefaultInstanceForType().equals(message)) {
                return this;
            }
            copyOnWrite();
            mergeFromInstance(this.instance, message);
            return this;
        }

        private static <MessageType> void mergeFromInstance(MessageType dest, MessageType src) {
            androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor(dest).mergeFrom(dest, src);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] input, int offset, int length, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            copyOnWrite();
            try {
                androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor(this.instance).mergeFrom(this.instance, input, offset, offset + length, new androidx.datastore.preferences.protobuf.ArrayDecoders.Registers(extensionRegistry));
                return this;
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (java.lang.IndexOutOfBoundsException unused) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i, int i2) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (BuilderType) mergeFrom(bArr, i, i2, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            copyOnWrite();
            try {
                androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor(this.instance).mergeFrom(this.instance, androidx.datastore.preferences.protobuf.CodedInputStreamReader.forCodedInput(input), extensionRegistry);
                return this;
            } catch (java.lang.RuntimeException e) {
                if (e.getCause() instanceof java.io.IOException) {
                    throw ((java.io.IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    public static abstract class ExtendableMessage<MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> implements androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> extensions = androidx.datastore.preferences.protobuf.FieldSet.emptySet();

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.MessageLite.Builder newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.MessageLite.Builder toBuilder() {
            return super.toBuilder();
        }

        protected final void mergeExtensionFields(final MessageType other) {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m46clone();
            }
            this.extensions.mergeFrom(other.extensions);
        }

        protected <MessageType extends androidx.datastore.preferences.protobuf.MessageLite> boolean parseUnknownField(MessageType defaultInstance, androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, int tag) throws java.io.IOException {
            int tagFieldNumber = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag);
            return parseExtension(input, extensionRegistry, extensionRegistry.findLiteExtensionByNumber(defaultInstance, tagFieldNumber), tag, tagFieldNumber);
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0008  */
        private boolean parseExtension(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> extension, int tag, int fieldNumber) throws java.io.IOException {
            boolean z;
            boolean z2;
            java.lang.Object objBuild;
            androidx.datastore.preferences.protobuf.MessageLite messageLite;
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
            if (extension == null) {
                z2 = true;
                z = false;
            } else if (tagWireType == androidx.datastore.preferences.protobuf.FieldSet.getWireFormatForFieldType(extension.descriptor.getLiteType(), false)) {
                z2 = false;
                z = false;
            } else if (extension.descriptor.isRepeated && extension.descriptor.type.isPackable() && tagWireType == androidx.datastore.preferences.protobuf.FieldSet.getWireFormatForFieldType(extension.descriptor.getLiteType(), true)) {
                z = true;
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
            if (z2) {
                return parseUnknownField(tag, input);
            }
            ensureExtensionsAreMutable();
            if (z) {
                int iPushLimit = input.pushLimit(input.readRawVarint32());
                if (extension.descriptor.getLiteType() == androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM) {
                    while (input.getBytesUntilLimit() > 0) {
                        androidx.datastore.preferences.protobuf.Internal.EnumLite enumLiteFindValueByNumber = extension.descriptor.getEnumType().findValueByNumber(input.readEnum());
                        if (enumLiteFindValueByNumber == null) {
                            return true;
                        }
                        this.extensions.addRepeatedField(extension.descriptor, extension.singularToFieldSetType(enumLiteFindValueByNumber));
                    }
                } else {
                    while (input.getBytesUntilLimit() > 0) {
                        this.extensions.addRepeatedField(extension.descriptor, androidx.datastore.preferences.protobuf.FieldSet.readPrimitiveField(input, extension.descriptor.getLiteType(), false));
                    }
                }
                input.popLimit(iPushLimit);
            } else {
                int i = androidx.datastore.preferences.protobuf.GeneratedMessageLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[extension.descriptor.getLiteJavaType().ordinal()];
                if (i == 1) {
                    androidx.datastore.preferences.protobuf.MessageLite.Builder builder = (extension.descriptor.isRepeated() || (messageLite = (androidx.datastore.preferences.protobuf.MessageLite) this.extensions.getField(extension.descriptor)) == null) ? null : messageLite.toBuilder();
                    if (builder == null) {
                        builder = extension.getMessageDefaultInstance().newBuilderForType();
                    }
                    if (extension.descriptor.getLiteType() == androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP) {
                        input.readGroup(extension.getNumber(), builder, extensionRegistry);
                    } else {
                        input.readMessage(builder, extensionRegistry);
                    }
                    objBuild = builder.build();
                } else if (i == 2) {
                    int i2 = input.readEnum();
                    androidx.datastore.preferences.protobuf.Internal.EnumLite enumLiteFindValueByNumber2 = extension.descriptor.getEnumType().findValueByNumber(i2);
                    if (enumLiteFindValueByNumber2 == null) {
                        mergeVarintField(fieldNumber, i2);
                        return true;
                    }
                    objBuild = enumLiteFindValueByNumber2;
                } else {
                    objBuild = androidx.datastore.preferences.protobuf.FieldSet.readPrimitiveField(input, extension.descriptor.getLiteType(), false);
                }
                if (extension.descriptor.isRepeated()) {
                    this.extensions.addRepeatedField(extension.descriptor, extension.singularToFieldSetType(objBuild));
                } else {
                    this.extensions.setField(extension.descriptor, extension.singularToFieldSetType(objBuild));
                }
            }
            return true;
        }

        protected <MessageType extends androidx.datastore.preferences.protobuf.MessageLite> boolean parseUnknownFieldAsMessageSet(MessageType defaultInstance, androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, int tag) throws java.io.IOException {
            if (tag == androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG) {
                mergeMessageSetExtensionFromCodedStream(defaultInstance, input, extensionRegistry);
                return true;
            }
            if (androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag) == 2) {
                return parseUnknownField(defaultInstance, input, extensionRegistry, tag);
            }
            return input.skipField(tag);
        }

        private <MessageType extends androidx.datastore.preferences.protobuf.MessageLite> void mergeMessageSetExtensionFromCodedStream(MessageType defaultInstance, androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int uInt32 = 0;
            androidx.datastore.preferences.protobuf.ByteString bytes = null;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtensionFindLiteExtensionByNumber = null;
            while (true) {
                int tag = input.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                    uInt32 = input.readUInt32();
                    if (uInt32 != 0) {
                        generatedExtensionFindLiteExtensionByNumber = extensionRegistry.findLiteExtensionByNumber(defaultInstance, uInt32);
                    }
                } else if (tag == androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                    if (uInt32 != 0 && generatedExtensionFindLiteExtensionByNumber != null) {
                        eagerlyMergeMessageSetExtension(input, generatedExtensionFindLiteExtensionByNumber, extensionRegistry, uInt32);
                        bytes = null;
                    } else {
                        bytes = input.readBytes();
                    }
                } else if (!input.skipField(tag)) {
                    break;
                }
            }
            input.checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG);
            if (bytes == null || uInt32 == 0) {
                return;
            }
            if (generatedExtensionFindLiteExtensionByNumber != null) {
                mergeMessageSetExtensionFromBytes(bytes, extensionRegistry, generatedExtensionFindLiteExtensionByNumber);
            } else if (bytes != null) {
                mergeLengthDelimitedField(uInt32, bytes);
            }
        }

        private void eagerlyMergeMessageSetExtension(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> extension, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, int typeId) throws java.io.IOException {
            parseExtension(input, extensionRegistry, extension, androidx.datastore.preferences.protobuf.WireFormat.makeTag(typeId, 2), typeId);
        }

        private void mergeMessageSetExtensionFromBytes(androidx.datastore.preferences.protobuf.ByteString rawBytes, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> extension) throws java.io.IOException {
            androidx.datastore.preferences.protobuf.MessageLite messageLite = (androidx.datastore.preferences.protobuf.MessageLite) this.extensions.getField(extension.descriptor);
            androidx.datastore.preferences.protobuf.MessageLite.Builder builder = messageLite != null ? messageLite.toBuilder() : null;
            if (builder == null) {
                builder = extension.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(rawBytes, extensionRegistry);
            ensureExtensionsAreMutable().setField(extension.descriptor, extension.singularToFieldSetType(builder.build()));
        }

        androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable() {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m46clone();
            }
            return this.extensions;
        }

        private void verifyExtensionContainingType(final androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> extension) {
            if (extension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(final androidx.datastore.preferences.protobuf.ExtensionLite<MessageType, Type> extension) {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = androidx.datastore.preferences.protobuf.GeneratedMessageLite.checkIsLite(extension);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            return this.extensions.hasField(generatedExtensionCheckIsLite.descriptor);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(final androidx.datastore.preferences.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extension) {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = androidx.datastore.preferences.protobuf.GeneratedMessageLite.checkIsLite(extension);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            return this.extensions.getRepeatedFieldCount(generatedExtensionCheckIsLite.descriptor);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(androidx.datastore.preferences.protobuf.ExtensionLite<MessageType, Type> extensionLite) {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = androidx.datastore.preferences.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            java.lang.Object field = this.extensions.getField(generatedExtensionCheckIsLite.descriptor);
            if (field == null) {
                return generatedExtensionCheckIsLite.defaultValue;
            }
            return (Type) generatedExtensionCheckIsLite.fromFieldSetType(field);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(androidx.datastore.preferences.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, int i) {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = androidx.datastore.preferences.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            return (Type) generatedExtensionCheckIsLite.singularFromFieldSetType(this.extensions.getRepeatedField(generatedExtensionCheckIsLite.descriptor, i));
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        protected class ExtensionWriter {
            private final java.util.Iterator<java.util.Map.Entry<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object>> iter;
            private final boolean messageSetWireFormat;
            private java.util.Map.Entry<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> next;

            /* synthetic */ ExtensionWriter(androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage extendableMessage, boolean z, androidx.datastore.preferences.protobuf.GeneratedMessageLite.AnonymousClass1 anonymousClass1) {
                this(z);
            }

            private ExtensionWriter(boolean messageSetWireFormat) {
                java.util.Iterator it = androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage.this.extensions.iterator();
                this.iter = it;
                if (it.hasNext()) {
                    this.next = (java.util.Map.Entry) it.next();
                }
                this.messageSetWireFormat = messageSetWireFormat;
            }

            public void writeUntil(final int end, final androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
                while (true) {
                    java.util.Map.Entry<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> entry = this.next;
                    if (entry == null || entry.getKey().getNumber() >= end) {
                        return;
                    }
                    androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor key = this.next.getKey();
                    if (this.messageSetWireFormat && key.getLiteJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE && !key.isRepeated()) {
                        output.writeMessageSetExtension(key.getNumber(), (androidx.datastore.preferences.protobuf.MessageLite) this.next.getValue());
                    } else {
                        androidx.datastore.preferences.protobuf.FieldSet.writeField(key, this.next.getValue(), output);
                    }
                    if (this.iter.hasNext()) {
                        this.next = this.iter.next();
                    } else {
                        this.next = null;
                    }
                }
            }
        }

        protected androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newExtensionWriter() {
            return new androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this, false, null);
        }

        protected androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newMessageSetExtensionWriter() {
            return new androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this, true, null);
        }

        protected int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        protected int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.getMessageSetSerializedSize();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType> implements androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected ExtendableBuilder(MessageType defaultInstance) {
            super(defaultInstance);
        }

        void internalSetExtensionSet(androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> extensions) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions = extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder
        protected void copyOnWriteInternal() {
            super.copyOnWriteInternal();
            if (((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions != androidx.datastore.preferences.protobuf.FieldSet.emptySet()) {
                ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions = ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions.m46clone();
            }
        }

        private androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable() {
            androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions;
            if (!fieldSet.isImmutable()) {
                return fieldSet;
            }
            androidx.datastore.preferences.protobuf.FieldSet fieldSetClone = fieldSet.m46clone();
            ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions = fieldSetClone;
            return fieldSetClone;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final MessageType buildPartial() {
            if (!((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).isMutable()) {
                return (MessageType) this.instance;
            }
            ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions.makeImmutable();
            return (MessageType) super.buildPartial();
        }

        private void verifyExtensionContainingType(final androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> extension) {
            if (extension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(final androidx.datastore.preferences.protobuf.ExtensionLite<MessageType, Type> extension) {
            return ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).hasExtension(extension);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(final androidx.datastore.preferences.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extension) {
            return ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).getExtensionCount(extension);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(androidx.datastore.preferences.protobuf.ExtensionLite<MessageType, Type> extensionLite) {
            return (Type) ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).getExtension(extensionLite);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(androidx.datastore.preferences.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, int i) {
            return (Type) ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).getExtension(extensionLite, i);
        }

        public final <Type> BuilderType setExtension(final androidx.datastore.preferences.protobuf.ExtensionLite<MessageType, Type> extension, final Type value) {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = androidx.datastore.preferences.protobuf.GeneratedMessageLite.checkIsLite(extension);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().setField(generatedExtensionCheckIsLite.descriptor, generatedExtensionCheckIsLite.toFieldSetType(value));
            return this;
        }

        public final <Type> BuilderType setExtension(final androidx.datastore.preferences.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extension, final int index, final Type value) {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = androidx.datastore.preferences.protobuf.GeneratedMessageLite.checkIsLite(extension);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().setRepeatedField(generatedExtensionCheckIsLite.descriptor, index, generatedExtensionCheckIsLite.singularToFieldSetType(value));
            return this;
        }

        public final <Type> BuilderType addExtension(final androidx.datastore.preferences.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extension, final Type value) {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = androidx.datastore.preferences.protobuf.GeneratedMessageLite.checkIsLite(extension);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().addRepeatedField(generatedExtensionCheckIsLite.descriptor, generatedExtensionCheckIsLite.singularToFieldSetType(value));
            return this;
        }

        public final BuilderType clearExtension(final androidx.datastore.preferences.protobuf.ExtensionLite<MessageType, ?> extension) {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = androidx.datastore.preferences.protobuf.GeneratedMessageLite.checkIsLite(extension);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().clearField(generatedExtensionCheckIsLite.descriptor);
            return this;
        }
    }

    public static <ContainingType extends androidx.datastore.preferences.protobuf.MessageLite, Type> androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(final ContainingType containingTypeDefaultInstance, final Type defaultValue, final androidx.datastore.preferences.protobuf.MessageLite messageDefaultInstance, final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> enumTypeMap, final int number, final androidx.datastore.preferences.protobuf.WireFormat.FieldType type, final java.lang.Class singularType) {
        return new androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<>(containingTypeDefaultInstance, defaultValue, messageDefaultInstance, new androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor(enumTypeMap, number, type, false, false), singularType);
    }

    public static <ContainingType extends androidx.datastore.preferences.protobuf.MessageLite, Type> androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(final ContainingType containingTypeDefaultInstance, final androidx.datastore.preferences.protobuf.MessageLite messageDefaultInstance, final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> enumTypeMap, final int number, final androidx.datastore.preferences.protobuf.WireFormat.FieldType type, final boolean isPacked, final java.lang.Class singularType) {
        return new androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<>(containingTypeDefaultInstance, java.util.Collections.emptyList(), messageDefaultInstance, new androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor(enumTypeMap, number, type, true, isPacked), singularType);
    }

    static final class ExtensionDescriptor implements androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> {
        final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final androidx.datastore.preferences.protobuf.WireFormat.FieldType type;

        ExtensionDescriptor(final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> enumTypeMap, final int number, final androidx.datastore.preferences.protobuf.WireFormat.FieldType type, final boolean isRepeated, final boolean isPacked) {
            this.enumTypeMap = enumTypeMap;
            this.number = number;
            this.type = type;
            this.isRepeated = isRepeated;
            this.isPacked = isPacked;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
            return this.number;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public androidx.datastore.preferences.protobuf.WireFormat.FieldType getLiteType() {
            return this.type;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public androidx.datastore.preferences.protobuf.WireFormat.JavaType getLiteJavaType() {
            return this.type.getJavaType();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
            return this.isRepeated;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
            return this.isPacked;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> getEnumType() {
            return this.enumTypeMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public androidx.datastore.preferences.protobuf.MessageLite.Builder internalMergeFrom(androidx.datastore.preferences.protobuf.MessageLite.Builder to, androidx.datastore.preferences.protobuf.MessageLite from) {
            return ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder) to).mergeFrom((androidx.datastore.preferences.protobuf.GeneratedMessageLite) from);
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor other) {
            return this.number - other.number;
        }
    }

    static java.lang.reflect.Method getMethodOrDie(java.lang.Class clazz, java.lang.String name, java.lang.Class... params) {
        try {
            return clazz.getMethod(name, params);
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.RuntimeException("Generated message class \"" + clazz.getName() + "\" missing method \"" + name + "\".", e);
        }
    }

    static java.lang.Object invokeOrDie(java.lang.reflect.Method method, java.lang.Object object, java.lang.Object... params) {
        try {
            return method.invoke(object, params);
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

    public static class GeneratedExtension<ContainingType extends androidx.datastore.preferences.protobuf.MessageLite, Type> extends androidx.datastore.preferences.protobuf.ExtensionLite<ContainingType, Type> {
        final ContainingType containingTypeDefaultInstance;
        final Type defaultValue;
        final androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor descriptor;
        final androidx.datastore.preferences.protobuf.MessageLite messageDefaultInstance;

        GeneratedExtension(final ContainingType containingTypeDefaultInstance, final Type defaultValue, final androidx.datastore.preferences.protobuf.MessageLite messageDefaultInstance, final androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor descriptor, final java.lang.Class singularType) {
            if (containingTypeDefaultInstance == null) {
                throw new java.lang.IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (descriptor.getLiteType() == androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE && messageDefaultInstance == null) {
                throw new java.lang.IllegalArgumentException("Null messageDefaultInstance");
            }
            this.containingTypeDefaultInstance = containingTypeDefaultInstance;
            this.defaultValue = defaultValue;
            this.messageDefaultInstance = messageDefaultInstance;
            this.descriptor = descriptor;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        @Override // androidx.datastore.preferences.protobuf.ExtensionLite
        public int getNumber() {
            return this.descriptor.getNumber();
        }

        @Override // androidx.datastore.preferences.protobuf.ExtensionLite
        public androidx.datastore.preferences.protobuf.MessageLite getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        java.lang.Object fromFieldSetType(java.lang.Object value) {
            if (this.descriptor.isRepeated()) {
                if (this.descriptor.getLiteJavaType() != androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM) {
                    return value;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(singularFromFieldSetType(it.next()));
                }
                return arrayList;
            }
            return singularFromFieldSetType(value);
        }

        java.lang.Object singularFromFieldSetType(java.lang.Object value) {
            return this.descriptor.getLiteJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM ? this.descriptor.enumTypeMap.findValueByNumber(((java.lang.Integer) value).intValue()) : value;
        }

        java.lang.Object toFieldSetType(java.lang.Object value) {
            if (this.descriptor.isRepeated()) {
                if (this.descriptor.getLiteJavaType() != androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM) {
                    return value;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(singularToFieldSetType(it.next()));
                }
                return arrayList;
            }
            return singularToFieldSetType(value);
        }

        java.lang.Object singularToFieldSetType(java.lang.Object value) {
            return this.descriptor.getLiteJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM ? java.lang.Integer.valueOf(((androidx.datastore.preferences.protobuf.Internal.EnumLite) value).getNumber()) : value;
        }

        @Override // androidx.datastore.preferences.protobuf.ExtensionLite
        public androidx.datastore.preferences.protobuf.WireFormat.FieldType getLiteType() {
            return this.descriptor.getLiteType();
        }

        @Override // androidx.datastore.preferences.protobuf.ExtensionLite
        public boolean isRepeated() {
            return this.descriptor.isRepeated;
        }

        @Override // androidx.datastore.preferences.protobuf.ExtensionLite
        public Type getDefaultValue() {
            return this.defaultValue;
        }
    }

    protected static final class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final java.lang.Class<?> messageClass;
        private final java.lang.String messageClassName;

        public static androidx.datastore.preferences.protobuf.GeneratedMessageLite.SerializedForm of(androidx.datastore.preferences.protobuf.MessageLite message) {
            return new androidx.datastore.preferences.protobuf.GeneratedMessageLite.SerializedForm(message);
        }

        SerializedForm(androidx.datastore.preferences.protobuf.MessageLite regularForm) {
            this.messageClass = regularForm.getClass();
            this.messageClassName = regularForm.getClass().getName();
            this.asBytes = regularForm.toByteArray();
        }

        protected java.lang.Object readResolve() throws java.io.ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((androidx.datastore.preferences.protobuf.MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
                throw new java.lang.RuntimeException("Unable to understand proto buffer", e);
            } catch (java.lang.ClassNotFoundException e2) {
                throw new java.lang.RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e2);
            } catch (java.lang.IllegalAccessException e3) {
                throw new java.lang.RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (java.lang.NoSuchFieldException e4) {
                throw new java.lang.RuntimeException("Unable to find DEFAULT_INSTANCE in " + this.messageClassName, e4);
            } catch (java.lang.SecurityException e5) {
                throw new java.lang.RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, e5);
            }
        }

        private java.lang.Class<?> resolveMessageClass() throws java.lang.ClassNotFoundException {
            java.lang.Class<?> cls = this.messageClass;
            return cls != null ? cls : java.lang.Class.forName(this.messageClassName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>, T> androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, T> checkIsLite(androidx.datastore.preferences.protobuf.ExtensionLite<MessageType, T> extension) {
        if (!extension.isLite()) {
            throw new java.lang.IllegalArgumentException("Expected a lite extension.");
        }
        return (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) extension;
    }

    protected static final <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> boolean isInitialized(T message, boolean shouldMemoize) {
        byte bByteValue = ((java.lang.Byte) message.dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor(message).isInitialized(message);
        if (shouldMemoize) {
            message.dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? message : null);
        }
        return zIsInitialized;
    }

    protected static androidx.datastore.preferences.protobuf.Internal.IntList emptyIntList() {
        return androidx.datastore.preferences.protobuf.IntArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$IntList] */
    protected static androidx.datastore.preferences.protobuf.Internal.IntList mutableCopy(androidx.datastore.preferences.protobuf.Internal.IntList list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static androidx.datastore.preferences.protobuf.Internal.LongList emptyLongList() {
        return androidx.datastore.preferences.protobuf.LongArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$LongList] */
    protected static androidx.datastore.preferences.protobuf.Internal.LongList mutableCopy(androidx.datastore.preferences.protobuf.Internal.LongList list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static androidx.datastore.preferences.protobuf.Internal.FloatList emptyFloatList() {
        return androidx.datastore.preferences.protobuf.FloatArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$FloatList] */
    protected static androidx.datastore.preferences.protobuf.Internal.FloatList mutableCopy(androidx.datastore.preferences.protobuf.Internal.FloatList list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static androidx.datastore.preferences.protobuf.Internal.DoubleList emptyDoubleList() {
        return androidx.datastore.preferences.protobuf.DoubleArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$DoubleList] */
    protected static androidx.datastore.preferences.protobuf.Internal.DoubleList mutableCopy(androidx.datastore.preferences.protobuf.Internal.DoubleList list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static androidx.datastore.preferences.protobuf.Internal.BooleanList emptyBooleanList() {
        return androidx.datastore.preferences.protobuf.BooleanArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$BooleanList] */
    protected static androidx.datastore.preferences.protobuf.Internal.BooleanList mutableCopy(androidx.datastore.preferences.protobuf.Internal.BooleanList list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static <E> androidx.datastore.preferences.protobuf.Internal.ProtobufList<E> emptyProtobufList() {
        return androidx.datastore.preferences.protobuf.ProtobufArrayList.emptyList();
    }

    protected static <E> androidx.datastore.preferences.protobuf.Internal.ProtobufList<E> mutableCopy(androidx.datastore.preferences.protobuf.Internal.ProtobufList<E> list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class DefaultInstanceBasedParser<T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> extends androidx.datastore.preferences.protobuf.AbstractParser<T> {
        private final T defaultInstance;

        public DefaultInstanceBasedParser(T defaultInstance) {
            this.defaultInstance = defaultInstance;
        }

        @Override // androidx.datastore.preferences.protobuf.Parser
        public T parsePartialFrom(androidx.datastore.preferences.protobuf.CodedInputStream codedInputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (T) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parsePartialFrom(this.defaultInstance, codedInputStream, extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractParser, androidx.datastore.preferences.protobuf.Parser
        public T parsePartialFrom(byte[] bArr, int i, int i2, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            return (T) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parsePartialFrom(this.defaultInstance, bArr, i, i2, extensionRegistryLite);
        }
    }

    static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, androidx.datastore.preferences.protobuf.CodedInputStream codedInputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        T t2 = (T) t.newMutableInstance();
        try {
            androidx.datastore.preferences.protobuf.Schema schemaSchemaFor = androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor(t2);
            schemaSchemaFor.mergeFrom(t2, androidx.datastore.preferences.protobuf.CodedInputStreamReader.forCodedInput(codedInputStream), extensionRegistryLite);
            schemaSchemaFor.makeImmutable(t2);
            return t2;
        } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
            e = e;
            if (e.getThrownFromInputStream()) {
                e = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException((java.io.IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (androidx.datastore.preferences.protobuf.UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof androidx.datastore.preferences.protobuf.InvalidProtocolBufferException) {
                throw ((androidx.datastore.preferences.protobuf.InvalidProtocolBufferException) e3.getCause());
            }
            throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException(e3).setUnfinishedMessage(t2);
        } catch (java.lang.RuntimeException e4) {
            if (e4.getCause() instanceof androidx.datastore.preferences.protobuf.InvalidProtocolBufferException) {
                throw ((androidx.datastore.preferences.protobuf.InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.newMutableInstance();
        try {
            androidx.datastore.preferences.protobuf.Schema schemaSchemaFor = androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor(t2);
            schemaSchemaFor.mergeFrom(t2, bArr, i, i + i2, new androidx.datastore.preferences.protobuf.ArrayDecoders.Registers(extensionRegistryLite));
            schemaSchemaFor.makeImmutable(t2);
            return t2;
        } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
            e = e;
            if (e.getThrownFromInputStream()) {
                e = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException((java.io.IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (androidx.datastore.preferences.protobuf.UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof androidx.datastore.preferences.protobuf.InvalidProtocolBufferException) {
                throw ((androidx.datastore.preferences.protobuf.InvalidProtocolBufferException) e3.getCause());
            }
            throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException(e3).setUnfinishedMessage(t2);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(t2);
        }
    }

    protected static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, androidx.datastore.preferences.protobuf.CodedInputStream codedInputStream) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (T) parsePartialFrom(t, codedInputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    private static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T checkMessageInitialized(T message) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        if (message == null || message.isInitialized()) {
            return message;
        }
        throw message.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(message);
    }

    protected static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.nio.ByteBuffer byteBuffer, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t, androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(byteBuffer), extensionRegistryLite));
    }

    protected static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.nio.ByteBuffer byteBuffer) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (T) parseFrom(t, byteBuffer, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    protected static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, androidx.datastore.preferences.protobuf.ByteString byteString) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t, byteString, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, androidx.datastore.preferences.protobuf.ByteString byteString, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, byteString, extensionRegistryLite));
    }

    private static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, androidx.datastore.preferences.protobuf.ByteString byteString, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        androidx.datastore.preferences.protobuf.CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
        T t2 = (T) parsePartialFrom(t, codedInputStreamNewCodedInput, extensionRegistryLite);
        try {
            codedInputStreamNewCodedInput.checkLastTagWas(0);
            return t2;
        } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(t2);
        }
    }

    protected static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, extensionRegistryLite));
    }

    protected static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.io.InputStream inputStream) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(inputStream), androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.io.InputStream inputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(inputStream), extensionRegistryLite));
    }

    protected static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, androidx.datastore.preferences.protobuf.CodedInputStream codedInputStream) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (T) parseFrom(t, codedInputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    protected static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, androidx.datastore.preferences.protobuf.CodedInputStream codedInputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, codedInputStream, extensionRegistryLite));
    }

    protected static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, java.io.InputStream inputStream) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, java.io.InputStream inputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, extensionRegistryLite));
    }

    private static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t, java.io.InputStream inputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            androidx.datastore.preferences.protobuf.CodedInputStream codedInputStreamNewInstance = androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(new androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder.LimitedInputStream(inputStream, androidx.datastore.preferences.protobuf.CodedInputStream.readRawVarint32(i, inputStream)));
            T t2 = (T) parsePartialFrom(t, codedInputStreamNewInstance, extensionRegistryLite);
            try {
                codedInputStreamNewInstance.checkLastTagWas(0);
                return t2;
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(t2);
            }
        } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e2) {
            if (e2.getThrownFromInputStream()) {
                throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException((java.io.IOException) e2);
            }
            throw e2;
        } catch (java.io.IOException e3) {
            throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException(e3);
        }
    }
}
