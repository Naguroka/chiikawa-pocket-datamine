package androidx.cardview.widget;

/* JADX INFO: loaded from: classes.dex */
class CardViewApi17Impl extends androidx.cardview.widget.CardViewBaseImpl {
    CardViewApi17Impl() {
    }

    @Override // androidx.cardview.widget.CardViewBaseImpl, androidx.cardview.widget.CardViewImpl
    public void initStatic() {
        androidx.cardview.widget.RoundRectDrawableWithShadow.sRoundRectHelper = new androidx.cardview.widget.RoundRectDrawableWithShadow.RoundRectHelper() { // from class: androidx.cardview.widget.CardViewApi17Impl.1
            @Override // androidx.cardview.widget.RoundRectDrawableWithShadow.RoundRectHelper
            public void drawRoundRect(android.graphics.Canvas canvas, android.graphics.RectF rectF, float f, android.graphics.Paint paint) {
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        };
    }
}
