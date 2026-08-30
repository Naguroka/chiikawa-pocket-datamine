package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class gc implements java.lang.Runnable {
    private static final java.lang.String e = "Content-Type";
    private static final java.lang.String f = "application/json";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.nf f2684a;
    java.lang.String b;
    java.lang.String c;
    java.util.ArrayList<com.json.wb> d;

    public gc(com.json.nf nfVar, java.lang.String str, java.lang.String str2, java.util.ArrayList<com.json.wb> arrayList) {
        this.f2684a = nfVar;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.ironsource.nf.a aVarA;
        com.ironsource.nf.a aVar = new com.ironsource.nf.a(this.d);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new android.util.Pair("Content-Type", "application/json"));
            com.json.bq bqVarB = com.json.mg.b(this.c, this.b, arrayList);
            aVarA = aVar.a(bqVarB.a()).a(bqVarB.f2539a);
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("EventsSender failed to send events - " + e2.getLocalizedMessage());
            aVarA = aVar.a(e2 instanceof com.json.co).a(e2);
        }
        com.json.nf nfVar = this.f2684a;
        if (nfVar != null) {
            nfVar.a(aVarA);
        }
    }
}
