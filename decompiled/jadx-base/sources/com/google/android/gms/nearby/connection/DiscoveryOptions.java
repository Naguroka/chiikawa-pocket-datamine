package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class DiscoveryOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.connection.DiscoveryOptions> CREATOR = new com.google.android.gms.nearby.connection.zzp();
    private com.google.android.gms.nearby.connection.Strategy zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private android.os.ParcelUuid zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private byte[] zzm;
    private long zzn;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static final class Builder {
        private final com.google.android.gms.nearby.connection.DiscoveryOptions zza;

        public Builder() {
            this.zza = new com.google.android.gms.nearby.connection.DiscoveryOptions((com.google.android.gms.nearby.connection.zzo) null);
        }

        public com.google.android.gms.nearby.connection.DiscoveryOptions build() {
            return this.zza;
        }

        public com.google.android.gms.nearby.connection.DiscoveryOptions.Builder setLowPower(boolean z) {
            this.zza.zze = z;
            return this;
        }

        public com.google.android.gms.nearby.connection.DiscoveryOptions.Builder setStrategy(com.google.android.gms.nearby.connection.Strategy strategy) {
            this.zza.zza = strategy;
            return this;
        }

        public Builder(com.google.android.gms.nearby.connection.DiscoveryOptions discoveryOptions) {
            com.google.android.gms.nearby.connection.DiscoveryOptions discoveryOptions2 = new com.google.android.gms.nearby.connection.DiscoveryOptions((com.google.android.gms.nearby.connection.zzo) null);
            this.zza = discoveryOptions2;
            discoveryOptions2.zza = discoveryOptions.zza;
            discoveryOptions2.zzb = discoveryOptions.zzb;
            discoveryOptions2.zzc = discoveryOptions.zzc;
            discoveryOptions2.zzd = discoveryOptions.zzd;
            discoveryOptions2.zze = discoveryOptions.zze;
            discoveryOptions2.zzf = discoveryOptions.zzf;
            discoveryOptions2.zzg = discoveryOptions.zzg;
            discoveryOptions2.zzh = discoveryOptions.zzh;
            discoveryOptions2.zzi = discoveryOptions.zzi;
            discoveryOptions2.zzj = discoveryOptions.zzj;
            discoveryOptions2.zzk = discoveryOptions.zzk;
            discoveryOptions2.zzl = discoveryOptions.zzl;
            discoveryOptions2.zzm = discoveryOptions.zzm;
            discoveryOptions2.zzn = discoveryOptions.zzn;
        }
    }

    private DiscoveryOptions() {
        this.zzb = false;
        this.zzc = true;
        this.zzd = true;
        this.zze = false;
        this.zzg = true;
        this.zzh = true;
        this.zzi = true;
        this.zzj = false;
        this.zzk = 0;
        this.zzl = 0;
        this.zzn = 0L;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.nearby.connection.DiscoveryOptions) {
            com.google.android.gms.nearby.connection.DiscoveryOptions discoveryOptions = (com.google.android.gms.nearby.connection.DiscoveryOptions) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, discoveryOptions.zza) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzb), java.lang.Boolean.valueOf(discoveryOptions.zzb)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzc), java.lang.Boolean.valueOf(discoveryOptions.zzc)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzd), java.lang.Boolean.valueOf(discoveryOptions.zzd)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zze), java.lang.Boolean.valueOf(discoveryOptions.zze)) && com.google.android.gms.common.internal.Objects.equal(this.zzf, discoveryOptions.zzf) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzg), java.lang.Boolean.valueOf(discoveryOptions.zzg)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzh), java.lang.Boolean.valueOf(discoveryOptions.zzh)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzi), java.lang.Boolean.valueOf(discoveryOptions.zzi)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzj), java.lang.Boolean.valueOf(discoveryOptions.zzj)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzk), java.lang.Integer.valueOf(discoveryOptions.zzk)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzl), java.lang.Integer.valueOf(discoveryOptions.zzl)) && java.util.Arrays.equals(this.zzm, discoveryOptions.zzm) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zzn), java.lang.Long.valueOf(discoveryOptions.zzn))) {
                return true;
            }
        }
        return false;
    }

    public boolean getLowPower() {
        return this.zze;
    }

    public com.google.android.gms.nearby.connection.Strategy getStrategy() {
        return this.zza;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Boolean.valueOf(this.zzb), java.lang.Boolean.valueOf(this.zzc), java.lang.Boolean.valueOf(this.zzd), java.lang.Boolean.valueOf(this.zze), this.zzf, java.lang.Boolean.valueOf(this.zzg), java.lang.Boolean.valueOf(this.zzh), java.lang.Boolean.valueOf(this.zzi), java.lang.Boolean.valueOf(this.zzj), java.lang.Integer.valueOf(this.zzk), java.lang.Integer.valueOf(this.zzl), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzm)), java.lang.Long.valueOf(this.zzn));
    }

    public java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[14];
        objArr[0] = this.zza;
        objArr[1] = java.lang.Boolean.valueOf(this.zzb);
        objArr[2] = java.lang.Boolean.valueOf(this.zzc);
        objArr[3] = java.lang.Boolean.valueOf(this.zzd);
        objArr[4] = java.lang.Boolean.valueOf(this.zze);
        objArr[5] = this.zzf;
        objArr[6] = java.lang.Boolean.valueOf(this.zzg);
        objArr[7] = java.lang.Boolean.valueOf(this.zzh);
        objArr[8] = java.lang.Boolean.valueOf(this.zzi);
        objArr[9] = java.lang.Boolean.valueOf(this.zzj);
        objArr[10] = java.lang.Integer.valueOf(this.zzk);
        objArr[11] = java.lang.Integer.valueOf(this.zzl);
        byte[] bArr = this.zzm;
        objArr[12] = bArr == null ? "null" : com.google.android.gms.nearby.messages.internal.zzc.zza(bArr);
        objArr[13] = java.lang.Long.valueOf(this.zzn);
        return java.lang.String.format(locale, "DiscoveryOptions{strategy: %s, forwardUnrecognizedBluetoothDevices: %s, enableBluetooth: %s, enableBle: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, uwbAddress: %s, flowId: %d}", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getStrategy(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, getLowPower());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 13, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 14, this.zzm, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 15, this.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza() {
        return this.zzh;
    }

    /* synthetic */ DiscoveryOptions(com.google.android.gms.nearby.connection.zzo zzoVar) {
        this.zzb = false;
        this.zzc = true;
        this.zzd = true;
        this.zze = false;
        this.zzg = true;
        this.zzh = true;
        this.zzi = true;
        this.zzj = false;
        this.zzk = 0;
        this.zzl = 0;
        this.zzn = 0L;
    }

    @java.lang.Deprecated
    public DiscoveryOptions(com.google.android.gms.nearby.connection.Strategy strategy) {
        this.zzb = false;
        this.zzc = true;
        this.zzd = true;
        this.zze = false;
        this.zzg = true;
        this.zzh = true;
        this.zzi = true;
        this.zzj = false;
        this.zzk = 0;
        this.zzl = 0;
        this.zzn = 0L;
        this.zza = strategy;
    }

    DiscoveryOptions(com.google.android.gms.nearby.connection.Strategy strategy, boolean z, boolean z2, boolean z3, boolean z4, android.os.ParcelUuid parcelUuid, boolean z5, boolean z6, boolean z7, boolean z8, int i, int i2, byte[] bArr, long j) {
        this.zza = strategy;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = z3;
        this.zze = z4;
        this.zzf = parcelUuid;
        this.zzg = z5;
        this.zzh = z6;
        this.zzi = z7;
        this.zzj = z8;
        this.zzk = i;
        this.zzl = i2;
        this.zzm = bArr;
        this.zzn = j;
    }
}
