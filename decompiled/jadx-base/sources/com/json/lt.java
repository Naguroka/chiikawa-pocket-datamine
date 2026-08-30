package com.json;

/* JADX INFO: loaded from: classes5.dex */
class lt implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Handler f2901a;
    private final com.json.ab b;

    lt(com.json.ab abVar, android.os.Handler handler) {
        this.b = abVar;
        this.f2901a = handler;
    }

    android.os.Message a() {
        return new android.os.Message();
    }

    com.json.vc a(com.json.ab abVar, java.lang.String str, long j) {
        return new com.json.vc(abVar, str, j);
    }

    java.lang.String a(java.lang.String str) {
        return com.json.sdk.utils.IronSourceStorageUtils.makeDir(str);
    }

    @Override // java.lang.Runnable
    public void run() throws java.lang.Throwable {
        int iB;
        com.json.ih ihVar = new com.json.ih(this.b.b().getParent(), this.b.b().getName());
        android.os.Message messageA = a();
        messageA.obj = ihVar;
        java.lang.String strA = a(ihVar.getParent());
        if (strA == null) {
            iB = 1020;
        } else {
            com.json.bb bbVarCall = a(new com.json.ab(ihVar, this.b.e(), this.b.a(), this.b.c(), this.b.f(), this.b.d()), strA, 3L).call();
            iB = bbVarCall.b() == 200 ? 1016 : bbVarCall.b();
        }
        messageA.what = iB;
        this.f2901a.sendMessage(messageA);
    }
}
