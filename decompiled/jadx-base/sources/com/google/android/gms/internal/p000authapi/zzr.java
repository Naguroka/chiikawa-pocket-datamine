package com.google.android.gms.internal.p000authapi;

/* JADX INFO: loaded from: classes4.dex */
public final class zzr extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.internal.p000authapi.zzw> {
    private final com.google.android.gms.auth.api.Auth.AuthCredentialsOptions zzaq;

    public zzr(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authCredentialsOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzaq = authCredentialsOptions;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final android.os.Bundle getGetServiceRequestExtraArgs() {
        com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authCredentialsOptions = this.zzaq;
        return authCredentialsOptions == null ? new android.os.Bundle() : authCredentialsOptions.toBundle();
    }

    final com.google.android.gms.auth.api.Auth.AuthCredentialsOptions zzd() {
        return this.zzaq;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.p000authapi.zzw) {
            return (com.google.android.gms.internal.p000authapi.zzw) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.p000authapi.zzx(iBinder);
    }
}
