package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zal {
    private int zad;
    private final androidx.collection.ArrayMap zab = new androidx.collection.ArrayMap();
    private final com.google.android.gms.tasks.TaskCompletionSource zac = new com.google.android.gms.tasks.TaskCompletionSource();
    private boolean zae = false;
    private final androidx.collection.ArrayMap zaa = new androidx.collection.ArrayMap();

    public zal(java.lang.Iterable iterable) {
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zaa.put(((com.google.android.gms.common.api.HasApiKey) it.next()).getApiKey(), null);
        }
        this.zad = this.zaa.keySet().size();
    }

    public final com.google.android.gms.tasks.Task zaa() {
        return this.zac.getTask();
    }

    public final java.util.Set zab() {
        return this.zaa.keySet();
    }

    public final void zac(com.google.android.gms.common.api.internal.ApiKey apiKey, com.google.android.gms.common.ConnectionResult connectionResult, java.lang.String str) {
        this.zaa.put(apiKey, connectionResult);
        this.zab.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad == 0) {
            if (!this.zae) {
                this.zac.setResult(this.zab);
            } else {
                this.zac.setException(new com.google.android.gms.common.api.AvailabilityException(this.zaa));
            }
        }
    }
}
