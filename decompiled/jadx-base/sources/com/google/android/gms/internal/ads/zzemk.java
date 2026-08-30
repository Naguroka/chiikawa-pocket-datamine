package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzemk implements com.google.android.gms.internal.ads.zzetr {
    private final java.util.Set zza;

    zzemk(java.util.Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) it.next());
        }
        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzemi(arrayList, null));
    }
}
