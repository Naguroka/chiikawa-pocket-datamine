package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
public final class LocationRequestCompat {
    private static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
    public static final long PASSIVE_INTERVAL = Long.MAX_VALUE;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = 102;
    public static final int QUALITY_HIGH_ACCURACY = 100;
    public static final int QUALITY_LOW_POWER = 104;
    final long mDurationMillis;
    final long mIntervalMillis;
    final long mMaxUpdateDelayMillis;
    final int mMaxUpdates;
    final float mMinUpdateDistanceMeters;
    final long mMinUpdateIntervalMillis;
    final int mQuality;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Quality {
    }

    LocationRequestCompat(long j, int i, long j2, int i2, long j3, float f, long j4) {
        this.mIntervalMillis = j;
        this.mQuality = i;
        this.mMinUpdateIntervalMillis = j3;
        this.mDurationMillis = j2;
        this.mMaxUpdates = i2;
        this.mMinUpdateDistanceMeters = f;
        this.mMaxUpdateDelayMillis = j4;
    }

    public int getQuality() {
        return this.mQuality;
    }

    public long getIntervalMillis() {
        return this.mIntervalMillis;
    }

    public long getMinUpdateIntervalMillis() {
        long j = this.mMinUpdateIntervalMillis;
        return j == -1 ? this.mIntervalMillis : j;
    }

    public long getDurationMillis() {
        return this.mDurationMillis;
    }

    public int getMaxUpdates() {
        return this.mMaxUpdates;
    }

    public float getMinUpdateDistanceMeters() {
        return this.mMinUpdateDistanceMeters;
    }

    public long getMaxUpdateDelayMillis() {
        return this.mMaxUpdateDelayMillis;
    }

    public android.location.LocationRequest toLocationRequest() {
        return androidx.core.location.LocationRequestCompat.Api31Impl.toLocationRequest(this);
    }

    public android.location.LocationRequest toLocationRequest(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return toLocationRequest();
        }
        return (android.location.LocationRequest) androidx.core.location.LocationRequestCompat.Api19Impl.toLocationRequest(this, str);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.core.location.LocationRequestCompat)) {
            return false;
        }
        androidx.core.location.LocationRequestCompat locationRequestCompat = (androidx.core.location.LocationRequestCompat) obj;
        return this.mQuality == locationRequestCompat.mQuality && this.mIntervalMillis == locationRequestCompat.mIntervalMillis && this.mMinUpdateIntervalMillis == locationRequestCompat.mMinUpdateIntervalMillis && this.mDurationMillis == locationRequestCompat.mDurationMillis && this.mMaxUpdates == locationRequestCompat.mMaxUpdates && java.lang.Float.compare(locationRequestCompat.mMinUpdateDistanceMeters, this.mMinUpdateDistanceMeters) == 0 && this.mMaxUpdateDelayMillis == locationRequestCompat.mMaxUpdateDelayMillis;
    }

    public int hashCode() {
        int i = this.mQuality * 31;
        long j = this.mIntervalMillis;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.mMinUpdateIntervalMillis;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Request[");
        if (this.mIntervalMillis != Long.MAX_VALUE) {
            sb.append("@");
            androidx.core.util.TimeUtils.formatDuration(this.mIntervalMillis, sb);
            int i = this.mQuality;
            if (i == 100) {
                sb.append(" HIGH_ACCURACY");
            } else if (i == 102) {
                sb.append(" BALANCED");
            } else if (i == 104) {
                sb.append(" LOW_POWER");
            }
        } else {
            sb.append("PASSIVE");
        }
        if (this.mDurationMillis != Long.MAX_VALUE) {
            sb.append(", duration=");
            androidx.core.util.TimeUtils.formatDuration(this.mDurationMillis, sb);
        }
        if (this.mMaxUpdates != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=").append(this.mMaxUpdates);
        }
        long j = this.mMinUpdateIntervalMillis;
        if (j != -1 && j < this.mIntervalMillis) {
            sb.append(", minUpdateInterval=");
            androidx.core.util.TimeUtils.formatDuration(this.mMinUpdateIntervalMillis, sb);
        }
        if (this.mMinUpdateDistanceMeters > 0.0d) {
            sb.append(", minUpdateDistance=").append(this.mMinUpdateDistanceMeters);
        }
        if (this.mMaxUpdateDelayMillis / 2 > this.mIntervalMillis) {
            sb.append(", maxUpdateDelay=");
            androidx.core.util.TimeUtils.formatDuration(this.mMaxUpdateDelayMillis, sb);
        }
        sb.append(']');
        return sb.toString();
    }

    public static final class Builder {
        private long mDurationMillis;
        private long mIntervalMillis;
        private long mMaxUpdateDelayMillis;
        private int mMaxUpdates;
        private float mMinUpdateDistanceMeters;
        private long mMinUpdateIntervalMillis;
        private int mQuality;

        public Builder(long j) {
            setIntervalMillis(j);
            this.mQuality = 102;
            this.mDurationMillis = Long.MAX_VALUE;
            this.mMaxUpdates = Integer.MAX_VALUE;
            this.mMinUpdateIntervalMillis = -1L;
            this.mMinUpdateDistanceMeters = 0.0f;
            this.mMaxUpdateDelayMillis = 0L;
        }

        public Builder(androidx.core.location.LocationRequestCompat locationRequestCompat) {
            this.mIntervalMillis = locationRequestCompat.mIntervalMillis;
            this.mQuality = locationRequestCompat.mQuality;
            this.mDurationMillis = locationRequestCompat.mDurationMillis;
            this.mMaxUpdates = locationRequestCompat.mMaxUpdates;
            this.mMinUpdateIntervalMillis = locationRequestCompat.mMinUpdateIntervalMillis;
            this.mMinUpdateDistanceMeters = locationRequestCompat.mMinUpdateDistanceMeters;
            this.mMaxUpdateDelayMillis = locationRequestCompat.mMaxUpdateDelayMillis;
        }

        public androidx.core.location.LocationRequestCompat.Builder setIntervalMillis(long j) {
            this.mIntervalMillis = androidx.core.util.Preconditions.checkArgumentInRange(j, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        public androidx.core.location.LocationRequestCompat.Builder setQuality(int i) {
            androidx.core.util.Preconditions.checkArgument(i == 104 || i == 102 || i == 100, "quality must be a defined QUALITY constant, not %d", java.lang.Integer.valueOf(i));
            this.mQuality = i;
            return this;
        }

        public androidx.core.location.LocationRequestCompat.Builder setDurationMillis(long j) {
            this.mDurationMillis = androidx.core.util.Preconditions.checkArgumentInRange(j, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        public androidx.core.location.LocationRequestCompat.Builder setMaxUpdates(int i) {
            this.mMaxUpdates = androidx.core.util.Preconditions.checkArgumentInRange(i, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        public androidx.core.location.LocationRequestCompat.Builder setMinUpdateIntervalMillis(long j) {
            this.mMinUpdateIntervalMillis = androidx.core.util.Preconditions.checkArgumentInRange(j, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        public androidx.core.location.LocationRequestCompat.Builder clearMinUpdateIntervalMillis() {
            this.mMinUpdateIntervalMillis = -1L;
            return this;
        }

        public androidx.core.location.LocationRequestCompat.Builder setMinUpdateDistanceMeters(float f) {
            this.mMinUpdateDistanceMeters = f;
            this.mMinUpdateDistanceMeters = androidx.core.util.Preconditions.checkArgumentInRange(f, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        public androidx.core.location.LocationRequestCompat.Builder setMaxUpdateDelayMillis(long j) {
            this.mMaxUpdateDelayMillis = j;
            this.mMaxUpdateDelayMillis = androidx.core.util.Preconditions.checkArgumentInRange(j, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        public androidx.core.location.LocationRequestCompat build() {
            androidx.core.util.Preconditions.checkState((this.mIntervalMillis == Long.MAX_VALUE && this.mMinUpdateIntervalMillis == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j = this.mIntervalMillis;
            return new androidx.core.location.LocationRequestCompat(j, this.mQuality, this.mDurationMillis, this.mMaxUpdates, java.lang.Math.min(this.mMinUpdateIntervalMillis, j), this.mMinUpdateDistanceMeters, this.mMaxUpdateDelayMillis);
        }
    }

    private static class Api31Impl {
        private Api31Impl() {
        }

        public static android.location.LocationRequest toLocationRequest(androidx.core.location.LocationRequestCompat locationRequestCompat) {
            return new android.location.LocationRequest.Builder(locationRequestCompat.getIntervalMillis()).setQuality(locationRequestCompat.getQuality()).setMinUpdateIntervalMillis(locationRequestCompat.getMinUpdateIntervalMillis()).setDurationMillis(locationRequestCompat.getDurationMillis()).setMaxUpdates(locationRequestCompat.getMaxUpdates()).setMinUpdateDistanceMeters(locationRequestCompat.getMinUpdateDistanceMeters()).setMaxUpdateDelayMillis(locationRequestCompat.getMaxUpdateDelayMillis()).build();
        }
    }

    private static class Api19Impl {
        private static java.lang.reflect.Method sCreateFromDeprecatedProviderMethod;
        private static java.lang.Class<?> sLocationRequestClass;
        private static java.lang.reflect.Method sSetExpireInMethod;
        private static java.lang.reflect.Method sSetFastestIntervalMethod;
        private static java.lang.reflect.Method sSetNumUpdatesMethod;
        private static java.lang.reflect.Method sSetQualityMethod;

        private Api19Impl() {
        }

        public static java.lang.Object toLocationRequest(androidx.core.location.LocationRequestCompat locationRequestCompat, java.lang.String str) {
            try {
                if (sLocationRequestClass == null) {
                    sLocationRequestClass = java.lang.Class.forName("android.location.LocationRequest");
                }
                if (sCreateFromDeprecatedProviderMethod == null) {
                    java.lang.reflect.Method declaredMethod = sLocationRequestClass.getDeclaredMethod("createFromDeprecatedProvider", java.lang.String.class, java.lang.Long.TYPE, java.lang.Float.TYPE, java.lang.Boolean.TYPE);
                    sCreateFromDeprecatedProviderMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                java.lang.Object objInvoke = sCreateFromDeprecatedProviderMethod.invoke(null, str, java.lang.Long.valueOf(locationRequestCompat.getIntervalMillis()), java.lang.Float.valueOf(locationRequestCompat.getMinUpdateDistanceMeters()), false);
                if (objInvoke == null) {
                    return null;
                }
                if (sSetQualityMethod == null) {
                    java.lang.reflect.Method declaredMethod2 = sLocationRequestClass.getDeclaredMethod("setQuality", java.lang.Integer.TYPE);
                    sSetQualityMethod = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                sSetQualityMethod.invoke(objInvoke, java.lang.Integer.valueOf(locationRequestCompat.getQuality()));
                if (sSetFastestIntervalMethod == null) {
                    java.lang.reflect.Method declaredMethod3 = sLocationRequestClass.getDeclaredMethod("setFastestInterval", java.lang.Long.TYPE);
                    sSetFastestIntervalMethod = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                sSetFastestIntervalMethod.invoke(objInvoke, java.lang.Long.valueOf(locationRequestCompat.getMinUpdateIntervalMillis()));
                if (locationRequestCompat.getMaxUpdates() < Integer.MAX_VALUE) {
                    if (sSetNumUpdatesMethod == null) {
                        java.lang.reflect.Method declaredMethod4 = sLocationRequestClass.getDeclaredMethod("setNumUpdates", java.lang.Integer.TYPE);
                        sSetNumUpdatesMethod = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    sSetNumUpdatesMethod.invoke(objInvoke, java.lang.Integer.valueOf(locationRequestCompat.getMaxUpdates()));
                }
                if (locationRequestCompat.getDurationMillis() < Long.MAX_VALUE) {
                    if (sSetExpireInMethod == null) {
                        java.lang.reflect.Method declaredMethod5 = sLocationRequestClass.getDeclaredMethod("setExpireIn", java.lang.Long.TYPE);
                        sSetExpireInMethod = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    sSetExpireInMethod.invoke(objInvoke, java.lang.Long.valueOf(locationRequestCompat.getDurationMillis()));
                }
                return objInvoke;
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                return null;
            }
        }
    }
}
