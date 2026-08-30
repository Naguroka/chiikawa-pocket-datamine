package com.json;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i7<Smash extends com.json.j7<?>, Listener extends com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener> extends com.json.k7<Smash, Listener> implements com.json.g2 {

    class a extends com.json.dr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.Activity f2731a;
        final /* synthetic */ com.json.mediationsdk.model.Placement b;

        a(android.app.Activity activity, com.json.mediationsdk.model.Placement placement) {
            this.f2731a = activity;
            this.b = placement;
        }

        @Override // com.json.dr
        public void a() {
            com.json.i7.this.b(this.f2731a, this.b);
        }
    }

    protected i7(com.json.r0 r0Var, com.json.lk lkVar, com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        super(r0Var, lkVar, ironSourceSegment);
    }

    i7(com.json.sf sfVar, com.json.rf rfVar, com.json.r0 r0Var, com.json.lk lkVar, com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        super(sfVar, rfVar, r0Var, lkVar, ironSourceSegment);
    }

    private java.lang.String a(java.util.List<Smash> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (Smash smash : list) {
            if (smash.e() != null) {
                sb.append(smash.c()).append(":").append(smash.e()).append(",");
            }
        }
        return sb.toString();
    }

    private void a(android.app.Activity activity, com.json.j7<?> j7Var, com.json.mediationsdk.model.Placement placement) {
        if (this.o.getLoadingData().e()) {
            this.r.a();
        }
        j7Var.a(activity, placement);
    }

    private void a(Smash smash, java.util.List<Smash> list) {
        for (Smash smash2 : list) {
            if (smash != null && smash2 == smash) {
                smash.b(true);
                return;
            } else {
                smash2.b(false);
                com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b(smash2.k() + " - not ready to show"));
            }
        }
    }

    private void a(com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.j7<?> j7Var, java.lang.String str) {
        this.s.j.a(n(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.q.g();
        this.t.a(ironSourceError, j7Var != null ? j7Var.f() : null);
        if (this.o.getLoadingData().e()) {
            b(false);
        }
    }

    private void a(com.json.mediationsdk.logger.IronSourceError ironSourceError, java.lang.String str) {
        a(ironSourceError, (com.json.j7<?>) null, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void b(android.app.Activity activity, com.json.mediationsdk.model.Placement placement) {
        com.json.j7 j7Var;
        com.json.mediationsdk.logger.IronSourceError ironSourceError;
        java.lang.String strA;
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b("state = " + this.p));
        synchronized (this.x) {
            this.i = placement;
            this.s.j.a(activity, n());
            com.ironsource.k7.f fVar = this.p;
            com.ironsource.k7.f fVar2 = com.ironsource.k7.f.SHOWING;
            j7Var = null;
            if (fVar == fVar2) {
                ironSourceError = new com.json.mediationsdk.logger.IronSourceError(com.json.x1.g(this.o.getAdUnit()), "can't show ad while an ad is already showing");
            } else if (fVar != com.ironsource.k7.f.READY_TO_SHOW) {
                ironSourceError = new com.json.mediationsdk.logger.IronSourceError(509, "show called while no ads are available");
            } else if (placement == null) {
                ironSourceError = new com.json.mediationsdk.logger.IronSourceError(com.json.x1.b(this.o.getAdUnit()), "empty default placement");
            } else if (this.E.b(com.json.environment.ContextProvider.getInstance().getApplicationContext(), placement, this.o.getAdUnit())) {
                ironSourceError = new com.json.mediationsdk.logger.IronSourceError(com.json.x1.f(this.o.getAdUnit()), "placement " + placement.getCom.ironsource.op.d java.lang.String() + " is capped");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                com.json.mediationsdk.logger.IronLog.API.error(b(ironSourceError.getErrorMessage()));
                strA = "";
            } else {
                java.util.List listB = this.f2837a.b();
                com.json.bw bwVar = new com.json.bw(this.o);
                j7Var = (com.json.j7) bwVar.c(listB);
                a(j7Var, (java.util.List<com.json.j7>) bwVar.b(listB));
                if (j7Var != null) {
                    a(fVar2);
                    i(j7Var);
                } else {
                    ironSourceError = com.json.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(this.o.getAdUnit().toString());
                    strA = a(listB);
                }
            }
            a(ironSourceError, strA);
        }
        if (j7Var != null) {
            a(activity, (com.json.j7<?>) j7Var, this.i);
        }
    }

    public void a(android.app.Activity activity, com.json.mediationsdk.model.Placement placement) {
        if (c()) {
            a(new com.ironsource.i7.a(activity, placement));
        } else {
            b(activity, placement);
        }
    }

    @Override // com.json.g2
    public void a(com.json.j7<?> j7Var) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b(j7Var.k()));
        if (this.p == com.ironsource.k7.f.SHOWING) {
            a(com.ironsource.k7.f.READY_TO_LOAD);
        }
        this.q.f();
        this.t.a(j7Var.f());
    }

    @Override // com.json.g2
    public void a(com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.j7<?> j7Var) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b(j7Var.k() + " - error = " + ironSourceError));
        this.b.put(j7Var.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceFailedToShow);
        a(com.ironsource.k7.f.READY_TO_LOAD);
        a(ironSourceError, j7Var, "");
    }

    @Override // com.json.g2
    public void b(com.json.j7<?> j7Var) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b(j7Var.k()));
        this.t.g(j7Var.f());
    }

    @Override // com.json.g2
    public void c(com.json.j7<?> j7Var) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b(j7Var.k()));
        this.t.a();
    }

    @Override // com.json.g2
    public java.lang.String d() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.p == com.ironsource.k7.f.READY_TO_SHOW) {
            for (com.json.j7 j7Var : this.f2837a.b()) {
                if (j7Var.y()) {
                    sb.append(j7Var.c()).append(";");
                }
            }
        }
        return sb.toString();
    }

    @Override // com.json.g2
    public void d(com.json.j7<?> j7Var) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b(j7Var.k()));
        this.t.b();
    }

    @Override // com.json.k7
    public boolean u() {
        if (!x()) {
            return false;
        }
        if (this.j && !com.json.mediationsdk.utils.IronSourceUtils.isNetworkConnected(com.json.environment.ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        java.util.Iterator it = this.f2837a.b().iterator();
        while (it.hasNext()) {
            if (((com.json.j7) it.next()).B()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.json.k7
    protected boolean v() {
        return false;
    }
}
