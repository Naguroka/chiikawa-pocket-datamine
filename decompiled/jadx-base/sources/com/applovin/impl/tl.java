package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f1367a;
    private final java.lang.Object b = new java.lang.Object();

    public tl(org.json.JSONObject jSONObject) {
        this.f1367a = jSONObject;
    }

    public void c(java.lang.String str) {
        synchronized (this.b) {
            this.f1367a.remove(str);
        }
    }

    public java.lang.String toString() {
        java.lang.String string;
        synchronized (this.b) {
            string = this.f1367a.toString();
        }
        return string;
    }

    public java.lang.Object a(androidx.arch.core.util.Function function) {
        java.lang.Object objApply;
        synchronized (this.b) {
            objApply = function.apply(this);
        }
        return objApply;
    }

    public void a(androidx.core.util.Consumer consumer) {
        synchronized (this.b) {
            consumer.accept(this);
        }
    }

    public java.util.List b(java.lang.String str, java.util.List list) {
        java.util.List<java.lang.String> stringList;
        synchronized (this.b) {
            stringList = com.applovin.impl.sdk.utils.JsonUtils.getStringList(this.f1367a, str, list);
        }
        return stringList;
    }

    public java.lang.Boolean a(java.lang.String str, java.lang.Boolean bool) {
        java.lang.Boolean bool2;
        synchronized (this.b) {
            bool2 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f1367a, str, bool);
        }
        return bool2;
    }

    public java.lang.Object b(java.lang.String str) {
        java.lang.Object objOpt;
        synchronized (this.b) {
            objOpt = this.f1367a.opt(str);
        }
        return objOpt;
    }

    public double a(java.lang.String str, double d) {
        double d2;
        synchronized (this.b) {
            d2 = com.applovin.impl.sdk.utils.JsonUtils.getDouble(this.f1367a, str, d);
        }
        return d2;
    }

    public float a(java.lang.String str, float f) {
        float f2;
        synchronized (this.b) {
            f2 = com.applovin.impl.sdk.utils.JsonUtils.getFloat(this.f1367a, str, f);
        }
        return f2;
    }

    public void b(java.lang.String str, int i) {
        synchronized (this.b) {
            com.applovin.impl.sdk.utils.JsonUtils.putInt(this.f1367a, str, i);
        }
    }

    public int a(java.lang.String str, int i) {
        int i2;
        synchronized (this.b) {
            i2 = com.applovin.impl.sdk.utils.JsonUtils.getInt(this.f1367a, str, i);
        }
        return i2;
    }

    public void b(java.lang.String str, long j) {
        synchronized (this.b) {
            com.applovin.impl.sdk.utils.JsonUtils.putLong(this.f1367a, str, j);
        }
    }

    public java.util.List a(java.lang.String str, java.util.List list) {
        java.util.List<java.lang.Integer> integerList;
        synchronized (this.b) {
            integerList = com.applovin.impl.sdk.utils.JsonUtils.getIntegerList(this.f1367a, str, list);
        }
        return integerList;
    }

    public org.json.JSONArray a(java.lang.String str, org.json.JSONArray jSONArray) {
        org.json.JSONArray jSONArray2;
        synchronized (this.b) {
            jSONArray2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(this.f1367a, str, jSONArray);
        }
        return jSONArray2;
    }

    public void b(java.lang.String str, java.lang.String str2) {
        synchronized (this.b) {
            com.applovin.impl.sdk.utils.JsonUtils.putString(this.f1367a, str, str2);
        }
    }

    public org.json.JSONObject a(java.lang.String str, org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2;
        synchronized (this.b) {
            jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(this.f1367a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(java.lang.String str, long j) {
        long j2;
        synchronized (this.b) {
            j2 = com.applovin.impl.sdk.utils.JsonUtils.getLong(this.f1367a, str, j);
        }
        return j2;
    }

    public java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.String string;
        synchronized (this.b) {
            string = com.applovin.impl.sdk.utils.JsonUtils.getString(this.f1367a, str, str2);
        }
        return string;
    }

    public boolean a(java.lang.String str) {
        boolean zHas;
        synchronized (this.b) {
            zHas = this.f1367a.has(str);
        }
        return zHas;
    }

    public void a(java.lang.String str, boolean z) {
        synchronized (this.b) {
            com.applovin.impl.sdk.utils.JsonUtils.putBoolean(this.f1367a, str, z);
        }
    }

    public void a(java.lang.String str, java.lang.Object obj) {
        synchronized (this.b) {
            com.applovin.impl.sdk.utils.JsonUtils.putObject(this.f1367a, str, obj);
        }
    }

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObjectDeepCopy;
        synchronized (this.b) {
            jSONObjectDeepCopy = com.applovin.impl.sdk.utils.JsonUtils.deepCopy(this.f1367a);
        }
        return jSONObjectDeepCopy;
    }
}
