package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionInfoCompat {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Protection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ProtectionFlags {
    }

    private PermissionInfoCompat() {
    }

    public static int getProtection(android.content.pm.PermissionInfo permissionInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.content.pm.PermissionInfoCompat.Api28Impl.getProtection(permissionInfo);
        }
        return permissionInfo.protectionLevel & 15;
    }

    public static int getProtectionFlags(android.content.pm.PermissionInfo permissionInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.content.pm.PermissionInfoCompat.Api28Impl.getProtectionFlags(permissionInfo);
        }
        return permissionInfo.protectionLevel & (-16);
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static int getProtection(android.content.pm.PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        static int getProtectionFlags(android.content.pm.PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }
}
