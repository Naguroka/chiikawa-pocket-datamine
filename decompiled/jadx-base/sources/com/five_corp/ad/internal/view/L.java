package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.app.Activity f2093a;

    public L(android.app.Activity activity) {
        this.f2093a = activity;
    }

    public final void a() {
        this.f2093a.finish();
        if (android.os.Build.VERSION.SDK_INT < 34) {
            this.f2093a.overridePendingTransition(0, 0);
        }
    }

    public final /* synthetic */ void a(android.view.View view) {
        a();
    }

    public final void a(com.five_corp.ad.internal.view.C1510c c1510c) {
        com.five_corp.ad.internal.view.K k = new com.five_corp.ad.internal.view.K(this.f2093a, c1510c);
        k.setOnClickListener(null);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f2093a.findViewById(android.R.id.content);
        viewGroup.setBackgroundColor(0);
        viewGroup.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.five_corp.ad.internal.view.L$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.f$0.a(view);
            }
        });
        viewGroup.addView(k);
    }
}
