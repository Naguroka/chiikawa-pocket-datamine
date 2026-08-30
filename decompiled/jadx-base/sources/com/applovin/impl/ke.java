package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ke extends com.applovin.impl.re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.le f957a;
    private android.widget.ListView b;

    public ke() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public void initialize(com.applovin.impl.je jeVar) {
        setTitle(jeVar.g());
        com.applovin.impl.le leVar = new com.applovin.impl.le(jeVar, this);
        this.f957a = leVar;
        leVar.a(new com.applovin.impl.ke.a(jeVar));
    }

    class a implements com.applovin.impl.dc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.je f958a;

        a(com.applovin.impl.je jeVar) {
            this.f958a = jeVar;
        }

        @Override // com.applovin.impl.dc.a
        public void a(com.applovin.impl.kb kbVar, com.applovin.impl.cc ccVar) {
            if (kbVar.b() == com.applovin.impl.le.a.TEST_ADS.ordinal()) {
                com.applovin.impl.sdk.j jVarO = this.f958a.o();
                com.applovin.impl.je.b bVarY = this.f958a.y();
                if (com.applovin.impl.ke.this.f957a.a(kbVar)) {
                    if (com.applovin.impl.je.b.READY == bVarY) {
                        com.applovin.impl.r.a(com.applovin.impl.ke.this, com.applovin.mediation.MaxDebuggerMultiAdActivity.class, jVarO.e(), new com.applovin.impl.ke.a.C0036a());
                        return;
                    } else if (com.applovin.impl.je.b.DISABLED == bVarY) {
                        jVarO.k0().a();
                        com.applovin.impl.yp.a(ccVar.c(), ccVar.b(), com.applovin.impl.ke.this);
                        return;
                    } else {
                        com.applovin.impl.yp.a(ccVar.c(), ccVar.b(), com.applovin.impl.ke.this);
                        return;
                    }
                }
                com.applovin.impl.yp.a(ccVar.c(), ccVar.b(), com.applovin.impl.ke.this);
                return;
            }
            com.applovin.impl.yp.a(ccVar.c(), ccVar.b(), com.applovin.impl.ke.this);
        }

        /* JADX INFO: renamed from: com.applovin.impl.ke$a$a, reason: collision with other inner class name */
        class C0036a implements com.applovin.impl.r.b {
            C0036a() {
            }

            @Override // com.applovin.impl.r.b
            public void a(com.applovin.mediation.MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(com.applovin.impl.ke.a.this.f958a);
            }
        }
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.b = listView;
        listView.setAdapter((android.widget.ListAdapter) this.f957a);
    }

    @Override // com.applovin.impl.re
    protected com.applovin.impl.sdk.j getSdk() {
        com.applovin.impl.le leVar = this.f957a;
        if (leVar != null) {
            return leVar.h().o();
        }
        return null;
    }

    @Override // com.applovin.impl.re, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f957a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f957a.k();
            this.f957a.c();
        }
    }
}
