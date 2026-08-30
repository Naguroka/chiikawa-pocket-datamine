package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zan extends com.google.android.gms.common.api.internal.zabu {
    final /* synthetic */ android.app.Dialog zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zao zab;

    zan(com.google.android.gms.common.api.internal.zao zaoVar, android.app.Dialog dialog) {
        this.zaa = dialog;
        this.zab = zaoVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zaa() {
        this.zab.zaa.zad();
        if (this.zaa.isShowing()) {
            this.zaa.dismiss();
        }
    }
}
