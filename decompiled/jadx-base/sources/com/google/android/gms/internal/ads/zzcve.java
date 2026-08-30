package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcve implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzcvc zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;

    public zzcve(com.google.android.gms.internal.ads.zzcvc zzcvcVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar) {
        this.zza = zzcvcVar;
        this.zzb = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        android.content.Context contextZzb = this.zza.zzb(((com.google.android.gms.internal.ads.zzche) this.zzb).zza());
        com.google.android.gms.internal.ads.zzhez.zzb(contextZzb);
        return contextZzb;
    }
}
