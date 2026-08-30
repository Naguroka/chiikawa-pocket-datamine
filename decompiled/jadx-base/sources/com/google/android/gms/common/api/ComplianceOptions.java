package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ComplianceOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.ComplianceOptions> CREATOR;
    public static final com.google.android.gms.common.api.ComplianceOptions zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final boolean zze;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public static final class Builder {
        private int zza = -1;
        private int zzb = -1;
        private int zzc = 0;
        private boolean zzd = true;

        public com.google.android.gms.common.api.ComplianceOptions build() {
            return new com.google.android.gms.common.api.ComplianceOptions(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public com.google.android.gms.common.api.ComplianceOptions.Builder setCallerProductId(int i) {
            this.zza = i;
            return this;
        }

        public com.google.android.gms.common.api.ComplianceOptions.Builder setDataOwnerProductId(int i) {
            this.zzb = i;
            return this;
        }

        public com.google.android.gms.common.api.ComplianceOptions.Builder setIsUserData(boolean z) {
            this.zzd = z;
            return this;
        }

        public com.google.android.gms.common.api.ComplianceOptions.Builder setProcessingReason(int i) {
            this.zzc = i;
            return this;
        }
    }

    static {
        com.google.android.gms.common.api.ComplianceOptions.Builder builderNewBuilder = newBuilder();
        builderNewBuilder.setCallerProductId(-1);
        builderNewBuilder.setDataOwnerProductId(-1);
        builderNewBuilder.setProcessingReason(0);
        builderNewBuilder.setIsUserData(true);
        zza = builderNewBuilder.build();
        CREATOR = new com.google.android.gms.common.api.zzc();
    }

    ComplianceOptions(int i, int i2, int i3, boolean z) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z;
    }

    public static com.google.android.gms.common.api.ComplianceOptions.Builder newBuilder() {
        return new com.google.android.gms.common.api.ComplianceOptions.Builder();
    }

    public static final com.google.android.gms.common.api.ComplianceOptions.Builder newBuilder(android.content.Context context) {
        return newBuilder();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.api.ComplianceOptions)) {
            return false;
        }
        com.google.android.gms.common.api.ComplianceOptions complianceOptions = (com.google.android.gms.common.api.ComplianceOptions) obj;
        return this.zzb == complianceOptions.zzb && this.zzc == complianceOptions.zzc && this.zzd == complianceOptions.zzd && this.zze == complianceOptions.zze;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(this.zzd), java.lang.Boolean.valueOf(this.zze));
    }

    public com.google.android.gms.common.api.ComplianceOptions.Builder toBuilder() {
        com.google.android.gms.common.api.ComplianceOptions.Builder builder = new com.google.android.gms.common.api.ComplianceOptions.Builder();
        builder.setCallerProductId(this.zzb);
        builder.setDataOwnerProductId(this.zzc);
        builder.setProcessingReason(this.zzd);
        builder.setIsUserData(this.zze);
        return builder;
    }

    public final java.lang.String toString() {
        return "ComplianceOptions{callerProductId=" + this.zzb + ", dataOwnerProductId=" + this.zzc + ", processingReason=" + this.zzd + ", isUserData=" + this.zze + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zzb;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
