package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class InitializationResponseOuterClass {

    public interface InitializationResponseOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        boolean containsScarPlacements(java.lang.String str);

        int getCountOfLastShownCampaigns();

        gatewayprotocol.v1.ErrorOuterClass.Error getError();

        gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

        gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat getScarEligibleFormats(int i);

        int getScarEligibleFormatsCount();

        java.util.List<gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat> getScarEligibleFormatsList();

        int getScarEligibleFormatsValue(int i);

        java.util.List<java.lang.Integer> getScarEligibleFormatsValueList();

        @java.lang.Deprecated
        java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> getScarPlacements();

        int getScarPlacementsCount();

        java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> getScarPlacementsMap();

        gatewayprotocol.v1.InitializationResponseOuterClass.Placement getScarPlacementsOrDefault(java.lang.String str, gatewayprotocol.v1.InitializationResponseOuterClass.Placement placement);

        gatewayprotocol.v1.InitializationResponseOuterClass.Placement getScarPlacementsOrThrow(java.lang.String str);

        boolean getTriggerInitializationCompletedRequest();

        java.lang.String getUniversalRequestUrl();

        com.google.protobuf.ByteString getUniversalRequestUrlBytes();

        boolean hasError();

        boolean hasNativeConfiguration();

        boolean hasUniversalRequestUrl();
    }

    public interface PlacementOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private InitializationResponseOuterClass() {
    }

    public enum AdFormat implements com.google.protobuf.Internal.EnumLite {
        AD_FORMAT_UNSPECIFIED(0),
        AD_FORMAT_INTERSTITIAL(1),
        AD_FORMAT_REWARDED(2),
        AD_FORMAT_BANNER(3),
        UNRECOGNIZED(-1);

        public static final int AD_FORMAT_BANNER_VALUE = 3;
        public static final int AD_FORMAT_INTERSTITIAL_VALUE = 1;
        public static final int AD_FORMAT_REWARDED_VALUE = 2;
        public static final int AD_FORMAT_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat>() { // from class: gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat findValueByNumber(int i) {
                return gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat.forNumber(i);
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
        public static gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat forNumber(int i) {
            if (i == 0) {
                return AD_FORMAT_UNSPECIFIED;
            }
            if (i == 1) {
                return AD_FORMAT_INTERSTITIAL;
            }
            if (i == 2) {
                return AD_FORMAT_REWARDED;
            }
            if (i != 3) {
                return null;
            }
            return AD_FORMAT_BANNER;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat.AdFormatVerifier.INSTANCE;
        }

        private static final class AdFormatVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat.AdFormatVerifier();

            private AdFormatVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat.forNumber(i) != null;
            }
        }

        AdFormat(int i) {
            this.value = i;
        }
    }

    public static final class Placement extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.InitializationResponseOuterClass.Placement, gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder> implements gatewayprotocol.v1.InitializationResponseOuterClass.PlacementOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 1;
        private static final gatewayprotocol.v1.InitializationResponseOuterClass.Placement DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.InitializationResponseOuterClass.Placement> PARSER;
        private int adFormat_;

        private Placement() {
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.PlacementOrBuilder
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.PlacementOrBuilder
        public gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat getAdFormat() {
            gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormatForNumber = gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat.forNumber(this.adFormat_);
            return adFormatForNumber == null ? gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat.UNRECOGNIZED : adFormatForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormatValue(int i) {
            this.adFormat_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormat(gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdFormat() {
            this.adFormat_ = 0;
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder newBuilder(gatewayprotocol.v1.InitializationResponseOuterClass.Placement placement) {
            return DEFAULT_INSTANCE.createBuilder(placement);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.InitializationResponseOuterClass.Placement, gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder> implements gatewayprotocol.v1.InitializationResponseOuterClass.PlacementOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.InitializationResponseOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.InitializationResponseOuterClass.Placement.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.PlacementOrBuilder
            public int getAdFormatValue() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.Placement) this.instance).getAdFormatValue();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder setAdFormatValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.Placement) this.instance).setAdFormatValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.PlacementOrBuilder
            public gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat getAdFormat() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.Placement) this.instance).getAdFormat();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder setAdFormat(gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormat) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.Placement) this.instance).setAdFormat(adFormat);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder clearAdFormat() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.Placement) this.instance).clearAdFormat();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.InitializationResponseOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.InitializationResponseOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.InitializationResponseOuterClass.Placement();
                case 2:
                    return new gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new java.lang.Object[]{"adFormat_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.InitializationResponseOuterClass.Placement> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.InitializationResponseOuterClass.Placement.class) {
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
            gatewayprotocol.v1.InitializationResponseOuterClass.Placement placement = new gatewayprotocol.v1.InitializationResponseOuterClass.Placement();
            DEFAULT_INSTANCE = placement;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.InitializationResponseOuterClass.Placement.class, placement);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.InitializationResponseOuterClass.Placement> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.InitializationResponseOuterClass$1, reason: invalid class name */
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

    public static final class InitializationResponse extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse, gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder> implements gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder {
        public static final int COUNT_OF_LAST_SHOWN_CAMPAIGNS_FIELD_NUMBER = 5;
        private static final gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int NATIVE_CONFIGURATION_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse> PARSER = null;
        public static final int SCAR_ELIGIBLE_FORMATS_FIELD_NUMBER = 7;
        public static final int SCAR_PLACEMENTS_FIELD_NUMBER = 6;
        public static final int TRIGGER_INITIALIZATION_COMPLETED_REQUEST_FIELD_NUMBER = 4;
        public static final int UNIVERSAL_REQUEST_URL_FIELD_NUMBER = 2;
        private static final com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat> scarEligibleFormats_converter_ = new com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat>() { // from class: gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat convert(java.lang.Integer num) {
                gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormatForNumber = gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat.forNumber(num.intValue());
                return adFormatForNumber == null ? gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat.UNRECOGNIZED : adFormatForNumber;
            }
        };
        private int bitField0_;
        private int countOfLastShownCampaigns_;
        private gatewayprotocol.v1.ErrorOuterClass.Error error_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration_;
        private int scarEligibleFormatsMemoizedSerializedSize;
        private boolean triggerInitializationCompletedRequest_;
        private com.google.protobuf.MapFieldLite<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> scarPlacements_ = com.google.protobuf.MapFieldLite.emptyMapField();
        private java.lang.String universalRequestUrl_ = "";
        private com.google.protobuf.Internal.IntList scarEligibleFormats_ = emptyIntList();

        private InitializationResponse() {
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public boolean hasNativeConfiguration() {
            return this.nativeConfiguration_ != null;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = this.nativeConfiguration_;
            return nativeConfiguration == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.getDefaultInstance() : nativeConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNativeConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
            nativeConfiguration.getClass();
            this.nativeConfiguration_ = nativeConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNativeConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
            nativeConfiguration.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration2 = this.nativeConfiguration_;
            if (nativeConfiguration2 != null && nativeConfiguration2 != gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.getDefaultInstance()) {
                this.nativeConfiguration_ = gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.newBuilder(this.nativeConfiguration_).mergeFrom(nativeConfiguration).buildPartial();
            } else {
                this.nativeConfiguration_ = nativeConfiguration;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNativeConfiguration() {
            this.nativeConfiguration_ = null;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public boolean hasUniversalRequestUrl() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public java.lang.String getUniversalRequestUrl() {
            return this.universalRequestUrl_;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public com.google.protobuf.ByteString getUniversalRequestUrlBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.universalRequestUrl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUniversalRequestUrl(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.universalRequestUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUniversalRequestUrl() {
            this.bitField0_ &= -2;
            this.universalRequestUrl_ = getDefaultInstance().getUniversalRequestUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUniversalRequestUrlBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.universalRequestUrl_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public gatewayprotocol.v1.ErrorOuterClass.Error getError() {
            gatewayprotocol.v1.ErrorOuterClass.Error error = this.error_;
            return error == null ? gatewayprotocol.v1.ErrorOuterClass.Error.getDefaultInstance() : error;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
            error.getClass();
            gatewayprotocol.v1.ErrorOuterClass.Error error2 = this.error_;
            if (error2 != null && error2 != gatewayprotocol.v1.ErrorOuterClass.Error.getDefaultInstance()) {
                this.error_ = gatewayprotocol.v1.ErrorOuterClass.Error.newBuilder(this.error_).mergeFrom(error).buildPartial();
            } else {
                this.error_ = error;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -3;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public boolean getTriggerInitializationCompletedRequest() {
            return this.triggerInitializationCompletedRequest_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTriggerInitializationCompletedRequest(boolean z) {
            this.triggerInitializationCompletedRequest_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTriggerInitializationCompletedRequest() {
            this.triggerInitializationCompletedRequest_ = false;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public int getCountOfLastShownCampaigns() {
            return this.countOfLastShownCampaigns_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountOfLastShownCampaigns(int i) {
            this.countOfLastShownCampaigns_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountOfLastShownCampaigns() {
            this.countOfLastShownCampaigns_ = 0;
        }

        private static final class ScarPlacementsDefaultEntryHolder {
            static final com.google.protobuf.MapEntryLite<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> defaultEntry = com.google.protobuf.MapEntryLite.newDefaultInstance(com.google.protobuf.WireFormat.FieldType.STRING, "", com.google.protobuf.WireFormat.FieldType.MESSAGE, gatewayprotocol.v1.InitializationResponseOuterClass.Placement.getDefaultInstance());

            private ScarPlacementsDefaultEntryHolder() {
            }
        }

        private com.google.protobuf.MapFieldLite<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> internalGetScarPlacements() {
            return this.scarPlacements_;
        }

        private com.google.protobuf.MapFieldLite<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> internalGetMutableScarPlacements() {
            if (!this.scarPlacements_.isMutable()) {
                this.scarPlacements_ = this.scarPlacements_.mutableCopy();
            }
            return this.scarPlacements_;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public int getScarPlacementsCount() {
            return internalGetScarPlacements().size();
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public boolean containsScarPlacements(java.lang.String str) {
            str.getClass();
            return internalGetScarPlacements().containsKey(str);
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> getScarPlacements() {
            return getScarPlacementsMap();
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> getScarPlacementsMap() {
            return java.util.Collections.unmodifiableMap(internalGetScarPlacements());
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public gatewayprotocol.v1.InitializationResponseOuterClass.Placement getScarPlacementsOrDefault(java.lang.String str, gatewayprotocol.v1.InitializationResponseOuterClass.Placement placement) {
            str.getClass();
            com.google.protobuf.MapFieldLite<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> mapFieldLiteInternalGetScarPlacements = internalGetScarPlacements();
            return mapFieldLiteInternalGetScarPlacements.containsKey(str) ? mapFieldLiteInternalGetScarPlacements.get(str) : placement;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public gatewayprotocol.v1.InitializationResponseOuterClass.Placement getScarPlacementsOrThrow(java.lang.String str) {
            str.getClass();
            com.google.protobuf.MapFieldLite<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> mapFieldLiteInternalGetScarPlacements = internalGetScarPlacements();
            if (!mapFieldLiteInternalGetScarPlacements.containsKey(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            return mapFieldLiteInternalGetScarPlacements.get(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> getMutableScarPlacementsMap() {
            return internalGetMutableScarPlacements();
        }

        static {
            gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse initializationResponse = new gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse();
            DEFAULT_INSTANCE = initializationResponse;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.class, initializationResponse);
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public java.util.List<gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat> getScarEligibleFormatsList() {
            return new com.google.protobuf.Internal.ListAdapter(this.scarEligibleFormats_, scarEligibleFormats_converter_);
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public int getScarEligibleFormatsCount() {
            return this.scarEligibleFormats_.size();
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat getScarEligibleFormats(int i) {
            gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormatForNumber = gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat.forNumber(this.scarEligibleFormats_.getInt(i));
            return adFormatForNumber == null ? gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat.UNRECOGNIZED : adFormatForNumber;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public java.util.List<java.lang.Integer> getScarEligibleFormatsValueList() {
            return this.scarEligibleFormats_;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public int getScarEligibleFormatsValue(int i) {
            return this.scarEligibleFormats_.getInt(i);
        }

        private void ensureScarEligibleFormatsIsMutable() {
            com.google.protobuf.Internal.IntList intList = this.scarEligibleFormats_;
            if (intList.isModifiable()) {
                return;
            }
            this.scarEligibleFormats_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(intList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScarEligibleFormats(int i, gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormat) {
            adFormat.getClass();
            ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.setInt(i, adFormat.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addScarEligibleFormats(gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormat) {
            adFormat.getClass();
            ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.addInt(adFormat.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllScarEligibleFormats(java.lang.Iterable<? extends gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat> iterable) {
            ensureScarEligibleFormatsIsMutable();
            java.util.Iterator<? extends gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat> it = iterable.iterator();
            while (it.hasNext()) {
                this.scarEligibleFormats_.addInt(it.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScarEligibleFormats() {
            this.scarEligibleFormats_ = emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScarEligibleFormatsValue(int i, int i2) {
            ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addScarEligibleFormatsValue(int i) {
            ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllScarEligibleFormatsValue(java.lang.Iterable<java.lang.Integer> iterable) {
            ensureScarEligibleFormatsIsMutable();
            java.util.Iterator<java.lang.Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.scarEligibleFormats_.addInt(it.next().intValue());
            }
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder newBuilder(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse initializationResponse) {
            return DEFAULT_INSTANCE.createBuilder(initializationResponse);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse, gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder> implements gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.InitializationResponseOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public boolean hasNativeConfiguration() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).hasNativeConfiguration();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getNativeConfiguration();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setNativeConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setNativeConfiguration(nativeConfiguration);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setNativeConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setNativeConfiguration(builder.build());
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder mergeNativeConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).mergeNativeConfiguration(nativeConfiguration);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder clearNativeConfiguration() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).clearNativeConfiguration();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public boolean hasUniversalRequestUrl() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).hasUniversalRequestUrl();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public java.lang.String getUniversalRequestUrl() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getUniversalRequestUrl();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public com.google.protobuf.ByteString getUniversalRequestUrlBytes() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getUniversalRequestUrlBytes();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setUniversalRequestUrl(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setUniversalRequestUrl(str);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder clearUniversalRequestUrl() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).clearUniversalRequestUrl();
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setUniversalRequestUrlBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setUniversalRequestUrlBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public boolean hasError() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).hasError();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public gatewayprotocol.v1.ErrorOuterClass.Error getError() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getError();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setError(error);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setError(builder.build());
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder mergeError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).mergeError(error);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder clearError() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).clearError();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public boolean getTriggerInitializationCompletedRequest() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getTriggerInitializationCompletedRequest();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setTriggerInitializationCompletedRequest(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setTriggerInitializationCompletedRequest(z);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder clearTriggerInitializationCompletedRequest() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).clearTriggerInitializationCompletedRequest();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public int getCountOfLastShownCampaigns() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getCountOfLastShownCampaigns();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setCountOfLastShownCampaigns(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setCountOfLastShownCampaigns(i);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder clearCountOfLastShownCampaigns() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).clearCountOfLastShownCampaigns();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public int getScarPlacementsCount() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarPlacementsMap().size();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public boolean containsScarPlacements(java.lang.String str) {
                str.getClass();
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarPlacementsMap().containsKey(str);
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder clearScarPlacements() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getMutableScarPlacementsMap().clear();
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder removeScarPlacements(java.lang.String str) {
                str.getClass();
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getMutableScarPlacementsMap().remove(str);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            @java.lang.Deprecated
            public java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> getScarPlacements() {
                return getScarPlacementsMap();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> getScarPlacementsMap() {
                return java.util.Collections.unmodifiableMap(((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarPlacementsMap());
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public gatewayprotocol.v1.InitializationResponseOuterClass.Placement getScarPlacementsOrDefault(java.lang.String str, gatewayprotocol.v1.InitializationResponseOuterClass.Placement placement) {
                str.getClass();
                java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> scarPlacementsMap = ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarPlacementsMap();
                return scarPlacementsMap.containsKey(str) ? scarPlacementsMap.get(str) : placement;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public gatewayprotocol.v1.InitializationResponseOuterClass.Placement getScarPlacementsOrThrow(java.lang.String str) {
                str.getClass();
                java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> scarPlacementsMap = ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarPlacementsMap();
                if (!scarPlacementsMap.containsKey(str)) {
                    throw new java.lang.IllegalArgumentException();
                }
                return scarPlacementsMap.get(str);
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder putScarPlacements(java.lang.String str, gatewayprotocol.v1.InitializationResponseOuterClass.Placement placement) {
                str.getClass();
                placement.getClass();
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getMutableScarPlacementsMap().put(str, placement);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder putAllScarPlacements(java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> map) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getMutableScarPlacementsMap().putAll(map);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public java.util.List<gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat> getScarEligibleFormatsList() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarEligibleFormatsList();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public int getScarEligibleFormatsCount() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarEligibleFormatsCount();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat getScarEligibleFormats(int i) {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarEligibleFormats(i);
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setScarEligibleFormats(int i, gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormat) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setScarEligibleFormats(i, adFormat);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder addScarEligibleFormats(gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat adFormat) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).addScarEligibleFormats(adFormat);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder addAllScarEligibleFormats(java.lang.Iterable<? extends gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).addAllScarEligibleFormats(iterable);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder clearScarEligibleFormats() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).clearScarEligibleFormats();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public java.util.List<java.lang.Integer> getScarEligibleFormatsValueList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarEligibleFormatsValueList());
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public int getScarEligibleFormatsValue(int i) {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarEligibleFormatsValue(i);
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setScarEligibleFormatsValue(int i, int i2) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setScarEligibleFormatsValue(i, i2);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder addScarEligibleFormatsValue(int i) {
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).addScarEligibleFormatsValue(i);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder addAllScarEligibleFormatsValue(java.lang.Iterable<java.lang.Integer> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).addAllScarEligibleFormatsValue(iterable);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.InitializationResponseOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.InitializationResponseOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse();
                case 2:
                    return new gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0001\u0000\u0001\t\u0002ለ\u0000\u0003ဉ\u0001\u0004\u0007\u0005\u0004\u00062\u0007,", new java.lang.Object[]{"bitField0_", "nativeConfiguration_", "universalRequestUrl_", "error_", "triggerInitializationCompletedRequest_", "countOfLastShownCampaigns_", "scarPlacements_", gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.ScarPlacementsDefaultEntryHolder.defaultEntry, "scarEligibleFormats_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.class) {
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

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
