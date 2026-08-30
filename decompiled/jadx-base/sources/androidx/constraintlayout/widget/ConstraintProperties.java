package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProperties {
    public static final int BASELINE = 5;
    public static final int BOTTOM = 4;
    public static final int END = 7;
    public static final int LEFT = 1;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int PARENT_ID = 0;
    public static final int RIGHT = 2;
    public static final int START = 6;
    public static final int TOP = 3;
    public static final int UNSET = -1;
    public static final int WRAP_CONTENT = -2;
    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams mParams;
    android.view.View mView;

    private java.lang.String sideToString(int side) {
        switch (side) {
            case 1:
                return androidx.media3.extractor.text.ttml.TtmlNode.LEFT;
            case 2:
                return androidx.media3.extractor.text.ttml.TtmlNode.RIGHT;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return androidx.media3.extractor.text.ttml.TtmlNode.START;
            case 7:
                return androidx.media3.extractor.text.ttml.TtmlNode.END;
            default:
                return com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN;
        }
    }

    public void apply() {
    }

    public androidx.constraintlayout.widget.ConstraintProperties scaleY(float scaleY) {
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties center(int firstID, int firstSide, int firstMargin, int secondId, int secondSide, int secondMargin, float bias) {
        if (firstMargin < 0) {
            throw new java.lang.IllegalArgumentException("margin must be > 0");
        }
        if (secondMargin < 0) {
            throw new java.lang.IllegalArgumentException("margin must be > 0");
        }
        if (bias <= 0.0f || bias > 1.0f) {
            throw new java.lang.IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (firstSide == 1 || firstSide == 2) {
            connect(1, firstID, firstSide, firstMargin);
            connect(2, secondId, secondSide, secondMargin);
            this.mParams.horizontalBias = bias;
        } else if (firstSide == 6 || firstSide == 7) {
            connect(6, firstID, firstSide, firstMargin);
            connect(7, secondId, secondSide, secondMargin);
            this.mParams.horizontalBias = bias;
        } else {
            connect(3, firstID, firstSide, firstMargin);
            connect(4, secondId, secondSide, secondMargin);
            this.mParams.verticalBias = bias;
        }
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerHorizontally(int leftId, int leftSide, int leftMargin, int rightId, int rightSide, int rightMargin, float bias) {
        connect(1, leftId, leftSide, leftMargin);
        connect(2, rightId, rightSide, rightMargin);
        this.mParams.horizontalBias = bias;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerHorizontallyRtl(int startId, int startSide, int startMargin, int endId, int endSide, int endMargin, float bias) {
        connect(6, startId, startSide, startMargin);
        connect(7, endId, endSide, endMargin);
        this.mParams.horizontalBias = bias;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerVertically(int topId, int topSide, int topMargin, int bottomId, int bottomSide, int bottomMargin, float bias) {
        connect(3, topId, topSide, topMargin);
        connect(4, bottomId, bottomSide, bottomMargin);
        this.mParams.verticalBias = bias;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerHorizontally(int toView) {
        if (toView == 0) {
            center(0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            center(toView, 2, 0, toView, 1, 0, 0.5f);
        }
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerHorizontallyRtl(int toView) {
        if (toView == 0) {
            center(0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            center(toView, 7, 0, toView, 6, 0, 0.5f);
        }
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerVertically(int toView) {
        if (toView == 0) {
            center(0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            center(toView, 4, 0, toView, 3, 0, 0.5f);
        }
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties removeConstraints(int anchor) {
        switch (anchor) {
            case 1:
                this.mParams.leftToRight = -1;
                this.mParams.leftToLeft = -1;
                this.mParams.leftMargin = -1;
                this.mParams.goneLeftMargin = Integer.MIN_VALUE;
                return this;
            case 2:
                this.mParams.rightToRight = -1;
                this.mParams.rightToLeft = -1;
                this.mParams.rightMargin = -1;
                this.mParams.goneRightMargin = Integer.MIN_VALUE;
                return this;
            case 3:
                this.mParams.topToBottom = -1;
                this.mParams.topToTop = -1;
                this.mParams.topMargin = -1;
                this.mParams.goneTopMargin = Integer.MIN_VALUE;
                return this;
            case 4:
                this.mParams.bottomToTop = -1;
                this.mParams.bottomToBottom = -1;
                this.mParams.bottomMargin = -1;
                this.mParams.goneBottomMargin = Integer.MIN_VALUE;
                return this;
            case 5:
                this.mParams.baselineToBaseline = -1;
                return this;
            case 6:
                this.mParams.startToEnd = -1;
                this.mParams.startToStart = -1;
                this.mParams.setMarginStart(-1);
                this.mParams.goneStartMargin = Integer.MIN_VALUE;
                return this;
            case 7:
                this.mParams.endToStart = -1;
                this.mParams.endToEnd = -1;
                this.mParams.setMarginEnd(-1);
                this.mParams.goneEndMargin = Integer.MIN_VALUE;
                return this;
            default:
                throw new java.lang.IllegalArgumentException("unknown constraint");
        }
    }

    public androidx.constraintlayout.widget.ConstraintProperties margin(int anchor, int value) {
        switch (anchor) {
            case 1:
                this.mParams.leftMargin = value;
                return this;
            case 2:
                this.mParams.rightMargin = value;
                return this;
            case 3:
                this.mParams.topMargin = value;
                return this;
            case 4:
                this.mParams.bottomMargin = value;
                return this;
            case 5:
                throw new java.lang.IllegalArgumentException("baseline does not support margins");
            case 6:
                this.mParams.setMarginStart(value);
                return this;
            case 7:
                this.mParams.setMarginEnd(value);
                return this;
            default:
                throw new java.lang.IllegalArgumentException("unknown constraint");
        }
    }

    public androidx.constraintlayout.widget.ConstraintProperties goneMargin(int anchor, int value) {
        switch (anchor) {
            case 1:
                this.mParams.goneLeftMargin = value;
                return this;
            case 2:
                this.mParams.goneRightMargin = value;
                return this;
            case 3:
                this.mParams.goneTopMargin = value;
                return this;
            case 4:
                this.mParams.goneBottomMargin = value;
                return this;
            case 5:
                throw new java.lang.IllegalArgumentException("baseline does not support margins");
            case 6:
                this.mParams.goneStartMargin = value;
                return this;
            case 7:
                this.mParams.goneEndMargin = value;
                return this;
            default:
                throw new java.lang.IllegalArgumentException("unknown constraint");
        }
    }

    public androidx.constraintlayout.widget.ConstraintProperties horizontalBias(float bias) {
        this.mParams.horizontalBias = bias;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties verticalBias(float bias) {
        this.mParams.verticalBias = bias;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties dimensionRatio(java.lang.String ratio) {
        this.mParams.dimensionRatio = ratio;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties visibility(int visibility) {
        this.mView.setVisibility(visibility);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties alpha(float alpha) {
        this.mView.setAlpha(alpha);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties elevation(float elevation) {
        this.mView.setElevation(elevation);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties rotation(float rotation) {
        this.mView.setRotation(rotation);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties rotationX(float rotationX) {
        this.mView.setRotationX(rotationX);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties rotationY(float rotationY) {
        this.mView.setRotationY(rotationY);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties scaleX(float scaleX) {
        this.mView.setScaleY(scaleX);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties transformPivotX(float transformPivotX) {
        this.mView.setPivotX(transformPivotX);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties transformPivotY(float transformPivotY) {
        this.mView.setPivotY(transformPivotY);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties transformPivot(float transformPivotX, float transformPivotY) {
        this.mView.setPivotX(transformPivotX);
        this.mView.setPivotY(transformPivotY);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties translationX(float translationX) {
        this.mView.setTranslationX(translationX);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties translationY(float translationY) {
        this.mView.setTranslationY(translationY);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties translation(float translationX, float translationY) {
        this.mView.setTranslationX(translationX);
        this.mView.setTranslationY(translationY);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties translationZ(float translationZ) {
        this.mView.setTranslationZ(translationZ);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainHeight(int height) {
        this.mParams.height = height;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainWidth(int width) {
        this.mParams.width = width;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainMaxHeight(int height) {
        this.mParams.matchConstraintMaxHeight = height;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainMaxWidth(int width) {
        this.mParams.matchConstraintMaxWidth = width;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainMinHeight(int height) {
        this.mParams.matchConstraintMinHeight = height;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainMinWidth(int width) {
        this.mParams.matchConstraintMinWidth = width;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainDefaultHeight(int height) {
        this.mParams.matchConstraintDefaultHeight = height;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainDefaultWidth(int width) {
        this.mParams.matchConstraintDefaultWidth = width;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties horizontalWeight(float weight) {
        this.mParams.horizontalWeight = weight;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties verticalWeight(float weight) {
        this.mParams.verticalWeight = weight;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties horizontalChainStyle(int chainStyle) {
        this.mParams.horizontalChainStyle = chainStyle;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties verticalChainStyle(int chainStyle) {
        this.mParams.verticalChainStyle = chainStyle;
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties addToHorizontalChain(int leftId, int rightId) {
        connect(1, leftId, leftId == 0 ? 1 : 2, 0);
        connect(2, rightId, rightId == 0 ? 2 : 1, 0);
        if (leftId != 0) {
            new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.mView.getParent()).findViewById(leftId)).connect(2, this.mView.getId(), 1, 0);
        }
        if (rightId != 0) {
            new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.mView.getParent()).findViewById(rightId)).connect(1, this.mView.getId(), 2, 0);
        }
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties addToHorizontalChainRTL(int leftId, int rightId) {
        connect(6, leftId, leftId == 0 ? 6 : 7, 0);
        connect(7, rightId, rightId == 0 ? 7 : 6, 0);
        if (leftId != 0) {
            new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.mView.getParent()).findViewById(leftId)).connect(7, this.mView.getId(), 6, 0);
        }
        if (rightId != 0) {
            new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.mView.getParent()).findViewById(rightId)).connect(6, this.mView.getId(), 7, 0);
        }
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties addToVerticalChain(int topId, int bottomId) {
        connect(3, topId, topId == 0 ? 3 : 4, 0);
        connect(4, bottomId, bottomId == 0 ? 4 : 3, 0);
        if (topId != 0) {
            new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.mView.getParent()).findViewById(topId)).connect(4, this.mView.getId(), 3, 0);
        }
        if (bottomId != 0) {
            new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.mView.getParent()).findViewById(bottomId)).connect(3, this.mView.getId(), 4, 0);
        }
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties removeFromVerticalChain() {
        int i = this.mParams.topToBottom;
        int i2 = this.mParams.bottomToTop;
        if (i != -1 || i2 != -1) {
            androidx.constraintlayout.widget.ConstraintProperties constraintProperties = new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.mView.getParent()).findViewById(i));
            androidx.constraintlayout.widget.ConstraintProperties constraintProperties2 = new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.mView.getParent()).findViewById(i2));
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = this.mParams;
            if (i != -1 && i2 != -1) {
                constraintProperties.connect(4, i2, 3, 0);
                constraintProperties2.connect(3, i, 4, 0);
            } else if (i != -1 || i2 != -1) {
                int i3 = layoutParams.bottomToBottom;
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = this.mParams;
                if (i3 != -1) {
                    constraintProperties.connect(4, layoutParams2.bottomToBottom, 4, 0);
                } else {
                    int i4 = layoutParams2.topToTop;
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams3 = this.mParams;
                    if (i4 != -1) {
                        constraintProperties2.connect(3, layoutParams3.topToTop, 3, 0);
                    }
                }
            }
        }
        removeConstraints(3);
        removeConstraints(4);
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties removeFromHorizontalChain() {
        int i = this.mParams.leftToRight;
        int i2 = this.mParams.rightToLeft;
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = this.mParams;
        if (i != -1 || i2 != -1) {
            androidx.constraintlayout.widget.ConstraintProperties constraintProperties = new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.mView.getParent()).findViewById(i));
            androidx.constraintlayout.widget.ConstraintProperties constraintProperties2 = new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.mView.getParent()).findViewById(i2));
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = this.mParams;
            if (i != -1 && i2 != -1) {
                constraintProperties.connect(2, i2, 1, 0);
                constraintProperties2.connect(1, i, 2, 0);
            } else if (i != -1 || i2 != -1) {
                int i3 = layoutParams2.rightToRight;
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams3 = this.mParams;
                if (i3 != -1) {
                    constraintProperties.connect(2, layoutParams3.rightToRight, 2, 0);
                } else {
                    int i4 = layoutParams3.leftToLeft;
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams4 = this.mParams;
                    if (i4 != -1) {
                        constraintProperties2.connect(1, layoutParams4.leftToLeft, 1, 0);
                    }
                }
            }
            removeConstraints(1);
            removeConstraints(2);
        } else {
            int i5 = layoutParams.startToEnd;
            int i6 = this.mParams.endToStart;
            if (i5 != -1 || i6 != -1) {
                androidx.constraintlayout.widget.ConstraintProperties constraintProperties3 = new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.mView.getParent()).findViewById(i5));
                androidx.constraintlayout.widget.ConstraintProperties constraintProperties4 = new androidx.constraintlayout.widget.ConstraintProperties(((android.view.ViewGroup) this.mView.getParent()).findViewById(i6));
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams5 = this.mParams;
                if (i5 != -1 && i6 != -1) {
                    constraintProperties3.connect(7, i6, 6, 0);
                    constraintProperties4.connect(6, i, 7, 0);
                } else if (i != -1 || i6 != -1) {
                    int i7 = layoutParams5.rightToRight;
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams6 = this.mParams;
                    if (i7 != -1) {
                        constraintProperties3.connect(7, layoutParams6.rightToRight, 7, 0);
                    } else {
                        int i8 = layoutParams6.leftToLeft;
                        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams7 = this.mParams;
                        if (i8 != -1) {
                            constraintProperties4.connect(6, layoutParams7.leftToLeft, 6, 0);
                        }
                    }
                }
            }
            removeConstraints(6);
            removeConstraints(7);
        }
        return this;
    }

    public androidx.constraintlayout.widget.ConstraintProperties connect(int startSide, int endID, int endSide, int margin) {
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    this.mParams.leftToLeft = endID;
                    this.mParams.leftToRight = -1;
                } else if (endSide == 2) {
                    this.mParams.leftToRight = endID;
                    this.mParams.leftToLeft = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("Left to " + sideToString(endSide) + " undefined");
                }
                this.mParams.leftMargin = margin;
                return this;
            case 2:
                if (endSide == 1) {
                    this.mParams.rightToLeft = endID;
                    this.mParams.rightToRight = -1;
                } else if (endSide == 2) {
                    this.mParams.rightToRight = endID;
                    this.mParams.rightToLeft = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                }
                this.mParams.rightMargin = margin;
                return this;
            case 3:
                if (endSide == 3) {
                    this.mParams.topToTop = endID;
                    this.mParams.topToBottom = -1;
                    this.mParams.baselineToBaseline = -1;
                    this.mParams.baselineToTop = -1;
                    this.mParams.baselineToBottom = -1;
                } else if (endSide == 4) {
                    this.mParams.topToBottom = endID;
                    this.mParams.topToTop = -1;
                    this.mParams.baselineToBaseline = -1;
                    this.mParams.baselineToTop = -1;
                    this.mParams.baselineToBottom = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                }
                this.mParams.topMargin = margin;
                return this;
            case 4:
                if (endSide == 4) {
                    this.mParams.bottomToBottom = endID;
                    this.mParams.bottomToTop = -1;
                    this.mParams.baselineToBaseline = -1;
                    this.mParams.baselineToTop = -1;
                    this.mParams.baselineToBottom = -1;
                } else if (endSide == 3) {
                    this.mParams.bottomToTop = endID;
                    this.mParams.bottomToBottom = -1;
                    this.mParams.baselineToBaseline = -1;
                    this.mParams.baselineToTop = -1;
                    this.mParams.baselineToBottom = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                }
                this.mParams.bottomMargin = margin;
                return this;
            case 5:
                if (endSide == 5) {
                    this.mParams.baselineToBaseline = endID;
                    this.mParams.bottomToBottom = -1;
                    this.mParams.bottomToTop = -1;
                    this.mParams.topToTop = -1;
                    this.mParams.topToBottom = -1;
                }
                if (endSide == 3) {
                    this.mParams.baselineToTop = endID;
                    this.mParams.bottomToBottom = -1;
                    this.mParams.bottomToTop = -1;
                    this.mParams.topToTop = -1;
                    this.mParams.topToBottom = -1;
                } else if (endSide == 4) {
                    this.mParams.baselineToBottom = endID;
                    this.mParams.bottomToBottom = -1;
                    this.mParams.bottomToTop = -1;
                    this.mParams.topToTop = -1;
                    this.mParams.topToBottom = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                }
                this.mParams.baselineMargin = margin;
                return this;
            case 6:
                if (endSide == 6) {
                    this.mParams.startToStart = endID;
                    this.mParams.startToEnd = -1;
                } else if (endSide == 7) {
                    this.mParams.startToEnd = endID;
                    this.mParams.startToStart = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                }
                this.mParams.setMarginStart(margin);
                return this;
            case 7:
                if (endSide == 7) {
                    this.mParams.endToEnd = endID;
                    this.mParams.endToStart = -1;
                } else if (endSide == 6) {
                    this.mParams.endToStart = endID;
                    this.mParams.endToEnd = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                }
                this.mParams.setMarginEnd(margin);
                return this;
            default:
                throw new java.lang.IllegalArgumentException(sideToString(startSide) + " to " + sideToString(endSide) + " unknown");
        }
    }

    public ConstraintProperties(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
            this.mParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
            this.mView = view;
            return;
        }
        throw new java.lang.RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
    }
}
