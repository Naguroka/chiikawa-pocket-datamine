package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaeg implements com.google.android.gms.internal.ads.zzaeb {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaeg(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static com.google.android.gms.internal.ads.zzaeg zzb(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        int iZzi = zzdyVar.zzi();
        zzdyVar.zzM(8);
        int iZzi2 = zzdyVar.zzi();
        int iZzi3 = zzdyVar.zzi();
        zzdyVar.zzM(4);
        int iZzi4 = zzdyVar.zzi();
        zzdyVar.zzM(12);
        return new com.google.android.gms.internal.ads.zzaeg(iZzi, iZzi2, iZzi3, iZzi4);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zza() {
        return androidx.media3.extractor.avi.AviExtractor.FOURCC_avih;
    }
}
