package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzx extends com.google.android.gms.common.internal.GmsClient {
    private final com.google.android.gms.internal.games_v2.zzq zze;

    public zzx(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.internal.games_v2.zzq zzqVar, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 1, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zze = zzqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.connect.IGamesConnectService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.games_v2.zzae ? (com.google.android.gms.internal.games_v2.zzae) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.games_v2.zzae(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final android.os.Bundle getGetServiceRequestExtraArgs() {
        com.google.android.gms.internal.games_v2.zzq zzqVar = this.zze;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("com.google.android.gms.games.key.API_VERSION", zzqVar.zza);
        bundle.putString(com.google.android.gms.common.internal.ServiceSpecificExtraArgs.GamesExtraArgs.GAME_PACKAGE_NAME, zzqVar.zzb);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 213000000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.games.internal.connect.IGamesConnectService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.games.internal.connect.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }
}
