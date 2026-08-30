package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzflk {
    private static final com.google.android.gms.internal.ads.zzflk zza = new com.google.android.gms.internal.ads.zzflk();
    private final java.util.ArrayList zzb = new java.util.ArrayList();
    private final java.util.ArrayList zzc = new java.util.ArrayList();

    private zzflk() {
    }

    public static com.google.android.gms.internal.ads.zzflk zza() {
        return zza;
    }

    public final java.util.Collection zzb() {
        return java.util.Collections.unmodifiableCollection(this.zzc);
    }

    public final java.util.Collection zzc() {
        return java.util.Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(com.google.android.gms.internal.ads.zzfkt zzfktVar) {
        this.zzb.add(zzfktVar);
    }

    public final void zze(com.google.android.gms.internal.ads.zzfkt zzfktVar) {
        java.util.ArrayList arrayList = this.zzb;
        boolean zZzg = zzg();
        arrayList.remove(zzfktVar);
        this.zzc.remove(zzfktVar);
        if (!zZzg || zzg()) {
            return;
        }
        com.google.android.gms.internal.ads.zzfls.zzb().zzg();
    }

    public final void zzf(com.google.android.gms.internal.ads.zzfkt zzfktVar) {
        java.util.ArrayList arrayList = this.zzc;
        boolean zZzg = zzg();
        arrayList.add(zzfktVar);
        if (zZzg) {
            return;
        }
        com.google.android.gms.internal.ads.zzfls.zzb().zzf();
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
