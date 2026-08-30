package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgbp extends com.google.android.gms.internal.ads.zzgbr {
    zzgbp(com.google.android.gms.internal.ads.zzfxi zzfxiVar, boolean z) {
        super(zzfxiVar, z);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgbr
    public final /* bridge */ /* synthetic */ java.lang.Object zzG(java.util.List list) {
        java.util.ArrayList arrayListZza = com.google.android.gms.internal.ads.zzfyd.zza(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzgbq zzgbqVar = (com.google.android.gms.internal.ads.zzgbq) it.next();
            arrayListZza.add(zzgbqVar != null ? zzgbqVar.zza : null);
        }
        return java.util.Collections.unmodifiableList(arrayListZza);
    }
}
