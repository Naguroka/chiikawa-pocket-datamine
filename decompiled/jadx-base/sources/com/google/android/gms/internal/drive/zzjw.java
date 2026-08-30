package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzjw {
    private static final java.lang.Class<?> zzok = zzce();

    private static java.lang.Class<?> zzce() {
        try {
            return java.lang.Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    public static com.google.android.gms.internal.drive.zzjx zzcf() {
        if (zzok != null) {
            try {
                return zzn("getEmptyRegistry");
            } catch (java.lang.Exception unused) {
            }
        }
        return com.google.android.gms.internal.drive.zzjx.zzoo;
    }

    static com.google.android.gms.internal.drive.zzjx zzcg() {
        com.google.android.gms.internal.drive.zzjx zzjxVarZzn;
        if (zzok != null) {
            try {
                zzjxVarZzn = zzn("loadGeneratedRegistry");
            } catch (java.lang.Exception unused) {
                zzjxVarZzn = null;
            }
        } else {
            zzjxVarZzn = null;
        }
        if (zzjxVarZzn == null) {
            zzjxVarZzn = com.google.android.gms.internal.drive.zzjx.zzcg();
        }
        return zzjxVarZzn == null ? zzcf() : zzjxVarZzn;
    }

    private static final com.google.android.gms.internal.drive.zzjx zzn(java.lang.String str) throws java.lang.Exception {
        return (com.google.android.gms.internal.drive.zzjx) zzok.getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
    }
}
