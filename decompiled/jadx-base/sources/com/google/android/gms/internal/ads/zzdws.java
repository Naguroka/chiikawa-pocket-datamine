package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdws implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;

    public zzdws(com.google.android.gms.internal.ads.zzhfj zzhfjVar) {
        this.zza = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final java.lang.String zzb() {
        java.lang.String packageName = ((com.google.android.gms.internal.ads.zzche) this.zza).zza().getPackageName();
        com.google.android.gms.internal.ads.zzhez.zzb(packageName);
        return packageName;
    }
}
