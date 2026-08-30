package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityRecognitionClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    public static final /* synthetic */ int zza = 0;

    public ActivityRecognitionClient(android.app.Activity activity) {
        super(activity, com.google.android.gms.location.LocationServices.API, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeActivityTransitionUpdates(final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(pendingIntent) { // from class: com.google.android.gms.location.zzg
            private final android.app.PendingIntent zza;

            {
                this.zza = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                android.app.PendingIntent pendingIntent2 = this.zza;
                int i = com.google.android.gms.location.ActivityRecognitionClient.zza;
                ((com.google.android.gms.internal.location.zzaz) obj).zzs(pendingIntent2, new com.google.android.gms.location.zzj((com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(2406).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeActivityUpdates(final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(pendingIntent) { // from class: com.google.android.gms.location.zze
            private final android.app.PendingIntent zza;

            {
                this.zza = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                android.app.PendingIntent pendingIntent2 = this.zza;
                int i = com.google.android.gms.location.ActivityRecognitionClient.zza;
                ((com.google.android.gms.internal.location.zzaz) obj).zzt(pendingIntent2);
                ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(null);
            }
        }).setMethodKey(2402).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeSleepSegmentUpdates(final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(pendingIntent) { // from class: com.google.android.gms.location.zzh
            private final android.app.PendingIntent zza;

            {
                this.zza = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                android.app.PendingIntent pendingIntent2 = this.zza;
                int i = com.google.android.gms.location.ActivityRecognitionClient.zza;
                ((com.google.android.gms.internal.location.zzaz) obj).zzu(pendingIntent2, new com.google.android.gms.location.zzj((com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(2411).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> requestActivityTransitionUpdates(final com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest, final android.app.PendingIntent pendingIntent) {
        activityTransitionRequest.zza(getContextAttributionTag());
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(activityTransitionRequest, pendingIntent) { // from class: com.google.android.gms.location.zzf
            private final com.google.android.gms.location.ActivityTransitionRequest zza;
            private final android.app.PendingIntent zzb;

            {
                this.zza = activityTransitionRequest;
                this.zzb = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest2 = this.zza;
                android.app.PendingIntent pendingIntent2 = this.zzb;
                int i = com.google.android.gms.location.ActivityRecognitionClient.zza;
                ((com.google.android.gms.internal.location.zzaz) obj).zzr(activityTransitionRequest2, pendingIntent2, new com.google.android.gms.location.zzj((com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(2405).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> requestActivityUpdates(final long j, final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(j, pendingIntent) { // from class: com.google.android.gms.location.zzc
            private final long zza;
            private final android.app.PendingIntent zzb;

            {
                this.zza = j;
                this.zzb = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                long j2 = this.zza;
                android.app.PendingIntent pendingIntent2 = this.zzb;
                int i = com.google.android.gms.location.ActivityRecognitionClient.zza;
                ((com.google.android.gms.internal.location.zzaz) obj).zzq(j2, pendingIntent2);
                ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(null);
            }
        }).setMethodKey(com.json.mediationsdk.utils.IronSourceConstants.IS_CAP_SESSION).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> requestSleepSegmentUpdates(final android.app.PendingIntent pendingIntent, final com.google.android.gms.location.SleepSegmentRequest sleepSegmentRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(this, pendingIntent, sleepSegmentRequest) { // from class: com.google.android.gms.location.zzd
            private final com.google.android.gms.location.ActivityRecognitionClient zza;
            private final android.app.PendingIntent zzb;
            private final com.google.android.gms.location.SleepSegmentRequest zzc;

            {
                this.zza = this;
                this.zzb = pendingIntent;
                this.zzc = sleepSegmentRequest;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                com.google.android.gms.location.ActivityRecognitionClient activityRecognitionClient = this.zza;
                ((com.google.android.gms.internal.location.zzam) ((com.google.android.gms.internal.location.zzaz) obj).getService()).zzv(this.zzb, this.zzc, new com.google.android.gms.location.zzi(activityRecognitionClient, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setFeatures(com.google.android.gms.location.zzu.zzb).setMethodKey(2410).build());
    }

    public ActivityRecognitionClient(android.content.Context context) {
        super(context, com.google.android.gms.location.LocationServices.API, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
