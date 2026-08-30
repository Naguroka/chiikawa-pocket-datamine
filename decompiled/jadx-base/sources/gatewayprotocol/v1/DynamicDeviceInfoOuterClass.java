package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class DynamicDeviceInfoOuterClass {

    public interface DynamicDeviceInfoOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroid();

        boolean getAppActive();

        double getBatteryLevel();

        int getBatteryStatus();

        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType getConnectionType();

        int getConnectionTypeValue();

        long getFreeDiskSpace();

        long getFreeRamMemory();

        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIos();

        java.lang.String getLanguage();

        com.google.protobuf.ByteString getLanguageBytes();

        boolean getLimitedOpenAdTracking();

        boolean getLimitedTracking();

        boolean getLowPowerMode();

        java.lang.String getNetworkOperator();

        com.google.protobuf.ByteString getNetworkOperatorBytes();

        java.lang.String getNetworkOperatorName();

        com.google.protobuf.ByteString getNetworkOperatorNameBytes();

        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase getPlatformSpecificCase();

        int getScreenHeight();

        int getScreenWidth();

        java.lang.String getTimeZone();

        com.google.protobuf.ByteString getTimeZoneBytes();

        long getTimeZoneOffset();

        java.lang.String getUserId();

        com.google.protobuf.ByteString getUserIdBytes();

        boolean getWiredHeadset();

        boolean hasAndroid();

        boolean hasAppActive();

        boolean hasBatteryLevel();

        boolean hasBatteryStatus();

        boolean hasConnectionType();

        boolean hasFreeDiskSpace();

        boolean hasFreeRamMemory();

        boolean hasIos();

        boolean hasLanguage();

        boolean hasLimitedOpenAdTracking();

        boolean hasLimitedTracking();

        boolean hasLowPowerMode();

        boolean hasNetworkOperator();

        boolean hasNetworkOperatorName();

        boolean hasScreenHeight();

        boolean hasScreenWidth();

        boolean hasTimeZone();

        boolean hasTimeZoneOffset();

        boolean hasUserId();

        boolean hasWiredHeadset();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private DynamicDeviceInfoOuterClass() {
    }

    public enum ConnectionType implements com.google.protobuf.Internal.EnumLite {
        CONNECTION_TYPE_UNSPECIFIED(0),
        CONNECTION_TYPE_WIFI(1),
        CONNECTION_TYPE_CELLULAR(2),
        UNRECOGNIZED(-1);

        public static final int CONNECTION_TYPE_CELLULAR_VALUE = 2;
        public static final int CONNECTION_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int CONNECTION_TYPE_WIFI_VALUE = 1;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType>() { // from class: gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType findValueByNumber(int i) {
                return gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.forNumber(i);
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
        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType forNumber(int i) {
            if (i == 0) {
                return CONNECTION_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return CONNECTION_TYPE_WIFI;
            }
            if (i != 2) {
                return null;
            }
            return CONNECTION_TYPE_CELLULAR;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.ConnectionTypeVerifier.INSTANCE;
        }

        private static final class ConnectionTypeVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.ConnectionTypeVerifier();

            private ConnectionTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.forNumber(i) != null;
            }
        }

        ConnectionType(int i) {
            this.value = i;
        }
    }

    public static final class DynamicDeviceInfo extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo, gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder> implements gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder {
        public static final int ANDROID_FIELD_NUMBER = 12;
        public static final int APP_ACTIVE_FIELD_NUMBER = 17;
        public static final int BATTERY_LEVEL_FIELD_NUMBER = 14;
        public static final int BATTERY_STATUS_FIELD_NUMBER = 15;
        public static final int CONNECTION_TYPE_FIELD_NUMBER = 16;
        private static final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo DEFAULT_INSTANCE;
        public static final int FREE_DISK_SPACE_FIELD_NUMBER = 5;
        public static final int FREE_RAM_MEMORY_FIELD_NUMBER = 6;
        public static final int IOS_FIELD_NUMBER = 13;
        public static final int LANGUAGE_FIELD_NUMBER = 1;
        public static final int LIMITED_OPEN_AD_TRACKING_FIELD_NUMBER = 11;
        public static final int LIMITED_TRACKING_FIELD_NUMBER = 10;
        public static final int LOW_POWER_MODE_FIELD_NUMBER = 18;
        public static final int NETWORK_OPERATOR_FIELD_NUMBER = 2;
        public static final int NETWORK_OPERATOR_NAME_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo> PARSER = null;
        public static final int SCREEN_HEIGHT_FIELD_NUMBER = 21;
        public static final int SCREEN_WIDTH_FIELD_NUMBER = 20;
        public static final int TIME_ZONE_FIELD_NUMBER = 8;
        public static final int TIME_ZONE_OFFSET_FIELD_NUMBER = 9;
        public static final int USER_ID_FIELD_NUMBER = 19;
        public static final int WIRED_HEADSET_FIELD_NUMBER = 7;
        private boolean appActive_;
        private double batteryLevel_;
        private int batteryStatus_;
        private int bitField0_;
        private int connectionType_;
        private long freeDiskSpace_;
        private long freeRamMemory_;
        private boolean limitedOpenAdTracking_;
        private boolean limitedTracking_;
        private boolean lowPowerMode_;
        private java.lang.Object platformSpecific_;
        private int screenHeight_;
        private int screenWidth_;
        private long timeZoneOffset_;
        private boolean wiredHeadset_;
        private int platformSpecificCase_ = 0;
        private java.lang.String language_ = "";
        private java.lang.String networkOperator_ = "";
        private java.lang.String networkOperatorName_ = "";
        private java.lang.String timeZone_ = "";
        private java.lang.String userId_ = "";

        public interface AndroidOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            boolean getAdbEnabled();

            boolean getAirplaneMode();

            int getChargingType();

            long getDeviceElapsedRealtime();

            long getDeviceUpTime();

            double getMaxVolume();

            gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports();

            boolean getNetworkConnected();

            boolean getNetworkMetered();

            int getNetworkType();

            boolean getSdCardPresent();

            boolean getStayOnWhilePluggedIn();

            int getTelephonyManagerNetworkType();

            boolean getUsbConnected();

            double getVolume();

            boolean hasAdbEnabled();

            boolean hasAirplaneMode();

            boolean hasChargingType();

            boolean hasDeviceElapsedRealtime();

            boolean hasDeviceUpTime();

            boolean hasMaxVolume();

            boolean hasNetworkCapabilityTransports();

            boolean hasNetworkConnected();

            boolean hasNetworkMetered();

            boolean hasNetworkType();

            boolean hasSdCardPresent();

            boolean hasStayOnWhilePluggedIn();

            boolean hasTelephonyManagerNetworkType();

            boolean hasUsbConnected();

            boolean hasVolume();
        }

        public interface IosOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
            java.lang.String getCurrentRadioAccessTechnology();

            com.google.protobuf.ByteString getCurrentRadioAccessTechnologyBytes();

            int getCurrentUiTheme();

            java.lang.String getDeviceName();

            com.google.protobuf.ByteString getDeviceNameBytes();

            long getDeviceUpTimeWithSleep();

            long getDeviceUpTimeWithoutSleep();

            java.lang.String getLocaleList(int i);

            com.google.protobuf.ByteString getLocaleListBytes(int i);

            int getLocaleListCount();

            java.util.List<java.lang.String> getLocaleListList();

            int getNetworkReachabilityFlags();

            java.lang.String getNwPathInterfaces(int i);

            com.google.protobuf.ByteString getNwPathInterfacesBytes(int i);

            int getNwPathInterfacesCount();

            java.util.List<java.lang.String> getNwPathInterfacesList();

            int getTrackingAuthStatus();

            double getVolume();

            boolean hasCurrentRadioAccessTechnology();

            boolean hasCurrentUiTheme();

            boolean hasDeviceName();

            boolean hasDeviceUpTimeWithSleep();

            boolean hasDeviceUpTimeWithoutSleep();

            boolean hasNetworkReachabilityFlags();

            boolean hasTrackingAuthStatus();

            boolean hasVolume();
        }

        private DynamicDeviceInfo() {
        }

        public static final class Android extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android, gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder> implements gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder {
            public static final int ADB_ENABLED_FIELD_NUMBER = 5;
            public static final int AIRPLANE_MODE_FIELD_NUMBER = 11;
            public static final int CHARGING_TYPE_FIELD_NUMBER = 15;
            private static final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android DEFAULT_INSTANCE;
            public static final int DEVICE_ELAPSED_REALTIME_FIELD_NUMBER = 10;
            public static final int DEVICE_UP_TIME_FIELD_NUMBER = 9;
            public static final int MAX_VOLUME_FIELD_NUMBER = 8;
            public static final int NETWORK_CAPABILITY_TRANSPORTS_FIELD_NUMBER = 14;
            public static final int NETWORK_CONNECTED_FIELD_NUMBER = 1;
            public static final int NETWORK_METERED_FIELD_NUMBER = 3;
            public static final int NETWORK_TYPE_FIELD_NUMBER = 2;
            private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android> PARSER = null;
            public static final int SD_CARD_PRESENT_FIELD_NUMBER = 13;
            public static final int STAY_ON_WHILE_PLUGGED_IN_FIELD_NUMBER = 12;
            public static final int TELEPHONY_MANAGER_NETWORK_TYPE_FIELD_NUMBER = 4;
            public static final int USB_CONNECTED_FIELD_NUMBER = 6;
            public static final int VOLUME_FIELD_NUMBER = 7;
            private boolean adbEnabled_;
            private boolean airplaneMode_;
            private int bitField0_;
            private int chargingType_;
            private long deviceElapsedRealtime_;
            private long deviceUpTime_;
            private double maxVolume_;
            private gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports_;
            private boolean networkConnected_;
            private boolean networkMetered_;
            private int networkType_;
            private boolean sdCardPresent_;
            private boolean stayOnWhilePluggedIn_;
            private int telephonyManagerNetworkType_;
            private boolean usbConnected_;
            private double volume_;

            private Android() {
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasNetworkConnected() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean getNetworkConnected() {
                return this.networkConnected_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNetworkConnected(boolean z) {
                this.bitField0_ |= 1;
                this.networkConnected_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNetworkConnected() {
                this.bitField0_ &= -2;
                this.networkConnected_ = false;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasNetworkType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public int getNetworkType() {
                return this.networkType_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNetworkType(int i) {
                this.bitField0_ |= 2;
                this.networkType_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNetworkType() {
                this.bitField0_ &= -3;
                this.networkType_ = 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasNetworkMetered() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean getNetworkMetered() {
                return this.networkMetered_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNetworkMetered(boolean z) {
                this.bitField0_ |= 4;
                this.networkMetered_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNetworkMetered() {
                this.bitField0_ &= -5;
                this.networkMetered_ = false;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasTelephonyManagerNetworkType() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public int getTelephonyManagerNetworkType() {
                return this.telephonyManagerNetworkType_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTelephonyManagerNetworkType(int i) {
                this.bitField0_ |= 8;
                this.telephonyManagerNetworkType_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTelephonyManagerNetworkType() {
                this.bitField0_ &= -9;
                this.telephonyManagerNetworkType_ = 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasAdbEnabled() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean getAdbEnabled() {
                return this.adbEnabled_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdbEnabled(boolean z) {
                this.bitField0_ |= 16;
                this.adbEnabled_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdbEnabled() {
                this.bitField0_ &= -17;
                this.adbEnabled_ = false;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasUsbConnected() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean getUsbConnected() {
                return this.usbConnected_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUsbConnected(boolean z) {
                this.bitField0_ |= 32;
                this.usbConnected_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUsbConnected() {
                this.bitField0_ &= -33;
                this.usbConnected_ = false;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasVolume() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public double getVolume() {
                return this.volume_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVolume(double d) {
                this.bitField0_ |= 64;
                this.volume_ = d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVolume() {
                this.bitField0_ &= -65;
                this.volume_ = 0.0d;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasMaxVolume() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public double getMaxVolume() {
                return this.maxVolume_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMaxVolume(double d) {
                this.bitField0_ |= 128;
                this.maxVolume_ = d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMaxVolume() {
                this.bitField0_ &= -129;
                this.maxVolume_ = 0.0d;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasDeviceUpTime() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public long getDeviceUpTime() {
                return this.deviceUpTime_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeviceUpTime(long j) {
                this.bitField0_ |= 256;
                this.deviceUpTime_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDeviceUpTime() {
                this.bitField0_ &= -257;
                this.deviceUpTime_ = 0L;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasDeviceElapsedRealtime() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public long getDeviceElapsedRealtime() {
                return this.deviceElapsedRealtime_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeviceElapsedRealtime(long j) {
                this.bitField0_ |= 512;
                this.deviceElapsedRealtime_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDeviceElapsedRealtime() {
                this.bitField0_ &= -513;
                this.deviceElapsedRealtime_ = 0L;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasAirplaneMode() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean getAirplaneMode() {
                return this.airplaneMode_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAirplaneMode(boolean z) {
                this.bitField0_ |= 1024;
                this.airplaneMode_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAirplaneMode() {
                this.bitField0_ &= -1025;
                this.airplaneMode_ = false;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasStayOnWhilePluggedIn() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean getStayOnWhilePluggedIn() {
                return this.stayOnWhilePluggedIn_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStayOnWhilePluggedIn(boolean z) {
                this.bitField0_ |= 2048;
                this.stayOnWhilePluggedIn_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStayOnWhilePluggedIn() {
                this.bitField0_ &= -2049;
                this.stayOnWhilePluggedIn_ = false;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasSdCardPresent() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean getSdCardPresent() {
                return this.sdCardPresent_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSdCardPresent(boolean z) {
                this.bitField0_ |= 4096;
                this.sdCardPresent_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSdCardPresent() {
                this.bitField0_ &= -4097;
                this.sdCardPresent_ = false;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasNetworkCapabilityTransports() {
                return this.networkCapabilityTransports_ != null;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
                gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports = this.networkCapabilityTransports_;
                return networkCapabilityTransports == null ? gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getDefaultInstance() : networkCapabilityTransports;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNetworkCapabilityTransports(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports) {
                networkCapabilityTransports.getClass();
                this.networkCapabilityTransports_ = networkCapabilityTransports;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeNetworkCapabilityTransports(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports) {
                networkCapabilityTransports.getClass();
                gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports2 = this.networkCapabilityTransports_;
                if (networkCapabilityTransports2 != null && networkCapabilityTransports2 != gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getDefaultInstance()) {
                    this.networkCapabilityTransports_ = gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder(this.networkCapabilityTransports_).mergeFrom(networkCapabilityTransports).buildPartial();
                } else {
                    this.networkCapabilityTransports_ = networkCapabilityTransports;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNetworkCapabilityTransports() {
                this.networkCapabilityTransports_ = null;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasChargingType() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public int getChargingType() {
                return this.chargingType_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setChargingType(int i) {
                this.bitField0_ |= 8192;
                this.chargingType_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearChargingType() {
                this.bitField0_ &= -8193;
                this.chargingType_ = 0;
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder newBuilder(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2) {
                return DEFAULT_INSTANCE.createBuilder(android2);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android, gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder> implements gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder {
                /* synthetic */ Builder(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    super(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.DEFAULT_INSTANCE);
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasNetworkConnected() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).hasNetworkConnected();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean getNetworkConnected() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).getNetworkConnected();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder setNetworkConnected(boolean z) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).setNetworkConnected(z);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder clearNetworkConnected() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).clearNetworkConnected();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasNetworkType() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).hasNetworkType();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public int getNetworkType() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).getNetworkType();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder setNetworkType(int i) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).setNetworkType(i);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder clearNetworkType() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).clearNetworkType();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasNetworkMetered() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).hasNetworkMetered();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean getNetworkMetered() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).getNetworkMetered();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder setNetworkMetered(boolean z) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).setNetworkMetered(z);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder clearNetworkMetered() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).clearNetworkMetered();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasTelephonyManagerNetworkType() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).hasTelephonyManagerNetworkType();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public int getTelephonyManagerNetworkType() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).getTelephonyManagerNetworkType();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder setTelephonyManagerNetworkType(int i) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).setTelephonyManagerNetworkType(i);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder clearTelephonyManagerNetworkType() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).clearTelephonyManagerNetworkType();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasAdbEnabled() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).hasAdbEnabled();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean getAdbEnabled() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).getAdbEnabled();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder setAdbEnabled(boolean z) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).setAdbEnabled(z);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder clearAdbEnabled() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).clearAdbEnabled();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasUsbConnected() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).hasUsbConnected();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean getUsbConnected() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).getUsbConnected();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder setUsbConnected(boolean z) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).setUsbConnected(z);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder clearUsbConnected() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).clearUsbConnected();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasVolume() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).hasVolume();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public double getVolume() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).getVolume();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder setVolume(double d) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).setVolume(d);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder clearVolume() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).clearVolume();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasMaxVolume() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).hasMaxVolume();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public double getMaxVolume() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).getMaxVolume();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder setMaxVolume(double d) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).setMaxVolume(d);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder clearMaxVolume() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).clearMaxVolume();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasDeviceUpTime() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).hasDeviceUpTime();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public long getDeviceUpTime() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).getDeviceUpTime();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder setDeviceUpTime(long j) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).setDeviceUpTime(j);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder clearDeviceUpTime() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).clearDeviceUpTime();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasDeviceElapsedRealtime() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).hasDeviceElapsedRealtime();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public long getDeviceElapsedRealtime() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).getDeviceElapsedRealtime();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder setDeviceElapsedRealtime(long j) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).setDeviceElapsedRealtime(j);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder clearDeviceElapsedRealtime() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).clearDeviceElapsedRealtime();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasAirplaneMode() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).hasAirplaneMode();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean getAirplaneMode() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).getAirplaneMode();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder setAirplaneMode(boolean z) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).setAirplaneMode(z);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder clearAirplaneMode() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).clearAirplaneMode();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasStayOnWhilePluggedIn() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).hasStayOnWhilePluggedIn();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean getStayOnWhilePluggedIn() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).getStayOnWhilePluggedIn();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder setStayOnWhilePluggedIn(boolean z) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).setStayOnWhilePluggedIn(z);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder clearStayOnWhilePluggedIn() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).clearStayOnWhilePluggedIn();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasSdCardPresent() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).hasSdCardPresent();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean getSdCardPresent() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).getSdCardPresent();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder setSdCardPresent(boolean z) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).setSdCardPresent(z);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder clearSdCardPresent() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).clearSdCardPresent();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasNetworkCapabilityTransports() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).hasNetworkCapabilityTransports();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).getNetworkCapabilityTransports();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder setNetworkCapabilityTransports(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).setNetworkCapabilityTransports(networkCapabilityTransports);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder setNetworkCapabilityTransports(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).setNetworkCapabilityTransports(builder.build());
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder mergeNetworkCapabilityTransports(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).mergeNetworkCapabilityTransports(networkCapabilityTransports);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder clearNetworkCapabilityTransports() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).clearNetworkCapabilityTransports();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasChargingType() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).hasChargingType();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public int getChargingType() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).getChargingType();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder setChargingType(int i) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).setChargingType(i);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder clearChargingType() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.instance).clearChargingType();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                gatewayprotocol.v1.DynamicDeviceInfoOuterClass.AnonymousClass1 anonymousClass1 = null;
                switch (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android();
                    case 2:
                        return new gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder(anonymousClass1);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007က\u0006\bက\u0007\tဂ\b\nဂ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000e\t\u000fင\r", new java.lang.Object[]{"bitField0_", "networkConnected_", "networkType_", "networkMetered_", "telephonyManagerNetworkType_", "adbEnabled_", "usbConnected_", "volume_", "maxVolume_", "deviceUpTime_", "deviceElapsedRealtime_", "airplaneMode_", "stayOnWhilePluggedIn_", "sdCardPresent_", "networkCapabilityTransports_", "chargingType_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android> defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.class) {
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
                gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2 = new gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android();
                DEFAULT_INSTANCE = android2;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.class, android2);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Ios extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios, gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder> implements gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder {
            public static final int CURRENT_RADIO_ACCESS_TECHNOLOGY_FIELD_NUMBER = 1;
            public static final int CURRENT_UI_THEME_FIELD_NUMBER = 5;
            private static final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios DEFAULT_INSTANCE;
            public static final int DEVICE_NAME_FIELD_NUMBER = 6;
            public static final int DEVICE_UP_TIME_WITHOUT_SLEEP_FIELD_NUMBER = 10;
            public static final int DEVICE_UP_TIME_WITH_SLEEP_FIELD_NUMBER = 9;
            public static final int LOCALE_LIST_FIELD_NUMBER = 4;
            public static final int NETWORK_REACHABILITY_FLAGS_FIELD_NUMBER = 2;
            public static final int NW_PATH_INTERFACES_FIELD_NUMBER = 3;
            private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios> PARSER = null;
            public static final int TRACKING_AUTH_STATUS_FIELD_NUMBER = 8;
            public static final int VOLUME_FIELD_NUMBER = 7;
            private int bitField0_;
            private int currentUiTheme_;
            private long deviceUpTimeWithSleep_;
            private long deviceUpTimeWithoutSleep_;
            private int networkReachabilityFlags_;
            private int trackingAuthStatus_;
            private double volume_;
            private java.lang.String currentRadioAccessTechnology_ = "";
            private com.google.protobuf.Internal.ProtobufList<java.lang.String> nwPathInterfaces_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private com.google.protobuf.Internal.ProtobufList<java.lang.String> localeList_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            private java.lang.String deviceName_ = "";

            private Ios() {
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public boolean hasCurrentRadioAccessTechnology() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public java.lang.String getCurrentRadioAccessTechnology() {
                return this.currentRadioAccessTechnology_;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public com.google.protobuf.ByteString getCurrentRadioAccessTechnologyBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.currentRadioAccessTechnology_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCurrentRadioAccessTechnology(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.currentRadioAccessTechnology_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCurrentRadioAccessTechnology() {
                this.bitField0_ &= -2;
                this.currentRadioAccessTechnology_ = getDefaultInstance().getCurrentRadioAccessTechnology();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCurrentRadioAccessTechnologyBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.currentRadioAccessTechnology_ = byteString.toStringUtf8();
                this.bitField0_ |= 1;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public boolean hasNetworkReachabilityFlags() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public int getNetworkReachabilityFlags() {
                return this.networkReachabilityFlags_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNetworkReachabilityFlags(int i) {
                this.bitField0_ |= 2;
                this.networkReachabilityFlags_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNetworkReachabilityFlags() {
                this.bitField0_ &= -3;
                this.networkReachabilityFlags_ = 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public java.util.List<java.lang.String> getNwPathInterfacesList() {
                return this.nwPathInterfaces_;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public int getNwPathInterfacesCount() {
                return this.nwPathInterfaces_.size();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public java.lang.String getNwPathInterfaces(int i) {
                return this.nwPathInterfaces_.get(i);
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public com.google.protobuf.ByteString getNwPathInterfacesBytes(int i) {
                return com.google.protobuf.ByteString.copyFromUtf8(this.nwPathInterfaces_.get(i));
            }

            private void ensureNwPathInterfacesIsMutable() {
                com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.nwPathInterfaces_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.nwPathInterfaces_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNwPathInterfaces(int i, java.lang.String str) {
                str.getClass();
                ensureNwPathInterfacesIsMutable();
                this.nwPathInterfaces_.set(i, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addNwPathInterfaces(java.lang.String str) {
                str.getClass();
                ensureNwPathInterfacesIsMutable();
                this.nwPathInterfaces_.add(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllNwPathInterfaces(java.lang.Iterable<java.lang.String> iterable) {
                ensureNwPathInterfacesIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.nwPathInterfaces_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNwPathInterfaces() {
                this.nwPathInterfaces_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addNwPathInterfacesBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                ensureNwPathInterfacesIsMutable();
                this.nwPathInterfaces_.add(byteString.toStringUtf8());
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public java.util.List<java.lang.String> getLocaleListList() {
                return this.localeList_;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public int getLocaleListCount() {
                return this.localeList_.size();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public java.lang.String getLocaleList(int i) {
                return this.localeList_.get(i);
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public com.google.protobuf.ByteString getLocaleListBytes(int i) {
                return com.google.protobuf.ByteString.copyFromUtf8(this.localeList_.get(i));
            }

            private void ensureLocaleListIsMutable() {
                com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.localeList_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.localeList_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLocaleList(int i, java.lang.String str) {
                str.getClass();
                ensureLocaleListIsMutable();
                this.localeList_.set(i, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addLocaleList(java.lang.String str) {
                str.getClass();
                ensureLocaleListIsMutable();
                this.localeList_.add(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllLocaleList(java.lang.Iterable<java.lang.String> iterable) {
                ensureLocaleListIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.localeList_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLocaleList() {
                this.localeList_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addLocaleListBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                ensureLocaleListIsMutable();
                this.localeList_.add(byteString.toStringUtf8());
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public boolean hasCurrentUiTheme() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public int getCurrentUiTheme() {
                return this.currentUiTheme_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCurrentUiTheme(int i) {
                this.bitField0_ |= 4;
                this.currentUiTheme_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCurrentUiTheme() {
                this.bitField0_ &= -5;
                this.currentUiTheme_ = 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public boolean hasDeviceName() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public java.lang.String getDeviceName() {
                return this.deviceName_;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public com.google.protobuf.ByteString getDeviceNameBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.deviceName_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeviceName(java.lang.String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.deviceName_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDeviceName() {
                this.bitField0_ &= -9;
                this.deviceName_ = getDefaultInstance().getDeviceName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeviceNameBytes(com.google.protobuf.ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.deviceName_ = byteString.toStringUtf8();
                this.bitField0_ |= 8;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public boolean hasVolume() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public double getVolume() {
                return this.volume_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVolume(double d) {
                this.bitField0_ |= 16;
                this.volume_ = d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVolume() {
                this.bitField0_ &= -17;
                this.volume_ = 0.0d;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public boolean hasTrackingAuthStatus() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public int getTrackingAuthStatus() {
                return this.trackingAuthStatus_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTrackingAuthStatus(int i) {
                this.bitField0_ |= 32;
                this.trackingAuthStatus_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTrackingAuthStatus() {
                this.bitField0_ &= -33;
                this.trackingAuthStatus_ = 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public boolean hasDeviceUpTimeWithSleep() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public long getDeviceUpTimeWithSleep() {
                return this.deviceUpTimeWithSleep_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeviceUpTimeWithSleep(long j) {
                this.bitField0_ |= 64;
                this.deviceUpTimeWithSleep_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDeviceUpTimeWithSleep() {
                this.bitField0_ &= -65;
                this.deviceUpTimeWithSleep_ = 0L;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public boolean hasDeviceUpTimeWithoutSleep() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public long getDeviceUpTimeWithoutSleep() {
                return this.deviceUpTimeWithoutSleep_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeviceUpTimeWithoutSleep(long j) {
                this.bitField0_ |= 128;
                this.deviceUpTimeWithoutSleep_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDeviceUpTimeWithoutSleep() {
                this.bitField0_ &= -129;
                this.deviceUpTimeWithoutSleep_ = 0L;
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder newBuilder(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios) {
                return DEFAULT_INSTANCE.createBuilder(ios);
            }

            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios, gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder> implements gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder {
                /* synthetic */ Builder(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    super(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.DEFAULT_INSTANCE);
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public boolean hasCurrentRadioAccessTechnology() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).hasCurrentRadioAccessTechnology();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public java.lang.String getCurrentRadioAccessTechnology() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getCurrentRadioAccessTechnology();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public com.google.protobuf.ByteString getCurrentRadioAccessTechnologyBytes() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getCurrentRadioAccessTechnologyBytes();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setCurrentRadioAccessTechnology(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).setCurrentRadioAccessTechnology(str);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearCurrentRadioAccessTechnology() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).clearCurrentRadioAccessTechnology();
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setCurrentRadioAccessTechnologyBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).setCurrentRadioAccessTechnologyBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public boolean hasNetworkReachabilityFlags() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).hasNetworkReachabilityFlags();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public int getNetworkReachabilityFlags() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getNetworkReachabilityFlags();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setNetworkReachabilityFlags(int i) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).setNetworkReachabilityFlags(i);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearNetworkReachabilityFlags() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).clearNetworkReachabilityFlags();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public java.util.List<java.lang.String> getNwPathInterfacesList() {
                    return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getNwPathInterfacesList());
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public int getNwPathInterfacesCount() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getNwPathInterfacesCount();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public java.lang.String getNwPathInterfaces(int i) {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getNwPathInterfaces(i);
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public com.google.protobuf.ByteString getNwPathInterfacesBytes(int i) {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getNwPathInterfacesBytes(i);
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setNwPathInterfaces(int i, java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).setNwPathInterfaces(i, str);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder addNwPathInterfaces(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).addNwPathInterfaces(str);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder addAllNwPathInterfaces(java.lang.Iterable<java.lang.String> iterable) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).addAllNwPathInterfaces(iterable);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearNwPathInterfaces() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).clearNwPathInterfaces();
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder addNwPathInterfacesBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).addNwPathInterfacesBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public java.util.List<java.lang.String> getLocaleListList() {
                    return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getLocaleListList());
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public int getLocaleListCount() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getLocaleListCount();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public java.lang.String getLocaleList(int i) {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getLocaleList(i);
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public com.google.protobuf.ByteString getLocaleListBytes(int i) {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getLocaleListBytes(i);
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setLocaleList(int i, java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).setLocaleList(i, str);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder addLocaleList(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).addLocaleList(str);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder addAllLocaleList(java.lang.Iterable<java.lang.String> iterable) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).addAllLocaleList(iterable);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearLocaleList() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).clearLocaleList();
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder addLocaleListBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).addLocaleListBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public boolean hasCurrentUiTheme() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).hasCurrentUiTheme();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public int getCurrentUiTheme() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getCurrentUiTheme();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setCurrentUiTheme(int i) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).setCurrentUiTheme(i);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearCurrentUiTheme() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).clearCurrentUiTheme();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public boolean hasDeviceName() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).hasDeviceName();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public java.lang.String getDeviceName() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getDeviceName();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public com.google.protobuf.ByteString getDeviceNameBytes() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getDeviceNameBytes();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setDeviceName(java.lang.String str) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).setDeviceName(str);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearDeviceName() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).clearDeviceName();
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setDeviceNameBytes(com.google.protobuf.ByteString byteString) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).setDeviceNameBytes(byteString);
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public boolean hasVolume() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).hasVolume();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public double getVolume() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getVolume();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setVolume(double d) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).setVolume(d);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearVolume() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).clearVolume();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public boolean hasTrackingAuthStatus() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).hasTrackingAuthStatus();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public int getTrackingAuthStatus() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getTrackingAuthStatus();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setTrackingAuthStatus(int i) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).setTrackingAuthStatus(i);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearTrackingAuthStatus() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).clearTrackingAuthStatus();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public boolean hasDeviceUpTimeWithSleep() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).hasDeviceUpTimeWithSleep();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public long getDeviceUpTimeWithSleep() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getDeviceUpTimeWithSleep();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setDeviceUpTimeWithSleep(long j) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).setDeviceUpTimeWithSleep(j);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearDeviceUpTimeWithSleep() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).clearDeviceUpTimeWithSleep();
                    return this;
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public boolean hasDeviceUpTimeWithoutSleep() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).hasDeviceUpTimeWithoutSleep();
                }

                @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public long getDeviceUpTimeWithoutSleep() {
                    return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).getDeviceUpTimeWithoutSleep();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setDeviceUpTimeWithoutSleep(long j) {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).setDeviceUpTimeWithoutSleep(j);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearDeviceUpTimeWithoutSleep() {
                    copyOnWrite();
                    ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.instance).clearDeviceUpTimeWithoutSleep();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                gatewayprotocol.v1.DynamicDeviceInfoOuterClass.AnonymousClass1 anonymousClass1 = null;
                switch (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios();
                    case 2:
                        return new gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder(anonymousClass1);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ለ\u0000\u0002ဋ\u0001\u0003Ț\u0004Ț\u0005င\u0002\u0006ለ\u0003\u0007က\u0004\bင\u0005\tဂ\u0006\nဂ\u0007", new java.lang.Object[]{"bitField0_", "currentRadioAccessTechnology_", "networkReachabilityFlags_", "nwPathInterfaces_", "localeList_", "currentUiTheme_", "deviceName_", "volume_", "trackingAuthStatus_", "deviceUpTimeWithSleep_", "deviceUpTimeWithoutSleep_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios> defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.class) {
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
                gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios = new gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios();
                DEFAULT_INSTANCE = ios;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.class, ios);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.google.protobuf.Parser<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public enum PlatformSpecificCase {
            ANDROID(12),
            IOS(13),
            PLATFORMSPECIFIC_NOT_SET(0);

            private final int value;

            PlatformSpecificCase(int i) {
                this.value = i;
            }

            @java.lang.Deprecated
            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase valueOf(int i) {
                return forNumber(i);
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase forNumber(int i) {
                if (i == 0) {
                    return PLATFORMSPECIFIC_NOT_SET;
                }
                if (i == 12) {
                    return ANDROID;
                }
                if (i != 13) {
                    return null;
                }
                return IOS;
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            return gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase.forNumber(this.platformSpecificCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlatformSpecific() {
            this.platformSpecificCase_ = 0;
            this.platformSpecific_ = null;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasLanguage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public java.lang.String getLanguage() {
            return this.language_;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getLanguageBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.language_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguage(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.language_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLanguage() {
            this.bitField0_ &= -2;
            this.language_ = getDefaultInstance().getLanguage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguageBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.language_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasNetworkOperator() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public java.lang.String getNetworkOperator() {
            return this.networkOperator_;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getNetworkOperatorBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.networkOperator_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkOperator(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.networkOperator_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkOperator() {
            this.bitField0_ &= -3;
            this.networkOperator_ = getDefaultInstance().getNetworkOperator();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkOperatorBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.networkOperator_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasNetworkOperatorName() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public java.lang.String getNetworkOperatorName() {
            return this.networkOperatorName_;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getNetworkOperatorNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.networkOperatorName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkOperatorName(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.networkOperatorName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkOperatorName() {
            this.bitField0_ &= -5;
            this.networkOperatorName_ = getDefaultInstance().getNetworkOperatorName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkOperatorNameBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.networkOperatorName_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasFreeDiskSpace() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public long getFreeDiskSpace() {
            return this.freeDiskSpace_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFreeDiskSpace(long j) {
            this.bitField0_ |= 8;
            this.freeDiskSpace_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFreeDiskSpace() {
            this.bitField0_ &= -9;
            this.freeDiskSpace_ = 0L;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasFreeRamMemory() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public long getFreeRamMemory() {
            return this.freeRamMemory_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFreeRamMemory(long j) {
            this.bitField0_ |= 16;
            this.freeRamMemory_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFreeRamMemory() {
            this.bitField0_ &= -17;
            this.freeRamMemory_ = 0L;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasWiredHeadset() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean getWiredHeadset() {
            return this.wiredHeadset_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWiredHeadset(boolean z) {
            this.bitField0_ |= 32;
            this.wiredHeadset_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWiredHeadset() {
            this.bitField0_ &= -33;
            this.wiredHeadset_ = false;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasTimeZone() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public java.lang.String getTimeZone() {
            return this.timeZone_;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getTimeZoneBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.timeZone_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeZone(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.timeZone_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeZone() {
            this.bitField0_ &= -65;
            this.timeZone_ = getDefaultInstance().getTimeZone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeZoneBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.timeZone_ = byteString.toStringUtf8();
            this.bitField0_ |= 64;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasTimeZoneOffset() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public long getTimeZoneOffset() {
            return this.timeZoneOffset_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeZoneOffset(long j) {
            this.bitField0_ |= 128;
            this.timeZoneOffset_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeZoneOffset() {
            this.bitField0_ &= -129;
            this.timeZoneOffset_ = 0L;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasLimitedTracking() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean getLimitedTracking() {
            return this.limitedTracking_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLimitedTracking(boolean z) {
            this.bitField0_ |= 256;
            this.limitedTracking_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLimitedTracking() {
            this.bitField0_ &= -257;
            this.limitedTracking_ = false;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasLimitedOpenAdTracking() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean getLimitedOpenAdTracking() {
            return this.limitedOpenAdTracking_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLimitedOpenAdTracking(boolean z) {
            this.bitField0_ |= 512;
            this.limitedOpenAdTracking_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLimitedOpenAdTracking() {
            this.bitField0_ &= -513;
            this.limitedOpenAdTracking_ = false;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasBatteryLevel() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public double getBatteryLevel() {
            return this.batteryLevel_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatteryLevel(double d) {
            this.bitField0_ |= 1024;
            this.batteryLevel_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatteryLevel() {
            this.bitField0_ &= -1025;
            this.batteryLevel_ = 0.0d;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasBatteryStatus() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public int getBatteryStatus() {
            return this.batteryStatus_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatteryStatus(int i) {
            this.bitField0_ |= 2048;
            this.batteryStatus_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatteryStatus() {
            this.bitField0_ &= -2049;
            this.batteryStatus_ = 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasConnectionType() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public int getConnectionTypeValue() {
            return this.connectionType_;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType connectionTypeForNumber = gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.forNumber(this.connectionType_);
            return connectionTypeForNumber == null ? gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.UNRECOGNIZED : connectionTypeForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeValue(int i) {
            this.bitField0_ |= 4096;
            this.connectionType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionType(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType connectionType) {
            this.connectionType_ = connectionType.getNumber();
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionType() {
            this.bitField0_ &= -4097;
            this.connectionType_ = 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasAppActive() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean getAppActive() {
            return this.appActive_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppActive(boolean z) {
            this.bitField0_ |= 8192;
            this.appActive_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppActive() {
            this.bitField0_ &= -8193;
            this.appActive_ = false;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasLowPowerMode() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean getLowPowerMode() {
            return this.lowPowerMode_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLowPowerMode(boolean z) {
            this.bitField0_ |= 16384;
            this.lowPowerMode_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLowPowerMode() {
            this.bitField0_ &= -16385;
            this.lowPowerMode_ = false;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasUserId() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public java.lang.String getUserId() {
            return this.userId_;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public com.google.protobuf.ByteString getUserIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.userId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 32768;
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.bitField0_ &= -32769;
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
            this.bitField0_ |= 32768;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasScreenWidth() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public int getScreenWidth() {
            return this.screenWidth_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenWidth(int i) {
            this.bitField0_ |= 65536;
            this.screenWidth_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenWidth() {
            this.bitField0_ &= -65537;
            this.screenWidth_ = 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasScreenHeight() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public int getScreenHeight() {
            return this.screenHeight_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenHeight(int i) {
            this.bitField0_ |= 131072;
            this.screenHeight_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenHeight() {
            this.bitField0_ &= -131073;
            this.screenHeight_ = 0;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasAndroid() {
            return this.platformSpecificCase_ == 12;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroid() {
            if (this.platformSpecificCase_ == 12) {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.platformSpecific_;
            }
            return gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAndroid(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2) {
            android2.getClass();
            this.platformSpecific_ = android2;
            this.platformSpecificCase_ = 12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAndroid(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2) {
            android2.getClass();
            if (this.platformSpecificCase_ == 12 && this.platformSpecific_ != gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.getDefaultInstance()) {
                this.platformSpecific_ = gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android) this.platformSpecific_).mergeFrom(android2).buildPartial();
            } else {
                this.platformSpecific_ = android2;
            }
            this.platformSpecificCase_ = 12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAndroid() {
            if (this.platformSpecificCase_ == 12) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasIos() {
            return this.platformSpecificCase_ == 13;
        }

        @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIos() {
            if (this.platformSpecificCase_ == 13) {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.platformSpecific_;
            }
            return gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIos(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios) {
            ios.getClass();
            this.platformSpecific_ = ios;
            this.platformSpecificCase_ = 13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIos(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios) {
            ios.getClass();
            if (this.platformSpecificCase_ == 13 && this.platformSpecific_ != gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.getDefaultInstance()) {
                this.platformSpecific_ = gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.newBuilder((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios) this.platformSpecific_).mergeFrom(ios).buildPartial();
            } else {
                this.platformSpecific_ = ios;
            }
            this.platformSpecificCase_ = 13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIos() {
            if (this.platformSpecificCase_ == 13) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder newBuilder(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            return DEFAULT_INSTANCE.createBuilder(dynamicDeviceInfo);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo, gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder> implements gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getPlatformSpecificCase();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearPlatformSpecific() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearPlatformSpecific();
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasLanguage() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasLanguage();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public java.lang.String getLanguage() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getLanguage();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getLanguageBytes() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getLanguageBytes();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setLanguage(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setLanguage(str);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearLanguage() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearLanguage();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setLanguageBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setLanguageBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasNetworkOperator() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasNetworkOperator();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public java.lang.String getNetworkOperator() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getNetworkOperator();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getNetworkOperatorBytes() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getNetworkOperatorBytes();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setNetworkOperator(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setNetworkOperator(str);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearNetworkOperator() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearNetworkOperator();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setNetworkOperatorBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setNetworkOperatorBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasNetworkOperatorName() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasNetworkOperatorName();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public java.lang.String getNetworkOperatorName() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getNetworkOperatorName();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getNetworkOperatorNameBytes() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getNetworkOperatorNameBytes();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setNetworkOperatorName(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setNetworkOperatorName(str);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearNetworkOperatorName() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearNetworkOperatorName();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setNetworkOperatorNameBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setNetworkOperatorNameBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasFreeDiskSpace() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasFreeDiskSpace();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public long getFreeDiskSpace() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getFreeDiskSpace();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setFreeDiskSpace(long j) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setFreeDiskSpace(j);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearFreeDiskSpace() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearFreeDiskSpace();
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasFreeRamMemory() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasFreeRamMemory();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public long getFreeRamMemory() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getFreeRamMemory();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setFreeRamMemory(long j) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setFreeRamMemory(j);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearFreeRamMemory() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearFreeRamMemory();
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasWiredHeadset() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasWiredHeadset();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean getWiredHeadset() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getWiredHeadset();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setWiredHeadset(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setWiredHeadset(z);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearWiredHeadset() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearWiredHeadset();
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasTimeZone() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasTimeZone();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public java.lang.String getTimeZone() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getTimeZone();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getTimeZoneBytes() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getTimeZoneBytes();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setTimeZone(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setTimeZone(str);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearTimeZone() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearTimeZone();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setTimeZoneBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setTimeZoneBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasTimeZoneOffset() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasTimeZoneOffset();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public long getTimeZoneOffset() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getTimeZoneOffset();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setTimeZoneOffset(long j) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setTimeZoneOffset(j);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearTimeZoneOffset() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearTimeZoneOffset();
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasLimitedTracking() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasLimitedTracking();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean getLimitedTracking() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getLimitedTracking();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setLimitedTracking(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setLimitedTracking(z);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearLimitedTracking() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearLimitedTracking();
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasLimitedOpenAdTracking() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasLimitedOpenAdTracking();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean getLimitedOpenAdTracking() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getLimitedOpenAdTracking();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setLimitedOpenAdTracking(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setLimitedOpenAdTracking(z);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearLimitedOpenAdTracking() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearLimitedOpenAdTracking();
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasBatteryLevel() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasBatteryLevel();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public double getBatteryLevel() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getBatteryLevel();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setBatteryLevel(double d) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setBatteryLevel(d);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearBatteryLevel() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearBatteryLevel();
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasBatteryStatus() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasBatteryStatus();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public int getBatteryStatus() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getBatteryStatus();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setBatteryStatus(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setBatteryStatus(i);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearBatteryStatus() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearBatteryStatus();
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasConnectionType() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasConnectionType();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public int getConnectionTypeValue() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getConnectionTypeValue();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setConnectionTypeValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setConnectionTypeValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getConnectionType();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setConnectionType(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType connectionType) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setConnectionType(connectionType);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearConnectionType() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearConnectionType();
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasAppActive() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasAppActive();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean getAppActive() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getAppActive();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setAppActive(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setAppActive(z);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearAppActive() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearAppActive();
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasLowPowerMode() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasLowPowerMode();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean getLowPowerMode() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getLowPowerMode();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setLowPowerMode(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setLowPowerMode(z);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearLowPowerMode() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearLowPowerMode();
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasUserId() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasUserId();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public java.lang.String getUserId() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getUserId();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public com.google.protobuf.ByteString getUserIdBytes() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getUserIdBytes();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setUserId(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setUserId(str);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearUserId() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearUserId();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setUserIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setUserIdBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasScreenWidth() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasScreenWidth();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public int getScreenWidth() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getScreenWidth();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setScreenWidth(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setScreenWidth(i);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearScreenWidth() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearScreenWidth();
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasScreenHeight() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasScreenHeight();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public int getScreenHeight() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getScreenHeight();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setScreenHeight(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setScreenHeight(i);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearScreenHeight() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearScreenHeight();
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasAndroid() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasAndroid();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroid() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getAndroid();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setAndroid(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setAndroid(android2);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setAndroid(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setAndroid(builder.build());
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder mergeAndroid(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).mergeAndroid(android2);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearAndroid() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearAndroid();
                return this;
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasIos() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).hasIos();
            }

            @Override // gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIos() {
                return ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).getIos();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setIos(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setIos(ios);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setIos(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).setIos(builder.build());
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder mergeIos(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios) {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).mergeIos(ios);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearIos() {
                copyOnWrite();
                ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo) this.instance).clearIos();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo();
                case 2:
                    return new gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0001\u0001\u0001\u0015\u0014\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0005ဂ\u0003\u0006ဂ\u0004\u0007ဇ\u0005\bለ\u0006\tဂ\u0007\nဇ\b\u000bဇ\t\f<\u0000\r<\u0000\u000eက\n\u000fင\u000b\u0010ဌ\f\u0011ဇ\r\u0012ဇ\u000e\u0013ለ\u000f\u0014ဋ\u0010\u0015ဋ\u0011", new java.lang.Object[]{"platformSpecific_", "platformSpecificCase_", "bitField0_", "language_", "networkOperator_", "networkOperatorName_", "freeDiskSpace_", "freeRamMemory_", "wiredHeadset_", "timeZone_", "timeZoneOffset_", "limitedTracking_", "limitedOpenAdTracking_", gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.class, gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.class, "batteryLevel_", "batteryStatus_", "connectionType_", "appActive_", "lowPowerMode_", "userId_", "screenWidth_", "screenHeight_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.class) {
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
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = new gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo();
            DEFAULT_INSTANCE = dynamicDeviceInfo;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.class, dynamicDeviceInfo);
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.DynamicDeviceInfoOuterClass$1, reason: invalid class name */
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
