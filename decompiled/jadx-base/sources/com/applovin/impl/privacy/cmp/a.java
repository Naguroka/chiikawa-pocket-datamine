package com.applovin.impl.privacy.cmp;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1161a;
    private final com.applovin.impl.sdk.n b;
    private com.google.android.ump.ConsentForm c;

    /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.a$a, reason: collision with other inner class name */
    class C0047a implements com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.Activity f1162a;
        final /* synthetic */ com.applovin.impl.privacy.cmp.a.d b;

        /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.a$a$a, reason: collision with other inner class name */
        class C0048a implements com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener {
            C0048a() {
            }

            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public void onConsentFormLoadSuccess(com.google.android.ump.ConsentForm consentForm) {
                com.applovin.impl.privacy.cmp.a.this.a("Successfully loaded consent form");
                com.applovin.impl.privacy.cmp.a.this.c = consentForm;
                com.applovin.impl.privacy.cmp.a.C0047a.this.b.onFlowLoaded(null);
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.a$a$b */
        class b implements com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener {
            b() {
            }

            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public void onConsentFormLoadFailure(com.google.android.ump.FormError formError) {
                com.applovin.impl.privacy.cmp.a.this.b("Failed to load with error: " + formError.getMessage());
                com.applovin.impl.privacy.cmp.a.C0047a c0047a = com.applovin.impl.privacy.cmp.a.C0047a.this;
                c0047a.b.onFlowLoadFailed(com.applovin.impl.privacy.cmp.a.this.a(formError, "Consent form load failed"));
            }
        }

        C0047a(android.app.Activity activity, com.applovin.impl.privacy.cmp.a.d dVar) {
            this.f1162a = activity;
            this.b = dVar;
        }

        @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
        public void onConsentInfoUpdateSuccess() {
            com.google.android.ump.ConsentInformation consentInformation = com.google.android.ump.UserMessagingPlatform.getConsentInformation(this.f1162a);
            boolean zIsConsentFormAvailable = consentInformation.isConsentFormAvailable();
            int consentStatus = consentInformation.getConsentStatus();
            com.applovin.impl.privacy.cmp.a.this.a("Loaded parameters consentStatus: " + consentStatus + ", consentFormAvailable: " + zIsConsentFormAvailable);
            if (!zIsConsentFormAvailable) {
                com.applovin.impl.privacy.cmp.a.this.b("Failed to load form.");
                this.b.onFlowLoadFailed(new com.applovin.impl.privacy.cmp.CmpErrorImpl(com.applovin.sdk.AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form unavailable"));
            } else if (consentStatus != 2) {
                com.applovin.impl.privacy.cmp.a.this.b("Failed to load with consent status: " + consentStatus);
                this.b.onFlowLoadFailed(new com.applovin.impl.privacy.cmp.CmpErrorImpl(com.applovin.sdk.AppLovinCmpError.Code.FORM_NOT_REQUIRED, "Consent form not required for consent status: " + consentStatus));
            } else {
                com.applovin.impl.privacy.cmp.a.this.a("Successfully requested consent info");
                com.applovin.impl.privacy.cmp.a.this.a("Loading consent form...");
                com.google.android.ump.UserMessagingPlatform.loadConsentForm(this.f1162a, new com.applovin.impl.privacy.cmp.a.C0047a.C0048a(), new com.applovin.impl.privacy.cmp.a.C0047a.b());
            }
        }
    }

    class b implements com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.privacy.cmp.a.d f1165a;

        b(com.applovin.impl.privacy.cmp.a.d dVar) {
            this.f1165a = dVar;
        }

        @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
        public void onConsentInfoUpdateFailure(com.google.android.ump.FormError formError) {
            com.applovin.impl.privacy.cmp.a.this.b("Failed to request consent info with error: " + formError.getMessage());
            this.f1165a.onFlowLoadFailed(com.applovin.impl.privacy.cmp.a.this.a(formError, "Consent info update failed"));
        }
    }

    class c implements com.google.android.ump.ConsentForm.OnConsentFormDismissedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.privacy.cmp.a.d f1166a;

        c(com.applovin.impl.privacy.cmp.a.d dVar) {
            this.f1166a = dVar;
        }

        @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
        public void onConsentFormDismissed(com.google.android.ump.FormError formError) {
            if (formError != null) {
                com.applovin.impl.privacy.cmp.a.this.b("Failed to show with error: " + formError.getMessage());
                this.f1166a.onFlowShowFailed(com.applovin.impl.privacy.cmp.a.this.a(formError, "Consent form show failed"));
            } else {
                com.applovin.impl.privacy.cmp.a.this.a("Consent form finished showing");
                this.f1166a.onFlowHidden(null);
            }
        }
    }

    public interface d {
        void onFlowHidden(android.os.Bundle bundle);

        void onFlowLoadFailed(com.applovin.impl.privacy.cmp.CmpErrorImpl cmpErrorImpl);

        void onFlowLoaded(android.os.Bundle bundle);

        void onFlowShowFailed(com.applovin.impl.privacy.cmp.CmpErrorImpl cmpErrorImpl);
    }

    public a(com.applovin.impl.sdk.j jVar) {
        this.f1161a = jVar;
        this.b = jVar.I();
        com.google.android.ump.ConsentInformation consentInformation = com.google.android.ump.UserMessagingPlatform.getConsentInformation(com.applovin.impl.sdk.j.m());
        a("Initializing with SDK Version: " + b() + ", consentStatus: " + consentInformation.getConsentStatus() + ", consentFormAvailable: " + consentInformation.isConsentFormAvailable());
    }

    public java.lang.String b() {
        return null;
    }

    public void c() {
        a("Resetting consent information");
        com.google.android.ump.UserMessagingPlatform.getConsentInformation(com.applovin.impl.sdk.j.m()).reset();
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    public void a(android.app.Activity activity, com.applovin.impl.m3 m3Var, com.applovin.impl.privacy.cmp.a.d dVar) {
        com.google.android.ump.ConsentRequestParameters.Builder builder = new com.google.android.ump.ConsentRequestParameters.Builder();
        if (com.applovin.impl.yp.c(this.f1161a) && m3Var.a() == com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            builder.setConsentDebugSettings(new com.google.android.ump.ConsentDebugSettings.Builder(activity).setForceTesting(true).setDebugGeography(1).addTestDeviceHashedId(com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(this.f1161a.f0().getExtraParameters().get("google_test_device_hashed_id"))).build());
        }
        com.google.android.ump.UserMessagingPlatform.getConsentInformation(activity).requestConsentInfoUpdate(activity, builder.build(), new com.applovin.impl.privacy.cmp.a.C0047a(activity, dVar), new com.applovin.impl.privacy.cmp.a.b(dVar));
    }

    public void a() {
        if (this.c != null) {
            this.c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public com.applovin.impl.privacy.cmp.CmpErrorImpl a(com.google.android.ump.FormError formError, java.lang.String str) {
        com.applovin.sdk.AppLovinCmpError.Code code = com.applovin.sdk.AppLovinCmpError.Code.UNSPECIFIED;
        int errorCode = formError.getErrorCode();
        if (errorCode == 1 || errorCode == 2) {
            code = com.applovin.sdk.AppLovinCmpError.Code.FORM_UNAVAILABLE;
        } else if (errorCode == 3) {
            code = com.applovin.sdk.AppLovinCmpError.Code.INTEGRATION_ERROR;
        } else if (errorCode == 4) {
            code = com.applovin.sdk.AppLovinCmpError.Code.FORM_UNAVAILABLE;
        }
        return new com.applovin.impl.privacy.cmp.CmpErrorImpl(code, str, formError.getErrorCode(), formError.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("GoogleCmpAdapter", str);
        }
    }

    public void b(android.app.Activity activity, com.applovin.impl.m3 m3Var, com.applovin.impl.privacy.cmp.a.d dVar) {
        if (this.c == null) {
            b("Failed to show - not ready yet");
            dVar.onFlowShowFailed(new com.applovin.impl.privacy.cmp.CmpErrorImpl(com.applovin.sdk.AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form not ready"));
        } else {
            a("Showing consent form...");
            this.c.show(activity, new com.applovin.impl.privacy.cmp.a.c(dVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.b("GoogleCmpAdapter", str);
        }
    }
}
