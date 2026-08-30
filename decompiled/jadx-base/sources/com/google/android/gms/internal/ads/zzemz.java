package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzemz implements com.google.android.gms.internal.ads.zzetq {
    private final com.google.android.gms.ads.internal.client.zzy zza;
    private final boolean zzb;

    public zzemz(com.google.android.gms.ads.internal.client.zzy zzyVar, boolean z) {
        this.zza = zzyVar;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.zzcuv) obj).zza;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfp)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        com.google.android.gms.ads.internal.client.zzy zzyVar = this.zza;
        if (zzyVar != null) {
            int i = zzyVar.zza;
            if (i == 1) {
                bundle.putString("avo", androidx.media3.extractor.text.ttml.TtmlNode.TAG_P);
            } else if (i == 2) {
                bundle.putString("avo", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE);
            }
        }
    }
}
