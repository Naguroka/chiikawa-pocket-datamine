package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class TimestampsOuterClass {

    public interface TimestampsOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        long getSessionTimestamp();

        com.google.protobuf.Timestamp getTimestamp();

        boolean hasTimestamp();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private TimestampsOuterClass() {
    }

    public static final class Timestamps extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.TimestampsOuterClass.Timestamps, gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder> implements gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder {
        private static final gatewayprotocol.v1.TimestampsOuterClass.Timestamps DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.TimestampsOuterClass.Timestamps> PARSER = null;
        public static final int SESSION_TIMESTAMP_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private long sessionTimestamp_;
        private com.google.protobuf.Timestamp timestamp_;

        private Timestamps() {
        }

        @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
        public boolean hasTimestamp() {
            return this.timestamp_ != null;
        }

        @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
        public com.google.protobuf.Timestamp getTimestamp() {
            com.google.protobuf.Timestamp timestamp = this.timestamp_;
            return timestamp == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(com.google.protobuf.Timestamp timestamp) {
            timestamp.getClass();
            this.timestamp_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamp(com.google.protobuf.Timestamp timestamp) {
            timestamp.getClass();
            com.google.protobuf.Timestamp timestamp2 = this.timestamp_;
            if (timestamp2 != null && timestamp2 != com.google.protobuf.Timestamp.getDefaultInstance()) {
                this.timestamp_ = com.google.protobuf.Timestamp.newBuilder(this.timestamp_).mergeFrom(timestamp).buildPartial();
            } else {
                this.timestamp_ = timestamp;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = null;
        }

        @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
        public long getSessionTimestamp() {
            return this.sessionTimestamp_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionTimestamp(long j) {
            this.sessionTimestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionTimestamp() {
            this.sessionTimestamp_ = 0L;
        }

        public static gatewayprotocol.v1.TimestampsOuterClass.Timestamps parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TimestampsOuterClass.Timestamps) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.TimestampsOuterClass.Timestamps parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TimestampsOuterClass.Timestamps) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TimestampsOuterClass.Timestamps parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TimestampsOuterClass.Timestamps) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.TimestampsOuterClass.Timestamps parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TimestampsOuterClass.Timestamps) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TimestampsOuterClass.Timestamps parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TimestampsOuterClass.Timestamps) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.TimestampsOuterClass.Timestamps parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TimestampsOuterClass.Timestamps) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TimestampsOuterClass.Timestamps parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.TimestampsOuterClass.Timestamps) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.TimestampsOuterClass.Timestamps parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.TimestampsOuterClass.Timestamps) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TimestampsOuterClass.Timestamps parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.TimestampsOuterClass.Timestamps) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.TimestampsOuterClass.Timestamps parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.TimestampsOuterClass.Timestamps) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TimestampsOuterClass.Timestamps parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.TimestampsOuterClass.Timestamps) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.TimestampsOuterClass.Timestamps parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.TimestampsOuterClass.Timestamps) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder newBuilder(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
            return DEFAULT_INSTANCE.createBuilder(timestamps);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.TimestampsOuterClass.Timestamps, gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder> implements gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.TimestampsOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
            public boolean hasTimestamp() {
                return ((gatewayprotocol.v1.TimestampsOuterClass.Timestamps) this.instance).hasTimestamp();
            }

            @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
            public com.google.protobuf.Timestamp getTimestamp() {
                return ((gatewayprotocol.v1.TimestampsOuterClass.Timestamps) this.instance).getTimestamp();
            }

            public gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder setTimestamp(com.google.protobuf.Timestamp timestamp) {
                copyOnWrite();
                ((gatewayprotocol.v1.TimestampsOuterClass.Timestamps) this.instance).setTimestamp(timestamp);
                return this;
            }

            public gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder setTimestamp(com.google.protobuf.Timestamp.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.TimestampsOuterClass.Timestamps) this.instance).setTimestamp(builder.build());
                return this;
            }

            public gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder mergeTimestamp(com.google.protobuf.Timestamp timestamp) {
                copyOnWrite();
                ((gatewayprotocol.v1.TimestampsOuterClass.Timestamps) this.instance).mergeTimestamp(timestamp);
                return this;
            }

            public gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder clearTimestamp() {
                copyOnWrite();
                ((gatewayprotocol.v1.TimestampsOuterClass.Timestamps) this.instance).clearTimestamp();
                return this;
            }

            @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
            public long getSessionTimestamp() {
                return ((gatewayprotocol.v1.TimestampsOuterClass.Timestamps) this.instance).getSessionTimestamp();
            }

            public gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder setSessionTimestamp(long j) {
                copyOnWrite();
                ((gatewayprotocol.v1.TimestampsOuterClass.Timestamps) this.instance).setSessionTimestamp(j);
                return this;
            }

            public gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder clearSessionTimestamp() {
                copyOnWrite();
                ((gatewayprotocol.v1.TimestampsOuterClass.Timestamps) this.instance).clearSessionTimestamp();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.TimestampsOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.TimestampsOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.TimestampsOuterClass.Timestamps();
                case 2:
                    return new gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0002", new java.lang.Object[]{"timestamp_", "sessionTimestamp_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.TimestampsOuterClass.Timestamps> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.TimestampsOuterClass.Timestamps.class) {
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
            gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps = new gatewayprotocol.v1.TimestampsOuterClass.Timestamps();
            DEFAULT_INSTANCE = timestamps;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.class, timestamps);
        }

        public static gatewayprotocol.v1.TimestampsOuterClass.Timestamps getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.TimestampsOuterClass.Timestamps> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.TimestampsOuterClass$1, reason: invalid class name */
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
