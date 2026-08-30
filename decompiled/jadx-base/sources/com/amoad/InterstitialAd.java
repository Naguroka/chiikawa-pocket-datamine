package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public final class InterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.util.Map<java.lang.String, com.amoad.ai> f170a = new java.util.HashMap();

    public interface OnCloseListener {
        void onClose(com.amoad.InterstitialAd.Result result);
    }

    public enum Result {
        Click,
        Close,
        Duplicated,
        CloseFromApp,
        Failure
    }

    private static com.amoad.ai a(java.lang.String str) {
        com.amoad.ai aiVar = f170a.get(str);
        if (aiVar != null) {
            return aiVar;
        }
        com.amoad.ai aiVar2 = new com.amoad.ai(str);
        f170a.put(str, aiVar2);
        return aiVar2;
    }

    public static void close(java.lang.String str) {
        com.amoad.ai aiVar = f170a.get(str);
        if (aiVar != null) {
            com.amoad.InterstitialAd.OnCloseListener onCloseListener = aiVar.r;
            if (onCloseListener != null) {
                onCloseListener.onClose(com.amoad.InterstitialAd.Result.CloseFromApp);
            }
            aiVar.b();
            aiVar.a();
        }
    }

    public static boolean isLoaded(java.lang.String str) {
        return a(str).c();
    }

    public static void load(android.content.Context context, java.lang.String str, final com.amoad.AdLoadListener adLoadListener) {
        final com.amoad.ai aiVarA = a(str);
        if (context == null) {
            throw new java.lang.IllegalArgumentException("context is null");
        }
        if (context instanceof android.app.Activity) {
            aiVarA.f201a = new java.lang.ref.WeakReference<>((android.app.Activity) context);
        }
        aiVarA.b = context.getApplicationContext();
        aiVarA.j = new android.os.Handler(context.getMainLooper());
        float fA = com.amoad.x.a(context);
        aiVarA.q = com.amoad.x.a(context, fA) * fA;
        aiVarA.k = aiVarA.k > 0 ? aiVarA.k : com.amoad.ai.a(context, "amoad_panel");
        aiVarA.l = aiVarA.l > 0 ? aiVarA.l : com.amoad.ai.a(context, "amoad_panel_l");
        aiVarA.a(aiVarA.o > 0 ? aiVarA.o : com.amoad.ai.a(context, "amoad_link_btn"), aiVarA.p > 0 ? aiVarA.p : com.amoad.ai.a(context, "amoad_link_btn_h"));
        aiVarA.b(aiVarA.m > 0 ? aiVarA.m : com.amoad.ai.a(context, "amoad_close_btn"), aiVarA.n > 0 ? aiVarA.n : com.amoad.ai.a(context, "amoad_close_btn_h"));
        com.amoad.bc.a(aiVarA.j, new java.lang.Runnable() { // from class: com.amoad.ai.2

            /* JADX INFO: renamed from: a */
            final /* synthetic */ com.amoad.AdLoadListener f203a;

            AnonymousClass2() {
                adLoadListener = adLoadListener;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.ai.this.a(adLoadListener);
            }
        });
    }

    public static void onConfigurationChanged(android.content.res.Configuration configuration) {
        for (com.amoad.ai aiVar : f170a.values()) {
            if (aiVar.i) {
                if (aiVar.e != null) {
                    aiVar.e.dismiss();
                    aiVar.e = null;
                }
                if (aiVar.d != null) {
                    android.view.ViewParent parent = aiVar.d.getParent();
                    if (parent instanceof android.view.ViewGroup) {
                        ((android.view.ViewGroup) parent).removeAllViews();
                    }
                    aiVar.a(aiVar.d);
                }
            }
        }
    }

    public static void register(java.lang.String str) {
        a(str);
    }

    public static void setAutoReload(java.lang.String str, boolean z) {
        a(str).h = z;
    }

    public static void setCloseButton(java.lang.String str, int i, int i2) {
        com.amoad.ai aiVar = f170a.get(str);
        if (aiVar != null) {
            aiVar.b(i, i2);
        }
    }

    public static void setLandscapePanel(java.lang.String str, int i) {
        com.amoad.ai aiVar = f170a.get(str);
        if (aiVar != null) {
            aiVar.l = i;
        }
    }

    public static void setLinkButton(java.lang.String str, int i, int i2) {
        com.amoad.ai aiVar = f170a.get(str);
        if (aiVar != null) {
            aiVar.a(i, i2);
        }
    }

    public static void setNetworkTimeoutMillis(java.lang.String str, int i) {
        a(str).t = i;
    }

    public static void setPortraitPanel(java.lang.String str, int i) {
        com.amoad.ai aiVar = f170a.get(str);
        if (aiVar != null) {
            aiVar.k = i;
        }
    }

    public static void show(android.app.Activity activity, java.lang.String str, final com.amoad.InterstitialAd.OnCloseListener onCloseListener) {
        final com.amoad.ai aiVar = f170a.get(str);
        if (aiVar == null || aiVar.j == null) {
            return;
        }
        if (activity != null) {
            aiVar.f201a = new java.lang.ref.WeakReference<>(activity);
        }
        com.amoad.bc.a(aiVar.j, new java.lang.Runnable() { // from class: com.amoad.ai.3

            /* JADX INFO: renamed from: a */
            final /* synthetic */ com.amoad.InterstitialAd.OnCloseListener f204a;

            AnonymousClass3() {
                onCloseListener = onCloseListener;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.ai aiVar2 = com.amoad.ai.this;
                com.amoad.InterstitialAd.OnCloseListener onCloseListener2 = onCloseListener;
                if (aiVar2.c()) {
                    aiVar2.r = onCloseListener2;
                    if (aiVar2.e == null) {
                        aiVar2.a(aiVar2.d);
                    } else if (onCloseListener2 != null) {
                        onCloseListener2.onClose(com.amoad.InterstitialAd.Result.Duplicated);
                    }
                }
            }
        });
    }
}
