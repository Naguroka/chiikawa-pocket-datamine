package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class WebviewConfiguration {

    public interface WebViewConfigurationOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getAdditionalFiles(int i);

        com.google.protobuf.ByteString getAdditionalFilesBytes(int i);

        int getAdditionalFilesCount();

        java.util.List<java.lang.String> getAdditionalFilesList();

        java.lang.String getEntryPoint();

        com.google.protobuf.ByteString getEntryPointBytes();

        int getVersion();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private WebviewConfiguration() {
    }

    public static final class WebViewConfiguration extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration, gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder> implements gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder {
        public static final int ADDITIONAL_FILES_FIELD_NUMBER = 3;
        private static final gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration DEFAULT_INSTANCE;
        public static final int ENTRY_POINT_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration> PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int version_;
        private java.lang.String entryPoint_ = "";
        private com.google.protobuf.Internal.ProtobufList<java.lang.String> additionalFiles_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

        private WebViewConfiguration() {
        }

        @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
        public int getVersion() {
            return this.version_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
        public java.lang.String getEntryPoint() {
            return this.entryPoint_;
        }

        @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
        public com.google.protobuf.ByteString getEntryPointBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.entryPoint_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEntryPoint(java.lang.String str) {
            str.getClass();
            this.entryPoint_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEntryPoint() {
            this.entryPoint_ = getDefaultInstance().getEntryPoint();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEntryPointBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.entryPoint_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
        public java.util.List<java.lang.String> getAdditionalFilesList() {
            return this.additionalFiles_;
        }

        @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
        public int getAdditionalFilesCount() {
            return this.additionalFiles_.size();
        }

        @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
        public java.lang.String getAdditionalFiles(int i) {
            return this.additionalFiles_.get(i);
        }

        @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
        public com.google.protobuf.ByteString getAdditionalFilesBytes(int i) {
            return com.google.protobuf.ByteString.copyFromUtf8(this.additionalFiles_.get(i));
        }

        private void ensureAdditionalFilesIsMutable() {
            com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.additionalFiles_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.additionalFiles_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdditionalFiles(int i, java.lang.String str) {
            str.getClass();
            ensureAdditionalFilesIsMutable();
            this.additionalFiles_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdditionalFiles(java.lang.String str) {
            str.getClass();
            ensureAdditionalFilesIsMutable();
            this.additionalFiles_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAdditionalFiles(java.lang.Iterable<java.lang.String> iterable) {
            ensureAdditionalFilesIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.additionalFiles_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdditionalFiles() {
            this.additionalFiles_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdditionalFilesBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureAdditionalFilesIsMutable();
            this.additionalFiles_.add(byteString.toStringUtf8());
        }

        public static gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder newBuilder(gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(webViewConfiguration);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration, gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder> implements gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.WebviewConfiguration.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
            public int getVersion() {
                return ((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) this.instance).getVersion();
            }

            public gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder setVersion(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) this.instance).setVersion(i);
                return this;
            }

            public gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder clearVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) this.instance).clearVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
            public java.lang.String getEntryPoint() {
                return ((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) this.instance).getEntryPoint();
            }

            @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
            public com.google.protobuf.ByteString getEntryPointBytes() {
                return ((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) this.instance).getEntryPointBytes();
            }

            public gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder setEntryPoint(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) this.instance).setEntryPoint(str);
                return this;
            }

            public gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder clearEntryPoint() {
                copyOnWrite();
                ((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) this.instance).clearEntryPoint();
                return this;
            }

            public gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder setEntryPointBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) this.instance).setEntryPointBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
            public java.util.List<java.lang.String> getAdditionalFilesList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) this.instance).getAdditionalFilesList());
            }

            @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
            public int getAdditionalFilesCount() {
                return ((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) this.instance).getAdditionalFilesCount();
            }

            @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
            public java.lang.String getAdditionalFiles(int i) {
                return ((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) this.instance).getAdditionalFiles(i);
            }

            @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
            public com.google.protobuf.ByteString getAdditionalFilesBytes(int i) {
                return ((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) this.instance).getAdditionalFilesBytes(i);
            }

            public gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder setAdditionalFiles(int i, java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) this.instance).setAdditionalFiles(i, str);
                return this;
            }

            public gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder addAdditionalFiles(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) this.instance).addAdditionalFiles(str);
                return this;
            }

            public gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder addAllAdditionalFiles(java.lang.Iterable<java.lang.String> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) this.instance).addAllAdditionalFiles(iterable);
                return this;
            }

            public gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder clearAdditionalFiles() {
                copyOnWrite();
                ((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) this.instance).clearAdditionalFiles();
                return this;
            }

            public gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder addAdditionalFilesBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration) this.instance).addAdditionalFilesBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.WebviewConfiguration.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.WebviewConfiguration.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration();
                case 2:
                    return new gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ț", new java.lang.Object[]{"version_", "entryPoint_", "additionalFiles_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.class) {
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
            gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration webViewConfiguration = new gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration();
            DEFAULT_INSTANCE = webViewConfiguration;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.class, webViewConfiguration);
        }

        public static gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.WebviewConfiguration$1, reason: invalid class name */
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
}
