package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f3431a;
    private final com.json.db b;
    private final com.json.sc c;
    private final com.json.lm d;
    private final com.json.Cif e = com.json.im.S().f();

    class a implements com.json.lo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.lo f3432a;

        /* JADX INFO: renamed from: com.ironsource.tc$a$a, reason: collision with other inner class name */
        class C0252a extends org.json.JSONObject {
            C0252a() throws org.json.JSONException {
                put("lastReferencedTime", java.lang.System.currentTimeMillis());
            }
        }

        a(com.json.lo loVar) {
            this.f3432a = loVar;
        }

        @Override // com.json.lo
        public void a(com.json.ih ihVar) {
            this.f3432a.a(ihVar);
            try {
                com.json.tc.this.d.a(ihVar.getName(), new com.ironsource.tc.a.C0252a());
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.json.lo
        public void a(com.json.ih ihVar, com.json.ah ahVar) {
            this.f3432a.a(ihVar, ahVar);
        }
    }

    public tc(android.content.Context context, com.json.db dbVar, com.json.sc scVar, com.json.lm lmVar) {
        this.f3431a = context;
        this.b = dbVar;
        this.c = scVar;
        this.d = lmVar;
    }

    public void a(com.json.ih ihVar) throws java.lang.Exception {
        if (ihVar.exists()) {
            if (!ihVar.delete()) {
                throw new java.lang.Exception("Failed to delete file");
            }
            this.d.a(ihVar.getName());
        }
    }

    public void a(com.json.ih ihVar, java.lang.String str, int i, int i2, com.json.lo loVar) throws java.lang.Exception {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.Exception(com.ironsource.rc.a.f3238a);
        }
        if (this.e.a(this.b.a()) <= 0) {
            throw new java.lang.Exception(com.json.a9.A);
        }
        if (!com.json.u8.h(this.f3431a)) {
            throw new java.lang.Exception(com.json.a9.C);
        }
        this.c.a(ihVar.getPath(), new com.ironsource.tc.a(loVar));
        if (!ihVar.exists()) {
            this.b.a(ihVar, str, i, i2, this.c);
            return;
        }
        android.os.Message message = new android.os.Message();
        message.obj = ihVar;
        message.what = 1015;
        this.c.sendMessage(message);
    }

    public void a(com.json.ih ihVar, org.json.JSONObject jSONObject) throws java.lang.Exception {
        if (jSONObject == null) {
            throw new java.lang.Exception("Missing attributes to update");
        }
        if (!ihVar.exists()) {
            throw new java.lang.Exception("File does not exist");
        }
        if (!this.d.b(ihVar.getName(), jSONObject)) {
            throw new java.lang.Exception("Failed to update attribute");
        }
    }

    public void b(com.json.ih ihVar) throws java.lang.Exception {
        if (ihVar.exists()) {
            java.util.ArrayList<com.json.ih> filesInFolderRecursive = com.json.sdk.utils.IronSourceStorageUtils.getFilesInFolderRecursive(ihVar);
            if (!(com.json.sdk.utils.IronSourceStorageUtils.deleteFolderContentRecursive(ihVar) && ihVar.delete())) {
                throw new java.lang.Exception("Failed to delete folder");
            }
            this.d.a(filesInFolderRecursive);
        }
    }

    public org.json.JSONObject c(com.json.ih ihVar) throws java.lang.Exception {
        if (ihVar.exists()) {
            return com.json.sdk.utils.IronSourceStorageUtils.buildFilesMapOfDirectory(ihVar, this.d.b());
        }
        throw new java.lang.Exception("Folder does not exist");
    }

    public long d(com.json.ih ihVar) throws java.lang.Exception {
        if (ihVar.exists()) {
            return com.json.sdk.utils.IronSourceStorageUtils.getTotalSizeOfDir(ihVar);
        }
        throw new java.lang.Exception("Folder does not exist");
    }
}
