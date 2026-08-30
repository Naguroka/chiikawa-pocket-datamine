package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes5.dex */
public class SignInClientImpl extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.signin.internal.zaf> implements com.google.android.gms.signin.zae {
    public static final /* synthetic */ int zaa = 0;
    private final boolean zab;
    private final com.google.android.gms.common.internal.ClientSettings zac;
    private final android.os.Bundle zad;
    private final java.lang.Integer zae;

    public SignInClientImpl(android.content.Context context, android.os.Looper looper, boolean z, com.google.android.gms.common.internal.ClientSettings clientSettings, android.os.Bundle bundle, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zab = true;
        this.zac = clientSettings;
        this.zad = bundle;
        this.zae = clientSettings.zab();
    }

    public static android.os.Bundle createBundleFromClientSettings(com.google.android.gms.common.internal.ClientSettings clientSettings) {
        clientSettings.zaa();
        java.lang.Integer numZab = clientSettings.zab();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings.getAccount());
        if (numZab != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numZab.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.signin.internal.zaf ? (com.google.android.gms.signin.internal.zaf) iInterfaceQueryLocalInterface : new com.google.android.gms.signin.internal.zaf(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final android.os.Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.zac.getRealClientPackageName())) {
            this.zad.putString("com.google.android.gms.signin.internal.realClientPackageName", this.zac.getRealClientPackageName());
        }
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        return this.zab;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.zae
    public final void zaa() {
        try {
            ((com.google.android.gms.signin.internal.zaf) getService()).zae(((java.lang.Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zae)).intValue());
        } catch (android.os.RemoteException unused) {
            android.util.Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // com.google.android.gms.signin.zae
    public final void zab() {
        connect(new com.google.android.gms.common.internal.BaseGmsClient.LegacyClientCallbackAdapter());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.zae
    public final void zac(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((com.google.android.gms.signin.internal.zaf) getService()).zaf(iAccountAccessor, ((java.lang.Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zae)).intValue(), z);
        } catch (android.os.RemoteException unused) {
            android.util.Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.zae
    public final void zad(com.google.android.gms.signin.internal.zae zaeVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zaeVar, "Expecting a valid ISignInCallbacks");
        try {
            android.accounts.Account accountOrDefault = this.zac.getAccountOrDefault();
            ((com.google.android.gms.signin.internal.zaf) getService()).zag(new com.google.android.gms.signin.internal.zai(1, new com.google.android.gms.common.internal.zat(accountOrDefault, ((java.lang.Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zae)).intValue(), "<<default account>>".equals(accountOrDefault.name) ? com.google.android.gms.auth.api.signin.internal.Storage.getInstance(getContext()).getSavedDefaultGoogleSignInAccount() : null)), zaeVar);
        } catch (android.os.RemoteException e) {
            android.util.Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zaeVar.zab(new com.google.android.gms.signin.internal.zak(1, new com.google.android.gms.common.ConnectionResult(8, null), null));
            } catch (android.os.RemoteException unused) {
                android.util.Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
