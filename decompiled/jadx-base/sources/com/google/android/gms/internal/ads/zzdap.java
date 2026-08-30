package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdap extends com.google.android.gms.internal.ads.zzdbj implements com.google.android.gms.internal.ads.zzbih {
    public zzdap(java.util.Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final synchronized void zzb(final java.lang.String str, final java.lang.String str2) {
        zzq(new com.google.android.gms.internal.ads.zzdbi() { // from class: com.google.android.gms.internal.ads.zzdao
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.ads.admanager.AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
