package com.google.android.play.core.review.internal;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzm extends com.google.android.play.core.review.internal.zzj {
    final /* synthetic */ com.google.android.play.core.review.internal.zzj zza;
    final /* synthetic */ com.google.android.play.core.review.internal.zzt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzm(com.google.android.play.core.review.internal.zzt zztVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.play.core.review.internal.zzj zzjVar) {
        super(taskCompletionSource);
        this.zzb = zztVar;
        this.zza = zzjVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        com.google.android.play.core.review.internal.zzt.zzm(this.zzb, this.zza);
    }
}
