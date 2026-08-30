package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdpe implements com.google.android.gms.internal.ads.zzcwo {
    private final com.google.android.gms.internal.ads.zzcex zza;

    zzdpe(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        this.zza = zzcexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdh(android.content.Context context) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zza;
        if (zzcexVar != null) {
            zzcexVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdj(android.content.Context context) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zza;
        if (zzcexVar != null) {
            zzcexVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdk(android.content.Context context) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zza;
        if (zzcexVar != null) {
            zzcexVar.onResume();
        }
    }
}
