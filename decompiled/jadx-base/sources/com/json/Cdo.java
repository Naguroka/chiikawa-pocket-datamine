package com.json;

/* JADX INFO: renamed from: com.ironsource.do, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public class Cdo {
    public static final java.lang.String d = "Ironsrc";
    public static final java.lang.String e = "7";
    public static final java.lang.String f = com.iab.omid.library.ironsrc.Omid.getVersion();
    public static final java.lang.String g = "omidVersion";
    public static final java.lang.String h = "omidPartnerName";
    public static final java.lang.String i = "omidPartnerVersion";
    public static final java.lang.String j = "omidActiveAdSessions";
    private static final java.lang.String k = "Invalid OMID impressionOwner";
    private static final java.lang.String l = "Invalid OMID videoEventsOwner";
    private static final java.lang.String m = "Missing OMID impressionOwner";
    private static final java.lang.String n = "Missing OMID videoEventsOwner";
    private static final java.lang.String o = "OMID has not been activated";
    private static final java.lang.String p = "Missing OMID creativeType";
    private static final java.lang.String q = "Missing adview id in OMID params";
    private static final java.lang.String r = "No adview found with the provided adViewId";
    private static final java.lang.String s = "OMID Session has already started";
    private static final java.lang.String t = "OMID Session has not started";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.adsession.Partner f2588a = com.iab.omid.library.ironsrc.adsession.Partner.createPartner(d, e);
    private boolean c = false;
    private final java.util.HashMap<java.lang.String, com.iab.omid.library.ironsrc.adsession.AdSession> b = new java.util.HashMap<>();

    /* JADX INFO: renamed from: com.ironsource.do$a */
    static class a {
        private static final java.lang.String i = "isolateVerificationScripts";
        private static final java.lang.String j = "impressionOwner";
        private static final java.lang.String k = "videoEventsOwner";
        private static final java.lang.String l = "customReferenceData";
        private static final java.lang.String m = "creativeType";
        private static final java.lang.String n = "impressionType";
        public static final java.lang.String o = "adViewId";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2589a;
        public com.iab.omid.library.ironsrc.adsession.Owner b;
        public com.iab.omid.library.ironsrc.adsession.Owner c;
        public java.lang.String d;
        public com.iab.omid.library.ironsrc.adsession.ImpressionType e;
        public com.iab.omid.library.ironsrc.adsession.CreativeType f;
        public java.lang.String g;
        public com.iab.omid.library.ironsrc.adsession.Owner h;

        public static com.json.Cdo.a a(org.json.JSONObject jSONObject) throws java.lang.IllegalArgumentException {
            com.json.Cdo.a aVar = new com.json.Cdo.a();
            aVar.f2589a = jSONObject.optBoolean("isolateVerificationScripts", false);
            java.lang.String strOptString = jSONObject.optString("impressionOwner", "");
            if (android.text.TextUtils.isEmpty(strOptString)) {
                throw new java.lang.IllegalArgumentException(com.json.Cdo.m);
            }
            try {
                aVar.b = com.iab.omid.library.ironsrc.adsession.Owner.valueOf(strOptString.toUpperCase(java.util.Locale.getDefault()));
                java.lang.String strOptString2 = jSONObject.optString("videoEventsOwner", "");
                if (android.text.TextUtils.isEmpty(strOptString)) {
                    throw new java.lang.IllegalArgumentException(com.json.Cdo.n);
                }
                try {
                    aVar.c = com.iab.omid.library.ironsrc.adsession.Owner.valueOf(strOptString2.toUpperCase(java.util.Locale.getDefault()));
                    aVar.d = jSONObject.optString("customReferenceData", "");
                    aVar.f = b(jSONObject);
                    aVar.e = c(jSONObject);
                    aVar.g = e(jSONObject);
                    aVar.h = d(jSONObject);
                    return aVar;
                } catch (java.lang.IllegalArgumentException e) {
                    com.json.l9.d().a(e);
                    throw new java.lang.IllegalArgumentException("Invalid OMID videoEventsOwner " + strOptString2);
                }
            } catch (java.lang.IllegalArgumentException e2) {
                com.json.l9.d().a(e2);
                throw new java.lang.IllegalArgumentException("Invalid OMID impressionOwner " + strOptString);
            }
        }

        private static com.iab.omid.library.ironsrc.adsession.CreativeType b(org.json.JSONObject jSONObject) throws java.lang.IllegalArgumentException {
            java.lang.String strOptString = jSONObject.optString("creativeType", "");
            if (android.text.TextUtils.isEmpty(strOptString)) {
                throw new java.lang.IllegalArgumentException(com.json.Cdo.p + strOptString);
            }
            for (com.iab.omid.library.ironsrc.adsession.CreativeType creativeType : com.iab.omid.library.ironsrc.adsession.CreativeType.values()) {
                if (strOptString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            throw new java.lang.IllegalArgumentException(com.json.Cdo.p + strOptString);
        }

        private static com.iab.omid.library.ironsrc.adsession.ImpressionType c(org.json.JSONObject jSONObject) throws java.lang.IllegalArgumentException {
            java.lang.String strOptString = jSONObject.optString("impressionType", "");
            if (android.text.TextUtils.isEmpty(strOptString)) {
                throw new java.lang.IllegalArgumentException(com.json.Cdo.p + strOptString);
            }
            for (com.iab.omid.library.ironsrc.adsession.ImpressionType impressionType : com.iab.omid.library.ironsrc.adsession.ImpressionType.values()) {
                if (strOptString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            throw new java.lang.IllegalArgumentException(com.json.Cdo.p + strOptString);
        }

        private static com.iab.omid.library.ironsrc.adsession.Owner d(org.json.JSONObject jSONObject) throws java.lang.IllegalArgumentException {
            java.lang.String strOptString = jSONObject.optString("videoEventsOwner", "");
            com.iab.omid.library.ironsrc.adsession.Owner owner = com.iab.omid.library.ironsrc.adsession.Owner.NONE;
            try {
                return com.iab.omid.library.ironsrc.adsession.Owner.valueOf(strOptString.toUpperCase(java.util.Locale.getDefault()));
            } catch (java.lang.IllegalArgumentException e) {
                com.json.l9.d().a(e);
                return owner;
            }
        }

        private static java.lang.String e(org.json.JSONObject jSONObject) throws java.lang.IllegalArgumentException {
            java.lang.String strOptString = jSONObject.optString("adViewId", "");
            if (android.text.TextUtils.isEmpty(strOptString)) {
                throw new java.lang.IllegalArgumentException(com.json.Cdo.q + strOptString);
            }
            return strOptString;
        }
    }

    private com.iab.omid.library.ironsrc.adsession.AdSession a(com.json.Cdo.a aVar, com.json.qh qhVar) throws java.lang.IllegalArgumentException {
        com.iab.omid.library.ironsrc.adsession.AdSession adSessionCreateAdSession = com.iab.omid.library.ironsrc.adsession.AdSession.createAdSession(com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration.createAdSessionConfiguration(aVar.f, aVar.e, aVar.b, aVar.c, aVar.f2589a), com.iab.omid.library.ironsrc.adsession.AdSessionContext.createHtmlAdSessionContext(this.f2588a, qhVar.getPresentingView(), null, aVar.d));
        adSessionCreateAdSession.registerAdView(qhVar.getPresentingView());
        return adSessionCreateAdSession;
    }

    private void a(org.json.JSONObject jSONObject) throws java.lang.IllegalStateException {
        if (!this.c) {
            throw new java.lang.IllegalStateException(o);
        }
        if (jSONObject == null) {
            throw new java.lang.IllegalStateException(t);
        }
    }

    public com.json.br a() {
        com.json.br brVar = new com.json.br();
        brVar.b(g, com.json.sdk.utils.SDKUtils.encodeString(f));
        brVar.b(h, com.json.sdk.utils.SDKUtils.encodeString(d));
        brVar.b(i, com.json.sdk.utils.SDKUtils.encodeString(e));
        brVar.b(j, com.json.sdk.utils.SDKUtils.encodeString(java.util.Arrays.toString(this.b.keySet().toArray())));
        return brVar;
    }

    public void a(android.content.Context context) throws java.lang.IllegalArgumentException {
        if (this.c) {
            return;
        }
        com.iab.omid.library.ironsrc.Omid.activate(context);
        this.c = true;
    }

    public void a(com.json.Cdo.a aVar) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException {
        if (!this.c) {
            throw new java.lang.IllegalStateException(o);
        }
        if (android.text.TextUtils.isEmpty(aVar.g)) {
            throw new java.lang.IllegalStateException(q);
        }
        java.lang.String str = aVar.g;
        if (this.b.containsKey(str)) {
            throw new java.lang.IllegalStateException(s);
        }
        com.json.qh qhVarA = com.json.wg.a().a(str);
        if (qhVarA == null) {
            throw new java.lang.IllegalStateException(r);
        }
        com.iab.omid.library.ironsrc.adsession.AdSession adSessionA = a(aVar, qhVarA);
        adSessionA.start();
        this.b.put(str, adSessionA);
    }

    public void b(org.json.JSONObject jSONObject) throws java.lang.IllegalStateException {
        a(jSONObject);
        java.lang.String strOptString = jSONObject.optString("adViewId");
        com.iab.omid.library.ironsrc.adsession.AdSession adSession = this.b.get(strOptString);
        if (adSession == null) {
            throw new java.lang.IllegalStateException(t);
        }
        adSession.finish();
        this.b.remove(strOptString);
    }

    public void c(org.json.JSONObject jSONObject) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException {
        a(jSONObject);
        com.iab.omid.library.ironsrc.adsession.AdSession adSession = this.b.get(jSONObject.optString("adViewId"));
        if (adSession == null) {
            throw new java.lang.IllegalStateException(t);
        }
        com.iab.omid.library.ironsrc.adsession.AdEvents adEventsCreateAdEvents = com.iab.omid.library.ironsrc.adsession.AdEvents.createAdEvents(adSession);
        if (jSONObject.optBoolean("signalLoaded")) {
            adEventsCreateAdEvents.loaded();
        }
        adEventsCreateAdEvents.impressionOccurred();
    }

    public void d(org.json.JSONObject jSONObject) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException {
        a(com.json.Cdo.a.a(jSONObject));
    }
}
