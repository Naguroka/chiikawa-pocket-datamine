package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzma {
    private static final com.google.android.gms.internal.drive.zzly zzuu = zzei();
    private static final com.google.android.gms.internal.drive.zzly zzuv = new com.google.android.gms.internal.drive.zzlz();

    static com.google.android.gms.internal.drive.zzly zzeg() {
        return zzuu;
    }

    static com.google.android.gms.internal.drive.zzly zzeh() {
        return zzuv;
    }

    private static com.google.android.gms.internal.drive.zzly zzei() {
        try {
            return (com.google.android.gms.internal.drive.zzly) java.lang.Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
