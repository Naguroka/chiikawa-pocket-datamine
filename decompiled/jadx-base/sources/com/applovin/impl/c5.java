package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f665a;
    private androidx.browser.customtabs.CustomTabsClient b;

    public c5(com.applovin.impl.sdk.j jVar) {
        this.f665a = jVar;
    }

    class a extends androidx.browser.customtabs.CustomTabsServiceConnection {
        a() {
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public void onCustomTabsServiceConnected(android.content.ComponentName componentName, androidx.browser.customtabs.CustomTabsClient customTabsClient) {
            com.applovin.impl.c5.this.f665a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.c5.this.f665a.I().a("CustomTabsManager", "Connection successful: " + componentName);
            }
            com.applovin.impl.c5.this.b = customTabsClient;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
            com.applovin.impl.c5.this.f665a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.c5.this.f665a.I().a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            com.applovin.impl.c5.this.b = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e A[DONT_GENERATE] */
    private void a(java.util.LinkedList linkedList) {
        boolean zBindCustomTabsService = false;
        try {
            zBindCustomTabsService = androidx.browser.customtabs.CustomTabsClient.bindCustomTabsService(com.applovin.impl.sdk.j.m(), (java.lang.String) linkedList.poll(), new com.applovin.impl.c5.a());
            if (!zBindCustomTabsService) {
                this.f665a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f665a.I().b("CustomTabsManager", "Custom Tabs service not available");
                }
            }
            if (zBindCustomTabsService || linkedList.isEmpty()) {
                return;
            }
            this.f665a.I();
            if (com.applovin.impl.sdk.n.a()) {
            }
        } catch (java.lang.Throwable th) {
            try {
                this.f665a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f665a.I().a("CustomTabsManager", "Failed to bind to service", th);
                }
            } finally {
                if (!zBindCustomTabsService && !linkedList.isEmpty()) {
                    this.f665a.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f665a.I().a("CustomTabsManager", "Retrying with next package name...");
                    }
                    a(linkedList);
                }
            }
        }
    }

    public void b(final java.util.List list, final androidx.browser.customtabs.CustomTabsSession customTabsSession) {
        if (list.isEmpty()) {
            return;
        }
        if (customTabsSession == null) {
            this.f665a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f665a.I().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
                return;
            }
            return;
        }
        a("warmup urls", new java.lang.Runnable() { // from class: com.applovin.impl.c5$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(list, customTabsSession);
            }
        });
    }

    public void a() {
        if (((java.lang.Boolean) this.f665a.a(com.applovin.impl.sj.r6)).booleanValue() && this.b == null) {
            java.lang.String packageName = androidx.browser.customtabs.CustomTabsClient.getPackageName(com.applovin.impl.sdk.j.m(), this.f665a.c(com.applovin.impl.sj.s6), true);
            java.lang.String packageName2 = androidx.browser.customtabs.CustomTabsClient.getPackageName(com.applovin.impl.sdk.j.m(), null);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (((java.lang.Boolean) this.f665a.a(com.applovin.impl.sj.t6)).booleanValue()) {
                com.applovin.impl.sdk.utils.CollectionUtils.addUniqueObjectIfExists(packageName2, linkedList);
                com.applovin.impl.sdk.utils.CollectionUtils.addUniqueObjectIfExists(packageName, linkedList);
            } else {
                com.applovin.impl.sdk.utils.CollectionUtils.addUniqueObjectIfExists(packageName, linkedList);
                com.applovin.impl.sdk.utils.CollectionUtils.addUniqueObjectIfExists(packageName2, linkedList);
            }
            if (linkedList.isEmpty()) {
                this.f665a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f665a.I().b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
                    return;
                }
                return;
            }
            a(linkedList);
        }
    }

    private class b extends androidx.browser.customtabs.CustomTabsCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.ref.WeakReference f667a;

        public b(com.applovin.impl.adview.a aVar) {
            this.f667a = new java.lang.ref.WeakReference(aVar);
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i, android.os.Bundle bundle) {
            com.applovin.impl.adview.a aVar = (com.applovin.impl.adview.a) this.f667a.get();
            if (aVar == null) {
                com.applovin.impl.c5.this.f665a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.c5.this.f665a.I().b("CustomTabsManager", "Unable to track navigation event (" + i + "). Controller is null.");
                }
                return;
            }
            com.applovin.impl.sdk.ad.b bVarI = aVar.i();
            if (bVarI == null) {
                com.applovin.impl.c5.this.f665a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.c5.this.f665a.I().b("CustomTabsManager", "Unable to track navigation event (" + i + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i) {
                case 1:
                    if (bVarI.T0()) {
                        com.applovin.impl.c5.this.f665a.j().trackCustomTabsNavigationStarted(bVarI);
                    }
                    break;
                case 2:
                    if (bVarI.T0()) {
                        com.applovin.impl.c5.this.f665a.j().trackCustomTabsNavigationFinished(bVarI);
                    }
                    break;
                case 3:
                    if (bVarI.T0()) {
                        com.applovin.impl.c5.this.f665a.j().trackCustomTabsNavigationFailed(bVarI);
                    }
                    break;
                case 4:
                    if (bVarI.T0()) {
                        com.applovin.impl.c5.this.f665a.j().trackCustomTabsNavigationAborted(bVarI);
                    }
                    break;
                case 5:
                    if (bVarI.T0()) {
                        com.applovin.impl.c5.this.f665a.j().trackCustomTabsTabShown(bVarI);
                    }
                    com.applovin.impl.fc.c(aVar.e(), bVarI, aVar.k());
                    break;
                case 6:
                    if (bVarI.T0()) {
                        com.applovin.impl.c5.this.f665a.j().trackCustomTabsTabHidden(bVarI);
                    }
                    com.applovin.impl.fc.a(aVar.e(), bVarI, aVar.k());
                    break;
                default:
                    com.applovin.impl.c5.this.f665a.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.c5.this.f665a.I().a("CustomTabsManager", "Unknown navigation event: " + i);
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i, android.net.Uri uri, boolean z, android.os.Bundle bundle) {
            com.applovin.impl.c5.this.f665a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.c5.this.f665a.I().a("CustomTabsManager", "Validation " + (z ? "succeeded" : com.ironsource.y8.h.t) + " for session-URL relation(" + i + "), requestedOrigin(" + uri + ")");
            }
        }
    }

    private androidx.browser.customtabs.CustomTabsIntent a(com.applovin.impl.adview.a aVar, android.app.Activity activity) {
        this.f665a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f665a.I().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        com.applovin.impl.sdk.ad.b bVarI = aVar.i();
        androidx.browser.customtabs.CustomTabsIntent.Builder builder = new androidx.browser.customtabs.CustomTabsIntent.Builder(aVar.j());
        com.applovin.impl.d5 d5VarX = bVarI != null ? bVarI.x() : null;
        if (((java.lang.Boolean) this.f665a.a(com.applovin.impl.sj.u6)).booleanValue()) {
            builder.setStartAnimations(activity, com.applovin.sdk.R.anim.applovin_slide_up_animation, com.applovin.sdk.R.anim.applovin_slide_down_animation);
            builder.setExitAnimations(activity, com.applovin.sdk.R.anim.applovin_slide_up_animation, com.applovin.sdk.R.anim.applovin_slide_down_animation);
        }
        if (d5VarX != null) {
            java.lang.Integer numH = d5VarX.h();
            if (numH != null) {
                builder.setDefaultColorSchemeParams(new androidx.browser.customtabs.CustomTabColorSchemeParams.Builder().setToolbarColor(numH.intValue()).build());
            }
            java.lang.Integer numA = d5VarX.a();
            if (numA != null) {
                builder.setColorSchemeParams(2, new androidx.browser.customtabs.CustomTabColorSchemeParams.Builder().setToolbarColor(numA.intValue()).build());
            }
            java.lang.Boolean boolI = d5VarX.i();
            if (boolI != null) {
                builder.setUrlBarHidingEnabled(boolI.booleanValue());
            }
            java.lang.Boolean boolG = d5VarX.g();
            if (boolG != null) {
                builder.setShowTitle(boolG.booleanValue());
            }
            java.lang.Boolean boolC = d5VarX.c();
            if (boolC != null) {
                builder.setInstantAppsEnabled(boolC.booleanValue());
            }
            java.lang.Integer numF = d5VarX.f();
            if (numF != null) {
                builder.setShareState(numF.intValue());
            }
        }
        androidx.browser.customtabs.CustomTabsIntent customTabsIntentBuild = builder.build();
        if (d5VarX != null) {
            java.lang.String strD = d5VarX.d();
            if (strD != null) {
                customTabsIntentBuild.intent.putExtra("android.intent.extra.REFERRER", android.net.Uri.parse(strD));
            }
            android.os.Bundle bundleS = bVarI.s();
            if (!bundleS.isEmpty()) {
                customTabsIntentBuild.intent.putExtra("com.android.browser.headers", bundleS);
            }
        }
        return customTabsIntentBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, android.app.Activity activity, java.lang.String str) {
        a(aVar, activity).launchUrl(activity, android.net.Uri.parse(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, androidx.browser.customtabs.CustomTabsSession customTabsSession) {
        this.b.warmup(0L);
        com.applovin.impl.d5 d5VarX = bVar.x();
        if (d5VarX == null) {
            return;
        }
        java.lang.Integer numE = d5VarX.e();
        java.lang.String strB = d5VarX.b();
        if (numE == null || android.text.TextUtils.isEmpty(strB)) {
            return;
        }
        if (customTabsSession == null) {
            this.f665a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f665a.I().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f665a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f665a.I().a("CustomTabsManager", "Validating session-URL relation: " + numE + " with digital asset link: " + strB);
        }
        customTabsSession.validateRelationship(numE.intValue(), android.net.Uri.parse(strB), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.util.List list, androidx.browser.customtabs.CustomTabsSession customTabsSession) {
        this.f665a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f665a.I().a("CustomTabsManager", "Warming up URLs: " + list);
        }
        java.lang.String str = (java.lang.String) list.remove(0);
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(androidx.browser.customtabs.CustomTabsService.KEY_URL, android.net.Uri.parse(str2));
            arrayList.add(bundle);
        }
        boolean zMayLaunchUrl = customTabsSession.mayLaunchUrl(android.net.Uri.parse(str), null, arrayList);
        this.f665a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f665a.I().a("CustomTabsManager", "Warmup for URLs ".concat(zMayLaunchUrl ? "succeeded" : com.ironsource.y8.h.t));
        }
    }

    public void a(final java.lang.String str, final com.applovin.impl.adview.a aVar, final android.app.Activity activity) {
        a("launch url", new java.lang.Runnable() { // from class: com.applovin.impl.c5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(aVar, activity, str);
            }
        });
    }

    private void a(java.lang.String str, java.lang.Runnable runnable) {
        try {
            this.f665a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f665a.I().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f665a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f665a.I().a("CustomTabsManager", "Finished operation: " + str);
            }
        } catch (java.lang.Throwable th) {
            this.f665a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f665a.I().a("CustomTabsManager", "Failed to run operation: " + str, th);
            }
            this.f665a.D().a("CustomTabsManager", str, th);
        }
    }

    public androidx.browser.customtabs.CustomTabsSession a(com.applovin.impl.adview.a aVar) {
        if (this.b == null) {
            this.f665a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f665a.I().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f665a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f665a.I().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            androidx.browser.customtabs.CustomTabsSession customTabsSessionNewSession = this.b.newSession(new com.applovin.impl.c5.b(aVar));
            a(customTabsSessionNewSession, aVar.i());
            return customTabsSessionNewSession;
        } catch (java.lang.Exception e) {
            this.f665a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f665a.I().a("CustomTabsManager", "Failed to create Custom Tabs session", e);
            }
            return null;
        }
    }

    private void a(final androidx.browser.customtabs.CustomTabsSession customTabsSession, final com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.B0()) {
            return;
        }
        a("client warmup", new java.lang.Runnable() { // from class: com.applovin.impl.c5$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(bVar, customTabsSession);
            }
        });
    }
}
