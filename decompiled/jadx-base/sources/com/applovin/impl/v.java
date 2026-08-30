package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class v implements com.applovin.communicator.AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1414a;
    private final java.lang.Object b = new java.lang.Object();
    private final java.util.LinkedHashMap c = new com.applovin.impl.v.a();
    private final java.util.Set d = java.util.Collections.synchronizedSet(new java.util.HashSet());

    public interface b {
        void onCreativeIdGenerated(java.lang.String str, java.lang.String str2);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public java.lang.String getCommunicatorId() {
        return "v";
    }

    class a extends java.util.LinkedHashMap {
        a() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(java.util.Map.Entry entry) {
            return size() > 16;
        }
    }

    public v(com.applovin.impl.sdk.j jVar) {
        this.f1414a = jVar;
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(b())) {
            com.applovin.communicator.AppLovinCommunicator.getInstance(com.applovin.impl.sdk.j.m()).subscribe(this, "safedk_ad_info");
        }
    }

    public android.os.Bundle a(java.lang.String str) {
        android.os.Bundle bundle;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.b) {
            bundle = (android.os.Bundle) this.c.get(str);
        }
        this.f1414a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1414a.I().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    public void c(java.lang.String str) {
        this.f1414a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1414a.I().a("AdReviewManager", "Removing ad info for serve id: " + str);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.b) {
            this.c.remove(str);
        }
    }

    public void b(com.applovin.impl.v.b bVar) {
        this.d.remove(bVar);
    }

    public static java.lang.String b() {
        return b(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.versionMethodName);
    }

    private static java.lang.String b(java.lang.String str) {
        java.lang.Class<?> cls;
        try {
            try {
                cls = java.lang.Class.forName("com.applovin.quality.AppLovinQualityService");
            } catch (java.lang.Throwable unused) {
                cls = java.lang.Class.forName("com.safedk.android.SafeDK");
            }
            return (java.lang.String) cls.getMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Throwable unused2) {
            return "";
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            android.os.Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                this.f1414a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1414a.I().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            android.os.Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f1414a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1414a.I().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (com.applovin.mediation.MaxAdFormat.formatFromString(bundle2.getString(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT)) == null) {
                this.f1414a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1414a.I().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            final java.lang.String string = bundle2.getString("id");
            if (android.text.TextUtils.isEmpty(string)) {
                this.f1414a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1414a.I().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.b) {
                this.f1414a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1414a.I().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                }
                this.c.put(string, bundle);
            }
            final java.lang.String string2 = bundle.getString("ad_review_creative_id");
            this.f1414a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1414a.I().a("AdReviewManager", "Received SafeDK ad info with Ad Review creative id: " + string2);
            }
            if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(string2) || this.d.isEmpty()) {
                return;
            }
            java.util.HashSet<com.applovin.impl.v.b> hashSet = new java.util.HashSet(this.d);
            this.f1414a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1414a.I().a("AdReviewManager", "Notifying listeners: " + this.d);
            }
            for (final com.applovin.impl.v.b bVar : hashSet) {
                this.f1414a.i0().a((com.applovin.impl.yl) new com.applovin.impl.jn(this.f1414a, "creativeIdGenerated", new java.lang.Runnable() { // from class: com.applovin.impl.v$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(bVar, string, string2);
                    }
                }), com.applovin.impl.tm.b.OTHER);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.v.b bVar, java.lang.String str, java.lang.String str2) {
        this.f1414a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1414a.I().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }

    public void a(com.applovin.impl.v.b bVar) {
        this.d.add(bVar);
    }

    public static java.lang.String a() {
        return b("getSdkKey");
    }
}
