package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzj extends com.google.android.gms.common.api.Api.AbstractClientBuilder {
    /* synthetic */ zzj(com.google.android.gms.games.zzi zziVar) {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, java.lang.Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        com.google.android.gms.games.zzn zznVarZze = (com.google.android.gms.games.zzn) obj;
        if (zznVarZze == null) {
            zznVarZze = new com.google.android.gms.games.zzl(null).zze();
        }
        com.google.android.gms.games.internal.zzak zzakVar = new com.google.android.gms.games.internal.zzak(context, looper, clientSettings, zznVarZze, connectionCallbacks, onConnectionFailedListener, com.google.android.gms.games.internal.zzar.zza());
        if (zznVarZze.zzo.zzc()) {
            zzakVar.zzS(com.google.android.gms.games.internal.zzg.zzc(context));
        }
        return zzakVar;
    }

    @Override // com.google.android.gms.common.api.Api.BaseClientBuilder
    public final int getPriority() {
        return 1;
    }
}
