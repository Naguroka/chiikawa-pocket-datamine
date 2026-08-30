package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class MessageCompat {
    private static boolean sTryIsAsynchronous = true;
    private static boolean sTrySetAsynchronous = true;

    public static void setAsynchronous(android.os.Message message, boolean z) {
        androidx.core.os.MessageCompat.Api22Impl.setAsynchronous(message, z);
    }

    public static boolean isAsynchronous(android.os.Message message) {
        return androidx.core.os.MessageCompat.Api22Impl.isAsynchronous(message);
    }

    private MessageCompat() {
    }

    static class Api22Impl {
        private Api22Impl() {
        }

        static boolean isAsynchronous(android.os.Message message) {
            return message.isAsynchronous();
        }

        static void setAsynchronous(android.os.Message message, boolean z) {
            message.setAsynchronous(z);
        }
    }
}
