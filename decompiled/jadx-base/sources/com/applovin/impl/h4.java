package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class h4 implements com.applovin.communicator.AppLovinCommunicatorSubscriber, com.applovin.communicator.AppLovinCommunicatorPublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f841a;
    private final com.applovin.impl.m4 b;
    private java.util.List c;

    public interface b {
        void a(com.applovin.impl.h4.a aVar);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public java.lang.String getCommunicatorId() {
        return "consent_flow_manager";
    }

    public boolean i() {
        com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.u0;
        if (!jVar.y0()) {
            return false;
        }
        com.applovin.impl.h4 h4VarU = jVar.u();
        java.util.List list = h4VarU.c;
        return h4VarU.b.b() || (list != null && list.size() > 0);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f842a;
        private com.applovin.impl.f4 b;

        public a() {
        }

        public java.lang.String toString() {
            return "ConsentFlowManager.FlowCompletionStatus(cmpPromptShown=" + b() + ", error=" + a() + ")";
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.applovin.impl.h4.a)) {
                return false;
            }
            com.applovin.impl.h4.a aVar = (com.applovin.impl.h4.a) obj;
            if (!aVar.a((java.lang.Object) this) || b() != aVar.b()) {
                return false;
            }
            com.applovin.impl.f4 f4VarA = a();
            com.applovin.impl.f4 f4VarA2 = aVar.a();
            return f4VarA != null ? f4VarA.equals(f4VarA2) : f4VarA2 == null;
        }

        public int hashCode() {
            int i = b() ? 79 : 97;
            com.applovin.impl.f4 f4VarA = a();
            return ((i + 59) * 59) + (f4VarA == null ? 43 : f4VarA.hashCode());
        }

        public boolean b() {
            return this.f842a;
        }

        public a(com.applovin.impl.f4 f4Var) {
            this.b = f4Var;
        }

        protected boolean a(java.lang.Object obj) {
            return obj instanceof com.applovin.impl.h4.a;
        }

        public com.applovin.impl.f4 a() {
            return this.b;
        }

        public void a(boolean z) {
            this.f842a = z;
        }

        public void a(com.applovin.impl.f4 f4Var) {
            this.b = f4Var;
        }
    }

    public h4(com.applovin.impl.sdk.j jVar) {
        this.f841a = jVar;
        this.b = new com.applovin.impl.m4(jVar);
    }

    public com.applovin.impl.privacy.consentFlow.TermsAndPrivacyPolicyFlowSettingsImpl d() {
        return (com.applovin.impl.privacy.consentFlow.TermsAndPrivacyPolicyFlowSettingsImpl) this.f841a.f0().getTermsAndPrivacyPolicyFlowSettings();
    }

    public boolean j() {
        java.util.Map<java.lang.String, java.lang.String> extraParameters = this.f841a.f0().getExtraParameters();
        if (extraParameters.containsKey("consent_flow_enabled")) {
            return java.lang.Boolean.parseBoolean(extraParameters.get("consent_flow_enabled"));
        }
        return d().isEnabled();
    }

    public android.net.Uri g() {
        return d().getPrivacyPolicyUri();
    }

    public android.net.Uri h() {
        return d().getTermsOfServiceUri();
    }

    public com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography e() {
        return d().getDebugUserGeography();
    }

    public static com.applovin.impl.privacy.consentFlow.TermsAndPrivacyPolicyFlowSettingsImpl a(android.content.Context context) {
        if (context == null) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Failed to get default Terms and Privacy Policy flow settings.");
            return new com.applovin.impl.privacy.consentFlow.TermsAndPrivacyPolicyFlowSettingsImpl(false, com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN, null, null);
        }
        java.lang.String strA = com.applovin.impl.yp.a(context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName()), context, (com.applovin.impl.sdk.j) null);
        org.json.JSONObject jSONObject = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(com.applovin.impl.sdk.utils.StringUtils.isValidString(strA) ? com.applovin.impl.sdk.utils.JsonUtils.jsonObjectFromJsonString(strA, new org.json.JSONObject()) : new org.json.JSONObject(), "consent_flow_settings", new org.json.JSONObject());
        java.lang.Boolean bool = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(jSONObject, "consent_flow_enabled", java.lang.Boolean.FALSE);
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "consent_flow_debug_user_geography", "");
        java.lang.String string2 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "consent_flow_terms_of_service", null);
        android.net.Uri uri = android.webkit.URLUtil.isValidUrl(string2) ? android.net.Uri.parse(string2) : null;
        java.lang.String string3 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "consent_flow_privacy_policy", null);
        return new com.applovin.impl.privacy.consentFlow.TermsAndPrivacyPolicyFlowSettingsImpl(bool.booleanValue(), a(string), android.webkit.URLUtil.isValidUrl(string3) ? android.net.Uri.parse(string3) : null, uri);
    }

    public android.net.Uri b() {
        return android.net.Uri.parse((java.lang.String) this.f841a.a(this.f841a.z0() ? com.applovin.impl.sj.p6 : com.applovin.impl.sj.o6));
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (h() != null && appLovinCommunicatorMessage.getMessageData().getBoolean("include_tos")) {
            this.c = com.applovin.impl.n4.b(this.f841a);
        } else {
            this.c = com.applovin.impl.n4.a(this.f841a);
        }
        if (this.c.size() == 0) {
            com.applovin.impl.yp.a("No Consent Flow Available", (java.lang.String) null, this.f841a.m0());
        } else {
            b(this.f841a.m0(), new com.applovin.impl.h4.b() { // from class: com.applovin.impl.h4$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.h4.b
                public final void a(com.applovin.impl.h4.a aVar) {
                    this.f$0.a(aVar);
                }
            });
        }
    }

    public org.json.JSONObject c() {
        com.applovin.impl.privacy.consentFlow.TermsAndPrivacyPolicyFlowSettingsImpl termsAndPrivacyPolicyFlowSettingsImplD = d();
        android.net.Uri privacyPolicyUri = termsAndPrivacyPolicyFlowSettingsImplD.getPrivacyPolicyUri();
        android.net.Uri termsOfServiceUri = termsAndPrivacyPolicyFlowSettingsImplD.getTermsOfServiceUri();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "enabled", java.lang.String.valueOf(j()));
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "privacy_policy_url", privacyPolicyUri != null ? privacyPolicyUri.toString() : "");
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "terms_of_service_url", termsOfServiceUri != null ? termsOfServiceUri.toString() : "");
        return jSONObject;
    }

    public java.lang.String f() {
        d();
        java.lang.Object objG = g();
        java.lang.Object objH = h();
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("\nConsent Flow Enabled - ").append(j()).append("\nPrivacy Policy - ");
        if (objG == null) {
            objG = com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN;
        }
        java.lang.StringBuilder sbAppend2 = sbAppend.append(objG).append("\nTerms of Service - ");
        if (objH == null) {
            objH = com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN;
        }
        return sbAppend2.append(objH).toString();
    }

    public void a() {
        if (j()) {
            this.f841a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f841a.I().a("AppLovinSdk", "Generating Consent Flow...");
            }
            this.c = com.applovin.impl.g4.c(this.f841a);
        }
        if (com.applovin.impl.yp.i(com.applovin.impl.sdk.j.m())) {
            com.applovin.communicator.AppLovinCommunicator.getInstance(com.applovin.impl.sdk.j.m()).subscribe(this, "start_sdk_consent_flow");
        }
    }

    public void b(final android.app.Activity activity, final com.applovin.impl.h4.b bVar) {
        if (!j()) {
            bVar.a(new com.applovin.impl.h4.a(new com.applovin.impl.f4(com.applovin.impl.f4.d, "Failed to start consent flow. Please make sure that the consent flow is enabled.")));
        } else if (com.applovin.impl.sdk.utils.CollectionUtils.isEmpty(this.c)) {
            this.f841a.b(com.applovin.impl.uj.o, java.lang.Boolean.FALSE);
            bVar.a(new com.applovin.impl.h4.a(new com.applovin.impl.f4(com.applovin.impl.f4.c, "User may not be eligible for flow.")));
        } else {
            a(activity, new java.lang.Runnable() { // from class: com.applovin.impl.h4$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(activity, bVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(android.net.Uri uri, android.content.DialogInterface dialogInterface, int i) {
        throw new java.lang.IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.net.Uri uri, android.content.DialogInterface dialogInterface, int i) {
        com.applovin.impl.tp.a(uri, com.applovin.impl.sdk.j.m(), this.f841a);
        throw new java.lang.IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.app.Activity activity) {
        final android.net.Uri uriB = b();
        new android.app.AlertDialog.Builder(activity).setTitle("Missing Privacy Policy URL").setMessage("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL").setNeutralButton("Go To Documentation", new android.content.DialogInterface.OnClickListener() { // from class: com.applovin.impl.h4$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                this.f$0.a(uriB, dialogInterface, i);
            }
        }).setNegativeButton("DISMISS", new android.content.DialogInterface.OnClickListener() { // from class: com.applovin.impl.h4$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.applovin.impl.h4.b(uriB, dialogInterface, i);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.h4.b bVar, com.applovin.impl.h4.a aVar) {
        if (aVar.b != null) {
            if (aVar.b.a() != com.applovin.impl.f4.e) {
                this.c = null;
            }
        } else {
            this.f841a.b(com.applovin.impl.uj.o, java.lang.Boolean.FALSE);
            this.c = null;
        }
        bVar.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.app.Activity activity, final com.applovin.impl.h4.b bVar) {
        this.f841a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f841a.I().a("ConsentFlowManager", "Starting consent flow with states: " + this.c);
        }
        if (!this.f841a.r0()) {
            this.f841a.b(com.applovin.impl.uj.o, java.lang.Boolean.TRUE);
        }
        this.b.a(this.c, activity, new com.applovin.impl.h4.b() { // from class: com.applovin.impl.h4$$ExternalSyntheticLambda5
            @Override // com.applovin.impl.h4.b
            public final void a(com.applovin.impl.h4.a aVar) {
                this.f$0.a(bVar, aVar);
            }
        });
    }

    private void a(final android.app.Activity activity, java.lang.Runnable runnable) {
        if (d().getPrivacyPolicyUri() != null) {
            runnable.run();
        } else {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.h4$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(activity);
                }
            });
        }
    }

    private static com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography a(java.lang.String str) {
        if ("gdpr".equalsIgnoreCase(str)) {
            return com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        }
        if ("other".equalsIgnoreCase(str)) {
            return com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER;
        }
        return com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.h4.a aVar) {
        com.applovin.communicator.AppLovinCommunicator.getInstance(com.applovin.impl.sdk.j.m()).getMessagingService().publish(new com.applovin.communicator.AppLovinCommunicatorMessage(new android.os.Bundle(), "sdk_consent_flow_finished", this));
    }
}
