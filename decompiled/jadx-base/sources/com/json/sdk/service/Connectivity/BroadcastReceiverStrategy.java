package com.json.sdk.service.Connectivity;

/* JADX INFO: loaded from: classes5.dex */
public class BroadcastReceiverStrategy implements com.json.df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.ef f3400a;
    private android.content.BroadcastReceiver b = new android.content.BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            java.lang.String strB = com.json.v8.b(context);
            if (strB.equals("none")) {
                com.json.sdk.service.Connectivity.BroadcastReceiverStrategy.this.f3400a.a();
            } else {
                com.json.sdk.service.Connectivity.BroadcastReceiverStrategy.this.f3400a.a(strB, new org.json.JSONObject());
            }
        }
    };

    public BroadcastReceiverStrategy(com.json.ef efVar) {
        this.f3400a = efVar;
    }

    @Override // com.json.df
    public void a() {
        this.b = null;
    }

    @Override // com.json.df
    public void a(android.content.Context context) {
        try {
            context.unregisterReceiver(this.b);
        } catch (java.lang.IllegalArgumentException e) {
            com.json.l9.d().a(e);
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            android.util.Log.e("ContentValues", "unregisterConnectionReceiver - " + e2);
        }
    }

    @Override // com.json.df
    public void b(android.content.Context context) {
        try {
            context.registerReceiver(this.b, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // com.json.df
    public org.json.JSONObject c(android.content.Context context) {
        return new org.json.JSONObject();
    }
}
