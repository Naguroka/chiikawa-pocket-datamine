package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class fn implements com.json.df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f2662a = "fn";
    private int b = 23;
    private final com.json.ef c;
    private android.net.ConnectivityManager.NetworkCallback d;

    class a extends android.net.ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f2663a;

        a(android.content.Context context) {
            this.f2663a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network network) {
            if (network != null) {
                com.json.fn.this.c.a(com.json.v8.a(network, this.f2663a), com.json.v8.a(this.f2663a, network));
                return;
            }
            com.json.ef efVar = com.json.fn.this.c;
            java.lang.String strB = com.json.v8.b(this.f2663a);
            android.content.Context context = this.f2663a;
            efVar.a(strB, com.json.v8.a(context, com.json.v8.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            if (network != null) {
                com.json.fn.this.c.b(com.json.v8.a(network, this.f2663a), com.json.v8.a(this.f2663a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(android.net.Network network, android.net.LinkProperties linkProperties) {
            if (network != null) {
                com.json.fn.this.c.b(com.json.v8.a(network, this.f2663a), com.json.v8.a(this.f2663a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network network) {
            if (com.json.v8.b(this.f2663a).equals("none")) {
                com.json.fn.this.c.a();
            }
        }
    }

    public fn(com.json.ef efVar) {
        this.c = efVar;
    }

    @Override // com.json.df
    public void a() {
        this.d = null;
    }

    @Override // com.json.df
    public void a(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        if (android.os.Build.VERSION.SDK_INT < this.b || this.d == null || context == null || (connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.d);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            android.util.Log.e(this.f2662a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.json.df
    public void b(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= this.b) {
            a(context);
            if (com.json.v8.b(context).equals("none")) {
                this.c.a();
            }
            if (this.d == null) {
                this.d = new com.ironsource.fn.a(context);
            }
            android.net.NetworkRequest networkRequestBuild = new android.net.NetworkRequest.Builder().addCapability(12).build();
            try {
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(networkRequestBuild, this.d);
                }
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                android.util.Log.e(this.f2662a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.json.df
    public org.json.JSONObject c(android.content.Context context) {
        return com.json.v8.a(context, com.json.v8.a(context));
    }
}
