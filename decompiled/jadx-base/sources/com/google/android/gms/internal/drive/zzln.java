package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzln {
    private static final com.google.android.gms.internal.drive.zzll zztz = zzeb();
    private static final com.google.android.gms.internal.drive.zzll zzua = new com.google.android.gms.internal.drive.zzlm();

    static com.google.android.gms.internal.drive.zzll zzdz() {
        return zztz;
    }

    static com.google.android.gms.internal.drive.zzll zzea() {
        return zzua;
    }

    private static com.google.android.gms.internal.drive.zzll zzeb() {
        try {
            return (com.google.android.gms.internal.drive.zzll) java.lang.Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
