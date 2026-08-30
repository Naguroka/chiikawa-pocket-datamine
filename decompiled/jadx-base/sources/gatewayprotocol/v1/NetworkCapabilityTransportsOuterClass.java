package gatewayprotocol.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class NetworkCapabilityTransportsOuterClass {

    public interface NetworkCapabilityTransportsOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        boolean getBluetooth();

        boolean getCellular();

        boolean getEthernet();

        boolean getLowpan();

        boolean getSatellite();

        boolean getThread();

        boolean getUsb();

        boolean getVpn();

        boolean getWifi();

        boolean getWifiAware();

        boolean hasBluetooth();

        boolean hasCellular();

        boolean hasEthernet();

        boolean hasLowpan();

        boolean hasSatellite();

        boolean hasThread();

        boolean hasUsb();

        boolean hasVpn();

        boolean hasWifi();

        boolean hasWifiAware();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private NetworkCapabilityTransportsOuterClass() {
    }

    public static final class NetworkCapabilityTransports extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports, gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder> implements gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder {
        public static final int BLUETOOTH_FIELD_NUMBER = 1;
        public static final int CELLULAR_FIELD_NUMBER = 2;
        private static final gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports DEFAULT_INSTANCE;
        public static final int ETHERNET_FIELD_NUMBER = 3;
        public static final int LOWPAN_FIELD_NUMBER = 4;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports> PARSER = null;
        public static final int SATELLITE_FIELD_NUMBER = 5;
        public static final int THREAD_FIELD_NUMBER = 6;
        public static final int USB_FIELD_NUMBER = 7;
        public static final int VPN_FIELD_NUMBER = 8;
        public static final int WIFI_AWARE_FIELD_NUMBER = 10;
        public static final int WIFI_FIELD_NUMBER = 9;
        private int bitField0_;
        private boolean bluetooth_;
        private boolean cellular_;
        private boolean ethernet_;
        private boolean lowpan_;
        private boolean satellite_;
        private boolean thread_;
        private boolean usb_;
        private boolean vpn_;
        private boolean wifiAware_;
        private boolean wifi_;

        private NetworkCapabilityTransports() {
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasBluetooth() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getBluetooth() {
            return this.bluetooth_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBluetooth(boolean z) {
            this.bitField0_ |= 1;
            this.bluetooth_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBluetooth() {
            this.bitField0_ &= -2;
            this.bluetooth_ = false;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasCellular() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getCellular() {
            return this.cellular_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCellular(boolean z) {
            this.bitField0_ |= 2;
            this.cellular_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCellular() {
            this.bitField0_ &= -3;
            this.cellular_ = false;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasEthernet() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getEthernet() {
            return this.ethernet_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEthernet(boolean z) {
            this.bitField0_ |= 4;
            this.ethernet_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEthernet() {
            this.bitField0_ &= -5;
            this.ethernet_ = false;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasLowpan() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getLowpan() {
            return this.lowpan_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLowpan(boolean z) {
            this.bitField0_ |= 8;
            this.lowpan_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLowpan() {
            this.bitField0_ &= -9;
            this.lowpan_ = false;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasSatellite() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getSatellite() {
            return this.satellite_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSatellite(boolean z) {
            this.bitField0_ |= 16;
            this.satellite_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSatellite() {
            this.bitField0_ &= -17;
            this.satellite_ = false;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasThread() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getThread() {
            return this.thread_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThread(boolean z) {
            this.bitField0_ |= 32;
            this.thread_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThread() {
            this.bitField0_ &= -33;
            this.thread_ = false;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasUsb() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getUsb() {
            return this.usb_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsb(boolean z) {
            this.bitField0_ |= 64;
            this.usb_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUsb() {
            this.bitField0_ &= -65;
            this.usb_ = false;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasVpn() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getVpn() {
            return this.vpn_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVpn(boolean z) {
            this.bitField0_ |= 128;
            this.vpn_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVpn() {
            this.bitField0_ &= -129;
            this.vpn_ = false;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasWifi() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getWifi() {
            return this.wifi_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifi(boolean z) {
            this.bitField0_ |= 256;
            this.wifi_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWifi() {
            this.bitField0_ &= -257;
            this.wifi_ = false;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasWifiAware() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getWifiAware() {
            return this.wifiAware_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifiAware(boolean z) {
            this.bitField0_ |= 512;
            this.wifiAware_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWifiAware() {
            this.bitField0_ &= -513;
            this.wifiAware_ = false;
        }

        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder newBuilder(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports) {
            return DEFAULT_INSTANCE.createBuilder(networkCapabilityTransports);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports, gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder> implements gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasBluetooth() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).hasBluetooth();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getBluetooth() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).getBluetooth();
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setBluetooth(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).setBluetooth(z);
                return this;
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearBluetooth() {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).clearBluetooth();
                return this;
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasCellular() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).hasCellular();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getCellular() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).getCellular();
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setCellular(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).setCellular(z);
                return this;
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearCellular() {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).clearCellular();
                return this;
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasEthernet() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).hasEthernet();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getEthernet() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).getEthernet();
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setEthernet(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).setEthernet(z);
                return this;
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearEthernet() {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).clearEthernet();
                return this;
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasLowpan() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).hasLowpan();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getLowpan() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).getLowpan();
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setLowpan(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).setLowpan(z);
                return this;
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearLowpan() {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).clearLowpan();
                return this;
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasSatellite() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).hasSatellite();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getSatellite() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).getSatellite();
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setSatellite(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).setSatellite(z);
                return this;
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearSatellite() {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).clearSatellite();
                return this;
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasThread() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).hasThread();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getThread() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).getThread();
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setThread(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).setThread(z);
                return this;
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearThread() {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).clearThread();
                return this;
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasUsb() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).hasUsb();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getUsb() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).getUsb();
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setUsb(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).setUsb(z);
                return this;
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearUsb() {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).clearUsb();
                return this;
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasVpn() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).hasVpn();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getVpn() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).getVpn();
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setVpn(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).setVpn(z);
                return this;
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearVpn() {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).clearVpn();
                return this;
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasWifi() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).hasWifi();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getWifi() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).getWifi();
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setWifi(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).setWifi(z);
                return this;
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearWifi() {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).clearWifi();
                return this;
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasWifiAware() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).hasWifiAware();
            }

            @Override // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getWifiAware() {
                return ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).getWifiAware();
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder setWifiAware(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).setWifiAware(z);
                return this;
            }

            public gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder clearWifiAware() {
                copyOnWrite();
                ((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) this.instance).clearWifiAware();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports();
                case 2:
                    return new gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t", new java.lang.Object[]{"bitField0_", "bluetooth_", "cellular_", "ethernet_", "lowpan_", "satellite_", "thread_", "usb_", "vpn_", "wifi_", "wifiAware_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.class) {
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
            gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports = new gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports();
            DEFAULT_INSTANCE = networkCapabilityTransports;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.class, networkCapabilityTransports);
        }

        public static gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$1, reason: invalid class name */
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
