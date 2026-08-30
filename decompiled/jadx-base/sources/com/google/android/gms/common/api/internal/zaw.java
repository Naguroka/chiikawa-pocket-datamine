package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaw implements com.google.android.gms.common.api.internal.zabx {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaz zaa;

    /* synthetic */ zaw(com.google.android.gms.common.api.internal.zaz zazVar, com.google.android.gms.common.api.internal.zay zayVar) {
        this.zaa = zazVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabx
    public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zaa.zam.lock();
        try {
            this.zaa.zaj = connectionResult;
            com.google.android.gms.common.api.internal.zaz.zap(this.zaa);
        } finally {
            this.zaa.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabx
    public final void zab(android.os.Bundle bundle) {
        this.zaa.zam.lock();
        try {
            com.google.android.gms.common.api.internal.zaz.zao(this.zaa, bundle);
            this.zaa.zaj = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
            com.google.android.gms.common.api.internal.zaz.zap(this.zaa);
        } finally {
            this.zaa.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabx
    public final void zac(int i, boolean z) {
        this.zaa.zam.lock();
        try {
            com.google.android.gms.common.api.internal.zaz zazVar = this.zaa;
            if (zazVar.zal || zazVar.zak == null || !zazVar.zak.isSuccess()) {
                this.zaa.zal = false;
                com.google.android.gms.common.api.internal.zaz.zan(this.zaa, i, z);
            } else {
                this.zaa.zal = true;
                this.zaa.zae.onConnectionSuspended(i);
            }
        } finally {
            this.zaa.zam.unlock();
        }
    }
}
