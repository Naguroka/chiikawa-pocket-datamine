package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e5 {

    class a implements com.google.android.gms.tasks.OnSuccessListener {
        a() {
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(com.google.android.gms.appset.AppSetIdInfo appSetIdInfo) {
            com.applovin.impl.sdk.k.a(new com.applovin.impl.sdk.k.b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
        }
    }

    public static void a(final android.content.Context context) {
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.applovin.impl.e5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.e5.b(context);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(android.content.Context context) {
        com.applovin.impl.sdk.k.a(com.applovin.impl.l0.b(context));
        if (com.applovin.impl.yp.a("com.google.android.gms.appset.AppSet")) {
            try {
                com.google.android.gms.appset.AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new com.applovin.impl.e5.a());
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
