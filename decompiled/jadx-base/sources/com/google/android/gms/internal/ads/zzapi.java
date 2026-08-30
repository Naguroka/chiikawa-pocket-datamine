package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzapi {
    public final int zza;
    public final byte[] zzb;
    public final java.util.Map zzc;
    public final java.util.List zzd;
    public final boolean zze;

    private zzapi(int i, byte[] bArr, java.util.Map map, java.util.List list, boolean z, long j) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = map;
        this.zzd = list == null ? null : java.util.Collections.unmodifiableList(list);
        this.zze = z;
    }

    private static java.util.List zza(java.util.Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            arrayList.add(new com.google.android.gms.internal.ads.zzape((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue()));
        }
        return arrayList;
    }

    @java.lang.Deprecated
    public zzapi(int i, byte[] bArr, java.util.Map map, boolean z, long j) {
        this(i, bArr, map, zza(map), z, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzapi(int i, byte[] bArr, boolean z, long j, java.util.List list) {
        java.util.Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = java.util.Collections.emptyMap();
        } else {
            treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.ads.zzape zzapeVar = (com.google.android.gms.internal.ads.zzape) it.next();
                treeMap.put(zzapeVar.zza(), zzapeVar.zzb());
            }
        }
        this(i, bArr, treeMap, list, z, j);
    }

    @java.lang.Deprecated
    public zzapi(byte[] bArr, java.util.Map map) {
        this(200, bArr, map, zza(map), false, 0L);
    }
}
