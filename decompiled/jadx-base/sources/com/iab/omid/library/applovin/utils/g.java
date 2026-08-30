package com.iab.omid.library.applovin.utils;

/* JADX INFO: loaded from: classes5.dex */
public class g {
    public static void a() {
        if (!com.iab.omid.library.applovin.Omid.isActive()) {
            throw new java.lang.IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void b(com.iab.omid.library.applovin.adsession.a aVar) {
        if (aVar.g()) {
            throw new java.lang.IllegalStateException("AdSession is finished");
        }
    }

    public static void c(com.iab.omid.library.applovin.adsession.a aVar) {
        if (aVar.j()) {
            throw new java.lang.IllegalStateException("AdSession is started");
        }
    }

    private static void d(com.iab.omid.library.applovin.adsession.a aVar) {
        if (!aVar.j()) {
            throw new java.lang.IllegalStateException("AdSession is not started");
        }
    }

    public static void e(com.iab.omid.library.applovin.adsession.a aVar) {
        if (!aVar.h()) {
            throw new java.lang.IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void f(com.iab.omid.library.applovin.adsession.a aVar) {
        if (!aVar.i()) {
            throw new java.lang.IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    public static void g(com.iab.omid.library.applovin.adsession.a aVar) {
        if (aVar.getAdSessionStatePublisher().c() != null) {
            throw new java.lang.IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public static void h(com.iab.omid.library.applovin.adsession.a aVar) {
        if (aVar.getAdSessionStatePublisher().d() != null) {
            throw new java.lang.IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    public static void a(com.iab.omid.library.applovin.adsession.Owner owner, com.iab.omid.library.applovin.adsession.CreativeType creativeType, com.iab.omid.library.applovin.adsession.ImpressionType impressionType) {
        if (owner == com.iab.omid.library.applovin.adsession.Owner.NONE) {
            throw new java.lang.IllegalArgumentException("Impression owner is none");
        }
        if (creativeType == com.iab.omid.library.applovin.adsession.CreativeType.DEFINED_BY_JAVASCRIPT && owner == com.iab.omid.library.applovin.adsession.Owner.NATIVE) {
            throw new java.lang.IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (impressionType == com.iab.omid.library.applovin.adsession.ImpressionType.DEFINED_BY_JAVASCRIPT && owner == com.iab.omid.library.applovin.adsession.Owner.NATIVE) {
            throw new java.lang.IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public static void a(com.iab.omid.library.applovin.adsession.a aVar) {
        d(aVar);
        b(aVar);
    }

    public static void a(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static void a(java.lang.String str, int i, java.lang.String str2) {
        if (str.length() > i) {
            throw new java.lang.IllegalArgumentException(str2);
        }
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException(str2);
        }
    }
}
