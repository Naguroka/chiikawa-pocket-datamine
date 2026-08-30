package com.apm.insight.runtime.a;

/* JADX INFO: compiled from: BatteryWatcher.java */
/* JADX INFO: loaded from: classes3.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f469a;

    d(final android.content.Context context) {
        com.apm.insight.runtime.n.a().a(new java.lang.Runnable() { // from class: com.apm.insight.runtime.a.d.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    context.registerReceiver(new com.apm.insight.runtime.a.d.a(com.apm.insight.runtime.a.d.this, (byte) 0), new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
                } catch (java.lang.Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                }
            }
        });
    }

    public final int a() {
        return this.f469a;
    }

    /* JADX INFO: compiled from: BatteryWatcher.java */
    class a extends android.content.BroadcastReceiver {
        private a() {
        }

        /* synthetic */ a(com.apm.insight.runtime.a.d dVar, byte b) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(android.content.Context context, android.content.Intent intent) {
            try {
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    com.apm.insight.runtime.a.d.this.f469a = (int) ((intent.getIntExtra("level", 0) * 100.0f) / intent.getIntExtra("scale", 100));
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
