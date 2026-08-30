package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class InitializationRequestOuterClass {

    public interface InitializationDeviceInfoOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        double getBatteryLevel();

        int getBatteryStatus();

        java.lang.String getBundleId();

        com.google.protobuf.ByteString getBundleIdBytes();

        java.lang.String getConnectionType();

        com.google.protobuf.ByteString getConnectionTypeBytes();

        long getCurrentUiTheme();

        java.lang.String getDeviceMake();

        com.google.protobuf.ByteString getDeviceMakeBytes();

        java.lang.String getDeviceModel();

        com.google.protobuf.ByteString getDeviceModelBytes();

        java.lang.String getHashedDeviceName();

        com.google.protobuf.ByteString getHashedDeviceNameBytes();

        java.lang.String getLanguage();

        com.google.protobuf.ByteString getLanguageBytes();

        java.lang.String getLocalList();

        com.google.protobuf.ByteString getLocalListBytes();

        java.lang.String getNetworkOperator();

        com.google.protobuf.ByteString getNetworkOperatorBytes();

        java.lang.String getOsVersion();

        com.google.protobuf.ByteString getOsVersionBytes();

        long getSystemBootTime();

        long getTotalDiskSpace();

        long getTotalRamMemory();

        int getTrackingAuthStatus();

        boolean hasTrackingAuthStatus();
    }

    public interface InitializationRequestOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getAnalyticsUserId();

        com.google.protobuf.ByteString getAnalyticsUserIdBytes();

        com.google.protobuf.ByteString getAuid();

        java.lang.String getAuidString();

        com.google.protobuf.ByteString getAuidStringBytes();

        com.google.protobuf.ByteString getCache();

        gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo getClientInfo();

        gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfo();

        java.lang.String getIdfi();

        com.google.protobuf.ByteString getIdfiBytes();

        boolean getIsFirstInit();

        java.lang.String getLegacyFlowUserConsent();

        com.google.protobuf.ByteString getLegacyFlowUserConsentBytes();

        com.google.protobuf.ByteString getPrivacy();

        com.google.protobuf.ByteString getSessionId();

        boolean hasAnalyticsUserId();

        boolean hasAuid();

        boolean hasAuidString();

        boolean hasCache();

        boolean hasClientInfo();

        boolean hasDeviceInfo();

        boolean hasLegacyFlowUserConsent();

        boolean hasPrivacy();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private InitializationRequestOuterClass() {
    }

    public static final class InitializationDeviceInfo extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo, gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder> implements gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder {
        public static final int BATTERY_LEVEL_FIELD_NUMBER = 11;
        public static final int BATTERY_STATUS_FIELD_NUMBER = 12;
        public static final int BUNDLE_ID_FIELD_NUMBER = 1;
        public static final int CONNECTION_TYPE_FIELD_NUMBER = 16;
        public static final int CURRENT_UI_THEME_FIELD_NUMBER = 9;
        private static final gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo DEFAULT_INSTANCE;
        public static final int DEVICE_MAKE_FIELD_NUMBER = 2;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 3;
        public static final int HASHED_DEVICE_NAME_FIELD_NUMBER = 8;
        public static final int LANGUAGE_FIELD_NUMBER = 14;
        public static final int LOCAL_LIST_FIELD_NUMBER = 15;
        public static final int NETWORK_OPERATOR_FIELD_NUMBER = 10;
        public static final int OS_VERSION_FIELD_NUMBER = 4;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo> PARSER = null;
        public static final int SYSTEM_BOOT_TIME_FIELD_NUMBER = 13;
        public static final int TOTAL_DISK_SPACE_FIELD_NUMBER = 6;
        public static final int TOTAL_RAM_MEMORY_FIELD_NUMBER = 7;
        public static final int TRACKING_AUTH_STATUS_FIELD_NUMBER = 5;
        private double batteryLevel_;
        private int batteryStatus_;
        private int bitField0_;
        private long currentUiTheme_;
        private long systemBootTime_;
        private long totalDiskSpace_;
        private long totalRamMemory_;
        private int trackingAuthStatus_;
        private java.lang.String bundleId_ = "";
        private java.lang.String deviceMake_ = "";
        private java.lang.String deviceModel_ = "";
        private java.lang.String osVersion_ = "";
        private java.lang.String hashedDeviceName_ = "";
        private java.lang.String networkOperator_ = "";
        private java.lang.String language_ = "";
        private java.lang.String localList_ = "";
        private java.lang.String connectionType_ = "";

        private InitializationDeviceInfo() {
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public java.lang.String getBundleId() {
            return this.bundleId_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getBundleIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.bundleId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBundleId(java.lang.String str) {
            str.getClass();
            this.bundleId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBundleId() {
            this.bundleId_ = getDefaultInstance().getBundleId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBundleIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.bundleId_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public java.lang.String getDeviceMake() {
            return this.deviceMake_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
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

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public java.lang.String getDeviceModel() {
            return this.deviceModel_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
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

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public java.lang.String getOsVersion() {
            return this.osVersion_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
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

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public boolean hasTrackingAuthStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public int getTrackingAuthStatus() {
            return this.trackingAuthStatus_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackingAuthStatus(int i) {
            this.bitField0_ |= 1;
            this.trackingAuthStatus_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackingAuthStatus() {
            this.bitField0_ &= -2;
            this.trackingAuthStatus_ = 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public long getTotalDiskSpace() {
            return this.totalDiskSpace_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalDiskSpace(long j) {
            this.totalDiskSpace_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalDiskSpace() {
            this.totalDiskSpace_ = 0L;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public long getTotalRamMemory() {
            return this.totalRamMemory_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalRamMemory(long j) {
            this.totalRamMemory_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalRamMemory() {
            this.totalRamMemory_ = 0L;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public java.lang.String getHashedDeviceName() {
            return this.hashedDeviceName_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getHashedDeviceNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.hashedDeviceName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHashedDeviceName(java.lang.String str) {
            str.getClass();
            this.hashedDeviceName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHashedDeviceName() {
            this.hashedDeviceName_ = getDefaultInstance().getHashedDeviceName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHashedDeviceNameBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.hashedDeviceName_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public long getCurrentUiTheme() {
            return this.currentUiTheme_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentUiTheme(long j) {
            this.currentUiTheme_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentUiTheme() {
            this.currentUiTheme_ = 0L;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public java.lang.String getNetworkOperator() {
            return this.networkOperator_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getNetworkOperatorBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.networkOperator_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkOperator(java.lang.String str) {
            str.getClass();
            this.networkOperator_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkOperator() {
            this.networkOperator_ = getDefaultInstance().getNetworkOperator();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkOperatorBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.networkOperator_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public double getBatteryLevel() {
            return this.batteryLevel_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatteryLevel(double d) {
            this.batteryLevel_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatteryLevel() {
            this.batteryLevel_ = 0.0d;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public int getBatteryStatus() {
            return this.batteryStatus_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatteryStatus(int i) {
            this.batteryStatus_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatteryStatus() {
            this.batteryStatus_ = 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public long getSystemBootTime() {
            return this.systemBootTime_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSystemBootTime(long j) {
            this.systemBootTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSystemBootTime() {
            this.systemBootTime_ = 0L;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public java.lang.String getLanguage() {
            return this.language_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getLanguageBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.language_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguage(java.lang.String str) {
            str.getClass();
            this.language_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLanguage() {
            this.language_ = getDefaultInstance().getLanguage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguageBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.language_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public java.lang.String getLocalList() {
            return this.localList_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getLocalListBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.localList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocalList(java.lang.String str) {
            str.getClass();
            this.localList_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocalList() {
            this.localList_ = getDefaultInstance().getLocalList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocalListBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.localList_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public java.lang.String getConnectionType() {
            return this.connectionType_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getConnectionTypeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.connectionType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionType(java.lang.String str) {
            str.getClass();
            this.connectionType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionType() {
            this.connectionType_ = getDefaultInstance().getConnectionType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.connectionType_ = byteString.toStringUtf8();
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder newBuilder(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo) {
            return DEFAULT_INSTANCE.createBuilder(initializationDeviceInfo);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo, gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder> implements gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.InitializationRequestOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public java.lang.String getBundleId() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getBundleId();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getBundleIdBytes() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getBundleIdBytes();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setBundleId(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setBundleId(str);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder clearBundleId() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).clearBundleId();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setBundleIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setBundleIdBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public java.lang.String getDeviceMake() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getDeviceMake();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getDeviceMakeBytes() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getDeviceMakeBytes();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setDeviceMake(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setDeviceMake(str);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder clearDeviceMake() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).clearDeviceMake();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setDeviceMakeBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setDeviceMakeBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public java.lang.String getDeviceModel() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getDeviceModel();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getDeviceModelBytes() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getDeviceModelBytes();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setDeviceModel(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setDeviceModel(str);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder clearDeviceModel() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).clearDeviceModel();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setDeviceModelBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setDeviceModelBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public java.lang.String getOsVersion() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getOsVersion();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getOsVersionBytes() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getOsVersionBytes();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setOsVersion(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setOsVersion(str);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder clearOsVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).clearOsVersion();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setOsVersionBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setOsVersionBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public boolean hasTrackingAuthStatus() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).hasTrackingAuthStatus();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public int getTrackingAuthStatus() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getTrackingAuthStatus();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setTrackingAuthStatus(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setTrackingAuthStatus(i);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder clearTrackingAuthStatus() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).clearTrackingAuthStatus();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public long getTotalDiskSpace() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getTotalDiskSpace();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setTotalDiskSpace(long j) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setTotalDiskSpace(j);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder clearTotalDiskSpace() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).clearTotalDiskSpace();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public long getTotalRamMemory() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getTotalRamMemory();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setTotalRamMemory(long j) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setTotalRamMemory(j);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder clearTotalRamMemory() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).clearTotalRamMemory();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public java.lang.String getHashedDeviceName() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getHashedDeviceName();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getHashedDeviceNameBytes() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getHashedDeviceNameBytes();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setHashedDeviceName(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setHashedDeviceName(str);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder clearHashedDeviceName() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).clearHashedDeviceName();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setHashedDeviceNameBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setHashedDeviceNameBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public long getCurrentUiTheme() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getCurrentUiTheme();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setCurrentUiTheme(long j) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setCurrentUiTheme(j);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder clearCurrentUiTheme() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).clearCurrentUiTheme();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public java.lang.String getNetworkOperator() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getNetworkOperator();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getNetworkOperatorBytes() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getNetworkOperatorBytes();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setNetworkOperator(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setNetworkOperator(str);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder clearNetworkOperator() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).clearNetworkOperator();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setNetworkOperatorBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setNetworkOperatorBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public double getBatteryLevel() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getBatteryLevel();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setBatteryLevel(double d) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setBatteryLevel(d);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder clearBatteryLevel() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).clearBatteryLevel();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public int getBatteryStatus() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getBatteryStatus();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setBatteryStatus(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setBatteryStatus(i);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder clearBatteryStatus() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).clearBatteryStatus();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public long getSystemBootTime() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getSystemBootTime();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setSystemBootTime(long j) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setSystemBootTime(j);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder clearSystemBootTime() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).clearSystemBootTime();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public java.lang.String getLanguage() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getLanguage();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getLanguageBytes() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getLanguageBytes();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setLanguage(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setLanguage(str);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder clearLanguage() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).clearLanguage();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setLanguageBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setLanguageBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public java.lang.String getLocalList() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getLocalList();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getLocalListBytes() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getLocalListBytes();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setLocalList(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setLocalList(str);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder clearLocalList() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).clearLocalList();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setLocalListBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setLocalListBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public java.lang.String getConnectionType() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getConnectionType();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getConnectionTypeBytes() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).getConnectionTypeBytes();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setConnectionType(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setConnectionType(str);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder clearConnectionType() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).clearConnectionType();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder setConnectionTypeBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo) this.instance).setConnectionTypeBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.InitializationRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.InitializationRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo();
                case 2:
                    return new gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005င\u0000\u0006\u0002\u0007\u0002\bȈ\t\u0002\nȈ\u000b\u0000\f\u0004\r\u0002\u000eȈ\u000fȈ\u0010Ȉ", new java.lang.Object[]{"bitField0_", "bundleId_", "deviceMake_", "deviceModel_", "osVersion_", "trackingAuthStatus_", "totalDiskSpace_", "totalRamMemory_", "hashedDeviceName_", "currentUiTheme_", "networkOperator_", "batteryLevel_", "batteryStatus_", "systemBootTime_", "language_", "localList_", "connectionType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.class) {
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
            gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo = new gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo();
            DEFAULT_INSTANCE = initializationDeviceInfo;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.class, initializationDeviceInfo);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.InitializationRequestOuterClass$1, reason: invalid class name */
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

    public static final class InitializationRequest extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest, gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder> implements gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder {
        public static final int ANALYTICS_USER_ID_FIELD_NUMBER = 8;
        public static final int AUID_FIELD_NUMBER = 7;
        public static final int AUID_STRING_FIELD_NUMBER = 11;
        public static final int CACHE_FIELD_NUMBER = 5;
        public static final int CLIENT_INFO_FIELD_NUMBER = 1;
        private static final gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest DEFAULT_INSTANCE;
        public static final int DEVICE_INFO_FIELD_NUMBER = 9;
        public static final int IDFI_FIELD_NUMBER = 3;
        public static final int IS_FIRST_INIT_FIELD_NUMBER = 10;
        public static final int LEGACY_FLOW_USER_CONSENT_FIELD_NUMBER = 6;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest> PARSER = null;
        public static final int PRIVACY_FIELD_NUMBER = 2;
        public static final int SESSION_ID_FIELD_NUMBER = 4;
        private int bitField0_;
        private gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo clientInfo_;
        private gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo deviceInfo_;
        private boolean isFirstInit_;
        private com.google.protobuf.ByteString privacy_ = com.google.protobuf.ByteString.EMPTY;
        private java.lang.String idfi_ = "";
        private com.google.protobuf.ByteString sessionId_ = com.google.protobuf.ByteString.EMPTY;
        private com.google.protobuf.ByteString cache_ = com.google.protobuf.ByteString.EMPTY;
        private java.lang.String legacyFlowUserConsent_ = "";
        private com.google.protobuf.ByteString auid_ = com.google.protobuf.ByteString.EMPTY;
        private java.lang.String analyticsUserId_ = "";
        private java.lang.String auidString_ = "";

        private InitializationRequest() {
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasClientInfo() {
            return this.clientInfo_ != null;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo getClientInfo() {
            gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo clientInfo = this.clientInfo_;
            return clientInfo == null ? gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.getDefaultInstance() : clientInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo clientInfo) {
            clientInfo.getClass();
            this.clientInfo_ = clientInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo clientInfo) {
            clientInfo.getClass();
            gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo clientInfo2 = this.clientInfo_;
            if (clientInfo2 != null && clientInfo2 != gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.getDefaultInstance()) {
                this.clientInfo_ = gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.newBuilder(this.clientInfo_).mergeFrom(clientInfo).buildPartial();
            } else {
                this.clientInfo_ = clientInfo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientInfo() {
            this.clientInfo_ = null;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasPrivacy() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public com.google.protobuf.ByteString getPrivacy() {
            return this.privacy_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrivacy(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 1;
            this.privacy_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrivacy() {
            this.bitField0_ &= -2;
            this.privacy_ = getDefaultInstance().getPrivacy();
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public java.lang.String getIdfi() {
            return this.idfi_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
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

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public com.google.protobuf.ByteString getSessionId() {
            return this.sessionId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.sessionId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasCache() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public com.google.protobuf.ByteString getCache() {
            return this.cache_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCache(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 2;
            this.cache_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCache() {
            this.bitField0_ &= -3;
            this.cache_ = getDefaultInstance().getCache();
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasLegacyFlowUserConsent() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public java.lang.String getLegacyFlowUserConsent() {
            return this.legacyFlowUserConsent_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public com.google.protobuf.ByteString getLegacyFlowUserConsentBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.legacyFlowUserConsent_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLegacyFlowUserConsent(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.legacyFlowUserConsent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLegacyFlowUserConsent() {
            this.bitField0_ &= -5;
            this.legacyFlowUserConsent_ = getDefaultInstance().getLegacyFlowUserConsent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLegacyFlowUserConsentBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.legacyFlowUserConsent_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasAuid() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public com.google.protobuf.ByteString getAuid() {
            return this.auid_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuid(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 8;
            this.auid_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuid() {
            this.bitField0_ &= -9;
            this.auid_ = getDefaultInstance().getAuid();
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasAnalyticsUserId() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public java.lang.String getAnalyticsUserId() {
            return this.analyticsUserId_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public com.google.protobuf.ByteString getAnalyticsUserIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.analyticsUserId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnalyticsUserId(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.analyticsUserId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnalyticsUserId() {
            this.bitField0_ &= -17;
            this.analyticsUserId_ = getDefaultInstance().getAnalyticsUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnalyticsUserIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.analyticsUserId_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasDeviceInfo() {
            return this.deviceInfo_ != null;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfo() {
            gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo = this.deviceInfo_;
            return initializationDeviceInfo == null ? gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.getDefaultInstance() : initializationDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceInfo(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.getClass();
            this.deviceInfo_ = initializationDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDeviceInfo(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.getClass();
            gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo2 = this.deviceInfo_;
            if (initializationDeviceInfo2 != null && initializationDeviceInfo2 != gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.getDefaultInstance()) {
                this.deviceInfo_ = gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder(this.deviceInfo_).mergeFrom(initializationDeviceInfo).buildPartial();
            } else {
                this.deviceInfo_ = initializationDeviceInfo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceInfo() {
            this.deviceInfo_ = null;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean getIsFirstInit() {
            return this.isFirstInit_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsFirstInit(boolean z) {
            this.isFirstInit_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsFirstInit() {
            this.isFirstInit_ = false;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public boolean hasAuidString() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public java.lang.String getAuidString() {
            return this.auidString_;
        }

        @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
        public com.google.protobuf.ByteString getAuidStringBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.auidString_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuidString(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.auidString_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuidString() {
            this.bitField0_ &= -33;
            this.auidString_ = getDefaultInstance().getAuidString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuidStringBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.auidString_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder newBuilder(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest initializationRequest) {
            return DEFAULT_INSTANCE.createBuilder(initializationRequest);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest, gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder> implements gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.InitializationRequestOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasClientInfo() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).hasClientInfo();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo getClientInfo() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).getClientInfo();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo clientInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).setClientInfo(clientInfo);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).setClientInfo(builder.build());
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder mergeClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo clientInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).mergeClientInfo(clientInfo);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearClientInfo() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).clearClientInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasPrivacy() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).hasPrivacy();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public com.google.protobuf.ByteString getPrivacy() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).getPrivacy();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setPrivacy(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).setPrivacy(byteString);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearPrivacy() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).clearPrivacy();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public java.lang.String getIdfi() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).getIdfi();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public com.google.protobuf.ByteString getIdfiBytes() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).getIdfiBytes();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setIdfi(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).setIdfi(str);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearIdfi() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).clearIdfi();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setIdfiBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).setIdfiBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public com.google.protobuf.ByteString getSessionId() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).getSessionId();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setSessionId(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).setSessionId(byteString);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearSessionId() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).clearSessionId();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasCache() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).hasCache();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public com.google.protobuf.ByteString getCache() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).getCache();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setCache(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).setCache(byteString);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearCache() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).clearCache();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasLegacyFlowUserConsent() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).hasLegacyFlowUserConsent();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public java.lang.String getLegacyFlowUserConsent() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).getLegacyFlowUserConsent();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public com.google.protobuf.ByteString getLegacyFlowUserConsentBytes() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).getLegacyFlowUserConsentBytes();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setLegacyFlowUserConsent(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).setLegacyFlowUserConsent(str);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearLegacyFlowUserConsent() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).clearLegacyFlowUserConsent();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setLegacyFlowUserConsentBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).setLegacyFlowUserConsentBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasAuid() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).hasAuid();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public com.google.protobuf.ByteString getAuid() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).getAuid();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setAuid(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).setAuid(byteString);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearAuid() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).clearAuid();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasAnalyticsUserId() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).hasAnalyticsUserId();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public java.lang.String getAnalyticsUserId() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).getAnalyticsUserId();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public com.google.protobuf.ByteString getAnalyticsUserIdBytes() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).getAnalyticsUserIdBytes();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setAnalyticsUserId(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).setAnalyticsUserId(str);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearAnalyticsUserId() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).clearAnalyticsUserId();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setAnalyticsUserIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).setAnalyticsUserIdBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasDeviceInfo() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).hasDeviceInfo();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfo() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).getDeviceInfo();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setDeviceInfo(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).setDeviceInfo(initializationDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setDeviceInfo(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).setDeviceInfo(builder.build());
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder mergeDeviceInfo(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).mergeDeviceInfo(initializationDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearDeviceInfo() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).clearDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean getIsFirstInit() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).getIsFirstInit();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setIsFirstInit(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).setIsFirstInit(z);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearIsFirstInit() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).clearIsFirstInit();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public boolean hasAuidString() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).hasAuidString();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public java.lang.String getAuidString() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).getAuidString();
            }

            @Override // gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequestOrBuilder
            public com.google.protobuf.ByteString getAuidStringBytes() {
                return ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).getAuidStringBytes();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setAuidString(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).setAuidString(str);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearAuidString() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).clearAuidString();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setAuidStringBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) this.instance).setAuidStringBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.InitializationRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.InitializationRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest();
                case 2:
                    return new gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\t\u0002ည\u0000\u0003Ȉ\u0004\n\u0005ည\u0001\u0006ለ\u0002\u0007ည\u0003\bለ\u0004\t\t\n\u0007\u000bለ\u0005", new java.lang.Object[]{"bitField0_", "clientInfo_", "privacy_", "idfi_", "sessionId_", "cache_", "legacyFlowUserConsent_", "auid_", "analyticsUserId_", "deviceInfo_", "isFirstInit_", "auidString_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.class) {
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
            gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest initializationRequest = new gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest();
            DEFAULT_INSTANCE = initializationRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.class, initializationRequest);
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
