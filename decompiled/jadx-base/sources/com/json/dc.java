package com.json;

/* JADX INFO: loaded from: classes5.dex */
class dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final java.lang.String f2581a = "ironbeast";
    static final java.lang.String b = "outcome";
    static final int c = 3;
    static final int d = 2;
    static final int e = 0;

    dc() {
    }

    static com.json.e a(java.lang.String str, int i) {
        if (f2581a.equals(str)) {
            return new com.json.gk(i);
        }
        if (b.equals(str)) {
            return new com.json.so(i);
        }
        if (i == 2) {
            return new com.json.gk(i);
        }
        if (i == 3) {
            return new com.json.so(i);
        }
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i + ")", 2);
        return null;
    }
}
