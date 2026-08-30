package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzazo {
    private final int zza;
    private final com.google.android.gms.internal.ads.zzazl zzb = new com.google.android.gms.internal.ads.zzazq();

    public zzazo(int i) {
        this.zza = i;
    }

    public final java.lang.String zza(java.util.ArrayList arrayList) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((java.lang.String) arrayList.get(i)).toLowerCase(java.util.Locale.US));
            sb.append('\n');
        }
        java.lang.String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        com.google.android.gms.internal.ads.zzazn zzaznVar = new com.google.android.gms.internal.ads.zzazn();
        java.util.PriorityQueue priorityQueue = new java.util.PriorityQueue(this.zza, new com.google.android.gms.internal.ads.zzazm(this));
        for (java.lang.String str : strArrSplit) {
            java.lang.String[] strArrZzb = com.google.android.gms.internal.ads.zzazp.zzb(str, false);
            if (strArrZzb.length != 0) {
                com.google.android.gms.internal.ads.zzazt.zzc(strArrZzb, this.zza, 6, priorityQueue);
            }
        }
        java.util.Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzaznVar.zzb.write(this.zzb.zzb(((com.google.android.gms.internal.ads.zzazs) it.next()).zzb));
            } catch (java.io.IOException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzaznVar.toString();
    }
}
