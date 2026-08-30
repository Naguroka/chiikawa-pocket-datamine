package com.applovin.impl.sdk.nativeAd;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinStarRatingView extends android.view.View {
    private static final int DEFAULT_PADDING_DP = 2;
    private static final float DEFAULT_STROKE_WIDTH = 0.5f;
    private static final int DEFAULT_TOTAL_NUMBER_OF_STARS = 5;
    private static final float INTERNAL_ANGLE_OF_PENTAGON_RADIANS = 1.8849556f;
    private static final float SUM_OF_CENTRAL_ANGLES_IN_CIRCLE_RADIANS = 6.2831855f;
    private static final float TWELVE_OCLOCK_POSITION_RADIANS = 4.712389f;
    private static final android.graphics.Paint emptyStarPaint = new android.graphics.Paint(1);
    private static final android.graphics.Paint filledStarPaint = new android.graphics.Paint(1);
    private final float interStarsSpacingDp;
    private final float paddingDp;
    private float sideLength;
    private final java.lang.Double starRating;

    public AppLovinStarRatingView(java.lang.Double d, android.content.Context context) {
        super(context);
        this.starRating = d;
        this.paddingDp = com.applovin.sdk.AppLovinSdkUtils.dpToPx(context, 2);
        this.interStarsSpacingDp = com.applovin.sdk.AppLovinSdkUtils.dpToPx(context, 2);
        setupPaints();
    }

    private void drawEmptyStars(android.graphics.Canvas canvas, android.graphics.Path path) {
        canvas.drawPath(path, emptyStarPaint);
    }

    private void drawFilledStars(android.graphics.Canvas canvas, android.graphics.Path path) {
        if (this.starRating.doubleValue() == 0.0d) {
            return;
        }
        float fRoundUpToNearestHalfInt = (float) roundUpToNearestHalfInt(this.starRating.doubleValue());
        float f = fRoundUpToNearestHalfInt / 5.0f;
        float fCeil = (float) (((double) this.paddingDp) + (java.lang.Math.ceil(fRoundUpToNearestHalfInt - 1.0f) * ((double) this.interStarsSpacingDp)));
        canvas.clipPath(path);
        canvas.drawRect(new android.graphics.RectF(0.0f, 0.0f, fCeil + (f * 5.0f * this.sideLength), getHeight()), filledStarPaint);
    }

    private android.graphics.Path getCombinedPathForAllStarsWithSide(float f) {
        android.graphics.PointF pointF = new android.graphics.PointF(0.0f, this.paddingDp);
        float f2 = pointF.x + this.paddingDp;
        android.graphics.Path path = new android.graphics.Path();
        for (int i = 0; i < 5; i++) {
            float f3 = pointF.y;
            android.graphics.Path starPath = getStarPath(new android.graphics.RectF(f2, f3, f2 + f, f3 + f));
            f2 += this.interStarsSpacingDp + f;
            path.addPath(starPath);
        }
        return path;
    }

    private static float getDistanceBetweenPoints(android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        return (float) java.lang.Math.sqrt(java.lang.Math.pow(pointF.x - pointF2.x, 2.0d) + java.lang.Math.pow(pointF.y - pointF2.y, 2.0d));
    }

    private static android.graphics.PointF getMidpointBetweenPoints(android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        return new android.graphics.PointF((float) (((double) pointF.x) + (((double) (pointF2.x - pointF.x)) * 0.5d)), (float) (((double) pointF.y) + (((double) (pointF2.y - pointF.y)) * 0.5d)));
    }

    private android.graphics.Path getStarPath(android.graphics.RectF rectF) {
        android.graphics.PointF pointF = new android.graphics.PointF(rectF.centerX(), rectF.centerY());
        java.util.List<android.graphics.PointF> starPointsOnACircle = getStarPointsOnACircle(pointF, (float) (((double) rectF.width()) * 0.5d), TWELVE_OCLOCK_POSITION_RADIANS);
        android.graphics.PointF pointF2 = starPointsOnACircle.get(0);
        android.graphics.PointF midpointBetweenPoints = getMidpointBetweenPoints(pointF2, starPointsOnACircle.get(1));
        java.util.List<android.graphics.PointF> starPointsOnACircle2 = getStarPointsOnACircle(pointF, getDistanceBetweenPoints(pointF, midpointBetweenPoints) - ((float) (((double) getDistanceBetweenPoints(pointF2, midpointBetweenPoints)) / java.lang.Math.tan(0.9424778f))), 5.340708f);
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(pointF2.x, pointF2.y);
        for (int i = 0; i < 5; i++) {
            android.graphics.PointF pointF3 = starPointsOnACircle.get(i);
            android.graphics.PointF pointF4 = starPointsOnACircle2.get(i);
            path.lineTo(pointF3.x, pointF3.y);
            path.lineTo(pointF4.x, pointF4.y);
        }
        path.close();
        return path;
    }

    private java.util.List<android.graphics.PointF> getStarPointsOnACircle(android.graphics.PointF pointF, float f, float f2) {
        float f3 = SUM_OF_CENTRAL_ANGLES_IN_CIRCLE_RADIANS / 5;
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        for (int i = 0; i < 5; i++) {
            double d = f;
            double d2 = f2;
            arrayList.add(new android.graphics.PointF((float) (((double) pointF.x) + (java.lang.Math.cos(d2) * d)), (float) (((double) pointF.y) + (d * java.lang.Math.sin(d2)))));
            f2 += f3;
        }
        return arrayList;
    }

    private double getTotalHorizontalSpacing() {
        return (this.paddingDp * 2.0f) + (this.interStarsSpacingDp * 4.0f);
    }

    private double roundUpToNearestHalfInt(double d) {
        return java.lang.Math.ceil(d * 2.0d) / 2.0d;
    }

    private void setupPaints() {
        android.graphics.Paint paint = emptyStarPaint;
        paint.setColor(com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_starColor, getContext()));
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(0.5f);
        android.graphics.Paint paint2 = filledStarPaint;
        paint2.setColor(com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_starColor, getContext()));
        paint2.setStyle(android.graphics.Paint.Style.FILL);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        if (this.starRating == null) {
            return;
        }
        float fMin = (float) java.lang.Math.min((((double) getWidth()) - getTotalHorizontalSpacing()) / 5.0d, getHeight() - (this.paddingDp * 2.0f));
        this.sideLength = fMin;
        if (fMin <= 0.0f) {
            return;
        }
        android.graphics.Path combinedPathForAllStarsWithSide = getCombinedPathForAllStarsWithSide(fMin);
        drawEmptyStars(canvas, combinedPathForAllStarsWithSide);
        drawFilledStars(canvas, combinedPathForAllStarsWithSide);
    }
}
