package androidx.media3.common.text;

/* JADX INFO: loaded from: classes.dex */
public final class Cue {
    public static final int ANCHOR_TYPE_END = 2;
    public static final int ANCHOR_TYPE_MIDDLE = 1;
    public static final int ANCHOR_TYPE_START = 0;
    public static final float DIMEN_UNSET = -3.4028235E38f;
    public static final int LINE_TYPE_FRACTION = 0;
    public static final int LINE_TYPE_NUMBER = 1;
    public static final int TEXT_SIZE_TYPE_ABSOLUTE = 2;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL = 0;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL_IGNORE_PADDING = 1;
    public static final int TYPE_UNSET = Integer.MIN_VALUE;
    public static final int VERTICAL_TYPE_LR = 2;
    public static final int VERTICAL_TYPE_RL = 1;
    public final android.graphics.Bitmap bitmap;
    public final float bitmapHeight;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final android.text.Layout.Alignment multiRowAlignment;
    public final float position;
    public final int positionAnchor;
    public final float shearDegrees;
    public final float size;
    public final java.lang.CharSequence text;
    public final android.text.Layout.Alignment textAlignment;
    public final float textSize;
    public final int textSizeType;
    public final int verticalType;
    public final int windowColor;
    public final boolean windowColorSet;

    @java.lang.Deprecated
    public static final androidx.media3.common.text.Cue EMPTY = new androidx.media3.common.text.Cue.Builder().setText("").build();
    private static final java.lang.String FIELD_TEXT = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_CUSTOM_SPANS = androidx.media3.common.util.Util.intToStringMaxRadix(17);
    private static final java.lang.String FIELD_TEXT_ALIGNMENT = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_MULTI_ROW_ALIGNMENT = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_BITMAP_PARCELABLE = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_BITMAP_BYTES = androidx.media3.common.util.Util.intToStringMaxRadix(18);
    private static final java.lang.String FIELD_LINE = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String FIELD_LINE_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(5);
    private static final java.lang.String FIELD_LINE_ANCHOR = androidx.media3.common.util.Util.intToStringMaxRadix(6);
    private static final java.lang.String FIELD_POSITION = androidx.media3.common.util.Util.intToStringMaxRadix(7);
    private static final java.lang.String FIELD_POSITION_ANCHOR = androidx.media3.common.util.Util.intToStringMaxRadix(8);
    private static final java.lang.String FIELD_TEXT_SIZE_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(9);
    private static final java.lang.String FIELD_TEXT_SIZE = androidx.media3.common.util.Util.intToStringMaxRadix(10);
    private static final java.lang.String FIELD_SIZE = androidx.media3.common.util.Util.intToStringMaxRadix(11);
    private static final java.lang.String FIELD_BITMAP_HEIGHT = androidx.media3.common.util.Util.intToStringMaxRadix(12);
    private static final java.lang.String FIELD_WINDOW_COLOR = androidx.media3.common.util.Util.intToStringMaxRadix(13);
    private static final java.lang.String FIELD_WINDOW_COLOR_SET = androidx.media3.common.util.Util.intToStringMaxRadix(14);
    private static final java.lang.String FIELD_VERTICAL_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(15);
    private static final java.lang.String FIELD_SHEAR_DEGREES = androidx.media3.common.util.Util.intToStringMaxRadix(16);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AnchorType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LineType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TextSizeType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface VerticalType {
    }

    private Cue(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, android.text.Layout.Alignment alignment2, android.graphics.Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            androidx.media3.common.util.Assertions.checkNotNull(bitmap);
        } else {
            androidx.media3.common.util.Assertions.checkArgument(bitmap == null);
        }
        if (charSequence instanceof android.text.Spanned) {
            this.text = android.text.SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.text = charSequence.toString();
        } else {
            this.text = null;
        }
        this.textAlignment = alignment;
        this.multiRowAlignment = alignment2;
        this.bitmap = bitmap;
        this.line = f;
        this.lineType = i;
        this.lineAnchor = i2;
        this.position = f2;
        this.positionAnchor = i3;
        this.size = f4;
        this.bitmapHeight = f5;
        this.windowColorSet = z;
        this.windowColor = i5;
        this.textSizeType = i4;
        this.textSize = f3;
        this.verticalType = i6;
        this.shearDegrees = f6;
    }

    public androidx.media3.common.text.Cue.Builder buildUpon() {
        return new androidx.media3.common.text.Cue.Builder();
    }

    public boolean equals(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.text.Cue cue = (androidx.media3.common.text.Cue) obj;
        return android.text.TextUtils.equals(this.text, cue.text) && this.textAlignment == cue.textAlignment && this.multiRowAlignment == cue.multiRowAlignment && ((bitmap = this.bitmap) != null ? !((bitmap2 = cue.bitmap) == null || !bitmap.sameAs(bitmap2)) : cue.bitmap == null) && this.line == cue.line && this.lineType == cue.lineType && this.lineAnchor == cue.lineAnchor && this.position == cue.position && this.positionAnchor == cue.positionAnchor && this.size == cue.size && this.bitmapHeight == cue.bitmapHeight && this.windowColorSet == cue.windowColorSet && this.windowColor == cue.windowColor && this.textSizeType == cue.textSizeType && this.textSize == cue.textSize && this.verticalType == cue.verticalType && this.shearDegrees == cue.shearDegrees;
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(this.text, this.textAlignment, this.multiRowAlignment, this.bitmap, java.lang.Float.valueOf(this.line), java.lang.Integer.valueOf(this.lineType), java.lang.Integer.valueOf(this.lineAnchor), java.lang.Float.valueOf(this.position), java.lang.Integer.valueOf(this.positionAnchor), java.lang.Float.valueOf(this.size), java.lang.Float.valueOf(this.bitmapHeight), java.lang.Boolean.valueOf(this.windowColorSet), java.lang.Integer.valueOf(this.windowColor), java.lang.Integer.valueOf(this.textSizeType), java.lang.Float.valueOf(this.textSize), java.lang.Integer.valueOf(this.verticalType), java.lang.Float.valueOf(this.shearDegrees));
    }

    public static final class Builder {
        private android.graphics.Bitmap bitmap;
        private float bitmapHeight;
        private float line;
        private int lineAnchor;
        private int lineType;
        private android.text.Layout.Alignment multiRowAlignment;
        private float position;
        private int positionAnchor;
        private float shearDegrees;
        private float size;
        private java.lang.CharSequence text;
        private android.text.Layout.Alignment textAlignment;
        private float textSize;
        private int textSizeType;
        private int verticalType;
        private int windowColor;
        private boolean windowColorSet;

        public Builder() {
            this.text = null;
            this.bitmap = null;
            this.textAlignment = null;
            this.multiRowAlignment = null;
            this.line = -3.4028235E38f;
            this.lineType = Integer.MIN_VALUE;
            this.lineAnchor = Integer.MIN_VALUE;
            this.position = -3.4028235E38f;
            this.positionAnchor = Integer.MIN_VALUE;
            this.textSizeType = Integer.MIN_VALUE;
            this.textSize = -3.4028235E38f;
            this.size = -3.4028235E38f;
            this.bitmapHeight = -3.4028235E38f;
            this.windowColorSet = false;
            this.windowColor = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
            this.verticalType = Integer.MIN_VALUE;
        }

        private Builder(androidx.media3.common.text.Cue cue) {
            this.text = cue.text;
            this.bitmap = cue.bitmap;
            this.textAlignment = cue.textAlignment;
            this.multiRowAlignment = cue.multiRowAlignment;
            this.line = cue.line;
            this.lineType = cue.lineType;
            this.lineAnchor = cue.lineAnchor;
            this.position = cue.position;
            this.positionAnchor = cue.positionAnchor;
            this.textSizeType = cue.textSizeType;
            this.textSize = cue.textSize;
            this.size = cue.size;
            this.bitmapHeight = cue.bitmapHeight;
            this.windowColorSet = cue.windowColorSet;
            this.windowColor = cue.windowColor;
            this.verticalType = cue.verticalType;
            this.shearDegrees = cue.shearDegrees;
        }

        public androidx.media3.common.text.Cue.Builder setText(java.lang.CharSequence charSequence) {
            this.text = charSequence;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public java.lang.CharSequence getText() {
            return this.text;
        }

        public androidx.media3.common.text.Cue.Builder setBitmap(android.graphics.Bitmap bitmap) {
            this.bitmap = bitmap;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public androidx.media3.common.text.Cue.Builder setTextAlignment(android.text.Layout.Alignment alignment) {
            this.textAlignment = alignment;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public android.text.Layout.Alignment getTextAlignment() {
            return this.textAlignment;
        }

        public androidx.media3.common.text.Cue.Builder setMultiRowAlignment(android.text.Layout.Alignment alignment) {
            this.multiRowAlignment = alignment;
            return this;
        }

        public androidx.media3.common.text.Cue.Builder setLine(float f, int i) {
            this.line = f;
            this.lineType = i;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public float getLine() {
            return this.line;
        }

        @org.checkerframework.dataflow.qual.Pure
        public int getLineType() {
            return this.lineType;
        }

        public androidx.media3.common.text.Cue.Builder setLineAnchor(int i) {
            this.lineAnchor = i;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public int getLineAnchor() {
            return this.lineAnchor;
        }

        public androidx.media3.common.text.Cue.Builder setPosition(float f) {
            this.position = f;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public float getPosition() {
            return this.position;
        }

        public androidx.media3.common.text.Cue.Builder setPositionAnchor(int i) {
            this.positionAnchor = i;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public int getPositionAnchor() {
            return this.positionAnchor;
        }

        public androidx.media3.common.text.Cue.Builder setTextSize(float f, int i) {
            this.textSize = f;
            this.textSizeType = i;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public int getTextSizeType() {
            return this.textSizeType;
        }

        @org.checkerframework.dataflow.qual.Pure
        public float getTextSize() {
            return this.textSize;
        }

        public androidx.media3.common.text.Cue.Builder setSize(float f) {
            this.size = f;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public float getSize() {
            return this.size;
        }

        public androidx.media3.common.text.Cue.Builder setBitmapHeight(float f) {
            this.bitmapHeight = f;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public float getBitmapHeight() {
            return this.bitmapHeight;
        }

        public androidx.media3.common.text.Cue.Builder setWindowColor(int i) {
            this.windowColor = i;
            this.windowColorSet = true;
            return this;
        }

        public androidx.media3.common.text.Cue.Builder clearWindowColor() {
            this.windowColorSet = false;
            return this;
        }

        public boolean isWindowColorSet() {
            return this.windowColorSet;
        }

        @org.checkerframework.dataflow.qual.Pure
        public int getWindowColor() {
            return this.windowColor;
        }

        public androidx.media3.common.text.Cue.Builder setVerticalType(int i) {
            this.verticalType = i;
            return this;
        }

        public androidx.media3.common.text.Cue.Builder setShearDegrees(float f) {
            this.shearDegrees = f;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public int getVerticalType() {
            return this.verticalType;
        }

        public androidx.media3.common.text.Cue build() {
            return new androidx.media3.common.text.Cue(this.text, this.textAlignment, this.multiRowAlignment, this.bitmap, this.line, this.lineType, this.lineAnchor, this.position, this.positionAnchor, this.textSizeType, this.textSize, this.size, this.bitmapHeight, this.windowColorSet, this.windowColor, this.verticalType, this.shearDegrees);
        }
    }

    public android.os.Bundle toSerializableBundle() {
        android.os.Bundle bundleWithoutBitmap = toBundleWithoutBitmap();
        if (this.bitmap != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            androidx.media3.common.util.Assertions.checkState(this.bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleWithoutBitmap.putByteArray(FIELD_BITMAP_BYTES, byteArrayOutputStream.toByteArray());
        }
        return bundleWithoutBitmap;
    }

    public android.os.Bundle toBinderBasedBundle() {
        android.os.Bundle bundleWithoutBitmap = toBundleWithoutBitmap();
        android.graphics.Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            bundleWithoutBitmap.putParcelable(FIELD_BITMAP_PARCELABLE, bitmap);
        }
        return bundleWithoutBitmap;
    }

    @java.lang.Deprecated
    public android.os.Bundle toBundle() {
        return toBinderBasedBundle();
    }

    private android.os.Bundle toBundleWithoutBitmap() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.CharSequence charSequence = this.text;
        if (charSequence != null) {
            bundle.putCharSequence(FIELD_TEXT, charSequence);
            java.lang.CharSequence charSequence2 = this.text;
            if (charSequence2 instanceof android.text.Spanned) {
                java.util.ArrayList<android.os.Bundle> arrayListBundleCustomSpans = androidx.media3.common.text.CustomSpanBundler.bundleCustomSpans((android.text.Spanned) charSequence2);
                if (!arrayListBundleCustomSpans.isEmpty()) {
                    bundle.putParcelableArrayList(FIELD_CUSTOM_SPANS, arrayListBundleCustomSpans);
                }
            }
        }
        bundle.putSerializable(FIELD_TEXT_ALIGNMENT, this.textAlignment);
        bundle.putSerializable(FIELD_MULTI_ROW_ALIGNMENT, this.multiRowAlignment);
        bundle.putFloat(FIELD_LINE, this.line);
        bundle.putInt(FIELD_LINE_TYPE, this.lineType);
        bundle.putInt(FIELD_LINE_ANCHOR, this.lineAnchor);
        bundle.putFloat(FIELD_POSITION, this.position);
        bundle.putInt(FIELD_POSITION_ANCHOR, this.positionAnchor);
        bundle.putInt(FIELD_TEXT_SIZE_TYPE, this.textSizeType);
        bundle.putFloat(FIELD_TEXT_SIZE, this.textSize);
        bundle.putFloat(FIELD_SIZE, this.size);
        bundle.putFloat(FIELD_BITMAP_HEIGHT, this.bitmapHeight);
        bundle.putBoolean(FIELD_WINDOW_COLOR_SET, this.windowColorSet);
        bundle.putInt(FIELD_WINDOW_COLOR, this.windowColor);
        bundle.putInt(FIELD_VERTICAL_TYPE, this.verticalType);
        bundle.putFloat(FIELD_SHEAR_DEGREES, this.shearDegrees);
        return bundle;
    }

    public static androidx.media3.common.text.Cue fromBundle(android.os.Bundle bundle) {
        androidx.media3.common.text.Cue.Builder builder = new androidx.media3.common.text.Cue.Builder();
        java.lang.CharSequence charSequence = bundle.getCharSequence(FIELD_TEXT);
        if (charSequence != null) {
            builder.setText(charSequence);
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_CUSTOM_SPANS);
            if (parcelableArrayList != null) {
                android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(charSequence);
                java.util.Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    androidx.media3.common.text.CustomSpanBundler.unbundleAndApplyCustomSpan((android.os.Bundle) it.next(), spannableStringValueOf);
                }
                builder.setText(spannableStringValueOf);
            }
        }
        android.text.Layout.Alignment alignment = (android.text.Layout.Alignment) bundle.getSerializable(FIELD_TEXT_ALIGNMENT);
        if (alignment != null) {
            builder.setTextAlignment(alignment);
        }
        android.text.Layout.Alignment alignment2 = (android.text.Layout.Alignment) bundle.getSerializable(FIELD_MULTI_ROW_ALIGNMENT);
        if (alignment2 != null) {
            builder.setMultiRowAlignment(alignment2);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) bundle.getParcelable(FIELD_BITMAP_PARCELABLE);
        if (bitmap != null) {
            builder.setBitmap(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(FIELD_BITMAP_BYTES);
            if (byteArray != null) {
                builder.setBitmap(android.graphics.BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        java.lang.String str = FIELD_LINE;
        if (bundle.containsKey(str)) {
            java.lang.String str2 = FIELD_LINE_TYPE;
            if (bundle.containsKey(str2)) {
                builder.setLine(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        java.lang.String str3 = FIELD_LINE_ANCHOR;
        if (bundle.containsKey(str3)) {
            builder.setLineAnchor(bundle.getInt(str3));
        }
        java.lang.String str4 = FIELD_POSITION;
        if (bundle.containsKey(str4)) {
            builder.setPosition(bundle.getFloat(str4));
        }
        java.lang.String str5 = FIELD_POSITION_ANCHOR;
        if (bundle.containsKey(str5)) {
            builder.setPositionAnchor(bundle.getInt(str5));
        }
        java.lang.String str6 = FIELD_TEXT_SIZE;
        if (bundle.containsKey(str6)) {
            java.lang.String str7 = FIELD_TEXT_SIZE_TYPE;
            if (bundle.containsKey(str7)) {
                builder.setTextSize(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        java.lang.String str8 = FIELD_SIZE;
        if (bundle.containsKey(str8)) {
            builder.setSize(bundle.getFloat(str8));
        }
        java.lang.String str9 = FIELD_BITMAP_HEIGHT;
        if (bundle.containsKey(str9)) {
            builder.setBitmapHeight(bundle.getFloat(str9));
        }
        java.lang.String str10 = FIELD_WINDOW_COLOR;
        if (bundle.containsKey(str10)) {
            builder.setWindowColor(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(FIELD_WINDOW_COLOR_SET, false)) {
            builder.clearWindowColor();
        }
        java.lang.String str11 = FIELD_VERTICAL_TYPE;
        if (bundle.containsKey(str11)) {
            builder.setVerticalType(bundle.getInt(str11));
        }
        java.lang.String str12 = FIELD_SHEAR_DEGREES;
        if (bundle.containsKey(str12)) {
            builder.setShearDegrees(bundle.getFloat(str12));
        }
        return builder.build();
    }
}
