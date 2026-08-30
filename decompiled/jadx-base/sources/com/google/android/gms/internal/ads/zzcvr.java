package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcvr extends com.google.android.gms.internal.ads.zzdbj implements com.google.android.gms.ads.internal.client.zza {
    public zzcvr(java.util.Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzq(new com.google.android.gms.internal.ads.zzdbi() { // from class: com.google.android.gms.internal.ads.zzcvq
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.ads.internal.client.zza) obj).onAdClicked();
            }
        });
    }
}
