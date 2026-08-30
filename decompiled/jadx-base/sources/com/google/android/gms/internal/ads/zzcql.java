package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcql extends android.widget.FrameLayout implements android.view.ViewTreeObserver.OnScrollChangedListener, android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private final android.content.Context zza;
    private android.view.View zzb;

    private zzcql(android.content.Context context) {
        super(context);
        this.zza = context;
    }

    public static com.google.android.gms.internal.ads.zzcql zza(android.content.Context context, android.view.View view, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        com.google.android.gms.internal.ads.zzcql zzcqlVar = new com.google.android.gms.internal.ads.zzcql(context);
        if (!zzfboVar.zzu.isEmpty() && (resources = zzcqlVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            com.google.android.gms.internal.ads.zzfbp zzfbpVar = (com.google.android.gms.internal.ads.zzfbp) zzfboVar.zzu.get(0);
            zzcqlVar.setLayoutParams(new android.widget.FrameLayout.LayoutParams((int) (zzfbpVar.zza * displayMetrics.density), (int) (zzfbpVar.zzb * displayMetrics.density)));
        }
        zzcqlVar.zzb = view;
        zzcqlVar.addView(view);
        com.google.android.gms.ads.internal.zzv.zzy();
        com.google.android.gms.internal.ads.zzcaj.zzb(zzcqlVar, zzcqlVar);
        com.google.android.gms.ads.internal.zzv.zzy();
        com.google.android.gms.internal.ads.zzcaj.zza(zzcqlVar, zzcqlVar);
        org.json.JSONObject jSONObject = zzfboVar.zzah;
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(zzcqlVar.zza);
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcqlVar.zzc(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcqlVar.zzc(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcqlVar.addView(relativeLayout);
        return zzcqlVar;
    }

    private final int zzb(double d) {
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzx(this.zza, (int) d);
    }

    private final void zzc(org.json.JSONObject jSONObject, android.widget.RelativeLayout relativeLayout, int i) {
        android.widget.TextView textView = new android.widget.TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iZzb, 0, iZzb);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}
