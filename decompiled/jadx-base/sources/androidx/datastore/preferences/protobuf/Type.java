package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Type extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.protobuf.Type, androidx.datastore.preferences.protobuf.Type.Builder> implements androidx.datastore.preferences.protobuf.TypeOrBuilder {
    private static final androidx.datastore.preferences.protobuf.Type DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 7;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Type> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private int bitField0_;
    private androidx.datastore.preferences.protobuf.SourceContext sourceContext_;
    private int syntax_;
    private java.lang.String name_ = "";
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.Field> fields_ = emptyProtobufList();
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> oneofs_ = androidx.datastore.preferences.protobuf.GeneratedMessageLite.emptyProtobufList();
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.Option> options_ = emptyProtobufList();
    private java.lang.String edition_ = "";

    private Type() {
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public java.lang.String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
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

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public java.util.List<androidx.datastore.preferences.protobuf.Field> getFieldsList() {
        return this.fields_;
    }

    public java.util.List<? extends androidx.datastore.preferences.protobuf.FieldOrBuilder> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public androidx.datastore.preferences.protobuf.Field getFields(int index) {
        return this.fields_.get(index);
    }

    public androidx.datastore.preferences.protobuf.FieldOrBuilder getFieldsOrBuilder(int index) {
        return this.fields_.get(index);
    }

    private void ensureFieldsIsMutable() {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.Field> protobufList = this.fields_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.fields_ = androidx.datastore.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFields(int index, androidx.datastore.preferences.protobuf.Field value) {
        value.getClass();
        ensureFieldsIsMutable();
        this.fields_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(androidx.datastore.preferences.protobuf.Field value) {
        value.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(int index, androidx.datastore.preferences.protobuf.Field value) {
        value.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFields(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.Field> values) {
        ensureFieldsIsMutable();
        androidx.datastore.preferences.protobuf.AbstractMessageLite.addAll(values, this.fields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFields() {
        this.fields_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFields(int index) {
        ensureFieldsIsMutable();
        this.fields_.remove(index);
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public java.util.List<java.lang.String> getOneofsList() {
        return this.oneofs_;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public java.lang.String getOneofs(int index) {
        return this.oneofs_.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public androidx.datastore.preferences.protobuf.ByteString getOneofsBytes(int index) {
        return androidx.datastore.preferences.protobuf.ByteString.copyFromUtf8(this.oneofs_.get(index));
    }

    private void ensureOneofsIsMutable() {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.oneofs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.oneofs_ = androidx.datastore.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofs(int index, java.lang.String value) {
        value.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofs(java.lang.String value) {
        value.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOneofs(java.lang.Iterable<java.lang.String> values) {
        ensureOneofsIsMutable();
        androidx.datastore.preferences.protobuf.AbstractMessageLite.addAll(values, this.oneofs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofs() {
        this.oneofs_ = androidx.datastore.preferences.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofsBytes(androidx.datastore.preferences.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        ensureOneofsIsMutable();
        this.oneofs_.add(value.toStringUtf8());
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public java.util.List<androidx.datastore.preferences.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public java.util.List<? extends androidx.datastore.preferences.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
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

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
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

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
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

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public java.lang.String getEdition() {
        return this.edition_;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
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

    public static androidx.datastore.preferences.protobuf.Type parseFrom(java.nio.ByteBuffer data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Type) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Type parseFrom(java.nio.ByteBuffer data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Type) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Type parseFrom(androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Type) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Type parseFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Type) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Type parseFrom(byte[] data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Type) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Type parseFrom(byte[] data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Type) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Type parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Type) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Type parseFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Type) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Type parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Type) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Type parseDelimitedFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Type) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Type parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Type) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Type parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Type) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Type.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Type.Builder newBuilder(androidx.datastore.preferences.protobuf.Type prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.protobuf.Type, androidx.datastore.preferences.protobuf.Type.Builder> implements androidx.datastore.preferences.protobuf.TypeOrBuilder {
        /* synthetic */ Builder(androidx.datastore.preferences.protobuf.Type.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(androidx.datastore.preferences.protobuf.Type.DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public java.lang.String getName() {
            return ((androidx.datastore.preferences.protobuf.Type) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getNameBytes() {
            return ((androidx.datastore.preferences.protobuf.Type) this.instance).getNameBytes();
        }

        public androidx.datastore.preferences.protobuf.Type.Builder setName(java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).setName(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder clearName() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).clearName();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder setNameBytes(androidx.datastore.preferences.protobuf.ByteString value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).setNameBytes(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public java.util.List<androidx.datastore.preferences.protobuf.Field> getFieldsList() {
            return java.util.Collections.unmodifiableList(((androidx.datastore.preferences.protobuf.Type) this.instance).getFieldsList());
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getFieldsCount() {
            return ((androidx.datastore.preferences.protobuf.Type) this.instance).getFieldsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public androidx.datastore.preferences.protobuf.Field getFields(int index) {
            return ((androidx.datastore.preferences.protobuf.Type) this.instance).getFields(index);
        }

        public androidx.datastore.preferences.protobuf.Type.Builder setFields(int index, androidx.datastore.preferences.protobuf.Field value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).setFields(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder setFields(int index, androidx.datastore.preferences.protobuf.Field.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).setFields(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder addFields(androidx.datastore.preferences.protobuf.Field value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).addFields(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder addFields(int index, androidx.datastore.preferences.protobuf.Field value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).addFields(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder addFields(androidx.datastore.preferences.protobuf.Field.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).addFields(builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder addFields(int index, androidx.datastore.preferences.protobuf.Field.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).addFields(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder addAllFields(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.Field> values) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).addAllFields(values);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder clearFields() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).clearFields();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder removeFields(int index) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).removeFields(index);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public java.util.List<java.lang.String> getOneofsList() {
            return java.util.Collections.unmodifiableList(((androidx.datastore.preferences.protobuf.Type) this.instance).getOneofsList());
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getOneofsCount() {
            return ((androidx.datastore.preferences.protobuf.Type) this.instance).getOneofsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public java.lang.String getOneofs(int index) {
            return ((androidx.datastore.preferences.protobuf.Type) this.instance).getOneofs(index);
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getOneofsBytes(int index) {
            return ((androidx.datastore.preferences.protobuf.Type) this.instance).getOneofsBytes(index);
        }

        public androidx.datastore.preferences.protobuf.Type.Builder setOneofs(int index, java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).setOneofs(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder addOneofs(java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).addOneofs(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder addAllOneofs(java.lang.Iterable<java.lang.String> values) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).addAllOneofs(values);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder clearOneofs() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).clearOneofs();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder addOneofsBytes(androidx.datastore.preferences.protobuf.ByteString value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).addOneofsBytes(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public java.util.List<androidx.datastore.preferences.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((androidx.datastore.preferences.protobuf.Type) this.instance).getOptionsList());
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getOptionsCount() {
            return ((androidx.datastore.preferences.protobuf.Type) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public androidx.datastore.preferences.protobuf.Option getOptions(int index) {
            return ((androidx.datastore.preferences.protobuf.Type) this.instance).getOptions(index);
        }

        public androidx.datastore.preferences.protobuf.Type.Builder setOptions(int index, androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).setOptions(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder setOptions(int index, androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).setOptions(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder addOptions(androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).addOptions(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder addOptions(int index, androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).addOptions(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder addOptions(androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).addOptions(builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder addOptions(int index, androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).addOptions(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder addAllOptions(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.Option> values) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).addAllOptions(values);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder clearOptions() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).clearOptions();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder removeOptions(int index) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).removeOptions(index);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public boolean hasSourceContext() {
            return ((androidx.datastore.preferences.protobuf.Type) this.instance).hasSourceContext();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public androidx.datastore.preferences.protobuf.SourceContext getSourceContext() {
            return ((androidx.datastore.preferences.protobuf.Type) this.instance).getSourceContext();
        }

        public androidx.datastore.preferences.protobuf.Type.Builder setSourceContext(androidx.datastore.preferences.protobuf.SourceContext value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).setSourceContext(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder setSourceContext(androidx.datastore.preferences.protobuf.SourceContext.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).setSourceContext(builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder mergeSourceContext(androidx.datastore.preferences.protobuf.SourceContext value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).mergeSourceContext(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder clearSourceContext() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).clearSourceContext();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getSyntaxValue() {
            return ((androidx.datastore.preferences.protobuf.Type) this.instance).getSyntaxValue();
        }

        public androidx.datastore.preferences.protobuf.Type.Builder setSyntaxValue(int value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).setSyntaxValue(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public androidx.datastore.preferences.protobuf.Syntax getSyntax() {
            return ((androidx.datastore.preferences.protobuf.Type) this.instance).getSyntax();
        }

        public androidx.datastore.preferences.protobuf.Type.Builder setSyntax(androidx.datastore.preferences.protobuf.Syntax value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).setSyntax(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder clearSyntax() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).clearSyntax();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public java.lang.String getEdition() {
            return ((androidx.datastore.preferences.protobuf.Type) this.instance).getEdition();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getEditionBytes() {
            return ((androidx.datastore.preferences.protobuf.Type) this.instance).getEditionBytes();
        }

        public androidx.datastore.preferences.protobuf.Type.Builder setEdition(java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).setEdition(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder clearEdition() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).clearEdition();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Type.Builder setEditionBytes(androidx.datastore.preferences.protobuf.ByteString value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Type) this.instance).setEditionBytes(value);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Type$1, reason: invalid class name */
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
        androidx.datastore.preferences.protobuf.Type.AnonymousClass1 anonymousClass1 = null;
        switch (androidx.datastore.preferences.protobuf.Type.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new androidx.datastore.preferences.protobuf.Type();
            case 2:
                return new androidx.datastore.preferences.protobuf.Type.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005ဉ\u0000\u0006\f\u0007Ȉ", new java.lang.Object[]{"bitField0_", "name_", "fields_", androidx.datastore.preferences.protobuf.Field.class, "oneofs_", "options_", androidx.datastore.preferences.protobuf.Option.class, "sourceContext_", "syntax_", "edition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Type> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (androidx.datastore.preferences.protobuf.Type.class) {
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
        androidx.datastore.preferences.protobuf.Type type = new androidx.datastore.preferences.protobuf.Type();
        DEFAULT_INSTANCE = type;
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.protobuf.Type.class, type);
    }

    public static androidx.datastore.preferences.protobuf.Type getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Type> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
