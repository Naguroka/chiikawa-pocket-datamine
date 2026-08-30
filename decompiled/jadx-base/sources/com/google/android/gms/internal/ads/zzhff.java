package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhff implements com.google.android.gms.internal.ads.zzher {
    private final java.util.List zza;
    private final java.util.List zzb;

    static {
        com.google.android.gms.internal.ads.zzhes.zza(java.util.Collections.emptySet());
    }

    /* synthetic */ zzhff(java.util.List list, java.util.List list2, com.google.android.gms.internal.ads.zzhfd zzhfdVar) {
        this.zza = list;
        this.zzb = list2;
    }

    public static com.google.android.gms.internal.ads.zzhfe zza(int i, int i2) {
        return new com.google.android.gms.internal.ads.zzhfe(i, i2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final java.util.Set zzb() {
        int size = this.zza.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(this.zzb.size());
        int size2 = this.zzb.size();
        for (int i = 0; i < size2; i++) {
            java.util.Collection collection = (java.util.Collection) ((com.google.android.gms.internal.ads.zzhfa) this.zzb.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        java.util.HashSet hashSetZza = com.google.android.gms.internal.ads.zzheo.zza(size);
        int size3 = this.zza.size();
        for (int i2 = 0; i2 < size3; i2++) {
            java.lang.Object objZzb = ((com.google.android.gms.internal.ads.zzhfa) this.zza.get(i2)).zzb();
            objZzb.getClass();
            hashSetZza.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (java.lang.Object obj : (java.util.Collection) arrayList.get(i3)) {
                obj.getClass();
                hashSetZza.add(obj);
            }
        }
        return java.util.Collections.unmodifiableSet(hashSetZza);
    }
}
