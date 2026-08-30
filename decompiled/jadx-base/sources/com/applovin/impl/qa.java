package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class qa implements com.applovin.impl.pd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.pa.b f1176a;
    private final java.lang.String b;
    private final boolean c;
    private final java.util.Map d;

    public qa(java.lang.String str, boolean z, com.applovin.impl.pa.b bVar) {
        com.applovin.impl.b1.a((z && android.text.TextUtils.isEmpty(str)) ? false : true);
        this.f1176a = bVar;
        this.b = str;
        this.c = z;
        this.d = new java.util.HashMap();
    }

    @Override // com.applovin.impl.pd
    public byte[] a(java.util.UUID uuid, com.applovin.impl.y7.a aVar) throws com.applovin.impl.qd {
        java.lang.String str;
        java.lang.String strB = aVar.b();
        if (this.c || android.text.TextUtils.isEmpty(strB)) {
            strB = this.b;
        }
        if (!android.text.TextUtils.isEmpty(strB)) {
            java.util.HashMap map = new java.util.HashMap();
            java.util.UUID uuid2 = com.applovin.impl.t2.e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else {
                str = com.applovin.impl.t2.c.equals(uuid) ? com.json.zb.L : "application/octet-stream";
            }
            map.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.d) {
                map.putAll(this.d);
            }
            return a(this.f1176a, strB, aVar.a(), map);
        }
        com.applovin.impl.k5.b bVar = new com.applovin.impl.k5.b();
        android.net.Uri uri = android.net.Uri.EMPTY;
        throw new com.applovin.impl.qd(bVar.a(uri).a(), uri, com.applovin.impl.fb.h(), 0L, new java.lang.IllegalStateException("No license URL"));
    }

    @Override // com.applovin.impl.pd
    public byte[] a(java.util.UUID uuid, com.applovin.impl.y7.d dVar) {
        return a(this.f1176a, dVar.b() + "&signedRequest=" + com.applovin.impl.xp.a(dVar.a()), null, java.util.Collections.emptyMap());
    }

    private static java.lang.String a(com.applovin.impl.pa.e eVar, int i) {
        java.util.Map map;
        java.util.List list;
        int i2 = eVar.d;
        if ((i2 != 307 && i2 != 308) || i >= 5 || (map = eVar.g) == null || (list = (java.util.List) map.get(com.google.common.net.HttpHeaders.LOCATION)) == null || list.isEmpty()) {
            return null;
        }
        return (java.lang.String) list.get(0);
    }

    public void a(java.lang.String str, java.lang.String str2) {
        com.applovin.impl.b1.a((java.lang.Object) str);
        com.applovin.impl.b1.a((java.lang.Object) str2);
        synchronized (this.d) {
            this.d.put(str, str2);
        }
    }

    private static byte[] a(com.applovin.impl.pa.b bVar, java.lang.String str, byte[] bArr, java.util.Map map) throws com.applovin.impl.qd {
        com.applovin.impl.fl flVar = new com.applovin.impl.fl(bVar.a());
        com.applovin.impl.k5 k5VarA = new com.applovin.impl.k5.b().b(str).a(map).b(2).a(bArr).a(1).a();
        int i = 0;
        com.applovin.impl.k5 k5VarA2 = k5VarA;
        while (true) {
            try {
                com.applovin.impl.j5 j5Var = new com.applovin.impl.j5(flVar, k5VarA2);
                try {
                    try {
                        byte[] bArrA = com.applovin.impl.xp.a((java.io.InputStream) j5Var);
                        com.applovin.impl.xp.a((java.io.Closeable) j5Var);
                        return bArrA;
                    } catch (com.applovin.impl.pa.e e) {
                        java.lang.String strA = a(e, i);
                        if (strA != null) {
                            i++;
                            k5VarA2 = k5VarA2.a().b(strA).a();
                            com.applovin.impl.xp.a((java.io.Closeable) j5Var);
                        } else {
                            throw e;
                        }
                    }
                } catch (java.lang.Throwable th) {
                    com.applovin.impl.xp.a((java.io.Closeable) j5Var);
                    throw th;
                }
            } catch (java.lang.Exception e2) {
                throw new com.applovin.impl.qd(k5VarA, (android.net.Uri) com.applovin.impl.b1.a(flVar.h()), flVar.e(), flVar.g(), e2);
            }
        }
    }
}
