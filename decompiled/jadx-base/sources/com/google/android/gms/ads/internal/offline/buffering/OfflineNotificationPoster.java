package com.google.android.gms.ads.internal.offline.buffering;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class OfflineNotificationPoster extends androidx.work.Worker {
    private final com.google.android.gms.internal.ads.zzbsx zza;

    public OfflineNotificationPoster(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = com.google.android.gms.ads.internal.client.zzbc.zza().zzo(context, new com.google.android.gms.internal.ads.zzbpa());
    }

    @Override // androidx.work.Worker
    public final androidx.work.ListenableWorker.Result doWork() {
        try {
            this.zza.zzj(com.google.android.gms.dynamic.ObjectWrapper.wrap(getApplicationContext()), new com.google.android.gms.ads.internal.offline.buffering.zza(getInputData().getString("uri"), getInputData().getString("gws_query_id"), getInputData().getString("image_url")));
            return androidx.work.ListenableWorker.Result.success();
        } catch (android.os.RemoteException unused) {
            return androidx.work.ListenableWorker.Result.failure();
        }
    }
}
