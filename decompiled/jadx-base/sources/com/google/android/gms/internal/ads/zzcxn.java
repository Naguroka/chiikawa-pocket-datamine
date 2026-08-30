package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcxn extends com.google.android.gms.internal.ads.zzdbj implements com.google.android.gms.internal.ads.zzbif {
    private final android.os.Bundle zzb;

    zzcxn(java.util.Set set) {
        super(set);
        this.zzb = new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final synchronized void zza(java.lang.String str, android.os.Bundle bundle) {
        this.zzb.putAll(bundle);
        zzq(new com.google.android.gms.internal.ads.zzdbi() { // from class: com.google.android.gms.internal.ads.zzcxm
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    public final synchronized android.os.Bundle zzb() {
        return new android.os.Bundle(this.zzb);
    }
}
