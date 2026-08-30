package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f1004a;
    private final com.applovin.impl.m1.a b;
    private boolean c;

    public interface b {
        void c();
    }

    public m1(android.content.Context context, android.os.Handler handler, com.applovin.impl.m1.b bVar) {
        this.f1004a = context.getApplicationContext();
        this.b = new com.applovin.impl.m1.a(handler, bVar);
    }

    private final class a extends android.content.BroadcastReceiver implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.m1.b f1005a;
        private final android.os.Handler b;

        public a(android.os.Handler handler, com.applovin.impl.m1.b bVar) {
            this.b = handler;
            this.f1005a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.m1.this.c) {
                this.f1005a.c();
            }
        }
    }

    public void a(boolean z) {
        if (z && !this.c) {
            this.f1004a.registerReceiver(this.b, new android.content.IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.c = true;
        } else {
            if (z || !this.c) {
                return;
            }
            this.f1004a.unregisterReceiver(this.b);
            this.c = false;
        }
    }
}
