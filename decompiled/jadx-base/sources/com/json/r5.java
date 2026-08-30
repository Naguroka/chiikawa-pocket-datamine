package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static com.json.r5 f3235a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3236a;

        static {
            int[] iArr = new int[com.ironsource.zg.a.values().length];
            f3236a = iArr;
            try {
                iArr[com.ironsource.zg.a.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f3236a[com.ironsource.zg.a.Device.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f3236a[com.ironsource.zg.a.Controller.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public static com.json.r5 a() {
        com.json.r5 r5Var = f3235a;
        return r5Var == null ? new com.json.r5() : r5Var;
    }

    public boolean a(android.app.Activity activity) {
        if (com.ironsource.r5.a.f3236a[com.json.dk.e().b().ordinal()] != 3) {
            return false;
        }
        try {
            com.json.sdk.controller.v vVar = (com.json.sdk.controller.v) com.json.qj.b((android.content.Context) activity).a().j();
            if (vVar == null) {
                return true;
            }
            vVar.k("back");
            return true;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }
}
