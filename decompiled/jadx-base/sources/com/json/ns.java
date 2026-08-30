package com.json;

/* JADX INFO: loaded from: classes5.dex */
class ns implements com.json.vh, com.ironsource.vh.a {
    private static final int c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map<com.ironsource.mediationsdk.IronSource.AD_UNIT, java.lang.Integer> f3101a = new java.util.HashMap();
    private final com.json.ck b = new com.json.ck();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3102a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.IronSource.AD_UNIT.values().length];
            f3102a = iArr;
            try {
                iArr[com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f3102a[com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f3102a[com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f3102a[com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    ns() {
        for (com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit : com.ironsource.mediationsdk.IronSource.AD_UNIT.values()) {
            a(ad_unit, 1);
        }
    }

    private void a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, int i) {
        this.f3101a.put(ad_unit, java.lang.Integer.valueOf(i));
        int i2 = com.ironsource.ns.a.f3102a[ad_unit.ordinal()];
        if (i2 == 1) {
            this.b.d(i);
            return;
        }
        if (i2 == 2) {
            this.b.b(i);
        } else if (i2 == 3) {
            this.b.a(i);
        } else {
            if (i2 != 4) {
                return;
            }
            this.b.c(i);
        }
    }

    @Override // com.json.vh
    public synchronized int a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        int iIntValue = -1;
        if (ad_unit == null) {
            return -1;
        }
        java.lang.Integer num = this.f3101a.get(ad_unit);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }

    @Override // com.json.vh
    public int a(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return -1;
        }
        return a(com.unity3d.mediation.a.a(adFormat)) - 1;
    }

    @Override // com.ironsource.vh.a
    public synchronized void b(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return;
        }
        a(ad_unit, this.f3101a.get(ad_unit).intValue() + 1);
    }
}
