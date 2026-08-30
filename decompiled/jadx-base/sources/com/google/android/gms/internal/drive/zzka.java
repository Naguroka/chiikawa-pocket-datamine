package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzka {
    private static final com.google.android.gms.internal.drive.zzjy<?> zzoq = new com.google.android.gms.internal.drive.zzjz();
    private static final com.google.android.gms.internal.drive.zzjy<?> zzor = zzck();

    private static com.google.android.gms.internal.drive.zzjy<?> zzck() {
        try {
            return (com.google.android.gms.internal.drive.zzjy) java.lang.Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static com.google.android.gms.internal.drive.zzjy<?> zzcl() {
        return zzoq;
    }

    static com.google.android.gms.internal.drive.zzjy<?> zzcm() {
        com.google.android.gms.internal.drive.zzjy<?> zzjyVar = zzor;
        if (zzjyVar != null) {
            return zzjyVar;
        }
        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
