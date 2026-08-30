package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzafg implements com.google.android.gms.internal.ads.zzacq {
    private final long zzb;
    private final com.google.android.gms.internal.ads.zzacq zzc;

    public zzafg(long j, com.google.android.gms.internal.ads.zzacq zzacqVar) {
        this.zzb = j;
        this.zzc = zzacqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final void zzD() {
        this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final void zzO(com.google.android.gms.internal.ads.zzadm zzadmVar) {
        this.zzc.zzO(new com.google.android.gms.internal.ads.zzaff(this, zzadmVar, zzadmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final com.google.android.gms.internal.ads.zzadt zzw(int i, int i2) {
        return this.zzc.zzw(i, i2);
    }
}
