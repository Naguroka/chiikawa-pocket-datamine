package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ka {
    public static final com.applovin.impl.ka A;
    public static final com.applovin.impl.ka B;
    public static final com.applovin.impl.ka C;
    public static final com.applovin.impl.ka D;
    public static final com.applovin.impl.ka E;
    public static final com.applovin.impl.ka F;
    public static final com.applovin.impl.ka G;
    public static final com.applovin.impl.ka H;
    public static final com.applovin.impl.ka I;
    public static final com.applovin.impl.ka J;
    public static final com.applovin.impl.ka K;
    public static final com.applovin.impl.ka L;
    public static final com.applovin.impl.ka M;
    public static final com.applovin.impl.ka N;
    public static final com.applovin.impl.ka O;
    public static final com.applovin.impl.ka P;
    public static final com.applovin.impl.ka Q;
    public static final com.applovin.impl.ka R;
    public static final com.applovin.impl.ka S;
    public static final com.applovin.impl.ka T;
    public static final com.applovin.impl.ka U;
    public static final com.applovin.impl.ka V;
    public static final com.applovin.impl.ka W;
    public static final com.applovin.impl.ka X;
    public static final com.applovin.impl.ka Y;
    public static final com.applovin.impl.ka Z;
    public static final com.applovin.impl.ka a0;
    public static final com.applovin.impl.ka b0;
    private static org.json.JSONObject c;
    public static final com.applovin.impl.ka c0;
    public static final com.applovin.impl.ka d;
    public static final com.applovin.impl.ka d0;
    public static final com.applovin.impl.ka e;
    public static final com.applovin.impl.ka f;
    public static final com.applovin.impl.ka g;
    public static final com.applovin.impl.ka h;
    public static final com.applovin.impl.ka i;
    public static final com.applovin.impl.ka j;
    public static final com.applovin.impl.ka k;
    public static final com.applovin.impl.ka l;
    public static final com.applovin.impl.ka m;
    public static final com.applovin.impl.ka n;
    public static final com.applovin.impl.ka o;
    public static final com.applovin.impl.ka p;
    public static final com.applovin.impl.ka q;
    public static final com.applovin.impl.ka r;
    public static final com.applovin.impl.ka s;
    public static final com.applovin.impl.ka t;
    public static final com.applovin.impl.ka u;
    public static final com.applovin.impl.ka v;
    public static final com.applovin.impl.ka w;
    public static final com.applovin.impl.ka x;
    public static final com.applovin.impl.ka y;
    public static final com.applovin.impl.ka z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f952a;
    private final com.applovin.impl.ka.b b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f953a;

        static {
            int[] iArr = new int[com.applovin.impl.ka.b.values().length];
            f953a = iArr;
            try {
                iArr[com.applovin.impl.ka.b.AD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f953a[com.applovin.impl.ka.b.ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f953a[com.applovin.impl.ka.b.USER_SESSION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        AD,
        ERROR,
        USER_SESSION
    }

    static {
        com.applovin.impl.ka.b bVar = com.applovin.impl.ka.b.ERROR;
        d = new com.applovin.impl.ka("generic", bVar);
        e = new com.applovin.impl.ka("sdk_init", com.applovin.impl.ka.b.USER_SESSION);
        com.applovin.impl.ka.b bVar2 = com.applovin.impl.ka.b.AD;
        f = new com.applovin.impl.ka("ad_requested", bVar2);
        g = new com.applovin.impl.ka("ad_request_success", bVar2);
        h = new com.applovin.impl.ka("ad_request_failure", bVar2);
        i = new com.applovin.impl.ka("ad_load_success", bVar2);
        j = new com.applovin.impl.ka("ad_load_failure", bVar2);
        k = new com.applovin.impl.ka("ad_displayed", bVar2);
        l = new com.applovin.impl.ka("ad_hidden", bVar2);
        m = new com.applovin.impl.ka("resource_load_started", bVar2);
        n = new com.applovin.impl.ka("resource_load_success", bVar2);
        o = new com.applovin.impl.ka("resource_load_failure", bVar2);
        p = new com.applovin.impl.ka("ad_persist_request", bVar2);
        q = new com.applovin.impl.ka("ad_persist_success", bVar2);
        r = new com.applovin.impl.ka("ad_persist_failure", bVar2);
        s = new com.applovin.impl.ka("persisted_ad_requested", bVar2);
        t = new com.applovin.impl.ka("persisted_ad_load_success", bVar2);
        u = new com.applovin.impl.ka("persisted_ad_load_failure", bVar2);
        v = new com.applovin.impl.ka("persisted_ad_expired", bVar2);
        w = new com.applovin.impl.ka("adapter_init_started", bVar2);
        x = new com.applovin.impl.ka("adapter_init_success", bVar2);
        y = new com.applovin.impl.ka("adapter_init_failure", bVar2);
        z = new com.applovin.impl.ka("signal_collection_success", bVar2);
        A = new com.applovin.impl.ka("signal_collection_failure", bVar2);
        B = new com.applovin.impl.ka("mediated_ad_requested", bVar2);
        C = new com.applovin.impl.ka("mediated_ad_request_success", bVar2);
        D = new com.applovin.impl.ka("mediated_ad_request_failure", bVar2);
        E = new com.applovin.impl.ka("mediated_ad_load_started", bVar2);
        F = new com.applovin.impl.ka("mediated_ad_load_success", bVar2);
        G = new com.applovin.impl.ka("mediated_ad_load_failure", bVar2);
        H = new com.applovin.impl.ka("waterfall_processing_complete", bVar2);
        I = new com.applovin.impl.ka("mediated_ad_displayed", bVar2);
        J = new com.applovin.impl.ka("mediated_ad_display_failure", bVar2);
        K = new com.applovin.impl.ka("mediated_ad_hidden", bVar2);
        L = new com.applovin.impl.ka("mediated_ad_hidden_callback_not_called", bVar2);
        M = new com.applovin.impl.ka("anr", bVar);
        N = new com.applovin.impl.ka("app_killed_during_ad", bVar);
        O = new com.applovin.impl.ka("auto_redirect", bVar);
        P = new com.applovin.impl.ka("black_view", bVar);
        Q = new com.applovin.impl.ka("cache_error", bVar);
        R = new com.applovin.impl.ka("caught_exception", bVar);
        S = new com.applovin.impl.ka("consent_flow_error", bVar);
        T = new com.applovin.impl.ka(com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN, bVar);
        U = new com.applovin.impl.ka("file_error", bVar);
        V = new com.applovin.impl.ka("integration_error", bVar);
        W = new com.applovin.impl.ka("media_error", bVar);
        X = new com.applovin.impl.ka("native_error", bVar);
        Y = new com.applovin.impl.ka("network_error", bVar);
        Z = new com.applovin.impl.ka("task_exception", bVar);
        a0 = new com.applovin.impl.ka("task_latency_alert", bVar);
        b0 = new com.applovin.impl.ka("template_error", bVar);
        c0 = new com.applovin.impl.ka("unexpected_state", bVar);
        d0 = new com.applovin.impl.ka("web_view_error", bVar);
    }

    public ka(java.lang.String str, com.applovin.impl.ka.b bVar) {
        this.f952a = str;
        this.b = bVar;
    }

    public java.lang.String b() {
        return this.f952a;
    }

    public com.applovin.impl.ka.b a() {
        return this.b;
    }

    public double a(com.applovin.impl.sdk.j jVar) {
        if (com.applovin.impl.yp.i(com.applovin.impl.sdk.j.m())) {
            return 100.0d;
        }
        double dA = a(this.f952a, jVar);
        if (dA >= 0.0d) {
            return dA;
        }
        double dA2 = a(this.b, jVar);
        return dA2 >= 0.0d ? dA2 : ((java.lang.Float) jVar.a(com.applovin.impl.sj.J)).floatValue();
    }

    private double a(java.lang.String str, com.applovin.impl.sdk.j jVar) {
        if (c == null) {
            c = com.applovin.impl.sdk.utils.JsonUtils.deserialize((java.lang.String) jVar.a(com.applovin.impl.sj.F));
        }
        java.lang.Double d2 = com.applovin.impl.sdk.utils.JsonUtils.getDouble(c, str, (java.lang.Double) null);
        if (d2 != null) {
            return d2.doubleValue();
        }
        return -1.0d;
    }

    private double a(com.applovin.impl.ka.b bVar, com.applovin.impl.sdk.j jVar) {
        float fFloatValue;
        int i2 = com.applovin.impl.ka.a.f953a[bVar.ordinal()];
        if (i2 == 1) {
            fFloatValue = ((java.lang.Float) jVar.a(com.applovin.impl.sj.G)).floatValue();
        } else if (i2 == 2) {
            fFloatValue = ((java.lang.Float) jVar.a(com.applovin.impl.sj.H)).floatValue();
        } else {
            if (i2 != 3) {
                return -1.0d;
            }
            fFloatValue = ((java.lang.Float) jVar.a(com.applovin.impl.sj.I)).floatValue();
        }
        return fFloatValue;
    }
}
