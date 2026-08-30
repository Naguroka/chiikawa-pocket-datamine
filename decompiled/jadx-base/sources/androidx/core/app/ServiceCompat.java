package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class ServiceCompat {
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StopForegroundFlags {
    }

    private ServiceCompat() {
    }

    public static void stopForeground(android.app.Service service, int i) {
        androidx.core.app.ServiceCompat.Api24Impl.stopForeground(service, i);
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void stopForeground(android.app.Service service, int i) {
            service.stopForeground(i);
        }
    }
}
