package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zabr implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks, com.google.android.gms.common.api.internal.zacp {
    final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final com.google.android.gms.common.api.Api.Client zab;
    private final com.google.android.gms.common.api.internal.ApiKey zac;
    private com.google.android.gms.common.internal.IAccountAccessor zad = null;
    private java.util.Set zae = null;
    private boolean zaf = false;

    public zabr(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, com.google.android.gms.common.api.Api.Client client, com.google.android.gms.common.api.internal.ApiKey apiKey) {
        this.zaa = googleApiManager;
        this.zab = client;
        this.zac = apiKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zah() {
        com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor;
        if (!this.zaf || (iAccountAccessor = this.zad) == null) {
            return;
        }
        this.zab.getRemoteService(iAccountAccessor, this.zae);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zaa.zas.post(new com.google.android.gms.common.api.internal.zabq(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacp
    public final void zae(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.common.api.internal.zabo zaboVar = (com.google.android.gms.common.api.internal.zabo) this.zaa.zao.get(this.zac);
        if (zaboVar != null) {
            zaboVar.zas(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zacp
    public final void zag(int i) {
        com.google.android.gms.common.api.internal.zabo zaboVar = (com.google.android.gms.common.api.internal.zabo) this.zaa.zao.get(this.zac);
        if (zaboVar != null) {
            if (zaboVar.zaj) {
                zaboVar.zas(new com.google.android.gms.common.ConnectionResult(17));
            } else {
                zaboVar.onConnectionSuspended(i);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zacp
    public final void zaf(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor, java.util.Set set) {
        if (iAccountAccessor == null || set == null) {
            android.util.Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new java.lang.Exception());
            zae(new com.google.android.gms.common.ConnectionResult(4));
        } else {
            this.zad = iAccountAccessor;
            this.zae = set;
            zah();
        }
    }
}
