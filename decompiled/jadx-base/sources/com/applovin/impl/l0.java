package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f970a = true;
    private static final java.lang.Object b = new java.lang.Object();
    private static final java.util.Collection c = new java.util.HashSet();
    private static boolean d = false;
    private static com.applovin.impl.l0.a e = null;

    private static com.applovin.impl.l0.a a(android.content.Context context) {
        com.applovin.impl.l0.a aVar;
        java.util.HashSet hashSet;
        com.applovin.impl.yp.a();
        java.lang.Object obj = b;
        synchronized (obj) {
            if (d) {
                return e;
            }
            java.util.Collection collection = c;
            boolean zIsEmpty = collection.isEmpty();
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            collection.add(countDownLatch);
            if (zIsEmpty) {
                com.applovin.impl.l0.a aVarC = c(context);
                synchronized (obj) {
                    d = true;
                    e = aVarC;
                    hashSet = new java.util.HashSet(collection);
                    collection.clear();
                }
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((java.util.concurrent.CountDownLatch) it.next()).countDown();
                }
            }
            try {
                if (!countDownLatch.await(60L, java.util.concurrent.TimeUnit.SECONDS)) {
                    com.applovin.impl.sdk.n.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                }
            } catch (java.lang.InterruptedException e2) {
                com.applovin.impl.sdk.n.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e2);
            }
            synchronized (b) {
                aVar = e;
            }
            return aVar;
        }
    }

    private static com.applovin.impl.l0.a collectFireOSAdvertisingInfo(android.content.Context context) {
        if (f970a) {
            try {
                android.content.ContentResolver contentResolver = context.getContentResolver();
                com.applovin.impl.l0.a aVar = new com.applovin.impl.l0.a();
                aVar.a(com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(android.provider.Settings.Secure.getString(contentResolver, "advertising_id")));
                boolean z = android.provider.Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                aVar.a(z);
                aVar.a(z ? com.applovin.impl.l0.a.EnumC0037a.ON : com.applovin.impl.l0.a.EnumC0037a.OFF);
                return aVar;
            } catch (android.provider.Settings.SettingNotFoundException e2) {
                com.applovin.impl.sdk.n.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e2);
            } catch (java.lang.Throwable th) {
                com.applovin.impl.sdk.n.c("DataCollector", "Unable to collect Fire OS IDFA", th);
            }
        }
        f970a = false;
        return null;
    }

    private static com.applovin.impl.l0.a collectGoogleAdvertisingInfo(android.content.Context context) {
        com.applovin.impl.yp.a();
        if (!a()) {
            if (com.applovin.sdk.AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.n.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        try {
            com.applovin.impl.l0.a aVar = new com.applovin.impl.l0.a();
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(context);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            aVar.a(zIsLimitAdTrackingEnabled);
            aVar.a(zIsLimitAdTrackingEnabled ? com.applovin.impl.l0.a.EnumC0037a.ON : com.applovin.impl.l0.a.EnumC0037a.OFF);
            aVar.a(advertisingIdInfo.getId());
            return aVar;
        } catch (java.lang.Throwable th) {
            if (com.applovin.sdk.AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.n.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
            return null;
        }
    }

    public static com.applovin.impl.l0.a b(android.content.Context context) {
        return a(context);
    }

    public static boolean a() {
        return com.applovin.impl.yp.a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    private static com.applovin.impl.l0.a c(android.content.Context context) {
        com.applovin.impl.l0.a aVarCollectGoogleAdvertisingInfo = collectGoogleAdvertisingInfo(context);
        if (aVarCollectGoogleAdvertisingInfo == null) {
            aVarCollectGoogleAdvertisingInfo = collectFireOSAdvertisingInfo(context);
        }
        return aVarCollectGoogleAdvertisingInfo == null ? new com.applovin.impl.l0.a() : aVarCollectGoogleAdvertisingInfo;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f971a;
        private java.lang.String b = "";
        private com.applovin.impl.l0.a.EnumC0037a c = com.applovin.impl.l0.a.EnumC0037a.NOT_SET;

        public java.lang.String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + c() + ", advertisingId=" + a() + ", dntCode=" + b() + ")";
        }

        protected boolean a(java.lang.Object obj) {
            return obj instanceof com.applovin.impl.l0.a;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.applovin.impl.l0.a)) {
                return false;
            }
            com.applovin.impl.l0.a aVar = (com.applovin.impl.l0.a) obj;
            if (!aVar.a(this) || c() != aVar.c()) {
                return false;
            }
            java.lang.String strA = a();
            java.lang.String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            com.applovin.impl.l0.a.EnumC0037a enumC0037aB = b();
            com.applovin.impl.l0.a.EnumC0037a enumC0037aB2 = aVar.b();
            return enumC0037aB != null ? enumC0037aB.equals(enumC0037aB2) : enumC0037aB2 == null;
        }

        public int hashCode() {
            int i = c() ? 79 : 97;
            java.lang.String strA = a();
            int iHashCode = ((i + 59) * 59) + (strA == null ? 43 : strA.hashCode());
            com.applovin.impl.l0.a.EnumC0037a enumC0037aB = b();
            return (iHashCode * 59) + (enumC0037aB != null ? enumC0037aB.hashCode() : 43);
        }

        /* JADX INFO: renamed from: com.applovin.impl.l0$a$a, reason: collision with other inner class name */
        public enum EnumC0037a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final java.lang.String f972a;

            EnumC0037a(java.lang.String str) {
                this.f972a = str;
            }

            public java.lang.String b() {
                return this.f972a;
            }
        }

        public boolean c() {
            return this.f971a;
        }

        public com.applovin.impl.l0.a.EnumC0037a b() {
            return this.c;
        }

        public java.lang.String a() {
            return this.b;
        }

        public void a(boolean z) {
            this.f971a = z;
        }

        public void a(java.lang.String str) {
            this.b = str;
        }

        public void a(com.applovin.impl.l0.a.EnumC0037a enumC0037a) {
            this.c = enumC0037a;
        }
    }
}
