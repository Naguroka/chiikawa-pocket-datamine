package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfdn {
    static com.google.android.gms.tasks.Task zza;
    public static com.google.android.gms.appset.AppSetIdClient zzb;
    private static final java.lang.Object zzc = new java.lang.Object();

    public static com.google.android.gms.tasks.Task zza(android.content.Context context) {
        com.google.android.gms.tasks.Task task;
        zzb(context, false);
        synchronized (zzc) {
            task = zza;
        }
        return task;
    }

    public static void zzb(android.content.Context context, boolean z) {
        synchronized (zzc) {
            if (zzb == null) {
                zzb = com.google.android.gms.appset.AppSet.getClient(context);
            }
            com.google.android.gms.tasks.Task task = zza;
            if (task == null || ((task.isComplete() && !zza.isSuccessful()) || (z && zza.isComplete()))) {
                zza = ((com.google.android.gms.appset.AppSetIdClient) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzb, "the appSetIdClient shouldn't be null")).getAppSetIdInfo();
            }
        }
    }
}
