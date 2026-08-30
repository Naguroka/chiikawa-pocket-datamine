package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzj {
    private final java.lang.Class zza;
    private final java.lang.Object zzb;

    private zzj(java.lang.Class cls, java.lang.Object obj) {
        this.zza = cls;
        this.zzb = obj;
    }

    public static com.google.android.gms.internal.common.zzj zzb(java.lang.Class cls, java.lang.Object obj) {
        return new com.google.android.gms.internal.common.zzj(cls, obj);
    }

    public final java.lang.Class zzc() {
        return this.zza;
    }

    public final java.lang.Object zzd() {
        return this.zzb;
    }
}
