package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ApiMetadata extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.ApiMetadata> CREATOR = com.google.android.gms.common.api.zza.zza();
    private static final com.google.android.gms.common.api.ApiMetadata zza = newBuilder().build();
    private final com.google.android.gms.common.api.ComplianceOptions zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public static final class Builder {
        private com.google.android.gms.common.api.ComplianceOptions zza;

        public com.google.android.gms.common.api.ApiMetadata build() {
            return new com.google.android.gms.common.api.ApiMetadata(this.zza);
        }

        public com.google.android.gms.common.api.ApiMetadata.Builder setComplianceOptions(com.google.android.gms.common.api.ComplianceOptions complianceOptions) {
            this.zza = complianceOptions;
            return this;
        }
    }

    ApiMetadata(com.google.android.gms.common.api.ComplianceOptions complianceOptions) {
        this.zzb = complianceOptions;
    }

    public static final com.google.android.gms.common.api.ApiMetadata fromComplianceOptions(com.google.android.gms.common.api.ComplianceOptions complianceOptions) {
        com.google.android.gms.common.api.ApiMetadata.Builder builderNewBuilder = newBuilder();
        builderNewBuilder.setComplianceOptions(complianceOptions);
        return builderNewBuilder.build();
    }

    public static final com.google.android.gms.common.api.ApiMetadata getEmptyInstance() {
        return zza;
    }

    public static com.google.android.gms.common.api.ApiMetadata.Builder newBuilder() {
        return new com.google.android.gms.common.api.ApiMetadata.Builder();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.common.api.ApiMetadata) {
            return java.util.Objects.equals(this.zzb, ((com.google.android.gms.common.api.ApiMetadata) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hashCode(this.zzb);
    }

    public final java.lang.String toString() {
        return "ApiMetadata(complianceOptions=" + java.lang.String.valueOf(this.zzb) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(-204102970);
        com.google.android.gms.common.api.ComplianceOptions complianceOptions = this.zzb;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, complianceOptions, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
