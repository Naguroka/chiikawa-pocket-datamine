package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class kc {
    public static final int e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Runnable f2847a = new com.ironsource.kc.a();
    private int b;
    private com.json.o c;
    private com.json.tl d;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("loaded ads are expired");
            if (com.json.kc.this.c != null) {
                com.json.kc.this.c.a();
            }
        }
    }

    public kc(int i, com.json.o oVar) {
        this.c = oVar;
        this.b = i;
    }

    public void a() {
        if (!b() || this.d == null) {
            return;
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("canceling expiration timer");
        this.d.e();
        this.d = null;
    }

    public void a(long j) {
        if (b()) {
            long millis = java.util.concurrent.TimeUnit.MINUTES.toMillis(this.b) - java.lang.Math.max(j, 0L);
            if (millis <= 0) {
                com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.c.a();
                return;
            }
            a();
            this.d = new com.json.tl(millis, this.f2847a, true);
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.add(14, (int) millis);
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + java.lang.String.format(java.util.Locale.getDefault(), "%.2f", java.lang.Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }

    public boolean b() {
        return this.b > 0;
    }
}
