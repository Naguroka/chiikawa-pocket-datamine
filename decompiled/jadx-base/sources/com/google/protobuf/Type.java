package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public final class Type extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.Type, com.google.protobuf.Type.Builder> implements com.google.protobuf.TypeOrBuilder {
    private static final com.google.protobuf.Type DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.Type> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private com.google.protobuf.SourceContext sourceContext_;
    private int syntax_;
    private java.lang.String name_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Field> fields_ = emptyProtobufList();
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> oneofs_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Option> options_ = emptyProtobufList();

    private Type() {
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public java.lang.String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public com.google.protobuf.ByteString getNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(java.lang.String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public java.util.List<com.google.protobuf.Field> getFieldsList() {
        return this.fields_;
    }

    public java.util.List<? extends com.google.protobuf.FieldOrBuilder> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public com.google.protobuf.Field getFields(int i) {
        return this.fields_.get(i);
    }

    public com.google.protobuf.FieldOrBuilder getFieldsOrBuilder(int i) {
        return this.fields_.get(i);
    }

    private void ensureFieldsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Field> protobufList = this.fields_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.fields_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFields(int i, com.google.protobuf.Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.set(i, field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(com.google.protobuf.Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(int i, com.google.protobuf.Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(i, field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFields(java.lang.Iterable<? extends com.google.protobuf.Field> iterable) {
        ensureFieldsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.fields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFields() {
        this.fields_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFields(int i) {
        ensureFieldsIsMutable();
        this.fields_.remove(i);
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public java.util.List<java.lang.String> getOneofsList() {
        return this.oneofs_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public java.lang.String getOneofs(int i) {
        return this.oneofs_.get(i);
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public com.google.protobuf.ByteString getOneofsBytes(int i) {
        return com.google.protobuf.ByteString.copyFromUtf8(this.oneofs_.get(i));
    }

    private void ensureOneofsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.oneofs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.oneofs_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofs(int i, java.lang.String str) {
        str.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofs(java.lang.String str) {
        str.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOneofs(java.lang.Iterable<java.lang.String> iterable) {
        ensureOneofsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.oneofs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofs() {
        this.oneofs_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofsBytes(com.google.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        ensureOneofsIsMutable();
        this.oneofs_.add(byteString.toStringUtf8());
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public java.util.List<com.google.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public java.util.List<? extends com.google.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public com.google.protobuf.Option getOptions(int i) {
        return this.options_.get(i);
    }

    public com.google.protobuf.OptionOrBuilder getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    private void ensureOptionsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Option> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i, com.google.protobuf.Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(com.google.protobuf.Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i, com.google.protobuf.Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(java.lang.Iterable<? extends com.google.protobuf.Option> iterable) {
        ensureOptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public com.google.protobuf.SourceContext getSourceContext() {
        com.google.protobuf.SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? com.google.protobuf.SourceContext.getDefaultInstance() : sourceContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceContext(com.google.protobuf.SourceContext sourceContext) {
        sourceContext.getClass();
        this.sourceContext_ = sourceContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceContext(com.google.protobuf.SourceContext sourceContext) {
        sourceContext.getClass();
        com.google.protobuf.SourceContext sourceContext2 = this.sourceContext_;
        if (sourceContext2 != null && sourceContext2 != com.google.protobuf.SourceContext.getDefaultInstance()) {
            this.sourceContext_ = com.google.protobuf.SourceContext.newBuilder(this.sourceContext_).mergeFrom(sourceContext).buildPartial();
        } else {
            this.sourceContext_ = sourceContext;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceContext() {
        this.sourceContext_ = null;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public com.google.protobuf.Syntax getSyntax() {
        com.google.protobuf.Syntax syntaxForNumber = com.google.protobuf.Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? com.google.protobuf.Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int i) {
        this.syntax_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(com.google.protobuf.Syntax syntax) {
        this.syntax_ = syntax.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    public static com.google.protobuf.Type parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Type parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.protobuf.Type parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.protobuf.Type parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.protobuf.Type parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.protobuf.Type parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.protobuf.Type parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.Type parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Type parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.Type) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.Type parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Type) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Type parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.protobuf.Type parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Type.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.Type.Builder newBuilder(com.google.protobuf.Type type) {
        return DEFAULT_INSTANCE.createBuilder(type);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.Type, com.google.protobuf.Type.Builder> implements com.google.protobuf.TypeOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.Type.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.Type.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public java.lang.String getName() {
            return ((com.google.protobuf.Type) this.instance).getName();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public com.google.protobuf.ByteString getNameBytes() {
            return ((com.google.protobuf.Type) this.instance).getNameBytes();
        }

        public com.google.protobuf.Type.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setName(str);
            return this;
        }

        public com.google.protobuf.Type.Builder clearName() {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).clearName();
            return this;
        }

        public com.google.protobuf.Type.Builder setNameBytes(com.google.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setNameBytes(byteString);
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public java.util.List<com.google.protobuf.Field> getFieldsList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.Type) this.instance).getFieldsList());
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getFieldsCount() {
            return ((com.google.protobuf.Type) this.instance).getFieldsCount();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public com.google.protobuf.Field getFields(int i) {
            return ((com.google.protobuf.Type) this.instance).getFields(i);
        }

        public com.google.protobuf.Type.Builder setFields(int i, com.google.protobuf.Field field) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setFields(i, field);
            return this;
        }

        public com.google.protobuf.Type.Builder setFields(int i, com.google.protobuf.Field.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setFields(i, builder.build());
            return this;
        }

        public com.google.protobuf.Type.Builder addFields(com.google.protobuf.Field field) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addFields(field);
            return this;
        }

        public com.google.protobuf.Type.Builder addFields(int i, com.google.protobuf.Field field) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addFields(i, field);
            return this;
        }

        public com.google.protobuf.Type.Builder addFields(com.google.protobuf.Field.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addFields(builder.build());
            return this;
        }

        public com.google.protobuf.Type.Builder addFields(int i, com.google.protobuf.Field.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addFields(i, builder.build());
            return this;
        }

        public com.google.protobuf.Type.Builder addAllFields(java.lang.Iterable<? extends com.google.protobuf.Field> iterable) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addAllFields(iterable);
            return this;
        }

        public com.google.protobuf.Type.Builder clearFields() {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).clearFields();
            return this;
        }

        public com.google.protobuf.Type.Builder removeFields(int i) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).removeFields(i);
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public java.util.List<java.lang.String> getOneofsList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.Type) this.instance).getOneofsList());
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getOneofsCount() {
            return ((com.google.protobuf.Type) this.instance).getOneofsCount();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public java.lang.String getOneofs(int i) {
            return ((com.google.protobuf.Type) this.instance).getOneofs(i);
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public com.google.protobuf.ByteString getOneofsBytes(int i) {
            return ((com.google.protobuf.Type) this.instance).getOneofsBytes(i);
        }

        public com.google.protobuf.Type.Builder setOneofs(int i, java.lang.String str) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setOneofs(i, str);
            return this;
        }

        public com.google.protobuf.Type.Builder addOneofs(java.lang.String str) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addOneofs(str);
            return this;
        }

        public com.google.protobuf.Type.Builder addAllOneofs(java.lang.Iterable<java.lang.String> iterable) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addAllOneofs(iterable);
            return this;
        }

        public com.google.protobuf.Type.Builder clearOneofs() {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).clearOneofs();
            return this;
        }

        public com.google.protobuf.Type.Builder addOneofsBytes(com.google.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addOneofsBytes(byteString);
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public java.util.List<com.google.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.Type) this.instance).getOptionsList());
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getOptionsCount() {
            return ((com.google.protobuf.Type) this.instance).getOptionsCount();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public com.google.protobuf.Option getOptions(int i) {
            return ((com.google.protobuf.Type) this.instance).getOptions(i);
        }

        public com.google.protobuf.Type.Builder setOptions(int i, com.google.protobuf.Option option) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setOptions(i, option);
            return this;
        }

        public com.google.protobuf.Type.Builder setOptions(int i, com.google.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setOptions(i, builder.build());
            return this;
        }

        public com.google.protobuf.Type.Builder addOptions(com.google.protobuf.Option option) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addOptions(option);
            return this;
        }

        public com.google.protobuf.Type.Builder addOptions(int i, com.google.protobuf.Option option) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addOptions(i, option);
            return this;
        }

        public com.google.protobuf.Type.Builder addOptions(com.google.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addOptions(builder.build());
            return this;
        }

        public com.google.protobuf.Type.Builder addOptions(int i, com.google.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addOptions(i, builder.build());
            return this;
        }

        public com.google.protobuf.Type.Builder addAllOptions(java.lang.Iterable<? extends com.google.protobuf.Option> iterable) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addAllOptions(iterable);
            return this;
        }

        public com.google.protobuf.Type.Builder clearOptions() {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).clearOptions();
            return this;
        }

        public com.google.protobuf.Type.Builder removeOptions(int i) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).removeOptions(i);
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public boolean hasSourceContext() {
            return ((com.google.protobuf.Type) this.instance).hasSourceContext();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public com.google.protobuf.SourceContext getSourceContext() {
            return ((com.google.protobuf.Type) this.instance).getSourceContext();
        }

        public com.google.protobuf.Type.Builder setSourceContext(com.google.protobuf.SourceContext sourceContext) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setSourceContext(sourceContext);
            return this;
        }

        public com.google.protobuf.Type.Builder setSourceContext(com.google.protobuf.SourceContext.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setSourceContext(builder.build());
            return this;
        }

        public com.google.protobuf.Type.Builder mergeSourceContext(com.google.protobuf.SourceContext sourceContext) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).mergeSourceContext(sourceContext);
            return this;
        }

        public com.google.protobuf.Type.Builder clearSourceContext() {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).clearSourceContext();
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getSyntaxValue() {
            return ((com.google.protobuf.Type) this.instance).getSyntaxValue();
        }

        public com.google.protobuf.Type.Builder setSyntaxValue(int i) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setSyntaxValue(i);
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public com.google.protobuf.Syntax getSyntax() {
            return ((com.google.protobuf.Type) this.instance).getSyntax();
        }

        public com.google.protobuf.Type.Builder setSyntax(com.google.protobuf.Syntax syntax) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setSyntax(syntax);
            return this;
        }

        public com.google.protobuf.Type.Builder clearSyntax() {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).clearSyntax();
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.Type$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Type.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.Type.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.protobuf.Type();
            case 2:
                return new com.google.protobuf.Type.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new java.lang.Object[]{"name_", "fields_", com.google.protobuf.Field.class, "oneofs_", "options_", com.google.protobuf.Option.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.Type> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (com.google.protobuf.Type.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        com.google.protobuf.Type type = new com.google.protobuf.Type();
        DEFAULT_INSTANCE = type;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.Type.class, type);
    }

    public static com.google.protobuf.Type getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<com.google.protobuf.Type> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
