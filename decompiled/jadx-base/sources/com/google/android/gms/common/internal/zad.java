package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zad extends com.google.android.gms.common.internal.zag {
    final /* synthetic */ android.content.Intent zaa;
    final /* synthetic */ android.app.Activity zab;
    final /* synthetic */ int zac;

    zad(android.content.Intent intent, android.app.Activity activity, int i) {
        this.zaa = intent;
        this.zab = activity;
        this.zac = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        android.content.Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, this.zac);
        }
    }
}
