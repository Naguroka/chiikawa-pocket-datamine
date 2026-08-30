package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
class t {

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.media.AudioManager f3351a;

        a(android.media.AudioManager audioManager) {
            this.f3351a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.sdk.controller.t.a(this.f3351a);
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.media.AudioManager f3352a;

        b(android.media.AudioManager audioManager) {
            this.f3352a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.sdk.controller.t.d(this.f3352a);
        }
    }

    t() {
    }

    public static void a(android.app.Activity activity) {
        com.json.cg.f2559a.b(new com.ironsource.sdk.controller.t.a((android.media.AudioManager) activity.getSystemService("audio")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(android.media.AudioManager audioManager) {
        try {
            audioManager.abandonAudioFocus(null);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(th.toString());
        }
    }

    public static void b(android.app.Activity activity) {
        com.json.cg.f2559a.b(new com.ironsource.sdk.controller.t.b((android.media.AudioManager) activity.getSystemService("audio")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(android.media.AudioManager audioManager) {
        try {
            audioManager.requestAudioFocus(null, 3, 2);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(th.toString());
        }
    }
}
