package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zaca extends com.google.android.gms.common.api.internal.zap {
    private com.google.android.gms.tasks.TaskCompletionSource zad;

    private zaca(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, com.google.android.gms.common.GoogleApiAvailability.getInstance());
        this.zad = new com.google.android.gms.tasks.TaskCompletionSource();
        this.mLifecycleFragment.addCallback("GmsAvailabilityHelper", this);
    }

    public static com.google.android.gms.common.api.internal.zaca zaa(android.app.Activity activity) {
        com.google.android.gms.common.api.internal.LifecycleFragment fragment = getFragment(activity);
        com.google.android.gms.common.api.internal.zaca zacaVar = (com.google.android.gms.common.api.internal.zaca) fragment.getCallbackOrNull("GmsAvailabilityHelper", com.google.android.gms.common.api.internal.zaca.class);
        if (zacaVar == null) {
            return new com.google.android.gms.common.api.internal.zaca(fragment);
        }
        if (zacaVar.zad.getTask().isComplete()) {
            zacaVar.zad = new com.google.android.gms.tasks.TaskCompletionSource();
        }
        return zacaVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onDestroy() {
        super.onDestroy();
        this.zad.trySetException(new java.util.concurrent.CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zab(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        java.lang.String errorMessage = connectionResult.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = "Error connecting to Google Play services";
        }
        this.zad.setException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(connectionResult, errorMessage, connectionResult.getErrorCode())));
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zac() {
        android.app.Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        if (lifecycleActivity == null) {
            this.zad.trySetException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(8)));
            return;
        }
        int iIsGooglePlayServicesAvailable = this.zac.isGooglePlayServicesAvailable(lifecycleActivity);
        if (iIsGooglePlayServicesAvailable == 0) {
            this.zad.trySetResult(null);
        } else {
            if (this.zad.getTask().isComplete()) {
                return;
            }
            zah(new com.google.android.gms.common.ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
        }
    }

    public final com.google.android.gms.tasks.Task zad() {
        return this.zad.getTask();
    }
}
