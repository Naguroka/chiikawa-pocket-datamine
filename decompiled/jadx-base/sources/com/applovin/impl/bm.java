package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bm extends com.applovin.impl.yl implements com.applovin.impl.ye.a {
    protected final com.applovin.impl.sdk.ad.b h;
    protected final com.applovin.impl.u2 i;
    private com.applovin.sdk.AppLovinAdLoadListener j;
    private final com.applovin.impl.sdk.l k;
    private final java.util.Collection l;
    private boolean m;
    protected java.util.concurrent.ExecutorService n;
    protected java.util.concurrent.ExecutorService o;
    protected java.util.List p;
    protected java.lang.String q;

    public interface e {
        void a(java.lang.String str);
    }

    protected java.util.List e() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Caching mute images...");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.h.M() != null) {
            arrayList.add(a(this.h.M().toString(), new com.applovin.impl.bm.a()));
        }
        if (this.h.g0() != null) {
            arrayList.add(a(this.h.g0().toString(), new com.applovin.impl.bm.b()));
        }
        return arrayList;
    }

    void f() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Rendered new ad:" + this.h);
        }
        com.applovin.mediation.MaxAdFormat maxAdFormatD = this.h.getAdZone().d();
        if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.Y0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f1547a.g().b(this.h);
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.bm$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.i();
            }
        });
    }

    void j() {
        if (com.applovin.impl.z3.f()) {
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Caching mute images...");
        }
        android.net.Uri uriA = a(this.h.M(), "mute");
        if (uriA != null) {
            this.h.b(uriA);
        }
        android.net.Uri uriA2 = a(this.h.g0(), "unmute");
        if (uriA2 != null) {
            this.h.c(uriA2);
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Ad updated with muteImageFilename = " + this.h.M() + ", unmuteImageFilename = " + this.h.g0());
        }
    }

    bm(java.lang.String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, jVar);
        if (bVar != null) {
            this.h = bVar;
            this.j = appLovinAdLoadListener;
            this.k = jVar.A();
            this.l = h();
            this.i = new com.applovin.impl.u2();
            if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.I0)).booleanValue()) {
                this.q = com.applovin.impl.sdk.utils.StringUtils.isValidString(bVar.I()) ? bVar.I() : java.util.UUID.randomUUID().toString();
                this.n = jVar.i0().a("com.applovin.sdk.caching." + this.q, ((java.lang.Integer) jVar.a(com.applovin.impl.sj.J0)).intValue());
                this.o = jVar.i0().a("com.applovin.sdk.caching.html." + this.q, ((java.lang.Integer) jVar.a(com.applovin.impl.sj.K0)).intValue());
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("No ad specified.");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.h.g1()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Subscribing to timeout events...");
            }
            this.f1547a.R().a(this);
        }
    }

    protected void k() {
        this.f1547a.R().b(this);
        java.util.concurrent.ExecutorService executorService = this.n;
        if (executorService != null) {
            executorService.shutdown();
            this.n = null;
        }
        java.util.concurrent.ExecutorService executorService2 = this.o;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.o = null;
        }
    }

    protected boolean l() {
        return this.m;
    }

    protected void g() {
        this.m = true;
        java.util.List list = this.p;
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = this.p.iterator();
            while (it.hasNext()) {
                ((com.applovin.impl.d1) it.next()).a(true);
            }
        }
        java.util.concurrent.ExecutorService executorService = this.n;
        if (executorService != null) {
            executorService.shutdown();
            this.n = null;
        }
        java.util.concurrent.ExecutorService executorService2 = this.o;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.o = null;
        }
    }

    protected java.util.List a(java.util.List list) {
        this.p = list;
        return this.f1547a.i0().a(list, this.n);
    }

    class a implements com.applovin.impl.f1.a {
        a() {
        }

        @Override // com.applovin.impl.f1.a
        public void a(android.net.Uri uri) {
            com.applovin.impl.bm.this.h.b(uri);
            com.applovin.impl.sdk.n nVar = com.applovin.impl.bm.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.bm bmVar = com.applovin.impl.bm.this;
                bmVar.c.a(bmVar.b, "Ad updated with muteImageUri = " + uri);
            }
        }
    }

    class b implements com.applovin.impl.f1.a {
        b() {
        }

        @Override // com.applovin.impl.f1.a
        public void a(android.net.Uri uri) {
            com.applovin.impl.bm.this.h.c(uri);
            com.applovin.impl.sdk.n nVar = com.applovin.impl.bm.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.bm bmVar = com.applovin.impl.bm.this;
                bmVar.c.a(bmVar.b, "Ad updated with unmuteImageUri = " + uri);
            }
        }
    }

    class c implements com.applovin.impl.f1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.f1.a f656a;

        c(com.applovin.impl.f1.a aVar) {
            this.f656a = aVar;
        }

        @Override // com.applovin.impl.f1.a
        public void a(android.net.Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.n nVar = com.applovin.impl.bm.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.bm bmVar = com.applovin.impl.bm.this;
                    bmVar.c.a(bmVar.b, "Finish caching video for ad #" + com.applovin.impl.bm.this.h.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
                }
                this.f656a.a(uri);
                return;
            }
            com.applovin.impl.sdk.n nVar2 = com.applovin.impl.bm.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.bm bmVar2 = com.applovin.impl.bm.this;
                bmVar2.c.b(bmVar2.b, "Failed to cache video");
            }
            com.applovin.impl.bm.this.a(com.applovin.sdk.AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("ad_id", com.applovin.impl.bm.this.h.getAdIdNumber());
            bundle.putInt("load_response_code", com.applovin.impl.bm.this.i.b());
            java.lang.Throwable thA = com.applovin.impl.bm.this.i.a();
            if (thA != null) {
                bundle.putString("load_exception_message", thA.getMessage());
            }
            com.applovin.impl.bm.this.f1547a.q().a(bundle, "video_caching_failed");
        }
    }

    class d implements com.applovin.impl.e1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.bm.e f657a;

        d(com.applovin.impl.bm.e eVar) {
            this.f657a = eVar;
        }

        @Override // com.applovin.impl.e1.c
        public void a(java.lang.String str, boolean z) {
            if (z) {
                com.applovin.impl.bm.this.a(com.applovin.sdk.AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            com.applovin.impl.bm.e eVar = this.f657a;
            if (eVar != null) {
                eVar.a(str);
            }
        }
    }

    android.net.Uri c(java.lang.String str) {
        return c(str, this.h.Y(), true);
    }

    protected android.net.Uri b(java.lang.String str) {
        return a(str, this.h.Y(), true);
    }

    protected java.lang.String d(java.lang.String str, java.util.List list, boolean z) {
        if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.z)).booleanValue()) {
            try {
                java.io.InputStream inputStreamA = this.k.a(str, list, z, this.i);
                if (inputStreamA == null) {
                    if (inputStreamA != null) {
                        inputStreamA.close();
                    }
                    return null;
                }
                try {
                    java.lang.String strA = this.k.a(inputStreamA);
                    inputStreamA.close();
                    return strA;
                } catch (java.lang.Throwable th) {
                    try {
                        inputStreamA.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.b, "Unknown failure to read input stream.", th3);
                }
                this.c.a(this.b, th3);
                this.f1547a.D().a(this.b, "readInputStreamAsString", th3);
                return null;
            }
        }
        java.io.InputStream inputStreamA2 = this.k.a(str, list, z, this.i);
        if (inputStreamA2 == null) {
            return null;
        }
        try {
            java.lang.String strA2 = this.k.a(inputStreamA2);
            com.applovin.impl.yp.a(inputStreamA2, this.f1547a);
            return strA2;
        } catch (java.lang.Throwable th4) {
            try {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.b, "Unknown failure to read input stream.", th4);
                }
                this.f1547a.D().a(this.b, "readInputStreamAsString", th4);
                return null;
            } finally {
                com.applovin.impl.yp.a(inputStreamA2, this.f1547a);
            }
        }
    }

    android.net.Uri c(java.lang.String str, java.util.List list, boolean z) {
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Caching video " + str + "...");
        }
        java.lang.String strA = this.k.a(a(), str, this.h.getCachePrefix(), list, z, this.i, this.f1547a.A().a(str, this.h));
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
            java.io.File fileA = this.k.a(strA, a());
            if (fileA != null) {
                android.net.Uri uriFromFile = android.net.Uri.fromFile(fileA);
                if (uriFromFile != null) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.b, "Finish caching video for ad #" + this.h.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + strA);
                    }
                    return uriFromFile;
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.b(this.b, "Unable to create URI from cached video file = " + fileA);
                }
                this.f1547a.D().a(com.applovin.impl.ka.Q, "extractUriFromVideoFile", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("url", strA));
                return null;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Unable to retrieve File from cached video filename = " + strA);
            }
            this.f1547a.D().a(com.applovin.impl.ka.Q, "retrieveVideoFile", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("url", strA));
            return null;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.b(this.b, "Failed to cache video: " + str);
        }
        this.f1547a.D().a(com.applovin.impl.ka.Q, "cacheVideo", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("url", str));
        a(com.applovin.sdk.AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener = this.j;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.h);
            this.j = null;
        }
    }

    private java.util.Collection h() {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (char c2 : ((java.lang.String) this.f1547a.a(com.applovin.impl.sj.D0)).toCharArray()) {
            hashSet.add(java.lang.Character.valueOf(c2));
        }
        hashSet.add(java.lang.Character.valueOf(kotlin.text.Typography.quote));
        return hashSet;
    }

    java.lang.String b(java.lang.String str, java.util.List list, boolean z) {
        java.io.InputStream inputStreamA;
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            android.net.Uri uri = android.net.Uri.parse(str);
            if (uri == null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.b, "Nothing to cache, skipping...");
                }
                return null;
            }
            try {
                java.io.File fileA = this.k.a(com.applovin.impl.yp.a(uri, this.h.getCachePrefix(), this.f1547a), a());
                if (!this.k.a(fileA)) {
                    if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.z)).booleanValue()) {
                        try {
                            java.io.InputStream inputStreamA2 = this.k.a(str, list, z, this.i);
                            try {
                                if (inputStreamA2 != null) {
                                    this.k.a(inputStreamA2, fileA);
                                } else {
                                    if (com.applovin.impl.sdk.n.a()) {
                                        this.c.b(this.b, "Failed to load resource: " + str);
                                    }
                                    this.f1547a.D().a(com.applovin.impl.ka.Q, "cacheStringResource", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("url", str));
                                }
                                if (inputStreamA2 != null) {
                                    inputStreamA2.close();
                                }
                            } catch (java.lang.Throwable th) {
                                if (inputStreamA2 != null) {
                                    try {
                                        inputStreamA2.close();
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th3) {
                            this.c.a(this.b, th3);
                            this.f1547a.D().a(this.b, "cacheStringResource", th3);
                        }
                    } else {
                        try {
                            inputStreamA = this.k.a(str, list, z, this.i);
                            try {
                                if (inputStreamA != null) {
                                    this.k.a(inputStreamA, fileA);
                                } else {
                                    if (com.applovin.impl.sdk.n.a()) {
                                        this.c.b(this.b, "Failed to load resource: " + str);
                                    }
                                    this.f1547a.D().a(com.applovin.impl.ka.Q, "cacheStringResource", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("url", str));
                                }
                                com.applovin.impl.yp.a(inputStreamA, this.f1547a);
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                com.applovin.impl.yp.a(inputStreamA, this.f1547a);
                                throw th;
                            }
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            inputStreamA = null;
                        }
                    }
                }
                return this.k.e(fileA);
            } catch (java.lang.Throwable th6) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.b, "Resource at " + str + " failed to load.", th6);
                }
            }
        }
        return null;
    }

    private android.net.Uri a(java.lang.String str, java.lang.String str2) {
        java.io.File fileA = this.k.a(com.applovin.impl.yp.a(android.net.Uri.parse(str2), this.h.getCachePrefix(), this.f1547a), com.applovin.impl.sdk.j.m());
        if (fileA == null) {
            return null;
        }
        if (this.k.a(fileA)) {
            this.i.a(fileA.length());
            return android.net.Uri.parse("file://" + fileA.getAbsolutePath());
        }
        java.lang.String str3 = str + str2;
        if (this.k.a(fileA, str3, java.util.Arrays.asList(str), this.i, this.f1547a.A().a(str3, this.h))) {
            return android.net.Uri.parse("file://" + fileA.getAbsolutePath());
        }
        return null;
    }

    protected com.applovin.impl.f1 b(java.lang.String str, com.applovin.impl.f1.a aVar) {
        return a(str, this.h.Y(), true, aVar);
    }

    java.lang.String a(java.lang.String str, java.util.List list, com.applovin.impl.sdk.ad.b bVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        if (!((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.E0)).booleanValue()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Resource caching is disabled, skipping cache...");
            }
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        boolean zM0 = bVar.M0();
        java.util.List listX = bVar.X();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            int iIndexOf = 0;
            int i = 0;
            while (iIndexOf < sb.length()) {
                if (l()) {
                    return str;
                }
                iIndexOf = sb.indexOf(str2, i);
                if (iIndexOf == -1) {
                    break;
                }
                int length = sb.length();
                int i2 = iIndexOf;
                while (!this.l.contains(java.lang.Character.valueOf(sb.charAt(i2))) && i2 < length) {
                    i2++;
                }
                if (i2 > iIndexOf && i2 != length) {
                    java.lang.String strSubstring = sb.substring(str2.length() + iIndexOf, i2);
                    if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strSubstring)) {
                        if (zM0 && bVar.Q().equals(str2 + strSubstring)) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.c.a(this.b, "Postponing caching for \"" + strSubstring + "\" video resource");
                            }
                        } else {
                            android.net.Uri uriA = a(str2, strSubstring);
                            if (uriA != null) {
                                sb.replace(iIndexOf, i2, uriA.toString());
                                bVar.a(uriA);
                                this.i.d();
                            } else {
                                java.lang.String str3 = str2 + strSubstring;
                                if (listX.contains(str3)) {
                                    a(com.applovin.sdk.AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                                    this.m = true;
                                }
                                this.i.c();
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.c.b(this.b, "Failed to cache HTML Resource: " + str3);
                                }
                                this.f1547a.D().a(com.applovin.impl.ka.Q, "cacheHtmlResource", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("url", str3));
                            }
                        }
                    } else if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.b, "Skip caching of non-resource " + strSubstring);
                    }
                    i = i2;
                } else {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.b(this.b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return str;
                }
            }
        }
        return sb.toString();
    }

    android.net.Uri a(java.lang.String str, java.util.List list, boolean z) {
        try {
            java.lang.String strA = this.k.a(a(), str, this.h.getCachePrefix(), list, z, this.i, this.f1547a.A().a(str, this.h));
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
                java.io.File fileA = this.k.a(strA, a());
                if (fileA != null) {
                    android.net.Uri uriFromFile = android.net.Uri.fromFile(fileA);
                    if (uriFromFile != null) {
                        return uriFromFile;
                    }
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.b(this.b, "Unable to extract Uri from image file");
                    }
                    this.f1547a.D().a(com.applovin.impl.ka.Q, "extractUriFromImageFile", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("url", strA));
                    return null;
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.b(this.b, "Unable to retrieve File from cached image filename = " + strA);
                }
                this.f1547a.D().a(com.applovin.impl.ka.Q, "retrieveImageFile", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("url", strA));
                return null;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Failed to cache image: " + str);
            }
            this.f1547a.D().a(com.applovin.impl.ka.Q, "cacheImageResource", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("url", str));
            return null;
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Failed to cache image at url = " + str, th);
            }
            this.f1547a.D().a(this.b, "cacheImageResource", th, com.applovin.impl.sdk.utils.CollectionUtils.hashMap("url", str));
            return null;
        }
    }

    protected android.net.Uri a(android.net.Uri uri, java.lang.String str) {
        if (uri == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "No " + str + " image to cache");
            }
            return null;
        }
        java.lang.String string = uri.toString();
        if (android.text.TextUtils.isEmpty(string)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Caching " + str + " image...");
        }
        return b(string);
    }

    void a(com.applovin.impl.sdk.ad.b bVar) {
        java.lang.String strA = a(bVar.i0(), bVar.j0(), bVar.R0(), bVar.Y(), bVar.d1());
        if (bVar.Q0() && com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
            java.lang.String strA2 = a(strA, bVar.Y(), bVar);
            bVar.a(strA2);
            this.c.f(this.b, "Ad updated with video button HTML assets cached = " + strA2);
        }
    }

    protected com.applovin.impl.f1 a(java.lang.String str, java.util.List list, boolean z, com.applovin.impl.f1.a aVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            if (!com.applovin.impl.sdk.n.a()) {
                return null;
            }
            this.c.a(this.b, "No video to cache, skipping...");
            return null;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Caching video " + str + "...");
        }
        return new com.applovin.impl.f1(str, this.h, list, z, this.i, this.f1547a, new com.applovin.impl.bm.c(aVar));
    }

    void a(int i) {
        if (this.j != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Calling back ad load failed with error code: " + i);
            }
            this.j.failedToReceiveAd(i);
            this.j = null;
        }
        g();
    }

    @Override // com.applovin.impl.ye.a
    public void a(com.applovin.impl.fe feVar) {
        if (feVar.R().equalsIgnoreCase(this.h.I())) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Updating flag for timeout...");
            }
            g();
        }
        this.f1547a.R().b(this);
    }

    java.lang.String a(java.lang.String str, java.lang.String str2, boolean z, java.util.List list, boolean z2) {
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str2)) {
            java.lang.String strA = a(str2, z, list, z2);
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
                return strA;
            }
            if (android.text.TextUtils.isEmpty(str)) {
                a(com.applovin.sdk.AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.b(this.b, "Could not retrieve HTML from: " + str2 + " and HTML source is invalid.");
                }
                this.f1547a.D().a(com.applovin.impl.ka.Q, "retrieveHtmlString", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("url", str2));
            }
        }
        return str;
    }

    private java.lang.String a(java.lang.String str, boolean z, java.util.List list, boolean z2) {
        if (z) {
            return b(str, list, z2);
        }
        return d(str, list, z2);
    }

    protected com.applovin.impl.f1 a(java.lang.String str, com.applovin.impl.f1.a aVar) {
        return new com.applovin.impl.f1(str, this.h, this.i, this.f1547a, aVar);
    }

    protected com.applovin.impl.e1 a(java.lang.String str, java.util.List list, com.applovin.impl.bm.e eVar) {
        return new com.applovin.impl.e1(str, this.h, list, this.i, this.o, this.f1547a, new com.applovin.impl.bm.d(eVar));
    }
}
