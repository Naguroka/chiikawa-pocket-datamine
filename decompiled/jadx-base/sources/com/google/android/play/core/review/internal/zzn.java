package com.google.android.play.core.review.internal;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzn extends com.google.android.play.core.review.internal.zzj {
    final /* synthetic */ com.google.android.play.core.review.internal.zzt zza;

    zzn(com.google.android.play.core.review.internal.zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        com.google.android.play.core.review.internal.zzt zztVar = this.zza;
        if (zztVar.zzn != null) {
            zztVar.zzc.zzd("Unbind from service.", new java.lang.Object[0]);
            com.google.android.play.core.review.internal.zzt zztVar2 = this.zza;
            zztVar2.zzb.unbindService(zztVar2.zzm);
            this.zza.zzh = false;
            this.zza.zzn = null;
            this.zza.zzm = null;
        }
        this.zza.zzt();
    }
}
