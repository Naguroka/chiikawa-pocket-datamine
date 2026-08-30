package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzge implements com.google.android.gms.internal.ads.zzfx {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzfx zzb;

    public zzge(android.content.Context context) {
        com.google.android.gms.internal.ads.zzgg zzggVar = new com.google.android.gms.internal.ads.zzgg();
        this.zza = context.getApplicationContext();
        this.zzb = zzggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfy zza() {
        return new com.google.android.gms.internal.ads.zzgf(this.zza, this.zzb.zza());
    }
}
