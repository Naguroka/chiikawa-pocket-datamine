package com.google.android.gms.games.internal.v2.resolution;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzb {
    zzb() {
    }

    public static com.google.android.gms.games.internal.v2.resolution.zzb zza() {
        return new com.google.android.gms.games.internal.v2.resolution.zzb();
    }

    public static final com.google.android.gms.tasks.Task zzb(android.app.Activity activity, android.app.PendingIntent pendingIntent) {
        com.google.android.gms.games.internal.v2.resolution.zza zzaVar = new com.google.android.gms.games.internal.v2.resolution.zza();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.google.android.gms.games.internal.v2.resolution.GamesResolutionActivity.class);
        intent.putExtra(com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, pendingIntent);
        intent.putExtra("resultReceiver", zzaVar);
        activity.startActivity(intent);
        return zzaVar.zza();
    }
}
