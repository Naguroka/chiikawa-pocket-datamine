package com.amoad;

import com.amoad.o.d;

/* JADX INFO: loaded from: classes3.dex */
public final class Native {
    private static final java.util.Map<java.lang.String, com.amoad.o> b = new java.util.HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static int f171a = 15000;

    private static java.lang.String a(java.lang.String str, java.lang.String str2) {
        return str + "-" + str2;
    }

    private static synchronized com.amoad.o b(java.lang.String str, java.lang.String str2) {
        return b.get(a(str, str2));
    }

    public static synchronized void disposeAllView() {
        b.clear();
    }

    public static synchronized void disposeView(java.lang.String str, java.lang.String str2) {
        b.remove(a(str, str2));
    }

    public static android.view.View getView(java.lang.String str, java.lang.String str2) {
        return b(str, str2);
    }

    public static void hide(java.lang.String str, java.lang.String str2) {
        com.amoad.o oVarB = b(str, str2);
        if (oVarB != null) {
            oVarB.setVisibility(8);
        }
    }

    public static void load(android.content.Context context, java.lang.String str, java.lang.String str2, com.amoad.ResultListener resultListener) {
        load(context, str, str2, resultListener, null);
    }

    public static synchronized void load(android.content.Context context, java.lang.String str, java.lang.String str2, com.amoad.ResultListener resultListener, org.json.JSONObject jSONObject) {
        if (b(str, str2) == null) {
            final com.amoad.o oVar = new com.amoad.o(context);
            b.put(a(str, str2), oVar);
            android.net.Uri uri = android.net.Uri.parse(com.amoad.AMoAdBuildConfig.HTML_URL);
            com.amoad.l.a(str);
            oVar.c = str;
            oVar.d = str2;
            oVar.j = uri;
            oVar.g = resultListener;
            oVar.i = jSONObject == null ? com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON : jSONObject.toString();
            com.amoad.bc.b(new java.lang.Runnable() { // from class: com.amoad.o.4
                AnonymousClass4() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (com.amoad.o.l == null) {
                        com.amoad.c unused = com.amoad.o.l = com.amoad.p.b(com.amoad.o.this.p);
                    }
                    com.amoad.o.this.a();
                }
            });
        }
    }

    public static void reload(java.lang.String str, java.lang.String str2) {
        com.amoad.o oVarB = b(str, str2);
        if (oVarB != null) {
            if (oVarB.e) {
                oVarB.f324a.a();
            } else {
                oVarB.a();
            }
        }
    }

    public static void setNetworkTimeoutMillis(int i) {
        if (i > 0) {
            f171a = i;
        }
    }

    public static void show(java.lang.String str, java.lang.String str2) {
        com.amoad.o oVarB = b(str, str2);
        if (oVarB != null) {
            oVarB.setVisibility(0);
        }
    }

    public static void startRotation(java.lang.String str, java.lang.String str2, int i) {
        com.amoad.o oVarB = b(str, str2);
        if (oVarB != null) {
            synchronized (oVarB.b) {
                if (!oVarB.f) {
                    oVarB.f = true;
                    int iMax = java.lang.Math.max(java.lang.Math.min(i, 60), 9) * 1000;
                    com.amoad.AMoAdLogger.getInstance().i("startRotation()".concat(java.lang.String.valueOf(iMax)));
                    oVarB.h.postDelayed(oVarB.new d(iMax), iMax);
                }
            }
        }
    }

    public static void stopRotation(java.lang.String str, java.lang.String str2) {
        com.amoad.o oVarB = b(str, str2);
        if (oVarB != null) {
            synchronized (oVarB.b) {
                if (oVarB.f) {
                    oVarB.f = false;
                    com.amoad.AMoAdLogger.getInstance().i("stopRotation()");
                    oVarB.h.removeCallbacksAndMessages(null);
                }
            }
        }
    }
}
