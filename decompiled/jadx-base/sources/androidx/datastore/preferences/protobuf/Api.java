package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Api extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.protobuf.Api, androidx.datastore.preferences.protobuf.Api.Builder> implements androidx.datastore.preferences.protobuf.ApiOrBuilder {
    private static final androidx.datastore.preferences.protobuf.Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Api> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private int bitField0_;
    private androidx.datastore.preferences.protobuf.SourceContext sourceContext_;
    private int syntax_;
    private java.lang.String name_ = "";
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.Method> methods_ = emptyProtobufList();
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.Option> options_ = emptyProtobufList();
    private java.lang.String version_ = "";
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.Mixin> mixins_ = emptyProtobufList();

    private Api() {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public java.lang.String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
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

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public java.util.List<androidx.datastore.preferences.protobuf.Method> getMethodsList() {
        return this.methods_;
    }

    public java.util.List<? extends androidx.datastore.preferences.protobuf.MethodOrBuilder> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public androidx.datastore.preferences.protobuf.Method getMethods(int index) {
        return this.methods_.get(index);
    }

    public androidx.datastore.preferences.protobuf.MethodOrBuilder getMethodsOrBuilder(int index) {
        return this.methods_.get(index);
    }

    private void ensureMethodsIsMutable() {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.Method> protobufList = this.methods_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.methods_ = androidx.datastore.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethods(int index, androidx.datastore.preferences.protobuf.Method value) {
        value.getClass();
        ensureMethodsIsMutable();
        this.methods_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethods(androidx.datastore.preferences.protobuf.Method value) {
        value.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethods(int index, androidx.datastore.preferences.protobuf.Method value) {
        value.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMethods(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.Method> values) {
        ensureMethodsIsMutable();
        androidx.datastore.preferences.protobuf.AbstractMessageLite.addAll(values, this.methods_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethods() {
        this.methods_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMethods(int index) {
        ensureMethodsIsMutable();
        this.methods_.remove(index);
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public java.util.List<androidx.datastore.preferences.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public java.util.List<? extends androidx.datastore.preferences.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
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

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public java.lang.String getVersion() {
        return this.version_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public androidx.datastore.preferences.protobuf.ByteString getVersionBytes() {
        return androidx.datastore.preferences.protobuf.ByteString.copyFromUtf8(this.version_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(java.lang.String value) {
        value.getClass();
        this.version_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(androidx.datastore.preferences.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        this.version_ = value.toStringUtf8();
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
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

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public java.util.List<androidx.datastore.preferences.protobuf.Mixin> getMixinsList() {
        return this.mixins_;
    }

    public java.util.List<? extends androidx.datastore.preferences.protobuf.MixinOrBuilder> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public androidx.datastore.preferences.protobuf.Mixin getMixins(int index) {
        return this.mixins_.get(index);
    }

    public androidx.datastore.preferences.protobuf.MixinOrBuilder getMixinsOrBuilder(int index) {
        return this.mixins_.get(index);
    }

    private void ensureMixinsIsMutable() {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.Mixin> protobufList = this.mixins_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.mixins_ = androidx.datastore.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMixins(int index, androidx.datastore.preferences.protobuf.Mixin value) {
        value.getClass();
        ensureMixinsIsMutable();
        this.mixins_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMixins(androidx.datastore.preferences.protobuf.Mixin value) {
        value.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMixins(int index, androidx.datastore.preferences.protobuf.Mixin value) {
        value.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMixins(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.Mixin> values) {
        ensureMixinsIsMutable();
        androidx.datastore.preferences.protobuf.AbstractMessageLite.addAll(values, this.mixins_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMixins() {
        this.mixins_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMixins(int index) {
        ensureMixinsIsMutable();
        this.mixins_.remove(index);
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
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

    public static androidx.datastore.preferences.protobuf.Api parseFrom(java.nio.ByteBuffer data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Api) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Api parseFrom(java.nio.ByteBuffer data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Api) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Api parseFrom(androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Api) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Api parseFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Api) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Api parseFrom(byte[] data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Api) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Api parseFrom(byte[] data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Api) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Api parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Api) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Api parseFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Api) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Api parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Api) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Api parseDelimitedFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Api) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Api parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Api) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Api parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Api) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Api.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Api.Builder newBuilder(androidx.datastore.preferences.protobuf.Api prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.protobuf.Api, androidx.datastore.preferences.protobuf.Api.Builder> implements androidx.datastore.preferences.protobuf.ApiOrBuilder {
        /* synthetic */ Builder(androidx.datastore.preferences.protobuf.Api.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(androidx.datastore.preferences.protobuf.Api.DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public java.lang.String getName() {
            return ((androidx.datastore.preferences.protobuf.Api) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getNameBytes() {
            return ((androidx.datastore.preferences.protobuf.Api) this.instance).getNameBytes();
        }

        public androidx.datastore.preferences.protobuf.Api.Builder setName(java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).setName(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder clearName() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).clearName();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder setNameBytes(androidx.datastore.preferences.protobuf.ByteString value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).setNameBytes(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public java.util.List<androidx.datastore.preferences.protobuf.Method> getMethodsList() {
            return java.util.Collections.unmodifiableList(((androidx.datastore.preferences.protobuf.Api) this.instance).getMethodsList());
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getMethodsCount() {
            return ((androidx.datastore.preferences.protobuf.Api) this.instance).getMethodsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public androidx.datastore.preferences.protobuf.Method getMethods(int index) {
            return ((androidx.datastore.preferences.protobuf.Api) this.instance).getMethods(index);
        }

        public androidx.datastore.preferences.protobuf.Api.Builder setMethods(int index, androidx.datastore.preferences.protobuf.Method value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).setMethods(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder setMethods(int index, androidx.datastore.preferences.protobuf.Method.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).setMethods(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder addMethods(androidx.datastore.preferences.protobuf.Method value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).addMethods(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder addMethods(int index, androidx.datastore.preferences.protobuf.Method value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).addMethods(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder addMethods(androidx.datastore.preferences.protobuf.Method.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).addMethods(builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder addMethods(int index, androidx.datastore.preferences.protobuf.Method.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).addMethods(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder addAllMethods(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.Method> values) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).addAllMethods(values);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder clearMethods() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).clearMethods();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder removeMethods(int index) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).removeMethods(index);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public java.util.List<androidx.datastore.preferences.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((androidx.datastore.preferences.protobuf.Api) this.instance).getOptionsList());
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getOptionsCount() {
            return ((androidx.datastore.preferences.protobuf.Api) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public androidx.datastore.preferences.protobuf.Option getOptions(int index) {
            return ((androidx.datastore.preferences.protobuf.Api) this.instance).getOptions(index);
        }

        public androidx.datastore.preferences.protobuf.Api.Builder setOptions(int index, androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).setOptions(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder setOptions(int index, androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).setOptions(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder addOptions(androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).addOptions(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder addOptions(int index, androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).addOptions(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder addOptions(androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).addOptions(builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder addOptions(int index, androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).addOptions(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder addAllOptions(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.Option> values) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).addAllOptions(values);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder clearOptions() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).clearOptions();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder removeOptions(int index) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).removeOptions(index);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public java.lang.String getVersion() {
            return ((androidx.datastore.preferences.protobuf.Api) this.instance).getVersion();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getVersionBytes() {
            return ((androidx.datastore.preferences.protobuf.Api) this.instance).getVersionBytes();
        }

        public androidx.datastore.preferences.protobuf.Api.Builder setVersion(java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).setVersion(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder clearVersion() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).clearVersion();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder setVersionBytes(androidx.datastore.preferences.protobuf.ByteString value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).setVersionBytes(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public boolean hasSourceContext() {
            return ((androidx.datastore.preferences.protobuf.Api) this.instance).hasSourceContext();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public androidx.datastore.preferences.protobuf.SourceContext getSourceContext() {
            return ((androidx.datastore.preferences.protobuf.Api) this.instance).getSourceContext();
        }

        public androidx.datastore.preferences.protobuf.Api.Builder setSourceContext(androidx.datastore.preferences.protobuf.SourceContext value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).setSourceContext(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder setSourceContext(androidx.datastore.preferences.protobuf.SourceContext.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).setSourceContext(builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder mergeSourceContext(androidx.datastore.preferences.protobuf.SourceContext value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).mergeSourceContext(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder clearSourceContext() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).clearSourceContext();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public java.util.List<androidx.datastore.preferences.protobuf.Mixin> getMixinsList() {
            return java.util.Collections.unmodifiableList(((androidx.datastore.preferences.protobuf.Api) this.instance).getMixinsList());
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getMixinsCount() {
            return ((androidx.datastore.preferences.protobuf.Api) this.instance).getMixinsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public androidx.datastore.preferences.protobuf.Mixin getMixins(int index) {
            return ((androidx.datastore.preferences.protobuf.Api) this.instance).getMixins(index);
        }

        public androidx.datastore.preferences.protobuf.Api.Builder setMixins(int index, androidx.datastore.preferences.protobuf.Mixin value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).setMixins(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder setMixins(int index, androidx.datastore.preferences.protobuf.Mixin.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).setMixins(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder addMixins(androidx.datastore.preferences.protobuf.Mixin value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).addMixins(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder addMixins(int index, androidx.datastore.preferences.protobuf.Mixin value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).addMixins(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder addMixins(androidx.datastore.preferences.protobuf.Mixin.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).addMixins(builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder addMixins(int index, androidx.datastore.preferences.protobuf.Mixin.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).addMixins(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder addAllMixins(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.Mixin> values) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).addAllMixins(values);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder clearMixins() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).clearMixins();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder removeMixins(int index) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).removeMixins(index);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getSyntaxValue() {
            return ((androidx.datastore.preferences.protobuf.Api) this.instance).getSyntaxValue();
        }

        public androidx.datastore.preferences.protobuf.Api.Builder setSyntaxValue(int value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).setSyntaxValue(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public androidx.datastore.preferences.protobuf.Syntax getSyntax() {
            return ((androidx.datastore.preferences.protobuf.Api) this.instance).getSyntax();
        }

        public androidx.datastore.preferences.protobuf.Api.Builder setSyntax(androidx.datastore.preferences.protobuf.Syntax value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).setSyntax(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Api.Builder clearSyntax() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Api) this.instance).clearSyntax();
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Api$1, reason: invalid class name */
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
        androidx.datastore.preferences.protobuf.Api.AnonymousClass1 anonymousClass1 = null;
        switch (androidx.datastore.preferences.protobuf.Api.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new androidx.datastore.preferences.protobuf.Api();
            case 2:
                return new androidx.datastore.preferences.protobuf.Api.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005ဉ\u0000\u0006\u001b\u0007\f", new java.lang.Object[]{"bitField0_", "name_", "methods_", androidx.datastore.preferences.protobuf.Method.class, "options_", androidx.datastore.preferences.protobuf.Option.class, "version_", "sourceContext_", "mixins_", androidx.datastore.preferences.protobuf.Mixin.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Api> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (androidx.datastore.preferences.protobuf.Api.class) {
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
        androidx.datastore.preferences.protobuf.Api api = new androidx.datastore.preferences.protobuf.Api();
        DEFAULT_INSTANCE = api;
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.protobuf.Api.class, api);
    }

    public static androidx.datastore.preferences.protobuf.Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Api> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
