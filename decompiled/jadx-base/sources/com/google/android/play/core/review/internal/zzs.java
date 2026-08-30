package com.google.android.play.core.review.internal;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzs implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.play.core.review.internal.zzt zza;

    /* synthetic */ zzs(com.google.android.play.core.review.internal.zzt zztVar, com.google.android.play.core.review.internal.zzr zzrVar) {
        this.zza = zztVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.zza.zzc.zzd("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.zza.zzc().post(new com.google.android.play.core.review.internal.zzp(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.zza.zzc.zzd("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.zza.zzc().post(new com.google.android.play.core.review.internal.zzq(this));
    }
}
