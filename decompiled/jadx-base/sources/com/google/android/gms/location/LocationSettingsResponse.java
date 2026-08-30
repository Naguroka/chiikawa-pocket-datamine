package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class LocationSettingsResponse extends com.google.android.gms.common.api.Response<com.google.android.gms.location.LocationSettingsResult> {
    public LocationSettingsResponse() {
    }

    public com.google.android.gms.location.LocationSettingsStates getLocationSettingsStates() {
        return getResult().getLocationSettingsStates();
    }

    public LocationSettingsResponse(com.google.android.gms.location.LocationSettingsResult locationSettingsResult) {
        super(locationSettingsResult);
    }
}
