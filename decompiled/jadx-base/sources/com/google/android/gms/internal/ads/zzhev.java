package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhev extends com.google.android.gms.internal.ads.zzhen {
    static {
        com.google.android.gms.internal.ads.zzhes.zza(java.util.Collections.emptyMap());
    }

    /* synthetic */ zzhev(java.util.Map map, com.google.android.gms.internal.ads.zzhet zzhetVar) {
        super(map);
    }

    public static com.google.android.gms.internal.ads.zzheu zzc(int i) {
        return new com.google.android.gms.internal.ads.zzheu(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final java.util.Map zzb() {
        java.util.LinkedHashMap linkedHashMapZzb = com.google.android.gms.internal.ads.zzheo.zzb(zza().size());
        for (java.util.Map.Entry entry : zza().entrySet()) {
            linkedHashMapZzb.put(entry.getKey(), ((com.google.android.gms.internal.ads.zzhfa) entry.getValue()).zzb());
        }
        return java.util.Collections.unmodifiableMap(linkedHashMapZzb);
    }
}
