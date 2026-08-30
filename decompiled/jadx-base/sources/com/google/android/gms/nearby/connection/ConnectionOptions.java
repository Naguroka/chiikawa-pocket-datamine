package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ConnectionOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.connection.ConnectionOptions> CREATOR = new com.google.android.gms.nearby.connection.zzk();
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private byte[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static final class Builder {
        private final com.google.android.gms.nearby.connection.ConnectionOptions zza;

        public Builder() {
            this.zza = new com.google.android.gms.nearby.connection.ConnectionOptions(null);
        }

        public com.google.android.gms.nearby.connection.ConnectionOptions build() {
            return this.zza;
        }

        public com.google.android.gms.nearby.connection.ConnectionOptions.Builder setDisruptiveUpgrade(boolean z) {
            this.zza.zzl = z;
            return this;
        }

        public com.google.android.gms.nearby.connection.ConnectionOptions.Builder setLowPower(boolean z) {
            this.zza.zza = z;
            return this;
        }

        public Builder(com.google.android.gms.nearby.connection.ConnectionOptions connectionOptions) {
            com.google.android.gms.nearby.connection.ConnectionOptions connectionOptions2 = new com.google.android.gms.nearby.connection.ConnectionOptions(null);
            this.zza = connectionOptions2;
            connectionOptions2.zza = connectionOptions.zza;
            connectionOptions2.zzb = connectionOptions.zzb;
            connectionOptions2.zzc = connectionOptions.zzc;
            connectionOptions2.zzd = connectionOptions.zzd;
            connectionOptions2.zze = connectionOptions.zze;
            connectionOptions2.zzf = connectionOptions.zzf;
            connectionOptions2.zzg = connectionOptions.zzg;
            connectionOptions2.zzh = connectionOptions.zzh;
            connectionOptions2.zzi = connectionOptions.zzi;
            connectionOptions2.zzj = connectionOptions.zzj;
            connectionOptions2.zzk = connectionOptions.zzk;
            connectionOptions2.zzl = connectionOptions.zzl;
        }
    }

    private ConnectionOptions() {
        this.zza = false;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
        this.zzh = true;
        this.zzj = false;
        this.zzk = true;
        this.zzl = true;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.nearby.connection.ConnectionOptions) {
            com.google.android.gms.nearby.connection.ConnectionOptions connectionOptions = (com.google.android.gms.nearby.connection.ConnectionOptions) obj;
            if (com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zza), java.lang.Boolean.valueOf(connectionOptions.zza)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzb), java.lang.Boolean.valueOf(connectionOptions.zzb)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzc), java.lang.Boolean.valueOf(connectionOptions.zzc)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzd), java.lang.Boolean.valueOf(connectionOptions.zzd)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zze), java.lang.Boolean.valueOf(connectionOptions.zze)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzf), java.lang.Boolean.valueOf(connectionOptions.zzf)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzg), java.lang.Boolean.valueOf(connectionOptions.zzg)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzh), java.lang.Boolean.valueOf(connectionOptions.zzh)) && java.util.Arrays.equals(this.zzi, connectionOptions.zzi) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzj), java.lang.Boolean.valueOf(connectionOptions.zzj)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzk), java.lang.Boolean.valueOf(connectionOptions.zzk)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzl), java.lang.Boolean.valueOf(connectionOptions.zzl))) {
                return true;
            }
        }
        return false;
    }

    public boolean getDisruptiveUpgrade() {
        return this.zzl;
    }

    public boolean getLowPower() {
        return this.zza;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zza), java.lang.Boolean.valueOf(this.zzb), java.lang.Boolean.valueOf(this.zzc), java.lang.Boolean.valueOf(this.zzd), java.lang.Boolean.valueOf(this.zze), java.lang.Boolean.valueOf(this.zzf), java.lang.Boolean.valueOf(this.zzg), java.lang.Boolean.valueOf(this.zzh), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzi)), java.lang.Boolean.valueOf(this.zzj), java.lang.Boolean.valueOf(this.zzk), java.lang.Boolean.valueOf(this.zzl));
    }

    public java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[12];
        objArr[0] = java.lang.Boolean.valueOf(this.zza);
        objArr[1] = java.lang.Boolean.valueOf(this.zzb);
        objArr[2] = java.lang.Boolean.valueOf(this.zzc);
        objArr[3] = java.lang.Boolean.valueOf(this.zzd);
        objArr[4] = java.lang.Boolean.valueOf(this.zze);
        objArr[5] = java.lang.Boolean.valueOf(this.zzf);
        objArr[6] = java.lang.Boolean.valueOf(this.zzg);
        objArr[7] = java.lang.Boolean.valueOf(this.zzh);
        byte[] bArr = this.zzi;
        objArr[8] = bArr == null ? null : com.google.android.gms.nearby.messages.internal.zzc.zza(bArr);
        objArr[9] = java.lang.Boolean.valueOf(this.zzj);
        objArr[10] = java.lang.Boolean.valueOf(this.zzk);
        objArr[11] = java.lang.Boolean.valueOf(this.zzl);
        return java.lang.String.format(locale, "ConnectionOptions{lowPower: %s, enableBluetooth: %s, enableBle: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableWifiHotspot: %s, enableWifiDirect: %s, remoteBluetoothMacAddress: %s, enableWebRtc: %s, enforceTopologyConstraints: %s, disruptiveUpgrade: %s}", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, getLowPower());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 9, this.zzi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 11, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 12, getDisruptiveUpgrade());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    /* synthetic */ ConnectionOptions(com.google.android.gms.nearby.connection.zzj zzjVar) {
        this.zza = false;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
        this.zzh = true;
        this.zzj = false;
        this.zzk = true;
        this.zzl = true;
    }

    ConnectionOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, byte[] bArr, boolean z9, boolean z10, boolean z11) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = z4;
        this.zze = z5;
        this.zzf = z6;
        this.zzg = z7;
        this.zzh = z8;
        this.zzi = bArr;
        this.zzj = z9;
        this.zzk = z10;
        this.zzl = z11;
    }
}
