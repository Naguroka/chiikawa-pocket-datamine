package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzclc implements com.google.android.gms.internal.ads.zzcla {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzclc(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(java.util.Map map) {
        this.zza.zzu(java.lang.Boolean.parseBoolean((java.lang.String) map.get("content_url_opted_out")));
    }
}
