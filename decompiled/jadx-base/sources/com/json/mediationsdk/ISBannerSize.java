package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public class ISBannerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2924a;
    private final int b;
    private final java.lang.String c;
    public com.json.mediationsdk.ISContainerParams containerParams;
    private boolean d;
    public static final com.json.mediationsdk.ISBannerSize BANNER = com.json.mediationsdk.l.a(com.json.mediationsdk.l.f2983a, 320, 50);
    public static final com.json.mediationsdk.ISBannerSize LARGE = com.json.mediationsdk.l.a(com.json.mediationsdk.l.b, 320, 90);
    public static final com.json.mediationsdk.ISBannerSize RECTANGLE = com.json.mediationsdk.l.a(com.json.mediationsdk.l.c, com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 250);
    protected static final com.json.mediationsdk.ISBannerSize e = com.json.mediationsdk.l.a();
    public static final com.json.mediationsdk.ISBannerSize SMART = com.json.mediationsdk.l.a(com.json.mediationsdk.l.e, 0, 0);

    public ISBannerSize(int i, int i2) {
        this("CUSTOM", i, i2);
    }

    public ISBannerSize(java.lang.String str, int i, int i2) {
        this.c = str;
        this.f2924a = i;
        this.b = i2;
        this.containerParams = new com.json.mediationsdk.ISContainerParams(i, i2);
    }

    public static int getMaximalAdaptiveHeight(int i) {
        return com.json.mediationsdk.l.b(i);
    }

    public java.lang.String getDescription() {
        return this.c;
    }

    public int getHeight() {
        return this.b;
    }

    public int getWidth() {
        return this.f2924a;
    }

    public boolean isAdaptive() {
        return this.d;
    }

    public boolean isSmart() {
        return this.c.equals(com.json.mediationsdk.l.e);
    }

    public void setAdaptive(boolean z) {
        this.d = z;
    }

    public void setContainerParams(com.json.mediationsdk.ISContainerParams iSContainerParams) {
        if (com.json.mediationsdk.l.a(iSContainerParams, this.f2924a, this.b)) {
            this.containerParams = iSContainerParams;
        }
    }
}
