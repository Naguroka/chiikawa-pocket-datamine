package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgbk extends com.google.android.gms.internal.ads.zzgbi {
    private zzgbk() {
        throw null;
    }

    /* synthetic */ zzgbk(com.google.android.gms.internal.ads.zzgbl zzgblVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    final int zza(com.google.android.gms.internal.ads.zzgbm zzgbmVar) {
        int i;
        synchronized (zzgbmVar) {
            i = zzgbmVar.remaining - 1;
            zzgbmVar.remaining = i;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    final void zzb(com.google.android.gms.internal.ads.zzgbm zzgbmVar, @javax.annotation.CheckForNull java.util.Set set, java.util.Set set2) {
        synchronized (zzgbmVar) {
            if (zzgbmVar.seenExceptions == null) {
                zzgbmVar.seenExceptions = set2;
            }
        }
    }
}
