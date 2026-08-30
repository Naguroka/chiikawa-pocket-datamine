package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzccx implements java.lang.Iterable {
    private final java.util.List zza = new java.util.ArrayList();

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.zza.iterator();
    }

    final com.google.android.gms.internal.ads.zzccw zza(com.google.android.gms.internal.ads.zzcbs zzcbsVar) {
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzccw zzccwVar = (com.google.android.gms.internal.ads.zzccw) it.next();
            if (zzccwVar.zza == zzcbsVar) {
                return zzccwVar;
            }
        }
        return null;
    }

    public final void zzb(com.google.android.gms.internal.ads.zzccw zzccwVar) {
        this.zza.add(zzccwVar);
    }

    public final void zzc(com.google.android.gms.internal.ads.zzccw zzccwVar) {
        this.zza.remove(zzccwVar);
    }

    public final boolean zzd(com.google.android.gms.internal.ads.zzcbs zzcbsVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzccw zzccwVar = (com.google.android.gms.internal.ads.zzccw) it.next();
            if (zzccwVar.zza == zzcbsVar) {
                arrayList.add(zzccwVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((com.google.android.gms.internal.ads.zzccw) it2.next()).zzb.zzf();
        }
        return true;
    }
}
