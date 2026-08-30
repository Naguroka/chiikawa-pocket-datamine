package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaci implements com.google.android.gms.internal.ads.zzadt {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ int zzf(com.google.android.gms.internal.ads.zzl zzlVar, int i, boolean z) {
        return com.google.android.gms.internal.ads.zzadr.zza(this, zzlVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzg(com.google.android.gms.internal.ads.zzl zzlVar, int i, boolean z, int i2) throws java.io.IOException {
        int iZza = zzlVar.zza(this.zza, 0, java.lang.Math.min(4096, i));
        if (iZza != -1) {
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ void zzl(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzm(com.google.android.gms.internal.ads.zzab zzabVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ void zzr(com.google.android.gms.internal.ads.zzdy zzdyVar, int i) {
        com.google.android.gms.internal.ads.zzadr.zzb(this, zzdyVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzs(com.google.android.gms.internal.ads.zzdy zzdyVar, int i, int i2) {
        zzdyVar.zzM(i);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzt(long j, int i, int i2, int i3, com.google.android.gms.internal.ads.zzads zzadsVar) {
    }
}
