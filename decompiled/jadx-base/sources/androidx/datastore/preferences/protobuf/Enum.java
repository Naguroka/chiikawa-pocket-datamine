package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Enum extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.protobuf.Enum, androidx.datastore.preferences.protobuf.Enum.Builder> implements androidx.datastore.preferences.protobuf.EnumOrBuilder {
    private static final androidx.datastore.preferences.protobuf.Enum DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 6;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Enum> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private int bitField0_;
    private androidx.datastore.preferences.protobuf.SourceContext sourceContext_;
    private int syntax_;
    private java.lang.String name_ = "";
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.EnumValue> enumvalue_ = emptyProtobufList();
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.Option> options_ = emptyProtobufList();
    private java.lang.String edition_ = "";

    private Enum() {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public java.lang.String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public androidx.datastore.preferences.protobuf.ByteString getNameBytes() {
        return androidx.datastore.preferences.protobuf.ByteString.copyFromUtf8(this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(java.lang.String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(androidx.datastore.preferences.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        this.name_ = value.toStringUtf8();
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public java.util.List<androidx.datastore.preferences.protobuf.EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    public java.util.List<? extends androidx.datastore.preferences.protobuf.EnumValueOrBuilder> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public androidx.datastore.preferences.protobuf.EnumValue getEnumvalue(int index) {
        return this.enumvalue_.get(index);
    }

    public androidx.datastore.preferences.protobuf.EnumValueOrBuilder getEnumvalueOrBuilder(int index) {
        return this.enumvalue_.get(index);
    }

    private void ensureEnumvalueIsMutable() {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.EnumValue> protobufList = this.enumvalue_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.enumvalue_ = androidx.datastore.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumvalue(int index, androidx.datastore.preferences.protobuf.EnumValue value) {
        value.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumvalue(androidx.datastore.preferences.protobuf.EnumValue value) {
        value.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumvalue(int index, androidx.datastore.preferences.protobuf.EnumValue value) {
        value.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnumvalue(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.EnumValue> values) {
        ensureEnumvalueIsMutable();
        androidx.datastore.preferences.protobuf.AbstractMessageLite.addAll(values, this.enumvalue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnumvalue() {
        this.enumvalue_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnumvalue(int index) {
        ensureEnumvalueIsMutable();
        this.enumvalue_.remove(index);
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public java.util.List<androidx.datastore.preferences.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public java.util.List<? extends androidx.datastore.preferences.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public androidx.datastore.preferences.protobuf.Option getOptions(int index) {
        return this.options_.get(index);
    }

    public androidx.datastore.preferences.protobuf.OptionOrBuilder getOptionsOrBuilder(int index) {
        return this.options_.get(index);
    }

    private void ensureOptionsIsMutable() {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.Option> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = androidx.datastore.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int index, androidx.datastore.preferences.protobuf.Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(androidx.datastore.preferences.protobuf.Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int index, androidx.datastore.preferences.protobuf.Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.Option> values) {
        ensureOptionsIsMutable();
        androidx.datastore.preferences.protobuf.AbstractMessageLite.addAll(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int index) {
        ensureOptionsIsMutable();
        this.options_.remove(index);
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public androidx.datastore.preferences.protobuf.SourceContext getSourceContext() {
        androidx.datastore.preferences.protobuf.SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? androidx.datastore.preferences.protobuf.SourceContext.getDefaultInstance() : sourceContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceContext(androidx.datastore.preferences.protobuf.SourceContext value) {
        value.getClass();
        this.sourceContext_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceContext(androidx.datastore.preferences.protobuf.SourceContext value) {
        value.getClass();
        androidx.datastore.preferences.protobuf.SourceContext sourceContext = this.sourceContext_;
        if (sourceContext != null && sourceContext != androidx.datastore.preferences.protobuf.SourceContext.getDefaultInstance()) {
            this.sourceContext_ = androidx.datastore.preferences.protobuf.SourceContext.newBuilder(this.sourceContext_).mergeFrom(value).buildPartial();
        } else {
            this.sourceContext_ = value;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceContext() {
        this.sourceContext_ = null;
        this.bitField0_ &= -2;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public androidx.datastore.preferences.protobuf.Syntax getSyntax() {
        androidx.datastore.preferences.protobuf.Syntax syntaxForNumber = androidx.datastore.preferences.protobuf.Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? androidx.datastore.preferences.protobuf.Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int value) {
        this.syntax_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(androidx.datastore.preferences.protobuf.Syntax value) {
        this.syntax_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public java.lang.String getEdition() {
        return this.edition_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public androidx.datastore.preferences.protobuf.ByteString getEditionBytes() {
        return androidx.datastore.preferences.protobuf.ByteString.copyFromUtf8(this.edition_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEdition(java.lang.String value) {
        value.getClass();
        this.edition_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEdition() {
        this.edition_ = getDefaultInstance().getEdition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionBytes(androidx.datastore.preferences.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        this.edition_ = value.toStringUtf8();
    }

    public static androidx.datastore.preferences.protobuf.Enum parseFrom(java.nio.ByteBuffer data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Enum) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Enum parseFrom(java.nio.ByteBuffer data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Enum) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Enum parseFrom(androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Enum) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Enum parseFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Enum) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Enum parseFrom(byte[] data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Enum) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Enum parseFrom(byte[] data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Enum) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Enum parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Enum) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Enum parseFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Enum) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Enum parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Enum) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Enum parseDelimitedFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Enum) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Enum parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Enum) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Enum parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Enum) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Enum.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Enum.Builder newBuilder(androidx.datastore.preferences.protobuf.Enum prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.protobuf.Enum, androidx.datastore.preferences.protobuf.Enum.Builder> implements androidx.datastore.preferences.protobuf.EnumOrBuilder {
        /* synthetic */ Builder(androidx.datastore.preferences.protobuf.Enum.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(androidx.datastore.preferences.protobuf.Enum.DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public java.lang.String getName() {
            return ((androidx.datastore.preferences.protobuf.Enum) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getNameBytes() {
            return ((androidx.datastore.preferences.protobuf.Enum) this.instance).getNameBytes();
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder setName(java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).setName(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder clearName() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).clearName();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder setNameBytes(androidx.datastore.preferences.protobuf.ByteString value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).setNameBytes(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public java.util.List<androidx.datastore.preferences.protobuf.EnumValue> getEnumvalueList() {
            return java.util.Collections.unmodifiableList(((androidx.datastore.preferences.protobuf.Enum) this.instance).getEnumvalueList());
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getEnumvalueCount() {
            return ((androidx.datastore.preferences.protobuf.Enum) this.instance).getEnumvalueCount();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public androidx.datastore.preferences.protobuf.EnumValue getEnumvalue(int index) {
            return ((androidx.datastore.preferences.protobuf.Enum) this.instance).getEnumvalue(index);
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder setEnumvalue(int index, androidx.datastore.preferences.protobuf.EnumValue value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).setEnumvalue(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder setEnumvalue(int index, androidx.datastore.preferences.protobuf.EnumValue.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).setEnumvalue(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder addEnumvalue(androidx.datastore.preferences.protobuf.EnumValue value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).addEnumvalue(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder addEnumvalue(int index, androidx.datastore.preferences.protobuf.EnumValue value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).addEnumvalue(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder addEnumvalue(androidx.datastore.preferences.protobuf.EnumValue.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).addEnumvalue(builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder addEnumvalue(int index, androidx.datastore.preferences.protobuf.EnumValue.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).addEnumvalue(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder addAllEnumvalue(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.EnumValue> values) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).addAllEnumvalue(values);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder clearEnumvalue() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).clearEnumvalue();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder removeEnumvalue(int index) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).removeEnumvalue(index);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public java.util.List<androidx.datastore.preferences.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((androidx.datastore.preferences.protobuf.Enum) this.instance).getOptionsList());
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getOptionsCount() {
            return ((androidx.datastore.preferences.protobuf.Enum) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public androidx.datastore.preferences.protobuf.Option getOptions(int index) {
            return ((androidx.datastore.preferences.protobuf.Enum) this.instance).getOptions(index);
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder setOptions(int index, androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).setOptions(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder setOptions(int index, androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).setOptions(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder addOptions(androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).addOptions(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder addOptions(int index, androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).addOptions(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder addOptions(androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).addOptions(builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder addOptions(int index, androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).addOptions(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder addAllOptions(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.Option> values) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).addAllOptions(values);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder clearOptions() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).clearOptions();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder removeOptions(int index) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).removeOptions(index);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public boolean hasSourceContext() {
            return ((androidx.datastore.preferences.protobuf.Enum) this.instance).hasSourceContext();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public androidx.datastore.preferences.protobuf.SourceContext getSourceContext() {
            return ((androidx.datastore.preferences.protobuf.Enum) this.instance).getSourceContext();
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder setSourceContext(androidx.datastore.preferences.protobuf.SourceContext value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).setSourceContext(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder setSourceContext(androidx.datastore.preferences.protobuf.SourceContext.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).setSourceContext(builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder mergeSourceContext(androidx.datastore.preferences.protobuf.SourceContext value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).mergeSourceContext(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder clearSourceContext() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).clearSourceContext();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getSyntaxValue() {
            return ((androidx.datastore.preferences.protobuf.Enum) this.instance).getSyntaxValue();
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder setSyntaxValue(int value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).setSyntaxValue(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public androidx.datastore.preferences.protobuf.Syntax getSyntax() {
            return ((androidx.datastore.preferences.protobuf.Enum) this.instance).getSyntax();
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder setSyntax(androidx.datastore.preferences.protobuf.Syntax value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).setSyntax(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder clearSyntax() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).clearSyntax();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public java.lang.String getEdition() {
            return ((androidx.datastore.preferences.protobuf.Enum) this.instance).getEdition();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getEditionBytes() {
            return ((androidx.datastore.preferences.protobuf.Enum) this.instance).getEditionBytes();
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder setEdition(java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).setEdition(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder clearEdition() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).clearEdition();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Enum.Builder setEditionBytes(androidx.datastore.preferences.protobuf.ByteString value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Enum) this.instance).setEditionBytes(value);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Enum$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke method, java.lang.Object arg0, java.lang.Object arg1) {
        androidx.datastore.preferences.protobuf.Enum.AnonymousClass1 anonymousClass1 = null;
        switch (androidx.datastore.preferences.protobuf.Enum.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new androidx.datastore.preferences.protobuf.Enum();
            case 2:
                return new androidx.datastore.preferences.protobuf.Enum.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004ဉ\u0000\u0005\f\u0006Ȉ", new java.lang.Object[]{"bitField0_", "name_", "enumvalue_", androidx.datastore.preferences.protobuf.EnumValue.class, "options_", androidx.datastore.preferences.protobuf.Option.class, "sourceContext_", "syntax_", "edition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Enum> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (androidx.datastore.preferences.protobuf.Enum.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new androidx.datastore.preferences.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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
        androidx.datastore.preferences.protobuf.Enum r0 = new androidx.datastore.preferences.protobuf.Enum();
        DEFAULT_INSTANCE = r0;
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.protobuf.Enum.class, r0);
    }

    public static androidx.datastore.preferences.protobuf.Enum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Enum> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
