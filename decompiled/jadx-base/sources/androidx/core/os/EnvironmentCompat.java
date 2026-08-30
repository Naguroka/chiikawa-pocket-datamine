package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class EnvironmentCompat {
    public static final java.lang.String MEDIA_UNKNOWN = "unknown";
    private static final java.lang.String TAG = "EnvironmentCompat";

    public static java.lang.String getStorageState(java.io.File file) {
        return androidx.core.os.EnvironmentCompat.Api21Impl.getExternalStorageState(file);
    }

    private EnvironmentCompat() {
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static java.lang.String getExternalStorageState(java.io.File file) {
            return android.os.Environment.getExternalStorageState(file);
        }
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static java.lang.String getStorageState(java.io.File file) {
            return android.os.Environment.getStorageState(file);
        }
    }
}
