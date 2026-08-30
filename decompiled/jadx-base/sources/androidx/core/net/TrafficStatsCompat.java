package androidx.core.net;

/* JADX INFO: loaded from: classes.dex */
public final class TrafficStatsCompat {
    @java.lang.Deprecated
    public static void clearThreadStatsTag() {
        android.net.TrafficStats.clearThreadStatsTag();
    }

    @java.lang.Deprecated
    public static int getThreadStatsTag() {
        return android.net.TrafficStats.getThreadStatsTag();
    }

    @java.lang.Deprecated
    public static void incrementOperationCount(int i) {
        android.net.TrafficStats.incrementOperationCount(i);
    }

    @java.lang.Deprecated
    public static void incrementOperationCount(int i, int i2) {
        android.net.TrafficStats.incrementOperationCount(i, i2);
    }

    @java.lang.Deprecated
    public static void setThreadStatsTag(int i) {
        android.net.TrafficStats.setThreadStatsTag(i);
    }

    @java.lang.Deprecated
    public static void tagSocket(java.net.Socket socket) throws java.net.SocketException {
        android.net.TrafficStats.tagSocket(socket);
    }

    @java.lang.Deprecated
    public static void untagSocket(java.net.Socket socket) throws java.net.SocketException {
        android.net.TrafficStats.untagSocket(socket);
    }

    public static void tagDatagramSocket(java.net.DatagramSocket datagramSocket) throws java.net.SocketException {
        androidx.core.net.TrafficStatsCompat.Api24Impl.tagDatagramSocket(datagramSocket);
    }

    public static void untagDatagramSocket(java.net.DatagramSocket datagramSocket) throws java.net.SocketException {
        androidx.core.net.TrafficStatsCompat.Api24Impl.untagDatagramSocket(datagramSocket);
    }

    private TrafficStatsCompat() {
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void tagDatagramSocket(java.net.DatagramSocket datagramSocket) throws java.net.SocketException {
            android.net.TrafficStats.tagDatagramSocket(datagramSocket);
        }

        static void untagDatagramSocket(java.net.DatagramSocket datagramSocket) throws java.net.SocketException {
            android.net.TrafficStats.untagDatagramSocket(datagramSocket);
        }
    }
}
