package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zaai implements com.google.android.gms.common.api.internal.zabd {
    private final com.google.android.gms.common.api.internal.zabg zaa;
    private boolean zab = false;

    public zaai(com.google.android.gms.common.api.internal.zabg zabgVar) {
        this.zaa = zabgVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zaa(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zab(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zab(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        try {
            this.zaa.zag.zai.zaa(apiMethodImpl);
            com.google.android.gms.common.api.internal.zabc zabcVar = this.zaa.zag;
            com.google.android.gms.common.api.Api.Client client = (com.google.android.gms.common.api.Api.Client) zabcVar.zac.get(apiMethodImpl.getClientKey());
            com.google.android.gms.common.internal.Preconditions.checkNotNull(client, "Appropriate Api was not requested.");
            if (client.isConnected() || !this.zaa.zab.containsKey(apiMethodImpl.getClientKey())) {
                apiMethodImpl.run(client);
            } else {
                apiMethodImpl.setFailedResult(new com.google.android.gms.common.api.Status(17));
            }
        } catch (android.os.DeadObjectException unused) {
            this.zaa.zal(new com.google.android.gms.common.api.internal.zaag(this, this));
        }
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void zad() {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void zae() {
        if (this.zab) {
            this.zab = false;
            this.zaa.zal(new com.google.android.gms.common.api.internal.zaah(this, this));
        }
    }

    final void zaf() {
        if (this.zab) {
            this.zab = false;
            this.zaa.zag.zai.zab();
            zaj();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void zag(android.os.Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void zah(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api api, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void zai(int i) {
        this.zaa.zak(null);
        this.zaa.zah.zac(i, this.zab);
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final boolean zaj() {
        if (this.zab) {
            return false;
        }
        java.util.Set set = this.zaa.zag.zah;
        if (set == null || set.isEmpty()) {
            this.zaa.zak(null);
            return true;
        }
        this.zab = true;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.zacx) it.next()).zah();
        }
        return false;
    }
}
