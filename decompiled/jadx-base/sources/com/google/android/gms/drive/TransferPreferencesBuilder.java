package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public class TransferPreferencesBuilder {
    public static final com.google.android.gms.drive.TransferPreferences DEFAULT_PREFERENCES = new com.google.android.gms.drive.TransferPreferencesBuilder.zza(1, true, 256);
    private int zzbl;
    private boolean zzbm;
    private int zzbn;

    public TransferPreferencesBuilder() {
        this(DEFAULT_PREFERENCES);
    }

    public TransferPreferencesBuilder(com.google.android.gms.drive.TransferPreferences transferPreferences) {
        this.zzbl = transferPreferences.getNetworkPreference();
        this.zzbm = transferPreferences.isRoamingAllowed();
        this.zzbn = transferPreferences.getBatteryUsagePreference();
    }

    static class zza implements com.google.android.gms.drive.TransferPreferences {
        private final int zzbl;
        private final boolean zzbm;
        private final int zzbn;

        zza(int i, boolean z, int i2) {
            this.zzbl = i;
            this.zzbm = z;
            this.zzbn = i2;
        }

        @Override // com.google.android.gms.drive.TransferPreferences
        public final int getNetworkPreference() {
            return this.zzbl;
        }

        @Override // com.google.android.gms.drive.TransferPreferences
        public final boolean isRoamingAllowed() {
            return this.zzbm;
        }

        @Override // com.google.android.gms.drive.TransferPreferences
        public final int getBatteryUsagePreference() {
            return this.zzbn;
        }

        public final int hashCode() {
            return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzbl), java.lang.Boolean.valueOf(this.zzbm), java.lang.Integer.valueOf(this.zzbn));
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                com.google.android.gms.drive.TransferPreferencesBuilder.zza zzaVar = (com.google.android.gms.drive.TransferPreferencesBuilder.zza) obj;
                if (zzaVar.zzbl == this.zzbl && zzaVar.zzbm == this.zzbm && zzaVar.zzbn == this.zzbn) {
                    return true;
                }
            }
            return false;
        }

        public final java.lang.String toString() {
            return java.lang.String.format("NetworkPreference: %s, IsRoamingAllowed %s, BatteryUsagePreference %s", java.lang.Integer.valueOf(this.zzbl), java.lang.Boolean.valueOf(this.zzbm), java.lang.Integer.valueOf(this.zzbn));
        }
    }

    public TransferPreferencesBuilder(com.google.android.gms.drive.FileUploadPreferences fileUploadPreferences) {
        this.zzbl = fileUploadPreferences.getNetworkTypePreference();
        this.zzbm = fileUploadPreferences.isRoamingAllowed();
        this.zzbn = fileUploadPreferences.getBatteryUsagePreference();
    }

    public com.google.android.gms.drive.TransferPreferencesBuilder setNetworkPreference(int i) {
        this.zzbl = i;
        return this;
    }

    public com.google.android.gms.drive.TransferPreferencesBuilder setIsRoamingAllowed(boolean z) {
        this.zzbm = z;
        return this;
    }

    public com.google.android.gms.drive.TransferPreferencesBuilder setBatteryUsagePreference(int i) {
        this.zzbn = i;
        return this;
    }

    public com.google.android.gms.drive.TransferPreferences build() {
        return new com.google.android.gms.drive.TransferPreferencesBuilder.zza(this.zzbl, this.zzbm, this.zzbn);
    }
}
