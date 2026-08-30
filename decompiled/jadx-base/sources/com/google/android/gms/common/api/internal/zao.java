package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zao implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zap zaa;
    private final com.google.android.gms.common.api.internal.zam zab;

    zao(com.google.android.gms.common.api.internal.zap zapVar, com.google.android.gms.common.api.internal.zam zamVar) {
        this.zaa = zapVar;
        this.zab = zamVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zaa.zaa) {
            com.google.android.gms.common.ConnectionResult connectionResultZab = this.zab.zab();
            if (connectionResultZab.hasResolution()) {
                com.google.android.gms.common.api.internal.zap zapVar = this.zaa;
                zapVar.mLifecycleFragment.startActivityForResult(com.google.android.gms.common.api.GoogleApiActivity.zaa(zapVar.getActivity(), (android.app.PendingIntent) com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionResultZab.getResolution()), this.zab.zaa(), false), 1);
                return;
            }
            com.google.android.gms.common.api.internal.zap zapVar2 = this.zaa;
            if (zapVar2.zac.getErrorResolutionIntent(zapVar2.getActivity(), connectionResultZab.getErrorCode(), null) != null) {
                com.google.android.gms.common.api.internal.zap zapVar3 = this.zaa;
                zapVar3.zac.zag(zapVar3.getActivity(), zapVar3.mLifecycleFragment, connectionResultZab.getErrorCode(), 2, this.zaa);
                return;
            }
            if (connectionResultZab.getErrorCode() != 18) {
                this.zaa.zaa(connectionResultZab, this.zab.zaa());
                return;
            }
            com.google.android.gms.common.api.internal.zap zapVar4 = this.zaa;
            android.app.Dialog dialogZab = zapVar4.zac.zab(zapVar4.getActivity(), zapVar4);
            com.google.android.gms.common.api.internal.zap zapVar5 = this.zaa;
            zapVar5.zac.zac(zapVar5.getActivity().getApplicationContext(), new com.google.android.gms.common.api.internal.zan(this, dialogZab));
        }
    }
}
