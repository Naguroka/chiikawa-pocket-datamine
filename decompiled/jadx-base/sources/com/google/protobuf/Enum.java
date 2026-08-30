package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public final class Enum extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.Enum, com.google.protobuf.Enum.Builder> implements com.google.protobuf.EnumOrBuilder {
    private static final com.google.protobuf.Enum DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.Enum> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private com.google.protobuf.SourceContext sourceContext_;
    private int syntax_;
    private java.lang.String name_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.EnumValue> enumvalue_ = emptyProtobufList();
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Option> options_ = emptyProtobufList();

    private Enum() {
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public java.lang.String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.EnumOrBuilder
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

    @Override // com.google.protobuf.EnumOrBuilder
    public java.util.List<com.google.protobuf.EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    public java.util.List<? extends com.google.protobuf.EnumValueOrBuilder> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public com.google.protobuf.EnumValue getEnumvalue(int i) {
        return this.enumvalue_.get(i);
    }

    public com.google.protobuf.EnumValueOrBuilder getEnumvalueOrBuilder(int i) {
        return this.enumvalue_.get(i);
    }

    private void ensureEnumvalueIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.google.protobuf.EnumValue> protobufList = this.enumvalue_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.enumvalue_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumvalue(int i, com.google.protobuf.EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.set(i, enumValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumvalue(com.google.protobuf.EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(enumValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumvalue(int i, com.google.protobuf.EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(i, enumValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnumvalue(java.lang.Iterable<? extends com.google.protobuf.EnumValue> iterable) {
        ensureEnumvalueIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.enumvalue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnumvalue() {
        this.enumvalue_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnumvalue(int i) {
        ensureEnumvalueIsMutable();
        this.enumvalue_.remove(i);
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public java.util.List<com.google.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public java.util.List<? extends com.google.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.EnumOrBuilder
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

    @Override // com.google.protobuf.EnumOrBuilder
    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    @Override // com.google.protobuf.EnumOrBuilder
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

    @Override // com.google.protobuf.EnumOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.EnumOrBuilder
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

    public static com.google.protobuf.Enum parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Enum) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Enum parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Enum) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.protobuf.Enum parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Enum) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.protobuf.Enum parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Enum) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.protobuf.Enum parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Enum) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.protobuf.Enum parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Enum) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.protobuf.Enum parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.Enum) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.Enum parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Enum) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Enum parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.Enum) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.Enum parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Enum) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Enum parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.protobuf.Enum) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.protobuf.Enum parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Enum) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Enum.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.Enum.Builder newBuilder(com.google.protobuf.Enum r1) {
        return DEFAULT_INSTANCE.createBuilder(r1);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.Enum, com.google.protobuf.Enum.Builder> implements com.google.protobuf.EnumOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.Enum.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.Enum.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public java.lang.String getName() {
            return ((com.google.protobuf.Enum) this.instance).getName();
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public com.google.protobuf.ByteString getNameBytes() {
            return ((com.google.protobuf.Enum) this.instance).getNameBytes();
        }

        public com.google.protobuf.Enum.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).setName(str);
            return this;
        }

        public com.google.protobuf.Enum.Builder clearName() {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).clearName();
            return this;
        }

        public com.google.protobuf.Enum.Builder setNameBytes(com.google.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).setNameBytes(byteString);
            return this;
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public java.util.List<com.google.protobuf.EnumValue> getEnumvalueList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.Enum) this.instance).getEnumvalueList());
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public int getEnumvalueCount() {
            return ((com.google.protobuf.Enum) this.instance).getEnumvalueCount();
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public com.google.protobuf.EnumValue getEnumvalue(int i) {
            return ((com.google.protobuf.Enum) this.instance).getEnumvalue(i);
        }

        public com.google.protobuf.Enum.Builder setEnumvalue(int i, com.google.protobuf.EnumValue enumValue) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).setEnumvalue(i, enumValue);
            return this;
        }

        public com.google.protobuf.Enum.Builder setEnumvalue(int i, com.google.protobuf.EnumValue.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).setEnumvalue(i, builder.build());
            return this;
        }

        public com.google.protobuf.Enum.Builder addEnumvalue(com.google.protobuf.EnumValue enumValue) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).addEnumvalue(enumValue);
            return this;
        }

        public com.google.protobuf.Enum.Builder addEnumvalue(int i, com.google.protobuf.EnumValue enumValue) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).addEnumvalue(i, enumValue);
            return this;
        }

        public com.google.protobuf.Enum.Builder addEnumvalue(com.google.protobuf.EnumValue.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).addEnumvalue(builder.build());
            return this;
        }

        public com.google.protobuf.Enum.Builder addEnumvalue(int i, com.google.protobuf.EnumValue.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).addEnumvalue(i, builder.build());
            return this;
        }

        public com.google.protobuf.Enum.Builder addAllEnumvalue(java.lang.Iterable<? extends com.google.protobuf.EnumValue> iterable) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).addAllEnumvalue(iterable);
            return this;
        }

        public com.google.protobuf.Enum.Builder clearEnumvalue() {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).clearEnumvalue();
            return this;
        }

        public com.google.protobuf.Enum.Builder removeEnumvalue(int i) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).removeEnumvalue(i);
            return this;
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public java.util.List<com.google.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.Enum) this.instance).getOptionsList());
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public int getOptionsCount() {
            return ((com.google.protobuf.Enum) this.instance).getOptionsCount();
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public com.google.protobuf.Option getOptions(int i) {
            return ((com.google.protobuf.Enum) this.instance).getOptions(i);
        }

        public com.google.protobuf.Enum.Builder setOptions(int i, com.google.protobuf.Option option) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).setOptions(i, option);
            return this;
        }

        public com.google.protobuf.Enum.Builder setOptions(int i, com.google.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).setOptions(i, builder.build());
            return this;
        }

        public com.google.protobuf.Enum.Builder addOptions(com.google.protobuf.Option option) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).addOptions(option);
            return this;
        }

        public com.google.protobuf.Enum.Builder addOptions(int i, com.google.protobuf.Option option) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).addOptions(i, option);
            return this;
        }

        public com.google.protobuf.Enum.Builder addOptions(com.google.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).addOptions(builder.build());
            return this;
        }

        public com.google.protobuf.Enum.Builder addOptions(int i, com.google.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).addOptions(i, builder.build());
            return this;
        }

        public com.google.protobuf.Enum.Builder addAllOptions(java.lang.Iterable<? extends com.google.protobuf.Option> iterable) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).addAllOptions(iterable);
            return this;
        }

        public com.google.protobuf.Enum.Builder clearOptions() {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).clearOptions();
            return this;
        }

        public com.google.protobuf.Enum.Builder removeOptions(int i) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).removeOptions(i);
            return this;
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public boolean hasSourceContext() {
            return ((com.google.protobuf.Enum) this.instance).hasSourceContext();
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public com.google.protobuf.SourceContext getSourceContext() {
            return ((com.google.protobuf.Enum) this.instance).getSourceContext();
        }

        public com.google.protobuf.Enum.Builder setSourceContext(com.google.protobuf.SourceContext sourceContext) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).setSourceContext(sourceContext);
            return this;
        }

        public com.google.protobuf.Enum.Builder setSourceContext(com.google.protobuf.SourceContext.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).setSourceContext(builder.build());
            return this;
        }

        public com.google.protobuf.Enum.Builder mergeSourceContext(com.google.protobuf.SourceContext sourceContext) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).mergeSourceContext(sourceContext);
            return this;
        }

        public com.google.protobuf.Enum.Builder clearSourceContext() {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).clearSourceContext();
            return this;
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public int getSyntaxValue() {
            return ((com.google.protobuf.Enum) this.instance).getSyntaxValue();
        }

        public com.google.protobuf.Enum.Builder setSyntaxValue(int i) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).setSyntaxValue(i);
            return this;
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public com.google.protobuf.Syntax getSyntax() {
            return ((com.google.protobuf.Enum) this.instance).getSyntax();
        }

        public com.google.protobuf.Enum.Builder setSyntax(com.google.protobuf.Syntax syntax) {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).setSyntax(syntax);
            return this;
        }

        public com.google.protobuf.Enum.Builder clearSyntax() {
            copyOnWrite();
            ((com.google.protobuf.Enum) this.instance).clearSyntax();
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.Enum$1, reason: invalid class name */
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
        com.google.protobuf.Enum.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.Enum.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.protobuf.Enum();
            case 2:
                return new com.google.protobuf.Enum.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new java.lang.Object[]{"name_", "enumvalue_", com.google.protobuf.EnumValue.class, "options_", com.google.protobuf.Option.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.Enum> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (com.google.protobuf.Enum.class) {
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
        com.google.protobuf.Enum r0 = new com.google.protobuf.Enum();
        DEFAULT_INSTANCE = r0;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.Enum.class, r0);
    }

    public static com.google.protobuf.Enum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<com.google.protobuf.Enum> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
