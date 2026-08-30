package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzvh implements com.google.android.gms.internal.ads.zzvy {
    final /* synthetic */ com.google.android.gms.internal.ads.zzvk zza;
    private final int zzb;

    public zzvh(com.google.android.gms.internal.ads.zzvk zzvkVar, int i) {
        this.zza = zzvkVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zza(com.google.android.gms.internal.ads.zzke zzkeVar, com.google.android.gms.internal.ads.zzhh zzhhVar, int i) {
        return this.zza.zzg(this.zzb, zzkeVar, zzhhVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zzb(long j) {
        return this.zza.zzi(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzd() throws java.io.IOException {
        this.zza.zzI(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final boolean zze() {
        return this.zza.zzP(this.zzb);
    }
}
