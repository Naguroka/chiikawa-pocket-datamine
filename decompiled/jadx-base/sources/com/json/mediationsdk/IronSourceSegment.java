package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceSegment {
    public static final java.lang.String AGE = "age";
    public static final java.lang.String GENDER = "gen";
    public static final java.lang.String IAPT = "iapt";
    public static final java.lang.String LEVEL = "lvl";
    public static final java.lang.String PAYING = "pay";
    public static final java.lang.String USER_CREATION_DATE = "ucd";
    private static final java.lang.String m = "segName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f2928a;
    private java.lang.String g;
    private int b = 999999;
    private double c = 999999.99d;
    private final java.lang.String d = "custom";
    private final int e = 5;
    private int f = -1;
    private int h = -1;
    private java.util.concurrent.atomic.AtomicBoolean i = null;
    private double j = -1.0d;
    private long k = 0;
    private java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> l = new java.util.ArrayList<>();

    private boolean a(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private boolean a(java.lang.String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    @java.lang.Deprecated
    public int getAge() {
        return this.f;
    }

    @java.lang.Deprecated
    public java.lang.String getGender() {
        return this.g;
    }

    public double getIapt() {
        return this.j;
    }

    public java.util.concurrent.atomic.AtomicBoolean getIsPaying() {
        return this.i;
    }

    public int getLevel() {
        return this.h;
    }

    public java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> getSegmentData() {
        java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> arrayList = new java.util.ArrayList<>();
        if (this.f != -1) {
            arrayList.add(new android.util.Pair<>(AGE, this.f + ""));
        }
        if (!android.text.TextUtils.isEmpty(this.g)) {
            arrayList.add(new android.util.Pair<>(GENDER, this.g));
        }
        if (this.h != -1) {
            arrayList.add(new android.util.Pair<>(LEVEL, this.h + ""));
        }
        if (this.i != null) {
            arrayList.add(new android.util.Pair<>(PAYING, this.i + ""));
        }
        if (this.j != -1.0d) {
            arrayList.add(new android.util.Pair<>(IAPT, this.j + ""));
        }
        if (this.k != 0) {
            arrayList.add(new android.util.Pair<>(USER_CREATION_DATE, this.k + ""));
        }
        if (!android.text.TextUtils.isEmpty(this.f2928a)) {
            arrayList.add(new android.util.Pair<>(m, this.f2928a));
        }
        arrayList.addAll(this.l);
        return arrayList;
    }

    public java.lang.String getSegmentName() {
        return this.f2928a;
    }

    public long getUcd() {
        return this.k;
    }

    @java.lang.Deprecated
    public void setAge(int i) {
        if (i <= 0 || i > 199) {
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "setAge( " + i + " ) age must be between 1-199", 2);
        } else {
            this.f = i;
        }
    }

    public void setCustom(java.lang.String str, java.lang.String str2) {
        try {
            if (!a(str) || !a(str2) || !a(str, 1, 32) || !a(str2, 1, 32)) {
                com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
                return;
            }
            java.lang.String str3 = androidx.media3.datasource.cache.ContentMetadata.KEY_CUSTOM_PREFIX + str;
            if (this.l.size() >= 5) {
                this.l.remove(0);
            }
            this.l.add(new android.util.Pair<>(str3, str2));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    @java.lang.Deprecated
    public void setGender(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || !(com.json.environment.StringUtils.toLowerCase(str).equals(com.ironsource.mediationsdk.utils.IronSourceConstants.a.b) || com.json.environment.StringUtils.toLowerCase(str).equals(com.ironsource.mediationsdk.utils.IronSourceConstants.a.c))) {
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "setGender( " + str + " ) is invalid", 2);
        } else {
            this.g = str;
        }
    }

    public void setIAPTotal(double d) {
        if (d <= 0.0d || d >= this.c) {
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "setIAPTotal( " + d + " ) iapt must be between 0-" + this.c, 2);
        } else {
            this.j = java.lang.Math.floor(d * 100.0d) / 100.0d;
        }
    }

    public void setIsPaying(boolean z) {
        if (this.i == null) {
            this.i = new java.util.concurrent.atomic.AtomicBoolean();
        }
        this.i.set(z);
    }

    public void setLevel(int i) {
        if (i <= 0 || i >= this.b) {
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "setLevel( " + i + " ) level must be between 1-" + this.b, 2);
        } else {
            this.h = i;
        }
    }

    public void setSegmentName(java.lang.String str) {
        if (a(str) && a(str, 1, 32)) {
            this.f2928a = str;
        } else {
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
        }
    }

    public void setUserCreationDate(long j) {
        if (j > 0) {
            this.k = j;
        } else {
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "setUserCreationDate( " + j + " ) is an invalid timestamp", 2);
        }
    }

    public org.json.JSONObject toJson() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (android.util.Pair<java.lang.String, java.lang.String> pair : getSegmentData()) {
            try {
                jSONObject.put((java.lang.String) pair.first, pair.second);
            } catch (org.json.JSONException e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception " + e.getMessage());
            }
        }
        return jSONObject;
    }
}
