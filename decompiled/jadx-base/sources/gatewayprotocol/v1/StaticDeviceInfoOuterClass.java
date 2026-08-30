package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class StaticDeviceInfoOuterClass {

    public interface StaticDeviceInfoOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroid();

        boolean getAppDebuggable();

        java.lang.String getBundleId();

        com.google.protobuf.ByteString getBundleIdBytes();

        java.lang.String getBundleVersion();

        com.google.protobuf.ByteString getBundleVersionBytes();

        long getCpuCount();

        java.lang.String getCpuModel();

        com.google.protobuf.ByteString getCpuModelBytes();

        java.lang.String getDeviceMake();

        com.google.protobuf.ByteString getDeviceMakeBytes();

        java.lang.String getDeviceModel();

        com.google.protobuf.ByteString getDeviceModelBytes();

        java.lang.String getGpuModel();

        com.google.protobuf.ByteString getGpuModelBytes();

        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIos();

        java.lang.String getOsVersion();

        com.google.protobuf.ByteString getOsVersionBytes();

        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase getPlatformSpecificCase();

        boolean getRooted();

        int getScreenDensity();

        int getScreenHeight();

        int getScreenSize();

        int getScreenWidth();

        java.lang.String getStores(int i);

        com.google.protobuf.ByteString getStoresBytes(int i);

        int getStoresCount();

        java.util.List<java.lang.String> getStoresList();

        long getTotalDiskSpace();

        long getTotalRamMemory();

        java.lang.String getWebviewUa();

        com.google.protobuf.ByteString getWebviewUaBytes();

        boolean hasAndroid();

        boolean hasAppDebuggable();

        boolean hasBundleId();

        boolean hasBundleVersion();

        boolean hasCpuCount();

        boolean hasCpuModel();

        boolean hasDeviceMake();

        boolean hasDeviceModel();

        boolean hasGpuModel();

        boolean hasIos();

        boolean hasOsVersion();

        boolean hasRooted();

        boolean hasScreenDensity();

        boolean hasScreenHeight();

        boolean hasScreenSize();

        boolean hasScreenWidth();

        boolean hasTotalDiskSpace();

        boolean hasTotalRamMemory();

        boolean hasWebviewUa();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private StaticDeviceInfoOuterClass() {
    }

    public static final class StaticDeviceInfo extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo, gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder> implements gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder {
        public static final int ANDROID_FIELD_NUMBER = 19;
        public static final int APP_DEBUGGABLE_FIELD_NUMBER = 3;
        public static final int BUNDLE_ID_FIELD_NUMBER = 1;
        public static final int BUNDLE_VERSION_FIELD_NUMBER = 2;
        public static final int CPU_COUNT_FIELD_NUMBER = 17;
        public static final int CPU_MODEL_FIELD_NUMBER = 16;
        private static final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo DEFAULT_INSTANCE;
        public static final int DEVICE_MAKE_FIELD_NUMBER = 6;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 7;
        public static final int GPU_MODEL_FIELD_NUMBER = 18;
        public static final int IOS_FIELD_NUMBER = 20;
        public static final int OS_VERSION_FIELD_NUMBER = 5;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo> PARSER = null;
        public static final int ROOTED_FIELD_NUMBER = 4;
        public static final int SCREEN_DENSITY_FIELD_NUMBER = 9;
        public static final int SCREEN_HEIGHT_FIELD_NUMBER = 11;
        public static final int SCREEN_SIZE_FIELD_NUMBER = 12;
        public static final int SCREEN_WIDTH_FIELD_NUMBER = 10;
        public static final int STORES_FIELD_NUMBER = 13;
        public static final int TOTAL_DISK_SPACE_FIELD_NUMBER = 14;
        public static final int TOTAL_RAM_MEMORY_FIELD_NUMBER = 15;
        public static final int WEBVIEW_UA_FIELD_NUMBER = 8;
        private boolean appDebuggable_;
        private int bitField0_;
        private long cpuCount_;
        private java.lang.Object platformSpecific_;
        private boolean rooted_;
        private int screenDensity_;
        private int screenHeight_;
        private int screenSize_;
        private int screenWidth_;
        private long totalDiskSpace_;
        private long totalRamMemory_;
        private int platformSpecificCase_ = 0;
        private java.lang.String bundleId_ = "";
        private java.lang.String bundleVersion_ = "";
        private java.lang.String osVersion_ = "";
        private java.lang.String deviceMake_ = "";
        private java.lang.String deviceModel_ = "";
        private java.lang.String webviewUa_ = "";
        private com.google.protobuf.Internal.ProtobufList<java.lang.String> stores_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        private java.lang.String cpuModel_ = "";
        private java.lang.String gpuModel_ = "";

        public interface AndroidOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            java.lang.String getAndroidFingerprint();

            com.google.protobuf.ByteString getAndroidFingerprintBytes();

            int getApiLevel();

            java.lang.String getApkDeveloperSigningCertificateHash();

            com.google.protobuf.ByteString getApkDeveloperSigningCertificateHashBytes();

            java.lang.String getAppInstaller();

            com.google.protobuf.ByteString getAppInstallerBytes();

            java.lang.String getBuildBoard();

            com.google.protobuf.ByteString getBuildBoardBytes();

            java.lang.String getBuildBootloader();

            com.google.protobuf.ByteString getBuildBootloaderBytes();

            java.lang.String getBuildBrand();

            com.google.protobuf.ByteString getBuildBrandBytes();

            java.lang.String getBuildDevice();

            com.google.protobuf.ByteString getBuildDeviceBytes();

            java.lang.String getBuildDisplay();

            com.google.protobuf.ByteString getBuildDisplayBytes();

            java.lang.String getBuildFingerprint();

            com.google.protobuf.ByteString getBuildFingerprintBytes();

            java.lang.String getBuildHardware();

            com.google.protobuf.ByteString getBuildHardwareBytes();

            java.lang.String getBuildHost();

            com.google.protobuf.ByteString getBuildHostBytes();

            java.lang.String getBuildId();

            com.google.protobuf.ByteString getBuildIdBytes();

            java.lang.String getBuildProduct();

            com.google.protobuf.ByteString getBuildProductBytes();

            int getExtensionVersion();

            int getPhoneType();

            java.lang.String getSimOperator();

            com.google.protobuf.ByteString getSimOperatorBytes();

            int getVersionCode();

            boolean hasAndroidFingerprint();

            boolean hasApiLevel();

            boolean hasApkDeveloperSigningCertificateHash();

            boolean hasAppInstaller();

            boolean hasBuildBoard();

            boolean hasBuildBootloader();

            boolean hasBuildBrand();

            boolean hasBuildDevice();

            boolean hasBuildDisplay();

            boolean hasBuildFingerprint();

            boolean hasBuildHardware();

            boolean hasBuildHost();

            boolean hasBuildId();

            boolean hasBuildProduct();

            boolean hasExtensionVersion();

            boolean hasPhoneType();

            boolean hasSimOperator();

            boolean hasVersionCode();
        }

        public interface IosOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            java.lang.String getBuiltSdkVersion();

            com.google.protobuf.ByteString getBuiltSdkVersionBytes();

            boolean getCanMakePayments();

            int getScreenScale();

            boolean getSimulator();

            java.lang.String getSkadnetworkId(int i);

            com.google.protobuf.ByteString getSkadnetworkIdBytes(int i);

            int getSkadnetworkIdCount();

            java.util.List<java.lang.String> getSkadnetworkIdList();

            long getSystemBootTime();

            java.lang.String getXcodeBuildVersion();

            com.google.protobuf.ByteString getXcodeBuildVersionBytes();

            java.lang.String getXcodeSdkBuildVersion();

            com.google.protobuf.ByteString getXcodeSdkBuildVersionBytes();

            java.lang.String getXcodeVersion();

            com.google.protobuf.ByteString getXcodeVersionBytes();

            boolean hasBuiltSdkVersion();

            boolean hasCanMakePayments();

            boolean hasScreenScale();

            boolean hasSimulator();

            boolean hasSystemBootTime();

            boolean hasXcodeBuildVersion();

            boolean hasXcodeSdkBuildVersion();

            boolean hasXcodeVersion();
        }

        private StaticDeviceInfo() {
        }

        public static final class Android extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android, gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder> implements gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder {
            public static final int ANDROID_FINGERPRINT_FIELD_NUMBER = 3;
            public static final int API_LEVEL_FIELD_NUMBER = 1;
            public static final int APK_DEVELOPER_SIGNING_CERTIFICATE_HASH_FIELD_NUMBER = 5;
            public static final int APP_INSTALLER_FIELD_NUMBER = 4;
            public static final int BUILD_BOARD_FIELD_NUMBER = 6;
            public static final int BUILD_BOOTLOADER_FIELD_NUMBER = 13;
            public static final int BUILD_BRAND_FIELD_NUMBER = 7;
            public static final int BUILD_DEVICE_FIELD_NUMBER = 8;
            public static final int BUILD_DISPLAY_FIELD_NUMBER = 9;
            public static final int BUILD_FINGERPRINT_FIELD_NUMBER = 10;
            public static final int BUILD_HARDWARE_FIELD_NUMBER = 11;
            public static final int BUILD_HOST_FIELD_NUMBER = 12;
            public static final int BUILD_ID_FIELD_NUMBER = 15;
            public static final int BUILD_PRODUCT_FIELD_NUMBER = 14;
            private static final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android DEFAULT_INSTANCE;
            public static final int EXTENSION_VERSION_FIELD_NUMBER = 16;
            private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android> PARSER = null;
            public static final int PHONE_TYPE_FIELD_NUMBER = 17;
            public static final int SIM_OPERATOR_FIELD_NUMBER = 18;
            public static final int VERSION_CODE_FIELD_NUMBER = 2;
            private int apiLevel_;
            private int bitField0_;
            private int extensionVersion_;
            private int phoneType_;
            private int versionCode_;
            private java.lang.String androidFingerprint_ = "";
            private java.lang.String appInstaller_ = "";
            private java.lang.String apkDeveloperSigningCertificateHash_ = "";
            private java.lang.String buildBoard_ = "";
            private java.lang.String buildBrand_ = "";
            private java.lang.String buildDevice_ = "";
            private java.lang.String buildDisplay_ = "";
            private java.lang.String buildFingerprint_ = "";
            private java.lang.String buildHardware_ = "";
            private java.lang.String buildHost_ = "";
            private java.lang.String buildBootloader_ = "";
            private java.lang.String buildProduct_ = "";
            private java.lang.String buildId_ = "";
            private java.lang.String simOperator_ = "";

            private Android() {
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasApiLevel() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public int getApiLevel() {
                return this.apiLevel_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setApiLevel(int i) {
                this.bitField0_ |= 1;
                this.apiLevel_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearApiLevel() {
                this.bitField0_ &= -2;
                this.apiLevel_ = 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasVersionCode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public int getVersionCode() {
                return this.versionCode_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVersionCode(int i) {
                this.bitField0_ |= 2;
                this.versionCode_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVersionCode() {
                this.bitField0_ &= -3;
                this.versionCode_ = 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasAndroidFingerprint() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public java.lang.String getAndroidFingerprint() {
                return this.androidFingerprint_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public com.google.protobuf.ByteString getAndroidFingerprintBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.androidFingerprint_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAndroidFingerprint(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.androidFingerprint_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAndroidFingerprint() {
                this.bitField0_ &= -5;
                this.androidFingerprint_ = getDefaultInstance().getAndroidFingerprint();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAndroidFingerprintBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.androidFingerprint_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasAppInstaller() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public java.lang.String getAppInstaller() {
                return this.appInstaller_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public com.google.protobuf.ByteString getAppInstallerBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.appInstaller_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAppInstaller(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.appInstaller_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAppInstaller() {
                this.bitField0_ &= -9;
                this.appInstaller_ = getDefaultInstance().getAppInstaller();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAppInstallerBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.appInstaller_ = byteString.toStringUtf8();
                this.bitField0_ |= 8;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasApkDeveloperSigningCertificateHash() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public java.lang.String getApkDeveloperSigningCertificateHash() {
                return this.apkDeveloperSigningCertificateHash_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public com.google.protobuf.ByteString getApkDeveloperSigningCertificateHashBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.apkDeveloperSigningCertificateHash_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setApkDeveloperSigningCertificateHash(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.apkDeveloperSigningCertificateHash_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearApkDeveloperSigningCertificateHash() {
                this.bitField0_ &= -17;
                this.apkDeveloperSigningCertificateHash_ = getDefaultInstance().getApkDeveloperSigningCertificateHash();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setApkDeveloperSigningCertificateHashBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.apkDeveloperSigningCertificateHash_ = byteString.toStringUtf8();
                this.bitField0_ |= 16;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildBoard() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public java.lang.String getBuildBoard() {
                return this.buildBoard_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public com.google.protobuf.ByteString getBuildBoardBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.buildBoard_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildBoard(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 32;
                this.buildBoard_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildBoard() {
                this.bitField0_ &= -33;
                this.buildBoard_ = getDefaultInstance().getBuildBoard();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildBoardBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildBoard_ = byteString.toStringUtf8();
                this.bitField0_ |= 32;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildBrand() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public java.lang.String getBuildBrand() {
                return this.buildBrand_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public com.google.protobuf.ByteString getBuildBrandBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.buildBrand_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildBrand(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 64;
                this.buildBrand_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildBrand() {
                this.bitField0_ &= -65;
                this.buildBrand_ = getDefaultInstance().getBuildBrand();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildBrandBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildBrand_ = byteString.toStringUtf8();
                this.bitField0_ |= 64;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildDevice() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public java.lang.String getBuildDevice() {
                return this.buildDevice_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public com.google.protobuf.ByteString getBuildDeviceBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.buildDevice_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildDevice(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 128;
                this.buildDevice_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildDevice() {
                this.bitField0_ &= -129;
                this.buildDevice_ = getDefaultInstance().getBuildDevice();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildDeviceBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildDevice_ = byteString.toStringUtf8();
                this.bitField0_ |= 128;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildDisplay() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public java.lang.String getBuildDisplay() {
                return this.buildDisplay_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public com.google.protobuf.ByteString getBuildDisplayBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.buildDisplay_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildDisplay(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 256;
                this.buildDisplay_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildDisplay() {
                this.bitField0_ &= -257;
                this.buildDisplay_ = getDefaultInstance().getBuildDisplay();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildDisplayBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildDisplay_ = byteString.toStringUtf8();
                this.bitField0_ |= 256;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildFingerprint() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public java.lang.String getBuildFingerprint() {
                return this.buildFingerprint_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public com.google.protobuf.ByteString getBuildFingerprintBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.buildFingerprint_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildFingerprint(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 512;
                this.buildFingerprint_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildFingerprint() {
                this.bitField0_ &= -513;
                this.buildFingerprint_ = getDefaultInstance().getBuildFingerprint();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildFingerprintBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildFingerprint_ = byteString.toStringUtf8();
                this.bitField0_ |= 512;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildHardware() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public java.lang.String getBuildHardware() {
                return this.buildHardware_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public com.google.protobuf.ByteString getBuildHardwareBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.buildHardware_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildHardware(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 1024;
                this.buildHardware_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildHardware() {
                this.bitField0_ &= -1025;
                this.buildHardware_ = getDefaultInstance().getBuildHardware();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildHardwareBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildHardware_ = byteString.toStringUtf8();
                this.bitField0_ |= 1024;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildHost() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public java.lang.String getBuildHost() {
                return this.buildHost_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public com.google.protobuf.ByteString getBuildHostBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.buildHost_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildHost(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 2048;
                this.buildHost_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildHost() {
                this.bitField0_ &= -2049;
                this.buildHost_ = getDefaultInstance().getBuildHost();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildHostBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildHost_ = byteString.toStringUtf8();
                this.bitField0_ |= 2048;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildBootloader() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public java.lang.String getBuildBootloader() {
                return this.buildBootloader_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public com.google.protobuf.ByteString getBuildBootloaderBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.buildBootloader_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildBootloader(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 4096;
                this.buildBootloader_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildBootloader() {
                this.bitField0_ &= -4097;
                this.buildBootloader_ = getDefaultInstance().getBuildBootloader();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildBootloaderBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildBootloader_ = byteString.toStringUtf8();
                this.bitField0_ |= 4096;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildProduct() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public java.lang.String getBuildProduct() {
                return this.buildProduct_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public com.google.protobuf.ByteString getBuildProductBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.buildProduct_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildProduct(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 8192;
                this.buildProduct_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildProduct() {
                this.bitField0_ &= -8193;
                this.buildProduct_ = getDefaultInstance().getBuildProduct();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildProductBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildProduct_ = byteString.toStringUtf8();
                this.bitField0_ |= 8192;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildId() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public java.lang.String getBuildId() {
                return this.buildId_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public com.google.protobuf.ByteString getBuildIdBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.buildId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildId(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 16384;
                this.buildId_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildId() {
                this.bitField0_ &= -16385;
                this.buildId_ = getDefaultInstance().getBuildId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildIdBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildId_ = byteString.toStringUtf8();
                this.bitField0_ |= 16384;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasExtensionVersion() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public int getExtensionVersion() {
                return this.extensionVersion_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setExtensionVersion(int i) {
                this.bitField0_ |= 32768;
                this.extensionVersion_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearExtensionVersion() {
                this.bitField0_ &= -32769;
                this.extensionVersion_ = 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasPhoneType() {
                return (this.bitField0_ & 65536) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public int getPhoneType() {
                return this.phoneType_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPhoneType(int i) {
                this.bitField0_ |= 65536;
                this.phoneType_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPhoneType() {
                this.bitField0_ &= -65537;
                this.phoneType_ = 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasSimOperator() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public java.lang.String getSimOperator() {
                return this.simOperator_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public com.google.protobuf.ByteString getSimOperatorBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.simOperator_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSimOperator(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 131072;
                this.simOperator_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSimOperator() {
                this.bitField0_ &= -131073;
                this.simOperator_ = getDefaultInstance().getSimOperator();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSimOperatorBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.simOperator_ = byteString.toStringUtf8();
                this.bitField0_ |= 131072;
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder newBuilder(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2) {
                return DEFAULT_INSTANCE.createBuilder(android2);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android, gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder> implements gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder {
                /* synthetic */ Builder(gatewayprotocol.v1.StaticDeviceInfoOuterClass.AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    super(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.DEFAULT_INSTANCE);
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasApiLevel() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasApiLevel();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public int getApiLevel() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getApiLevel();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setApiLevel(int i) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setApiLevel(i);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearApiLevel() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearApiLevel();
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasVersionCode() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasVersionCode();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public int getVersionCode() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getVersionCode();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setVersionCode(int i) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setVersionCode(i);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearVersionCode() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearVersionCode();
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasAndroidFingerprint() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasAndroidFingerprint();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public java.lang.String getAndroidFingerprint() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getAndroidFingerprint();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public com.google.protobuf.ByteString getAndroidFingerprintBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getAndroidFingerprintBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setAndroidFingerprint(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setAndroidFingerprint(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearAndroidFingerprint() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearAndroidFingerprint();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setAndroidFingerprintBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setAndroidFingerprintBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasAppInstaller() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasAppInstaller();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public java.lang.String getAppInstaller() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getAppInstaller();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public com.google.protobuf.ByteString getAppInstallerBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getAppInstallerBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setAppInstaller(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setAppInstaller(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearAppInstaller() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearAppInstaller();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setAppInstallerBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setAppInstallerBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasApkDeveloperSigningCertificateHash() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasApkDeveloperSigningCertificateHash();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public java.lang.String getApkDeveloperSigningCertificateHash() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getApkDeveloperSigningCertificateHash();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public com.google.protobuf.ByteString getApkDeveloperSigningCertificateHashBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getApkDeveloperSigningCertificateHashBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setApkDeveloperSigningCertificateHash(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setApkDeveloperSigningCertificateHash(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearApkDeveloperSigningCertificateHash() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearApkDeveloperSigningCertificateHash();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setApkDeveloperSigningCertificateHashBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setApkDeveloperSigningCertificateHashBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildBoard() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasBuildBoard();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public java.lang.String getBuildBoard() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildBoard();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public com.google.protobuf.ByteString getBuildBoardBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildBoardBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildBoard(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildBoard(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearBuildBoard() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearBuildBoard();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildBoardBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildBoardBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildBrand() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasBuildBrand();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public java.lang.String getBuildBrand() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildBrand();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public com.google.protobuf.ByteString getBuildBrandBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildBrandBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildBrand(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildBrand(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearBuildBrand() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearBuildBrand();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildBrandBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildBrandBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildDevice() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasBuildDevice();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public java.lang.String getBuildDevice() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildDevice();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public com.google.protobuf.ByteString getBuildDeviceBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildDeviceBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildDevice(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildDevice(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearBuildDevice() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearBuildDevice();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildDeviceBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildDeviceBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildDisplay() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasBuildDisplay();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public java.lang.String getBuildDisplay() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildDisplay();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public com.google.protobuf.ByteString getBuildDisplayBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildDisplayBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildDisplay(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildDisplay(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearBuildDisplay() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearBuildDisplay();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildDisplayBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildDisplayBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildFingerprint() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasBuildFingerprint();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public java.lang.String getBuildFingerprint() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildFingerprint();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public com.google.protobuf.ByteString getBuildFingerprintBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildFingerprintBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildFingerprint(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildFingerprint(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearBuildFingerprint() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearBuildFingerprint();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildFingerprintBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildFingerprintBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildHardware() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasBuildHardware();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public java.lang.String getBuildHardware() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildHardware();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public com.google.protobuf.ByteString getBuildHardwareBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildHardwareBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildHardware(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildHardware(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearBuildHardware() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearBuildHardware();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildHardwareBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildHardwareBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildHost() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasBuildHost();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public java.lang.String getBuildHost() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildHost();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public com.google.protobuf.ByteString getBuildHostBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildHostBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildHost(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildHost(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearBuildHost() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearBuildHost();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildHostBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildHostBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildBootloader() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasBuildBootloader();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public java.lang.String getBuildBootloader() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildBootloader();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public com.google.protobuf.ByteString getBuildBootloaderBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildBootloaderBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildBootloader(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildBootloader(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearBuildBootloader() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearBuildBootloader();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildBootloaderBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildBootloaderBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildProduct() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasBuildProduct();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public java.lang.String getBuildProduct() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildProduct();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public com.google.protobuf.ByteString getBuildProductBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildProductBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildProduct(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildProduct(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearBuildProduct() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearBuildProduct();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildProductBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildProductBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildId() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasBuildId();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public java.lang.String getBuildId() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildId();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public com.google.protobuf.ByteString getBuildIdBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getBuildIdBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildId(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildId(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearBuildId() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearBuildId();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setBuildIdBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setBuildIdBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasExtensionVersion() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasExtensionVersion();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public int getExtensionVersion() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getExtensionVersion();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setExtensionVersion(int i) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setExtensionVersion(i);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearExtensionVersion() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearExtensionVersion();
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasPhoneType() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasPhoneType();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public int getPhoneType() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getPhoneType();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setPhoneType(int i) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setPhoneType(i);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearPhoneType() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearPhoneType();
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasSimOperator() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).hasSimOperator();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public java.lang.String getSimOperator() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getSimOperator();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public com.google.protobuf.ByteString getSimOperatorBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).getSimOperatorBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setSimOperator(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setSimOperator(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder clearSimOperator() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).clearSimOperator();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder setSimOperatorBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.instance).setSimOperatorBytes(byteString);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                gatewayprotocol.v1.StaticDeviceInfoOuterClass.AnonymousClass1 anonymousClass1 = null;
                switch (gatewayprotocol.v1.StaticDeviceInfoOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android();
                    case 2:
                        return new gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder(anonymousClass1);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\nለ\t\u000bለ\n\fለ\u000b\rለ\f\u000eለ\r\u000fለ\u000e\u0010ဋ\u000f\u0011င\u0010\u0012ለ\u0011", new java.lang.Object[]{"bitField0_", "apiLevel_", "versionCode_", "androidFingerprint_", "appInstaller_", "apkDeveloperSigningCertificateHash_", "buildBoard_", "buildBrand_", "buildDevice_", "buildDisplay_", "buildFingerprint_", "buildHardware_", "buildHost_", "buildBootloader_", "buildProduct_", "buildId_", "extensionVersion_", "phoneType_", "simOperator_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android> defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.class) {
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
                gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2 = new gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android();
                DEFAULT_INSTANCE = android2;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.class, android2);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Ios extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios, gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder> implements gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder {
            public static final int BUILT_SDK_VERSION_FIELD_NUMBER = 3;
            public static final int CAN_MAKE_PAYMENTS_FIELD_NUMBER = 6;
            private static final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios> PARSER = null;
            public static final int SCREEN_SCALE_FIELD_NUMBER = 5;
            public static final int SIMULATOR_FIELD_NUMBER = 2;
            public static final int SKADNETWORK_ID_FIELD_NUMBER = 4;
            public static final int SYSTEM_BOOT_TIME_FIELD_NUMBER = 1;
            public static final int XCODE_BUILD_VERSION_FIELD_NUMBER = 8;
            public static final int XCODE_SDK_BUILD_VERSION_FIELD_NUMBER = 9;
            public static final int XCODE_VERSION_FIELD_NUMBER = 7;
            private int bitField0_;
            private boolean canMakePayments_;
            private int screenScale_;
            private boolean simulator_;
            private long systemBootTime_;
            private java.lang.String builtSdkVersion_ = "";
            private com.google.protobuf.Internal.ProtobufList<java.lang.String> skadnetworkId_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private java.lang.String xcodeVersion_ = "";
            private java.lang.String xcodeBuildVersion_ = "";
            private java.lang.String xcodeSdkBuildVersion_ = "";

            private Ios() {
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public boolean hasSystemBootTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public long getSystemBootTime() {
                return this.systemBootTime_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSystemBootTime(long j) {
                this.bitField0_ |= 1;
                this.systemBootTime_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSystemBootTime() {
                this.bitField0_ &= -2;
                this.systemBootTime_ = 0L;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public boolean hasSimulator() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public boolean getSimulator() {
                return this.simulator_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSimulator(boolean z) {
                this.bitField0_ |= 2;
                this.simulator_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSimulator() {
                this.bitField0_ &= -3;
                this.simulator_ = false;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public boolean hasBuiltSdkVersion() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public java.lang.String getBuiltSdkVersion() {
                return this.builtSdkVersion_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public com.google.protobuf.ByteString getBuiltSdkVersionBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.builtSdkVersion_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuiltSdkVersion(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.builtSdkVersion_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuiltSdkVersion() {
                this.bitField0_ &= -5;
                this.builtSdkVersion_ = getDefaultInstance().getBuiltSdkVersion();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuiltSdkVersionBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.builtSdkVersion_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public java.util.List<java.lang.String> getSkadnetworkIdList() {
                return this.skadnetworkId_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public int getSkadnetworkIdCount() {
                return this.skadnetworkId_.size();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public java.lang.String getSkadnetworkId(int i) {
                return this.skadnetworkId_.get(i);
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public com.google.protobuf.ByteString getSkadnetworkIdBytes(int i) {
                return com.google.protobuf.ByteString.copyFromUtf8(this.skadnetworkId_.get(i));
            }

            private void ensureSkadnetworkIdIsMutable() {
                com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.skadnetworkId_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.skadnetworkId_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSkadnetworkId(int i, java.lang.String str) {
                str.getClass();
                ensureSkadnetworkIdIsMutable();
                this.skadnetworkId_.set(i, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addSkadnetworkId(java.lang.String str) {
                str.getClass();
                ensureSkadnetworkIdIsMutable();
                this.skadnetworkId_.add(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllSkadnetworkId(java.lang.Iterable<java.lang.String> iterable) {
                ensureSkadnetworkIdIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.skadnetworkId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSkadnetworkId() {
                this.skadnetworkId_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addSkadnetworkIdBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                ensureSkadnetworkIdIsMutable();
                this.skadnetworkId_.add(byteString.toStringUtf8());
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public boolean hasScreenScale() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public int getScreenScale() {
                return this.screenScale_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setScreenScale(int i) {
                this.bitField0_ |= 8;
                this.screenScale_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearScreenScale() {
                this.bitField0_ &= -9;
                this.screenScale_ = 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public boolean hasCanMakePayments() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public boolean getCanMakePayments() {
                return this.canMakePayments_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCanMakePayments(boolean z) {
                this.bitField0_ |= 16;
                this.canMakePayments_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCanMakePayments() {
                this.bitField0_ &= -17;
                this.canMakePayments_ = false;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public boolean hasXcodeVersion() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public java.lang.String getXcodeVersion() {
                return this.xcodeVersion_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public com.google.protobuf.ByteString getXcodeVersionBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.xcodeVersion_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setXcodeVersion(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 32;
                this.xcodeVersion_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearXcodeVersion() {
                this.bitField0_ &= -33;
                this.xcodeVersion_ = getDefaultInstance().getXcodeVersion();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setXcodeVersionBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.xcodeVersion_ = byteString.toStringUtf8();
                this.bitField0_ |= 32;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public boolean hasXcodeBuildVersion() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public java.lang.String getXcodeBuildVersion() {
                return this.xcodeBuildVersion_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public com.google.protobuf.ByteString getXcodeBuildVersionBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.xcodeBuildVersion_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setXcodeBuildVersion(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 64;
                this.xcodeBuildVersion_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearXcodeBuildVersion() {
                this.bitField0_ &= -65;
                this.xcodeBuildVersion_ = getDefaultInstance().getXcodeBuildVersion();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setXcodeBuildVersionBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.xcodeBuildVersion_ = byteString.toStringUtf8();
                this.bitField0_ |= 64;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public boolean hasXcodeSdkBuildVersion() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public java.lang.String getXcodeSdkBuildVersion() {
                return this.xcodeSdkBuildVersion_;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public com.google.protobuf.ByteString getXcodeSdkBuildVersionBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.xcodeSdkBuildVersion_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setXcodeSdkBuildVersion(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 128;
                this.xcodeSdkBuildVersion_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearXcodeSdkBuildVersion() {
                this.bitField0_ &= -129;
                this.xcodeSdkBuildVersion_ = getDefaultInstance().getXcodeSdkBuildVersion();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setXcodeSdkBuildVersionBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.xcodeSdkBuildVersion_ = byteString.toStringUtf8();
                this.bitField0_ |= 128;
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder newBuilder(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios) {
                return DEFAULT_INSTANCE.createBuilder(ios);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios, gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder> implements gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder {
                /* synthetic */ Builder(gatewayprotocol.v1.StaticDeviceInfoOuterClass.AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    super(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.DEFAULT_INSTANCE);
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public boolean hasSystemBootTime() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).hasSystemBootTime();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public long getSystemBootTime() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).getSystemBootTime();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setSystemBootTime(long j) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).setSystemBootTime(j);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearSystemBootTime() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).clearSystemBootTime();
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public boolean hasSimulator() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).hasSimulator();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public boolean getSimulator() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).getSimulator();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setSimulator(boolean z) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).setSimulator(z);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearSimulator() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).clearSimulator();
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public boolean hasBuiltSdkVersion() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).hasBuiltSdkVersion();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public java.lang.String getBuiltSdkVersion() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).getBuiltSdkVersion();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public com.google.protobuf.ByteString getBuiltSdkVersionBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).getBuiltSdkVersionBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setBuiltSdkVersion(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).setBuiltSdkVersion(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearBuiltSdkVersion() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).clearBuiltSdkVersion();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setBuiltSdkVersionBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).setBuiltSdkVersionBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public java.util.List<java.lang.String> getSkadnetworkIdList() {
                    return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).getSkadnetworkIdList());
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public int getSkadnetworkIdCount() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).getSkadnetworkIdCount();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public java.lang.String getSkadnetworkId(int i) {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).getSkadnetworkId(i);
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public com.google.protobuf.ByteString getSkadnetworkIdBytes(int i) {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).getSkadnetworkIdBytes(i);
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setSkadnetworkId(int i, java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).setSkadnetworkId(i, str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder addSkadnetworkId(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).addSkadnetworkId(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder addAllSkadnetworkId(java.lang.Iterable<java.lang.String> iterable) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).addAllSkadnetworkId(iterable);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearSkadnetworkId() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).clearSkadnetworkId();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder addSkadnetworkIdBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).addSkadnetworkIdBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public boolean hasScreenScale() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).hasScreenScale();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public int getScreenScale() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).getScreenScale();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setScreenScale(int i) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).setScreenScale(i);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearScreenScale() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).clearScreenScale();
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public boolean hasCanMakePayments() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).hasCanMakePayments();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public boolean getCanMakePayments() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).getCanMakePayments();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setCanMakePayments(boolean z) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).setCanMakePayments(z);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearCanMakePayments() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).clearCanMakePayments();
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public boolean hasXcodeVersion() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).hasXcodeVersion();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public java.lang.String getXcodeVersion() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).getXcodeVersion();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public com.google.protobuf.ByteString getXcodeVersionBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).getXcodeVersionBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setXcodeVersion(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).setXcodeVersion(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearXcodeVersion() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).clearXcodeVersion();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setXcodeVersionBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).setXcodeVersionBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public boolean hasXcodeBuildVersion() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).hasXcodeBuildVersion();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public java.lang.String getXcodeBuildVersion() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).getXcodeBuildVersion();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public com.google.protobuf.ByteString getXcodeBuildVersionBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).getXcodeBuildVersionBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setXcodeBuildVersion(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).setXcodeBuildVersion(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearXcodeBuildVersion() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).clearXcodeBuildVersion();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setXcodeBuildVersionBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).setXcodeBuildVersionBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public boolean hasXcodeSdkBuildVersion() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).hasXcodeSdkBuildVersion();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public java.lang.String getXcodeSdkBuildVersion() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).getXcodeSdkBuildVersion();
                }

                @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public com.google.protobuf.ByteString getXcodeSdkBuildVersionBytes() {
                    return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).getXcodeSdkBuildVersionBytes();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setXcodeSdkBuildVersion(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).setXcodeSdkBuildVersion(str);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearXcodeSdkBuildVersion() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).clearXcodeSdkBuildVersion();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setXcodeSdkBuildVersionBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.instance).setXcodeSdkBuildVersionBytes(byteString);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                gatewayprotocol.v1.StaticDeviceInfoOuterClass.AnonymousClass1 anonymousClass1 = null;
                switch (gatewayprotocol.v1.StaticDeviceInfoOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios();
                    case 2:
                        return new gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder(anonymousClass1);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ለ\u0002\u0004Ț\u0005ဋ\u0003\u0006ဇ\u0004\u0007ለ\u0005\bለ\u0006\tለ\u0007", new java.lang.Object[]{"bitField0_", "systemBootTime_", "simulator_", "builtSdkVersion_", "skadnetworkId_", "screenScale_", "canMakePayments_", "xcodeVersion_", "xcodeBuildVersion_", "xcodeSdkBuildVersion_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios> defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.class) {
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
                gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios = new gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios();
                DEFAULT_INSTANCE = ios;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.class, ios);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public enum PlatformSpecificCase {
            ANDROID(19),
            IOS(20),
            PLATFORMSPECIFIC_NOT_SET(0);

            private final int value;

            PlatformSpecificCase(int i) {
                this.value = i;
            }

            @java.lang.Deprecated
            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase valueOf(int i) {
                return forNumber(i);
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase forNumber(int i) {
                if (i == 0) {
                    return PLATFORMSPECIFIC_NOT_SET;
                }
                if (i == 19) {
                    return ANDROID;
                }
                if (i != 20) {
                    return null;
                }
                return IOS;
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            return gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase.forNumber(this.platformSpecificCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlatformSpecific() {
            this.platformSpecificCase_ = 0;
            this.platformSpecific_ = null;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasBundleId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public java.lang.String getBundleId() {
            return this.bundleId_;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getBundleIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.bundleId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBundleId(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.bundleId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBundleId() {
            this.bitField0_ &= -2;
            this.bundleId_ = getDefaultInstance().getBundleId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBundleIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.bundleId_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasBundleVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public java.lang.String getBundleVersion() {
            return this.bundleVersion_;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getBundleVersionBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.bundleVersion_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBundleVersion(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.bundleVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBundleVersion() {
            this.bitField0_ &= -3;
            this.bundleVersion_ = getDefaultInstance().getBundleVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBundleVersionBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.bundleVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasAppDebuggable() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean getAppDebuggable() {
            return this.appDebuggable_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppDebuggable(boolean z) {
            this.bitField0_ |= 4;
            this.appDebuggable_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppDebuggable() {
            this.bitField0_ &= -5;
            this.appDebuggable_ = false;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasRooted() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean getRooted() {
            return this.rooted_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRooted(boolean z) {
            this.bitField0_ |= 8;
            this.rooted_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRooted() {
            this.bitField0_ &= -9;
            this.rooted_ = false;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasOsVersion() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public java.lang.String getOsVersion() {
            return this.osVersion_;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getOsVersionBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.osVersion_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersion(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.osVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOsVersion() {
            this.bitField0_ &= -17;
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersionBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.osVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasDeviceMake() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public java.lang.String getDeviceMake() {
            return this.deviceMake_;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getDeviceMakeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.deviceMake_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceMake(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.deviceMake_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceMake() {
            this.bitField0_ &= -33;
            this.deviceMake_ = getDefaultInstance().getDeviceMake();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceMakeBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.deviceMake_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasDeviceModel() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public java.lang.String getDeviceModel() {
            return this.deviceModel_;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getDeviceModelBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.deviceModel_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModel(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.deviceModel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceModel() {
            this.bitField0_ &= -65;
            this.deviceModel_ = getDefaultInstance().getDeviceModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModelBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.deviceModel_ = byteString.toStringUtf8();
            this.bitField0_ |= 64;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasWebviewUa() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public java.lang.String getWebviewUa() {
            return this.webviewUa_;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getWebviewUaBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.webviewUa_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWebviewUa(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.webviewUa_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWebviewUa() {
            this.bitField0_ &= -129;
            this.webviewUa_ = getDefaultInstance().getWebviewUa();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWebviewUaBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.webviewUa_ = byteString.toStringUtf8();
            this.bitField0_ |= 128;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasScreenDensity() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public int getScreenDensity() {
            return this.screenDensity_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenDensity(int i) {
            this.bitField0_ |= 256;
            this.screenDensity_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenDensity() {
            this.bitField0_ &= -257;
            this.screenDensity_ = 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasScreenWidth() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public int getScreenWidth() {
            return this.screenWidth_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenWidth(int i) {
            this.bitField0_ |= 512;
            this.screenWidth_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenWidth() {
            this.bitField0_ &= -513;
            this.screenWidth_ = 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasScreenHeight() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public int getScreenHeight() {
            return this.screenHeight_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenHeight(int i) {
            this.bitField0_ |= 1024;
            this.screenHeight_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenHeight() {
            this.bitField0_ &= -1025;
            this.screenHeight_ = 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasScreenSize() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public int getScreenSize() {
            return this.screenSize_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenSize(int i) {
            this.bitField0_ |= 2048;
            this.screenSize_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenSize() {
            this.bitField0_ &= -2049;
            this.screenSize_ = 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public java.util.List<java.lang.String> getStoresList() {
            return this.stores_;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public int getStoresCount() {
            return this.stores_.size();
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public java.lang.String getStores(int i) {
            return this.stores_.get(i);
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getStoresBytes(int i) {
            return com.google.protobuf.ByteString.copyFromUtf8(this.stores_.get(i));
        }

        private void ensureStoresIsMutable() {
            com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.stores_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.stores_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStores(int i, java.lang.String str) {
            str.getClass();
            ensureStoresIsMutable();
            this.stores_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addStores(java.lang.String str) {
            str.getClass();
            ensureStoresIsMutable();
            this.stores_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllStores(java.lang.Iterable<java.lang.String> iterable) {
            ensureStoresIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.stores_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStores() {
            this.stores_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addStoresBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureStoresIsMutable();
            this.stores_.add(byteString.toStringUtf8());
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasTotalDiskSpace() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public long getTotalDiskSpace() {
            return this.totalDiskSpace_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalDiskSpace(long j) {
            this.bitField0_ |= 4096;
            this.totalDiskSpace_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalDiskSpace() {
            this.bitField0_ &= -4097;
            this.totalDiskSpace_ = 0L;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasTotalRamMemory() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public long getTotalRamMemory() {
            return this.totalRamMemory_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalRamMemory(long j) {
            this.bitField0_ |= 8192;
            this.totalRamMemory_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalRamMemory() {
            this.bitField0_ &= -8193;
            this.totalRamMemory_ = 0L;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasCpuModel() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public java.lang.String getCpuModel() {
            return this.cpuModel_;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getCpuModelBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.cpuModel_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCpuModel(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 16384;
            this.cpuModel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCpuModel() {
            this.bitField0_ &= -16385;
            this.cpuModel_ = getDefaultInstance().getCpuModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCpuModelBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.cpuModel_ = byteString.toStringUtf8();
            this.bitField0_ |= 16384;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasCpuCount() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public long getCpuCount() {
            return this.cpuCount_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCpuCount(long j) {
            this.bitField0_ |= 32768;
            this.cpuCount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCpuCount() {
            this.bitField0_ &= -32769;
            this.cpuCount_ = 0L;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasGpuModel() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public java.lang.String getGpuModel() {
            return this.gpuModel_;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getGpuModelBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.gpuModel_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGpuModel(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 65536;
            this.gpuModel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGpuModel() {
            this.bitField0_ &= -65537;
            this.gpuModel_ = getDefaultInstance().getGpuModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGpuModelBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.gpuModel_ = byteString.toStringUtf8();
            this.bitField0_ |= 65536;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasAndroid() {
            return this.platformSpecificCase_ == 19;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroid() {
            if (this.platformSpecificCase_ == 19) {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.platformSpecific_;
            }
            return gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAndroid(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2) {
            android2.getClass();
            this.platformSpecific_ = android2;
            this.platformSpecificCase_ = 19;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAndroid(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2) {
            android2.getClass();
            if (this.platformSpecificCase_ == 19 && this.platformSpecific_ != gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.getDefaultInstance()) {
                this.platformSpecific_ = gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android) this.platformSpecific_).mergeFrom(android2).buildPartial();
            } else {
                this.platformSpecific_ = android2;
            }
            this.platformSpecificCase_ = 19;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAndroid() {
            if (this.platformSpecificCase_ == 19) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasIos() {
            return this.platformSpecificCase_ == 20;
        }

        @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIos() {
            if (this.platformSpecificCase_ == 20) {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.platformSpecific_;
            }
            return gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIos(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios) {
            ios.getClass();
            this.platformSpecific_ = ios;
            this.platformSpecificCase_ = 20;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIos(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios) {
            ios.getClass();
            if (this.platformSpecificCase_ == 20 && this.platformSpecific_ != gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.getDefaultInstance()) {
                this.platformSpecific_ = gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.newBuilder((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios) this.platformSpecific_).mergeFrom(ios).buildPartial();
            } else {
                this.platformSpecific_ = ios;
            }
            this.platformSpecificCase_ = 20;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIos() {
            if (this.platformSpecificCase_ == 20) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder newBuilder(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            return DEFAULT_INSTANCE.createBuilder(staticDeviceInfo);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo, gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder> implements gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.StaticDeviceInfoOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getPlatformSpecificCase();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearPlatformSpecific() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearPlatformSpecific();
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasBundleId() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasBundleId();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public java.lang.String getBundleId() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getBundleId();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getBundleIdBytes() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getBundleIdBytes();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setBundleId(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setBundleId(str);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearBundleId() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearBundleId();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setBundleIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setBundleIdBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasBundleVersion() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasBundleVersion();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public java.lang.String getBundleVersion() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getBundleVersion();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getBundleVersionBytes() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getBundleVersionBytes();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setBundleVersion(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setBundleVersion(str);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearBundleVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearBundleVersion();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setBundleVersionBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setBundleVersionBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasAppDebuggable() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasAppDebuggable();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean getAppDebuggable() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getAppDebuggable();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setAppDebuggable(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setAppDebuggable(z);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearAppDebuggable() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearAppDebuggable();
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasRooted() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasRooted();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean getRooted() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getRooted();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setRooted(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setRooted(z);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearRooted() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearRooted();
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasOsVersion() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasOsVersion();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public java.lang.String getOsVersion() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getOsVersion();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getOsVersionBytes() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getOsVersionBytes();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setOsVersion(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setOsVersion(str);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearOsVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearOsVersion();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setOsVersionBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setOsVersionBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasDeviceMake() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasDeviceMake();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public java.lang.String getDeviceMake() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getDeviceMake();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getDeviceMakeBytes() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getDeviceMakeBytes();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setDeviceMake(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setDeviceMake(str);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearDeviceMake() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearDeviceMake();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setDeviceMakeBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setDeviceMakeBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasDeviceModel() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasDeviceModel();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public java.lang.String getDeviceModel() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getDeviceModel();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getDeviceModelBytes() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getDeviceModelBytes();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setDeviceModel(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setDeviceModel(str);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearDeviceModel() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearDeviceModel();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setDeviceModelBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setDeviceModelBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasWebviewUa() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasWebviewUa();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public java.lang.String getWebviewUa() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getWebviewUa();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getWebviewUaBytes() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getWebviewUaBytes();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setWebviewUa(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setWebviewUa(str);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearWebviewUa() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearWebviewUa();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setWebviewUaBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setWebviewUaBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasScreenDensity() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasScreenDensity();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public int getScreenDensity() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getScreenDensity();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setScreenDensity(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setScreenDensity(i);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearScreenDensity() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearScreenDensity();
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasScreenWidth() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasScreenWidth();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public int getScreenWidth() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getScreenWidth();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setScreenWidth(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setScreenWidth(i);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearScreenWidth() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearScreenWidth();
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasScreenHeight() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasScreenHeight();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public int getScreenHeight() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getScreenHeight();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setScreenHeight(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setScreenHeight(i);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearScreenHeight() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearScreenHeight();
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasScreenSize() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasScreenSize();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public int getScreenSize() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getScreenSize();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setScreenSize(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setScreenSize(i);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearScreenSize() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearScreenSize();
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public java.util.List<java.lang.String> getStoresList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getStoresList());
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public int getStoresCount() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getStoresCount();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public java.lang.String getStores(int i) {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getStores(i);
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getStoresBytes(int i) {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getStoresBytes(i);
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setStores(int i, java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setStores(i, str);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder addStores(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).addStores(str);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder addAllStores(java.lang.Iterable<java.lang.String> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).addAllStores(iterable);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearStores() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearStores();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder addStoresBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).addStoresBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasTotalDiskSpace() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasTotalDiskSpace();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public long getTotalDiskSpace() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getTotalDiskSpace();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setTotalDiskSpace(long j) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setTotalDiskSpace(j);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearTotalDiskSpace() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearTotalDiskSpace();
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasTotalRamMemory() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasTotalRamMemory();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public long getTotalRamMemory() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getTotalRamMemory();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setTotalRamMemory(long j) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setTotalRamMemory(j);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearTotalRamMemory() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearTotalRamMemory();
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasCpuModel() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasCpuModel();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public java.lang.String getCpuModel() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getCpuModel();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getCpuModelBytes() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getCpuModelBytes();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setCpuModel(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setCpuModel(str);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearCpuModel() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearCpuModel();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setCpuModelBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setCpuModelBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasCpuCount() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasCpuCount();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public long getCpuCount() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getCpuCount();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setCpuCount(long j) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setCpuCount(j);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearCpuCount() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearCpuCount();
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasGpuModel() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasGpuModel();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public java.lang.String getGpuModel() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getGpuModel();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getGpuModelBytes() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getGpuModelBytes();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setGpuModel(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setGpuModel(str);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearGpuModel() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearGpuModel();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setGpuModelBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setGpuModelBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasAndroid() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasAndroid();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroid() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getAndroid();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setAndroid(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setAndroid(android2);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setAndroid(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setAndroid(builder.build());
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder mergeAndroid(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).mergeAndroid(android2);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearAndroid() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearAndroid();
                return this;
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasIos() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).hasIos();
            }

            @Override // gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIos() {
                return ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).getIos();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setIos(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setIos(ios);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setIos(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).setIos(builder.build());
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder mergeIos(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios) {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).mergeIos(ios);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearIos() {
                copyOnWrite();
                ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) this.instance).clearIos();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.StaticDeviceInfoOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.StaticDeviceInfoOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo();
                case 2:
                    return new gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0001\u0001\u0001\u0014\u0014\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tဋ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rȚ\u000eဂ\f\u000fဂ\r\u0010ለ\u000e\u0011ဂ\u000f\u0012ለ\u0010\u0013<\u0000\u0014<\u0000", new java.lang.Object[]{"platformSpecific_", "platformSpecificCase_", "bitField0_", "bundleId_", "bundleVersion_", "appDebuggable_", "rooted_", "osVersion_", "deviceMake_", "deviceModel_", "webviewUa_", "screenDensity_", "screenWidth_", "screenHeight_", "screenSize_", "stores_", "totalDiskSpace_", "totalRamMemory_", "cpuModel_", "cpuCount_", "gpuModel_", gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.class, gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.class) {
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
            gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = new gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo();
            DEFAULT_INSTANCE = staticDeviceInfo;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.class, staticDeviceInfo);
        }

        public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.StaticDeviceInfoOuterClass$1, reason: invalid class name */
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
