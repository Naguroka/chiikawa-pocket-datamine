package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzai extends java.lang.Exception {
    public final com.google.android.gms.common.ConnectionResult zza;

    public zzai(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(connectionResult.hasResolution(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.zza = connectionResult;
    }
}
