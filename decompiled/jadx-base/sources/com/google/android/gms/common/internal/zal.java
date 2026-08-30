package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zal {
    private final android.util.SparseIntArray zaa;
    private com.google.android.gms.common.GoogleApiAvailabilityLight zab;

    public zal() {
        this(com.google.android.gms.common.GoogleApiAvailability.getInstance());
    }

    public final int zaa(android.content.Context context, int i) {
        int i2;
        synchronized (this.zaa) {
            i2 = this.zaa.get(i, -1);
        }
        return i2;
    }

    public final int zab(android.content.Context context, com.google.android.gms.common.api.Api.Client client) {
        int iIsGooglePlayServicesAvailable;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(client);
        int i = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int iZaa = zaa(context, minApkVersion);
        if (iZaa != -1) {
            return iZaa;
        }
        synchronized (this.zaa) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.zaa.size()) {
                    i = -1;
                    break;
                }
                int iKeyAt = this.zaa.keyAt(i2);
                if (iKeyAt > minApkVersion && this.zaa.get(iKeyAt) == 0) {
                    break;
                }
                i2++;
            }
            iIsGooglePlayServicesAvailable = i == -1 ? this.zab.isGooglePlayServicesAvailable(context, minApkVersion) : i;
            this.zaa.put(minApkVersion, iIsGooglePlayServicesAvailable);
        }
        return iIsGooglePlayServicesAvailable;
    }

    public final void zac() {
        synchronized (this.zaa) {
            this.zaa.clear();
        }
    }

    public zal(com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zaa = new android.util.SparseIntArray();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zab = googleApiAvailabilityLight;
    }
}
