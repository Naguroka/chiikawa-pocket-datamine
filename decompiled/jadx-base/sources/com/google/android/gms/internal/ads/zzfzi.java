package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfzi extends com.google.android.gms.internal.ads.zzfvo {
    final java.util.Iterator zza;
    final /* synthetic */ java.util.Set zzb;
    final /* synthetic */ java.util.Set zzc;

    zzfzi(com.google.android.gms.internal.ads.zzfzj zzfzjVar, java.util.Set set, java.util.Set set2) {
        this.zzb = set;
        this.zzc = set2;
        this.zza = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    @javax.annotation.CheckForNull
    protected final java.lang.Object zza() {
        while (this.zza.hasNext()) {
            java.util.Iterator it = this.zza;
            java.util.Set set = this.zzc;
            java.lang.Object next = it.next();
            if (set.contains(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
