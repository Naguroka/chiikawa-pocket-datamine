package com.google.android.gms.internal.appset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzr implements com.google.android.gms.appset.AppSetIdClient {
    private final com.google.android.gms.appset.AppSetIdClient zza;
    private final com.google.android.gms.appset.AppSetIdClient zzb;

    public zzr(android.content.Context context) {
        this.zza = new com.google.android.gms.internal.appset.zzp(context, com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance());
        this.zzb = com.google.android.gms.internal.appset.zzl.zzc(context);
    }

    public static /* synthetic */ com.google.android.gms.tasks.Task zza(com.google.android.gms.internal.appset.zzr zzrVar, com.google.android.gms.tasks.Task task) {
        if (task.isSuccessful() || task.isCanceled()) {
            return task;
        }
        java.lang.Exception exception = task.getException();
        if (!(exception instanceof com.google.android.gms.common.api.ApiException)) {
            return task;
        }
        int statusCode = ((com.google.android.gms.common.api.ApiException) exception).getStatusCode();
        if (statusCode == 43001 || statusCode == 43002 || statusCode == 43003 || statusCode == 17) {
            return zzrVar.zzb.getAppSetIdInfo();
        }
        if (statusCode == 43000) {
            return com.google.android.gms.tasks.Tasks.forException(new java.lang.Exception("Failed to get app set ID due to an internal error. Please try again later."));
        }
        return statusCode != 15 ? task : com.google.android.gms.tasks.Tasks.forException(new java.lang.Exception("The operation to get app set ID timed out. Please try again later."));
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.appset.AppSetIdInfo> getAppSetIdInfo() {
        return this.zza.getAppSetIdInfo().continueWithTask(new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.gms.internal.appset.zzq
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.android.gms.internal.appset.zzr.zza(this.zza, task);
            }
        });
    }
}
