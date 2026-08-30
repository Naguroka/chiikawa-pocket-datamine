package com.google.android.material.badge;

/* JADX INFO: loaded from: classes5.dex */
public final class BadgeState {
    private static final java.lang.String BADGE_RESOURCE_TAG = "badge";
    private static final int DEFAULT_MAX_BADGE_CHARACTER_COUNT = 4;
    final float badgeRadius;
    final float badgeWidePadding;
    final float badgeWithTextRadius;
    private final com.google.android.material.badge.BadgeState.State currentState;
    private final com.google.android.material.badge.BadgeState.State overridingState;

    BadgeState(android.content.Context context, int i, int i2, int i3, com.google.android.material.badge.BadgeState.State state) {
        java.lang.CharSequence string;
        int i4;
        int i5;
        int i6;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        com.google.android.material.badge.BadgeState.State state2 = new com.google.android.material.badge.BadgeState.State();
        this.currentState = state2;
        state = state == null ? new com.google.android.material.badge.BadgeState.State() : state;
        if (i != 0) {
            state.badgeResId = i;
        }
        android.content.res.TypedArray typedArrayGenerateTypedArray = generateTypedArray(context, state.badgeResId, i2, i3);
        android.content.res.Resources resources = context.getResources();
        this.badgeRadius = typedArrayGenerateTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.Badge_badgeRadius, resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_badge_radius));
        this.badgeWidePadding = typedArrayGenerateTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.badgeWithTextRadius = typedArrayGenerateTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.Badge_badgeWithTextRadius, resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_badge_with_text_radius));
        state2.alpha = state.alpha == -2 ? 255 : state.alpha;
        if (state.contentDescriptionNumberless == null) {
            string = context.getString(com.google.android.material.R.string.mtrl_badge_numberless_content_description);
        } else {
            string = state.contentDescriptionNumberless;
        }
        state2.contentDescriptionNumberless = string;
        if (state.contentDescriptionQuantityStrings == 0) {
            i4 = com.google.android.material.R.plurals.mtrl_badge_content_description;
        } else {
            i4 = state.contentDescriptionQuantityStrings;
        }
        state2.contentDescriptionQuantityStrings = i4;
        if (state.contentDescriptionExceedsMaxBadgeNumberRes == 0) {
            i5 = com.google.android.material.R.string.mtrl_exceed_max_badge_number_content_description;
        } else {
            i5 = state.contentDescriptionExceedsMaxBadgeNumberRes;
        }
        state2.contentDescriptionExceedsMaxBadgeNumberRes = i5;
        state2.isVisible = java.lang.Boolean.valueOf(state.isVisible == null || state.isVisible.booleanValue());
        if (state.maxCharacterCount == -2) {
            i6 = typedArrayGenerateTypedArray.getInt(com.google.android.material.R.styleable.Badge_maxCharacterCount, 4);
        } else {
            i6 = state.maxCharacterCount;
        }
        state2.maxCharacterCount = i6;
        if (state.number == -2) {
            if (typedArrayGenerateTypedArray.hasValue(com.google.android.material.R.styleable.Badge_number)) {
                state2.number = typedArrayGenerateTypedArray.getInt(com.google.android.material.R.styleable.Badge_number, 0);
            } else {
                state2.number = -1;
            }
        } else {
            state2.number = state.number;
        }
        if (state.backgroundColor == null) {
            iIntValue = readColorFromAttributes(context, typedArrayGenerateTypedArray, com.google.android.material.R.styleable.Badge_backgroundColor);
        } else {
            iIntValue = state.backgroundColor.intValue();
        }
        state2.backgroundColor = java.lang.Integer.valueOf(iIntValue);
        if (state.badgeTextColor == null) {
            if (typedArrayGenerateTypedArray.hasValue(com.google.android.material.R.styleable.Badge_badgeTextColor)) {
                state2.badgeTextColor = java.lang.Integer.valueOf(readColorFromAttributes(context, typedArrayGenerateTypedArray, com.google.android.material.R.styleable.Badge_badgeTextColor));
            } else {
                state2.badgeTextColor = java.lang.Integer.valueOf(new com.google.android.material.resources.TextAppearance(context, com.google.android.material.R.style.TextAppearance_MaterialComponents_Badge).getTextColor().getDefaultColor());
            }
        } else {
            state2.badgeTextColor = state.badgeTextColor;
        }
        if (state.badgeGravity == null) {
            iIntValue2 = typedArrayGenerateTypedArray.getInt(com.google.android.material.R.styleable.Badge_badgeGravity, 8388661);
        } else {
            iIntValue2 = state.badgeGravity.intValue();
        }
        state2.badgeGravity = java.lang.Integer.valueOf(iIntValue2);
        if (state.horizontalOffsetWithoutText == null) {
            iIntValue3 = typedArrayGenerateTypedArray.getDimensionPixelOffset(com.google.android.material.R.styleable.Badge_horizontalOffset, 0);
        } else {
            iIntValue3 = state.horizontalOffsetWithoutText.intValue();
        }
        state2.horizontalOffsetWithoutText = java.lang.Integer.valueOf(iIntValue3);
        if (state.verticalOffsetWithoutText == null) {
            iIntValue4 = typedArrayGenerateTypedArray.getDimensionPixelOffset(com.google.android.material.R.styleable.Badge_verticalOffset, 0);
        } else {
            iIntValue4 = state.verticalOffsetWithoutText.intValue();
        }
        state2.verticalOffsetWithoutText = java.lang.Integer.valueOf(iIntValue4);
        if (state.horizontalOffsetWithText == null) {
            iIntValue5 = typedArrayGenerateTypedArray.getDimensionPixelOffset(com.google.android.material.R.styleable.Badge_horizontalOffsetWithText, state2.horizontalOffsetWithoutText.intValue());
        } else {
            iIntValue5 = state.horizontalOffsetWithText.intValue();
        }
        state2.horizontalOffsetWithText = java.lang.Integer.valueOf(iIntValue5);
        if (state.verticalOffsetWithText == null) {
            iIntValue6 = typedArrayGenerateTypedArray.getDimensionPixelOffset(com.google.android.material.R.styleable.Badge_verticalOffsetWithText, state2.verticalOffsetWithoutText.intValue());
        } else {
            iIntValue6 = state.verticalOffsetWithText.intValue();
        }
        state2.verticalOffsetWithText = java.lang.Integer.valueOf(iIntValue6);
        state2.additionalHorizontalOffset = java.lang.Integer.valueOf(state.additionalHorizontalOffset == null ? 0 : state.additionalHorizontalOffset.intValue());
        state2.additionalVerticalOffset = java.lang.Integer.valueOf(state.additionalVerticalOffset != null ? state.additionalVerticalOffset.intValue() : 0);
        typedArrayGenerateTypedArray.recycle();
        if (state.numberLocale == null) {
            state2.numberLocale = java.util.Locale.getDefault(java.util.Locale.Category.FORMAT);
        } else {
            state2.numberLocale = state.numberLocale;
        }
        this.overridingState = state;
    }

    private android.content.res.TypedArray generateTypedArray(android.content.Context context, int i, int i2, int i3) {
        android.util.AttributeSet attributeSet;
        int styleAttribute;
        if (i != 0) {
            android.util.AttributeSet drawableXml = com.google.android.material.drawable.DrawableUtils.parseDrawableXml(context, i, BADGE_RESOURCE_TAG);
            styleAttribute = drawableXml.getStyleAttribute();
            attributeSet = drawableXml;
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        return com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, attributeSet, com.google.android.material.R.styleable.Badge, i2, styleAttribute == 0 ? i3 : styleAttribute, new int[0]);
    }

    com.google.android.material.badge.BadgeState.State getOverridingState() {
        return this.overridingState;
    }

    boolean isVisible() {
        return this.currentState.isVisible.booleanValue();
    }

    void setVisible(boolean z) {
        this.overridingState.isVisible = java.lang.Boolean.valueOf(z);
        this.currentState.isVisible = java.lang.Boolean.valueOf(z);
    }

    boolean hasNumber() {
        return this.currentState.number != -1;
    }

    int getNumber() {
        return this.currentState.number;
    }

    void setNumber(int i) {
        this.overridingState.number = i;
        this.currentState.number = i;
    }

    void clearNumber() {
        setNumber(-1);
    }

    int getAlpha() {
        return this.currentState.alpha;
    }

    void setAlpha(int i) {
        this.overridingState.alpha = i;
        this.currentState.alpha = i;
    }

    int getMaxCharacterCount() {
        return this.currentState.maxCharacterCount;
    }

    void setMaxCharacterCount(int i) {
        this.overridingState.maxCharacterCount = i;
        this.currentState.maxCharacterCount = i;
    }

    int getBackgroundColor() {
        return this.currentState.backgroundColor.intValue();
    }

    void setBackgroundColor(int i) {
        this.overridingState.backgroundColor = java.lang.Integer.valueOf(i);
        this.currentState.backgroundColor = java.lang.Integer.valueOf(i);
    }

    int getBadgeTextColor() {
        return this.currentState.badgeTextColor.intValue();
    }

    void setBadgeTextColor(int i) {
        this.overridingState.badgeTextColor = java.lang.Integer.valueOf(i);
        this.currentState.badgeTextColor = java.lang.Integer.valueOf(i);
    }

    int getBadgeGravity() {
        return this.currentState.badgeGravity.intValue();
    }

    void setBadgeGravity(int i) {
        this.overridingState.badgeGravity = java.lang.Integer.valueOf(i);
        this.currentState.badgeGravity = java.lang.Integer.valueOf(i);
    }

    int getHorizontalOffsetWithoutText() {
        return this.currentState.horizontalOffsetWithoutText.intValue();
    }

    void setHorizontalOffsetWithoutText(int i) {
        this.overridingState.horizontalOffsetWithoutText = java.lang.Integer.valueOf(i);
        this.currentState.horizontalOffsetWithoutText = java.lang.Integer.valueOf(i);
    }

    int getVerticalOffsetWithoutText() {
        return this.currentState.verticalOffsetWithoutText.intValue();
    }

    void setVerticalOffsetWithoutText(int i) {
        this.overridingState.verticalOffsetWithoutText = java.lang.Integer.valueOf(i);
        this.currentState.verticalOffsetWithoutText = java.lang.Integer.valueOf(i);
    }

    int getHorizontalOffsetWithText() {
        return this.currentState.horizontalOffsetWithText.intValue();
    }

    void setHorizontalOffsetWithText(int i) {
        this.overridingState.horizontalOffsetWithText = java.lang.Integer.valueOf(i);
        this.currentState.horizontalOffsetWithText = java.lang.Integer.valueOf(i);
    }

    int getVerticalOffsetWithText() {
        return this.currentState.verticalOffsetWithText.intValue();
    }

    void setVerticalOffsetWithText(int i) {
        this.overridingState.verticalOffsetWithText = java.lang.Integer.valueOf(i);
        this.currentState.verticalOffsetWithText = java.lang.Integer.valueOf(i);
    }

    int getAdditionalHorizontalOffset() {
        return this.currentState.additionalHorizontalOffset.intValue();
    }

    void setAdditionalHorizontalOffset(int i) {
        this.overridingState.additionalHorizontalOffset = java.lang.Integer.valueOf(i);
        this.currentState.additionalHorizontalOffset = java.lang.Integer.valueOf(i);
    }

    int getAdditionalVerticalOffset() {
        return this.currentState.additionalVerticalOffset.intValue();
    }

    void setAdditionalVerticalOffset(int i) {
        this.overridingState.additionalVerticalOffset = java.lang.Integer.valueOf(i);
        this.currentState.additionalVerticalOffset = java.lang.Integer.valueOf(i);
    }

    java.lang.CharSequence getContentDescriptionNumberless() {
        return this.currentState.contentDescriptionNumberless;
    }

    void setContentDescriptionNumberless(java.lang.CharSequence charSequence) {
        this.overridingState.contentDescriptionNumberless = charSequence;
        this.currentState.contentDescriptionNumberless = charSequence;
    }

    int getContentDescriptionQuantityStrings() {
        return this.currentState.contentDescriptionQuantityStrings;
    }

    void setContentDescriptionQuantityStringsResource(int i) {
        this.overridingState.contentDescriptionQuantityStrings = i;
        this.currentState.contentDescriptionQuantityStrings = i;
    }

    int getContentDescriptionExceedsMaxBadgeNumberStringResource() {
        return this.currentState.contentDescriptionExceedsMaxBadgeNumberRes;
    }

    void setContentDescriptionExceedsMaxBadgeNumberStringResource(int i) {
        this.overridingState.contentDescriptionExceedsMaxBadgeNumberRes = i;
        this.currentState.contentDescriptionExceedsMaxBadgeNumberRes = i;
    }

    java.util.Locale getNumberLocale() {
        return this.currentState.numberLocale;
    }

    void setNumberLocale(java.util.Locale locale) {
        this.overridingState.numberLocale = locale;
        this.currentState.numberLocale = locale;
    }

    private static int readColorFromAttributes(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        return com.google.android.material.resources.MaterialResources.getColorStateList(context, typedArray, i).getDefaultColor();
    }

    public static final class State implements android.os.Parcelable {
        private static final int BADGE_NUMBER_NONE = -1;
        public static final android.os.Parcelable.Creator<com.google.android.material.badge.BadgeState.State> CREATOR = new android.os.Parcelable.Creator<com.google.android.material.badge.BadgeState.State>() { // from class: com.google.android.material.badge.BadgeState.State.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.material.badge.BadgeState.State createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.badge.BadgeState.State(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.material.badge.BadgeState.State[] newArray(int i) {
                return new com.google.android.material.badge.BadgeState.State[i];
            }
        };
        private static final int NOT_SET = -2;
        private java.lang.Integer additionalHorizontalOffset;
        private java.lang.Integer additionalVerticalOffset;
        private int alpha;
        private java.lang.Integer backgroundColor;
        private java.lang.Integer badgeGravity;
        private int badgeResId;
        private java.lang.Integer badgeTextColor;
        private int contentDescriptionExceedsMaxBadgeNumberRes;
        private java.lang.CharSequence contentDescriptionNumberless;
        private int contentDescriptionQuantityStrings;
        private java.lang.Integer horizontalOffsetWithText;
        private java.lang.Integer horizontalOffsetWithoutText;
        private java.lang.Boolean isVisible;
        private int maxCharacterCount;
        private int number;
        private java.util.Locale numberLocale;
        private java.lang.Integer verticalOffsetWithText;
        private java.lang.Integer verticalOffsetWithoutText;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public State() {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.isVisible = true;
        }

        State(android.os.Parcel parcel) {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.isVisible = true;
            this.badgeResId = parcel.readInt();
            this.backgroundColor = (java.lang.Integer) parcel.readSerializable();
            this.badgeTextColor = (java.lang.Integer) parcel.readSerializable();
            this.alpha = parcel.readInt();
            this.number = parcel.readInt();
            this.maxCharacterCount = parcel.readInt();
            this.contentDescriptionNumberless = parcel.readString();
            this.contentDescriptionQuantityStrings = parcel.readInt();
            this.badgeGravity = (java.lang.Integer) parcel.readSerializable();
            this.horizontalOffsetWithoutText = (java.lang.Integer) parcel.readSerializable();
            this.verticalOffsetWithoutText = (java.lang.Integer) parcel.readSerializable();
            this.horizontalOffsetWithText = (java.lang.Integer) parcel.readSerializable();
            this.verticalOffsetWithText = (java.lang.Integer) parcel.readSerializable();
            this.additionalHorizontalOffset = (java.lang.Integer) parcel.readSerializable();
            this.additionalVerticalOffset = (java.lang.Integer) parcel.readSerializable();
            this.isVisible = (java.lang.Boolean) parcel.readSerializable();
            this.numberLocale = (java.util.Locale) parcel.readSerializable();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.badgeResId);
            parcel.writeSerializable(this.backgroundColor);
            parcel.writeSerializable(this.badgeTextColor);
            parcel.writeInt(this.alpha);
            parcel.writeInt(this.number);
            parcel.writeInt(this.maxCharacterCount);
            java.lang.CharSequence charSequence = this.contentDescriptionNumberless;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.contentDescriptionQuantityStrings);
            parcel.writeSerializable(this.badgeGravity);
            parcel.writeSerializable(this.horizontalOffsetWithoutText);
            parcel.writeSerializable(this.verticalOffsetWithoutText);
            parcel.writeSerializable(this.horizontalOffsetWithText);
            parcel.writeSerializable(this.verticalOffsetWithText);
            parcel.writeSerializable(this.additionalHorizontalOffset);
            parcel.writeSerializable(this.additionalVerticalOffset);
            parcel.writeSerializable(this.isVisible);
            parcel.writeSerializable(this.numberLocale);
        }
    }
}
