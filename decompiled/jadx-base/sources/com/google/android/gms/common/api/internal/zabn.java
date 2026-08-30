package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zabn implements com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabo zaa;

    zabn(com.google.android.gms.common.api.internal.zabo zaboVar) {
        this.zaa = zaboVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void onSignOutComplete() {
        this.zaa.zaa.zas.post(new com.google.android.gms.common.api.internal.zabm(this));
    }
}
