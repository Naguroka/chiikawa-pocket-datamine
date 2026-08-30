package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzo implements com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks zza;

    zzo(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks signOutCallbacks) {
        this.zza = signOutCallbacks;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(com.google.android.gms.common.api.Status status) {
        this.zza.onSignOutComplete();
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(java.lang.Object obj) {
        this.zza.onSignOutComplete();
    }
}
