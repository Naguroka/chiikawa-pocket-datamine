package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2522a;
    private final com.ironsource.mediationsdk.IronSource.AD_UNIT b;
    private final com.ironsource.b2.b c;
    private com.json.a2 d;
    private final com.json.p7 e;
    public com.json.fi f;
    public com.json.vl g;
    public com.json.wu h;
    public com.json.o4 i;
    public com.json.k0 j;
    public com.json.bv k;
    public com.json.ro l;
    private java.util.Map<com.json.y1, com.ironsource.b2.a> m;
    private java.util.Map<com.json.y1, com.ironsource.b2.a> n;
    private java.util.Map<com.json.y1, com.ironsource.b2.a> o;
    private java.util.Map<com.json.y1, com.ironsource.b2.a> p;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2523a;
        private final int b;

        public a(int i, int i2) {
            this.f2523a = i;
            this.b = i2;
        }

        int a(com.ironsource.b2.b bVar) {
            return com.ironsource.b2.b.MEDIATION.equals(bVar) ? this.f2523a : this.b;
        }
    }

    public enum b {
        MEDIATION,
        PROVIDER
    }

    public b2(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, com.ironsource.b2.b bVar, com.json.a2 a2Var) {
        this(ad_unit, bVar, a2Var, a(ad_unit));
    }

    public b2(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, com.ironsource.b2.b bVar, com.json.a2 a2Var, com.json.p7 p7Var) {
        this.f2522a = -1;
        this.b = ad_unit;
        this.c = bVar;
        this.d = a2Var;
        this.e = p7Var == null ? a(ad_unit) : p7Var;
        b();
        this.f = new com.json.fi(this);
        this.g = new com.json.vl(this);
        this.h = new com.json.wu(this);
        this.i = new com.json.o4(this);
        this.j = new com.json.k0(this);
        this.k = new com.json.bv(this);
        this.l = new com.json.ro(this);
    }

    private int a(com.json.y1 y1Var) {
        try {
            if (com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL.equals(this.b) && this.m.containsKey(y1Var)) {
                return this.m.get(y1Var).a(this.c);
            }
            if (com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO.equals(this.b) && this.n.containsKey(y1Var)) {
                return this.n.get(y1Var).a(this.c);
            }
            if (com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER.equals(this.b) && this.o.containsKey(y1Var)) {
                return this.o.get(y1Var).a(this.c);
            }
            if (com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD.equals(this.b) && this.p.containsKey(y1Var)) {
                return this.p.get(y1Var).a(this.c);
            }
            return -1;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return -1;
        }
    }

    private static com.json.p7 a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        return ad_unit.equals(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) ? com.json.wq.i() : com.json.jj.i();
    }

    private void d() {
        java.util.HashMap map = new java.util.HashMap();
        this.p = map;
        map.put(com.json.y1.INIT_STARTED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_MANAGER_INIT_STARTED, -1));
        this.p.put(com.json.y1.INIT_ENDED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_MANAGER_INIT_ENDED, -1));
        this.p.put(com.json.y1.PLACEMENT_CAPPED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_PLACEMENT_CAPPED, -1));
        this.p.put(com.json.y1.AUCTION_REQUEST, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_AUCTION_REQUEST, -1));
        this.p.put(com.json.y1.AUCTION_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_AUCTION_SUCCESS, -1));
        this.p.put(com.json.y1.AUCTION_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_AUCTION_FAILED, -1));
        this.p.put(com.json.y1.AUCTION_FAILED_NO_CANDIDATES, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_AUCTION_FAILED, -1));
        this.p.put(com.json.y1.AUCTION_REQUEST_WATERFALL, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_AUCTION_REQUEST_WATERFALL, -1));
        this.p.put(com.json.y1.AUCTION_RESULT_WATERFALL, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_AUCTION_RESPONSE_WATERFALL, -1));
        this.p.put(com.json.y1.INIT_SUCCESS, new com.ironsource.b2.a(-1, -1));
        this.p.put(com.json.y1.INIT_FAILED, new com.ironsource.b2.a(-1, -1));
        this.p.put(com.json.y1.AD_OPENED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_CALLBACK_SHOW, com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_SHOW));
        this.p.put(com.json.y1.AD_CLICKED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_CALLBACK_CLICK, com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_CLICK));
        this.p.put(com.json.y1.LOAD_AD, new com.ironsource.b2.a(4001, 4002));
        this.p.put(com.json.y1.LOAD_AD_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_CALLBACK_LOAD_SUCCESS, 4005));
        this.p.put(com.json.y1.LOAD_AD_FAILED_WITH_REASON, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_CALLBACK_LOAD_ERROR, com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_LOAD_ERROR));
        this.p.put(com.json.y1.LOAD_AD_NO_FILL, new com.ironsource.b2.a(-1, com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_LOAD_NO_FILL));
        this.p.put(com.json.y1.AD_FORMAT_CAPPED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_AD_UNIT_CAPPED, -1));
        this.p.put(com.json.y1.COLLECT_TOKEN, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_COLLECT_TOKENS, com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN));
        this.p.put(com.json.y1.COLLECT_TOKENS_COMPLETED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_COLLECT_TOKENS_COMPLETED, -1));
        this.p.put(com.json.y1.COLLECT_TOKENS_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_COLLECT_TOKENS_FAILED, -1));
        this.p.put(com.json.y1.INSTANCE_COLLECT_TOKEN, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN, -1));
        this.p.put(com.json.y1.INSTANCE_COLLECT_TOKEN_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_SUCCESS));
        this.p.put(com.json.y1.INSTANCE_COLLECT_TOKEN_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_FAILED, com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_FAILED));
        this.p.put(com.json.y1.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT, com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT));
        this.p.put(com.json.y1.DESTROY_AD, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.NT_DESTROY, com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_DESTROY));
        this.p.put(com.json.y1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING));
        this.p.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS));
        this.p.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED));
        this.p.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS));
        this.p.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED));
        this.p.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS));
        this.p.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED));
        this.p.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT));
        this.p.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_OPENED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_OPENED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_OPENED));
        this.p.put(com.json.y1.TROUBLESHOOT_INTERNAL_ERROR, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_INTERNAL_ERROR, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_INTERNAL_ERROR));
        this.p.put(com.json.y1.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.p.put(com.json.y1.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new com.ironsource.b2.a(88002, 88002));
        this.p.put(com.json.y1.TROUBLESHOOT_NOTIFICATION_ERROR, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_NOTIFICATIONS_ERROR, -1));
    }

    void a() {
        java.util.HashMap map = new java.util.HashMap();
        this.o = map;
        map.put(com.json.y1.INIT_STARTED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_MANAGER_INIT_STARTED, -1));
        this.o.put(com.json.y1.INIT_ENDED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_MANAGER_INIT_ENDED, -1));
        this.o.put(com.json.y1.PLACEMENT_CAPPED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_PLACEMENT_CAPPED, -1));
        this.o.put(com.json.y1.AUCTION_REQUEST, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_AUCTION_REQUEST, -1));
        this.o.put(com.json.y1.AUCTION_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_AUCTION_SUCCESS, -1));
        this.o.put(com.json.y1.AUCTION_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_AUCTION_FAILED, -1));
        this.o.put(com.json.y1.AUCTION_FAILED_NO_CANDIDATES, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_AUCTION_FAILED, -1));
        this.o.put(com.json.y1.AUCTION_REQUEST_WATERFALL, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_AUCTION_REQUEST_WATERFALL, -1));
        this.o.put(com.json.y1.AUCTION_RESULT_WATERFALL, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_AUCTION_RESPONSE_WATERFALL, -1));
        this.o.put(com.json.y1.INIT_SUCCESS, new com.ironsource.b2.a(-1, -1));
        this.o.put(com.json.y1.INIT_FAILED, new com.ironsource.b2.a(-1, -1));
        this.o.put(com.json.y1.AD_OPENED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_SHOW, 3009));
        this.o.put(com.json.y1.AD_CLICKED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_CLICK, 3008));
        this.o.put(com.json.y1.LOAD_AD, new com.ironsource.b2.a(3001, 3002));
        this.o.put(com.json.y1.RELOAD_AD, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_RELOAD, com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_RELOAD));
        this.o.put(com.json.y1.LOAD_AD_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, 3005));
        this.o.put(com.json.y1.RELOAD_AD_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.o.put(com.json.y1.LOAD_AD_FAILED_WITH_REASON, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_LOAD_ERROR, 3300));
        this.o.put(com.json.y1.RELOAD_AD_FAILED_WITH_REASON, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_RELOAD_ERROR, com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.o.put(com.json.y1.LOAD_AD_NO_FILL, new com.ironsource.b2.a(-1, 3306));
        this.o.put(com.json.y1.RELOAD_AD_NO_FILL, new com.ironsource.b2.a(-1, com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL));
        this.o.put(com.json.y1.AD_FORMAT_CAPPED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_AD_UNIT_CAPPED, -1));
        this.o.put(com.json.y1.COLLECT_TOKEN, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_COLLECT_TOKENS, -1));
        this.o.put(com.json.y1.COLLECT_TOKENS_COMPLETED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_COLLECT_TOKENS_COMPLETED, -1));
        this.o.put(com.json.y1.COLLECT_TOKENS_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_COLLECT_TOKENS_FAILED, -1));
        this.o.put(com.json.y1.INSTANCE_COLLECT_TOKEN, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN, -1));
        this.o.put(com.json.y1.INSTANCE_COLLECT_TOKEN_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_SUCCESS));
        this.o.put(com.json.y1.INSTANCE_COLLECT_TOKEN_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_FAILED, com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_FAILED));
        this.o.put(com.json.y1.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT));
        this.o.put(com.json.y1.DESTROY_AD, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_DESTROY, 3305));
        this.o.put(com.json.y1.SKIP_RELOAD_AD, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_SKIP_RELOAD, -1));
        this.o.put(com.json.y1.AD_LEFT_APPLICATION, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_LEAVE_APP, 3304));
        this.o.put(com.json.y1.AD_PRESENT_SCREEN, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN));
        this.o.put(com.json.y1.AD_DISMISS_SCREEN, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN));
        this.o.put(com.json.y1.AD_VIEW_BOUND, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.BN_BOUND, com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_BOUND));
        this.o.put(com.json.y1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING));
        this.o.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS));
        this.o.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED));
        this.o.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS));
        this.o.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED));
        this.o.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS));
        this.o.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED));
        this.o.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS));
        this.o.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED));
        this.o.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT));
        this.o.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_OPENED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_OPENED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_OPENED));
        this.o.put(com.json.y1.TROUBLESHOOT_INTERNAL_ERROR, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_INTERNAL_ERROR, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_INTERNAL_ERROR));
        this.o.put(com.json.y1.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.o.put(com.json.y1.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new com.ironsource.b2.a(88002, 88002));
        this.o.put(com.json.y1.TROUBLESHOOT_NOTIFICATION_ERROR, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, -1));
        this.o.put(com.json.y1.TROUBLESHOOT_BN_RELOAD_EXCEPTION, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, -1));
        this.o.put(com.json.y1.TROUBLESHOOT_IMPRESSION_TIMEOUT, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_IMPRESSION_TIMEOUT_REACHED, -1));
        this.o.put(com.json.y1.TROUBLESHOOT_BANNER_REFRESH_PAUSED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_PAUSED, -1));
        this.o.put(com.json.y1.TROUBLESHOOT_BANNER_REFRESH_RESUMED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_RESUMED, -1));
        this.o.put(com.json.y1.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_PAUSE, -1));
        this.o.put(com.json.y1.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_RESUME, -1));
        this.o.put(com.json.y1.TROUBLESHOOT_BANNER_REFRESH_TRANSITION, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_TRANSITION, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_TRANSITION));
        this.o.put(com.json.y1.TROUBLESHOOT_BANNER_REFRESH_ANIMATED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_ANIMATED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_ANIMATED));
    }

    protected void a(com.json.y1 y1Var, java.util.Map<java.lang.String, java.lang.Object> map) {
        a(y1Var, map, java.util.Calendar.getInstance().getTimeInMillis());
    }

    public void a(com.json.y1 y1Var, java.util.Map<java.lang.String, java.lang.Object> map, long j) {
        int iA = a(y1Var);
        if (-1 == iA) {
            return;
        }
        java.util.HashMap map2 = new java.util.HashMap();
        com.json.a2 a2Var = this.d;
        if (a2Var != null) {
            map2.putAll(a2Var.a(y1Var));
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.e.a(new com.json.wb(iA, j, new org.json.JSONObject(map2)));
    }

    void b() {
        c();
        e();
        a();
        d();
    }

    void c() {
        java.util.HashMap map = new java.util.HashMap();
        this.m = map;
        map.put(com.json.y1.INIT_STARTED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_MANAGER_INIT_STARTED, -1));
        this.m.put(com.json.y1.INIT_ENDED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_MANAGER_INIT_ENDED, -1));
        this.m.put(com.json.y1.SESSION_CAPPED, new com.ironsource.b2.a(-1, com.json.mediationsdk.utils.IronSourceConstants.IS_CAP_SESSION));
        this.m.put(com.json.y1.PLACEMENT_CAPPED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_CAP_PLACEMENT, -1));
        this.m.put(com.json.y1.CHECK_PLACEMENT_CAPPED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_CHECK_PLACEMENT_CAPPED, -1));
        this.m.put(com.json.y1.AUCTION_REQUEST, new com.ironsource.b2.a(2000, -1));
        this.m.put(com.json.y1.AUCTION_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_AUCTION_SUCCESS, -1));
        this.m.put(com.json.y1.AUCTION_FAILED, new com.ironsource.b2.a(2300, -1));
        this.m.put(com.json.y1.AUCTION_FAILED_NO_CANDIDATES, new com.ironsource.b2.a(2300, -1));
        this.m.put(com.json.y1.AUCTION_REQUEST_WATERFALL, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, -1));
        this.m.put(com.json.y1.AUCTION_RESULT_WATERFALL, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_RESULT_WATERFALL, -1));
        this.m.put(com.json.y1.INIT_SUCCESS, new com.ironsource.b2.a(-1, -1));
        this.m.put(com.json.y1.INIT_FAILED, new com.ironsource.b2.a(-1, -1));
        this.m.put(com.json.y1.SHOW_AD_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_CALLBACK_AD_DISPLAYED, 2202));
        this.m.put(com.json.y1.AD_OPENED, new com.ironsource.b2.a(-1, 2005));
        this.m.put(com.json.y1.AD_CLOSED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_CALLBACK_AD_CLOSED, 2204));
        this.m.put(com.json.y1.AD_CLICKED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_CALLBACK_AD_CLICKED, 2006));
        this.m.put(com.json.y1.AD_INFO_CHANGED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_CALLBACK_AD_INFO_CHANGED, -1));
        this.m.put(com.json.y1.LOAD_AD, new com.ironsource.b2.a(2001, 2002));
        this.m.put(com.json.y1.LOAD_AD_SUCCESS, new com.ironsource.b2.a(2004, 2003));
        this.m.put(com.json.y1.LOAD_AD_FAILED_WITH_REASON, new com.ironsource.b2.a(2110, 2200));
        this.m.put(com.json.y1.LOAD_AD_NO_FILL, new com.ironsource.b2.a(-1, 2213));
        this.m.put(com.json.y1.SHOW_AD, new com.ironsource.b2.a(2100, 2201));
        this.m.put(com.json.y1.SHOW_AD_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, 2203));
        this.m.put(com.json.y1.AD_FORMAT_CAPPED, new com.ironsource.b2.a(2303, -1));
        this.m.put(com.json.y1.AD_UNIT_CAPPED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_AD_UNIT_CAPPED, -1));
        this.m.put(com.json.y1.COLLECT_TOKEN, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_COLLECT_TOKENS, -1));
        this.m.put(com.json.y1.COLLECT_TOKENS_COMPLETED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_COLLECT_TOKENS_COMPLETED, -1));
        this.m.put(com.json.y1.COLLECT_TOKENS_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_COLLECT_TOKENS_FAILED, -1));
        this.m.put(com.json.y1.INSTANCE_COLLECT_TOKEN, new com.ironsource.b2.a(2020, -1));
        this.m.put(com.json.y1.INSTANCE_COLLECT_TOKEN_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, -1));
        this.m.put(com.json.y1.INSTANCE_COLLECT_TOKEN_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_FAILED, -1));
        this.m.put(com.json.y1.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, -1));
        this.m.put(com.json.y1.AD_READY_TRUE, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_CHECK_READY_TRUE, -1));
        this.m.put(com.json.y1.AD_READY_FALSE, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_CHECK_READY_FALSE, -1));
        this.m.put(com.json.y1.OPERATIONAL_LOAD_AD, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_OPERATIONAL_LOAD_AD, -1));
        this.m.put(com.json.y1.OPERATIONAL_LOAD_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_OPERATIONAL_LOAD_SUCCESS, -1));
        this.m.put(com.json.y1.OPERATIONAL_LOAD_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.IS_OPERATIONAL_LOAD_FAILED, -1));
        this.m.put(com.json.y1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING));
        this.m.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS));
        this.m.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED));
        this.m.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS));
        this.m.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED));
        this.m.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS));
        this.m.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED));
        this.m.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED));
        this.m.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_CLOSED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED));
        this.m.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT));
        this.m.put(com.json.y1.TROUBLESHOOT_INTERNAL_ERROR, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR));
        this.m.put(com.json.y1.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.m.put(com.json.y1.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new com.ironsource.b2.a(88002, 88002));
        this.m.put(com.json.y1.TROUBLESHOOT_NOTIFICATION_ERROR, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, -1));
        this.m.put(com.json.y1.TROUBLESHOOT_AD_EXPIRED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_AD_EXPIRED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_AD_EXPIRED));
        this.m.put(com.json.y1.TROUBLESHOOT_LOAD, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_LOAD, -1));
        this.m.put(com.json.y1.TROUBLESHOOT_LOAD_WHILE_LOADED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_LOAD_WHILE_LOADED, -1));
        this.m.put(com.json.y1.TROUBLESHOOT_LOAD_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_LOAD_SUCCESS, -1));
        this.m.put(com.json.y1.TROUBLESHOOT_LOAD_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_LOAD_FAILED, -1));
        this.m.put(com.json.y1.TROUBLESHOOT_SHOW, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_SHOW, -1));
        this.m.put(com.json.y1.TROUBLESHOOT_SHOW_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_SHOW_SUCCESS, -1));
        this.m.put(com.json.y1.TROUBLESHOOT_SHOW_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_SHOW_FAILED, -1));
        this.m.put(com.json.y1.TROUBLESHOOT_ILLEGAL_STATE, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_ILLEGAL_STATE, -1));
        this.m.put(com.json.y1.TROUBLESHOOT_AD_INFO_CHANGED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOT_IS_AD_INFO_CHANGED, -1));
        this.m.put(com.json.y1.TROUBLESHOOT_DISPOSE, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_DISPOSE, -1));
    }

    void e() {
        java.util.HashMap map = new java.util.HashMap();
        this.n = map;
        map.put(com.json.y1.INIT_STARTED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_MANAGER_INIT_STARTED, -1));
        this.n.put(com.json.y1.INIT_ENDED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_MANAGER_INIT_ENDED, -1));
        this.n.put(com.json.y1.SESSION_CAPPED, new com.ironsource.b2.a(-1, com.json.mediationsdk.utils.IronSourceConstants.RV_CAP_SESSION));
        this.n.put(com.json.y1.PLACEMENT_CAPPED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_CAP_PLACEMENT, -1));
        this.n.put(com.json.y1.CHECK_PLACEMENT_CAPPED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_CHECK_PLACEMENT_CAPPED, -1));
        this.n.put(com.json.y1.AUCTION_REQUEST, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_AUCTION_REQUEST, -1));
        this.n.put(com.json.y1.AUCTION_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_AUCTION_SUCCESS, -1));
        this.n.put(com.json.y1.AUCTION_FAILED, new com.ironsource.b2.a(1301, -1));
        this.n.put(com.json.y1.AUCTION_FAILED_NO_CANDIDATES, new com.ironsource.b2.a(1301, -1));
        this.n.put(com.json.y1.AUCTION_REQUEST_WATERFALL, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, -1));
        this.n.put(com.json.y1.AUCTION_RESULT_WATERFALL, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, -1));
        this.n.put(com.json.y1.INIT_SUCCESS, new com.ironsource.b2.a(-1, -1));
        this.n.put(com.json.y1.INIT_FAILED, new com.ironsource.b2.a(-1, -1));
        this.n.put(com.json.y1.AD_VISIBLE, new com.ironsource.b2.a(-1, 1206));
        this.n.put(com.json.y1.SHOW_AD_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_AD_DISPLAYED, -1));
        this.n.put(com.json.y1.AD_OPENED, new com.ironsource.b2.a(-1, 1005));
        this.n.put(com.json.y1.AD_CLOSED, new com.ironsource.b2.a(-1, 1203));
        this.n.put(com.json.y1.AD_STARTED, new com.ironsource.b2.a(-1, com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_STARTED));
        this.n.put(com.json.y1.AD_ENDED, new com.ironsource.b2.a(-1, com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_ENDED));
        this.n.put(com.json.y1.AD_CLICKED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_AD_CLICKED, 1006));
        this.n.put(com.json.y1.AD_INFO_CHANGED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_AD_INFO_CHANGED, -1));
        this.n.put(com.json.y1.AD_REWARDED, new com.ironsource.b2.a(-1, 1010));
        this.n.put(com.json.y1.AD_AVAILABILITY_CHANGED_TRUE, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE, com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE));
        this.n.put(com.json.y1.AD_AVAILABILITY_CHANGED_FALSE, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE));
        this.n.put(com.json.y1.LOAD_AD, new com.ironsource.b2.a(1000, 1001));
        this.n.put(com.json.y1.LOAD_AD_SUCCESS, new com.ironsource.b2.a(1003, 1002));
        this.n.put(com.json.y1.LOAD_AD_FAILED, new com.ironsource.b2.a(-1, 1200));
        this.n.put(com.json.y1.LOAD_AD_FAILED_WITH_REASON, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_MEDIATION_LOAD_ERROR, com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.n.put(com.json.y1.LOAD_AD_NO_FILL, new com.ironsource.b2.a(-1, 1213));
        this.n.put(com.json.y1.SHOW_AD, new com.ironsource.b2.a(1100, 1201));
        this.n.put(com.json.y1.SHOW_AD_CHANCE, new com.ironsource.b2.a(-1, com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.n.put(com.json.y1.SHOW_AD_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_SHOW_FAILED, 1202));
        this.n.put(com.json.y1.AD_FORMAT_CAPPED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_AD_UNIT_CAPPED, -1));
        this.n.put(com.json.y1.COLLECT_TOKEN, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_COLLECT_TOKENS, -1));
        this.n.put(com.json.y1.COLLECT_TOKENS_COMPLETED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_COLLECT_TOKENS_COMPLETED, -1));
        this.n.put(com.json.y1.COLLECT_TOKENS_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_COLLECT_TOKENS_FAILED, -1));
        this.n.put(com.json.y1.INSTANCE_COLLECT_TOKEN, new com.ironsource.b2.a(1020, -1));
        this.n.put(com.json.y1.INSTANCE_COLLECT_TOKEN_SUCCESS, new com.ironsource.b2.a(1021, 1021));
        this.n.put(com.json.y1.INSTANCE_COLLECT_TOKEN_FAILED, new com.ironsource.b2.a(1022, 1022));
        this.n.put(com.json.y1.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new com.ironsource.b2.a(1023, 1023));
        this.n.put(com.json.y1.AD_READY_TRUE, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_CHECK_READY_TRUE, -1));
        this.n.put(com.json.y1.AD_READY_FALSE, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_CHECK_READY_FALSE, -1));
        this.n.put(com.json.y1.OPERATIONAL_LOAD_AD, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_OPERATIONAL_LOAD_AD, -1));
        this.n.put(com.json.y1.OPERATIONAL_LOAD_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_OPERATIONAL_LOAD_SUCCESS, -1));
        this.n.put(com.json.y1.OPERATIONAL_LOAD_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.RV_OPERATIONAL_LOAD_FAILED, -1));
        this.n.put(com.json.y1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING));
        this.n.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS));
        this.n.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED));
        this.n.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS));
        this.n.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED));
        this.n.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS));
        this.n.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED));
        this.n.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED));
        this.n.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT));
        this.n.put(com.json.y1.TROUBLESHOOT_UNEXPECTED_CLOSED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED));
        this.n.put(com.json.y1.TROUBLESHOOT_LOAD_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED));
        this.n.put(com.json.y1.TROUBLESHOOT_INTERNAL_ERROR, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR));
        this.n.put(com.json.y1.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.n.put(com.json.y1.TROUBLESHOOT_WATERFALL_OVERHEAD, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD));
        this.n.put(com.json.y1.TROUBLESHOOT_NOTIFICATION_ERROR, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, -1));
        this.n.put(com.json.y1.TROUBLESHOOT_AD_EXPIRED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_AD_EXPIRED, com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_AD_EXPIRED));
        this.n.put(com.json.y1.TROUBLESHOOT_LOAD, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_LOAD, -1));
        this.n.put(com.json.y1.TROUBLESHOOT_LOAD_WHILE_LOADED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_LOAD_WHILE_LOADED, -1));
        this.n.put(com.json.y1.TROUBLESHOOT_LOAD_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_LOAD_SUCCESS, -1));
        this.n.put(com.json.y1.TROUBLESHOOT_SHOW, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_SHOW, -1));
        this.n.put(com.json.y1.TROUBLESHOOT_SHOW_SUCCESS, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_SHOW_SUCCESS, -1));
        this.n.put(com.json.y1.TROUBLESHOOT_SHOW_FAILED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_SHOW_FAILED, -1));
        this.n.put(com.json.y1.TROUBLESHOOT_ILLEGAL_STATE, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_ILLEGAL_STATE, -1));
        this.n.put(com.json.y1.TROUBLESHOOT_AD_INFO_CHANGED, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOT_RV_AD_INFO_CHANGED, -1));
        this.n.put(com.json.y1.TROUBLESHOOT_DISPOSE, new com.ironsource.b2.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_DISPOSE, -1));
    }

    public void f() {
        this.d = null;
        this.h = null;
        this.i = null;
        this.f = null;
        this.g = null;
        this.j = null;
        this.k = null;
        this.l = null;
    }
}
