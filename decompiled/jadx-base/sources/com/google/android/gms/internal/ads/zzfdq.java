package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfdq implements com.google.android.gms.internal.ads.zzcvw {
    private final java.util.HashSet zza = new java.util.HashSet();
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzbzq zzc;

    public zzfdq(android.content.Context context, com.google.android.gms.internal.ads.zzbzq zzbzqVar) {
        this.zzb = context;
        this.zzc = zzbzqVar;
    }

    public final android.os.Bundle zzb() {
        return this.zzc.zzn(this.zzb, this);
    }

    public final synchronized void zzc(java.util.HashSet hashSet) {
        this.zza.clear();
        this.zza.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final synchronized void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.zzc.zzl(this.zza);
        }
    }
}
