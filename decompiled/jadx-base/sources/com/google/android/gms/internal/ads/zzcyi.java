package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcyi implements java.lang.Runnable {
    private final java.lang.ref.WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzcyl zzcylVar = (com.google.android.gms.internal.ads.zzcyl) this.zza.get();
        if (zzcylVar != null) {
            zzcylVar.zzq(new com.google.android.gms.internal.ads.zzdbi() { // from class: com.google.android.gms.internal.ads.zzcyg
                @Override // com.google.android.gms.internal.ads.zzdbi
                public final void zza(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.zzcyf) obj).zza();
                }
            });
        }
    }
}
