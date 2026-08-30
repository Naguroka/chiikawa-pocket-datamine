package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhc {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhe zza;
    private final int zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzhc(com.google.android.gms.measurement.internal.zzhe zzheVar, int i, boolean z, boolean z2) {
        this.zza = zzheVar;
        this.zzb = i;
        this.zzc = z;
        this.zzd = z2;
    }

    public final void zza(java.lang.String str) {
        this.zza.zzu(this.zzb, this.zzc, this.zzd, str, null, null, null);
    }

    public final void zzb(java.lang.String str, java.lang.Object obj) {
        this.zza.zzu(this.zzb, this.zzc, this.zzd, str, obj, null, null);
    }

    public final void zzc(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        this.zza.zzu(this.zzb, this.zzc, this.zzd, str, obj, obj2, null);
    }

    public final void zzd(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.zza.zzu(this.zzb, this.zzc, this.zzd, str, obj, obj2, obj3);
    }
}
