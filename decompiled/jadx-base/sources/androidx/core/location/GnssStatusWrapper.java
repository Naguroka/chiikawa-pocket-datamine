package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
class GnssStatusWrapper extends androidx.core.location.GnssStatusCompat {
    private final android.location.GnssStatus mWrapped;

    GnssStatusWrapper(java.lang.Object obj) {
        this.mWrapped = (android.location.GnssStatus) androidx.core.util.Preconditions.checkNotNull((android.location.GnssStatus) obj);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
        return this.mWrapped.getSatelliteCount();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int i) {
        return this.mWrapped.getConstellationType(i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int i) {
        return this.mWrapped.getSvid(i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int i) {
        return this.mWrapped.getCn0DbHz(i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int i) {
        return this.mWrapped.getElevationDegrees(i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int i) {
        return this.mWrapped.getAzimuthDegrees(i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int i) {
        return this.mWrapped.hasEphemerisData(i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int i) {
        return this.mWrapped.hasAlmanacData(i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int i) {
        return this.mWrapped.usedInFix(i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.GnssStatusWrapper.Api26Impl.hasCarrierFrequencyHz(this.mWrapped, i);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.GnssStatusWrapper.Api26Impl.getCarrierFrequencyHz(this.mWrapped, i);
        }
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.location.GnssStatusWrapper.Api30Impl.hasBasebandCn0DbHz(this.mWrapped, i);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.location.GnssStatusWrapper.Api30Impl.getBasebandCn0DbHz(this.mWrapped, i);
        }
        throw new java.lang.UnsupportedOperationException();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.core.location.GnssStatusWrapper) {
            return this.mWrapped.equals(((androidx.core.location.GnssStatusWrapper) obj).mWrapped);
        }
        return false;
    }

    public int hashCode() {
        return this.mWrapped.hashCode();
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static float getCarrierFrequencyHz(android.location.GnssStatus gnssStatus, int i) {
            return gnssStatus.getCarrierFrequencyHz(i);
        }

        static boolean hasCarrierFrequencyHz(android.location.GnssStatus gnssStatus, int i) {
            return gnssStatus.hasCarrierFrequencyHz(i);
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static boolean hasBasebandCn0DbHz(android.location.GnssStatus gnssStatus, int i) {
            return gnssStatus.hasBasebandCn0DbHz(i);
        }

        static float getBasebandCn0DbHz(android.location.GnssStatus gnssStatus, int i) {
            return gnssStatus.getBasebandCn0DbHz(i);
        }
    }
}
