package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfyn extends com.google.android.gms.internal.ads.zzfyr {
    final /* synthetic */ java.util.Comparator zza;

    zzfyn(java.util.Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfyr
    final java.util.Map zza() {
        return new java.util.TreeMap(this.zza);
    }
}
