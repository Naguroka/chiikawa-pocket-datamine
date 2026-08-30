package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdvt {
    zzdvt() {
    }

    public static final void zza(android.content.Context context, android.view.ViewGroup viewGroup, com.google.android.gms.ads.AdView adView) {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setTag(androidx.media3.extractor.text.ttml.TtmlNode.TAG_LAYOUT);
        zzf(linearLayout, -1, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(adView);
        adView.setTag("ad_view");
        viewGroup.addView(linearLayout);
    }

    public static final void zzb(android.content.Context context, android.view.ViewGroup viewGroup, com.google.android.gms.ads.nativead.NativeAd nativeAd) {
        com.google.android.gms.ads.nativead.NativeAdView nativeAdView = new com.google.android.gms.ads.nativead.NativeAdView(context);
        nativeAdView.setTag("ad_view_tag");
        zzf(nativeAdView, -1, -1);
        viewGroup.addView(nativeAdView);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        zzf(linearLayout, -1, -1);
        linearLayout.setBackgroundColor(-1);
        nativeAdView.addView(linearLayout);
        android.content.res.Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        linearLayout.addView(zzc(context, resourcesZze == null ? "Headline" : resourcesZze.getString(com.google.android.gms.ads.impl.R.string.native_headline), "headline_header_tag"));
        android.view.View viewZzd = zzd(context, com.google.android.gms.internal.ads.zzfve.zzc(nativeAd.getHeadline()), "headline_tag");
        nativeAdView.setHeadlineView(viewZzd);
        linearLayout.addView(viewZzd);
        linearLayout.addView(zzc(context, resourcesZze == null ? "Body" : resourcesZze.getString(com.google.android.gms.ads.impl.R.string.native_body), "body_header_tag"));
        android.view.View viewZzd2 = zzd(context, com.google.android.gms.internal.ads.zzfve.zzc(nativeAd.getBody()), "body_tag");
        nativeAdView.setBodyView(viewZzd2);
        linearLayout.addView(viewZzd2);
        linearLayout.addView(zzc(context, resourcesZze == null ? "Media View" : resourcesZze.getString(com.google.android.gms.ads.impl.R.string.native_media_view), "media_view_header_tag"));
        com.google.android.gms.ads.nativead.MediaView mediaView = new com.google.android.gms.ads.nativead.MediaView(context);
        mediaView.setTag("media_view_tag");
        nativeAdView.setMediaView(mediaView);
        linearLayout.addView(mediaView);
        nativeAdView.setNativeAd(nativeAd);
    }

    private static android.widget.TextView zzc(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return zze(context, str, android.R.style.TextAppearance.Small, -9210245, 0.0f, str2);
    }

    private static android.widget.TextView zzd(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return zze(context, str, android.R.style.TextAppearance.Medium, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, 12.0f, str2);
    }

    private static android.widget.TextView zze(android.content.Context context, java.lang.String str, int i, int i2, float f, java.lang.String str2) {
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTag(str2);
        zzf(textView, -2, -2);
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.TableRow.LayoutParams();
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) android.util.TypedValue.applyDimension(1, f, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i);
        textView.setTextColor(i2);
        textView.setText(str);
        return textView;
    }

    private static void zzf(android.view.View view, int i, int i2) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.TableRow.LayoutParams();
        }
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i;
        layoutParams2.width = i2;
        view.setLayoutParams(layoutParams2);
    }
}
