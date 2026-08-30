package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class jb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f919a;
    private final android.app.Activity b;
    private android.app.AlertDialog c;
    private com.applovin.impl.jb.a d;

    public interface a {
        void b();

        void c();
    }

    public jb(android.app.Activity activity, com.applovin.impl.sdk.j jVar) {
        this.f919a = jVar;
        this.b = activity;
    }

    public void a() {
        this.b.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.jb$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        android.app.AlertDialog alertDialog = this.c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.c = new android.app.AlertDialog.Builder(this.b).setTitle((java.lang.CharSequence) this.f919a.a(com.applovin.impl.sj.h1)).setMessage((java.lang.CharSequence) this.f919a.a(com.applovin.impl.sj.i1)).setCancelable(false).setPositiveButton((java.lang.CharSequence) this.f919a.a(com.applovin.impl.sj.k1), new android.content.DialogInterface.OnClickListener() { // from class: com.applovin.impl.jb$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                this.f$0.a(dialogInterface, i);
            }
        }).setNegativeButton((java.lang.CharSequence) this.f919a.a(com.applovin.impl.sj.j1), new android.content.DialogInterface.OnClickListener() { // from class: com.applovin.impl.jb$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                this.f$0.b(dialogInterface, i);
            }
        }).show();
    }

    public void e() {
        this.b.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.jb$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d();
            }
        });
    }

    public boolean b() {
        android.app.AlertDialog alertDialog = this.c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(java.lang.Runnable runnable, android.content.DialogInterface dialogInterface, int i) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.content.DialogInterface dialogInterface, int i) {
        this.d.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, final java.lang.Runnable runnable) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this.b);
        builder.setTitle(bVar.c0());
        java.lang.String strA0 = bVar.a0();
        if (com.applovin.sdk.AppLovinSdkUtils.isValidString(strA0)) {
            builder.setMessage(strA0);
        }
        builder.setPositiveButton(bVar.b0(), new android.content.DialogInterface.OnClickListener() { // from class: com.applovin.impl.jb$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.applovin.impl.jb.a(runnable, dialogInterface, i);
            }
        });
        builder.setCancelable(false);
        this.c = builder.show();
    }

    public void b(final com.applovin.impl.sdk.ad.b bVar, final java.lang.Runnable runnable) {
        this.b.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.jb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(bVar, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.content.DialogInterface dialogInterface, int i) {
        this.d.c();
    }

    public void a(com.applovin.impl.jb.a aVar) {
        this.d = aVar;
    }
}
