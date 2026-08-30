package com.google.android.play.core.review.internal;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzp extends com.google.android.play.core.review.internal.zzj {
    final /* synthetic */ android.os.IBinder zza;
    final /* synthetic */ com.google.android.play.core.review.internal.zzs zzb;

    zzp(com.google.android.play.core.review.internal.zzs zzsVar, android.os.IBinder iBinder) {
        this.zzb = zzsVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        this.zzb.zza.zzn = com.google.android.play.core.review.internal.zze.zzb(this.zza);
        com.google.android.play.core.review.internal.zzt.zzn(this.zzb.zza);
        this.zzb.zza.zzh = false;
        java.util.Iterator it = this.zzb.zza.zze.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        this.zzb.zza.zze.clear();
    }
}
