package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.ug f1537a = new com.applovin.impl.ug();
    private final java.util.TreeSet b = new java.util.TreeSet();
    private final java.util.Map c = new java.util.HashMap();
    private int d;
    private int e;

    public java.util.Collection e(int i) {
        return new java.util.TreeSet((java.util.SortedSet) this.b.tailSet(java.lang.Integer.valueOf(i), false));
    }

    public yc(com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    public boolean g(int i) {
        return this.f1537a.contains(java.lang.Integer.valueOf(i));
    }

    public boolean h(int i) {
        return this.b.contains(java.lang.Integer.valueOf(i));
    }

    public void a() {
        this.c.clear();
        this.b.clear();
    }

    public int b(int i) {
        if (i == 0) {
            return 0;
        }
        return i + a(i - 1, false);
    }

    public int c(int i) {
        return i + a(i, false);
    }

    public int d(int i) {
        if (g(i)) {
            return -1;
        }
        return i - a(i, true);
    }

    public void f(int i) {
        int iB = this.f1537a.b(java.lang.Integer.valueOf(i));
        for (int size = this.f1537a.size() - 1; size >= iB; size--) {
            java.lang.Integer num = (java.lang.Integer) this.f1537a.a(size);
            int iIntValue = num.intValue() + 1;
            a(num.intValue(), iIntValue);
            this.f1537a.a(size, java.lang.Integer.valueOf(iIntValue));
        }
    }

    public void i(int i) {
        int iB = this.f1537a.b(java.lang.Integer.valueOf(i));
        if (g(i)) {
            this.c.remove(java.lang.Integer.valueOf(i));
            this.b.remove(java.lang.Integer.valueOf(i));
            this.f1537a.b(iB);
        }
        while (iB < this.f1537a.size()) {
            java.lang.Integer num = (java.lang.Integer) this.f1537a.a(iB);
            int iIntValue = num.intValue() - 1;
            a(num.intValue(), iIntValue);
            this.f1537a.a(iB, java.lang.Integer.valueOf(iIntValue));
            iB++;
        }
    }

    public int c() {
        int i = this.d;
        if (i != -1 && this.e != -1) {
            while (i <= this.e) {
                if (g(i) && !h(i)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public void a(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            this.c.remove(num);
            this.b.remove(num);
        }
    }

    public com.applovin.mediation.MaxAd a(int i) {
        return (com.applovin.mediation.MaxAd) this.c.get(java.lang.Integer.valueOf(i));
    }

    public void b(int i, int i2) {
        i(i);
        f(i2);
    }

    public java.util.Collection b() {
        return new java.util.TreeSet((java.util.SortedSet) this.b);
    }

    public void c(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    private int a(int i, boolean z) {
        int iC = this.f1537a.c(java.lang.Integer.valueOf(i));
        if (!z) {
            int i2 = i + iC;
            while (iC < this.f1537a.size() && i2 >= ((java.lang.Integer) this.f1537a.a(iC)).intValue()) {
                i2++;
                iC++;
            }
        }
        return iC;
    }

    private void a(com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            com.applovin.impl.sdk.n.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f1537a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f1537a.isEmpty()) {
            this.f1537a.add(java.lang.Integer.valueOf(repeatingInterval - 1));
        }
        int iIntValue = ((java.lang.Integer) this.f1537a.a()).intValue();
        while (true) {
            iIntValue += repeatingInterval;
            if (this.f1537a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f1537a.add(java.lang.Integer.valueOf(iIntValue));
            }
        }
    }

    public void a(com.applovin.mediation.MaxAd maxAd, int i) {
        this.c.put(java.lang.Integer.valueOf(i), maxAd);
        this.b.add(java.lang.Integer.valueOf(i));
    }

    private void a(int i, int i2) {
        if (this.c.containsKey(java.lang.Integer.valueOf(i))) {
            this.c.put(java.lang.Integer.valueOf(i2), (com.applovin.mediation.MaxAd) this.c.get(java.lang.Integer.valueOf(i)));
            this.b.add(java.lang.Integer.valueOf(i2));
            this.c.remove(java.lang.Integer.valueOf(i));
            this.b.remove(java.lang.Integer.valueOf(i));
        }
    }
}
