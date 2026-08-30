package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zztp implements com.google.android.gms.internal.ads.zzwa {
    private final com.google.android.gms.internal.ads.zzwa zza;
    private final com.google.android.gms.internal.ads.zzfxn zzb;

    public zztp(com.google.android.gms.internal.ads.zzwa zzwaVar, java.util.List list) {
        this.zza = zzwaVar;
        this.zzb = com.google.android.gms.internal.ads.zzfxn.zzl(list);
    }

    public final com.google.android.gms.internal.ads.zzfxn zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final long zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final boolean zzo(com.google.android.gms.internal.ads.zzkj zzkjVar) {
        return this.zza.zzo(zzkjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
