package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class t0 {
    private static com.applovin.impl.t0 e;
    private static final java.lang.Object f = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Bundle f1344a;
    private final int b;
    private final boolean c;
    private final java.lang.String d;

    private t0(android.content.Context context) throws java.lang.Throwable {
        android.os.Bundle bundle;
        int iIntValue;
        java.lang.String str = null;
        str = null;
        try {
            try {
                android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                bundle = applicationInfo.metaData;
                try {
                    java.lang.String str2 = applicationInfo.processName;
                    this.f1344a = bundle;
                    this.d = str2;
                } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                    e = e2;
                    com.applovin.impl.sdk.n.c("AndroidManifest", "Failed to get meta data.", e);
                    this.f1344a = bundle;
                    this.d = null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                this.f1344a = bundle;
                this.d = str;
                throw th;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
            e = e3;
            bundle = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            bundle = null;
            this.f1344a = bundle;
            this.d = str;
            throw th;
        }
        str = null;
        boolean z = false;
        try {
            android.content.res.XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            int eventType = xmlResourceParserOpenXmlResourceParser.getEventType();
            iIntValue = 0;
            boolean zBooleanValue = false;
            do {
                if (2 == eventType) {
                    try {
                        if (xmlResourceParserOpenXmlResourceParser.getName().equals("application")) {
                            for (int i = 0; i < xmlResourceParserOpenXmlResourceParser.getAttributeCount(); i++) {
                                java.lang.String attributeName = xmlResourceParserOpenXmlResourceParser.getAttributeName(i);
                                java.lang.String attributeValue = xmlResourceParserOpenXmlResourceParser.getAttributeValue(i);
                                if (attributeName.equals("networkSecurityConfig")) {
                                    iIntValue = java.lang.Integer.valueOf(attributeValue.substring(1)).intValue();
                                } else if (attributeName.equals("usesCleartextTraffic")) {
                                    zBooleanValue = java.lang.Boolean.valueOf(attributeValue).booleanValue();
                                }
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        z = zBooleanValue;
                        try {
                            com.applovin.impl.sdk.n.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                            return;
                        } finally {
                            this.b = iIntValue;
                            this.c = z;
                        }
                    }
                }
                eventType = xmlResourceParserOpenXmlResourceParser.next();
            } while (eventType != 1);
            this.b = iIntValue;
            this.c = zBooleanValue;
        } catch (java.lang.Throwable th4) {
            th = th4;
            iIntValue = 0;
        }
    }

    public boolean a(java.lang.String str, boolean z) {
        android.os.Bundle bundle = this.f1344a;
        return bundle != null ? bundle.getBoolean(str, z) : z;
    }

    public java.lang.String a(java.lang.String str, java.lang.String str2) {
        android.os.Bundle bundle = this.f1344a;
        return bundle != null ? bundle.getString(str, str2) : str2;
    }

    public java.lang.String a() {
        return this.d;
    }

    public boolean a(java.lang.String str) {
        android.os.Bundle bundle = this.f1344a;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public static com.applovin.impl.t0 a(android.content.Context context) {
        com.applovin.impl.t0 t0Var;
        synchronized (f) {
            if (e == null) {
                e = new com.applovin.impl.t0(context);
            }
            t0Var = e;
        }
        return t0Var;
    }
}
