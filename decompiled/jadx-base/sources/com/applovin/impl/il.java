package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class il {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f894a;
    private final android.os.Handler b;
    private final com.applovin.impl.il.b c;
    private final android.media.AudioManager d;
    private com.applovin.impl.il.c e;
    private int f;
    private int g;
    private boolean h;

    public interface b {
        void a(int i, boolean z);

        void d(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(com.applovin.impl.il ilVar) {
        ilVar.d();
    }

    public il(android.content.Context context, android.os.Handler handler, com.applovin.impl.il.b bVar) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f894a = applicationContext;
        this.b = handler;
        this.c = bVar;
        android.media.AudioManager audioManager = (android.media.AudioManager) com.applovin.impl.b1.b((android.media.AudioManager) applicationContext.getSystemService("audio"));
        this.d = audioManager;
        this.f = 3;
        this.g = b(audioManager, 3);
        this.h = a(audioManager, this.f);
        com.applovin.impl.il.c cVar = new com.applovin.impl.il.c();
        try {
            applicationContext.registerReceiver(cVar, new android.content.IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.e = cVar;
        } catch (java.lang.RuntimeException e) {
            com.applovin.impl.oc.c("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    public int a() {
        return this.d.getStreamMaxVolume(this.f);
    }

    public void c() {
        com.applovin.impl.il.c cVar = this.e;
        if (cVar != null) {
            try {
                this.f894a.unregisterReceiver(cVar);
            } catch (java.lang.RuntimeException e) {
                com.applovin.impl.oc.c("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int iB = b(this.d, this.f);
        boolean zA = a(this.d, this.f);
        if (this.g == iB && this.h == zA) {
            return;
        }
        this.g = iB;
        this.h = zA;
        this.c.a(iB, zA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c extends android.content.BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            android.os.Handler handler = com.applovin.impl.il.this.b;
            final com.applovin.impl.il ilVar = com.applovin.impl.il.this;
            handler.post(new java.lang.Runnable() { // from class: com.applovin.impl.il$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.applovin.impl.il.b(ilVar);
                }
            });
        }
    }

    private static int b(android.media.AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (java.lang.RuntimeException e) {
            com.applovin.impl.oc.c("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public void a(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        d();
        this.c.d(i);
    }

    public int b() {
        if (com.applovin.impl.xp.f1515a >= 28) {
            return this.d.getStreamMinVolume(this.f);
        }
        return 0;
    }

    private static boolean a(android.media.AudioManager audioManager, int i) {
        if (com.applovin.impl.xp.f1515a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return b(audioManager, i) == 0;
    }
}
