package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class ClientInfoOuterClass {

    public interface ClientInfoOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getCustomMediationName();

        com.google.protobuf.ByteString getCustomMediationNameBytes();

        java.lang.String getGameId();

        com.google.protobuf.ByteString getGameIdBytes();

        gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider getMediationProvider();

        int getMediationProviderValue();

        java.lang.String getMediationVersion();

        com.google.protobuf.ByteString getMediationVersionBytes();

        java.lang.String getOmidPartnerVersion();

        com.google.protobuf.ByteString getOmidPartnerVersionBytes();

        java.lang.String getOmidVersion();

        com.google.protobuf.ByteString getOmidVersionBytes();

        gatewayprotocol.v1.ClientInfoOuterClass.Platform getPlatform();

        int getPlatformValue();

        java.lang.String getScarVersionName();

        com.google.protobuf.ByteString getScarVersionNameBytes();

        java.lang.String getSdkDevelopmentPlatform();

        com.google.protobuf.ByteString getSdkDevelopmentPlatformBytes();

        int getSdkVersion();

        java.lang.String getSdkVersionName();

        com.google.protobuf.ByteString getSdkVersionNameBytes();

        boolean getTest();

        boolean hasCustomMediationName();

        boolean hasMediationVersion();

        boolean hasOmidPartnerVersion();

        boolean hasOmidVersion();

        boolean hasScarVersionName();

        boolean hasSdkDevelopmentPlatform();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private ClientInfoOuterClass() {
    }

    public enum Platform implements com.google.protobuf.Internal.EnumLite {
        PLATFORM_UNSPECIFIED(0),
        PLATFORM_ANDROID(1),
        PLATFORM_IOS(2),
        UNRECOGNIZED(-1);

        public static final int PLATFORM_ANDROID_VALUE = 1;
        public static final int PLATFORM_IOS_VALUE = 2;
        public static final int PLATFORM_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.ClientInfoOuterClass.Platform> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.ClientInfoOuterClass.Platform>() { // from class: gatewayprotocol.v1.ClientInfoOuterClass.Platform.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.ClientInfoOuterClass.Platform findValueByNumber(int i) {
                return gatewayprotocol.v1.ClientInfoOuterClass.Platform.forNumber(i);
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
        public static gatewayprotocol.v1.ClientInfoOuterClass.Platform valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.ClientInfoOuterClass.Platform forNumber(int i) {
            if (i == 0) {
                return PLATFORM_UNSPECIFIED;
            }
            if (i == 1) {
                return PLATFORM_ANDROID;
            }
            if (i != 2) {
                return null;
            }
            return PLATFORM_IOS;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.ClientInfoOuterClass.Platform> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.ClientInfoOuterClass.Platform.PlatformVerifier.INSTANCE;
        }

        private static final class PlatformVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.ClientInfoOuterClass.Platform.PlatformVerifier();

            private PlatformVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.ClientInfoOuterClass.Platform.forNumber(i) != null;
            }
        }

        Platform(int i) {
            this.value = i;
        }
    }

    public enum MediationProvider implements com.google.protobuf.Internal.EnumLite {
        MEDIATION_PROVIDER_UNSPECIFIED(0),
        MEDIATION_PROVIDER_CUSTOM(1),
        MEDIATION_PROVIDER_ADMOB(2),
        MEDIATION_PROVIDER_MAX(3),
        MEDIATION_PROVIDER_LEVELPLAY(4),
        UNRECOGNIZED(-1);

        public static final int MEDIATION_PROVIDER_ADMOB_VALUE = 2;
        public static final int MEDIATION_PROVIDER_CUSTOM_VALUE = 1;
        public static final int MEDIATION_PROVIDER_LEVELPLAY_VALUE = 4;
        public static final int MEDIATION_PROVIDER_MAX_VALUE = 3;
        public static final int MEDIATION_PROVIDER_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider>() { // from class: gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider findValueByNumber(int i) {
                return gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.forNumber(i);
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
        public static gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider forNumber(int i) {
            if (i == 0) {
                return MEDIATION_PROVIDER_UNSPECIFIED;
            }
            if (i == 1) {
                return MEDIATION_PROVIDER_CUSTOM;
            }
            if (i == 2) {
                return MEDIATION_PROVIDER_ADMOB;
            }
            if (i == 3) {
                return MEDIATION_PROVIDER_MAX;
            }
            if (i != 4) {
                return null;
            }
            return MEDIATION_PROVIDER_LEVELPLAY;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.MediationProviderVerifier.INSTANCE;
        }

        private static final class MediationProviderVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.MediationProviderVerifier();

            private MediationProviderVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.forNumber(i) != null;
            }
        }

        MediationProvider(int i) {
            this.value = i;
        }
    }

    public static final class ClientInfo extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo, gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder> implements gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder {
        public static final int CUSTOM_MEDIATION_NAME_FIELD_NUMBER = 7;
        private static final gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo DEFAULT_INSTANCE;
        public static final int GAME_ID_FIELD_NUMBER = 3;
        public static final int MEDIATION_PROVIDER_FIELD_NUMBER = 6;
        public static final int MEDIATION_VERSION_FIELD_NUMBER = 8;
        public static final int OMID_PARTNER_VERSION_FIELD_NUMBER = 9;
        public static final int OMID_VERSION_FIELD_NUMBER = 10;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo> PARSER = null;
        public static final int PLATFORM_FIELD_NUMBER = 5;
        public static final int SCAR_VERSION_NAME_FIELD_NUMBER = 12;
        public static final int SDK_DEVELOPMENT_PLATFORM_FIELD_NUMBER = 11;
        public static final int SDK_VERSION_FIELD_NUMBER = 1;
        public static final int SDK_VERSION_NAME_FIELD_NUMBER = 2;
        public static final int TEST_FIELD_NUMBER = 4;
        private int bitField0_;
        private int mediationProvider_;
        private int platform_;
        private int sdkVersion_;
        private boolean test_;
        private java.lang.String sdkVersionName_ = "";
        private java.lang.String gameId_ = "";
        private java.lang.String customMediationName_ = "";
        private java.lang.String mediationVersion_ = "";
        private java.lang.String omidPartnerVersion_ = "";
        private java.lang.String omidVersion_ = "";
        private java.lang.String sdkDevelopmentPlatform_ = "";
        private java.lang.String scarVersionName_ = "";

        private ClientInfo() {
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
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

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public java.lang.String getSdkVersionName() {
            return this.sdkVersionName_;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
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

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public java.lang.String getGameId() {
            return this.gameId_;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
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

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public boolean getTest() {
            return this.test_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTest(boolean z) {
            this.test_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTest() {
            this.test_ = false;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public int getPlatformValue() {
            return this.platform_;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
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

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public int getMediationProviderValue() {
            return this.mediationProvider_;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
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

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public boolean hasCustomMediationName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public java.lang.String getCustomMediationName() {
            return this.customMediationName_;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
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

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public boolean hasMediationVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public java.lang.String getMediationVersion() {
            return this.mediationVersion_;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
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

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public boolean hasOmidPartnerVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public java.lang.String getOmidPartnerVersion() {
            return this.omidPartnerVersion_;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public com.google.protobuf.ByteString getOmidPartnerVersionBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.omidPartnerVersion_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOmidPartnerVersion(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.omidPartnerVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOmidPartnerVersion() {
            this.bitField0_ &= -5;
            this.omidPartnerVersion_ = getDefaultInstance().getOmidPartnerVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOmidPartnerVersionBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.omidPartnerVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public boolean hasOmidVersion() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public java.lang.String getOmidVersion() {
            return this.omidVersion_;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public com.google.protobuf.ByteString getOmidVersionBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.omidVersion_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOmidVersion(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.omidVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOmidVersion() {
            this.bitField0_ &= -9;
            this.omidVersion_ = getDefaultInstance().getOmidVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOmidVersionBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.omidVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 8;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public boolean hasSdkDevelopmentPlatform() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public java.lang.String getSdkDevelopmentPlatform() {
            return this.sdkDevelopmentPlatform_;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public com.google.protobuf.ByteString getSdkDevelopmentPlatformBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.sdkDevelopmentPlatform_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdkDevelopmentPlatform(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.sdkDevelopmentPlatform_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSdkDevelopmentPlatform() {
            this.bitField0_ &= -17;
            this.sdkDevelopmentPlatform_ = getDefaultInstance().getSdkDevelopmentPlatform();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdkDevelopmentPlatformBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.sdkDevelopmentPlatform_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public boolean hasScarVersionName() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public java.lang.String getScarVersionName() {
            return this.scarVersionName_;
        }

        @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
        public com.google.protobuf.ByteString getScarVersionNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.scarVersionName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScarVersionName(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.scarVersionName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScarVersionName() {
            this.bitField0_ &= -33;
            this.scarVersionName_ = getDefaultInstance().getScarVersionName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScarVersionNameBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.scarVersionName_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        public static gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder newBuilder(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo clientInfo) {
            return DEFAULT_INSTANCE.createBuilder(clientInfo);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo, gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder> implements gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.ClientInfoOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public int getSdkVersion() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getSdkVersion();
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setSdkVersion(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setSdkVersion(i);
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder clearSdkVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).clearSdkVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public java.lang.String getSdkVersionName() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getSdkVersionName();
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public com.google.protobuf.ByteString getSdkVersionNameBytes() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getSdkVersionNameBytes();
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setSdkVersionName(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setSdkVersionName(str);
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder clearSdkVersionName() {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).clearSdkVersionName();
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setSdkVersionNameBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setSdkVersionNameBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public java.lang.String getGameId() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getGameId();
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public com.google.protobuf.ByteString getGameIdBytes() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getGameIdBytes();
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setGameId(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setGameId(str);
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder clearGameId() {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).clearGameId();
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setGameIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setGameIdBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public boolean getTest() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getTest();
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setTest(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setTest(z);
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder clearTest() {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).clearTest();
                return this;
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public int getPlatformValue() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getPlatformValue();
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setPlatformValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setPlatformValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public gatewayprotocol.v1.ClientInfoOuterClass.Platform getPlatform() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getPlatform();
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setPlatform(gatewayprotocol.v1.ClientInfoOuterClass.Platform platform) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setPlatform(platform);
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder clearPlatform() {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).clearPlatform();
                return this;
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public int getMediationProviderValue() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getMediationProviderValue();
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setMediationProviderValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setMediationProviderValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider getMediationProvider() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getMediationProvider();
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setMediationProvider(gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider mediationProvider) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setMediationProvider(mediationProvider);
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder clearMediationProvider() {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).clearMediationProvider();
                return this;
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public boolean hasCustomMediationName() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).hasCustomMediationName();
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public java.lang.String getCustomMediationName() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getCustomMediationName();
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public com.google.protobuf.ByteString getCustomMediationNameBytes() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getCustomMediationNameBytes();
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setCustomMediationName(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setCustomMediationName(str);
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder clearCustomMediationName() {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).clearCustomMediationName();
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setCustomMediationNameBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setCustomMediationNameBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public boolean hasMediationVersion() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).hasMediationVersion();
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public java.lang.String getMediationVersion() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getMediationVersion();
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public com.google.protobuf.ByteString getMediationVersionBytes() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getMediationVersionBytes();
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setMediationVersion(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setMediationVersion(str);
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder clearMediationVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).clearMediationVersion();
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setMediationVersionBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setMediationVersionBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public boolean hasOmidPartnerVersion() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).hasOmidPartnerVersion();
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public java.lang.String getOmidPartnerVersion() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getOmidPartnerVersion();
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public com.google.protobuf.ByteString getOmidPartnerVersionBytes() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getOmidPartnerVersionBytes();
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setOmidPartnerVersion(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setOmidPartnerVersion(str);
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder clearOmidPartnerVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).clearOmidPartnerVersion();
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setOmidPartnerVersionBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setOmidPartnerVersionBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public boolean hasOmidVersion() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).hasOmidVersion();
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public java.lang.String getOmidVersion() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getOmidVersion();
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public com.google.protobuf.ByteString getOmidVersionBytes() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getOmidVersionBytes();
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setOmidVersion(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setOmidVersion(str);
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder clearOmidVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).clearOmidVersion();
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setOmidVersionBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setOmidVersionBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public boolean hasSdkDevelopmentPlatform() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).hasSdkDevelopmentPlatform();
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public java.lang.String getSdkDevelopmentPlatform() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getSdkDevelopmentPlatform();
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public com.google.protobuf.ByteString getSdkDevelopmentPlatformBytes() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getSdkDevelopmentPlatformBytes();
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setSdkDevelopmentPlatform(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setSdkDevelopmentPlatform(str);
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder clearSdkDevelopmentPlatform() {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).clearSdkDevelopmentPlatform();
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setSdkDevelopmentPlatformBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setSdkDevelopmentPlatformBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public boolean hasScarVersionName() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).hasScarVersionName();
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public java.lang.String getScarVersionName() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getScarVersionName();
            }

            @Override // gatewayprotocol.v1.ClientInfoOuterClass.ClientInfoOrBuilder
            public com.google.protobuf.ByteString getScarVersionNameBytes() {
                return ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).getScarVersionNameBytes();
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setScarVersionName(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setScarVersionName(str);
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder clearScarVersionName() {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).clearScarVersionName();
                return this;
            }

            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder setScarVersionNameBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) this.instance).setScarVersionNameBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.ClientInfoOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.ClientInfoOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo();
                case 2:
                    return new gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005\f\u0006\f\u0007ለ\u0000\bለ\u0001\tለ\u0002\nለ\u0003\u000bለ\u0004\fለ\u0005", new java.lang.Object[]{"bitField0_", "sdkVersion_", "sdkVersionName_", "gameId_", "test_", "platform_", "mediationProvider_", "customMediationName_", "mediationVersion_", "omidPartnerVersion_", "omidVersion_", "sdkDevelopmentPlatform_", "scarVersionName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.class) {
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
            gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo clientInfo = new gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo();
            DEFAULT_INSTANCE = clientInfo;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.class, clientInfo);
        }

        public static gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.ClientInfoOuterClass$1, reason: invalid class name */
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
