package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdeh extends com.google.android.gms.internal.ads.zzdbj {
    zzdeh(java.util.Set set) {
        super(set);
    }

    public final synchronized void zza(final com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        zzq(new com.google.android.gms.internal.ads.zzdbi() { // from class: com.google.android.gms.internal.ads.zzdef
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzdee) obj).zze(zzbkVar);
            }
        });
    }

    public final synchronized void zzb(final java.lang.String str) {
        zzq(new com.google.android.gms.internal.ads.zzdbi() { // from class: com.google.android.gms.internal.ads.zzdeg
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzdee) obj).zzf(str);
            }
        });
    }
}
