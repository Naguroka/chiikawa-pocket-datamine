package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
public abstract class GnssStatusCompat {
    public static final int CONSTELLATION_BEIDOU = 5;
    public static final int CONSTELLATION_GALILEO = 6;
    public static final int CONSTELLATION_GLONASS = 3;
    public static final int CONSTELLATION_GPS = 1;
    public static final int CONSTELLATION_IRNSS = 7;
    public static final int CONSTELLATION_QZSS = 4;
    public static final int CONSTELLATION_SBAS = 2;
    public static final int CONSTELLATION_UNKNOWN = 0;

    public static abstract class Callback {
        public void onFirstFix(int i) {
        }

        public void onSatelliteStatusChanged(androidx.core.location.GnssStatusCompat gnssStatusCompat) {
        }

        public void onStarted() {
        }

        public void onStopped() {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ConstellationType {
    }

    public abstract float getAzimuthDegrees(int i);

    public abstract float getBasebandCn0DbHz(int i);

    public abstract float getCarrierFrequencyHz(int i);

    public abstract float getCn0DbHz(int i);

    public abstract int getConstellationType(int i);

    public abstract float getElevationDegrees(int i);

    public abstract int getSatelliteCount();

    public abstract int getSvid(int i);

    public abstract boolean hasAlmanacData(int i);

    public abstract boolean hasBasebandCn0DbHz(int i);

    public abstract boolean hasCarrierFrequencyHz(int i);

    public abstract boolean hasEphemerisData(int i);

    public abstract boolean usedInFix(int i);

    public static androidx.core.location.GnssStatusCompat wrap(android.location.GnssStatus gnssStatus) {
        return new androidx.core.location.GnssStatusWrapper(gnssStatus);
    }

    public static androidx.core.location.GnssStatusCompat wrap(android.location.GpsStatus gpsStatus) {
        return new androidx.core.location.GpsStatusWrapper(gpsStatus);
    }

    GnssStatusCompat() {
    }
}
