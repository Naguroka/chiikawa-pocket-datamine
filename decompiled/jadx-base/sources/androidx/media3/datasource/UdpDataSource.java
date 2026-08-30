package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class UdpDataSource extends androidx.media3.datasource.BaseDataSource {
    public static final int DEFAULT_MAX_PACKET_SIZE = 2000;
    public static final int DEFAULT_SOCKET_TIMEOUT_MILLIS = 8000;
    public static final int UDP_PORT_UNSET = -1;
    private java.net.InetAddress address;
    private java.net.MulticastSocket multicastSocket;
    private boolean opened;
    private final java.net.DatagramPacket packet;
    private final byte[] packetBuffer;
    private int packetRemaining;
    private java.net.DatagramSocket socket;
    private final int socketTimeoutMillis;
    private android.net.Uri uri;

    public static final class UdpDataSourceException extends androidx.media3.datasource.DataSourceException {
        public UdpDataSourceException(java.lang.Throwable th, int i) {
            super(th, i);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    public UdpDataSource(int i) {
        this(i, 8000);
    }

    public UdpDataSource(int i, int i2) {
        super(true);
        this.socketTimeoutMillis = i2;
        byte[] bArr = new byte[i];
        this.packetBuffer = bArr;
        this.packet = new java.net.DatagramPacket(bArr, 0, i);
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.UdpDataSource.UdpDataSourceException {
        android.net.Uri uri = dataSpec.uri;
        this.uri = uri;
        java.lang.String str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(uri.getHost());
        int port = this.uri.getPort();
        transferInitializing(dataSpec);
        try {
            this.address = java.net.InetAddress.getByName(str);
            java.net.InetSocketAddress inetSocketAddress = new java.net.InetSocketAddress(this.address, port);
            if (this.address.isMulticastAddress()) {
                java.net.MulticastSocket multicastSocket = new java.net.MulticastSocket(inetSocketAddress);
                this.multicastSocket = multicastSocket;
                multicastSocket.joinGroup(this.address);
                this.socket = this.multicastSocket;
            } else {
                this.socket = new java.net.DatagramSocket(inetSocketAddress);
            }
            this.socket.setSoTimeout(this.socketTimeoutMillis);
            this.opened = true;
            transferStarted(dataSpec);
            return -1L;
        } catch (java.io.IOException e) {
            throw new androidx.media3.datasource.UdpDataSource.UdpDataSourceException(e, 2001);
        } catch (java.lang.SecurityException e2) {
            throw new androidx.media3.datasource.UdpDataSource.UdpDataSourceException(e2, 2006);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws androidx.media3.datasource.UdpDataSource.UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.packetRemaining == 0) {
            try {
                ((java.net.DatagramSocket) androidx.media3.common.util.Assertions.checkNotNull(this.socket)).receive(this.packet);
                int length = this.packet.getLength();
                this.packetRemaining = length;
                bytesTransferred(length);
            } catch (java.net.SocketTimeoutException e) {
                throw new androidx.media3.datasource.UdpDataSource.UdpDataSourceException(e, 2002);
            } catch (java.io.IOException e2) {
                throw new androidx.media3.datasource.UdpDataSource.UdpDataSourceException(e2, 2001);
            }
        }
        int length2 = this.packet.getLength();
        int i3 = this.packetRemaining;
        int iMin = java.lang.Math.min(i3, i2);
        java.lang.System.arraycopy(this.packetBuffer, length2 - i3, bArr, i, iMin);
        this.packetRemaining -= iMin;
        return iMin;
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.uri = null;
        java.net.MulticastSocket multicastSocket = this.multicastSocket;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((java.net.InetAddress) androidx.media3.common.util.Assertions.checkNotNull(this.address));
            } catch (java.io.IOException unused) {
            }
            this.multicastSocket = null;
        }
        java.net.DatagramSocket datagramSocket = this.socket;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.socket = null;
        }
        this.address = null;
        this.packetRemaining = 0;
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
    }

    public int getLocalPort() {
        java.net.DatagramSocket datagramSocket = this.socket;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }
}
