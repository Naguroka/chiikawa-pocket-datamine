package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class PayloadTransferUpdate extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.connection.PayloadTransferUpdate> CREATOR = new com.google.android.gms.nearby.connection.zzr();
    private long zza;
    private int zzb;
    private long zzc;
    private long zzd;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static final class Builder {
        private final com.google.android.gms.nearby.connection.PayloadTransferUpdate zza;

        public Builder() {
            this.zza = new com.google.android.gms.nearby.connection.PayloadTransferUpdate(null);
        }

        public com.google.android.gms.nearby.connection.PayloadTransferUpdate build() {
            return this.zza;
        }

        public com.google.android.gms.nearby.connection.PayloadTransferUpdate.Builder setBytesTransferred(long j) {
            this.zza.zzd = j;
            return this;
        }

        public com.google.android.gms.nearby.connection.PayloadTransferUpdate.Builder setPayloadId(long j) {
            this.zza.zza = j;
            return this;
        }

        public com.google.android.gms.nearby.connection.PayloadTransferUpdate.Builder setStatus(int i) {
            this.zza.zzb = i;
            return this;
        }

        public com.google.android.gms.nearby.connection.PayloadTransferUpdate.Builder setTotalBytes(long j) {
            this.zza.zzc = j;
            return this;
        }

        public Builder(com.google.android.gms.nearby.connection.PayloadTransferUpdate payloadTransferUpdate) {
            com.google.android.gms.nearby.connection.PayloadTransferUpdate payloadTransferUpdate2 = new com.google.android.gms.nearby.connection.PayloadTransferUpdate(null);
            this.zza = payloadTransferUpdate2;
            payloadTransferUpdate2.zza = payloadTransferUpdate.zza;
            payloadTransferUpdate2.zzb = payloadTransferUpdate.zzb;
            payloadTransferUpdate2.zzc = payloadTransferUpdate.zzc;
            payloadTransferUpdate2.zzd = payloadTransferUpdate.zzd;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Status {
        public static final int CANCELED = 4;
        public static final int FAILURE = 2;
        public static final int IN_PROGRESS = 3;
        public static final int SUCCESS = 1;
    }

    private PayloadTransferUpdate() {
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.nearby.connection.PayloadTransferUpdate) {
            com.google.android.gms.nearby.connection.PayloadTransferUpdate payloadTransferUpdate = (com.google.android.gms.nearby.connection.PayloadTransferUpdate) obj;
            if (com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(payloadTransferUpdate.zza)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(payloadTransferUpdate.zzb)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zzc), java.lang.Long.valueOf(payloadTransferUpdate.zzc)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zzd), java.lang.Long.valueOf(payloadTransferUpdate.zzd))) {
                return true;
            }
        }
        return false;
    }

    public long getBytesTransferred() {
        return this.zzd;
    }

    public long getPayloadId() {
        return this.zza;
    }

    public int getStatus() {
        return this.zzb;
    }

    public long getTotalBytes() {
        return this.zzc;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Long.valueOf(this.zzc), java.lang.Long.valueOf(this.zzd));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, getPayloadId());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getStatus());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, getTotalBytes());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, getBytesTransferred());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    PayloadTransferUpdate(long j, int i, long j2, long j3) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzd = j3;
    }

    /* synthetic */ PayloadTransferUpdate(com.google.android.gms.nearby.connection.zzq zzqVar) {
    }
}
