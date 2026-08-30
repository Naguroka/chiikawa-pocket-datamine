package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
public interface LocationListenerCompat extends android.location.LocationListener {
    @Override // android.location.LocationListener
    default void onFlushComplete(int i) {
    }

    @Override // android.location.LocationListener
    default void onProviderDisabled(java.lang.String str) {
    }

    @Override // android.location.LocationListener
    default void onProviderEnabled(java.lang.String str) {
    }

    @Override // android.location.LocationListener
    default void onStatusChanged(java.lang.String str, int i, android.os.Bundle bundle) {
    }

    @Override // android.location.LocationListener
    default void onLocationChanged(java.util.List<android.location.Location> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            onLocationChanged(list.get(i));
        }
    }
}
