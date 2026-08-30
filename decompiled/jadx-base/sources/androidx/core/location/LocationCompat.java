package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
public final class LocationCompat {
    public static final java.lang.String EXTRA_BEARING_ACCURACY = "bearingAccuracy";
    public static final java.lang.String EXTRA_IS_MOCK = "mockLocation";
    public static final java.lang.String EXTRA_MSL_ALTITUDE = "androidx.core.location.extra.MSL_ALTITUDE";
    public static final java.lang.String EXTRA_MSL_ALTITUDE_ACCURACY = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    public static final java.lang.String EXTRA_SPEED_ACCURACY = "speedAccuracy";
    public static final java.lang.String EXTRA_VERTICAL_ACCURACY = "verticalAccuracy";
    private static java.lang.reflect.Method sSetIsFromMockProviderMethod;

    private LocationCompat() {
    }

    public static long getElapsedRealtimeNanos(android.location.Location location) {
        return androidx.core.location.LocationCompat.Api17Impl.getElapsedRealtimeNanos(location);
    }

    public static long getElapsedRealtimeMillis(android.location.Location location) {
        return java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(androidx.core.location.LocationCompat.Api17Impl.getElapsedRealtimeNanos(location));
    }

    public static boolean hasVerticalAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.hasVerticalAccuracy(location);
        }
        return containsExtra(location, "verticalAccuracy");
    }

    public static float getVerticalAccuracyMeters(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.getVerticalAccuracyMeters(location);
        }
        android.os.Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("verticalAccuracy", 0.0f);
    }

    public static void setVerticalAccuracyMeters(android.location.Location location, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.location.LocationCompat.Api26Impl.setVerticalAccuracyMeters(location, f);
        } else {
            getOrCreateExtras(location).putFloat("verticalAccuracy", f);
        }
    }

    public static boolean hasSpeedAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.hasSpeedAccuracy(location);
        }
        return containsExtra(location, EXTRA_SPEED_ACCURACY);
    }

    public static float getSpeedAccuracyMetersPerSecond(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.getSpeedAccuracyMetersPerSecond(location);
        }
        android.os.Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_SPEED_ACCURACY, 0.0f);
    }

    public static void setSpeedAccuracyMetersPerSecond(android.location.Location location, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.location.LocationCompat.Api26Impl.setSpeedAccuracyMetersPerSecond(location, f);
        } else {
            getOrCreateExtras(location).putFloat(EXTRA_SPEED_ACCURACY, f);
        }
    }

    public static boolean hasBearingAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.hasBearingAccuracy(location);
        }
        return containsExtra(location, EXTRA_BEARING_ACCURACY);
    }

    public static float getBearingAccuracyDegrees(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.getBearingAccuracyDegrees(location);
        }
        android.os.Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_BEARING_ACCURACY, 0.0f);
    }

    public static void setBearingAccuracyDegrees(android.location.Location location, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.location.LocationCompat.Api26Impl.setBearingAccuracyDegrees(location, f);
        } else {
            getOrCreateExtras(location).putFloat(EXTRA_BEARING_ACCURACY, f);
        }
    }

    public static double getMslAltitudeMeters(android.location.Location location) {
        androidx.core.util.Preconditions.checkState(hasMslAltitude(location), "The Mean Sea Level altitude of the location is not set.");
        return getOrCreateExtras(location).getDouble(EXTRA_MSL_ALTITUDE);
    }

    public static void setMslAltitudeMeters(android.location.Location location, double d) {
        getOrCreateExtras(location).putDouble(EXTRA_MSL_ALTITUDE, d);
    }

    public static boolean hasMslAltitude(android.location.Location location) {
        return containsExtra(location, EXTRA_MSL_ALTITUDE);
    }

    public static void removeMslAltitude(android.location.Location location) {
        removeExtra(location, EXTRA_MSL_ALTITUDE);
    }

    public static float getMslAltitudeAccuracyMeters(android.location.Location location) {
        androidx.core.util.Preconditions.checkState(hasMslAltitudeAccuracy(location), "The Mean Sea Level altitude accuracy of the location is not set.");
        return getOrCreateExtras(location).getFloat(EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static void setMslAltitudeAccuracyMeters(android.location.Location location, float f) {
        getOrCreateExtras(location).putFloat(EXTRA_MSL_ALTITUDE_ACCURACY, f);
    }

    public static boolean hasMslAltitudeAccuracy(android.location.Location location) {
        return containsExtra(location, EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static void removeMslAltitudeAccuracy(android.location.Location location) {
        removeExtra(location, EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static boolean isMock(android.location.Location location) {
        return androidx.core.location.LocationCompat.Api18Impl.isMock(location);
    }

    public static void setMock(android.location.Location location, boolean z) {
        try {
            getSetIsFromMockProviderMethod().invoke(location, java.lang.Boolean.valueOf(z));
        } catch (java.lang.IllegalAccessException e) {
            java.lang.IllegalAccessError illegalAccessError = new java.lang.IllegalAccessError();
            illegalAccessError.initCause(e);
            throw illegalAccessError;
        } catch (java.lang.NoSuchMethodException e2) {
            java.lang.NoSuchMethodError noSuchMethodError = new java.lang.NoSuchMethodError();
            noSuchMethodError.initCause(e2);
            throw noSuchMethodError;
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    private static class Api26Impl {
        private Api26Impl() {
        }

        static boolean hasVerticalAccuracy(android.location.Location location) {
            return location.hasVerticalAccuracy();
        }

        static float getVerticalAccuracyMeters(android.location.Location location) {
            return location.getVerticalAccuracyMeters();
        }

        static void setVerticalAccuracyMeters(android.location.Location location, float f) {
            location.setVerticalAccuracyMeters(f);
        }

        static boolean hasSpeedAccuracy(android.location.Location location) {
            return location.hasSpeedAccuracy();
        }

        static float getSpeedAccuracyMetersPerSecond(android.location.Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        static void setSpeedAccuracyMetersPerSecond(android.location.Location location, float f) {
            location.setSpeedAccuracyMetersPerSecond(f);
        }

        static boolean hasBearingAccuracy(android.location.Location location) {
            return location.hasBearingAccuracy();
        }

        static float getBearingAccuracyDegrees(android.location.Location location) {
            return location.getBearingAccuracyDegrees();
        }

        static void setBearingAccuracyDegrees(android.location.Location location, float f) {
            location.setBearingAccuracyDegrees(f);
        }
    }

    private static class Api18Impl {
        private Api18Impl() {
        }

        static boolean isMock(android.location.Location location) {
            return location.isFromMockProvider();
        }
    }

    private static class Api17Impl {
        private Api17Impl() {
        }

        static long getElapsedRealtimeNanos(android.location.Location location) {
            return location.getElapsedRealtimeNanos();
        }
    }

    private static java.lang.reflect.Method getSetIsFromMockProviderMethod() throws java.lang.NoSuchMethodException {
        if (sSetIsFromMockProviderMethod == null) {
            java.lang.reflect.Method declaredMethod = android.location.Location.class.getDeclaredMethod("setIsFromMockProvider", java.lang.Boolean.TYPE);
            sSetIsFromMockProviderMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return sSetIsFromMockProviderMethod;
    }

    private static android.os.Bundle getOrCreateExtras(android.location.Location location) {
        android.os.Bundle extras = location.getExtras();
        if (extras != null) {
            return extras;
        }
        location.setExtras(new android.os.Bundle());
        return location.getExtras();
    }

    private static boolean containsExtra(android.location.Location location, java.lang.String str) {
        android.os.Bundle extras = location.getExtras();
        return extras != null && extras.containsKey(str);
    }

    private static void removeExtra(android.location.Location location, java.lang.String str) {
        android.os.Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras(null);
            }
        }
    }
}
