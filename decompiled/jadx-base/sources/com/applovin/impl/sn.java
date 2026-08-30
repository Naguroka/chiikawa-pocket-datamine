package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sn extends com.applovin.impl.re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f1340a;
    private java.lang.String b;
    private java.lang.String c;

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (com.applovin.sdk.R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        a();
        return true;
    }

    public void initialize(java.lang.String str, java.lang.String str2, com.applovin.impl.sdk.j jVar) {
        this.f1340a = jVar;
        this.b = str;
        this.c = str2;
    }

    @Override // com.applovin.impl.re
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f1340a;
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_text_view_activity);
        setTitle(this.b);
        ((android.widget.TextView) findViewById(com.applovin.sdk.R.id.textView)).setText(this.c);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    private void a() {
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
        intent.setType(androidx.webkit.internal.AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", this.c);
        intent.putExtra("android.intent.extra.TITLE", this.b);
        intent.putExtra("android.intent.extra.SUBJECT", this.b);
        startActivity(android.content.Intent.createChooser(intent, null));
    }
}
