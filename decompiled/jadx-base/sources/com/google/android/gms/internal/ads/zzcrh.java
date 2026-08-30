package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcrh implements com.google.android.gms.internal.ads.zzegr {
    public final java.util.List zza;

    public zzcrh(com.google.android.gms.internal.ads.zzcqz zzcqzVar) {
        this.zza = java.util.Collections.singletonList(com.google.android.gms.internal.ads.zzgch.zzh(zzcqzVar));
    }

    public zzcrh(java.util.List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzegr
    public final void zzr() {
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzgch.zzr((com.google.common.util.concurrent.ListenableFuture) it.next(), new com.google.android.gms.internal.ads.zzcrg(this), com.google.android.gms.internal.ads.zzgcz.zzc());
        }
    }
}
