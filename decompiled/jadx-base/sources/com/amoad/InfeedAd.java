package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public final class InfeedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f167a = 15000;
    private static final java.util.concurrent.ExecutorService b = java.util.concurrent.Executors.newSingleThreadExecutor();
    private static final java.util.Map<java.lang.String, java.lang.Integer> c = new java.util.HashMap();

    private InfeedAd() {
    }

    private static int a(java.lang.String str, int i) {
        java.util.Map<java.lang.String, java.lang.Integer> map = c;
        return map.containsKey(str) ? map.get(str).intValue() : i;
    }

    private static void a(android.content.Context context, final com.amoad.InfeedAdLoadListener infeedAdLoadListener, final com.amoad.AdResult adResult, final com.amoad.AdList adList) {
        if (infeedAdLoadListener != null) {
            com.amoad.bc.a(context, new java.lang.Runnable() { // from class: com.amoad.InfeedAd.2
                @Override // java.lang.Runnable
                public final void run() {
                    infeedAdLoadListener.onLoad(adList, adResult);
                }
            });
        }
    }

    static /* synthetic */ void a(android.content.Context context, java.lang.String str, com.amoad.InfeedAdLoadListener infeedAdLoadListener) {
        com.amoad.AdList adList;
        com.amoad.AdResult adResult;
        com.amoad.c cVarB = com.amoad.p.b(context);
        com.amoad.ak akVar = new com.amoad.ak(context, str, cVarB.b, cVarB.f299a, cVarB.c);
        akVar.f340a = f167a;
        akVar.b = f167a;
        java.lang.String strA = akVar.a();
        com.amoad.AMoAdLogger.getInstance().i(java.lang.String.format("AdCall[%s]", strA));
        com.amoad.s.c cVarA = com.amoad.s.a(akVar);
        if (cVarA instanceof com.amoad.al) {
            com.amoad.al alVar = (com.amoad.al) cVarA;
            int iA = a(java.lang.String.format("%s-beginIndex", str), alVar.e);
            int iA2 = a(java.lang.String.format("%s-interval", str), alVar.d);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<com.amoad.al.a> it = alVar.l.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.amoad.AdItem(it.next()));
            }
            adList = new com.amoad.AdList(arrayList, iA, iA2);
            com.amoad.AMoAdLogger.getInstance().i(java.lang.String.format("AdCall-success[%s]", strA));
            adResult = com.amoad.AdResult.Success;
        } else {
            boolean z = cVarA instanceof com.amoad.s.a;
            adList = null;
            if (z) {
                com.amoad.AMoAdLogger.getInstance().i(java.lang.String.format("AdCall-empty[%s]", strA));
                adResult = com.amoad.AdResult.Empty;
            } else {
                com.amoad.AMoAdLogger.getInstance().i(java.lang.String.format("AdCall-failure[%s]", strA));
                adResult = com.amoad.AdResult.Failure;
            }
        }
        a(context, infeedAdLoadListener, adResult, adList);
    }

    public static void load(android.content.Context context, java.lang.String str, com.amoad.InfeedAdLoadListener infeedAdLoadListener) {
        load(context, str, infeedAdLoadListener, null);
    }

    public static void load(final android.content.Context context, final java.lang.String str, final com.amoad.InfeedAdLoadListener infeedAdLoadListener, final java.util.Map<java.lang.String, java.lang.Object> map) {
        com.amoad.bc.a(b, new java.lang.Runnable() { // from class: com.amoad.InfeedAd.1
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.InfeedAd.a(context, str, infeedAdLoadListener);
            }
        });
    }

    public static void setNetworkTimeoutMillis(int i) {
        if (i > 0) {
            f167a = i;
        }
    }

    public static void setViewabilityTracking(android.view.ViewGroup viewGroup, com.amoad.AdItem adItem) {
        com.amoad.AdItem.a(viewGroup);
        if (adItem != null) {
            android.content.Context applicationContext = viewGroup.getContext().getApplicationContext();
            adItem.a(applicationContext);
            com.amoad.AdItem.a(applicationContext, viewGroup, adItem);
        }
    }
}
