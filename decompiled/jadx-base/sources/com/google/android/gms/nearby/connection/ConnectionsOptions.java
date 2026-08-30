package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public class ConnectionsOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    private final java.lang.String zza = null;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static class Builder {
        public com.google.android.gms.nearby.connection.ConnectionsOptions build() {
            return new com.google.android.gms.nearby.connection.ConnectionsOptions(this, null);
        }
    }

    /* synthetic */ ConnectionsOptions(com.google.android.gms.nearby.connection.ConnectionsOptions.Builder builder, com.google.android.gms.nearby.connection.zzl zzlVar) {
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.nearby.connection.ConnectionsOptions)) {
            return false;
        }
        java.lang.String str = ((com.google.android.gms.nearby.connection.ConnectionsOptions) obj).zza;
        return com.google.android.gms.common.internal.Objects.equal(null, null);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(null);
    }
}
