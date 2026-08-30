package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzflj extends com.google.android.gms.internal.ads.zzflm {
    private static final com.google.android.gms.internal.ads.zzflj zzb = new com.google.android.gms.internal.ads.zzflj();

    private zzflj() {
    }

    public static com.google.android.gms.internal.ads.zzflj zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzflm
    public final void zzb(boolean z) {
        java.util.Iterator it = com.google.android.gms.internal.ads.zzflk.zza().zzc().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzfkt) it.next()).zzg().zzk(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflm
    public final boolean zzc() {
        java.util.Iterator it = com.google.android.gms.internal.ads.zzflk.zza().zzb().iterator();
        while (it.hasNext()) {
            android.view.View viewZzf = ((com.google.android.gms.internal.ads.zzfkt) it.next()).zzf();
            if (viewZzf != null && viewZzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
