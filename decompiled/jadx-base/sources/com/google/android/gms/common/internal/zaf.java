package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaf extends com.google.android.gms.common.internal.zag {
    final /* synthetic */ android.content.Intent zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.LifecycleFragment zab;

    zaf(android.content.Intent intent, com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment, int i) {
        this.zaa = intent;
        this.zab = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        android.content.Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, 2);
        }
    }
}
