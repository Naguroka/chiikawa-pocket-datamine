package androidx.media3.exoplayer.util;

/* JADX INFO: loaded from: classes.dex */
public final class SntpClient {
    public static final java.lang.String DEFAULT_NTP_HOST = "time.android.com";
    private static final int NTP_LEAP_NOSYNC = 3;
    private static final int NTP_MODE_BROADCAST = 5;
    private static final int NTP_MODE_CLIENT = 3;
    private static final int NTP_MODE_SERVER = 4;
    private static final int NTP_PACKET_SIZE = 48;
    private static final int NTP_PORT = 123;
    private static final int NTP_STRATUM_DEATH = 0;
    private static final int NTP_STRATUM_MAX = 15;
    private static final int NTP_VERSION = 3;
    private static final long OFFSET_1900_TO_1970 = 2208988800L;
    private static final int ORIGINATE_TIME_OFFSET = 24;
    private static final int RECEIVE_TIME_OFFSET = 32;
    private static final int TIMEOUT_MS = 10000;
    private static final int TRANSMIT_TIME_OFFSET = 40;
    private static long elapsedRealtimeOffsetMs = 0;
    private static boolean isInitialized = false;
    private static java.lang.String ntpHost = "time.android.com";
    private static final java.lang.Object loaderLock = new java.lang.Object();
    private static final java.lang.Object valueLock = new java.lang.Object();

    public interface InitializationCallback {
        void onInitializationFailed(java.io.IOException iOException);

        void onInitialized();
    }

    private SntpClient() {
    }

    public static java.lang.String getNtpHost() {
        java.lang.String str;
        synchronized (valueLock) {
            str = ntpHost;
        }
        return str;
    }

    public static void setNtpHost(java.lang.String str) {
        synchronized (valueLock) {
            if (!ntpHost.equals(str)) {
                ntpHost = str;
                isInitialized = false;
            }
        }
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (valueLock) {
            z = isInitialized;
        }
        return z;
    }

    public static long getElapsedRealtimeOffsetMs() {
        long j;
        synchronized (valueLock) {
            j = isInitialized ? elapsedRealtimeOffsetMs : androidx.media3.common.C.TIME_UNSET;
        }
        return j;
    }

    public static void initialize(androidx.media3.exoplayer.upstream.Loader loader, androidx.media3.exoplayer.util.SntpClient.InitializationCallback initializationCallback) {
        if (isInitialized()) {
            if (initializationCallback != null) {
                initializationCallback.onInitialized();
            }
        } else {
            if (loader == null) {
                loader = new androidx.media3.exoplayer.upstream.Loader("SntpClient");
            }
            loader.startLoading(new androidx.media3.exoplayer.util.SntpClient.NtpTimeLoadable(), new androidx.media3.exoplayer.util.SntpClient.NtpTimeCallback(initializationCallback), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long loadNtpTimeOffsetMs() throws java.io.IOException {
        java.net.InetAddress byName = java.net.InetAddress.getByName(getNtpHost());
        java.net.DatagramSocket datagramSocket = new java.net.DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            java.net.DatagramPacket datagramPacket = new java.net.DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            writeTimestamp(bArr, 40, jCurrentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new java.net.DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            long j = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            byte b = bArr[0];
            int i = bArr[1] & 255;
            long timestamp = readTimestamp(bArr, 24);
            long timestamp2 = readTimestamp(bArr, 32);
            long timestamp3 = readTimestamp(bArr, 40);
            checkValidServerReply((byte) ((b >> 6) & 3), (byte) (b & 7), i, timestamp3);
            long j2 = (j + (((timestamp2 - timestamp) + (timestamp3 - j)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j2;
        } catch (java.lang.Throwable th) {
            try {
                datagramSocket.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static long readTimestamp(byte[] bArr, int i) {
        long j = read32(bArr, i);
        long j2 = read32(bArr, i + 4);
        if (j == 0 && j2 == 0) {
            return 0L;
        }
        return ((j - OFFSET_1900_TO_1970) * 1000) + ((j2 * 1000) / 4294967296L);
    }

    private static void writeTimestamp(byte[] bArr, int i, long j) {
        if (j == 0) {
            java.util.Arrays.fill(bArr, i, i + 8, (byte) 0);
            return;
        }
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        long j4 = j2 + OFFSET_1900_TO_1970;
        int i2 = i + 1;
        bArr[i] = (byte) (j4 >> 24);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (j4 >> 16);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (j4 >> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (j4 >> 0);
        long j5 = (j3 * 4294967296L) / 1000;
        int i6 = i5 + 1;
        bArr[i5] = (byte) (j5 >> 24);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (j5 >> 16);
        bArr[i7] = (byte) (j5 >> 8);
        bArr[i7 + 1] = (byte) (java.lang.Math.random() * 255.0d);
    }

    private static long read32(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    private static void checkValidServerReply(byte b, byte b2, int i, long j) throws java.io.IOException {
        if (b == 3) {
            throw new java.io.IOException("SNTP: Unsynchronized server");
        }
        if (b2 != 4 && b2 != 5) {
            throw new java.io.IOException("SNTP: Untrusted mode: " + ((int) b2));
        }
        if (i == 0 || i > 15) {
            throw new java.io.IOException("SNTP: Untrusted stratum: " + i);
        }
        if (j == 0) {
            throw new java.io.IOException("SNTP: Zero transmitTime");
        }
    }

    private static final class NtpTimeLoadable implements androidx.media3.exoplayer.upstream.Loader.Loadable {
        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        private NtpTimeLoadable() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void load() throws java.io.IOException {
            synchronized (androidx.media3.exoplayer.util.SntpClient.loaderLock) {
                synchronized (androidx.media3.exoplayer.util.SntpClient.valueLock) {
                    if (androidx.media3.exoplayer.util.SntpClient.isInitialized) {
                        return;
                    }
                    long jLoadNtpTimeOffsetMs = androidx.media3.exoplayer.util.SntpClient.loadNtpTimeOffsetMs();
                    synchronized (androidx.media3.exoplayer.util.SntpClient.valueLock) {
                        long unused = androidx.media3.exoplayer.util.SntpClient.elapsedRealtimeOffsetMs = jLoadNtpTimeOffsetMs;
                        boolean unused2 = androidx.media3.exoplayer.util.SntpClient.isInitialized = true;
                    }
                }
            }
        }
    }

    private static final class NtpTimeCallback implements androidx.media3.exoplayer.upstream.Loader.Callback<androidx.media3.exoplayer.upstream.Loader.Loadable> {
        private final androidx.media3.exoplayer.util.SntpClient.InitializationCallback callback;

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(androidx.media3.exoplayer.upstream.Loader.Loadable loadable, long j, long j2, boolean z) {
        }

        public NtpTimeCallback(androidx.media3.exoplayer.util.SntpClient.InitializationCallback initializationCallback) {
            this.callback = initializationCallback;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(androidx.media3.exoplayer.upstream.Loader.Loadable loadable, long j, long j2) {
            if (this.callback != null) {
                if (!androidx.media3.exoplayer.util.SntpClient.isInitialized()) {
                    this.callback.onInitializationFailed(new java.io.IOException(new java.util.ConcurrentModificationException()));
                } else {
                    this.callback.onInitialized();
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onLoadError(androidx.media3.exoplayer.upstream.Loader.Loadable loadable, long j, long j2, java.io.IOException iOException, int i) {
            androidx.media3.exoplayer.util.SntpClient.InitializationCallback initializationCallback = this.callback;
            if (initializationCallback != null) {
                initializationCallback.onInitializationFailed(iOException);
            }
            return androidx.media3.exoplayer.upstream.Loader.DONT_RETRY;
        }
    }
}
