package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class UniversalRequestOuterClass {

    public interface LimitedSessionTokenOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getCustomMediationName();

        com.google.protobuf.ByteString getCustomMediationNameBytes();

        java.lang.String getDeviceMake();

        com.google.protobuf.ByteString getDeviceMakeBytes();

        java.lang.String getDeviceModel();

        com.google.protobuf.ByteString getDeviceModelBytes();

        java.lang.String getGameId();

        com.google.protobuf.ByteString getGameIdBytes();

        java.lang.String getIdfi();

        com.google.protobuf.ByteString getIdfiBytes();

        gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider getMediationProvider();

        int getMediationProviderValue();

        java.lang.String getMediationVersion();

        com.google.protobuf.ByteString getMediationVersionBytes();

        java.lang.String getOsVersion();

        com.google.protobuf.ByteString getOsVersionBytes();

        gatewayprotocol.v1.ClientInfoOuterClass.Platform getPlatform();

        int getPlatformValue();

        int getSdkVersion();

        java.lang.String getSdkVersionName();

        com.google.protobuf.ByteString getSdkVersionNameBytes();

        com.google.protobuf.ByteString getSessionId();

        boolean hasCustomMediationName();

        boolean hasMediationVersion();

        boolean hasSessionId();
    }

    public interface UniversalRequestOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload getPayload();

        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData();

        boolean hasPayload();

        boolean hasSharedData();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private UniversalRequestOuterClass() {
    }

    public static final class LimitedSessionToken extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken, gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder> implements gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder {
        public static final int CUSTOM_MEDIATION_NAME_FIELD_NUMBER = 11;
        private static final gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken DEFAULT_INSTANCE;
        public static final int DEVICE_MAKE_FIELD_NUMBER = 1;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 2;
        public static final int GAME_ID_FIELD_NUMBER = 8;
        public static final int IDFI_FIELD_NUMBER = 4;
        public static final int MEDIATION_PROVIDER_FIELD_NUMBER = 10;
        public static final int MEDIATION_VERSION_FIELD_NUMBER = 12;
        public static final int OS_VERSION_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken> PARSER = null;
        public static final int PLATFORM_FIELD_NUMBER = 9;
        public static final int SDK_VERSION_FIELD_NUMBER = 5;
        public static final int SDK_VERSION_NAME_FIELD_NUMBER = 7;
        public static final int SESSION_ID_FIELD_NUMBER = 13;
        private int bitField0_;
        private int mediationProvider_;
        private int platform_;
        private int sdkVersion_;
        private java.lang.String deviceMake_ = "";
        private java.lang.String deviceModel_ = "";
        private java.lang.String osVersion_ = "";
        private java.lang.String idfi_ = "";
        private java.lang.String sdkVersionName_ = "";
        private java.lang.String gameId_ = "";
        private java.lang.String customMediationName_ = "";
        private java.lang.String mediationVersion_ = "";
        private com.google.protobuf.ByteString sessionId_ = com.google.protobuf.ByteString.EMPTY;

        private LimitedSessionToken() {
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public java.lang.String getDeviceMake() {
            return this.deviceMake_;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public com.google.protobuf.ByteString getDeviceMakeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.deviceMake_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceMake(java.lang.String str) {
            str.getClass();
            this.deviceMake_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceMake() {
            this.deviceMake_ = getDefaultInstance().getDeviceMake();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceMakeBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.deviceMake_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public java.lang.String getDeviceModel() {
            return this.deviceModel_;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public com.google.protobuf.ByteString getDeviceModelBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.deviceModel_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModel(java.lang.String str) {
            str.getClass();
            this.deviceModel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceModel() {
            this.deviceModel_ = getDefaultInstance().getDeviceModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModelBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.deviceModel_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public java.lang.String getOsVersion() {
            return this.osVersion_;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public com.google.protobuf.ByteString getOsVersionBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.osVersion_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersion(java.lang.String str) {
            str.getClass();
            this.osVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOsVersion() {
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersionBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.osVersion_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public java.lang.String getIdfi() {
            return this.idfi_;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public com.google.protobuf.ByteString getIdfiBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.idfi_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfi(java.lang.String str) {
            str.getClass();
            this.idfi_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdfi() {
            this.idfi_ = getDefaultInstance().getIdfi();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfiBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.idfi_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public int getSdkVersion() {
            return this.sdkVersion_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdkVersion(int i) {
            this.sdkVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSdkVersion() {
            this.sdkVersion_ = 0;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public java.lang.String getSdkVersionName() {
            return this.sdkVersionName_;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public com.google.protobuf.ByteString getSdkVersionNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.sdkVersionName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdkVersionName(java.lang.String str) {
            str.getClass();
            this.sdkVersionName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSdkVersionName() {
            this.sdkVersionName_ = getDefaultInstance().getSdkVersionName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdkVersionNameBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.sdkVersionName_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public java.lang.String getGameId() {
            return this.gameId_;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public com.google.protobuf.ByteString getGameIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.gameId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGameId(java.lang.String str) {
            str.getClass();
            this.gameId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGameId() {
            this.gameId_ = getDefaultInstance().getGameId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGameIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.gameId_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public int getPlatformValue() {
            return this.platform_;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public gatewayprotocol.v1.ClientInfoOuterClass.Platform getPlatform() {
            gatewayprotocol.v1.ClientInfoOuterClass.Platform platformForNumber = gatewayprotocol.v1.ClientInfoOuterClass.Platform.forNumber(this.platform_);
            return platformForNumber == null ? gatewayprotocol.v1.ClientInfoOuterClass.Platform.UNRECOGNIZED : platformForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlatformValue(int i) {
            this.platform_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlatform(gatewayprotocol.v1.ClientInfoOuterClass.Platform platform) {
            this.platform_ = platform.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlatform() {
            this.platform_ = 0;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public int getMediationProviderValue() {
            return this.mediationProvider_;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider getMediationProvider() {
            gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider mediationProviderForNumber = gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.forNumber(this.mediationProvider_);
            return mediationProviderForNumber == null ? gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.UNRECOGNIZED : mediationProviderForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationProviderValue(int i) {
            this.mediationProvider_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationProvider(gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider mediationProvider) {
            this.mediationProvider_ = mediationProvider.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediationProvider() {
            this.mediationProvider_ = 0;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public boolean hasCustomMediationName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public java.lang.String getCustomMediationName() {
            return this.customMediationName_;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public com.google.protobuf.ByteString getCustomMediationNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.customMediationName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomMediationName(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customMediationName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomMediationName() {
            this.bitField0_ &= -2;
            this.customMediationName_ = getDefaultInstance().getCustomMediationName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomMediationNameBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.customMediationName_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public boolean hasMediationVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public java.lang.String getMediationVersion() {
            return this.mediationVersion_;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public com.google.protobuf.ByteString getMediationVersionBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.mediationVersion_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationVersion(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.mediationVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediationVersion() {
            this.bitField0_ &= -3;
            this.mediationVersion_ = getDefaultInstance().getMediationVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationVersionBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.mediationVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public boolean hasSessionId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public com.google.protobuf.ByteString getSessionId() {
            return this.sessionId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 4;
            this.sessionId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.bitField0_ &= -5;
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder newBuilder(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
            return DEFAULT_INSTANCE.createBuilder(limitedSessionToken);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken, gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder> implements gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.UniversalRequestOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public java.lang.String getDeviceMake() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getDeviceMake();
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public com.google.protobuf.ByteString getDeviceMakeBytes() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getDeviceMakeBytes();
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setDeviceMake(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setDeviceMake(str);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder clearDeviceMake() {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).clearDeviceMake();
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setDeviceMakeBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setDeviceMakeBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public java.lang.String getDeviceModel() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getDeviceModel();
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public com.google.protobuf.ByteString getDeviceModelBytes() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getDeviceModelBytes();
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setDeviceModel(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setDeviceModel(str);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder clearDeviceModel() {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).clearDeviceModel();
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setDeviceModelBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setDeviceModelBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public java.lang.String getOsVersion() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getOsVersion();
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public com.google.protobuf.ByteString getOsVersionBytes() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getOsVersionBytes();
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setOsVersion(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setOsVersion(str);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder clearOsVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).clearOsVersion();
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setOsVersionBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setOsVersionBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public java.lang.String getIdfi() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getIdfi();
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public com.google.protobuf.ByteString getIdfiBytes() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getIdfiBytes();
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setIdfi(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setIdfi(str);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder clearIdfi() {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).clearIdfi();
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setIdfiBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setIdfiBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public int getSdkVersion() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getSdkVersion();
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setSdkVersion(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setSdkVersion(i);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder clearSdkVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).clearSdkVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public java.lang.String getSdkVersionName() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getSdkVersionName();
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public com.google.protobuf.ByteString getSdkVersionNameBytes() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getSdkVersionNameBytes();
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setSdkVersionName(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setSdkVersionName(str);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder clearSdkVersionName() {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).clearSdkVersionName();
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setSdkVersionNameBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setSdkVersionNameBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public java.lang.String getGameId() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getGameId();
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public com.google.protobuf.ByteString getGameIdBytes() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getGameIdBytes();
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setGameId(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setGameId(str);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder clearGameId() {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).clearGameId();
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setGameIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setGameIdBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public int getPlatformValue() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getPlatformValue();
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setPlatformValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setPlatformValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public gatewayprotocol.v1.ClientInfoOuterClass.Platform getPlatform() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getPlatform();
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setPlatform(gatewayprotocol.v1.ClientInfoOuterClass.Platform platform) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setPlatform(platform);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder clearPlatform() {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).clearPlatform();
                return this;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public int getMediationProviderValue() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getMediationProviderValue();
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setMediationProviderValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setMediationProviderValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider getMediationProvider() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getMediationProvider();
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setMediationProvider(gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider mediationProvider) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setMediationProvider(mediationProvider);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder clearMediationProvider() {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).clearMediationProvider();
                return this;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public boolean hasCustomMediationName() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).hasCustomMediationName();
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public java.lang.String getCustomMediationName() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getCustomMediationName();
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public com.google.protobuf.ByteString getCustomMediationNameBytes() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getCustomMediationNameBytes();
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setCustomMediationName(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setCustomMediationName(str);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder clearCustomMediationName() {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).clearCustomMediationName();
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setCustomMediationNameBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setCustomMediationNameBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public boolean hasMediationVersion() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).hasMediationVersion();
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public java.lang.String getMediationVersion() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getMediationVersion();
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public com.google.protobuf.ByteString getMediationVersionBytes() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getMediationVersionBytes();
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setMediationVersion(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setMediationVersion(str);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder clearMediationVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).clearMediationVersion();
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setMediationVersionBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setMediationVersionBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public boolean hasSessionId() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).hasSessionId();
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public com.google.protobuf.ByteString getSessionId() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).getSessionId();
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder setSessionId(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).setSessionId(byteString);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder clearSessionId() {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) this.instance).clearSessionId();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.UniversalRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.UniversalRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken();
                case 2:
                    return new gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\r\f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u000b\u0007Ȉ\bȈ\t\f\n\f\u000bለ\u0000\fለ\u0001\rည\u0002", new java.lang.Object[]{"bitField0_", "deviceMake_", "deviceModel_", "osVersion_", "idfi_", "sdkVersion_", "sdkVersionName_", "gameId_", "platform_", "mediationProvider_", "customMediationName_", "mediationVersion_", "sessionId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.class) {
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
            gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = new gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken();
            DEFAULT_INSTANCE = limitedSessionToken;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.class, limitedSessionToken);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.UniversalRequestOuterClass$1, reason: invalid class name */
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

    public static final class UniversalRequest extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder> implements gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequestOrBuilder {
        private static final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 2;
        public static final int SHARED_DATA_FIELD_NUMBER = 1;
        private gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload_;
        private gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData_;

        public interface PayloadOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest();

            gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest();

            gatewayprotocol.v1.AdRequestOuterClass.AdRequest getAdRequest();

            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest();

            gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest();

            gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest();

            gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest getInitializationRequest();

            gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent();

            gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest();

            gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest();

            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase getValueCase();

            boolean hasAdDataRefreshRequest();

            boolean hasAdPlayerConfigRequest();

            boolean hasAdRequest();

            boolean hasDiagnosticEventRequest();

            boolean hasGetTokenEventRequest();

            boolean hasInitializationCompletedEventRequest();

            boolean hasInitializationRequest();

            boolean hasOperativeEvent();

            boolean hasPrivacyUpdateRequest();

            boolean hasTransactionEventRequest();
        }

        public interface SharedDataOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            com.google.protobuf.Timestamp getAppStartTime();

            com.google.protobuf.ByteString getCurrentState();

            gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent();

            gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken();

            gatewayprotocol.v1.PiiOuterClass.Pii getPii();

            com.google.protobuf.Timestamp getSdkStartTime();

            com.google.protobuf.ByteString getSessionToken();

            gatewayprotocol.v1.TestDataOuterClass.TestData getTestData();

            gatewayprotocol.v1.TimestampsOuterClass.Timestamps getTimestamps();

            int getWebviewVersion();

            boolean hasAppStartTime();

            boolean hasCurrentState();

            boolean hasDeveloperConsent();

            boolean hasLimitedSessionToken();

            boolean hasPii();

            boolean hasSdkStartTime();

            boolean hasSessionToken();

            boolean hasTestData();

            boolean hasTimestamps();

            boolean hasWebviewVersion();
        }

        private UniversalRequest() {
        }

        public static final class SharedData extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder> implements gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder {
            public static final int APP_START_TIME_FIELD_NUMBER = 8;
            public static final int CURRENT_STATE_FIELD_NUMBER = 6;
            private static final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData DEFAULT_INSTANCE;
            public static final int DEVELOPER_CONSENT_FIELD_NUMBER = 4;
            public static final int LIMITED_SESSION_TOKEN_FIELD_NUMBER = 10;
            private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData> PARSER = null;
            public static final int PII_FIELD_NUMBER = 3;
            public static final int SDK_START_TIME_FIELD_NUMBER = 9;
            public static final int SESSION_TOKEN_FIELD_NUMBER = 1;
            public static final int TEST_DATA_FIELD_NUMBER = 7;
            public static final int TIMESTAMPS_FIELD_NUMBER = 2;
            public static final int WEBVIEW_VERSION_FIELD_NUMBER = 5;
            private com.google.protobuf.Timestamp appStartTime_;
            private int bitField0_;
            private gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent developerConsent_;
            private gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken_;
            private gatewayprotocol.v1.PiiOuterClass.Pii pii_;
            private com.google.protobuf.Timestamp sdkStartTime_;
            private gatewayprotocol.v1.TestDataOuterClass.TestData testData_;
            private gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps_;
            private int webviewVersion_;
            private com.google.protobuf.ByteString sessionToken_ = com.google.protobuf.ByteString.EMPTY;
            private com.google.protobuf.ByteString currentState_ = com.google.protobuf.ByteString.EMPTY;

            private SharedData() {
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasSessionToken() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public com.google.protobuf.ByteString getSessionToken() {
                return this.sessionToken_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSessionToken(com.google.protobuf.ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.sessionToken_ = byteString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSessionToken() {
                this.bitField0_ &= -2;
                this.sessionToken_ = getDefaultInstance().getSessionToken();
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasTimestamps() {
                return this.timestamps_ != null;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public gatewayprotocol.v1.TimestampsOuterClass.Timestamps getTimestamps() {
                gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps = this.timestamps_;
                return timestamps == null ? gatewayprotocol.v1.TimestampsOuterClass.Timestamps.getDefaultInstance() : timestamps;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
                timestamps.getClass();
                this.timestamps_ = timestamps;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
                timestamps.getClass();
                gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps2 = this.timestamps_;
                if (timestamps2 != null && timestamps2 != gatewayprotocol.v1.TimestampsOuterClass.Timestamps.getDefaultInstance()) {
                    this.timestamps_ = gatewayprotocol.v1.TimestampsOuterClass.Timestamps.newBuilder(this.timestamps_).mergeFrom(timestamps).buildPartial();
                } else {
                    this.timestamps_ = timestamps;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTimestamps() {
                this.timestamps_ = null;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasPii() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public gatewayprotocol.v1.PiiOuterClass.Pii getPii() {
                gatewayprotocol.v1.PiiOuterClass.Pii pii = this.pii_;
                return pii == null ? gatewayprotocol.v1.PiiOuterClass.Pii.getDefaultInstance() : pii;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPii(gatewayprotocol.v1.PiiOuterClass.Pii pii) {
                pii.getClass();
                this.pii_ = pii;
                this.bitField0_ |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergePii(gatewayprotocol.v1.PiiOuterClass.Pii pii) {
                pii.getClass();
                gatewayprotocol.v1.PiiOuterClass.Pii pii2 = this.pii_;
                if (pii2 != null && pii2 != gatewayprotocol.v1.PiiOuterClass.Pii.getDefaultInstance()) {
                    this.pii_ = gatewayprotocol.v1.PiiOuterClass.Pii.newBuilder(this.pii_).mergeFrom(pii).buildPartial();
                } else {
                    this.pii_ = pii;
                }
                this.bitField0_ |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPii() {
                this.pii_ = null;
                this.bitField0_ &= -3;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasDeveloperConsent() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
                gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent developerConsent = this.developerConsent_;
                return developerConsent == null ? gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getDefaultInstance() : developerConsent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeveloperConsent(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                developerConsent.getClass();
                this.developerConsent_ = developerConsent;
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeDeveloperConsent(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                developerConsent.getClass();
                gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent developerConsent2 = this.developerConsent_;
                if (developerConsent2 != null && developerConsent2 != gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.getDefaultInstance()) {
                    this.developerConsent_ = gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.newBuilder(this.developerConsent_).mergeFrom(developerConsent).buildPartial();
                } else {
                    this.developerConsent_ = developerConsent;
                }
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDeveloperConsent() {
                this.developerConsent_ = null;
                this.bitField0_ &= -5;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasWebviewVersion() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public int getWebviewVersion() {
                return this.webviewVersion_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setWebviewVersion(int i) {
                this.bitField0_ |= 8;
                this.webviewVersion_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearWebviewVersion() {
                this.bitField0_ &= -9;
                this.webviewVersion_ = 0;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasCurrentState() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public com.google.protobuf.ByteString getCurrentState() {
                return this.currentState_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCurrentState(com.google.protobuf.ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 16;
                this.currentState_ = byteString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCurrentState() {
                this.bitField0_ &= -17;
                this.currentState_ = getDefaultInstance().getCurrentState();
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasTestData() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public gatewayprotocol.v1.TestDataOuterClass.TestData getTestData() {
                gatewayprotocol.v1.TestDataOuterClass.TestData testData = this.testData_;
                return testData == null ? gatewayprotocol.v1.TestDataOuterClass.TestData.getDefaultInstance() : testData;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTestData(gatewayprotocol.v1.TestDataOuterClass.TestData testData) {
                testData.getClass();
                this.testData_ = testData;
                this.bitField0_ |= 32;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeTestData(gatewayprotocol.v1.TestDataOuterClass.TestData testData) {
                testData.getClass();
                gatewayprotocol.v1.TestDataOuterClass.TestData testData2 = this.testData_;
                if (testData2 != null && testData2 != gatewayprotocol.v1.TestDataOuterClass.TestData.getDefaultInstance()) {
                    this.testData_ = gatewayprotocol.v1.TestDataOuterClass.TestData.newBuilder(this.testData_).mergeFrom(testData).buildPartial();
                } else {
                    this.testData_ = testData;
                }
                this.bitField0_ |= 32;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTestData() {
                this.testData_ = null;
                this.bitField0_ &= -33;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasAppStartTime() {
                return this.appStartTime_ != null;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public com.google.protobuf.Timestamp getAppStartTime() {
                com.google.protobuf.Timestamp timestamp = this.appStartTime_;
                return timestamp == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAppStartTime(com.google.protobuf.Timestamp timestamp) {
                timestamp.getClass();
                this.appStartTime_ = timestamp;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAppStartTime(com.google.protobuf.Timestamp timestamp) {
                timestamp.getClass();
                com.google.protobuf.Timestamp timestamp2 = this.appStartTime_;
                if (timestamp2 != null && timestamp2 != com.google.protobuf.Timestamp.getDefaultInstance()) {
                    this.appStartTime_ = com.google.protobuf.Timestamp.newBuilder(this.appStartTime_).mergeFrom(timestamp).buildPartial();
                } else {
                    this.appStartTime_ = timestamp;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAppStartTime() {
                this.appStartTime_ = null;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasSdkStartTime() {
                return this.sdkStartTime_ != null;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public com.google.protobuf.Timestamp getSdkStartTime() {
                com.google.protobuf.Timestamp timestamp = this.sdkStartTime_;
                return timestamp == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSdkStartTime(com.google.protobuf.Timestamp timestamp) {
                timestamp.getClass();
                this.sdkStartTime_ = timestamp;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeSdkStartTime(com.google.protobuf.Timestamp timestamp) {
                timestamp.getClass();
                com.google.protobuf.Timestamp timestamp2 = this.sdkStartTime_;
                if (timestamp2 != null && timestamp2 != com.google.protobuf.Timestamp.getDefaultInstance()) {
                    this.sdkStartTime_ = com.google.protobuf.Timestamp.newBuilder(this.sdkStartTime_).mergeFrom(timestamp).buildPartial();
                } else {
                    this.sdkStartTime_ = timestamp;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSdkStartTime() {
                this.sdkStartTime_ = null;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasLimitedSessionToken() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
                gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this.limitedSessionToken_;
                return limitedSessionToken == null ? gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.getDefaultInstance() : limitedSessionToken;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
                limitedSessionToken.getClass();
                this.limitedSessionToken_ = limitedSessionToken;
                this.bitField0_ |= 64;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
                limitedSessionToken.getClass();
                gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken2 = this.limitedSessionToken_;
                if (limitedSessionToken2 != null && limitedSessionToken2 != gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.getDefaultInstance()) {
                    this.limitedSessionToken_ = gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.newBuilder(this.limitedSessionToken_).mergeFrom(limitedSessionToken).buildPartial();
                } else {
                    this.limitedSessionToken_ = limitedSessionToken;
                }
                this.bitField0_ |= 64;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLimitedSessionToken() {
                this.limitedSessionToken_ = null;
                this.bitField0_ &= -65;
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder newBuilder(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
                return DEFAULT_INSTANCE.createBuilder(sharedData);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder> implements gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder {
                /* synthetic */ Builder(gatewayprotocol.v1.UniversalRequestOuterClass.AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    super(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.DEFAULT_INSTANCE);
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasSessionToken() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).hasSessionToken();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public com.google.protobuf.ByteString getSessionToken() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).getSessionToken();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setSessionToken(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).setSessionToken(byteString);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearSessionToken() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).clearSessionToken();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasTimestamps() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).hasTimestamps();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public gatewayprotocol.v1.TimestampsOuterClass.Timestamps getTimestamps() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).getTimestamps();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).setTimestamps(timestamps);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).setTimestamps(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder mergeTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestamps) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).mergeTimestamps(timestamps);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearTimestamps() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).clearTimestamps();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasPii() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).hasPii();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public gatewayprotocol.v1.PiiOuterClass.Pii getPii() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).getPii();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setPii(gatewayprotocol.v1.PiiOuterClass.Pii pii) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).setPii(pii);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setPii(gatewayprotocol.v1.PiiOuterClass.Pii.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).setPii(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder mergePii(gatewayprotocol.v1.PiiOuterClass.Pii pii) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).mergePii(pii);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearPii() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).clearPii();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasDeveloperConsent() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).hasDeveloperConsent();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).getDeveloperConsent();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setDeveloperConsent(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).setDeveloperConsent(developerConsent);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setDeveloperConsent(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).setDeveloperConsent(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder mergeDeveloperConsent(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).mergeDeveloperConsent(developerConsent);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearDeveloperConsent() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).clearDeveloperConsent();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasWebviewVersion() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).hasWebviewVersion();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public int getWebviewVersion() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).getWebviewVersion();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setWebviewVersion(int i) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).setWebviewVersion(i);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearWebviewVersion() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).clearWebviewVersion();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasCurrentState() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).hasCurrentState();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public com.google.protobuf.ByteString getCurrentState() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).getCurrentState();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setCurrentState(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).setCurrentState(byteString);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearCurrentState() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).clearCurrentState();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasTestData() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).hasTestData();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public gatewayprotocol.v1.TestDataOuterClass.TestData getTestData() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).getTestData();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setTestData(gatewayprotocol.v1.TestDataOuterClass.TestData testData) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).setTestData(testData);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setTestData(gatewayprotocol.v1.TestDataOuterClass.TestData.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).setTestData(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder mergeTestData(gatewayprotocol.v1.TestDataOuterClass.TestData testData) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).mergeTestData(testData);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearTestData() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).clearTestData();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasAppStartTime() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).hasAppStartTime();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public com.google.protobuf.Timestamp getAppStartTime() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).getAppStartTime();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setAppStartTime(com.google.protobuf.Timestamp timestamp) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).setAppStartTime(timestamp);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setAppStartTime(com.google.protobuf.Timestamp.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).setAppStartTime(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder mergeAppStartTime(com.google.protobuf.Timestamp timestamp) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).mergeAppStartTime(timestamp);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearAppStartTime() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).clearAppStartTime();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasSdkStartTime() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).hasSdkStartTime();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public com.google.protobuf.Timestamp getSdkStartTime() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).getSdkStartTime();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setSdkStartTime(com.google.protobuf.Timestamp timestamp) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).setSdkStartTime(timestamp);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setSdkStartTime(com.google.protobuf.Timestamp.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).setSdkStartTime(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder mergeSdkStartTime(com.google.protobuf.Timestamp timestamp) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).mergeSdkStartTime(timestamp);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearSdkStartTime() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).clearSdkStartTime();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasLimitedSessionToken() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).hasLimitedSessionToken();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).getLimitedSessionToken();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).setLimitedSessionToken(limitedSessionToken);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).setLimitedSessionToken(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder mergeLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).mergeLimitedSessionToken(limitedSessionToken);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearLimitedSessionToken() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) this.instance).clearLimitedSessionToken();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                gatewayprotocol.v1.UniversalRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
                switch (gatewayprotocol.v1.UniversalRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData();
                    case 2:
                        return new gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder(anonymousClass1);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ည\u0000\u0002\t\u0003ဉ\u0001\u0004ဉ\u0002\u0005င\u0003\u0006ည\u0004\u0007ဉ\u0005\b\t\t\t\nဉ\u0006", new java.lang.Object[]{"bitField0_", "sessionToken_", "timestamps_", "pii_", "developerConsent_", "webviewVersion_", "currentState_", "testData_", "appStartTime_", "sdkStartTime_", "limitedSessionToken_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData> defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.class) {
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
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = new gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData();
                DEFAULT_INSTANCE = sharedData;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.class, sharedData);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Payload extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder> implements gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder {
            public static final int AD_DATA_REFRESH_REQUEST_FIELD_NUMBER = 9;
            public static final int AD_PLAYER_CONFIG_REQUEST_FIELD_NUMBER = 6;
            public static final int AD_REQUEST_FIELD_NUMBER = 3;
            private static final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload DEFAULT_INSTANCE;
            public static final int DIAGNOSTIC_EVENT_REQUEST_FIELD_NUMBER = 5;
            public static final int GET_TOKEN_EVENT_REQUEST_FIELD_NUMBER = 7;
            public static final int INITIALIZATION_COMPLETED_EVENT_REQUEST_FIELD_NUMBER = 10;
            public static final int INITIALIZATION_REQUEST_FIELD_NUMBER = 2;
            public static final int OPERATIVE_EVENT_FIELD_NUMBER = 4;
            private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload> PARSER = null;
            public static final int PRIVACY_UPDATE_REQUEST_FIELD_NUMBER = 8;
            public static final int TRANSACTION_EVENT_REQUEST_FIELD_NUMBER = 11;
            private int valueCase_ = 0;
            private java.lang.Object value_;

            private Payload() {
            }

            public enum ValueCase {
                INITIALIZATION_REQUEST(2),
                AD_REQUEST(3),
                OPERATIVE_EVENT(4),
                DIAGNOSTIC_EVENT_REQUEST(5),
                AD_PLAYER_CONFIG_REQUEST(6),
                GET_TOKEN_EVENT_REQUEST(7),
                PRIVACY_UPDATE_REQUEST(8),
                AD_DATA_REFRESH_REQUEST(9),
                INITIALIZATION_COMPLETED_EVENT_REQUEST(10),
                TRANSACTION_EVENT_REQUEST(11),
                VALUE_NOT_SET(0);

                private final int value;

                ValueCase(int i) {
                    this.value = i;
                }

                @java.lang.Deprecated
                public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase valueOf(int i) {
                    return forNumber(i);
                }

                public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase forNumber(int i) {
                    if (i != 0) {
                        switch (i) {
                            case 2:
                                return INITIALIZATION_REQUEST;
                            case 3:
                                return AD_REQUEST;
                            case 4:
                                return OPERATIVE_EVENT;
                            case 5:
                                return DIAGNOSTIC_EVENT_REQUEST;
                            case 6:
                                return AD_PLAYER_CONFIG_REQUEST;
                            case 7:
                                return GET_TOKEN_EVENT_REQUEST;
                            case 8:
                                return PRIVACY_UPDATE_REQUEST;
                            case 9:
                                return AD_DATA_REFRESH_REQUEST;
                            case 10:
                                return INITIALIZATION_COMPLETED_EVENT_REQUEST;
                            case 11:
                                return TRANSACTION_EVENT_REQUEST;
                            default:
                                return null;
                        }
                    }
                    return VALUE_NOT_SET;
                }

                public int getNumber() {
                    return this.value;
                }
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase getValueCase() {
                return gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase.forNumber(this.valueCase_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearValue() {
                this.valueCase_ = 0;
                this.value_ = null;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasInitializationRequest() {
                return this.valueCase_ == 2;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                if (this.valueCase_ == 2) {
                    return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.value_;
                }
                return gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.getDefaultInstance();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInitializationRequest(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                initializationRequest.getClass();
                this.value_ = initializationRequest;
                this.valueCase_ = 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeInitializationRequest(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                initializationRequest.getClass();
                if (this.valueCase_ == 2 && this.value_ != gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.getDefaultInstance()) {
                    this.value_ = gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.newBuilder((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.value_).mergeFrom(initializationRequest).buildPartial();
                } else {
                    this.value_ = initializationRequest;
                }
                this.valueCase_ = 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInitializationRequest() {
                if (this.valueCase_ == 2) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasAdRequest() {
                return this.valueCase_ == 3;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public gatewayprotocol.v1.AdRequestOuterClass.AdRequest getAdRequest() {
                if (this.valueCase_ == 3) {
                    return (gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.value_;
                }
                return gatewayprotocol.v1.AdRequestOuterClass.AdRequest.getDefaultInstance();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdRequest(gatewayprotocol.v1.AdRequestOuterClass.AdRequest adRequest) {
                adRequest.getClass();
                this.value_ = adRequest;
                this.valueCase_ = 3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAdRequest(gatewayprotocol.v1.AdRequestOuterClass.AdRequest adRequest) {
                adRequest.getClass();
                if (this.valueCase_ == 3 && this.value_ != gatewayprotocol.v1.AdRequestOuterClass.AdRequest.getDefaultInstance()) {
                    this.value_ = gatewayprotocol.v1.AdRequestOuterClass.AdRequest.newBuilder((gatewayprotocol.v1.AdRequestOuterClass.AdRequest) this.value_).mergeFrom(adRequest).buildPartial();
                } else {
                    this.value_ = adRequest;
                }
                this.valueCase_ = 3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdRequest() {
                if (this.valueCase_ == 3) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasOperativeEvent() {
                return this.valueCase_ == 4;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent() {
                if (this.valueCase_ == 4) {
                    return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.value_;
                }
                return gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getDefaultInstance();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOperativeEvent(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                operativeEventRequest.getClass();
                this.value_ = operativeEventRequest;
                this.valueCase_ = 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeOperativeEvent(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                operativeEventRequest.getClass();
                if (this.valueCase_ == 4 && this.value_ != gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.getDefaultInstance()) {
                    this.value_ = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.value_).mergeFrom(operativeEventRequest).buildPartial();
                } else {
                    this.value_ = operativeEventRequest;
                }
                this.valueCase_ = 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOperativeEvent() {
                if (this.valueCase_ == 4) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasDiagnosticEventRequest() {
                return this.valueCase_ == 5;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest() {
                if (this.valueCase_ == 5) {
                    return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.value_;
                }
                return gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.getDefaultInstance();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDiagnosticEventRequest(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                diagnosticEventRequest.getClass();
                this.value_ = diagnosticEventRequest;
                this.valueCase_ = 5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeDiagnosticEventRequest(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                diagnosticEventRequest.getClass();
                if (this.valueCase_ == 5 && this.value_ != gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.getDefaultInstance()) {
                    this.value_ = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.newBuilder((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.value_).mergeFrom(diagnosticEventRequest).buildPartial();
                } else {
                    this.value_ = diagnosticEventRequest;
                }
                this.valueCase_ = 5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDiagnosticEventRequest() {
                if (this.valueCase_ == 5) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasAdPlayerConfigRequest() {
                return this.valueCase_ == 6;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest() {
                if (this.valueCase_ == 6) {
                    return (gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.value_;
                }
                return gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.getDefaultInstance();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdPlayerConfigRequest(gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                adPlayerConfigRequest.getClass();
                this.value_ = adPlayerConfigRequest;
                this.valueCase_ = 6;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAdPlayerConfigRequest(gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                adPlayerConfigRequest.getClass();
                if (this.valueCase_ == 6 && this.value_ != gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.getDefaultInstance()) {
                    this.value_ = gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.newBuilder((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.value_).mergeFrom(adPlayerConfigRequest).buildPartial();
                } else {
                    this.value_ = adPlayerConfigRequest;
                }
                this.valueCase_ = 6;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdPlayerConfigRequest() {
                if (this.valueCase_ == 6) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasGetTokenEventRequest() {
                return this.valueCase_ == 7;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest() {
                if (this.valueCase_ == 7) {
                    return (gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) this.value_;
                }
                return gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.getDefaultInstance();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGetTokenEventRequest(gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                getTokenEventRequest.getClass();
                this.value_ = getTokenEventRequest;
                this.valueCase_ = 7;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeGetTokenEventRequest(gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                getTokenEventRequest.getClass();
                if (this.valueCase_ == 7 && this.value_ != gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.getDefaultInstance()) {
                    this.value_ = gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.newBuilder((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) this.value_).mergeFrom(getTokenEventRequest).buildPartial();
                } else {
                    this.value_ = getTokenEventRequest;
                }
                this.valueCase_ = 7;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearGetTokenEventRequest() {
                if (this.valueCase_ == 7) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasPrivacyUpdateRequest() {
                return this.valueCase_ == 8;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest() {
                if (this.valueCase_ == 8) {
                    return (gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) this.value_;
                }
                return gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.getDefaultInstance();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPrivacyUpdateRequest(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                privacyUpdateRequest.getClass();
                this.value_ = privacyUpdateRequest;
                this.valueCase_ = 8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergePrivacyUpdateRequest(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                privacyUpdateRequest.getClass();
                if (this.valueCase_ == 8 && this.value_ != gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.getDefaultInstance()) {
                    this.value_ = gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder((gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) this.value_).mergeFrom(privacyUpdateRequest).buildPartial();
                } else {
                    this.value_ = privacyUpdateRequest;
                }
                this.valueCase_ = 8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPrivacyUpdateRequest() {
                if (this.valueCase_ == 8) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasAdDataRefreshRequest() {
                return this.valueCase_ == 9;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest() {
                if (this.valueCase_ == 9) {
                    return (gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.value_;
                }
                return gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.getDefaultInstance();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdDataRefreshRequest(gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                adDataRefreshRequest.getClass();
                this.value_ = adDataRefreshRequest;
                this.valueCase_ = 9;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAdDataRefreshRequest(gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                adDataRefreshRequest.getClass();
                if (this.valueCase_ == 9 && this.value_ != gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.getDefaultInstance()) {
                    this.value_ = gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.newBuilder((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.value_).mergeFrom(adDataRefreshRequest).buildPartial();
                } else {
                    this.value_ = adDataRefreshRequest;
                }
                this.valueCase_ = 9;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdDataRefreshRequest() {
                if (this.valueCase_ == 9) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasInitializationCompletedEventRequest() {
                return this.valueCase_ == 10;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                if (this.valueCase_ == 10) {
                    return (gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest) this.value_;
                }
                return gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getDefaultInstance();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInitializationCompletedEventRequest(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                initializationCompletedEventRequest.getClass();
                this.value_ = initializationCompletedEventRequest;
                this.valueCase_ = 10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeInitializationCompletedEventRequest(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                initializationCompletedEventRequest.getClass();
                if (this.valueCase_ == 10 && this.value_ != gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getDefaultInstance()) {
                    this.value_ = gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder((gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest) this.value_).mergeFrom(initializationCompletedEventRequest).buildPartial();
                } else {
                    this.value_ = initializationCompletedEventRequest;
                }
                this.valueCase_ = 10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInitializationCompletedEventRequest() {
                if (this.valueCase_ == 10) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasTransactionEventRequest() {
                return this.valueCase_ == 11;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest() {
                if (this.valueCase_ == 11) {
                    return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.value_;
                }
                return gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.getDefaultInstance();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTransactionEventRequest(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                transactionEventRequest.getClass();
                this.value_ = transactionEventRequest;
                this.valueCase_ = 11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeTransactionEventRequest(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                transactionEventRequest.getClass();
                if (this.valueCase_ == 11 && this.value_ != gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.getDefaultInstance()) {
                    this.value_ = gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.value_).mergeFrom(transactionEventRequest).buildPartial();
                } else {
                    this.value_ = transactionEventRequest;
                }
                this.valueCase_ = 11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTransactionEventRequest() {
                if (this.valueCase_ == 11) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload) {
                return DEFAULT_INSTANCE.createBuilder(payload);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder> implements gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder {
                /* synthetic */ Builder(gatewayprotocol.v1.UniversalRequestOuterClass.AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    super(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.DEFAULT_INSTANCE);
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase getValueCase() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).getValueCase();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearValue() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).clearValue();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasInitializationRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).hasInitializationRequest();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).getInitializationRequest();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setInitializationRequest(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setInitializationRequest(initializationRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setInitializationRequest(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setInitializationRequest(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeInitializationRequest(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).mergeInitializationRequest(initializationRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearInitializationRequest() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).clearInitializationRequest();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasAdRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).hasAdRequest();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public gatewayprotocol.v1.AdRequestOuterClass.AdRequest getAdRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).getAdRequest();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setAdRequest(gatewayprotocol.v1.AdRequestOuterClass.AdRequest adRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setAdRequest(adRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setAdRequest(gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setAdRequest(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeAdRequest(gatewayprotocol.v1.AdRequestOuterClass.AdRequest adRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).mergeAdRequest(adRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearAdRequest() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).clearAdRequest();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasOperativeEvent() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).hasOperativeEvent();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).getOperativeEvent();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setOperativeEvent(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setOperativeEvent(operativeEventRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setOperativeEvent(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setOperativeEvent(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeOperativeEvent(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).mergeOperativeEvent(operativeEventRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearOperativeEvent() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).clearOperativeEvent();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasDiagnosticEventRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).hasDiagnosticEventRequest();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).getDiagnosticEventRequest();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setDiagnosticEventRequest(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setDiagnosticEventRequest(diagnosticEventRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setDiagnosticEventRequest(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setDiagnosticEventRequest(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeDiagnosticEventRequest(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).mergeDiagnosticEventRequest(diagnosticEventRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearDiagnosticEventRequest() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).clearDiagnosticEventRequest();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasAdPlayerConfigRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).hasAdPlayerConfigRequest();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).getAdPlayerConfigRequest();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setAdPlayerConfigRequest(gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setAdPlayerConfigRequest(adPlayerConfigRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setAdPlayerConfigRequest(gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setAdPlayerConfigRequest(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeAdPlayerConfigRequest(gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).mergeAdPlayerConfigRequest(adPlayerConfigRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearAdPlayerConfigRequest() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).clearAdPlayerConfigRequest();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasGetTokenEventRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).hasGetTokenEventRequest();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).getGetTokenEventRequest();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setGetTokenEventRequest(gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setGetTokenEventRequest(getTokenEventRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setGetTokenEventRequest(gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setGetTokenEventRequest(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeGetTokenEventRequest(gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).mergeGetTokenEventRequest(getTokenEventRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearGetTokenEventRequest() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).clearGetTokenEventRequest();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasPrivacyUpdateRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).hasPrivacyUpdateRequest();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).getPrivacyUpdateRequest();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setPrivacyUpdateRequest(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setPrivacyUpdateRequest(privacyUpdateRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setPrivacyUpdateRequest(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setPrivacyUpdateRequest(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergePrivacyUpdateRequest(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).mergePrivacyUpdateRequest(privacyUpdateRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearPrivacyUpdateRequest() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).clearPrivacyUpdateRequest();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasAdDataRefreshRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).hasAdDataRefreshRequest();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).getAdDataRefreshRequest();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setAdDataRefreshRequest(gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setAdDataRefreshRequest(adDataRefreshRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setAdDataRefreshRequest(gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setAdDataRefreshRequest(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeAdDataRefreshRequest(gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).mergeAdDataRefreshRequest(adDataRefreshRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearAdDataRefreshRequest() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).clearAdDataRefreshRequest();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasInitializationCompletedEventRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).hasInitializationCompletedEventRequest();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).getInitializationCompletedEventRequest();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setInitializationCompletedEventRequest(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setInitializationCompletedEventRequest(initializationCompletedEventRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setInitializationCompletedEventRequest(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setInitializationCompletedEventRequest(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeInitializationCompletedEventRequest(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).mergeInitializationCompletedEventRequest(initializationCompletedEventRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearInitializationCompletedEventRequest() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).clearInitializationCompletedEventRequest();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasTransactionEventRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).hasTransactionEventRequest();
                }

                @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest() {
                    return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).getTransactionEventRequest();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setTransactionEventRequest(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setTransactionEventRequest(transactionEventRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setTransactionEventRequest(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).setTransactionEventRequest(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeTransactionEventRequest(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).mergeTransactionEventRequest(transactionEventRequest);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearTransactionEventRequest() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) this.instance).clearTransactionEventRequest();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                gatewayprotocol.v1.UniversalRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
                switch (gatewayprotocol.v1.UniversalRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload();
                    case 2:
                        return new gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder(anonymousClass1);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0002\u000b\n\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", new java.lang.Object[]{"value_", "valueCase_", gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.class, gatewayprotocol.v1.AdRequestOuterClass.AdRequest.class, gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.class, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.class, gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.class, gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.class, gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.class, gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.class, gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.class, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload> defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.class) {
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
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload = new gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload();
                DEFAULT_INSTANCE = payload;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.class, payload);
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequestOrBuilder
        public boolean hasSharedData() {
            return this.sharedData_ != null;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequestOrBuilder
        public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this.sharedData_;
            return sharedData == null ? gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.getDefaultInstance() : sharedData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSharedData(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            sharedData.getClass();
            this.sharedData_ = sharedData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSharedData(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            sharedData.getClass();
            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData2 = this.sharedData_;
            if (sharedData2 != null && sharedData2 != gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.getDefaultInstance()) {
                this.sharedData_ = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder(this.sharedData_).mergeFrom(sharedData).buildPartial();
            } else {
                this.sharedData_ = sharedData;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSharedData() {
            this.sharedData_ = null;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequestOrBuilder
        public boolean hasPayload() {
            return this.payload_ != null;
        }

        @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequestOrBuilder
        public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload getPayload() {
            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload = this.payload_;
            return payload == null ? gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.getDefaultInstance() : payload;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayload(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload) {
            payload.getClass();
            this.payload_ = payload;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePayload(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload) {
            payload.getClass();
            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload2 = this.payload_;
            if (payload2 != null && payload2 != gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.getDefaultInstance()) {
                this.payload_ = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder(this.payload_).mergeFrom(payload).buildPartial();
            } else {
                this.payload_ = payload;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayload() {
            this.payload_ = null;
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder newBuilder(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest) {
            return DEFAULT_INSTANCE.createBuilder(universalRequest);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder> implements gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequestOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.UniversalRequestOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequestOrBuilder
            public boolean hasSharedData() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) this.instance).hasSharedData();
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequestOrBuilder
            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) this.instance).getSharedData();
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder setSharedData(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) this.instance).setSharedData(sharedData);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder setSharedData(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) this.instance).setSharedData(builder.build());
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder mergeSharedData(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) this.instance).mergeSharedData(sharedData);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder clearSharedData() {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) this.instance).clearSharedData();
                return this;
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequestOrBuilder
            public boolean hasPayload() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) this.instance).hasPayload();
            }

            @Override // gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequestOrBuilder
            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload getPayload() {
                return ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) this.instance).getPayload();
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder setPayload(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) this.instance).setPayload(payload);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder setPayload(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) this.instance).setPayload(builder.build());
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder mergePayload(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload) {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) this.instance).mergePayload(payload);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder clearPayload() {
                copyOnWrite();
                ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) this.instance).clearPayload();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.UniversalRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.UniversalRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest();
                case 2:
                    return new gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new java.lang.Object[]{"sharedData_", "payload_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.class) {
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
            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest = new gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest();
            DEFAULT_INSTANCE = universalRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.class, universalRequest);
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
