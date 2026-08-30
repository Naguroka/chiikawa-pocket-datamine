package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzadl implements com.google.android.gms.internal.ads.zzadm {
    private final long zza;
    private final com.google.android.gms.internal.ads.zzadk zzb;

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final com.google.android.gms.internal.ads.zzadk zzg(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return false;
    }

    public zzadl(long j, long j2) {
        this.zza = j;
        com.google.android.gms.internal.ads.zzadn zzadnVar = j2 == 0 ? com.google.android.gms.internal.ads.zzadn.zza : new com.google.android.gms.internal.ads.zzadn(0L, j2);
        this.zzb = new com.google.android.gms.internal.ads.zzadk(zzadnVar, zzadnVar);
    }
}
