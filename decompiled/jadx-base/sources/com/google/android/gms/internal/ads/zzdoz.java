package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdoz extends android.widget.FrameLayout {
    private final com.google.android.gms.ads.internal.util.zzau zza;

    public zzdoz(android.content.Context context, android.view.View view, com.google.android.gms.ads.internal.util.zzau zzauVar) {
        super(context);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.zza = zzauVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        this.zza.zzm(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            android.view.KeyEvent.Callback childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof com.google.android.gms.internal.ads.zzcex)) {
                arrayList.add((com.google.android.gms.internal.ads.zzcex) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((com.google.android.gms.internal.ads.zzcex) arrayList.get(i2)).destroy();
        }
    }
}
