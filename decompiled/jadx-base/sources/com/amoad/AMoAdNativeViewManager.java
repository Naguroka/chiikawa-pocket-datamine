package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public class AMoAdNativeViewManager {
    public static final java.lang.String AMOAD_NATIVE_VIEW_ICON_IMAGE = "AMoAdNativeViewIconImage";
    public static final java.lang.String AMOAD_NATIVE_VIEW_INFORMATION_ICON = "AMoAdNativeViewInformationIcon";
    public static final java.lang.String AMOAD_NATIVE_VIEW_LINK = "AMoAdNativeViewLink";
    public static final java.lang.String AMOAD_NATIVE_VIEW_MAIN_IMAGE = "AMoAdNativeViewMainImage";
    public static final java.lang.String AMOAD_NATIVE_VIEW_MAIN_VIDEO = "AMoAdNativeViewMainVideo";
    public static final java.lang.String AMOAD_NATIVE_VIEW_SERVICE_NAME = "AMoAdNativeViewServiceName";
    public static final java.lang.String AMOAD_NATIVE_VIEW_TITLE_LONG = "AMoAdNativeViewTitleLong";
    public static final java.lang.String AMOAD_NATIVE_VIEW_TITLE_SHORT = "AMoAdNativeViewTitleShort";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f146a = "AMoAdNativeViewManager";
    private static com.amoad.AMoAdNativeViewManager b;
    private final android.content.Context c;
    private final java.util.Map<java.lang.String, com.amoad.at> d = new java.util.HashMap();

    private AMoAdNativeViewManager(android.content.Context context) {
        this.c = context.getApplicationContext();
    }

    private synchronized com.amoad.am a(java.lang.String str, java.lang.String str2) {
        com.amoad.at amVar;
        a(str);
        java.lang.String strD = d(str, str2);
        amVar = this.d.get(strD);
        if (!(amVar instanceof com.amoad.am)) {
            amVar = new com.amoad.am(this.c, str, str2);
            this.d.put(strD, amVar);
        }
        return (com.amoad.am) amVar;
    }

    private void a(java.lang.String str) {
        if (com.amoad.j.a(this.c).b(str)) {
            return;
        }
        java.lang.String str2 = java.text.MessageFormat.format("指定のsidでまだprepareAdされていません。先にprepareAdしてください。（sid={0}）", str);
        com.amoad.AMoAdLogger.getInstance().e(str2);
        throw new java.lang.IllegalStateException(str2);
    }

    private synchronized com.amoad.an b(java.lang.String str, java.lang.String str2) {
        com.amoad.at anVar;
        a(str);
        java.lang.String strD = d(str, str2);
        anVar = this.d.get(strD);
        if (!(anVar instanceof com.amoad.an)) {
            anVar = new com.amoad.an(this.c, str, str2);
            this.d.put(strD, anVar);
        }
        return (com.amoad.an) anVar;
    }

    private synchronized com.amoad.at c(java.lang.String str, java.lang.String str2) {
        return this.d.get(d(str, str2));
    }

    private static java.lang.String d(java.lang.String str, java.lang.String str2) {
        return str + "-" + str2;
    }

    public static synchronized com.amoad.AMoAdNativeViewManager getInstance(android.content.Context context) {
        if (b == null) {
            b = new com.amoad.AMoAdNativeViewManager(context);
        }
        return b;
    }

    @java.lang.Deprecated
    final void a(java.lang.String str, java.lang.String str2, android.view.View view, com.amoad.AMoAdNativeFailureListener aMoAdNativeFailureListener, com.amoad.ao aoVar, com.amoad.AMoAdNativeViewCoder aMoAdNativeViewCoder, com.amoad.Analytics analytics) {
        a(str, str2).a(view, aMoAdNativeFailureListener, aoVar, aMoAdNativeViewCoder, analytics);
    }

    public void clearAd(java.lang.String str, java.lang.String str2) {
        com.amoad.at atVarC = c(str, str2);
        if (atVarC != null) {
            atVarC.b();
        }
    }

    public void clearAds(java.lang.String str) {
        for (java.lang.String str2 : this.d.keySet()) {
            if (str2.startsWith(str)) {
                this.d.get(str2).b();
            }
        }
    }

    public android.widget.BaseAdapter createAdapter(java.lang.String str, java.lang.String str2, android.widget.Adapter adapter, int i, com.amoad.AMoAdNativeListener aMoAdNativeListener, com.amoad.AMoAdNativeViewCoder aMoAdNativeViewCoder) {
        com.amoad.as asVar;
        com.amoad.an anVarB = b(str, str2);
        if (anVarB.f227a != null && (asVar = anVarB.f227a.get()) != null) {
            asVar.d = false;
        }
        anVarB.a(aMoAdNativeViewCoder);
        com.amoad.as asVar2 = new com.amoad.as(anVarB.b, anVarB.c, anVarB.d, adapter, i, aMoAdNativeListener, anVarB.e);
        anVarB.f227a = new java.lang.ref.WeakReference<>(asVar2);
        return asVar2;
    }

    public android.view.View createView(java.lang.String str, java.lang.String str2, int i, com.amoad.AMoAdNativeFailureListener aMoAdNativeFailureListener, com.amoad.AMoAdNativeListener aMoAdNativeListener, com.amoad.AMoAdNativeViewCoder aMoAdNativeViewCoder) {
        com.amoad.am amVarA = a(str, str2);
        com.amoad.ao aoVar = new com.amoad.ao(aMoAdNativeListener);
        android.view.View viewA = com.amoad.au.a(amVarA.b, i);
        amVarA.a(viewA, aMoAdNativeFailureListener, aoVar, aMoAdNativeViewCoder, null);
        return viewA;
    }

    public boolean isLimitAdTrackingEnabled() {
        return com.amoad.j.a(this.c).b;
    }

    public void prepareAd(java.lang.String str) {
        prepareAd(str, false, false);
    }

    public void prepareAd(java.lang.String str, int i, int i2) {
        prepareAd(str, i, i2, false, false);
    }

    public void prepareAd(java.lang.String str, int i, int i2, boolean z) {
        prepareAd(str, i, i2, z, false);
    }

    public void prepareAd(java.lang.String str, int i, int i2, boolean z, boolean z2) {
        com.amoad.j.a(this.c).a(str, i, i2, z, z2);
    }

    public void prepareAd(java.lang.String str, boolean z) {
        prepareAd(str, true, false);
    }

    public void prepareAd(java.lang.String str, boolean z, boolean z2) {
        com.amoad.j.a(this.c).a(str, z, z2);
    }

    public void renderAd(java.lang.String str, java.lang.String str2, android.view.View view, com.amoad.AMoAdNativeFailureListener aMoAdNativeFailureListener, com.amoad.AMoAdNativeListener aMoAdNativeListener, com.amoad.AMoAdNativeViewCoder aMoAdNativeViewCoder, com.amoad.Analytics analytics) {
        a(str, str2, view, aMoAdNativeFailureListener, new com.amoad.ao(aMoAdNativeListener), aMoAdNativeViewCoder, analytics);
    }

    public void setLimitAdTrackingEnabled(boolean z) {
        com.amoad.j.a(this.c).b = z;
    }

    public void updateAd(java.lang.String str, java.lang.String str2) {
        c(str, str2).a();
    }
}
