package com.json.environment;

/* JADX INFO: loaded from: classes5.dex */
public class NetworkStateReceiver extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.net.ConnectivityManager f2623a;
    private com.json.zn b;
    private boolean c = false;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.environment.NetworkStateReceiver.this.b != null) {
                com.json.environment.NetworkStateReceiver.this.b.a(com.json.environment.NetworkStateReceiver.this.c);
            }
        }
    }

    public NetworkStateReceiver(android.content.Context context, com.json.zn znVar) {
        this.b = znVar;
        if (context != null) {
            this.f2623a = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }

    private boolean a() {
        boolean z = this.c;
        android.net.ConnectivityManager connectivityManager = this.f2623a;
        if (connectivityManager != null) {
            try {
                android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                this.c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                this.c = false;
            }
        } else {
            this.c = false;
        }
        return z != this.c;
    }

    private void b() {
        com.json.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new com.ironsource.environment.NetworkStateReceiver.a());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }
}
