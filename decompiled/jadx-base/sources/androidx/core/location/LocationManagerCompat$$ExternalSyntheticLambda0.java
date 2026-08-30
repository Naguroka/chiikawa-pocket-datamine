package androidx.core.location;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class LocationManagerCompat$$ExternalSyntheticLambda0 implements java.util.concurrent.Callable {
    public final /* synthetic */ android.location.LocationManager f$0;
    public final /* synthetic */ androidx.core.location.LocationManagerCompat.GpsStatusTransport f$1;

    public /* synthetic */ LocationManagerCompat$$ExternalSyntheticLambda0(android.location.LocationManager locationManager, androidx.core.location.LocationManagerCompat.GpsStatusTransport gpsStatusTransport) {
        this.f$0 = locationManager;
        this.f$1 = gpsStatusTransport;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        return java.lang.Boolean.valueOf(this.f$0.addGpsStatusListener(this.f$1));
    }
}
