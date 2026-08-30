package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class ErrorOuterClass {

    public interface ErrorOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getErrorText();

        com.google.protobuf.ByteString getErrorTextBytes();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private ErrorOuterClass() {
    }

    public static final class Error extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.ErrorOuterClass.Error, gatewayprotocol.v1.ErrorOuterClass.Error.Builder> implements gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder {
        private static final gatewayprotocol.v1.ErrorOuterClass.Error DEFAULT_INSTANCE;
        public static final int ERROR_TEXT_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.ErrorOuterClass.Error> PARSER;
        private java.lang.String errorText_ = "";

        private Error() {
        }

        @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
        public java.lang.String getErrorText() {
            return this.errorText_;
        }

        @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
        public com.google.protobuf.ByteString getErrorTextBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.errorText_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorText(java.lang.String str) {
            str.getClass();
            this.errorText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorText() {
            this.errorText_ = getDefaultInstance().getErrorText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorTextBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.errorText_ = byteString.toStringUtf8();
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error.Builder newBuilder(gatewayprotocol.v1.ErrorOuterClass.Error error) {
            return DEFAULT_INSTANCE.createBuilder(error);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.ErrorOuterClass.Error, gatewayprotocol.v1.ErrorOuterClass.Error.Builder> implements gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.ErrorOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.ErrorOuterClass.Error.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
            public java.lang.String getErrorText() {
                return ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).getErrorText();
            }

            @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
            public com.google.protobuf.ByteString getErrorTextBytes() {
                return ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).getErrorTextBytes();
            }

            public gatewayprotocol.v1.ErrorOuterClass.Error.Builder setErrorText(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).setErrorText(str);
                return this;
            }

            public gatewayprotocol.v1.ErrorOuterClass.Error.Builder clearErrorText() {
                copyOnWrite();
                ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).clearErrorText();
                return this;
            }

            public gatewayprotocol.v1.ErrorOuterClass.Error.Builder setErrorTextBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).setErrorTextBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.ErrorOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.ErrorOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.ErrorOuterClass.Error();
                case 2:
                    return new gatewayprotocol.v1.ErrorOuterClass.Error.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new java.lang.Object[]{"errorText_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.ErrorOuterClass.Error> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.ErrorOuterClass.Error.class) {
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
            gatewayprotocol.v1.ErrorOuterClass.Error error = new gatewayprotocol.v1.ErrorOuterClass.Error();
            DEFAULT_INSTANCE = error;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.ErrorOuterClass.Error.class, error);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.ErrorOuterClass.Error> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.ErrorOuterClass$1, reason: invalid class name */
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
