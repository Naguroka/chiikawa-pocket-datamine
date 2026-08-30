package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zae implements android.view.View.OnClickListener {
    final /* synthetic */ android.content.Context zaa;
    final /* synthetic */ android.content.Intent zab;

    zae(android.content.Context context, android.content.Intent intent) {
        this.zaa = context;
        this.zab = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        try {
            this.zaa.startActivity(this.zab);
        } catch (android.content.ActivityNotFoundException e) {
            android.util.Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
