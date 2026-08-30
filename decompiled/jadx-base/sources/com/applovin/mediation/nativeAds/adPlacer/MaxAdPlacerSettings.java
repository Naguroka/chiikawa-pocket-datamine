package com.applovin.mediation.nativeAds.adPlacer;

/* JADX INFO: loaded from: classes3.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1597a;
    private java.lang.String b;
    private final java.util.Set c = new java.util.TreeSet();
    private int d = 0;
    private int e = 256;
    private int f = 4;

    public MaxAdPlacerSettings(java.lang.String str) {
        this.f1597a = str;
    }

    public void addFixedPosition(int i) {
        this.c.add(java.lang.Integer.valueOf(i));
    }

    public java.lang.String getAdUnitId() {
        return this.f1597a;
    }

    public java.util.Set<java.lang.Integer> getFixedPositions() {
        return this.c;
    }

    public int getMaxAdCount() {
        return this.e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f;
    }

    public java.lang.String getPlacement() {
        return this.b;
    }

    public int getRepeatingInterval() {
        return this.d;
    }

    public boolean hasValidPositioning() {
        return !this.c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.d >= 2;
    }

    public void resetFixedPositions() {
        this.c.clear();
    }

    public void setMaxAdCount(int i) {
        this.e = i;
    }

    public void setMaxPreloadedAdCount(int i) {
        this.f = i;
    }

    public void setPlacement(java.lang.String str) {
        this.b = str;
    }

    public void setRepeatingInterval(int i) {
        if (i >= 2) {
            this.d = i;
            com.applovin.impl.sdk.n.g("MaxAdPlacerSettings", "Repeating interval set to " + i);
        } else {
            this.d = 0;
            com.applovin.impl.sdk.n.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i + ", which is less than minimum value of 2");
        }
    }

    public java.lang.String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f1597a + "', fixedPositions=" + this.c + ", repeatingInterval=" + this.d + ", maxAdCount=" + this.e + ", maxPreloadedAdCount=" + this.f + '}';
    }
}
