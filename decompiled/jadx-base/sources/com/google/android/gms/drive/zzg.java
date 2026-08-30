package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
final class zzg extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.Drive.zza> {
    zzg() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.drive.Drive.zza zzaVar, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.internal.drive.zzaw(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener, zzaVar.zzh());
    }
}
