package com.five_corp.ad.internal.ad.beacon;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.ad.beacon.e f1792a;
    public final java.lang.String b;
    public final com.five_corp.ad.internal.ad.beacon.a c;

    public d(com.five_corp.ad.internal.ad.beacon.e eVar, java.lang.String str, com.five_corp.ad.internal.ad.beacon.a aVar) {
        this.f1792a = eVar;
        this.b = str;
        this.c = aVar;
    }

    public final java.lang.String toString() {
        return "ExtraTrackingBeacon{extraTrackingEventType=" + this.f1792a + ", beaconCondition=" + java.lang.String.valueOf(this.c) + ", url='" + this.b + "'}";
    }
}
