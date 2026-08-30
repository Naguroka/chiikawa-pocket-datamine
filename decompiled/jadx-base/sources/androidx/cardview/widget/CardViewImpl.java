package androidx.cardview.widget;

/* JADX INFO: loaded from: classes.dex */
interface CardViewImpl {
    android.content.res.ColorStateList getBackgroundColor(androidx.cardview.widget.CardViewDelegate cardViewDelegate);

    float getElevation(androidx.cardview.widget.CardViewDelegate cardViewDelegate);

    float getMaxElevation(androidx.cardview.widget.CardViewDelegate cardViewDelegate);

    float getMinHeight(androidx.cardview.widget.CardViewDelegate cardViewDelegate);

    float getMinWidth(androidx.cardview.widget.CardViewDelegate cardViewDelegate);

    float getRadius(androidx.cardview.widget.CardViewDelegate cardViewDelegate);

    void initStatic();

    void initialize(androidx.cardview.widget.CardViewDelegate cardViewDelegate, android.content.Context context, android.content.res.ColorStateList colorStateList, float f, float f2, float f3);

    void onCompatPaddingChanged(androidx.cardview.widget.CardViewDelegate cardViewDelegate);

    void onPreventCornerOverlapChanged(androidx.cardview.widget.CardViewDelegate cardViewDelegate);

    void setBackgroundColor(androidx.cardview.widget.CardViewDelegate cardViewDelegate, android.content.res.ColorStateList colorStateList);

    void setElevation(androidx.cardview.widget.CardViewDelegate cardViewDelegate, float f);

    void setMaxElevation(androidx.cardview.widget.CardViewDelegate cardViewDelegate, float f);

    void setRadius(androidx.cardview.widget.CardViewDelegate cardViewDelegate, float f);

    void updatePadding(androidx.cardview.widget.CardViewDelegate cardViewDelegate);
}
