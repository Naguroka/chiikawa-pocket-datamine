package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfcp {
    public static com.google.android.gms.ads.internal.client.zzs zza(android.content.Context context, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzfbp zzfbpVar = (com.google.android.gms.internal.ads.zzfbp) it.next();
            if (zzfbpVar.zzc) {
                arrayList.add(com.google.android.gms.ads.AdSize.FLUID);
            } else {
                arrayList.add(new com.google.android.gms.ads.AdSize(zzfbpVar.zza, zzfbpVar.zzb));
            }
        }
        return new com.google.android.gms.ads.internal.client.zzs(context, (com.google.android.gms.ads.AdSize[]) arrayList.toArray(new com.google.android.gms.ads.AdSize[arrayList.size()]));
    }

    public static com.google.android.gms.internal.ads.zzfbp zzb(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        return zzsVar.zzi ? new com.google.android.gms.internal.ads.zzfbp(-3, 0, true) : new com.google.android.gms.internal.ads.zzfbp(zzsVar.zze, zzsVar.zzb, false);
    }
}
