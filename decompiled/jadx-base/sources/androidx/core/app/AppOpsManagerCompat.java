package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class AppOpsManagerCompat {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    private AppOpsManagerCompat() {
    }

    public static java.lang.String permissionToOp(java.lang.String str) {
        return androidx.core.app.AppOpsManagerCompat.Api23Impl.permissionToOp(str);
    }

    public static int noteOp(android.content.Context context, java.lang.String str, int i, java.lang.String str2) {
        return androidx.core.app.AppOpsManagerCompat.Api19Impl.noteOp((android.app.AppOpsManager) context.getSystemService("appops"), str, i, str2);
    }

    public static int noteOpNoThrow(android.content.Context context, java.lang.String str, int i, java.lang.String str2) {
        return androidx.core.app.AppOpsManagerCompat.Api19Impl.noteOpNoThrow((android.app.AppOpsManager) context.getSystemService("appops"), str, i, str2);
    }

    public static int noteProxyOp(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return androidx.core.app.AppOpsManagerCompat.Api23Impl.noteProxyOp((android.app.AppOpsManager) androidx.core.app.AppOpsManagerCompat.Api23Impl.getSystemService(context, android.app.AppOpsManager.class), str, str2);
    }

    public static int noteProxyOpNoThrow(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return androidx.core.app.AppOpsManagerCompat.Api23Impl.noteProxyOpNoThrow((android.app.AppOpsManager) androidx.core.app.AppOpsManagerCompat.Api23Impl.getSystemService(context, android.app.AppOpsManager.class), str, str2);
    }

    public static int checkOrNoteProxyOp(android.content.Context context, int i, java.lang.String str, java.lang.String str2) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.app.AppOpsManager systemService = androidx.core.app.AppOpsManagerCompat.Api29Impl.getSystemService(context);
            int iCheckOpNoThrow = androidx.core.app.AppOpsManagerCompat.Api29Impl.checkOpNoThrow(systemService, str, android.os.Binder.getCallingUid(), str2);
            return iCheckOpNoThrow != 0 ? iCheckOpNoThrow : androidx.core.app.AppOpsManagerCompat.Api29Impl.checkOpNoThrow(systemService, str, i, androidx.core.app.AppOpsManagerCompat.Api29Impl.getOpPackageName(context));
        }
        return noteProxyOpNoThrow(context, str, str2);
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static android.app.AppOpsManager getSystemService(android.content.Context context) {
            return (android.app.AppOpsManager) context.getSystemService(android.app.AppOpsManager.class);
        }

        static int checkOpNoThrow(android.app.AppOpsManager appOpsManager, java.lang.String str, int i, java.lang.String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        static java.lang.String getOpPackageName(android.content.Context context) {
            return context.getOpPackageName();
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static java.lang.String permissionToOp(java.lang.String str) {
            return android.app.AppOpsManager.permissionToOp(str);
        }

        static <T> T getSystemService(android.content.Context context, java.lang.Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static int noteProxyOp(android.app.AppOpsManager appOpsManager, java.lang.String str, java.lang.String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        static int noteProxyOpNoThrow(android.app.AppOpsManager appOpsManager, java.lang.String str, java.lang.String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static int noteOpNoThrow(android.app.AppOpsManager appOpsManager, java.lang.String str, int i, java.lang.String str2) {
            return appOpsManager.noteOpNoThrow(str, i, str2);
        }

        static int noteOp(android.app.AppOpsManager appOpsManager, java.lang.String str, int i, java.lang.String str2) {
            return appOpsManager.noteOp(str, i, str2);
        }
    }
}
