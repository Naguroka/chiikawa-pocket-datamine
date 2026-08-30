package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzalz implements com.google.android.gms.internal.ads.zzaka {
    private final java.util.List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzalz(java.util.List list) {
        this.zza = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            com.google.android.gms.internal.ads.zzalo zzaloVar = (com.google.android.gms.internal.ads.zzalo) list.get(i);
            long[] jArr = this.zzb;
            int i2 = i + i;
            jArr[i2] = zzaloVar.zzb;
            jArr[i2 + 1] = zzaloVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = jArrCopyOf;
        java.util.Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final long zzb(int i) {
        com.google.android.gms.internal.ads.zzcw.zzd(i >= 0);
        com.google.android.gms.internal.ads.zzcw.zzd(i < this.zzc.length);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final java.util.List zzc(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i = 0; i < this.zza.size(); i++) {
            long[] jArr = this.zzb;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                com.google.android.gms.internal.ads.zzalo zzaloVar = (com.google.android.gms.internal.ads.zzalo) this.zza.get(i);
                com.google.android.gms.internal.ads.zzco zzcoVar = zzaloVar.zza;
                if (zzcoVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzaloVar);
                } else {
                    arrayList.add(zzcoVar);
                }
            }
        }
        java.util.Collections.sort(arrayList2, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.zzaly
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.compare(((com.google.android.gms.internal.ads.zzalo) obj).zzb, ((com.google.android.gms.internal.ads.zzalo) obj2).zzb);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            com.google.android.gms.internal.ads.zzcm zzcmVarZzb = ((com.google.android.gms.internal.ads.zzalo) arrayList2.get(i3)).zza.zzb();
            zzcmVarZzb.zze((-1) - i3, 1);
            arrayList.add(zzcmVarZzb.zzp());
        }
        return arrayList;
    }
}
