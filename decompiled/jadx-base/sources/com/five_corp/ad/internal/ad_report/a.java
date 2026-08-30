package com.five_corp.ad.internal.ad_report;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Handler f1839a = new android.os.Handler(android.os.Looper.getMainLooper());
    public com.five_corp.ad.internal.ad_report.c b = null;
    public com.five_corp.ad.internal.ad_report.b c = null;

    public final void a() {
        com.five_corp.ad.internal.ad_report.b bVar = this.c;
        if (bVar != null) {
            bVar.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.T6, null, null, null));
            this.b = null;
            this.c = null;
        }
    }

    public final void a(android.content.Context context, boolean z, com.five_corp.ad.internal.ad_report.c cVar, com.five_corp.ad.internal.ad_report.b bVar) {
        if (this.c != null) {
            bVar.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.S6, null, null, null));
            return;
        }
        this.b = cVar;
        this.c = bVar;
        this.f1839a.postDelayed(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.ad_report.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a();
            }
        }, 1000L);
        try {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.five_corp.ad.AdReportDialogActivity.class);
            intent.addFlags(268435456);
            intent.addFlags(65536);
            intent.putExtra(com.five_corp.ad.AdReportDialogActivity.EXTRA_IS_FULLSCREEN, z);
            context.startActivity(intent);
            if (android.os.Build.VERSION.SDK_INT >= 34 || !(context instanceof android.app.Activity)) {
                return;
            }
            ((android.app.Activity) context).overridePendingTransition(0, 0);
        } catch (java.lang.Exception e) {
            bVar.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.U6, null, e, null));
            this.b = null;
            this.c = null;
        }
    }
}
