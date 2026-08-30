package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1008a;
    private final int b;
    private java.util.List c;
    private java.lang.String d;
    private com.applovin.impl.i4 e;
    private com.applovin.impl.h4.b f;
    private com.applovin.impl.h4.a g;
    private com.applovin.impl.i4 h;
    private android.app.Dialog i;
    private final com.applovin.impl.p j = new com.applovin.impl.m4.a();

    class a extends com.applovin.impl.p {
        a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof com.applovin.sdk.AppLovinWebViewActivity) || com.applovin.impl.m4.this.h == null) {
                return;
            }
            if (com.applovin.impl.m4.this.i != null) {
                com.applovin.impl.m4 m4Var = com.applovin.impl.m4.this;
                if (!com.applovin.impl.r.a(m4Var.a(m4Var.i))) {
                    com.applovin.impl.m4.this.i.dismiss();
                }
                com.applovin.impl.m4.this.i = null;
            }
            com.applovin.impl.i4 i4Var = com.applovin.impl.m4.this.h;
            com.applovin.impl.m4.this.h = null;
            com.applovin.impl.m4 m4Var2 = com.applovin.impl.m4.this;
            m4Var2.a(m4Var2.e, i4Var, activity);
        }
    }

    public m4(com.applovin.impl.sdk.j jVar) {
        this.f1008a = jVar;
        this.b = ((java.lang.Integer) jVar.a(com.applovin.impl.sj.q6)).intValue();
    }

    public void c() {
        com.applovin.impl.h4.a aVar;
        this.c = null;
        this.e = null;
        this.f1008a.e().b(this.j);
        com.applovin.impl.h4.b bVar = this.f;
        if (bVar != null && (aVar = this.g) != null) {
            bVar.a(aVar);
        }
        this.f = null;
        this.g = null;
    }

    class b implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.k4 f1010a;
        final /* synthetic */ com.applovin.impl.i4 b;
        final /* synthetic */ android.app.Activity c;

        b(com.applovin.impl.k4 k4Var, com.applovin.impl.i4 i4Var, android.app.Activity activity) {
            this.f1010a = k4Var;
            this.b = i4Var;
            this.c = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            com.applovin.impl.m4.this.h = null;
            com.applovin.impl.m4.this.i = null;
            com.applovin.impl.i4 i4VarA = com.applovin.impl.m4.this.a(this.f1010a.a());
            if (i4VarA == null) {
                com.applovin.impl.m4.this.b("Destination state for TOS/PP alert is null");
                return;
            }
            com.applovin.impl.m4.this.a(this.b, i4VarA, this.c);
            if (i4VarA.c() != com.applovin.impl.i4.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    class c extends android.text.style.ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.net.Uri f1011a;
        final /* synthetic */ android.app.Activity b;

        c(android.net.Uri uri, android.app.Activity activity) {
            this.f1011a = uri;
            this.b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            com.applovin.impl.yp.a(this.f1011a, this.b, com.applovin.impl.m4.this.f1008a);
        }
    }

    class d extends android.text.style.ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.net.Uri f1012a;
        final /* synthetic */ android.app.Activity b;

        d(android.net.Uri uri, android.app.Activity activity) {
            this.f1012a = uri;
            this.b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            com.applovin.impl.yp.a(this.f1012a, this.b, com.applovin.impl.m4.this.f1008a);
        }
    }

    class e implements com.applovin.impl.privacy.cmp.CmpServiceImpl.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.i4 f1013a;
        final /* synthetic */ android.app.Activity b;

        e(com.applovin.impl.i4 i4Var, android.app.Activity activity) {
            this.f1013a = i4Var;
            this.b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.d
        public void a(com.applovin.sdk.AppLovinCmpError appLovinCmpError) {
            com.applovin.impl.m4.this.a(this.f1013a, this.b, java.lang.Boolean.valueOf(appLovinCmpError == null));
        }
    }

    class f implements com.applovin.impl.privacy.cmp.CmpServiceImpl.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.i4 f1014a;
        final /* synthetic */ android.app.Activity b;

        f(com.applovin.impl.i4 i4Var, android.app.Activity activity) {
            this.f1014a = i4Var;
            this.b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(com.applovin.sdk.AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError == null && com.applovin.impl.m4.this.g != null) {
                com.applovin.impl.m4.this.g.a(true);
            }
            com.applovin.impl.m4.this.b(this.f1014a, this.b);
        }
    }

    private void c(final com.applovin.impl.i4 i4Var, final android.app.Activity activity) {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.m4$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(i4Var, activity);
            }
        });
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.i4 f1015a;

        g(com.applovin.impl.i4 i4Var) {
            this.f1015a = i4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.impl.m4 m4Var = com.applovin.impl.m4.this;
            m4Var.a(m4Var.e, this.f1015a, com.applovin.impl.m4.this.f1008a.m0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(java.lang.String str) {
        com.applovin.impl.p6.a(str, new java.lang.Object[0]);
        this.f1008a.D().a(com.applovin.impl.ka.S, str, (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("details", "Last started states: " + this.d + "\nLast successful state: " + this.e));
        com.applovin.impl.h4.a aVar = this.g;
        if (aVar != null) {
            aVar.a(new com.applovin.impl.f4(com.applovin.impl.f4.f, str));
        }
        c();
    }

    public boolean b() {
        return this.c != null;
    }

    private com.applovin.impl.i4 a() {
        java.util.List<com.applovin.impl.i4> list = this.c;
        if (list == null) {
            return null;
        }
        for (com.applovin.impl.i4 i4Var : list) {
            if (i4Var.d()) {
                return i4Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.i4 i4Var, android.app.Activity activity) {
        a(i4Var, activity, (java.lang.Boolean) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.app.Activity a(android.app.Dialog dialog) {
        android.content.Context context = dialog.getContext();
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (!(context instanceof android.content.ContextWrapper)) {
            return null;
        }
        android.content.Context baseContext = ((android.content.ContextWrapper) context).getBaseContext();
        if (baseContext instanceof android.app.Activity) {
            return (android.app.Activity) baseContext;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.applovin.impl.i4 a(java.lang.String str) {
        java.util.List<com.applovin.impl.i4> list = this.c;
        if (list == null) {
            return null;
        }
        for (com.applovin.impl.i4 i4Var : list) {
            if (str.equalsIgnoreCase(i4Var.b())) {
                return i4Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.app.AlertDialog alertDialog, android.app.Activity activity, android.content.DialogInterface dialogInterface) {
        android.widget.TextView textView = (android.widget.TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setMaxLines(this.b);
        textView.setMinHeight(com.applovin.sdk.AppLovinSdkUtils.dpToPx(activity, 48));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.i4 i4Var, final android.app.Activity activity) {
        android.text.SpannableString spannableString;
        if (i4Var == null) {
            b("Consent flow state is null");
            return;
        }
        this.f1008a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1008a.I().a("AppLovinSdk", "Transitioning to state: " + i4Var);
        }
        if (i4Var.c() == com.applovin.impl.i4.b.ALERT) {
            if (com.applovin.impl.r.a(activity)) {
                a(i4Var);
                return;
            }
            com.applovin.impl.j4 j4Var = (com.applovin.impl.j4) i4Var;
            this.h = j4Var;
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
            builder.setCancelable(false);
            for (com.applovin.impl.k4 k4Var : j4Var.e()) {
                com.applovin.impl.m4.b bVar = new com.applovin.impl.m4.b(k4Var, i4Var, activity);
                if (k4Var.c() == com.applovin.impl.k4.a.POSITIVE) {
                    builder.setPositiveButton(k4Var.d(), bVar);
                } else if (k4Var.c() == com.applovin.impl.k4.a.NEGATIVE) {
                    builder.setNegativeButton(k4Var.d(), bVar);
                } else {
                    builder.setNeutralButton(k4Var.d(), bVar);
                }
            }
            java.lang.String strG = j4Var.g();
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strG)) {
                spannableString = new android.text.SpannableString(strG);
                java.lang.String strA = com.applovin.impl.sdk.j.a(com.applovin.sdk.R.string.applovin_terms_of_service_text);
                java.lang.String strA2 = com.applovin.impl.sdk.j.a(com.applovin.sdk.R.string.applovin_privacy_policy_text);
                if (com.applovin.impl.sdk.utils.StringUtils.containsAtLeastOneSubstring(strG, java.util.Arrays.asList(strA, strA2))) {
                    android.net.Uri uriH = this.f1008a.u().h();
                    if (uriH != null) {
                        com.applovin.impl.sdk.utils.StringUtils.addLinks(spannableString, java.util.regex.Pattern.compile(strA), new com.applovin.impl.m4.c(uriH, activity), true);
                    }
                    com.applovin.impl.sdk.utils.StringUtils.addLinks(spannableString, java.util.regex.Pattern.compile(strA2), new com.applovin.impl.m4.d(this.f1008a.u().g(), activity), true);
                }
            } else {
                spannableString = null;
            }
            final android.app.AlertDialog alertDialogCreate = builder.setTitle(spannableString).setMessage(j4Var.f()).create();
            alertDialogCreate.setOnShowListener(new android.content.DialogInterface.OnShowListener() { // from class: com.applovin.impl.m4$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(android.content.DialogInterface dialogInterface) {
                    this.f$0.a(alertDialogCreate, activity, dialogInterface);
                }
            });
            this.i = alertDialogCreate;
            alertDialogCreate.show();
            return;
        }
        if (i4Var.c() == com.applovin.impl.i4.b.EVENT) {
            com.applovin.impl.l4 l4Var = (com.applovin.impl.l4) i4Var;
            java.lang.String strF = l4Var.f();
            java.util.Map<java.lang.String, java.lang.String> mapE = l4Var.e();
            if (mapE == null) {
                mapE = new java.util.HashMap<>(1);
            }
            mapE.put("flow_type", "unified");
            this.f1008a.z().trackEvent(strF, mapE);
            b(l4Var, activity);
            return;
        }
        if (i4Var.c() == com.applovin.impl.i4.b.HAS_USER_CONSENT) {
            a(true);
            b(i4Var, activity);
            return;
        }
        if (i4Var.c() == com.applovin.impl.i4.b.CMP_LOAD) {
            if (com.applovin.impl.r.a(activity)) {
                a(i4Var);
                return;
            } else {
                this.f1008a.p().loadCmp(activity, new com.applovin.impl.m4.e(i4Var, activity));
                return;
            }
        }
        if (i4Var.c() == com.applovin.impl.i4.b.CMP_SHOW) {
            if (com.applovin.impl.r.a(activity)) {
                a(i4Var);
                return;
            } else {
                this.f1008a.z().trackEvent("cf_start");
                this.f1008a.p().showCmp(activity, new com.applovin.impl.m4.f(i4Var, activity));
                return;
            }
        }
        if (i4Var.c() == com.applovin.impl.i4.b.DECISION) {
            com.applovin.impl.i4.a aVarA = i4Var.a();
            if (aVarA == com.applovin.impl.i4.a.IS_AL_GDPR) {
                com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyE = this.f1008a.u().e();
                com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                a(i4Var, activity, java.lang.Boolean.valueOf(this.f1008a.s().getConsentFlowUserGeography() == consentFlowUserGeography || (consentFlowUserGeographyE == consentFlowUserGeography && com.applovin.impl.yp.c(this.f1008a))));
                return;
            }
            b("Invalid consent flow decision type: " + aVarA);
            return;
        }
        if (i4Var.c() == com.applovin.impl.i4.b.TERMS_FLOW) {
            java.util.List listA = com.applovin.impl.g4.a(this.f1008a);
            if (listA != null && listA.size() > 0) {
                this.f1008a.z().trackEvent("cf_start");
                this.c = listA;
                a(i4Var, a(), activity);
                return;
            }
            c();
            return;
        }
        if (i4Var.c() == com.applovin.impl.i4.b.REINIT) {
            c();
        } else {
            b("Invalid consent flow destination state: " + i4Var);
        }
    }

    public void a(boolean z) {
        com.applovin.impl.a4.b(z, com.applovin.impl.sdk.j.m());
    }

    public void a(java.util.List list, android.app.Activity activity, com.applovin.impl.h4.b bVar) {
        if (this.c != null) {
            this.f1008a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1008a.I().a("AppLovinSdk", "Unable to start states: " + list);
            }
            this.f1008a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1008a.I().a("AppLovinSdk", "Consent flow already in progress for states: " + this.c);
            }
            bVar.a(new com.applovin.impl.h4.a(new com.applovin.impl.f4(com.applovin.impl.f4.e, "Consent flow is already in progress.")));
            return;
        }
        this.c = list;
        this.d = java.lang.String.valueOf(list);
        this.f = bVar;
        this.g = new com.applovin.impl.h4.a();
        com.applovin.impl.sdk.j.a(activity).a(this.j);
        a((com.applovin.impl.i4) null, a(), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.i4 i4Var, android.app.Activity activity, java.lang.Boolean bool) {
        a(i4Var, a(i4Var.a(bool)), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.i4 i4Var, com.applovin.impl.i4 i4Var2, android.app.Activity activity) {
        this.e = i4Var;
        c(i4Var2, activity);
    }

    private void a(com.applovin.impl.i4 i4Var) {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new com.applovin.impl.m4.g(i4Var), java.util.concurrent.TimeUnit.SECONDS.toMillis(1L));
    }
}
