package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zacq extends com.google.android.gms.signin.internal.zac implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zaa = com.google.android.gms.signin.zad.zac;
    private final android.content.Context zab;
    private final android.os.Handler zac;
    private final com.google.android.gms.common.api.Api.AbstractClientBuilder zad;
    private final java.util.Set zae;
    private final com.google.android.gms.common.internal.ClientSettings zaf;
    private com.google.android.gms.signin.zae zag;
    private com.google.android.gms.common.api.internal.zacp zah;

    public zacq(android.content.Context context, android.os.Handler handler, com.google.android.gms.common.internal.ClientSettings clientSettings) {
        com.google.android.gms.common.api.Api.AbstractClientBuilder abstractClientBuilder = zaa;
        this.zab = context;
        this.zac = handler;
        this.zaf = (com.google.android.gms.common.internal.ClientSettings) com.google.android.gms.common.internal.Preconditions.checkNotNull(clientSettings, "ClientSettings must not be null");
        this.zae = clientSettings.getRequiredScopes();
        this.zad = abstractClientBuilder;
    }

    static /* bridge */ /* synthetic */ void zad(com.google.android.gms.common.api.internal.zacq zacqVar, com.google.android.gms.signin.internal.zak zakVar) {
        com.google.android.gms.common.ConnectionResult connectionResultZaa = zakVar.zaa();
        if (connectionResultZaa.isSuccess()) {
            com.google.android.gms.common.internal.zav zavVar = (com.google.android.gms.common.internal.zav) com.google.android.gms.common.internal.Preconditions.checkNotNull(zakVar.zab());
            com.google.android.gms.common.ConnectionResult connectionResultZaa2 = zavVar.zaa();
            if (!connectionResultZaa2.isSuccess()) {
                java.lang.String strValueOf = java.lang.String.valueOf(java.lang.String.valueOf(connectionResultZaa2));
                android.util.Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new java.lang.Exception());
                zacqVar.zah.zae(connectionResultZaa2);
                zacqVar.zag.disconnect();
                return;
            }
            zacqVar.zah.zaf(zavVar.zab(), zacqVar.zae);
        } else {
            zacqVar.zah.zae(connectionResultZaa);
        }
        zacqVar.zag.disconnect();
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        this.zag.zad(this);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zah.zae(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zah.zag(i);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        this.zac.post(new com.google.android.gms.common.api.internal.zaco(this, zakVar));
    }

    public final void zae(com.google.android.gms.common.api.internal.zacp zacpVar) {
        com.google.android.gms.signin.zae zaeVar = this.zag;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
        this.zaf.zae(java.lang.Integer.valueOf(java.lang.System.identityHashCode(this)));
        com.google.android.gms.common.api.Api.AbstractClientBuilder abstractClientBuilder = this.zad;
        android.content.Context context = this.zab;
        android.os.Handler handler = this.zac;
        com.google.android.gms.common.internal.ClientSettings clientSettings = this.zaf;
        this.zag = (com.google.android.gms.signin.zae) abstractClientBuilder.buildClient(context, handler.getLooper(), clientSettings, clientSettings.zaa(), (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) this, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) this);
        this.zah = zacpVar;
        java.util.Set set = this.zae;
        if (set == null || set.isEmpty()) {
            this.zac.post(new com.google.android.gms.common.api.internal.zacn(this));
        } else {
            this.zag.zab();
        }
    }

    public final void zaf() {
        com.google.android.gms.signin.zae zaeVar = this.zag;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
    }
}
