package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzahp extends com.google.android.gms.internal.ads.zzacb implements com.google.android.gms.internal.ads.zzahu {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzahp(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, false);
        this.zza = j2;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j == -1 ? -1L : j;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final int zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zze(long j) {
        return zzb(j);
    }

    public final com.google.android.gms.internal.ads.zzahp zzf(long j) {
        return new com.google.android.gms.internal.ads.zzahp(j, this.zza, this.zzb, this.zzc, false);
    }
}
