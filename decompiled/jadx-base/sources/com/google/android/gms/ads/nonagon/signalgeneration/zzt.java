package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzt extends java.util.LinkedHashMap {
    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzv zza;

    zzt(com.google.android.gms.ads.nonagon.signalgeneration.zzv zzvVar) {
        this.zza = zzvVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(java.util.Map.Entry entry) {
        synchronized (this.zza) {
            int size = size();
            com.google.android.gms.ads.nonagon.signalgeneration.zzv zzvVar = this.zza;
            if (size <= zzvVar.zza) {
                return false;
            }
            zzvVar.zzf.add(new android.util.Pair((java.lang.String) entry.getKey(), ((com.google.android.gms.ads.nonagon.signalgeneration.zzu) entry.getValue()).zzb));
            return size() > this.zza.zza;
        }
    }
}
