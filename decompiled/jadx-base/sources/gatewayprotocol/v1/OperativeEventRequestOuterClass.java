package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class OperativeEventRequestOuterClass {

    public interface OperativeEventErrorDataOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType getErrorType();

        int getErrorTypeValue();

        java.lang.String getMessage();

        com.google.protobuf.ByteString getMessageBytes();
    }

    public interface OperativeEventRequestOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.google.protobuf.ByteString getAdditionalData();

        gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignState();

        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        com.google.protobuf.ByteString getEventId();

        gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType getEventType();

        int getEventTypeValue();

        com.google.protobuf.ByteString getImpressionOpportunityId();

        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters();

        java.lang.String getSid();

        com.google.protobuf.ByteString getSidBytes();

        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        com.google.protobuf.ByteString getTrackingToken();

        boolean hasCampaignState();

        boolean hasDynamicDeviceInfo();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private OperativeEventRequestOuterClass() {
    }

    public enum OperativeEventType implements com.google.protobuf.Internal.EnumLite {
        OPERATIVE_EVENT_TYPE_UNSPECIFIED(0),
        OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER(1),
        OPERATIVE_EVENT_TYPE_LOAD_ERROR(2),
        OPERATIVE_EVENT_TYPE_SHOW_ERROR(3),
        UNRECOGNIZED(-1);

        public static final int OPERATIVE_EVENT_TYPE_LOAD_ERROR_VALUE = 2;
        public static final int OPERATIVE_EVENT_TYPE_SHOW_ERROR_VALUE = 3;
        public static final int OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER_VALUE = 1;
        public static final int OPERATIVE_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType>() { // from class: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType findValueByNumber(int i) {
                return gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @java.lang.Deprecated
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType forNumber(int i) {
            if (i == 0) {
                return OPERATIVE_EVENT_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER;
            }
            if (i == 2) {
                return OPERATIVE_EVENT_TYPE_LOAD_ERROR;
            }
            if (i != 3) {
                return null;
            }
            return OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OperativeEventTypeVerifier.INSTANCE;
        }

        private static final class OperativeEventTypeVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OperativeEventTypeVerifier();

            private OperativeEventTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.forNumber(i) != null;
            }
        }

        OperativeEventType(int i) {
            this.value = i;
        }
    }

    public enum OperativeEventErrorType implements com.google.protobuf.Internal.EnumLite {
        OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED(0),
        OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT(1),
        UNRECOGNIZED(-1);

        public static final int OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT_VALUE = 1;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType>() { // from class: gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType findValueByNumber(int i) {
                return gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @java.lang.Deprecated
        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType forNumber(int i) {
            if (i == 0) {
                return OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OperativeEventErrorTypeVerifier.INSTANCE;
        }

        private static final class OperativeEventErrorTypeVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OperativeEventErrorTypeVerifier();

            private OperativeEventErrorTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.forNumber(i) != null;
            }
        }

        OperativeEventErrorType(int i) {
            this.value = i;
        }
    }

    public static final class OperativeEventErrorData extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData, gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder> implements gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder {
        private static final gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData DEFAULT_INSTANCE;
        public static final int ERROR_TYPE_FIELD_NUMBER = 1;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData> PARSER;
        private int errorType_;
        private java.lang.String message_ = "";

        private OperativeEventErrorData() {
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
        public int getErrorTypeValue() {
            return this.errorType_;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
        public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType getErrorType() {
            gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorTypeForNumber = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.forNumber(this.errorType_);
            return operativeEventErrorTypeForNumber == null ? gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.UNRECOGNIZED : operativeEventErrorTypeForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorTypeValue(int i) {
            this.errorType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorType(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType) {
            this.errorType_ = operativeEventErrorType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorType() {
            this.errorType_ = 0;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
        public java.lang.String getMessage() {
            return this.message_;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
        public com.google.protobuf.ByteString getMessageBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.message_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(java.lang.String str) {
            str.getClass();
            this.message_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessage() {
            this.message_ = getDefaultInstance().getMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.message_ = byteString.toStringUtf8();
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder newBuilder(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData) {
            return DEFAULT_INSTANCE.createBuilder(operativeEventErrorData);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData, gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder> implements gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.OperativeEventRequestOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
            public int getErrorTypeValue() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) this.instance).getErrorTypeValue();
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder setErrorTypeValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) this.instance).setErrorTypeValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType getErrorType() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) this.instance).getErrorType();
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder setErrorType(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) this.instance).setErrorType(operativeEventErrorType);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder clearErrorType() {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) this.instance).clearErrorType();
                return this;
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
            public java.lang.String getMessage() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) this.instance).getMessage();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
            public com.google.protobuf.ByteString getMessageBytes() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) this.instance).getMessageBytes();
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder setMessage(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) this.instance).setMessage(str);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder clearMessage() {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) this.instance).clearMessage();
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder setMessageBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData) this.instance).setMessageBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.OperativeEventRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.OperativeEventRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData();
                case 2:
                    return new gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new java.lang.Object[]{"errorType_", "message_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.class) {
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
            gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData = new gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData();
            DEFAULT_INSTANCE = operativeEventErrorData;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.class, operativeEventErrorData);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.OperativeEventRequestOuterClass$1, reason: invalid class name */
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

    public static final class OperativeEventRequest extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest, gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder> implements gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder {
        public static final int ADDITIONAL_DATA_FIELD_NUMBER = 5;
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 10;
        private static final gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 9;
        public static final int EVENT_ID_FIELD_NUMBER = 1;
        public static final int EVENT_TYPE_FIELD_NUMBER = 2;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest> PARSER = null;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 7;
        public static final int SID_FIELD_NUMBER = 6;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 8;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 4;
        private gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState_;
        private gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private int eventType_;
        private gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters_;
        private gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;
        private com.google.protobuf.ByteString eventId_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString impressionOpportunityId_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString trackingToken_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString additionalData_ = com.google.protobuf.ByteString.EMPTY;
        private java.lang.String sid_ = "";

        private OperativeEventRequest() {
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public com.google.protobuf.ByteString getEventId() {
            return this.eventId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.eventId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = getDefaultInstance().getEventId();
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public int getEventTypeValue() {
            return this.eventType_;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType getEventType() {
            gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType operativeEventTypeForNumber = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.forNumber(this.eventType_);
            return operativeEventTypeForNumber == null ? gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.UNRECOGNIZED : operativeEventTypeForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventTypeValue(int i) {
            this.eventType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventType(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType operativeEventType) {
            this.eventType_ = operativeEventType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventType() {
            this.eventType_ = 0;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public com.google.protobuf.ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionOpportunityId(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.impressionOpportunityId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionOpportunityId() {
            this.impressionOpportunityId_ = getDefaultInstance().getImpressionOpportunityId();
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public com.google.protobuf.ByteString getTrackingToken() {
            return this.trackingToken_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackingToken(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.trackingToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackingToken() {
            this.trackingToken_ = getDefaultInstance().getTrackingToken();
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public com.google.protobuf.ByteString getAdditionalData() {
            return this.additionalData_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdditionalData(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.additionalData_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdditionalData() {
            this.additionalData_ = getDefaultInstance().getAdditionalData();
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public java.lang.String getSid() {
            return this.sid_;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public com.google.protobuf.ByteString getSidBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.sid_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSid(java.lang.String str) {
            str.getClass();
            this.sid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSid() {
            this.sid_ = getDefaultInstance().getSid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSidBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.sid_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public boolean hasSessionCounters() {
            return this.sessionCounters_ != null;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters() {
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters = this.sessionCounters_;
            return sessionCounters == null ? gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.getDefaultInstance() : sessionCounters;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            this.sessionCounters_ = sessionCounters;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters2 = this.sessionCounters_;
            if (sessionCounters2 != null && sessionCounters2 != gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.getDefaultInstance()) {
                this.sessionCounters_ = gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.newBuilder(this.sessionCounters_).mergeFrom(sessionCounters).buildPartial();
            } else {
                this.sessionCounters_ = sessionCounters;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionCounters() {
            this.sessionCounters_ = null;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            return this.staticDeviceInfo_ != null;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 != null && staticDeviceInfo2 != gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom(staticDeviceInfo).buildPartial();
            } else {
                this.staticDeviceInfo_ = staticDeviceInfo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return this.dynamicDeviceInfo_ != null;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            return dynamicDeviceInfo == null ? gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() : dynamicDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo2 != null && dynamicDeviceInfo2 != gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance()) {
                this.dynamicDeviceInfo_ = gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom(dynamicDeviceInfo).buildPartial();
            } else {
                this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public boolean hasCampaignState() {
            return this.campaignState_ != null;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignState() {
            gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState = this.campaignState_;
            return campaignState == null ? gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getDefaultInstance() : campaignState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            this.campaignState_ = campaignState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState2 = this.campaignState_;
            if (campaignState2 != null && campaignState2 != gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.getDefaultInstance()) {
                this.campaignState_ = gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.newBuilder(this.campaignState_).mergeFrom(campaignState).buildPartial();
            } else {
                this.campaignState_ = campaignState;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCampaignState() {
            this.campaignState_ = null;
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder newBuilder(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
            return DEFAULT_INSTANCE.createBuilder(operativeEventRequest);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest, gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder> implements gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.OperativeEventRequestOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public com.google.protobuf.ByteString getEventId() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).getEventId();
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setEventId(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).setEventId(byteString);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearEventId() {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).clearEventId();
                return this;
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public int getEventTypeValue() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).getEventTypeValue();
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setEventTypeValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).setEventTypeValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType getEventType() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).getEventType();
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setEventType(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType operativeEventType) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).setEventType(operativeEventType);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearEventType() {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).clearEventType();
                return this;
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public com.google.protobuf.ByteString getImpressionOpportunityId() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).getImpressionOpportunityId();
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setImpressionOpportunityId(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).setImpressionOpportunityId(byteString);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearImpressionOpportunityId() {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).clearImpressionOpportunityId();
                return this;
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public com.google.protobuf.ByteString getTrackingToken() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).getTrackingToken();
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setTrackingToken(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).setTrackingToken(byteString);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearTrackingToken() {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).clearTrackingToken();
                return this;
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public com.google.protobuf.ByteString getAdditionalData() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).getAdditionalData();
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setAdditionalData(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).setAdditionalData(byteString);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearAdditionalData() {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).clearAdditionalData();
                return this;
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public java.lang.String getSid() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).getSid();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public com.google.protobuf.ByteString getSidBytes() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).getSidBytes();
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setSid(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).setSid(str);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearSid() {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).clearSid();
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setSidBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).setSidBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public boolean hasSessionCounters() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).hasSessionCounters();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).getSessionCounters();
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).setSessionCounters(sessionCounters);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).setSessionCounters(builder.build());
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder mergeSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).mergeSessionCounters(sessionCounters);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearSessionCounters() {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).clearSessionCounters();
                return this;
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).hasStaticDeviceInfo();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).getStaticDeviceInfo();
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).setStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).setStaticDeviceInfo(builder.build());
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).mergeStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearStaticDeviceInfo() {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).clearStaticDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).hasDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).getDynamicDeviceInfo();
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).setDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).setDynamicDeviceInfo(builder.build());
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).clearDynamicDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public boolean hasCampaignState() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).hasCampaignState();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState getCampaignState() {
                return ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).getCampaignState();
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).setCampaignState(campaignState);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).setCampaignState(builder.build());
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder mergeCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).mergeCampaignState(campaignState);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearCampaignState() {
                copyOnWrite();
                ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.instance).clearCampaignState();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.OperativeEventRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.OperativeEventRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest();
                case 2:
                    return new gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\n\u0002\f\u0003\n\u0004\n\u0005\n\u0006Ȉ\u0007\t\b\t\t\t\n\t", new java.lang.Object[]{"eventId_", "eventType_", "impressionOpportunityId_", "trackingToken_", "additionalData_", "sid_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "campaignState_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.class) {
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
            gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest = new gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest();
            DEFAULT_INSTANCE = operativeEventRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.class, operativeEventRequest);
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
