package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionChecker {
    public static final int PERMISSION_DENIED = -1;
    public static final int PERMISSION_DENIED_APP_OP = -2;
    public static final int PERMISSION_GRANTED = 0;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PermissionResult {
    }

    private PermissionChecker() {
    }

    public static int checkPermission(android.content.Context context, java.lang.String str, int i, int i2, java.lang.String str2) {
        int iNoteProxyOpNoThrow;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        java.lang.String strPermissionToOp = androidx.core.app.AppOpsManagerCompat.permissionToOp(str);
        if (strPermissionToOp == null) {
            return 0;
        }
        if (str2 == null) {
            java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (android.os.Process.myUid() == i2 && androidx.core.util.ObjectsCompat.equals(context.getPackageName(), str2)) {
            iNoteProxyOpNoThrow = androidx.core.app.AppOpsManagerCompat.checkOrNoteProxyOp(context, i2, strPermissionToOp, str2);
        } else {
            iNoteProxyOpNoThrow = androidx.core.app.AppOpsManagerCompat.noteProxyOpNoThrow(context, strPermissionToOp, str2);
        }
        return iNoteProxyOpNoThrow == 0 ? 0 : -2;
    }

    public static int checkSelfPermission(android.content.Context context, java.lang.String str) {
        return checkPermission(context, str, android.os.Process.myPid(), android.os.Process.myUid(), context.getPackageName());
    }

    public static int checkCallingPermission(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (android.os.Binder.getCallingPid() == android.os.Process.myPid()) {
            return -1;
        }
        return checkPermission(context, str, android.os.Binder.getCallingPid(), android.os.Binder.getCallingUid(), str2);
    }

    public static int checkCallingOrSelfPermission(android.content.Context context, java.lang.String str) {
        return checkPermission(context, str, android.os.Binder.getCallingPid(), android.os.Binder.getCallingUid(), android.os.Binder.getCallingPid() == android.os.Process.myPid() ? context.getPackageName() : null);
    }
}
