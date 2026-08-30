package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaaq extends com.google.android.gms.signin.internal.zac {
    private final java.lang.ref.WeakReference zaa;

    zaaq(com.google.android.gms.common.api.internal.zaau zaauVar) {
        this.zaa = new java.lang.ref.WeakReference(zaauVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        com.google.android.gms.common.api.internal.zaau zaauVar = (com.google.android.gms.common.api.internal.zaau) this.zaa.get();
        if (zaauVar == null) {
            return;
        }
        zaauVar.zaa.zal(new com.google.android.gms.common.api.internal.zaap(this, zaauVar, zaauVar, zakVar));
    }
}
