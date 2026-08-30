package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzgbr extends com.google.android.gms.internal.ads.zzgbh {

    @javax.annotation.CheckForNull
    private java.util.List zza;

    zzgbr(com.google.android.gms.internal.ads.zzfxi zzfxiVar, boolean z) {
        super(zzfxiVar, z, true);
        java.util.List listEmptyList = zzfxiVar.isEmpty() ? java.util.Collections.emptyList() : com.google.android.gms.internal.ads.zzfyd.zza(zzfxiVar.size());
        for (int i = 0; i < zzfxiVar.size(); i++) {
            listEmptyList.add(null);
        }
        this.zza = listEmptyList;
    }

    abstract java.lang.Object zzG(java.util.List list);

    @Override // com.google.android.gms.internal.ads.zzgbh
    final void zzf(int i, java.lang.Object obj) {
        java.util.List list = this.zza;
        if (list != null) {
            list.set(i, new com.google.android.gms.internal.ads.zzgbq(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    final void zzu() {
        java.util.List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    final void zzy(int i) {
        super.zzy(i);
        this.zza = null;
    }
}
