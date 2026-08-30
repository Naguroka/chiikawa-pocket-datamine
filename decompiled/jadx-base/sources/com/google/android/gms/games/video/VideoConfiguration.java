package com.google.android.gms.games.video;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int CAPTURE_MODE_FILE = 0;
    public static final int CAPTURE_MODE_STREAM = 1;
    public static final int CAPTURE_MODE_UNKNOWN = -1;
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.video.VideoConfiguration> CREATOR = new com.google.android.gms.games.video.zzb();
    public static final int NUM_CAPTURE_MODE = 2;
    public static final int NUM_QUALITY_LEVEL = 4;
    public static final int QUALITY_LEVEL_FULLHD = 3;
    public static final int QUALITY_LEVEL_HD = 1;
    public static final int QUALITY_LEVEL_SD = 0;
    public static final int QUALITY_LEVEL_UNKNOWN = -1;
    public static final int QUALITY_LEVEL_XHD = 2;
    private final int zza;
    private final int zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
    public static final class Builder {
        private int zza;
        private int zzb;
        private boolean zzd = true;
        private boolean zze = true;
        private boolean zzc = true;

        public Builder(int i, int i2) {
            this.zza = i;
            this.zzb = i2;
        }

        public com.google.android.gms.games.video.VideoConfiguration build() {
            return new com.google.android.gms.games.video.VideoConfiguration(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        public com.google.android.gms.games.video.VideoConfiguration.Builder setCameraEnabled(boolean z) {
            this.zzd = z;
            return this;
        }

        public com.google.android.gms.games.video.VideoConfiguration.Builder setCaptureMode(int i) {
            this.zzb = i;
            return this;
        }

        public com.google.android.gms.games.video.VideoConfiguration.Builder setMicEnabled(boolean z) {
            this.zze = z;
            return this;
        }

        public com.google.android.gms.games.video.VideoConfiguration.Builder setQualityLevel(int i) {
            this.zza = i;
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ValidCaptureModes {
    }

    public VideoConfiguration(int i, int i2, boolean z, boolean z2, boolean z3) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(isValidQualityLevel(i, false));
        com.google.android.gms.common.internal.Preconditions.checkArgument(isValidCaptureMode(i2, false));
        this.zza = i;
        this.zzb = i2;
        this.zzc = z;
        this.zzd = z2;
        this.zze = z3;
    }

    public static boolean isValidCaptureMode(int i, boolean z) {
        if (i != -1) {
            z = true;
            if (i != 0 && i != 1) {
                return false;
            }
        }
        return z;
    }

    public static boolean isValidQualityLevel(int i, boolean z) {
        if (i != -1) {
            z = true;
            if (i != 0 && i != 1 && i != 2 && i != 3) {
                return false;
            }
        }
        return z;
    }

    public boolean getCameraEnabled() {
        return this.zzd;
    }

    public int getCaptureMode() {
        return this.zzb;
    }

    public boolean getMicEnabled() {
        return this.zze;
    }

    public int getQualityLevel() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getQualityLevel());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getCaptureMode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, getCameraEnabled());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, getMicEnabled());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
