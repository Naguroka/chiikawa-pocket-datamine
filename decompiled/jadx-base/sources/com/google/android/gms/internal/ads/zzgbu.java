package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgbu extends com.google.android.gms.internal.ads.zzgbh {

    @javax.annotation.CheckForNull
    private com.google.android.gms.internal.ads.zzgbt zza;

    zzgbu(com.google.android.gms.internal.ads.zzfxi zzfxiVar, boolean z, java.util.concurrent.Executor executor, java.util.concurrent.Callable callable) {
        super(zzfxiVar, z, false);
        this.zza = new com.google.android.gms.internal.ads.zzgbs(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    final void zzf(int i, @javax.annotation.CheckForNull java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    protected final void zzq() {
        com.google.android.gms.internal.ads.zzgbt zzgbtVar = this.zza;
        if (zzgbtVar != null) {
            zzgbtVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    final void zzu() {
        com.google.android.gms.internal.ads.zzgbt zzgbtVar = this.zza;
        if (zzgbtVar != null) {
            zzgbtVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    final void zzy(int i) {
        super.zzy(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
