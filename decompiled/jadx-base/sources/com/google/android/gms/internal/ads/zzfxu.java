package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfxu extends com.google.android.gms.internal.ads.zzfvo {
    final /* synthetic */ java.util.Iterator zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfuo zzb;

    zzfxu(java.util.Iterator it, com.google.android.gms.internal.ads.zzfuo zzfuoVar) {
        this.zza = it;
        this.zzb = zzfuoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    @javax.annotation.CheckForNull
    protected final java.lang.Object zza() {
        while (this.zza.hasNext()) {
            java.util.Iterator it = this.zza;
            com.google.android.gms.internal.ads.zzfuo zzfuoVar = this.zzb;
            java.lang.Object next = it.next();
            if (zzfuoVar.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
