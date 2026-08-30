package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class Strategy extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    private final int zza;
    private final int zzb;
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.connection.Strategy> CREATOR = new com.google.android.gms.nearby.connection.zzs();
    public static final com.google.android.gms.nearby.connection.Strategy P2P_CLUSTER = new com.google.android.gms.nearby.connection.Strategy(1, 3);
    public static final com.google.android.gms.nearby.connection.Strategy P2P_STAR = new com.google.android.gms.nearby.connection.Strategy(1, 2);
    public static final com.google.android.gms.nearby.connection.Strategy P2P_POINT_TO_POINT = new com.google.android.gms.nearby.connection.Strategy(1, 1);

    Strategy(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.nearby.connection.Strategy)) {
            return false;
        }
        com.google.android.gms.nearby.connection.Strategy strategy = (com.google.android.gms.nearby.connection.Strategy) obj;
        return this.zza == strategy.zza && this.zzb == strategy.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb));
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (P2P_CLUSTER.equals(this)) {
            str = "P2P_CLUSTER";
        } else if (P2P_STAR.equals(this)) {
            str = "P2P_STAR";
        } else {
            str = P2P_POINT_TO_POINT.equals(this) ? "P2P_POINT_TO_POINT" : "UNKNOWN";
        }
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(this.zza);
        objArr[2] = java.lang.Integer.valueOf(this.zzb);
        return java.lang.String.format(locale, "Strategy(%s){connectionType=%d, topology=%d}", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
