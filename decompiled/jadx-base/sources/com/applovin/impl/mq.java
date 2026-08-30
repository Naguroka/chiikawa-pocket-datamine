package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.text.DateFormat f1077a = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", java.util.Locale.US);
    private static final java.util.Random b = new java.util.Random(java.lang.System.currentTimeMillis());

    public static com.applovin.impl.fq c(com.applovin.impl.aq aqVar) {
        if (b(aqVar) || a(aqVar)) {
            return null;
        }
        return com.applovin.impl.fq.GENERAL_WRAPPER_ERROR;
    }

    public static boolean b(com.applovin.impl.aq aqVar) {
        com.applovin.impl.nq nqVarV1;
        java.util.List listG;
        return (aqVar == null || (nqVarV1 = aqVar.v1()) == null || (listG = nqVarV1.g()) == null || listG.isEmpty()) ? false : true;
    }

    public static boolean b(com.applovin.impl.es esVar) {
        if (esVar != null) {
            return esVar.b("Wrapper") != null;
        }
        throw new java.lang.IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    private static java.lang.String b() {
        java.text.DateFormat dateFormat = f1077a;
        dateFormat.setTimeZone(java.util.TimeZone.getDefault());
        return dateFormat.format(new java.util.Date());
    }

    private static java.util.Set a(java.util.Set set, java.util.List list, com.applovin.impl.eq eqVar, com.applovin.impl.sdk.j jVar) {
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.applovin.impl.kq kqVarA = com.applovin.impl.kq.a((com.applovin.impl.es) it.next(), eqVar, jVar);
                if (kqVarA != null) {
                    set.add(kqVarA);
                }
            }
        }
        return set;
    }

    public static java.lang.String a(com.applovin.impl.es esVar, java.lang.String str, java.lang.String str2) {
        com.applovin.impl.es esVarC = esVar.c(str);
        if (esVarC != null) {
            java.lang.String strD = esVarC.d();
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strD)) {
                return strD;
            }
        }
        return str2;
    }

    public static void a(java.util.Set set, long j, android.net.Uri uri, com.applovin.impl.fq fqVar, com.applovin.impl.sdk.j jVar) {
        if (jVar != null) {
            if (set == null || set.isEmpty()) {
                return;
            }
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                android.net.Uri uriA = a(((com.applovin.impl.kq) it.next()).c(), j, uri, fqVar, jVar);
                if (uriA != null) {
                    jVar.W().a(com.applovin.impl.sdk.network.d.b().d(uriA.toString()).a(false).a(), false);
                }
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Unable to fire trackers. No sdk specified.");
    }

    public static void a(java.util.Set set, com.applovin.impl.fq fqVar, com.applovin.impl.sdk.j jVar) {
        a(set, -1L, (android.net.Uri) null, fqVar, jVar);
    }

    public static void a(java.util.Set set, com.applovin.impl.sdk.j jVar) {
        a(set, -1L, (android.net.Uri) null, com.applovin.impl.fq.UNSPECIFIED, jVar);
    }

    private static java.lang.String a(long j) {
        if (j <= 0) {
            return "00:00:00.000";
        }
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        long hours = timeUnit.toHours(j);
        long minutes = timeUnit.toMinutes(j);
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MINUTES;
        return java.lang.String.format(java.util.Locale.US, "%02d:%02d:%02d.000", java.lang.Long.valueOf(hours), java.lang.Long.valueOf(minutes % timeUnit2.toSeconds(1L)), java.lang.Long.valueOf(j % timeUnit2.toSeconds(1L)));
    }

    public static java.lang.String a(com.applovin.impl.eq eqVar) {
        com.applovin.impl.es esVarB;
        if (eqVar != null) {
            java.util.List listA = eqVar.a();
            int size = eqVar.a().size();
            if (size <= 0 || (esVarB = ((com.applovin.impl.es) listA.get(size - 1)).b("VASTAdTagURI")) == null) {
                return null;
            }
            return esVarB.d();
        }
        throw new java.lang.IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static void a(com.applovin.impl.eq eqVar, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.fq fqVar, int i, com.applovin.impl.sdk.j jVar) {
        if (jVar != null) {
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
            }
            a(a(eqVar, jVar), fqVar, jVar);
            return;
        }
        throw new java.lang.IllegalArgumentException("Unable to handle failure. No sdk specified.");
    }

    public static boolean a(com.applovin.impl.aq aqVar) {
        com.applovin.impl.dq dqVarL1;
        com.applovin.impl.iq iqVarE;
        if (aqVar == null || (dqVarL1 = aqVar.l1()) == null || (iqVarE = dqVarL1.e()) == null) {
            return false;
        }
        return iqVarE.c() != null || com.applovin.impl.sdk.utils.StringUtils.isValidString(iqVarE.b());
    }

    public static boolean a(com.applovin.impl.es esVar) {
        if (esVar != null) {
            return esVar.b("InLine") != null;
        }
        throw new java.lang.IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static void a(com.applovin.impl.es esVar, java.util.Map map, com.applovin.impl.eq eqVar, com.applovin.impl.sdk.j jVar) {
        java.util.List<com.applovin.impl.es> listA;
        if (jVar == null) {
            throw new java.lang.IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (esVar == null) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("VastUtils", "Unable to render event trackers; null node provided");
                return;
            }
            return;
        }
        if (map == null) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("VastUtils", "Unable to render event trackers; null event trackers provided");
                return;
            }
            return;
        }
        com.applovin.impl.es esVarC = esVar.c("TrackingEvents");
        if (esVarC == null || (listA = esVarC.a("Tracking")) == null) {
            return;
        }
        for (com.applovin.impl.es esVar2 : listA) {
            java.lang.String str = (java.lang.String) esVar2.a().get(androidx.core.app.NotificationCompat.CATEGORY_EVENT);
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
                com.applovin.impl.kq kqVarA = com.applovin.impl.kq.a(esVar2, eqVar, jVar);
                if (kqVarA != null) {
                    java.util.Set set = (java.util.Set) map.get(str);
                    if (set != null) {
                        set.add(kqVarA);
                    } else {
                        java.util.HashSet hashSet = new java.util.HashSet();
                        hashSet.add(kqVarA);
                        map.put(str, hashSet);
                    }
                }
            } else {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().b("VastUtils", "Could not find event for tracking node = " + esVar2);
                }
            }
        }
    }

    public static void a(java.util.List list, java.util.Set set, com.applovin.impl.eq eqVar, com.applovin.impl.sdk.j jVar) {
        if (jVar == null) {
            throw new java.lang.IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("VastUtils", "Unable to render trackers; null nodes provided");
                return;
            }
            return;
        }
        if (set == null) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("VastUtils", "Unable to render trackers; null trackers provided");
                return;
            }
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.applovin.impl.kq kqVarA = com.applovin.impl.kq.a((com.applovin.impl.es) it.next(), eqVar, jVar);
            if (kqVarA != null) {
                set.add(kqVarA);
            }
        }
    }

    public static android.net.Uri a(java.lang.String str, long j, android.net.Uri uri, com.applovin.impl.fq fqVar, com.applovin.impl.sdk.j jVar) {
        if (android.webkit.URLUtil.isValidUrl(str)) {
            try {
                java.lang.String string = java.lang.Integer.toString(fqVar.b());
                java.lang.String strReplace = str.replace("[ERRORCODE]", string).replace("[REASON]", string);
                if (j >= 0) {
                    strReplace = strReplace.replace("[CONTENTPLAYHEAD]", a(j));
                }
                if (uri != null) {
                    strReplace = strReplace.replace("[ASSETURI]", uri.toString());
                }
                return android.net.Uri.parse(strReplace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
            } catch (java.lang.Throwable th) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("VastUtils", "Unable to replace macros in URL string " + str, th);
                }
                jVar.D().a("VastUtils", th);
                return null;
            }
        }
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.I().b("VastUtils", "Unable to replace macros in invalid URL string.");
        }
        return null;
    }

    private static java.util.Set a(com.applovin.impl.eq eqVar, com.applovin.impl.sdk.j jVar) {
        if (eqVar == null) {
            return null;
        }
        java.util.List<com.applovin.impl.es> listA = eqVar.a();
        java.util.Set hashSet = new java.util.HashSet(listA.size());
        for (com.applovin.impl.es esVar : listA) {
            com.applovin.impl.es esVarB = esVar.b("Wrapper");
            if (esVarB == null) {
                esVarB = esVar.b("InLine");
            }
            if (esVarB != null) {
                hashSet = a(hashSet, esVarB.a("Error"), eqVar, jVar);
            } else {
                hashSet = a(hashSet, esVar.a("Error"), eqVar, jVar);
            }
        }
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.I().a("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    private static java.lang.String a() {
        return java.lang.Integer.toString(b.nextInt(89999999) + 10000000);
    }
}
