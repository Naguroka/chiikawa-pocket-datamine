package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcyc extends com.google.android.gms.internal.ads.zzdbj implements com.google.android.gms.internal.ads.zzcwn, com.google.android.gms.internal.ads.zzcxs {
    private final com.google.android.gms.internal.ads.zzfbo zzb;
    private final java.util.concurrent.atomic.AtomicBoolean zzc;

    public zzcyc(java.util.Set set, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        super(set);
        this.zzc = new java.util.concurrent.atomic.AtomicBoolean();
        this.zzb = zzfboVar;
    }

    private final void zza() {
        final com.google.android.gms.ads.internal.client.zzu zzuVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhI)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzuVar = this.zzb.zzae) != null && zzuVar.zza == 3) {
            zzq(new com.google.android.gms.internal.ads.zzdbi() { // from class: com.google.android.gms.internal.ads.zzcyb
                @Override // com.google.android.gms.internal.ads.zzdbi
                public final void zza(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.zzcye) obj).zzh(zzuVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxs
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zza();
        }
    }
}
