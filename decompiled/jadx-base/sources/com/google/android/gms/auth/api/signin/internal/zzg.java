package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzg extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.auth.api.signin.internal.zzu> {
    private final com.google.android.gms.auth.api.signin.GoogleSignInOptions zzbi;

    public zzg(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, clientSettings, connectionCallbacks, onConnectionFailedListener);
        googleSignInOptions = googleSignInOptions == null ? new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder().build() : googleSignInOptions;
        if (!clientSettings.getAllRequestedScopes().isEmpty()) {
            com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder builder = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder(googleSignInOptions);
            java.util.Iterator<com.google.android.gms.common.api.Scope> it = clientSettings.getAllRequestedScopes().iterator();
            while (it.hasNext()) {
                builder.requestScopes(it.next(), new com.google.android.gms.common.api.Scope[0]);
            }
            googleSignInOptions = builder.build();
        }
        this.zzbi = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean providesSignIn() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final android.content.Intent getSignInIntent() {
        return com.google.android.gms.auth.api.signin.internal.zzh.zzc(getContext(), this.zzbi);
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions zzg() {
        return this.zzbi;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.auth.api.signin.internal.zzu) {
            return (com.google.android.gms.auth.api.signin.internal.zzu) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.auth.api.signin.internal.zzv(iBinder);
    }
}
