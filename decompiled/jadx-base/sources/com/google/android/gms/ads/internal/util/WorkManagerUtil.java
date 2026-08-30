package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class WorkManagerUtil extends com.google.android.gms.ads.internal.util.zzbq {
    private static void zzb(android.content.Context context) {
        try {
            androidx.work.WorkManager.initialize(context.getApplicationContext(), new androidx.work.Configuration.Builder().build());
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            androidx.work.WorkManager workManager = androidx.work.WorkManager.getInstance(context);
            workManager.cancelAllWorkByTag("offline_ping_sender_work");
            workManager.enqueue(new androidx.work.OneTimeWorkRequest.Builder(com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender.class).setConstraints(new androidx.work.Constraints.Builder().setRequiredNetworkType(androidx.work.NetworkType.CONNECTED).build()).addTag("offline_ping_sender_work").build());
        } catch (java.lang.IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, java.lang.String str2) {
        return zzg(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws java.lang.Throwable {
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        androidx.work.Constraints constraintsBuild = new androidx.work.Constraints.Builder().setRequiredNetworkType(androidx.work.NetworkType.CONNECTED).build();
        try {
            androidx.work.WorkManager.getInstance(context).enqueue(new androidx.work.OneTimeWorkRequest.Builder(com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster.class).setConstraints(constraintsBuild).setInputData(new androidx.work.Data.Builder().putString("uri", zzaVar.zza).putString("gws_query_id", zzaVar.zzb).putString("image_url", zzaVar.zzc).build()).addTag("offline_notification_work").build());
            return true;
        } catch (java.lang.IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
