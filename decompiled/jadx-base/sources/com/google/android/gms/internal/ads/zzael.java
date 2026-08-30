package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzael implements com.google.android.gms.internal.ads.zzaeb {
    public final java.lang.String zza;

    private zzael(java.lang.String str) {
        this.zza = str;
    }

    public static com.google.android.gms.internal.ads.zzael zzb(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        return new com.google.android.gms.internal.ads.zzael(zzdyVar.zzB(zzdyVar.zzb(), java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zza() {
        return androidx.media3.extractor.avi.AviExtractor.FOURCC_strn;
    }
}
