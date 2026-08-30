package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ironsource/qp;", "", "<init>", "()V", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class qp {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final com.json.qp.Companion INSTANCE = new com.json.qp.Companion(null);

    /* JADX INFO: renamed from: com.ironsource.qp$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t¨\u0006\r"}, d2 = {"Lcom/ironsource/qp$a;", "", "Landroid/content/Context;", "activityContext", "Landroid/view/View;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "context", "", "privacyIconUrl", "Lcom/ironsource/di;", "imageLoader", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static final android.graphics.drawable.GradientDrawable a() {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(android.graphics.Color.parseColor("#000000"));
            return gradientDrawable;
        }

        private final android.view.View a(android.content.Context activityContext) {
            android.widget.TextView textView = new android.widget.TextView(activityContext);
            textView.setText(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT);
            textView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
            textView.setTextSize(15.0f);
            textView.setBackground(a());
            textView.setAlpha(0.2f);
            textView.setPadding(21, 0, 21, 0);
            textView.setTextColor(android.graphics.Color.parseColor("#FFFFFF"));
            return textView;
        }

        public final android.view.View a(android.content.Context context, java.lang.String privacyIconUrl, com.json.di imageLoader) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            if (privacyIconUrl == null) {
                return a(context);
            }
            java.lang.Object objA = imageLoader.a(privacyIconUrl);
            if (kotlin.Result.m1307isFailureimpl(objA)) {
                objA = null;
            }
            android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) objA;
            if (drawable == null) {
                return a(context);
            }
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            imageView.setImageDrawable(drawable);
            return imageView;
        }
    }
}
