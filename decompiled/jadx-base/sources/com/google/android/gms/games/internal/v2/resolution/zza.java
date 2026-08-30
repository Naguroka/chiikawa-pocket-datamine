package com.google.android.gms.games.internal.v2.resolution;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zza extends android.os.ResultReceiver {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    public zza() {
        super(new com.google.android.gms.internal.games_v2.zzfa(android.os.Looper.getMainLooper()));
        this.zza = new com.google.android.gms.tasks.TaskCompletionSource();
    }

    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i, android.os.Bundle bundle) {
        android.content.Intent intent;
        super.onReceiveResult(i, bundle);
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(i == -1);
        if (bundle == null || (intent = (android.content.Intent) bundle.getParcelable("resultData")) == null) {
            intent = new android.content.Intent();
        }
        this.zza.trySetResult(boolValueOf.booleanValue() ? com.google.android.gms.games.internal.v2.resolution.zzc.zzc(intent) : com.google.android.gms.games.internal.v2.resolution.zzc.zzb(intent));
    }

    public final com.google.android.gms.tasks.Task zza() {
        return this.zza.getTask();
    }
}
