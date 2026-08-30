package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzla {
    private static final com.google.android.gms.internal.drive.zzla zztm;
    private static final com.google.android.gms.internal.drive.zzla zztn;

    private zzla() {
    }

    abstract void zza(java.lang.Object obj, long j);

    abstract <L> void zza(java.lang.Object obj, java.lang.Object obj2, long j);

    static com.google.android.gms.internal.drive.zzla zzdt() {
        return zztm;
    }

    static com.google.android.gms.internal.drive.zzla zzdu() {
        return zztn;
    }

    static {
        com.google.android.gms.internal.drive.zzlb zzlbVar = null;
        zztm = new com.google.android.gms.internal.drive.zzlc();
        zztn = new com.google.android.gms.internal.drive.zzld();
    }
}
