package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaan extends com.google.android.gms.common.api.internal.zaas {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaau zaa;
    private final java.util.Map zac;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaan(com.google.android.gms.common.api.internal.zaau zaauVar, java.util.Map map) {
        super(zaauVar, null);
        this.zaa = zaauVar;
        this.zac = map;
    }

    @Override // com.google.android.gms.common.api.internal.zaas
    public final void zaa() {
        com.google.android.gms.common.internal.zal zalVar = new com.google.android.gms.common.internal.zal(this.zaa.zad);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.google.android.gms.common.api.Api.Client client : this.zac.keySet()) {
            if (!client.requiresGooglePlayServices() || ((com.google.android.gms.common.api.internal.zaak) this.zac.get(client)).zac) {
                arrayList2.add(client);
            } else {
                arrayList.add(client);
            }
        }
        int i = 0;
        int iZab = -1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i < size) {
                iZab = zalVar.zab(this.zaa.zac, (com.google.android.gms.common.api.Api.Client) arrayList.get(i));
                i++;
                if (iZab != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i < size2) {
                iZab = zalVar.zab(this.zaa.zac, (com.google.android.gms.common.api.Api.Client) arrayList2.get(i));
                i++;
                if (iZab == 0) {
                    break;
                }
            }
        }
        if (iZab != 0) {
            com.google.android.gms.common.ConnectionResult connectionResult = new com.google.android.gms.common.ConnectionResult(iZab, null);
            com.google.android.gms.common.api.internal.zaau zaauVar = this.zaa;
            zaauVar.zaa.zal(new com.google.android.gms.common.api.internal.zaal(this, zaauVar, connectionResult));
            return;
        }
        com.google.android.gms.common.api.internal.zaau zaauVar2 = this.zaa;
        if (zaauVar2.zam && zaauVar2.zak != null) {
            zaauVar2.zak.zab();
        }
        for (com.google.android.gms.common.api.Api.Client client2 : this.zac.keySet()) {
            com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = (com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks) this.zac.get(client2);
            if (!client2.requiresGooglePlayServices() || zalVar.zab(this.zaa.zac, client2) == 0) {
                client2.connect(connectionProgressReportCallbacks);
            } else {
                com.google.android.gms.common.api.internal.zaau zaauVar3 = this.zaa;
                zaauVar3.zaa.zal(new com.google.android.gms.common.api.internal.zaam(this, zaauVar3, connectionProgressReportCallbacks));
            }
        }
    }
}
