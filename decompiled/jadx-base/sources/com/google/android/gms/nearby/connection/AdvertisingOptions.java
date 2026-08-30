package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class AdvertisingOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.connection.AdvertisingOptions> CREATOR = new com.google.android.gms.nearby.connection.zzb();
    private com.google.android.gms.nearby.connection.Strategy zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private byte[] zzf;
    private boolean zzg;
    private android.os.ParcelUuid zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private byte[] zzq;
    private long zzr;
    private com.google.android.gms.nearby.connection.zzv[] zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static final class Builder {
        private final com.google.android.gms.nearby.connection.AdvertisingOptions zza;

        public Builder() {
            this.zza = new com.google.android.gms.nearby.connection.AdvertisingOptions((com.google.android.gms.nearby.connection.zza) null);
        }

        public com.google.android.gms.nearby.connection.AdvertisingOptions build() {
            return this.zza;
        }

        public com.google.android.gms.nearby.connection.AdvertisingOptions.Builder setDisruptiveUpgrade(boolean z) {
            this.zza.zzu = z;
            return this;
        }

        public com.google.android.gms.nearby.connection.AdvertisingOptions.Builder setLowPower(boolean z) {
            this.zza.zzg = z;
            return this;
        }

        public com.google.android.gms.nearby.connection.AdvertisingOptions.Builder setStrategy(com.google.android.gms.nearby.connection.Strategy strategy) {
            this.zza.zza = strategy;
            return this;
        }

        public Builder(com.google.android.gms.nearby.connection.AdvertisingOptions advertisingOptions) {
            com.google.android.gms.nearby.connection.AdvertisingOptions advertisingOptions2 = new com.google.android.gms.nearby.connection.AdvertisingOptions((com.google.android.gms.nearby.connection.zza) null);
            this.zza = advertisingOptions2;
            advertisingOptions2.zza = advertisingOptions.zza;
            advertisingOptions2.zzb = advertisingOptions.zzb;
            advertisingOptions2.zzc = advertisingOptions.zzc;
            advertisingOptions2.zzd = advertisingOptions.zzd;
            advertisingOptions2.zze = advertisingOptions.zze;
            advertisingOptions2.zzf = advertisingOptions.zzf;
            advertisingOptions2.zzg = advertisingOptions.zzg;
            advertisingOptions2.zzh = advertisingOptions.zzh;
            advertisingOptions2.zzi = advertisingOptions.zzi;
            advertisingOptions2.zzj = advertisingOptions.zzj;
            advertisingOptions2.zzk = advertisingOptions.zzk;
            advertisingOptions2.zzl = advertisingOptions.zzl;
            advertisingOptions2.zzm = advertisingOptions.zzm;
            advertisingOptions2.zzn = advertisingOptions.zzn;
            advertisingOptions2.zzo = advertisingOptions.zzo;
            advertisingOptions2.zzp = advertisingOptions.zzp;
            advertisingOptions2.zzq = advertisingOptions.zzq;
            advertisingOptions2.zzr = advertisingOptions.zzr;
            advertisingOptions2.zzs = advertisingOptions.zzs;
            advertisingOptions2.zzt = advertisingOptions.zzt;
            advertisingOptions2.zzu = advertisingOptions.zzu;
            advertisingOptions2.zzv = advertisingOptions.zzv;
        }
    }

    private AdvertisingOptions() {
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzg = false;
        this.zzi = true;
        this.zzj = true;
        this.zzk = true;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = 0L;
        this.zzt = false;
        this.zzu = true;
        this.zzv = false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.nearby.connection.AdvertisingOptions) {
            com.google.android.gms.nearby.connection.AdvertisingOptions advertisingOptions = (com.google.android.gms.nearby.connection.AdvertisingOptions) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, advertisingOptions.zza) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzb), java.lang.Boolean.valueOf(advertisingOptions.zzb)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzc), java.lang.Boolean.valueOf(advertisingOptions.zzc)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzd), java.lang.Boolean.valueOf(advertisingOptions.zzd)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zze), java.lang.Boolean.valueOf(advertisingOptions.zze)) && java.util.Arrays.equals(this.zzf, advertisingOptions.zzf) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzg), java.lang.Boolean.valueOf(advertisingOptions.zzg)) && com.google.android.gms.common.internal.Objects.equal(this.zzh, advertisingOptions.zzh) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzi), java.lang.Boolean.valueOf(advertisingOptions.zzi)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzj), java.lang.Boolean.valueOf(advertisingOptions.zzj)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzk), java.lang.Boolean.valueOf(advertisingOptions.zzk)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzl), java.lang.Boolean.valueOf(advertisingOptions.zzl)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzm), java.lang.Boolean.valueOf(advertisingOptions.zzm)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzn), java.lang.Boolean.valueOf(advertisingOptions.zzn)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzo), java.lang.Integer.valueOf(advertisingOptions.zzo)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzp), java.lang.Integer.valueOf(advertisingOptions.zzp)) && java.util.Arrays.equals(this.zzq, advertisingOptions.zzq) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zzr), java.lang.Long.valueOf(advertisingOptions.zzr)) && java.util.Arrays.equals(this.zzs, advertisingOptions.zzs) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzt), java.lang.Boolean.valueOf(advertisingOptions.zzt)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzu), java.lang.Boolean.valueOf(advertisingOptions.zzu)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzv), java.lang.Boolean.valueOf(advertisingOptions.zzv))) {
                return true;
            }
        }
        return false;
    }

    public boolean getDisruptiveUpgrade() {
        return this.zzu;
    }

    public boolean getLowPower() {
        return this.zzg;
    }

    public com.google.android.gms.nearby.connection.Strategy getStrategy() {
        return this.zza;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Boolean.valueOf(this.zzb), java.lang.Boolean.valueOf(this.zzc), java.lang.Boolean.valueOf(this.zzd), java.lang.Boolean.valueOf(this.zze), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzf)), java.lang.Boolean.valueOf(this.zzg), this.zzh, java.lang.Boolean.valueOf(this.zzi), java.lang.Boolean.valueOf(this.zzj), java.lang.Boolean.valueOf(this.zzk), java.lang.Boolean.valueOf(this.zzl), java.lang.Boolean.valueOf(this.zzm), java.lang.Boolean.valueOf(this.zzn), java.lang.Integer.valueOf(this.zzo), java.lang.Integer.valueOf(this.zzp), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzq)), java.lang.Long.valueOf(this.zzr), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzs)), java.lang.Boolean.valueOf(this.zzt), java.lang.Boolean.valueOf(this.zzu), java.lang.Boolean.valueOf(this.zzv));
    }

    public java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[21];
        objArr[0] = this.zza;
        objArr[1] = java.lang.Boolean.valueOf(this.zzb);
        objArr[2] = java.lang.Boolean.valueOf(this.zzc);
        objArr[3] = java.lang.Boolean.valueOf(this.zzd);
        objArr[4] = java.lang.Boolean.valueOf(this.zze);
        byte[] bArr = this.zzf;
        objArr[5] = bArr == null ? null : com.google.android.gms.nearby.messages.internal.zzc.zza(bArr);
        objArr[6] = java.lang.Boolean.valueOf(this.zzg);
        objArr[7] = this.zzh;
        objArr[8] = java.lang.Boolean.valueOf(this.zzi);
        objArr[9] = java.lang.Boolean.valueOf(this.zzj);
        objArr[10] = java.lang.Boolean.valueOf(this.zzk);
        objArr[11] = java.lang.Boolean.valueOf(this.zzl);
        objArr[12] = java.lang.Boolean.valueOf(this.zzm);
        objArr[13] = java.lang.Boolean.valueOf(this.zzn);
        objArr[14] = java.lang.Integer.valueOf(this.zzo);
        objArr[15] = java.lang.Integer.valueOf(this.zzp);
        byte[] bArr2 = this.zzq;
        objArr[16] = bArr2 == null ? "null" : com.google.android.gms.nearby.messages.internal.zzc.zza(bArr2);
        objArr[17] = java.lang.Long.valueOf(this.zzr);
        objArr[18] = java.util.Arrays.toString(this.zzs);
        objArr[19] = java.lang.Boolean.valueOf(this.zzt);
        objArr[20] = java.lang.Boolean.valueOf(this.zzu);
        return java.lang.String.format(locale, "AdvertisingOptions{strategy: %s, autoUpgradeBandwidth: %s, enforceTopologyConstraints: %s, enableBluetooth: %s, enableBle: %s, nearbyNotificationsBeaconData: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableBluetoothListening: %s, enableWebRtcListening: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, remoteUwbAddress: %s, flowId: %d, uwbSenderInfo: %s, enableOutOfBandConnection: %s, disruptiveUpgrade: %s}", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getStrategy(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 6, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, getLowPower());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 11, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 12, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 13, this.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 14, this.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 15, this.zzo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 16, this.zzp);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 17, this.zzq, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 18, this.zzr);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 19, this.zzs, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 20, this.zzt);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 21, getDisruptiveUpgrade());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 22, this.zzv);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    /* synthetic */ AdvertisingOptions(com.google.android.gms.nearby.connection.zza zzaVar) {
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzg = false;
        this.zzi = true;
        this.zzj = true;
        this.zzk = true;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = 0L;
        this.zzt = false;
        this.zzu = true;
        this.zzv = false;
    }

    @java.lang.Deprecated
    public AdvertisingOptions(com.google.android.gms.nearby.connection.Strategy strategy) {
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzg = false;
        this.zzi = true;
        this.zzj = true;
        this.zzk = true;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = 0L;
        this.zzt = false;
        this.zzu = true;
        this.zzv = false;
        this.zza = strategy;
    }

    AdvertisingOptions(com.google.android.gms.nearby.connection.Strategy strategy, boolean z, boolean z2, boolean z3, boolean z4, byte[] bArr, boolean z5, android.os.ParcelUuid parcelUuid, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i, int i2, byte[] bArr2, long j, com.google.android.gms.nearby.connection.zzv[] zzvVarArr, boolean z12, boolean z13, boolean z14) {
        this.zza = strategy;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = z3;
        this.zze = z4;
        this.zzf = bArr;
        this.zzg = z5;
        this.zzh = parcelUuid;
        this.zzi = z6;
        this.zzj = z7;
        this.zzk = z8;
        this.zzl = z9;
        this.zzm = z10;
        this.zzn = z11;
        this.zzo = i;
        this.zzp = i2;
        this.zzq = bArr2;
        this.zzr = j;
        this.zzs = zzvVarArr;
        this.zzt = z12;
        this.zzu = z13;
        this.zzv = z14;
    }
}
