package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaaj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaau zaa;

    zaaj(com.google.android.gms.common.api.internal.zaau zaauVar) {
        this.zaa = zaauVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.internal.zaau zaauVar = this.zaa;
        zaauVar.zad.cancelAvailabilityErrorNotifications(zaauVar.zac);
    }
}
