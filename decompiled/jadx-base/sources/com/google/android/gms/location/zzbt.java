package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbt implements com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.location.LocationSettingsResult> {
    private final com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.location.LocationSettingsResponse> zza;

    public zzbt(com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.location.LocationSettingsResponse> taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(com.google.android.gms.common.api.Status status) {
        this.zza.setException(new com.google.android.gms.common.api.ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(com.google.android.gms.location.LocationSettingsResult locationSettingsResult) {
        com.google.android.gms.location.LocationSettingsResult locationSettingsResult2 = locationSettingsResult;
        com.google.android.gms.common.api.Status status = locationSettingsResult2.getStatus();
        if (status.isSuccess()) {
            this.zza.setResult(new com.google.android.gms.location.LocationSettingsResponse(locationSettingsResult2));
        } else if (status.hasResolution()) {
            this.zza.setException(new com.google.android.gms.common.api.ResolvableApiException(status));
        } else {
            this.zza.setException(new com.google.android.gms.common.api.ApiException(status));
        }
    }
}
