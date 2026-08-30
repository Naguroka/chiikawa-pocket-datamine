package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaao extends com.google.android.gms.common.api.internal.zaas {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaau zaa;
    private final java.util.ArrayList zac;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaao(com.google.android.gms.common.api.internal.zaau zaauVar, java.util.ArrayList arrayList) {
        super(zaauVar, null);
        this.zaa = zaauVar;
        this.zac = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.zaas
    public final void zaa() {
        com.google.android.gms.common.api.internal.zaau zaauVar = this.zaa;
        zaauVar.zaa.zag.zad = com.google.android.gms.common.api.internal.zaau.zao(zaauVar);
        java.util.ArrayList arrayList = this.zac;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.common.api.Api.Client client = (com.google.android.gms.common.api.Api.Client) arrayList.get(i);
            com.google.android.gms.common.api.internal.zaau zaauVar2 = this.zaa;
            client.getRemoteService(zaauVar2.zao, zaauVar2.zaa.zag.zad);
        }
    }
}
