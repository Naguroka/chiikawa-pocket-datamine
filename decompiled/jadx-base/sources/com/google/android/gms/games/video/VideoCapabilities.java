package com.google.android.gms.games.video;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoCapabilities extends com.google.android.gms.games.internal.zzh {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.video.VideoCapabilities> CREATOR = new com.google.android.gms.games.video.zza();
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean[] zzd;
    private final boolean[] zze;

    public VideoCapabilities(boolean z, boolean z2, boolean z3, boolean[] zArr, boolean[] zArr2) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = zArr;
        this.zze = zArr2;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.video.VideoCapabilities)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        com.google.android.gms.games.video.VideoCapabilities videoCapabilities = (com.google.android.gms.games.video.VideoCapabilities) obj;
        return com.google.android.gms.common.internal.Objects.equal(videoCapabilities.getSupportedCaptureModes(), getSupportedCaptureModes()) && com.google.android.gms.common.internal.Objects.equal(videoCapabilities.getSupportedQualityLevels(), getSupportedQualityLevels()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(videoCapabilities.isCameraSupported()), java.lang.Boolean.valueOf(isCameraSupported())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(videoCapabilities.isMicSupported()), java.lang.Boolean.valueOf(isMicSupported())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(videoCapabilities.isWriteStorageSupported()), java.lang.Boolean.valueOf(isWriteStorageSupported()));
    }

    public boolean[] getSupportedCaptureModes() {
        return this.zzd;
    }

    public boolean[] getSupportedQualityLevels() {
        return this.zze;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(getSupportedCaptureModes(), getSupportedQualityLevels(), java.lang.Boolean.valueOf(isCameraSupported()), java.lang.Boolean.valueOf(isMicSupported()), java.lang.Boolean.valueOf(isWriteStorageSupported()));
    }

    public boolean isCameraSupported() {
        return this.zza;
    }

    public boolean isFullySupported(int i, int i2) {
        return this.zza && this.zzb && this.zzc && supportsCaptureMode(i) && supportsQualityLevel(i2);
    }

    public boolean isMicSupported() {
        return this.zzb;
    }

    public boolean isWriteStorageSupported() {
        return this.zzc;
    }

    public boolean supportsCaptureMode(int i) {
        com.google.android.gms.common.internal.Preconditions.checkState(com.google.android.gms.games.video.VideoConfiguration.isValidCaptureMode(i, false));
        return this.zzd[i];
    }

    public boolean supportsQualityLevel(int i) {
        com.google.android.gms.common.internal.Preconditions.checkState(com.google.android.gms.games.video.VideoConfiguration.isValidQualityLevel(i, false));
        return this.zze[i];
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("SupportedCaptureModes", getSupportedCaptureModes()).add("SupportedQualityLevels", getSupportedQualityLevels()).add("CameraSupported", java.lang.Boolean.valueOf(isCameraSupported())).add("MicSupported", java.lang.Boolean.valueOf(isMicSupported())).add("StorageWriteSupported", java.lang.Boolean.valueOf(isWriteStorageSupported())).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, isCameraSupported());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, isMicSupported());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, isWriteStorageSupported());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanArray(parcel, 4, getSupportedCaptureModes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanArray(parcel, 5, getSupportedQualityLevels(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
