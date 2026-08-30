package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t6 extends android.app.Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.v6 f1350a;
    private com.applovin.impl.sdk.j b;
    private android.widget.TextView c;
    private android.widget.Button d;

    public void a(com.applovin.impl.v6 v6Var, com.applovin.impl.sdk.j jVar) {
        this.f1350a = v6Var;
        this.b = jVar;
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f1350a.c() + " - " + this.f1350a.d());
        setContentView(com.applovin.sdk.R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        android.widget.Button button = (android.widget.Button) findViewById(com.applovin.sdk.R.id.report_ad_button);
        this.d = button;
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.applovin.impl.t6$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.f$0.a(view);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (!a()) {
            finish();
            return false;
        }
        if (com.applovin.sdk.R.id.action_share == menuItem.getItemId()) {
            this.b.v().a(this.f1350a, (android.content.Context) this, false);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    private void b() {
        com.applovin.impl.pc pcVar = new com.applovin.impl.pc();
        pcVar.a(this.b.v().a(this.f1350a));
        java.lang.String strB = this.b.v().b(this.f1350a.a());
        if (strB != null) {
            pcVar.a("\nBid Response Preview:\n");
            pcVar.a(strB);
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.applovin.sdk.R.id.email_report_tv);
        this.c = textView;
        textView.setText(pcVar.toString());
        this.c.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
    }

    private boolean a() {
        return (this.f1350a == null || this.b == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.view.View view) {
        this.b.v().a(this.f1350a, (android.content.Context) this, true);
    }
}
