package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintSet {
    private static final int ALPHA = 43;
    private static final int ANIMATE_CIRCLE_ANGLE_TO = 82;
    private static final int ANIMATE_RELATIVE_TO = 64;
    private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
    private static final int BARRIER_DIRECTION = 72;
    private static final int BARRIER_MARGIN = 73;
    private static final int BARRIER_TYPE = 1;
    public static final int BASELINE = 5;
    private static final int BASELINE_MARGIN = 93;
    private static final int BASELINE_TO_BASELINE = 1;
    private static final int BASELINE_TO_BOTTOM = 92;
    private static final int BASELINE_TO_TOP = 91;
    public static final int BOTTOM = 4;
    private static final int BOTTOM_MARGIN = 2;
    private static final int BOTTOM_TO_BOTTOM = 3;
    private static final int BOTTOM_TO_TOP = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    private static final int CHAIN_USE_RTL = 71;
    private static final int CIRCLE = 61;
    private static final int CIRCLE_ANGLE = 63;
    private static final int CIRCLE_RADIUS = 62;
    public static final int CIRCLE_REFERENCE = 8;
    private static final int CONSTRAINED_HEIGHT = 81;
    private static final int CONSTRAINED_WIDTH = 80;
    private static final int CONSTRAINT_REFERENCED_IDS = 74;
    private static final int CONSTRAINT_TAG = 77;
    private static final boolean DEBUG = false;
    private static final int DIMENSION_RATIO = 5;
    private static final int DRAW_PATH = 66;
    private static final int EDITOR_ABSOLUTE_X = 6;
    private static final int EDITOR_ABSOLUTE_Y = 7;
    private static final int ELEVATION = 44;
    public static final int END = 7;
    private static final int END_MARGIN = 8;
    private static final int END_TO_END = 9;
    private static final int END_TO_START = 10;
    private static final java.lang.String ERROR_MESSAGE = "XML parser error must be within a Constraint ";
    public static final int GONE = 8;
    private static final int GONE_BASELINE_MARGIN = 94;
    private static final int GONE_BOTTOM_MARGIN = 11;
    private static final int GONE_END_MARGIN = 12;
    private static final int GONE_LEFT_MARGIN = 13;
    private static final int GONE_RIGHT_MARGIN = 14;
    private static final int GONE_START_MARGIN = 15;
    private static final int GONE_TOP_MARGIN = 16;
    private static final int GUIDELINE_USE_RTL = 99;
    private static final int GUIDE_BEGIN = 17;
    private static final int GUIDE_END = 18;
    private static final int GUIDE_PERCENT = 19;
    private static final int HEIGHT_DEFAULT = 55;
    private static final int HEIGHT_MAX = 57;
    private static final int HEIGHT_MIN = 59;
    private static final int HEIGHT_PERCENT = 70;
    public static final int HORIZONTAL = 0;
    private static final int HORIZONTAL_BIAS = 20;
    public static final int HORIZONTAL_GUIDELINE = 0;
    private static final int HORIZONTAL_STYLE = 41;
    private static final int HORIZONTAL_WEIGHT = 39;
    private static final int INTERNAL_MATCH_CONSTRAINT = -3;
    private static final int INTERNAL_MATCH_PARENT = -1;
    private static final int INTERNAL_WRAP_CONTENT = -2;
    private static final int INTERNAL_WRAP_CONTENT_CONSTRAINED = -4;
    public static final int INVISIBLE = 4;
    private static final java.lang.String KEY_PERCENT_PARENT = "parent";
    private static final java.lang.String KEY_RATIO = "ratio";
    private static final java.lang.String KEY_WEIGHT = "weight";
    private static final int LAYOUT_CONSTRAINT_HEIGHT = 96;
    private static final int LAYOUT_CONSTRAINT_WIDTH = 95;
    private static final int LAYOUT_HEIGHT = 21;
    private static final int LAYOUT_VISIBILITY = 22;
    private static final int LAYOUT_WIDTH = 23;
    private static final int LAYOUT_WRAP_BEHAVIOR = 97;
    public static final int LEFT = 1;
    private static final int LEFT_MARGIN = 24;
    private static final int LEFT_TO_LEFT = 25;
    private static final int LEFT_TO_RIGHT = 26;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    private static final int MOTION_STAGGER = 79;
    private static final int MOTION_TARGET = 98;
    private static final int ORIENTATION = 27;
    public static final int PARENT_ID = 0;
    private static final int PATH_MOTION_ARC = 76;
    private static final int PROGRESS = 68;
    private static final int QUANTIZE_MOTION_INTERPOLATOR = 86;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_ID = 89;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_STR = 90;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_TYPE = 88;
    private static final int QUANTIZE_MOTION_PHASE = 85;
    private static final int QUANTIZE_MOTION_STEPS = 84;
    public static final int RIGHT = 2;
    private static final int RIGHT_MARGIN = 28;
    private static final int RIGHT_TO_LEFT = 29;
    private static final int RIGHT_TO_RIGHT = 30;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    private static final int ROTATION = 60;
    private static final int ROTATION_X = 45;
    private static final int ROTATION_Y = 46;
    private static final int SCALE_X = 47;
    private static final int SCALE_Y = 48;
    public static final int START = 6;
    private static final int START_MARGIN = 31;
    private static final int START_TO_END = 32;
    private static final int START_TO_START = 33;
    private static final java.lang.String TAG = "ConstraintSet";
    public static final int TOP = 3;
    private static final int TOP_MARGIN = 34;
    private static final int TOP_TO_BOTTOM = 35;
    private static final int TOP_TO_TOP = 36;
    private static final int TRANSFORM_PIVOT_TARGET = 83;
    private static final int TRANSFORM_PIVOT_X = 49;
    private static final int TRANSFORM_PIVOT_Y = 50;
    private static final int TRANSITION_EASING = 65;
    private static final int TRANSITION_PATH_ROTATE = 67;
    private static final int TRANSLATION_X = 51;
    private static final int TRANSLATION_Y = 52;
    private static final int TRANSLATION_Z = 53;
    public static final int UNSET = -1;
    private static final int UNUSED = 87;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_BIAS = 37;
    public static final int VERTICAL_GUIDELINE = 1;
    private static final int VERTICAL_STYLE = 42;
    private static final int VERTICAL_WEIGHT = 40;
    private static final int VIEW_ID = 38;
    private static final int VISIBILITY_MODE = 78;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    private static final int WIDTH_DEFAULT = 54;
    private static final int WIDTH_MAX = 56;
    private static final int WIDTH_MIN = 58;
    private static final int WIDTH_PERCENT = 69;
    public static final int WRAP_CONTENT = -2;
    public java.lang.String mIdString;
    private boolean mValidate;
    private static final int[] VISIBILITY_FLAGS = {0, 4, 8};
    private static android.util.SparseIntArray mapToConstant = new android.util.SparseIntArray();
    private static android.util.SparseIntArray overrideMapToConstant = new android.util.SparseIntArray();
    public java.lang.String derivedState = "";
    public int mRotate = 0;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> mSavedAttributes = new java.util.HashMap<>();
    private boolean mForceId = true;
    private java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet.Constraint> mConstraints = new java.util.HashMap<>();

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

    static {
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBaseline_toTopOf, 91);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBaseline_toBottomOf, 92);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_editor_absoluteX, 6);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_editor_absoluteY, 7);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintGuide_begin, 17);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintGuide_end, 18);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintGuide_percent, 19);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_guidelineUseRtl, 99);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_orientation, 27);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginLeft, 13);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginTop, 16);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginRight, 14);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginBottom, 11);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginStart, 15);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginEnd, 12);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintVertical_weight, 40);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintVertical_bias, 37);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintLeft_creator, 87);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTop_creator, 87);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintRight_creator, 87);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBottom_creator, 87);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBaseline_creator, 87);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginLeft, 24);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginRight, 28);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginStart, 31);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginEnd, 8);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginTop, 34);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginBottom, 2);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_width, 23);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_height, 21);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth, 95);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight, 96);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_visibility, 22);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_alpha, 43);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_elevation, 44);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_rotationX, 45);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_rotationY, 46);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_rotation, 60);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_scaleX, 47);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_scaleY, 48);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_transformPivotX, 49);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_transformPivotY, 50);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_translationX, 51);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_translationY, 52);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_translationZ, 53);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_default, 54);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_default, 55);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_max, 56);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_max, 57);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_min, 58);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_min, 59);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintCircle, 61);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintCircleRadius, 62);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintCircleAngle, 63);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_animateRelativeTo, 64);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_transitionEasing, 65);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_drawPath, 66);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_transitionPathRotate, 67);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_motionStagger, 79);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_id, 38);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_motionProgress, 68);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_percent, 69);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_percent, 70);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_wrapBehaviorInParent, 97);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_chainUseRtl, 71);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_barrierDirection, 72);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_barrierMargin, 73);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_constraint_referenced_ids, 74);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_barrierAllowsGoneWidgets, 75);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_pathMotionArc, 76);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTag, 77);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_visibilityMode, 78);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constrainedWidth, 80);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constrainedHeight, 81);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_polarRelativeTo, 82);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_transformPivotTarget, 83);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_quantizeMotionSteps, 84);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_quantizeMotionPhase, 85);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_quantizeMotionInterpolator, 86);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_editor_absoluteY, 6);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_editor_absoluteY, 7);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_orientation, 27);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginLeft, 13);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginTop, 16);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginRight, 14);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginBottom, 11);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginStart, 15);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginEnd, 12);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintLeft_creator, 87);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintTop_creator, 87);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintRight_creator, 87);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintBottom_creator, 87);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintBaseline_creator, 87);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginLeft, 24);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginRight, 28);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginStart, 31);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginEnd, 8);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginTop, 34);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginBottom, 2);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_width, 23);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_height, 21);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintWidth, 95);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHeight, 96);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_visibility, 22);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_alpha, 43);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_elevation, 44);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_rotationX, 45);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_rotationY, 46);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_rotation, 60);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_scaleX, 47);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_scaleY, 48);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_transformPivotX, 49);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_transformPivotY, 50);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_translationX, 51);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_translationY, 52);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_translationZ, 53);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintWidth_default, 54);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHeight_default, 55);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintWidth_max, 56);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHeight_max, 57);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintWidth_min, 58);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHeight_min, 59);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintCircleRadius, 62);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintCircleAngle, 63);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_animateRelativeTo, 64);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_transitionEasing, 65);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_drawPath, 66);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_transitionPathRotate, 67);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_motionStagger, 79);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_id, 38);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_motionTarget, 98);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_motionProgress, 68);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintWidth_percent, 69);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHeight_percent, 70);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_chainUseRtl, 71);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_barrierDirection, 72);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_barrierMargin, 73);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_constraint_referenced_ids, 74);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_pathMotionArc, 76);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintTag, 77);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_visibilityMode, 78);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constrainedWidth, 80);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constrainedHeight, 81);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_polarRelativeTo, 82);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_transformPivotTarget, 83);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_quantizeMotionSteps, 84);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_quantizeMotionPhase, 85);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_quantizeMotionInterpolator, 86);
        overrideMapToConstant.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> getCustomAttributeSet() {
        return this.mSavedAttributes;
    }

    public androidx.constraintlayout.widget.ConstraintSet.Constraint getParameters(int mId) {
        return get(mId);
    }

    public void readFallback(androidx.constraintlayout.widget.ConstraintSet set) {
        for (java.lang.Integer num : set.mConstraints.keySet()) {
            int iIntValue = num.intValue();
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = set.mConstraints.get(num);
            if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(iIntValue))) {
                this.mConstraints.put(java.lang.Integer.valueOf(iIntValue), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
            }
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint2 = this.mConstraints.get(java.lang.Integer.valueOf(iIntValue));
            if (constraint2 != null) {
                if (!constraint2.layout.mApply) {
                    constraint2.layout.copyFrom(constraint.layout);
                }
                if (!constraint2.propertySet.mApply) {
                    constraint2.propertySet.copyFrom(constraint.propertySet);
                }
                if (!constraint2.transform.mApply) {
                    constraint2.transform.copyFrom(constraint.transform);
                }
                if (!constraint2.motion.mApply) {
                    constraint2.motion.copyFrom(constraint.motion);
                }
                for (java.lang.String str : constraint.mCustomConstraints.keySet()) {
                    if (!constraint2.mCustomConstraints.containsKey(str)) {
                        constraint2.mCustomConstraints.put(str, constraint.mCustomConstraints.get(str));
                    }
                }
            }
        }
    }

    public void readFallback(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.mForceId && id == -1) {
                throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(id))) {
                this.mConstraints.put(java.lang.Integer.valueOf(id), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
            }
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(id));
            if (constraint != null) {
                if (!constraint.layout.mApply) {
                    constraint.fillFrom(id, layoutParams);
                    if (childAt instanceof androidx.constraintlayout.widget.ConstraintHelper) {
                        constraint.layout.mReferenceIds = ((androidx.constraintlayout.widget.ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof androidx.constraintlayout.widget.Barrier) {
                            androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) childAt;
                            constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                            constraint.layout.mBarrierDirection = barrier.getType();
                            constraint.layout.mBarrierMargin = barrier.getMargin();
                        }
                    }
                    constraint.layout.mApply = true;
                }
                if (!constraint.propertySet.mApply) {
                    constraint.propertySet.visibility = childAt.getVisibility();
                    constraint.propertySet.alpha = childAt.getAlpha();
                    constraint.propertySet.mApply = true;
                }
                if (!constraint.transform.mApply) {
                    constraint.transform.mApply = true;
                    constraint.transform.rotation = childAt.getRotation();
                    constraint.transform.rotationX = childAt.getRotationX();
                    constraint.transform.rotationY = childAt.getRotationY();
                    constraint.transform.scaleX = childAt.getScaleX();
                    constraint.transform.scaleY = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        constraint.transform.transformPivotX = pivotX;
                        constraint.transform.transformPivotY = pivotY;
                    }
                    constraint.transform.translationX = childAt.getTranslationX();
                    constraint.transform.translationY = childAt.getTranslationY();
                    constraint.transform.translationZ = childAt.getTranslationZ();
                    if (constraint.transform.applyElevation) {
                        constraint.transform.elevation = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void applyDeltaFrom(androidx.constraintlayout.widget.ConstraintSet cs) {
        for (androidx.constraintlayout.widget.ConstraintSet.Constraint constraint : cs.mConstraints.values()) {
            if (constraint.mDelta != null) {
                if (constraint.mTargetString != null) {
                    java.util.Iterator<java.lang.Integer> it = this.mConstraints.keySet().iterator();
                    while (it.hasNext()) {
                        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint2 = getConstraint(it.next().intValue());
                        if (constraint2.layout.mConstraintTag != null && constraint.mTargetString.matches(constraint2.layout.mConstraintTag)) {
                            constraint.mDelta.applyDelta(constraint2);
                            constraint2.mCustomConstraints.putAll((java.util.HashMap) constraint.mCustomConstraints.clone());
                        }
                    }
                } else {
                    constraint.mDelta.applyDelta(getConstraint(constraint.mViewId));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0031  */
    /* JADX WARN: Code duplicated, block: B:23:0x0035  */
    /* JADX WARN: Code duplicated, block: B:24:0x003a  */
    /* JADX WARN: Code duplicated, block: B:25:0x003f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0043  */
    /* JADX WARN: Code duplicated, block: B:29:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    static void parseDimensionConstraints(java.lang.Object data, android.content.res.TypedArray a2, int attr, int orientation) {
        int dimensionPixelSize;
        boolean z;
        androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta delta;
        androidx.constraintlayout.widget.ConstraintSet.Layout layout;
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams;
        if (data == null) {
            return;
        }
        int i = a2.peekValue(attr).type;
        if (i == 3) {
            parseDimensionConstraintsString(data, a2.getString(attr), orientation);
            return;
        }
        int i2 = 0;
        if (i == 5) {
            dimensionPixelSize = a2.getDimensionPixelSize(attr, 0);
        } else {
            dimensionPixelSize = a2.getInt(attr, 0);
            if (dimensionPixelSize == -4) {
                z = true;
                i2 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z = false;
            }
            if (data instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
                layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) data;
                if (orientation == 0) {
                    layoutParams.width = i2;
                    layoutParams.constrainedWidth = z;
                    return;
                } else {
                    layoutParams.height = i2;
                    layoutParams.constrainedHeight = z;
                    return;
                }
            }
            if (data instanceof androidx.constraintlayout.widget.ConstraintSet.Layout) {
                layout = (androidx.constraintlayout.widget.ConstraintSet.Layout) data;
                if (orientation == 0) {
                    layout.mWidth = i2;
                    layout.constrainedWidth = z;
                    return;
                } else {
                    layout.mHeight = i2;
                    layout.constrainedHeight = z;
                    return;
                }
            }
            if (data instanceof androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) {
                delta = (androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) data;
                if (orientation == 0) {
                    delta.add(23, i2);
                    delta.add(80, z);
                } else {
                    delta.add(21, i2);
                    delta.add(81, z);
                }
            }
        }
        i2 = dimensionPixelSize;
        z = false;
        if (data instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
            layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) data;
            if (orientation == 0) {
                layoutParams.width = i2;
                layoutParams.constrainedWidth = z;
                return;
            } else {
                layoutParams.height = i2;
                layoutParams.constrainedHeight = z;
                return;
            }
        }
        if (data instanceof androidx.constraintlayout.widget.ConstraintSet.Layout) {
            layout = (androidx.constraintlayout.widget.ConstraintSet.Layout) data;
            if (orientation == 0) {
                layout.mWidth = i2;
                layout.constrainedWidth = z;
                return;
            } else {
                layout.mHeight = i2;
                layout.constrainedHeight = z;
                return;
            }
        }
        if (data instanceof androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) {
            delta = (androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) data;
            if (orientation == 0) {
                delta.add(23, i2);
                delta.add(80, z);
            } else {
                delta.add(21, i2);
                delta.add(81, z);
            }
        }
    }

    static void parseDimensionRatioString(androidx.constraintlayout.widget.ConstraintLayout.LayoutParams params, java.lang.String value) {
        float fAbs = Float.NaN;
        int i = -1;
        if (value != null) {
            int length = value.length();
            int iIndexOf = value.indexOf(44);
            int i2 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                java.lang.String strSubstring = value.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase(androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST)) {
                    i = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = iIndexOf + 1;
            }
            int iIndexOf2 = value.indexOf(58);
            try {
                if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                    java.lang.String strSubstring2 = value.substring(i2, iIndexOf2);
                    java.lang.String strSubstring3 = value.substring(iIndexOf2 + 1);
                    if (strSubstring2.length() > 0 && strSubstring3.length() > 0) {
                        float f = java.lang.Float.parseFloat(strSubstring2);
                        float f2 = java.lang.Float.parseFloat(strSubstring3);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i == 1) {
                                fAbs = java.lang.Math.abs(f2 / f);
                            } else {
                                fAbs = java.lang.Math.abs(f / f2);
                            }
                        }
                    }
                } else {
                    java.lang.String strSubstring4 = value.substring(i2);
                    if (strSubstring4.length() > 0) {
                        fAbs = java.lang.Float.parseFloat(strSubstring4);
                    }
                }
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        params.dimensionRatio = value;
        params.dimensionRatioValue = fAbs;
        params.dimensionRatioSide = i;
    }

    static void parseDimensionConstraintsString(java.lang.Object data, java.lang.String value, int orientation) {
        if (value == null) {
            return;
        }
        int iIndexOf = value.indexOf(61);
        int length = value.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        java.lang.String strSubstring = value.substring(0, iIndexOf);
        java.lang.String strSubstring2 = value.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            java.lang.String strTrim = strSubstring.trim();
            java.lang.String strTrim2 = strSubstring2.trim();
            if (KEY_RATIO.equalsIgnoreCase(strTrim)) {
                if (data instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) data;
                    if (orientation == 0) {
                        layoutParams.width = 0;
                    } else {
                        layoutParams.height = 0;
                    }
                    parseDimensionRatioString(layoutParams, strTrim2);
                    return;
                }
                if (data instanceof androidx.constraintlayout.widget.ConstraintSet.Layout) {
                    ((androidx.constraintlayout.widget.ConstraintSet.Layout) data).dimensionRatio = strTrim2;
                    return;
                } else {
                    if (data instanceof androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) {
                        ((androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) data).add(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if (KEY_WEIGHT.equalsIgnoreCase(strTrim)) {
                    float f = java.lang.Float.parseFloat(strTrim2);
                    if (data instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
                        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) data;
                        if (orientation == 0) {
                            layoutParams2.width = 0;
                            layoutParams2.horizontalWeight = f;
                        } else {
                            layoutParams2.height = 0;
                            layoutParams2.verticalWeight = f;
                        }
                    } else if (data instanceof androidx.constraintlayout.widget.ConstraintSet.Layout) {
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout = (androidx.constraintlayout.widget.ConstraintSet.Layout) data;
                        if (orientation == 0) {
                            layout.mWidth = 0;
                            layout.horizontalWeight = f;
                        } else {
                            layout.mHeight = 0;
                            layout.verticalWeight = f;
                        }
                    } else if (data instanceof androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) {
                        androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta delta = (androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) data;
                        if (orientation == 0) {
                            delta.add(23, 0);
                            delta.add(39, f);
                        } else {
                            delta.add(21, 0);
                            delta.add(40, f);
                        }
                    }
                } else {
                    if (!KEY_PERCENT_PARENT.equalsIgnoreCase(strTrim)) {
                        return;
                    }
                    float fMax = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, java.lang.Float.parseFloat(strTrim2)));
                    if (data instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
                        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams3 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) data;
                        if (orientation == 0) {
                            layoutParams3.width = 0;
                            layoutParams3.matchConstraintPercentWidth = fMax;
                            layoutParams3.matchConstraintDefaultWidth = 2;
                        } else {
                            layoutParams3.height = 0;
                            layoutParams3.matchConstraintPercentHeight = fMax;
                            layoutParams3.matchConstraintDefaultHeight = 2;
                        }
                    } else if (data instanceof androidx.constraintlayout.widget.ConstraintSet.Layout) {
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout2 = (androidx.constraintlayout.widget.ConstraintSet.Layout) data;
                        if (orientation == 0) {
                            layout2.mWidth = 0;
                            layout2.widthPercent = fMax;
                            layout2.widthDefault = 2;
                        } else {
                            layout2.mHeight = 0;
                            layout2.heightPercent = fMax;
                            layout2.heightDefault = 2;
                        }
                    } else if (data instanceof androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) {
                        androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta delta2 = (androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) data;
                        if (orientation == 0) {
                            delta2.add(23, 0);
                            delta2.add(54, 2);
                        } else {
                            delta2.add(21, 0);
                            delta2.add(55, 2);
                        }
                    }
                }
            } catch (java.lang.NumberFormatException unused) {
            }
        }
    }

    public static class Layout {
        private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
        private static final int BARRIER_DIRECTION = 72;
        private static final int BARRIER_MARGIN = 73;
        private static final int BASELINE_MARGIN = 80;
        private static final int BASELINE_TO_BASELINE = 1;
        private static final int BASELINE_TO_BOTTOM = 78;
        private static final int BASELINE_TO_TOP = 77;
        private static final int BOTTOM_MARGIN = 2;
        private static final int BOTTOM_TO_BOTTOM = 3;
        private static final int BOTTOM_TO_TOP = 4;
        private static final int CHAIN_USE_RTL = 71;
        private static final int CIRCLE = 61;
        private static final int CIRCLE_ANGLE = 63;
        private static final int CIRCLE_RADIUS = 62;
        private static final int CONSTRAINED_HEIGHT = 88;
        private static final int CONSTRAINED_WIDTH = 87;
        private static final int CONSTRAINT_REFERENCED_IDS = 74;
        private static final int CONSTRAINT_TAG = 89;
        private static final int DIMENSION_RATIO = 5;
        private static final int EDITOR_ABSOLUTE_X = 6;
        private static final int EDITOR_ABSOLUTE_Y = 7;
        private static final int END_MARGIN = 8;
        private static final int END_TO_END = 9;
        private static final int END_TO_START = 10;
        private static final int GONE_BASELINE_MARGIN = 79;
        private static final int GONE_BOTTOM_MARGIN = 11;
        private static final int GONE_END_MARGIN = 12;
        private static final int GONE_LEFT_MARGIN = 13;
        private static final int GONE_RIGHT_MARGIN = 14;
        private static final int GONE_START_MARGIN = 15;
        private static final int GONE_TOP_MARGIN = 16;
        private static final int GUIDE_BEGIN = 17;
        private static final int GUIDE_END = 18;
        private static final int GUIDE_PERCENT = 19;
        private static final int GUIDE_USE_RTL = 90;
        private static final int HEIGHT_DEFAULT = 82;
        private static final int HEIGHT_MAX = 83;
        private static final int HEIGHT_MIN = 85;
        private static final int HEIGHT_PERCENT = 70;
        private static final int HORIZONTAL_BIAS = 20;
        private static final int HORIZONTAL_STYLE = 39;
        private static final int HORIZONTAL_WEIGHT = 37;
        private static final int LAYOUT_CONSTRAINT_HEIGHT = 42;
        private static final int LAYOUT_CONSTRAINT_WIDTH = 41;
        private static final int LAYOUT_HEIGHT = 21;
        private static final int LAYOUT_WIDTH = 22;
        private static final int LAYOUT_WRAP_BEHAVIOR = 76;
        private static final int LEFT_MARGIN = 23;
        private static final int LEFT_TO_LEFT = 24;
        private static final int LEFT_TO_RIGHT = 25;
        private static final int ORIENTATION = 26;
        private static final int RIGHT_MARGIN = 27;
        private static final int RIGHT_TO_LEFT = 28;
        private static final int RIGHT_TO_RIGHT = 29;
        private static final int START_MARGIN = 30;
        private static final int START_TO_END = 31;
        private static final int START_TO_START = 32;
        private static final int TOP_MARGIN = 33;
        private static final int TOP_TO_BOTTOM = 34;
        private static final int TOP_TO_TOP = 35;
        public static final int UNSET = -1;
        public static final int UNSET_GONE_MARGIN = Integer.MIN_VALUE;
        private static final int UNUSED = 91;
        private static final int VERTICAL_BIAS = 36;
        private static final int VERTICAL_STYLE = 40;
        private static final int VERTICAL_WEIGHT = 38;
        private static final int WIDTH_DEFAULT = 81;
        private static final int WIDTH_MAX = 84;
        private static final int WIDTH_MIN = 86;
        private static final int WIDTH_PERCENT = 69;
        private static android.util.SparseIntArray mapToConstant;
        public java.lang.String mConstraintTag;
        public int mHeight;
        public java.lang.String mReferenceIdString;
        public int[] mReferenceIds;
        public int mWidth;
        public boolean mIsGuideline = false;
        public boolean mApply = false;
        public boolean mOverride = false;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public boolean guidelineUseRtl = true;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int topToTop = -1;
        public int topToBottom = -1;
        public int bottomToTop = -1;
        public int bottomToBottom = -1;
        public int baselineToBaseline = -1;
        public int baselineToTop = -1;
        public int baselineToBottom = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int endToStart = -1;
        public int endToEnd = -1;
        public float horizontalBias = 0.5f;
        public float verticalBias = 0.5f;
        public java.lang.String dimensionRatio = null;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public float circleAngle = 0.0f;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int orientation = -1;
        public int leftMargin = 0;
        public int rightMargin = 0;
        public int topMargin = 0;
        public int bottomMargin = 0;
        public int endMargin = 0;
        public int startMargin = 0;
        public int baselineMargin = 0;
        public int goneLeftMargin = Integer.MIN_VALUE;
        public int goneTopMargin = Integer.MIN_VALUE;
        public int goneRightMargin = Integer.MIN_VALUE;
        public int goneBottomMargin = Integer.MIN_VALUE;
        public int goneEndMargin = Integer.MIN_VALUE;
        public int goneStartMargin = Integer.MIN_VALUE;
        public int goneBaselineMargin = Integer.MIN_VALUE;
        public float verticalWeight = -1.0f;
        public float horizontalWeight = -1.0f;
        public int horizontalChainStyle = 0;
        public int verticalChainStyle = 0;
        public int widthDefault = 0;
        public int heightDefault = 0;
        public int widthMax = 0;
        public int heightMax = 0;
        public int widthMin = 0;
        public int heightMin = 0;
        public float widthPercent = 1.0f;
        public float heightPercent = 1.0f;
        public int mBarrierDirection = -1;
        public int mBarrierMargin = 0;
        public int mHelperType = -1;
        public boolean constrainedWidth = false;
        public boolean constrainedHeight = false;
        public boolean mBarrierAllowsGoneWidgets = true;
        public int mWrapBehavior = 0;

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.Layout src) {
            this.mIsGuideline = src.mIsGuideline;
            this.mWidth = src.mWidth;
            this.mApply = src.mApply;
            this.mHeight = src.mHeight;
            this.guideBegin = src.guideBegin;
            this.guideEnd = src.guideEnd;
            this.guidePercent = src.guidePercent;
            this.guidelineUseRtl = src.guidelineUseRtl;
            this.leftToLeft = src.leftToLeft;
            this.leftToRight = src.leftToRight;
            this.rightToLeft = src.rightToLeft;
            this.rightToRight = src.rightToRight;
            this.topToTop = src.topToTop;
            this.topToBottom = src.topToBottom;
            this.bottomToTop = src.bottomToTop;
            this.bottomToBottom = src.bottomToBottom;
            this.baselineToBaseline = src.baselineToBaseline;
            this.baselineToTop = src.baselineToTop;
            this.baselineToBottom = src.baselineToBottom;
            this.startToEnd = src.startToEnd;
            this.startToStart = src.startToStart;
            this.endToStart = src.endToStart;
            this.endToEnd = src.endToEnd;
            this.horizontalBias = src.horizontalBias;
            this.verticalBias = src.verticalBias;
            this.dimensionRatio = src.dimensionRatio;
            this.circleConstraint = src.circleConstraint;
            this.circleRadius = src.circleRadius;
            this.circleAngle = src.circleAngle;
            this.editorAbsoluteX = src.editorAbsoluteX;
            this.editorAbsoluteY = src.editorAbsoluteY;
            this.orientation = src.orientation;
            this.leftMargin = src.leftMargin;
            this.rightMargin = src.rightMargin;
            this.topMargin = src.topMargin;
            this.bottomMargin = src.bottomMargin;
            this.endMargin = src.endMargin;
            this.startMargin = src.startMargin;
            this.baselineMargin = src.baselineMargin;
            this.goneLeftMargin = src.goneLeftMargin;
            this.goneTopMargin = src.goneTopMargin;
            this.goneRightMargin = src.goneRightMargin;
            this.goneBottomMargin = src.goneBottomMargin;
            this.goneEndMargin = src.goneEndMargin;
            this.goneStartMargin = src.goneStartMargin;
            this.goneBaselineMargin = src.goneBaselineMargin;
            this.verticalWeight = src.verticalWeight;
            this.horizontalWeight = src.horizontalWeight;
            this.horizontalChainStyle = src.horizontalChainStyle;
            this.verticalChainStyle = src.verticalChainStyle;
            this.widthDefault = src.widthDefault;
            this.heightDefault = src.heightDefault;
            this.widthMax = src.widthMax;
            this.heightMax = src.heightMax;
            this.widthMin = src.widthMin;
            this.heightMin = src.heightMin;
            this.widthPercent = src.widthPercent;
            this.heightPercent = src.heightPercent;
            this.mBarrierDirection = src.mBarrierDirection;
            this.mBarrierMargin = src.mBarrierMargin;
            this.mHelperType = src.mHelperType;
            this.mConstraintTag = src.mConstraintTag;
            int[] iArr = src.mReferenceIds;
            if (iArr != null && src.mReferenceIdString == null) {
                this.mReferenceIds = java.util.Arrays.copyOf(iArr, iArr.length);
            } else {
                this.mReferenceIds = null;
            }
            this.mReferenceIdString = src.mReferenceIdString;
            this.constrainedWidth = src.constrainedWidth;
            this.constrainedHeight = src.constrainedHeight;
            this.mBarrierAllowsGoneWidgets = src.mBarrierAllowsGoneWidgets;
            this.mWrapBehavior = src.mWrapBehavior;
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            mapToConstant = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_editor_absoluteX, 6);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_editor_absoluteY, 7);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintGuide_begin, 17);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintGuide_end, 18);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintGuide_percent, 19);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_guidelineUseRtl, 90);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_orientation, 26);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginLeft, 13);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginTop, 16);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginRight, 14);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginBottom, 11);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginStart, 15);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginEnd, 12);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintVertical_weight, 38);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintVertical_bias, 36);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintDimensionRatio, 5);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintLeft_creator, 91);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintTop_creator, 91);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintRight_creator, 91);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBottom_creator, 91);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBaseline_creator, 91);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginLeft, 23);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginRight, 27);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginStart, 30);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginEnd, 8);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginTop, 33);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginBottom, 2);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_width, 22);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_height, 21);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintWidth, 41);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHeight, 42);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constrainedWidth, 41);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constrainedHeight, 42);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_wrapBehaviorInParent, 76);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintCircle, 61);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintCircleRadius, 62);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintCircleAngle, 63);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintWidth_percent, 69);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHeight_percent, 70);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_chainUseRtl, 71);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_barrierDirection, 72);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_barrierMargin, 73);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_constraint_referenced_ids, 74);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_barrierAllowsGoneWidgets, 75);
        }

        void fillFromAttributeList(android.content.Context context, android.util.AttributeSet attrs) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.Layout);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = mapToConstant.get(index);
                switch (i2) {
                    case 1:
                        this.baselineToBaseline = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.baselineToBaseline);
                        break;
                    case 2:
                        this.bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.bottomMargin);
                        break;
                    case 3:
                        this.bottomToBottom = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.bottomToBottom);
                        break;
                    case 4:
                        this.bottomToTop = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.bottomToTop);
                        break;
                    case 5:
                        this.dimensionRatio = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.editorAbsoluteX = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                        break;
                    case 7:
                        this.editorAbsoluteY = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                        break;
                    case 8:
                        this.endMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.endMargin);
                        break;
                    case 9:
                        this.endToEnd = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.endToEnd);
                        break;
                    case 10:
                        this.endToStart = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.endToStart);
                        break;
                    case 11:
                        this.goneBottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 12:
                        this.goneEndMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 13:
                        this.goneLeftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 14:
                        this.goneRightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 15:
                        this.goneStartMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 16:
                        this.goneTopMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 17:
                        this.guideBegin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 18:
                        this.guideEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 19:
                        this.guidePercent = typedArrayObtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 20:
                        this.horizontalBias = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 21:
                        this.mHeight = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.mHeight);
                        break;
                    case 22:
                        this.mWidth = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.mWidth);
                        break;
                    case 23:
                        this.leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.leftMargin);
                        break;
                    case 24:
                        this.leftToLeft = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.leftToLeft);
                        break;
                    case 25:
                        this.leftToRight = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.leftToRight);
                        break;
                    case 26:
                        this.orientation = typedArrayObtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 27:
                        this.rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.rightMargin);
                        break;
                    case 28:
                        this.rightToLeft = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.rightToLeft);
                        break;
                    case 29:
                        this.rightToRight = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.rightToRight);
                        break;
                    case 30:
                        this.startMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.startMargin);
                        break;
                    case 31:
                        this.startToEnd = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.startToEnd);
                        break;
                    case 32:
                        this.startToStart = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.startToStart);
                        break;
                    case 33:
                        this.topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.topMargin);
                        break;
                    case 34:
                        this.topToBottom = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.topToBottom);
                        break;
                    case 35:
                        this.topToTop = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.topToTop);
                        break;
                    case 36:
                        this.verticalBias = typedArrayObtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 37:
                        this.horizontalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalWeight);
                        break;
                    case 38:
                        this.verticalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.verticalWeight);
                        break;
                    case 39:
                        this.horizontalChainStyle = typedArrayObtainStyledAttributes.getInt(index, this.horizontalChainStyle);
                        break;
                    case 40:
                        this.verticalChainStyle = typedArrayObtainStyledAttributes.getInt(index, this.verticalChainStyle);
                        break;
                    case 41:
                        androidx.constraintlayout.widget.ConstraintSet.parseDimensionConstraints(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        androidx.constraintlayout.widget.ConstraintSet.parseDimensionConstraints(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.circleConstraint = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.circleConstraint);
                                break;
                            case 62:
                                this.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                                break;
                            case 63:
                                this.circleAngle = typedArrayObtainStyledAttributes.getFloat(index, this.circleAngle);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.widthPercent = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.heightPercent = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        android.util.Log.e(androidx.constraintlayout.widget.ConstraintSet.TAG, "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.mBarrierDirection = typedArrayObtainStyledAttributes.getInt(index, this.mBarrierDirection);
                                        break;
                                    case 73:
                                        this.mBarrierMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mBarrierMargin);
                                        break;
                                    case 74:
                                        this.mReferenceIdString = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.mBarrierAllowsGoneWidgets = typedArrayObtainStyledAttributes.getBoolean(index, this.mBarrierAllowsGoneWidgets);
                                        break;
                                    case 76:
                                        this.mWrapBehavior = typedArrayObtainStyledAttributes.getInt(index, this.mWrapBehavior);
                                        break;
                                    case 77:
                                        this.baselineToTop = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.baselineToTop);
                                        break;
                                    case 78:
                                        this.baselineToBottom = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.baselineToBottom);
                                        break;
                                    case 79:
                                        this.goneBaselineMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneBaselineMargin);
                                        break;
                                    case 80:
                                        this.baselineMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.baselineMargin);
                                        break;
                                    case 81:
                                        this.widthDefault = typedArrayObtainStyledAttributes.getInt(index, this.widthDefault);
                                        break;
                                    case 82:
                                        this.heightDefault = typedArrayObtainStyledAttributes.getInt(index, this.heightDefault);
                                        break;
                                    case 83:
                                        this.heightMax = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.heightMax);
                                        break;
                                    case 84:
                                        this.widthMax = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.widthMax);
                                        break;
                                    case 85:
                                        this.heightMin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.heightMin);
                                        break;
                                    case 86:
                                        this.widthMin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.widthMin);
                                        break;
                                    case 87:
                                        this.constrainedWidth = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                                        break;
                                    case 88:
                                        this.constrainedHeight = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                                        break;
                                    case 89:
                                        this.mConstraintTag = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.guidelineUseRtl = typedArrayObtainStyledAttributes.getBoolean(index, this.guidelineUseRtl);
                                        break;
                                    case 91:
                                        android.util.Log.w(androidx.constraintlayout.widget.ConstraintSet.TAG, "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mapToConstant.get(index));
                                        break;
                                    default:
                                        android.util.Log.w(androidx.constraintlayout.widget.ConstraintSet.TAG, "Unknown attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mapToConstant.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void dump(androidx.constraintlayout.motion.widget.MotionScene motionScene, java.lang.StringBuilder sb) {
            java.lang.reflect.Field[] declaredFields = getClass().getDeclaredFields();
            sb.append("\n");
            for (java.lang.reflect.Field field : declaredFields) {
                java.lang.String name = field.getName();
                if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                    try {
                        java.lang.Object obj = field.get(this);
                        java.lang.Class<?> type = field.getType();
                        if (type == java.lang.Integer.TYPE) {
                            java.lang.Integer num = (java.lang.Integer) obj;
                            if (num.intValue() != -1) {
                                java.lang.Object objLookUpConstraintName = motionScene.lookUpConstraintName(num.intValue());
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(objLookUpConstraintName == null ? num : objLookUpConstraintName);
                                sb.append("\"\n");
                            }
                        } else if (type == java.lang.Float.TYPE) {
                            java.lang.Float f = (java.lang.Float) obj;
                            if (f.floatValue() != -1.0f) {
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(f);
                                sb.append("\"\n");
                            }
                        }
                    } catch (java.lang.IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static class Transform {
        private static final int ELEVATION = 11;
        private static final int ROTATION = 1;
        private static final int ROTATION_X = 2;
        private static final int ROTATION_Y = 3;
        private static final int SCALE_X = 4;
        private static final int SCALE_Y = 5;
        private static final int TRANSFORM_PIVOT_TARGET = 12;
        private static final int TRANSFORM_PIVOT_X = 6;
        private static final int TRANSFORM_PIVOT_Y = 7;
        private static final int TRANSLATION_X = 8;
        private static final int TRANSLATION_Y = 9;
        private static final int TRANSLATION_Z = 10;
        private static android.util.SparseIntArray mapToConstant;
        public boolean mApply = false;
        public float rotation = 0.0f;
        public float rotationX = 0.0f;
        public float rotationY = 0.0f;
        public float scaleX = 1.0f;
        public float scaleY = 1.0f;
        public float transformPivotX = Float.NaN;
        public float transformPivotY = Float.NaN;
        public int transformPivotTarget = -1;
        public float translationX = 0.0f;
        public float translationY = 0.0f;
        public float translationZ = 0.0f;
        public boolean applyElevation = false;
        public float elevation = 0.0f;

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.Transform src) {
            this.mApply = src.mApply;
            this.rotation = src.rotation;
            this.rotationX = src.rotationX;
            this.rotationY = src.rotationY;
            this.scaleX = src.scaleX;
            this.scaleY = src.scaleY;
            this.transformPivotX = src.transformPivotX;
            this.transformPivotY = src.transformPivotY;
            this.transformPivotTarget = src.transformPivotTarget;
            this.translationX = src.translationX;
            this.translationY = src.translationY;
            this.translationZ = src.translationZ;
            this.applyElevation = src.applyElevation;
            this.elevation = src.elevation;
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            mapToConstant = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.Transform_android_rotation, 1);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_rotationX, 2);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_rotationY, 3);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_scaleX, 4);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_scaleY, 5);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_transformPivotX, 6);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_transformPivotY, 7);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_translationX, 8);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_translationY, 9);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_translationZ, 10);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_elevation, 11);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_transformPivotTarget, 12);
        }

        void fillFromAttributeList(android.content.Context context, android.util.AttributeSet attrs) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.Transform);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (mapToConstant.get(index)) {
                    case 1:
                        this.rotation = typedArrayObtainStyledAttributes.getFloat(index, this.rotation);
                        break;
                    case 2:
                        this.rotationX = typedArrayObtainStyledAttributes.getFloat(index, this.rotationX);
                        break;
                    case 3:
                        this.rotationY = typedArrayObtainStyledAttributes.getFloat(index, this.rotationY);
                        break;
                    case 4:
                        this.scaleX = typedArrayObtainStyledAttributes.getFloat(index, this.scaleX);
                        break;
                    case 5:
                        this.scaleY = typedArrayObtainStyledAttributes.getFloat(index, this.scaleY);
                        break;
                    case 6:
                        this.transformPivotX = typedArrayObtainStyledAttributes.getDimension(index, this.transformPivotX);
                        break;
                    case 7:
                        this.transformPivotY = typedArrayObtainStyledAttributes.getDimension(index, this.transformPivotY);
                        break;
                    case 8:
                        this.translationX = typedArrayObtainStyledAttributes.getDimension(index, this.translationX);
                        break;
                    case 9:
                        this.translationY = typedArrayObtainStyledAttributes.getDimension(index, this.translationY);
                        break;
                    case 10:
                        this.translationZ = typedArrayObtainStyledAttributes.getDimension(index, this.translationZ);
                        break;
                    case 11:
                        this.applyElevation = true;
                        this.elevation = typedArrayObtainStyledAttributes.getDimension(index, this.elevation);
                        break;
                    case 12:
                        this.transformPivotTarget = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.transformPivotTarget);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class PropertySet {
        public boolean mApply = false;
        public int visibility = 0;
        public int mVisibilityMode = 0;
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.PropertySet src) {
            this.mApply = src.mApply;
            this.visibility = src.visibility;
            this.alpha = src.alpha;
            this.mProgress = src.mProgress;
            this.mVisibilityMode = src.mVisibilityMode;
        }

        void fillFromAttributeList(android.content.Context context, android.util.AttributeSet attrs) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.PropertySet);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.PropertySet_android_alpha) {
                    this.alpha = typedArrayObtainStyledAttributes.getFloat(index, this.alpha);
                } else if (index == androidx.constraintlayout.widget.R.styleable.PropertySet_android_visibility) {
                    this.visibility = typedArrayObtainStyledAttributes.getInt(index, this.visibility);
                    this.visibility = androidx.constraintlayout.widget.ConstraintSet.VISIBILITY_FLAGS[this.visibility];
                } else if (index == androidx.constraintlayout.widget.R.styleable.PropertySet_visibilityMode) {
                    this.mVisibilityMode = typedArrayObtainStyledAttributes.getInt(index, this.mVisibilityMode);
                } else if (index == androidx.constraintlayout.widget.R.styleable.PropertySet_motionProgress) {
                    this.mProgress = typedArrayObtainStyledAttributes.getFloat(index, this.mProgress);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Motion {
        private static final int ANIMATE_CIRCLE_ANGLE_TO = 6;
        private static final int ANIMATE_RELATIVE_TO = 5;
        private static final int INTERPOLATOR_REFERENCE_ID = -2;
        private static final int INTERPOLATOR_UNDEFINED = -3;
        private static final int MOTION_DRAW_PATH = 4;
        private static final int MOTION_STAGGER = 7;
        private static final int PATH_MOTION_ARC = 2;
        private static final int QUANTIZE_MOTION_INTERPOLATOR = 10;
        private static final int QUANTIZE_MOTION_PHASE = 9;
        private static final int QUANTIZE_MOTION_STEPS = 8;
        private static final int SPLINE_STRING = -1;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 1;
        private static android.util.SparseIntArray mapToConstant;
        public boolean mApply = false;
        public int mAnimateRelativeTo = -1;
        public int mAnimateCircleAngleTo = 0;
        public java.lang.String mTransitionEasing = null;
        public int mPathMotionArc = -1;
        public int mDrawPath = 0;
        public float mMotionStagger = Float.NaN;
        public int mPolarRelativeTo = -1;
        public float mPathRotate = Float.NaN;
        public float mQuantizeMotionPhase = Float.NaN;
        public int mQuantizeMotionSteps = -1;
        public java.lang.String mQuantizeInterpolatorString = null;
        public int mQuantizeInterpolatorType = -3;
        public int mQuantizeInterpolatorID = -1;

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.Motion src) {
            this.mApply = src.mApply;
            this.mAnimateRelativeTo = src.mAnimateRelativeTo;
            this.mTransitionEasing = src.mTransitionEasing;
            this.mPathMotionArc = src.mPathMotionArc;
            this.mDrawPath = src.mDrawPath;
            this.mPathRotate = src.mPathRotate;
            this.mMotionStagger = src.mMotionStagger;
            this.mPolarRelativeTo = src.mPolarRelativeTo;
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            mapToConstant = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.Motion_motionPathRotate, 1);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Motion_pathMotionArc, 2);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Motion_transitionEasing, 3);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Motion_drawPath, 4);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Motion_animateRelativeTo, 5);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Motion_animateCircleAngleTo, 6);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Motion_motionStagger, 7);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Motion_quantizeMotionSteps, 8);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Motion_quantizeMotionPhase, 9);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Motion_quantizeMotionInterpolator, 10);
        }

        void fillFromAttributeList(android.content.Context context, android.util.AttributeSet attrs) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.Motion);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (mapToConstant.get(index)) {
                    case 1:
                        this.mPathRotate = typedArrayObtainStyledAttributes.getFloat(index, this.mPathRotate);
                        break;
                    case 2:
                        this.mPathMotionArc = typedArrayObtainStyledAttributes.getInt(index, this.mPathMotionArc);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.mTransitionEasing = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.mTransitionEasing = androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.mDrawPath = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.mAnimateRelativeTo = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.mAnimateRelativeTo);
                        break;
                    case 6:
                        this.mAnimateCircleAngleTo = typedArrayObtainStyledAttributes.getInteger(index, this.mAnimateCircleAngleTo);
                        break;
                    case 7:
                        this.mMotionStagger = typedArrayObtainStyledAttributes.getFloat(index, this.mMotionStagger);
                        break;
                    case 8:
                        this.mQuantizeMotionSteps = typedArrayObtainStyledAttributes.getInteger(index, this.mQuantizeMotionSteps);
                        break;
                    case 9:
                        this.mQuantizeMotionPhase = typedArrayObtainStyledAttributes.getFloat(index, this.mQuantizeMotionPhase);
                        break;
                    case 10:
                        android.util.TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(index);
                        if (typedValuePeekValue.type == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.mQuantizeInterpolatorID = resourceId;
                            if (resourceId != -1) {
                                this.mQuantizeInterpolatorType = -2;
                            }
                        } else if (typedValuePeekValue.type == 3) {
                            java.lang.String string = typedArrayObtainStyledAttributes.getString(index);
                            this.mQuantizeInterpolatorString = string;
                            if (string.indexOf("/") > 0) {
                                this.mQuantizeInterpolatorID = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.mQuantizeInterpolatorType = -2;
                            } else {
                                this.mQuantizeInterpolatorType = -1;
                            }
                        } else {
                            this.mQuantizeInterpolatorType = typedArrayObtainStyledAttributes.getInteger(index, this.mQuantizeInterpolatorID);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Constraint {
        androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta mDelta;
        java.lang.String mTargetString;
        int mViewId;
        public final androidx.constraintlayout.widget.ConstraintSet.PropertySet propertySet = new androidx.constraintlayout.widget.ConstraintSet.PropertySet();
        public final androidx.constraintlayout.widget.ConstraintSet.Motion motion = new androidx.constraintlayout.widget.ConstraintSet.Motion();
        public final androidx.constraintlayout.widget.ConstraintSet.Layout layout = new androidx.constraintlayout.widget.ConstraintSet.Layout();
        public final androidx.constraintlayout.widget.ConstraintSet.Transform transform = new androidx.constraintlayout.widget.ConstraintSet.Transform();
        public java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> mCustomConstraints = new java.util.HashMap<>();

        static class Delta {
            private static final int INITIAL_BOOLEAN = 4;
            private static final int INITIAL_FLOAT = 10;
            private static final int INITIAL_INT = 10;
            private static final int INITIAL_STRING = 5;
            int[] mTypeInt = new int[10];
            int[] mValueInt = new int[10];
            int mCountInt = 0;
            int[] mTypeFloat = new int[10];
            float[] mValueFloat = new float[10];
            int mCountFloat = 0;
            int[] mTypeString = new int[5];
            java.lang.String[] mValueString = new java.lang.String[5];
            int mCountString = 0;
            int[] mTypeBoolean = new int[4];
            boolean[] mValueBoolean = new boolean[4];
            int mCountBoolean = 0;

            Delta() {
            }

            void add(int type, int value) {
                int i = this.mCountInt;
                int[] iArr = this.mTypeInt;
                if (i >= iArr.length) {
                    this.mTypeInt = java.util.Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.mValueInt;
                    this.mValueInt = java.util.Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.mTypeInt;
                int i2 = this.mCountInt;
                iArr3[i2] = type;
                int[] iArr4 = this.mValueInt;
                this.mCountInt = i2 + 1;
                iArr4[i2] = value;
            }

            void add(int type, float value) {
                int i = this.mCountFloat;
                int[] iArr = this.mTypeFloat;
                if (i >= iArr.length) {
                    this.mTypeFloat = java.util.Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.mValueFloat;
                    this.mValueFloat = java.util.Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.mTypeFloat;
                int i2 = this.mCountFloat;
                iArr2[i2] = type;
                float[] fArr2 = this.mValueFloat;
                this.mCountFloat = i2 + 1;
                fArr2[i2] = value;
            }

            void add(int type, java.lang.String value) {
                int i = this.mCountString;
                int[] iArr = this.mTypeString;
                if (i >= iArr.length) {
                    this.mTypeString = java.util.Arrays.copyOf(iArr, iArr.length * 2);
                    java.lang.String[] strArr = this.mValueString;
                    this.mValueString = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.mTypeString;
                int i2 = this.mCountString;
                iArr2[i2] = type;
                java.lang.String[] strArr2 = this.mValueString;
                this.mCountString = i2 + 1;
                strArr2[i2] = value;
            }

            void add(int type, boolean value) {
                int i = this.mCountBoolean;
                int[] iArr = this.mTypeBoolean;
                if (i >= iArr.length) {
                    this.mTypeBoolean = java.util.Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.mValueBoolean;
                    this.mValueBoolean = java.util.Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.mTypeBoolean;
                int i2 = this.mCountBoolean;
                iArr2[i2] = type;
                boolean[] zArr2 = this.mValueBoolean;
                this.mCountBoolean = i2 + 1;
                zArr2[i2] = value;
            }

            void applyDelta(androidx.constraintlayout.widget.ConstraintSet.Constraint c) {
                for (int i = 0; i < this.mCountInt; i++) {
                    androidx.constraintlayout.widget.ConstraintSet.setDeltaValue(c, this.mTypeInt[i], this.mValueInt[i]);
                }
                for (int i2 = 0; i2 < this.mCountFloat; i2++) {
                    androidx.constraintlayout.widget.ConstraintSet.setDeltaValue(c, this.mTypeFloat[i2], this.mValueFloat[i2]);
                }
                for (int i3 = 0; i3 < this.mCountString; i3++) {
                    androidx.constraintlayout.widget.ConstraintSet.setDeltaValue(c, this.mTypeString[i3], this.mValueString[i3]);
                }
                for (int i4 = 0; i4 < this.mCountBoolean; i4++) {
                    androidx.constraintlayout.widget.ConstraintSet.setDeltaValue(c, this.mTypeBoolean[i4], this.mValueBoolean[i4]);
                }
            }

            void printDelta(java.lang.String tag) {
                android.util.Log.v(tag, "int");
                for (int i = 0; i < this.mCountInt; i++) {
                    android.util.Log.v(tag, this.mTypeInt[i] + " = " + this.mValueInt[i]);
                }
                android.util.Log.v(tag, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT);
                for (int i2 = 0; i2 < this.mCountFloat; i2++) {
                    android.util.Log.v(tag, this.mTypeFloat[i2] + " = " + this.mValueFloat[i2]);
                }
                android.util.Log.v(tag, "strings");
                for (int i3 = 0; i3 < this.mCountString; i3++) {
                    android.util.Log.v(tag, this.mTypeString[i3] + " = " + this.mValueString[i3]);
                }
                android.util.Log.v(tag, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN);
                for (int i4 = 0; i4 < this.mCountBoolean; i4++) {
                    android.util.Log.v(tag, this.mTypeBoolean[i4] + " = " + this.mValueBoolean[i4]);
                }
            }
        }

        public void applyDelta(androidx.constraintlayout.widget.ConstraintSet.Constraint c) {
            androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta delta = this.mDelta;
            if (delta != null) {
                delta.applyDelta(c);
            }
        }

        public void printDelta(java.lang.String tag) {
            androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta delta = this.mDelta;
            if (delta != null) {
                delta.printDelta(tag);
            } else {
                android.util.Log.v(tag, "DELTA IS NULL");
            }
        }

        private androidx.constraintlayout.widget.ConstraintAttribute get(java.lang.String attributeName, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType attributeType) {
            if (this.mCustomConstraints.containsKey(attributeName)) {
                androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(attributeName);
                if (constraintAttribute.getType() == attributeType) {
                    return constraintAttribute;
                }
                throw new java.lang.IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.getType().name());
            }
            androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute2 = new androidx.constraintlayout.widget.ConstraintAttribute(attributeName, attributeType);
            this.mCustomConstraints.put(attributeName, constraintAttribute2);
            return constraintAttribute2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(java.lang.String attributeName, java.lang.String value) {
            get(attributeName, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE).setStringValue(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatValue(java.lang.String attributeName, float value) {
            get(attributeName, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE).setFloatValue(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntValue(java.lang.String attributeName, int value) {
            get(attributeName, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE).setIntValue(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColorValue(java.lang.String attributeName, int value) {
            get(attributeName, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE).setColorValue(value);
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public androidx.constraintlayout.widget.ConstraintSet.Constraint m17clone() {
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = new androidx.constraintlayout.widget.ConstraintSet.Constraint();
            constraint.layout.copyFrom(this.layout);
            constraint.motion.copyFrom(this.motion);
            constraint.propertySet.copyFrom(this.propertySet);
            constraint.transform.copyFrom(this.transform);
            constraint.mViewId = this.mViewId;
            constraint.mDelta = this.mDelta;
            return constraint;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFromConstraints(androidx.constraintlayout.widget.ConstraintHelper helper, int viewId, androidx.constraintlayout.widget.Constraints.LayoutParams param) {
            fillFromConstraints(viewId, param);
            if (helper instanceof androidx.constraintlayout.widget.Barrier) {
                this.layout.mHelperType = 1;
                androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) helper;
                this.layout.mBarrierDirection = barrier.getType();
                this.layout.mReferenceIds = barrier.getReferencedIds();
                this.layout.mBarrierMargin = barrier.getMargin();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFromConstraints(int viewId, androidx.constraintlayout.widget.Constraints.LayoutParams param) {
            fillFrom(viewId, param);
            this.propertySet.alpha = param.alpha;
            this.transform.rotation = param.rotation;
            this.transform.rotationX = param.rotationX;
            this.transform.rotationY = param.rotationY;
            this.transform.scaleX = param.scaleX;
            this.transform.scaleY = param.scaleY;
            this.transform.transformPivotX = param.transformPivotX;
            this.transform.transformPivotY = param.transformPivotY;
            this.transform.translationX = param.translationX;
            this.transform.translationY = param.translationY;
            this.transform.translationZ = param.translationZ;
            this.transform.elevation = param.elevation;
            this.transform.applyElevation = param.applyElevation;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFrom(int viewId, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams param) {
            this.mViewId = viewId;
            this.layout.leftToLeft = param.leftToLeft;
            this.layout.leftToRight = param.leftToRight;
            this.layout.rightToLeft = param.rightToLeft;
            this.layout.rightToRight = param.rightToRight;
            this.layout.topToTop = param.topToTop;
            this.layout.topToBottom = param.topToBottom;
            this.layout.bottomToTop = param.bottomToTop;
            this.layout.bottomToBottom = param.bottomToBottom;
            this.layout.baselineToBaseline = param.baselineToBaseline;
            this.layout.baselineToTop = param.baselineToTop;
            this.layout.baselineToBottom = param.baselineToBottom;
            this.layout.startToEnd = param.startToEnd;
            this.layout.startToStart = param.startToStart;
            this.layout.endToStart = param.endToStart;
            this.layout.endToEnd = param.endToEnd;
            this.layout.horizontalBias = param.horizontalBias;
            this.layout.verticalBias = param.verticalBias;
            this.layout.dimensionRatio = param.dimensionRatio;
            this.layout.circleConstraint = param.circleConstraint;
            this.layout.circleRadius = param.circleRadius;
            this.layout.circleAngle = param.circleAngle;
            this.layout.editorAbsoluteX = param.editorAbsoluteX;
            this.layout.editorAbsoluteY = param.editorAbsoluteY;
            this.layout.orientation = param.orientation;
            this.layout.guidePercent = param.guidePercent;
            this.layout.guideBegin = param.guideBegin;
            this.layout.guideEnd = param.guideEnd;
            this.layout.mWidth = param.width;
            this.layout.mHeight = param.height;
            this.layout.leftMargin = param.leftMargin;
            this.layout.rightMargin = param.rightMargin;
            this.layout.topMargin = param.topMargin;
            this.layout.bottomMargin = param.bottomMargin;
            this.layout.baselineMargin = param.baselineMargin;
            this.layout.verticalWeight = param.verticalWeight;
            this.layout.horizontalWeight = param.horizontalWeight;
            this.layout.verticalChainStyle = param.verticalChainStyle;
            this.layout.horizontalChainStyle = param.horizontalChainStyle;
            this.layout.constrainedWidth = param.constrainedWidth;
            this.layout.constrainedHeight = param.constrainedHeight;
            this.layout.widthDefault = param.matchConstraintDefaultWidth;
            this.layout.heightDefault = param.matchConstraintDefaultHeight;
            this.layout.widthMax = param.matchConstraintMaxWidth;
            this.layout.heightMax = param.matchConstraintMaxHeight;
            this.layout.widthMin = param.matchConstraintMinWidth;
            this.layout.heightMin = param.matchConstraintMinHeight;
            this.layout.widthPercent = param.matchConstraintPercentWidth;
            this.layout.heightPercent = param.matchConstraintPercentHeight;
            this.layout.mConstraintTag = param.constraintTag;
            this.layout.goneTopMargin = param.goneTopMargin;
            this.layout.goneBottomMargin = param.goneBottomMargin;
            this.layout.goneLeftMargin = param.goneLeftMargin;
            this.layout.goneRightMargin = param.goneRightMargin;
            this.layout.goneStartMargin = param.goneStartMargin;
            this.layout.goneEndMargin = param.goneEndMargin;
            this.layout.goneBaselineMargin = param.goneBaselineMargin;
            this.layout.mWrapBehavior = param.wrapBehaviorInParent;
            this.layout.endMargin = param.getMarginEnd();
            this.layout.startMargin = param.getMarginStart();
        }

        public void applyTo(androidx.constraintlayout.widget.ConstraintLayout.LayoutParams param) {
            param.leftToLeft = this.layout.leftToLeft;
            param.leftToRight = this.layout.leftToRight;
            param.rightToLeft = this.layout.rightToLeft;
            param.rightToRight = this.layout.rightToRight;
            param.topToTop = this.layout.topToTop;
            param.topToBottom = this.layout.topToBottom;
            param.bottomToTop = this.layout.bottomToTop;
            param.bottomToBottom = this.layout.bottomToBottom;
            param.baselineToBaseline = this.layout.baselineToBaseline;
            param.baselineToTop = this.layout.baselineToTop;
            param.baselineToBottom = this.layout.baselineToBottom;
            param.startToEnd = this.layout.startToEnd;
            param.startToStart = this.layout.startToStart;
            param.endToStart = this.layout.endToStart;
            param.endToEnd = this.layout.endToEnd;
            param.leftMargin = this.layout.leftMargin;
            param.rightMargin = this.layout.rightMargin;
            param.topMargin = this.layout.topMargin;
            param.bottomMargin = this.layout.bottomMargin;
            param.goneStartMargin = this.layout.goneStartMargin;
            param.goneEndMargin = this.layout.goneEndMargin;
            param.goneTopMargin = this.layout.goneTopMargin;
            param.goneBottomMargin = this.layout.goneBottomMargin;
            param.horizontalBias = this.layout.horizontalBias;
            param.verticalBias = this.layout.verticalBias;
            param.circleConstraint = this.layout.circleConstraint;
            param.circleRadius = this.layout.circleRadius;
            param.circleAngle = this.layout.circleAngle;
            param.dimensionRatio = this.layout.dimensionRatio;
            param.editorAbsoluteX = this.layout.editorAbsoluteX;
            param.editorAbsoluteY = this.layout.editorAbsoluteY;
            param.verticalWeight = this.layout.verticalWeight;
            param.horizontalWeight = this.layout.horizontalWeight;
            param.verticalChainStyle = this.layout.verticalChainStyle;
            param.horizontalChainStyle = this.layout.horizontalChainStyle;
            param.constrainedWidth = this.layout.constrainedWidth;
            param.constrainedHeight = this.layout.constrainedHeight;
            param.matchConstraintDefaultWidth = this.layout.widthDefault;
            param.matchConstraintDefaultHeight = this.layout.heightDefault;
            param.matchConstraintMaxWidth = this.layout.widthMax;
            param.matchConstraintMaxHeight = this.layout.heightMax;
            param.matchConstraintMinWidth = this.layout.widthMin;
            param.matchConstraintMinHeight = this.layout.heightMin;
            param.matchConstraintPercentWidth = this.layout.widthPercent;
            param.matchConstraintPercentHeight = this.layout.heightPercent;
            param.orientation = this.layout.orientation;
            param.guidePercent = this.layout.guidePercent;
            param.guideBegin = this.layout.guideBegin;
            param.guideEnd = this.layout.guideEnd;
            param.width = this.layout.mWidth;
            param.height = this.layout.mHeight;
            if (this.layout.mConstraintTag != null) {
                param.constraintTag = this.layout.mConstraintTag;
            }
            param.wrapBehaviorInParent = this.layout.mWrapBehavior;
            param.setMarginStart(this.layout.startMargin);
            param.setMarginEnd(this.layout.endMargin);
            param.validate();
        }
    }

    public void clone(android.content.Context context, int constraintLayoutId) {
        clone((androidx.constraintlayout.widget.ConstraintLayout) android.view.LayoutInflater.from(context).inflate(constraintLayoutId, (android.view.ViewGroup) null));
    }

    public void clone(androidx.constraintlayout.widget.ConstraintSet set) {
        this.mConstraints.clear();
        for (java.lang.Integer num : set.mConstraints.keySet()) {
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = set.mConstraints.get(num);
            if (constraint != null) {
                this.mConstraints.put(num, constraint.m17clone());
            }
        }
    }

    public void clone(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.mConstraints.clear();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.mForceId && id == -1) {
                throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(id))) {
                this.mConstraints.put(java.lang.Integer.valueOf(id), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
            }
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(id));
            if (constraint != null) {
                constraint.mCustomConstraints = androidx.constraintlayout.widget.ConstraintAttribute.extractAttributes(this.mSavedAttributes, childAt);
                constraint.fillFrom(id, layoutParams);
                constraint.propertySet.visibility = childAt.getVisibility();
                constraint.propertySet.alpha = childAt.getAlpha();
                constraint.transform.rotation = childAt.getRotation();
                constraint.transform.rotationX = childAt.getRotationX();
                constraint.transform.rotationY = childAt.getRotationY();
                constraint.transform.scaleX = childAt.getScaleX();
                constraint.transform.scaleY = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    constraint.transform.transformPivotX = pivotX;
                    constraint.transform.transformPivotY = pivotY;
                }
                constraint.transform.translationX = childAt.getTranslationX();
                constraint.transform.translationY = childAt.getTranslationY();
                constraint.transform.translationZ = childAt.getTranslationZ();
                if (constraint.transform.applyElevation) {
                    constraint.transform.elevation = childAt.getElevation();
                }
                if (childAt instanceof androidx.constraintlayout.widget.Barrier) {
                    androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) childAt;
                    constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                    constraint.layout.mReferenceIds = barrier.getReferencedIds();
                    constraint.layout.mBarrierDirection = barrier.getType();
                    constraint.layout.mBarrierMargin = barrier.getMargin();
                }
            }
        }
    }

    public void clone(androidx.constraintlayout.widget.Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.mConstraints.clear();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraints.getChildAt(i);
            androidx.constraintlayout.widget.Constraints.LayoutParams layoutParams = (androidx.constraintlayout.widget.Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.mForceId && id == -1) {
                throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(id))) {
                this.mConstraints.put(java.lang.Integer.valueOf(id), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
            }
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(id));
            if (constraint != null) {
                if (childAt instanceof androidx.constraintlayout.widget.ConstraintHelper) {
                    constraint.fillFromConstraints((androidx.constraintlayout.widget.ConstraintHelper) childAt, id, layoutParams);
                }
                constraint.fillFromConstraints(id, layoutParams);
            }
        }
    }

    public void applyTo(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        applyToInternal(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void applyToWithoutCustom(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        applyToInternal(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public void applyCustomAttributes(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(id))) {
                android.util.Log.w(TAG, "id unknown " + androidx.constraintlayout.motion.widget.Debug.getName(childAt));
            } else {
                if (this.mForceId && id == -1) {
                    throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.mConstraints.containsKey(java.lang.Integer.valueOf(id)) && (constraint = this.mConstraints.get(java.lang.Integer.valueOf(id))) != null) {
                    androidx.constraintlayout.widget.ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                }
            }
        }
    }

    public void applyToHelper(androidx.constraintlayout.widget.ConstraintHelper helper, androidx.constraintlayout.core.widgets.ConstraintWidget child, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> mapIdToWidget) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint;
        int id = helper.getId();
        if (this.mConstraints.containsKey(java.lang.Integer.valueOf(id)) && (constraint = this.mConstraints.get(java.lang.Integer.valueOf(id))) != null && (child instanceof androidx.constraintlayout.core.widgets.HelperWidget)) {
            helper.loadParameters(constraint, (androidx.constraintlayout.core.widgets.HelperWidget) child, layoutParams, mapIdToWidget);
        }
    }

    public void applyToLayoutParams(int id, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint;
        if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(id)) || (constraint = this.mConstraints.get(java.lang.Integer.valueOf(id))) == null) {
            return;
        }
        constraint.applyTo(layoutParams);
    }

    void applyToInternal(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, boolean applyPostLayout) {
        int childCount = constraintLayout.getChildCount();
        java.util.HashSet<java.lang.Integer> hashSet = new java.util.HashSet(this.mConstraints.keySet());
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(id))) {
                android.util.Log.w(TAG, "id unknown " + androidx.constraintlayout.motion.widget.Debug.getName(childAt));
            } else {
                if (this.mForceId && id == -1) {
                    throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.mConstraints.containsKey(java.lang.Integer.valueOf(id))) {
                        hashSet.remove(java.lang.Integer.valueOf(id));
                        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(id));
                        if (constraint != null) {
                            if (childAt instanceof androidx.constraintlayout.widget.Barrier) {
                                constraint.layout.mHelperType = 1;
                                androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(constraint.layout.mBarrierDirection);
                                barrier.setMargin(constraint.layout.mBarrierMargin);
                                barrier.setAllowsGoneWidget(constraint.layout.mBarrierAllowsGoneWidgets);
                                if (constraint.layout.mReferenceIds != null) {
                                    barrier.setReferencedIds(constraint.layout.mReferenceIds);
                                } else if (constraint.layout.mReferenceIdString != null) {
                                    constraint.layout.mReferenceIds = convertReferenceString(barrier, constraint.layout.mReferenceIdString);
                                    barrier.setReferencedIds(constraint.layout.mReferenceIds);
                                }
                            }
                            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.validate();
                            constraint.applyTo(layoutParams);
                            if (applyPostLayout) {
                                androidx.constraintlayout.widget.ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                            }
                            childAt.setLayoutParams(layoutParams);
                            if (constraint.propertySet.mVisibilityMode == 0) {
                                childAt.setVisibility(constraint.propertySet.visibility);
                            }
                            childAt.setAlpha(constraint.propertySet.alpha);
                            childAt.setRotation(constraint.transform.rotation);
                            childAt.setRotationX(constraint.transform.rotationX);
                            childAt.setRotationY(constraint.transform.rotationY);
                            childAt.setScaleX(constraint.transform.scaleX);
                            childAt.setScaleY(constraint.transform.scaleY);
                            if (constraint.transform.transformPivotTarget != -1) {
                                android.view.View viewFindViewById = ((android.view.View) childAt.getParent()).findViewById(constraint.transform.transformPivotTarget);
                                if (viewFindViewById != null) {
                                    float top = (viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f;
                                    float left = (viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left2 = left - childAt.getLeft();
                                        float top2 = top - childAt.getTop();
                                        childAt.setPivotX(left2);
                                        childAt.setPivotY(top2);
                                    }
                                }
                            } else {
                                if (!java.lang.Float.isNaN(constraint.transform.transformPivotX)) {
                                    childAt.setPivotX(constraint.transform.transformPivotX);
                                }
                                if (!java.lang.Float.isNaN(constraint.transform.transformPivotY)) {
                                    childAt.setPivotY(constraint.transform.transformPivotY);
                                }
                            }
                            childAt.setTranslationX(constraint.transform.translationX);
                            childAt.setTranslationY(constraint.transform.translationY);
                            childAt.setTranslationZ(constraint.transform.translationZ);
                            if (constraint.transform.applyElevation) {
                                childAt.setElevation(constraint.transform.elevation);
                            }
                        }
                    } else {
                        android.util.Log.v(TAG, "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (java.lang.Integer num : hashSet) {
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint2 = this.mConstraints.get(num);
            if (constraint2 != null) {
                if (constraint2.layout.mHelperType == 1) {
                    androidx.constraintlayout.widget.Barrier barrier2 = new androidx.constraintlayout.widget.Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    if (constraint2.layout.mReferenceIds != null) {
                        barrier2.setReferencedIds(constraint2.layout.mReferenceIds);
                    } else if (constraint2.layout.mReferenceIdString != null) {
                        constraint2.layout.mReferenceIds = convertReferenceString(barrier2, constraint2.layout.mReferenceIdString);
                        barrier2.setReferencedIds(constraint2.layout.mReferenceIds);
                    }
                    barrier2.setType(constraint2.layout.mBarrierDirection);
                    barrier2.setMargin(constraint2.layout.mBarrierMargin);
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.validateParams();
                    constraint2.applyTo(layoutParamsGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
                }
                if (constraint2.layout.mIsGuideline) {
                    androidx.constraintlayout.widget.Guideline guideline = new androidx.constraintlayout.widget.Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    constraint2.applyTo(layoutParamsGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, layoutParamsGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof androidx.constraintlayout.widget.ConstraintHelper) {
                ((androidx.constraintlayout.widget.ConstraintHelper) childAt2).applyLayoutFeaturesInConstraintSet(constraintLayout);
            }
        }
    }

    public void center(int centerID, int firstID, int firstSide, int firstMargin, int secondId, int secondSide, int secondMargin, float bias) {
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
            connect(centerID, 1, firstID, firstSide, firstMargin);
            connect(centerID, 2, secondId, secondSide, secondMargin);
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(centerID));
            if (constraint != null) {
                constraint.layout.horizontalBias = bias;
                return;
            }
            return;
        }
        if (firstSide == 6 || firstSide == 7) {
            connect(centerID, 6, firstID, firstSide, firstMargin);
            connect(centerID, 7, secondId, secondSide, secondMargin);
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint2 = this.mConstraints.get(java.lang.Integer.valueOf(centerID));
            if (constraint2 != null) {
                constraint2.layout.horizontalBias = bias;
                return;
            }
            return;
        }
        connect(centerID, 3, firstID, firstSide, firstMargin);
        connect(centerID, 4, secondId, secondSide, secondMargin);
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint3 = this.mConstraints.get(java.lang.Integer.valueOf(centerID));
        if (constraint3 != null) {
            constraint3.layout.verticalBias = bias;
        }
    }

    public void centerHorizontally(int centerID, int leftId, int leftSide, int leftMargin, int rightId, int rightSide, int rightMargin, float bias) {
        connect(centerID, 1, leftId, leftSide, leftMargin);
        connect(centerID, 2, rightId, rightSide, rightMargin);
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(centerID));
        if (constraint != null) {
            constraint.layout.horizontalBias = bias;
        }
    }

    public void centerHorizontallyRtl(int centerID, int startId, int startSide, int startMargin, int endId, int endSide, int endMargin, float bias) {
        connect(centerID, 6, startId, startSide, startMargin);
        connect(centerID, 7, endId, endSide, endMargin);
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(centerID));
        if (constraint != null) {
            constraint.layout.horizontalBias = bias;
        }
    }

    public void centerVertically(int centerID, int topId, int topSide, int topMargin, int bottomId, int bottomSide, int bottomMargin, float bias) {
        connect(centerID, 3, topId, topSide, topMargin);
        connect(centerID, 4, bottomId, bottomSide, bottomMargin);
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(centerID));
        if (constraint != null) {
            constraint.layout.verticalBias = bias;
        }
    }

    public void createVerticalChain(int topId, int topSide, int bottomId, int bottomSide, int[] chainIds, float[] weights, int style) {
        if (chainIds.length < 2) {
            throw new java.lang.IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null && weights.length != chainIds.length) {
            throw new java.lang.IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null) {
            get(chainIds[0]).layout.verticalWeight = weights[0];
        }
        get(chainIds[0]).layout.verticalChainStyle = style;
        connect(chainIds[0], 3, topId, topSide, 0);
        for (int i = 1; i < chainIds.length; i++) {
            int i2 = i - 1;
            connect(chainIds[i], 3, chainIds[i2], 4, 0);
            connect(chainIds[i2], 4, chainIds[i], 3, 0);
            if (weights != null) {
                get(chainIds[i]).layout.verticalWeight = weights[i];
            }
        }
        connect(chainIds[chainIds.length - 1], 4, bottomId, bottomSide, 0);
    }

    public void createHorizontalChain(int leftId, int leftSide, int rightId, int rightSide, int[] chainIds, float[] weights, int style) {
        createHorizontalChain(leftId, leftSide, rightId, rightSide, chainIds, weights, style, 1, 2);
    }

    public void createHorizontalChainRtl(int startId, int startSide, int endId, int endSide, int[] chainIds, float[] weights, int style) {
        createHorizontalChain(startId, startSide, endId, endSide, chainIds, weights, style, 6, 7);
    }

    private void createHorizontalChain(int leftId, int leftSide, int rightId, int rightSide, int[] chainIds, float[] weights, int style, int left, int right) {
        if (chainIds.length < 2) {
            throw new java.lang.IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null && weights.length != chainIds.length) {
            throw new java.lang.IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null) {
            get(chainIds[0]).layout.horizontalWeight = weights[0];
        }
        get(chainIds[0]).layout.horizontalChainStyle = style;
        connect(chainIds[0], left, leftId, leftSide, -1);
        for (int i = 1; i < chainIds.length; i++) {
            int i2 = i - 1;
            connect(chainIds[i], left, chainIds[i2], right, -1);
            connect(chainIds[i2], right, chainIds[i], left, -1);
            if (weights != null) {
                get(chainIds[i]).layout.horizontalWeight = weights[i];
            }
        }
        connect(chainIds[chainIds.length - 1], right, rightId, rightSide, -1);
    }

    public void connect(int startID, int startSide, int endID, int endSide, int margin) {
        if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(startID))) {
            this.mConstraints.put(java.lang.Integer.valueOf(startID), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
        }
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(startID));
        if (constraint == null) {
            return;
        }
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    constraint.layout.leftToLeft = endID;
                    constraint.layout.leftToRight = -1;
                } else if (endSide == 2) {
                    constraint.layout.leftToRight = endID;
                    constraint.layout.leftToLeft = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("Left to " + sideToString(endSide) + " undefined");
                }
                constraint.layout.leftMargin = margin;
                return;
            case 2:
                if (endSide == 1) {
                    constraint.layout.rightToLeft = endID;
                    constraint.layout.rightToRight = -1;
                } else if (endSide == 2) {
                    constraint.layout.rightToRight = endID;
                    constraint.layout.rightToLeft = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                }
                constraint.layout.rightMargin = margin;
                return;
            case 3:
                if (endSide == 3) {
                    constraint.layout.topToTop = endID;
                    constraint.layout.topToBottom = -1;
                    constraint.layout.baselineToBaseline = -1;
                    constraint.layout.baselineToTop = -1;
                    constraint.layout.baselineToBottom = -1;
                } else if (endSide == 4) {
                    constraint.layout.topToBottom = endID;
                    constraint.layout.topToTop = -1;
                    constraint.layout.baselineToBaseline = -1;
                    constraint.layout.baselineToTop = -1;
                    constraint.layout.baselineToBottom = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                }
                constraint.layout.topMargin = margin;
                return;
            case 4:
                if (endSide == 4) {
                    constraint.layout.bottomToBottom = endID;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.baselineToBaseline = -1;
                    constraint.layout.baselineToTop = -1;
                    constraint.layout.baselineToBottom = -1;
                } else if (endSide == 3) {
                    constraint.layout.bottomToTop = endID;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.baselineToBaseline = -1;
                    constraint.layout.baselineToTop = -1;
                    constraint.layout.baselineToBottom = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                }
                constraint.layout.bottomMargin = margin;
                return;
            case 5:
                if (endSide == 5) {
                    constraint.layout.baselineToBaseline = endID;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.topToTop = -1;
                    constraint.layout.topToBottom = -1;
                    return;
                }
                if (endSide == 3) {
                    constraint.layout.baselineToTop = endID;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.topToTop = -1;
                    constraint.layout.topToBottom = -1;
                    return;
                }
                if (endSide == 4) {
                    constraint.layout.baselineToBottom = endID;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.topToTop = -1;
                    constraint.layout.topToBottom = -1;
                    return;
                }
                throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
            case 6:
                if (endSide == 6) {
                    constraint.layout.startToStart = endID;
                    constraint.layout.startToEnd = -1;
                } else if (endSide == 7) {
                    constraint.layout.startToEnd = endID;
                    constraint.layout.startToStart = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                }
                constraint.layout.startMargin = margin;
                return;
            case 7:
                if (endSide == 7) {
                    constraint.layout.endToEnd = endID;
                    constraint.layout.endToStart = -1;
                } else if (endSide == 6) {
                    constraint.layout.endToStart = endID;
                    constraint.layout.endToEnd = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                }
                constraint.layout.endMargin = margin;
                return;
            default:
                throw new java.lang.IllegalArgumentException(sideToString(startSide) + " to " + sideToString(endSide) + " unknown");
        }
    }

    public void connect(int startID, int startSide, int endID, int endSide) {
        if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(startID))) {
            this.mConstraints.put(java.lang.Integer.valueOf(startID), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
        }
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(startID));
        if (constraint == null) {
            return;
        }
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    constraint.layout.leftToLeft = endID;
                    constraint.layout.leftToRight = -1;
                    return;
                } else {
                    if (endSide == 2) {
                        constraint.layout.leftToRight = endID;
                        constraint.layout.leftToLeft = -1;
                        return;
                    }
                    throw new java.lang.IllegalArgumentException("left to " + sideToString(endSide) + " undefined");
                }
            case 2:
                if (endSide == 1) {
                    constraint.layout.rightToLeft = endID;
                    constraint.layout.rightToRight = -1;
                    return;
                } else {
                    if (endSide == 2) {
                        constraint.layout.rightToRight = endID;
                        constraint.layout.rightToLeft = -1;
                        return;
                    }
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                }
            case 3:
                if (endSide == 3) {
                    constraint.layout.topToTop = endID;
                    constraint.layout.topToBottom = -1;
                    constraint.layout.baselineToBaseline = -1;
                    constraint.layout.baselineToTop = -1;
                    constraint.layout.baselineToBottom = -1;
                    return;
                }
                if (endSide == 4) {
                    constraint.layout.topToBottom = endID;
                    constraint.layout.topToTop = -1;
                    constraint.layout.baselineToBaseline = -1;
                    constraint.layout.baselineToTop = -1;
                    constraint.layout.baselineToBottom = -1;
                    return;
                }
                throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
            case 4:
                if (endSide == 4) {
                    constraint.layout.bottomToBottom = endID;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.baselineToBaseline = -1;
                    constraint.layout.baselineToTop = -1;
                    constraint.layout.baselineToBottom = -1;
                    return;
                }
                if (endSide == 3) {
                    constraint.layout.bottomToTop = endID;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.baselineToBaseline = -1;
                    constraint.layout.baselineToTop = -1;
                    constraint.layout.baselineToBottom = -1;
                    return;
                }
                throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
            case 5:
                if (endSide == 5) {
                    constraint.layout.baselineToBaseline = endID;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.topToTop = -1;
                    constraint.layout.topToBottom = -1;
                    return;
                }
                if (endSide == 3) {
                    constraint.layout.baselineToTop = endID;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.topToTop = -1;
                    constraint.layout.topToBottom = -1;
                    return;
                }
                if (endSide == 4) {
                    constraint.layout.baselineToBottom = endID;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.topToTop = -1;
                    constraint.layout.topToBottom = -1;
                    return;
                }
                throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
            case 6:
                if (endSide == 6) {
                    constraint.layout.startToStart = endID;
                    constraint.layout.startToEnd = -1;
                    return;
                } else {
                    if (endSide == 7) {
                        constraint.layout.startToEnd = endID;
                        constraint.layout.startToStart = -1;
                        return;
                    }
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                }
            case 7:
                if (endSide == 7) {
                    constraint.layout.endToEnd = endID;
                    constraint.layout.endToStart = -1;
                    return;
                } else {
                    if (endSide == 6) {
                        constraint.layout.endToStart = endID;
                        constraint.layout.endToEnd = -1;
                        return;
                    }
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                }
            default:
                throw new java.lang.IllegalArgumentException(sideToString(startSide) + " to " + sideToString(endSide) + " unknown");
        }
    }

    public void centerHorizontally(int viewId, int toView) {
        if (toView == 0) {
            center(viewId, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            center(viewId, toView, 2, 0, toView, 1, 0, 0.5f);
        }
    }

    public void centerHorizontallyRtl(int viewId, int toView) {
        if (toView == 0) {
            center(viewId, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            center(viewId, toView, 7, 0, toView, 6, 0, 0.5f);
        }
    }

    public void centerVertically(int viewId, int toView) {
        if (toView == 0) {
            center(viewId, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            center(viewId, toView, 4, 0, toView, 3, 0, 0.5f);
        }
    }

    public void clear(int viewId) {
        this.mConstraints.remove(java.lang.Integer.valueOf(viewId));
    }

    public void clear(int viewId, int anchor) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint;
        if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(viewId)) || (constraint = this.mConstraints.get(java.lang.Integer.valueOf(viewId))) == null) {
            return;
        }
        switch (anchor) {
            case 1:
                constraint.layout.leftToRight = -1;
                constraint.layout.leftToLeft = -1;
                constraint.layout.leftMargin = -1;
                constraint.layout.goneLeftMargin = Integer.MIN_VALUE;
                return;
            case 2:
                constraint.layout.rightToRight = -1;
                constraint.layout.rightToLeft = -1;
                constraint.layout.rightMargin = -1;
                constraint.layout.goneRightMargin = Integer.MIN_VALUE;
                return;
            case 3:
                constraint.layout.topToBottom = -1;
                constraint.layout.topToTop = -1;
                constraint.layout.topMargin = 0;
                constraint.layout.goneTopMargin = Integer.MIN_VALUE;
                return;
            case 4:
                constraint.layout.bottomToTop = -1;
                constraint.layout.bottomToBottom = -1;
                constraint.layout.bottomMargin = 0;
                constraint.layout.goneBottomMargin = Integer.MIN_VALUE;
                return;
            case 5:
                constraint.layout.baselineToBaseline = -1;
                constraint.layout.baselineToTop = -1;
                constraint.layout.baselineToBottom = -1;
                constraint.layout.baselineMargin = 0;
                constraint.layout.goneBaselineMargin = Integer.MIN_VALUE;
                return;
            case 6:
                constraint.layout.startToEnd = -1;
                constraint.layout.startToStart = -1;
                constraint.layout.startMargin = 0;
                constraint.layout.goneStartMargin = Integer.MIN_VALUE;
                return;
            case 7:
                constraint.layout.endToStart = -1;
                constraint.layout.endToEnd = -1;
                constraint.layout.endMargin = 0;
                constraint.layout.goneEndMargin = Integer.MIN_VALUE;
                return;
            case 8:
                constraint.layout.circleAngle = -1.0f;
                constraint.layout.circleRadius = -1;
                constraint.layout.circleConstraint = -1;
                return;
            default:
                throw new java.lang.IllegalArgumentException("unknown constraint");
        }
    }

    public void setMargin(int viewId, int anchor, int value) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = get(viewId);
        switch (anchor) {
            case 1:
                constraint.layout.leftMargin = value;
                return;
            case 2:
                constraint.layout.rightMargin = value;
                return;
            case 3:
                constraint.layout.topMargin = value;
                return;
            case 4:
                constraint.layout.bottomMargin = value;
                return;
            case 5:
                constraint.layout.baselineMargin = value;
                return;
            case 6:
                constraint.layout.startMargin = value;
                return;
            case 7:
                constraint.layout.endMargin = value;
                return;
            default:
                throw new java.lang.IllegalArgumentException("unknown constraint");
        }
    }

    public void setGoneMargin(int viewId, int anchor, int value) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = get(viewId);
        switch (anchor) {
            case 1:
                constraint.layout.goneLeftMargin = value;
                return;
            case 2:
                constraint.layout.goneRightMargin = value;
                return;
            case 3:
                constraint.layout.goneTopMargin = value;
                return;
            case 4:
                constraint.layout.goneBottomMargin = value;
                return;
            case 5:
                constraint.layout.goneBaselineMargin = value;
                return;
            case 6:
                constraint.layout.goneStartMargin = value;
                return;
            case 7:
                constraint.layout.goneEndMargin = value;
                return;
            default:
                throw new java.lang.IllegalArgumentException("unknown constraint");
        }
    }

    public void setHorizontalBias(int viewId, float bias) {
        get(viewId).layout.horizontalBias = bias;
    }

    public void setVerticalBias(int viewId, float bias) {
        get(viewId).layout.verticalBias = bias;
    }

    public void setDimensionRatio(int viewId, java.lang.String ratio) {
        get(viewId).layout.dimensionRatio = ratio;
    }

    public void setVisibility(int viewId, int visibility) {
        get(viewId).propertySet.visibility = visibility;
    }

    public void setVisibilityMode(int viewId, int visibilityMode) {
        get(viewId).propertySet.mVisibilityMode = visibilityMode;
    }

    public int getVisibilityMode(int viewId) {
        return get(viewId).propertySet.mVisibilityMode;
    }

    public int getVisibility(int viewId) {
        return get(viewId).propertySet.visibility;
    }

    public int getHeight(int viewId) {
        return get(viewId).layout.mHeight;
    }

    public int getWidth(int viewId) {
        return get(viewId).layout.mWidth;
    }

    public void setAlpha(int viewId, float alpha) {
        get(viewId).propertySet.alpha = alpha;
    }

    public boolean getApplyElevation(int viewId) {
        return get(viewId).transform.applyElevation;
    }

    public void setApplyElevation(int viewId, boolean apply) {
        get(viewId).transform.applyElevation = apply;
    }

    public void setElevation(int viewId, float elevation) {
        get(viewId).transform.elevation = elevation;
        get(viewId).transform.applyElevation = true;
    }

    public void setRotation(int viewId, float rotation) {
        get(viewId).transform.rotation = rotation;
    }

    public void setRotationX(int viewId, float rotationX) {
        get(viewId).transform.rotationX = rotationX;
    }

    public void setRotationY(int viewId, float rotationY) {
        get(viewId).transform.rotationY = rotationY;
    }

    public void setScaleX(int viewId, float scaleX) {
        get(viewId).transform.scaleX = scaleX;
    }

    public void setScaleY(int viewId, float scaleY) {
        get(viewId).transform.scaleY = scaleY;
    }

    public void setTransformPivotX(int viewId, float transformPivotX) {
        get(viewId).transform.transformPivotX = transformPivotX;
    }

    public void setTransformPivotY(int viewId, float transformPivotY) {
        get(viewId).transform.transformPivotY = transformPivotY;
    }

    public void setTransformPivot(int viewId, float transformPivotX, float transformPivotY) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = get(viewId);
        constraint.transform.transformPivotY = transformPivotY;
        constraint.transform.transformPivotX = transformPivotX;
    }

    public void setTranslationX(int viewId, float translationX) {
        get(viewId).transform.translationX = translationX;
    }

    public void setTranslationY(int viewId, float translationY) {
        get(viewId).transform.translationY = translationY;
    }

    public void setTranslation(int viewId, float translationX, float translationY) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = get(viewId);
        constraint.transform.translationX = translationX;
        constraint.transform.translationY = translationY;
    }

    public void setTranslationZ(int viewId, float translationZ) {
        get(viewId).transform.translationZ = translationZ;
    }

    public void setEditorAbsoluteX(int viewId, int position) {
        get(viewId).layout.editorAbsoluteX = position;
    }

    public void setEditorAbsoluteY(int viewId, int position) {
        get(viewId).layout.editorAbsoluteY = position;
    }

    public void setLayoutWrapBehavior(int viewId, int behavior) {
        if (behavior < 0 || behavior > 3) {
            return;
        }
        get(viewId).layout.mWrapBehavior = behavior;
    }

    public void constrainHeight(int viewId, int height) {
        get(viewId).layout.mHeight = height;
    }

    public void constrainWidth(int viewId, int width) {
        get(viewId).layout.mWidth = width;
    }

    public void constrainCircle(int viewId, int id, int radius, float angle) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = get(viewId);
        constraint.layout.circleConstraint = id;
        constraint.layout.circleRadius = radius;
        constraint.layout.circleAngle = angle;
    }

    public void constrainMaxHeight(int viewId, int height) {
        get(viewId).layout.heightMax = height;
    }

    public void constrainMaxWidth(int viewId, int width) {
        get(viewId).layout.widthMax = width;
    }

    public void constrainMinHeight(int viewId, int height) {
        get(viewId).layout.heightMin = height;
    }

    public void constrainMinWidth(int viewId, int width) {
        get(viewId).layout.widthMin = width;
    }

    public void constrainPercentWidth(int viewId, float percent) {
        get(viewId).layout.widthPercent = percent;
    }

    public void constrainPercentHeight(int viewId, float percent) {
        get(viewId).layout.heightPercent = percent;
    }

    public void constrainDefaultHeight(int viewId, int height) {
        get(viewId).layout.heightDefault = height;
    }

    public void constrainedWidth(int viewId, boolean constrained) {
        get(viewId).layout.constrainedWidth = constrained;
    }

    public void constrainedHeight(int viewId, boolean constrained) {
        get(viewId).layout.constrainedHeight = constrained;
    }

    public void constrainDefaultWidth(int viewId, int width) {
        get(viewId).layout.widthDefault = width;
    }

    public void setHorizontalWeight(int viewId, float weight) {
        get(viewId).layout.horizontalWeight = weight;
    }

    public void setVerticalWeight(int viewId, float weight) {
        get(viewId).layout.verticalWeight = weight;
    }

    public void setHorizontalChainStyle(int viewId, int chainStyle) {
        get(viewId).layout.horizontalChainStyle = chainStyle;
    }

    public void setVerticalChainStyle(int viewId, int chainStyle) {
        get(viewId).layout.verticalChainStyle = chainStyle;
    }

    public void addToHorizontalChain(int viewId, int leftId, int rightId) {
        connect(viewId, 1, leftId, leftId == 0 ? 1 : 2, 0);
        connect(viewId, 2, rightId, rightId == 0 ? 2 : 1, 0);
        if (leftId != 0) {
            connect(leftId, 2, viewId, 1, 0);
        }
        if (rightId != 0) {
            connect(rightId, 1, viewId, 2, 0);
        }
    }

    public void addToHorizontalChainRTL(int viewId, int leftId, int rightId) {
        connect(viewId, 6, leftId, leftId == 0 ? 6 : 7, 0);
        connect(viewId, 7, rightId, rightId == 0 ? 7 : 6, 0);
        if (leftId != 0) {
            connect(leftId, 7, viewId, 6, 0);
        }
        if (rightId != 0) {
            connect(rightId, 6, viewId, 7, 0);
        }
    }

    public void addToVerticalChain(int viewId, int topId, int bottomId) {
        connect(viewId, 3, topId, topId == 0 ? 3 : 4, 0);
        connect(viewId, 4, bottomId, bottomId == 0 ? 4 : 3, 0);
        if (topId != 0) {
            connect(topId, 4, viewId, 3, 0);
        }
        if (bottomId != 0) {
            connect(bottomId, 3, viewId, 4, 0);
        }
    }

    public void removeFromVerticalChain(int viewId) {
        if (this.mConstraints.containsKey(java.lang.Integer.valueOf(viewId))) {
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(viewId));
            if (constraint == null) {
                return;
            }
            int i = constraint.layout.topToBottom;
            int i2 = constraint.layout.bottomToTop;
            if (i != -1 || i2 != -1) {
                if (i != -1 && i2 != -1) {
                    connect(i, 4, i2, 3, 0);
                    connect(i2, 3, i, 4, 0);
                } else if (constraint.layout.bottomToBottom != -1) {
                    connect(i, 4, constraint.layout.bottomToBottom, 4, 0);
                } else if (constraint.layout.topToTop != -1) {
                    connect(i2, 3, constraint.layout.topToTop, 3, 0);
                }
            }
        }
        clear(viewId, 3);
        clear(viewId, 4);
    }

    public void removeFromHorizontalChain(int viewId) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint;
        if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(viewId)) || (constraint = this.mConstraints.get(java.lang.Integer.valueOf(viewId))) == null) {
            return;
        }
        int i = constraint.layout.leftToRight;
        int i2 = constraint.layout.rightToLeft;
        if (i != -1 || i2 != -1) {
            if (i != -1 && i2 != -1) {
                connect(i, 2, i2, 1, 0);
                connect(i2, 1, i, 2, 0);
            } else if (constraint.layout.rightToRight != -1) {
                connect(i, 2, constraint.layout.rightToRight, 2, 0);
            } else if (constraint.layout.leftToLeft != -1) {
                connect(i2, 1, constraint.layout.leftToLeft, 1, 0);
            }
            clear(viewId, 1);
            clear(viewId, 2);
            return;
        }
        int i3 = constraint.layout.startToEnd;
        int i4 = constraint.layout.endToStart;
        if (i3 != -1 || i4 != -1) {
            if (i3 != -1 && i4 != -1) {
                connect(i3, 7, i4, 6, 0);
                connect(i4, 6, i, 7, 0);
            } else if (i4 != -1) {
                if (constraint.layout.rightToRight != -1) {
                    connect(i, 7, constraint.layout.rightToRight, 7, 0);
                } else if (constraint.layout.leftToLeft != -1) {
                    connect(i4, 6, constraint.layout.leftToLeft, 6, 0);
                }
            }
        }
        clear(viewId, 6);
        clear(viewId, 7);
    }

    public void create(int guidelineID, int orientation) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = get(guidelineID);
        constraint.layout.mIsGuideline = true;
        constraint.layout.orientation = orientation;
    }

    public void createBarrier(int id, int direction, int margin, int... referenced) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = get(id);
        constraint.layout.mHelperType = 1;
        constraint.layout.mBarrierDirection = direction;
        constraint.layout.mBarrierMargin = margin;
        constraint.layout.mIsGuideline = false;
        constraint.layout.mReferenceIds = referenced;
    }

    public void setGuidelineBegin(int guidelineID, int margin) {
        get(guidelineID).layout.guideBegin = margin;
        get(guidelineID).layout.guideEnd = -1;
        get(guidelineID).layout.guidePercent = -1.0f;
    }

    public void setGuidelineEnd(int guidelineID, int margin) {
        get(guidelineID).layout.guideEnd = margin;
        get(guidelineID).layout.guideBegin = -1;
        get(guidelineID).layout.guidePercent = -1.0f;
    }

    public void setGuidelinePercent(int guidelineID, float ratio) {
        get(guidelineID).layout.guidePercent = ratio;
        get(guidelineID).layout.guideEnd = -1;
        get(guidelineID).layout.guideBegin = -1;
    }

    public int[] getReferencedIds(int id) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = get(id);
        return constraint.layout.mReferenceIds == null ? new int[0] : java.util.Arrays.copyOf(constraint.layout.mReferenceIds, constraint.layout.mReferenceIds.length);
    }

    public void setReferencedIds(int id, int... referenced) {
        get(id).layout.mReferenceIds = referenced;
    }

    public void setBarrierType(int id, int type) {
        get(id).layout.mHelperType = type;
    }

    public void removeAttribute(java.lang.String attributeName) {
        this.mSavedAttributes.remove(attributeName);
    }

    public void setIntValue(int viewId, java.lang.String attributeName, int value) {
        get(viewId).setIntValue(attributeName, value);
    }

    public void setColorValue(int viewId, java.lang.String attributeName, int value) {
        get(viewId).setColorValue(attributeName, value);
    }

    public void setFloatValue(int viewId, java.lang.String attributeName, float value) {
        get(viewId).setFloatValue(attributeName, value);
    }

    public void setStringValue(int viewId, java.lang.String attributeName, java.lang.String value) {
        get(viewId).setStringValue(attributeName, value);
    }

    private void addAttributes(androidx.constraintlayout.widget.ConstraintAttribute.AttributeType attributeType, java.lang.String... attributeName) {
        for (int i = 0; i < attributeName.length; i++) {
            if (this.mSavedAttributes.containsKey(attributeName[i])) {
                androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.mSavedAttributes.get(attributeName[i]);
                if (constraintAttribute != null && constraintAttribute.getType() != attributeType) {
                    throw new java.lang.IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.getType().name());
                }
            } else {
                this.mSavedAttributes.put(attributeName[i], new androidx.constraintlayout.widget.ConstraintAttribute(attributeName[i], attributeType));
            }
        }
    }

    public void parseIntAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint set, java.lang.String attributes) {
        java.lang.String[] strArrSplit = attributes.split(",");
        for (int i = 0; i < strArrSplit.length; i++) {
            java.lang.String[] strArrSplit2 = strArrSplit[i].split(com.ironsource.y8.i.b);
            if (strArrSplit2.length == 2) {
                set.setFloatValue(strArrSplit2[0], java.lang.Integer.decode(strArrSplit2[1]).intValue());
            } else {
                android.util.Log.w(TAG, " Unable to parse " + strArrSplit[i]);
            }
        }
    }

    public void parseColorAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint set, java.lang.String attributes) {
        java.lang.String[] strArrSplit = attributes.split(",");
        for (int i = 0; i < strArrSplit.length; i++) {
            java.lang.String[] strArrSplit2 = strArrSplit[i].split(com.ironsource.y8.i.b);
            if (strArrSplit2.length == 2) {
                set.setColorValue(strArrSplit2[0], android.graphics.Color.parseColor(strArrSplit2[1]));
            } else {
                android.util.Log.w(TAG, " Unable to parse " + strArrSplit[i]);
            }
        }
    }

    public void parseFloatAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint set, java.lang.String attributes) {
        java.lang.String[] strArrSplit = attributes.split(",");
        for (int i = 0; i < strArrSplit.length; i++) {
            java.lang.String[] strArrSplit2 = strArrSplit[i].split(com.ironsource.y8.i.b);
            if (strArrSplit2.length == 2) {
                set.setFloatValue(strArrSplit2[0], java.lang.Float.parseFloat(strArrSplit2[1]));
            } else {
                android.util.Log.w(TAG, " Unable to parse " + strArrSplit[i]);
            }
        }
    }

    public void parseStringAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint set, java.lang.String attributes) {
        java.lang.String[] strArrSplitString = splitString(attributes);
        for (int i = 0; i < strArrSplitString.length; i++) {
            java.lang.String[] strArrSplit = strArrSplitString[i].split(com.ironsource.y8.i.b);
            android.util.Log.w(TAG, " Unable to parse " + strArrSplitString[i]);
            set.setStringValue(strArrSplit[0], strArrSplit[1]);
        }
    }

    private static java.lang.String[] splitString(java.lang.String str) {
        char[] charArray = str.toCharArray();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c = charArray[i2];
            if (c == ',' && !z) {
                arrayList.add(new java.lang.String(charArray, i, i2 - i));
                i = i2 + 1;
            } else if (c == '\"') {
                z = !z;
            }
        }
        arrayList.add(new java.lang.String(charArray, i, charArray.length - i));
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    public void addIntAttributes(java.lang.String... attributeName) {
        addAttributes(androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE, attributeName);
    }

    public void addColorAttributes(java.lang.String... attributeName) {
        addAttributes(androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE, attributeName);
    }

    public void addFloatAttributes(java.lang.String... attributeName) {
        addAttributes(androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE, attributeName);
    }

    public void addStringAttributes(java.lang.String... attributeName) {
        addAttributes(androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE, attributeName);
    }

    private androidx.constraintlayout.widget.ConstraintSet.Constraint get(int id) {
        if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(id))) {
            this.mConstraints.put(java.lang.Integer.valueOf(id), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
        }
        return this.mConstraints.get(java.lang.Integer.valueOf(id));
    }

    public void load(android.content.Context context, int resourceId) {
        android.content.res.XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    java.lang.String name = xml.getName();
                    androidx.constraintlayout.widget.ConstraintSet.Constraint constraintFillFromAttributeList = fillFromAttributeList(context, android.util.Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        constraintFillFromAttributeList.layout.mIsGuideline = true;
                    }
                    this.mConstraints.put(java.lang.Integer.valueOf(constraintFillFromAttributeList.mViewId), constraintFillFromAttributeList);
                }
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void load(android.content.Context context, org.xmlpull.v1.XmlPullParser parser) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraintFillFromAttributeList;
        try {
            int eventType = parser.getEventType();
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    parser.getName();
                } else if (eventType == 2) {
                    switch (parser.getName()) {
                        case "Constraint":
                            constraintFillFromAttributeList = fillFromAttributeList(context, android.util.Xml.asAttributeSet(parser), false);
                            break;
                        case "ConstraintOverride":
                            constraintFillFromAttributeList = fillFromAttributeList(context, android.util.Xml.asAttributeSet(parser), true);
                            break;
                        case "Guideline":
                            constraintFillFromAttributeList = fillFromAttributeList(context, android.util.Xml.asAttributeSet(parser), false);
                            constraintFillFromAttributeList.layout.mIsGuideline = true;
                            constraintFillFromAttributeList.layout.mApply = true;
                            break;
                        case "Barrier":
                            constraintFillFromAttributeList = fillFromAttributeList(context, android.util.Xml.asAttributeSet(parser), false);
                            constraintFillFromAttributeList.layout.mHelperType = 1;
                            break;
                        case "PropertySet":
                            if (constraint == null) {
                                throw new java.lang.RuntimeException(ERROR_MESSAGE + parser.getLineNumber());
                            }
                            constraint.propertySet.fillFromAttributeList(context, android.util.Xml.asAttributeSet(parser));
                            continue;
                            break;
                            break;
                        case "Transform":
                            if (constraint == null) {
                                throw new java.lang.RuntimeException(ERROR_MESSAGE + parser.getLineNumber());
                            }
                            constraint.transform.fillFromAttributeList(context, android.util.Xml.asAttributeSet(parser));
                            continue;
                            break;
                            break;
                        case "Layout":
                            if (constraint == null) {
                                throw new java.lang.RuntimeException(ERROR_MESSAGE + parser.getLineNumber());
                            }
                            constraint.layout.fillFromAttributeList(context, android.util.Xml.asAttributeSet(parser));
                            continue;
                            break;
                            break;
                        case "Motion":
                            if (constraint == null) {
                                throw new java.lang.RuntimeException(ERROR_MESSAGE + parser.getLineNumber());
                            }
                            constraint.motion.fillFromAttributeList(context, android.util.Xml.asAttributeSet(parser));
                            continue;
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (constraint == null) {
                                throw new java.lang.RuntimeException(ERROR_MESSAGE + parser.getLineNumber());
                            }
                            androidx.constraintlayout.widget.ConstraintAttribute.parse(context, parser, constraint.mCustomConstraints);
                            continue;
                            break;
                            break;
                        default:
                            continue;
                            break;
                    }
                    constraint = constraintFillFromAttributeList;
                } else if (eventType == 3) {
                    java.lang.String lowerCase = parser.getName().toLowerCase(java.util.Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (lowerCase.equals("guideline")) {
                            }
                            break;
                        case -190376483:
                            if (lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                            }
                            break;
                    }
                    if (r4 == 0) {
                        return;
                    }
                    if (r4 == 1 || r4 == 2 || r4 == 3) {
                        this.mConstraints.put(java.lang.Integer.valueOf(constraint.mViewId), constraint);
                        constraint = null;
                    }
                }
                eventType = parser.next();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lookupID(android.content.res.TypedArray a2, int index, int def) {
        int resourceId = a2.getResourceId(index, def);
        return resourceId == -1 ? a2.getInt(index, -1) : resourceId;
    }

    private androidx.constraintlayout.widget.ConstraintSet.Constraint fillFromAttributeList(android.content.Context context, android.util.AttributeSet attrs, boolean override) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = new androidx.constraintlayout.widget.ConstraintSet.Constraint();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, override ? androidx.constraintlayout.widget.R.styleable.ConstraintOverride : androidx.constraintlayout.widget.R.styleable.Constraint);
        populateConstraint(context, constraint, typedArrayObtainStyledAttributes, override);
        typedArrayObtainStyledAttributes.recycle();
        return constraint;
    }

    public static androidx.constraintlayout.widget.ConstraintSet.Constraint buildDelta(android.content.Context context, org.xmlpull.v1.XmlPullParser parser) {
        android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(parser);
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = new androidx.constraintlayout.widget.ConstraintSet.Constraint();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, androidx.constraintlayout.widget.R.styleable.ConstraintOverride);
        populateOverride(context, constraint, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return constraint;
    }

    private static void populateOverride(android.content.Context ctx, androidx.constraintlayout.widget.ConstraintSet.Constraint c, android.content.res.TypedArray a2) {
        int indexCount = a2.getIndexCount();
        androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta delta = new androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta();
        c.mDelta = delta;
        c.motion.mApply = false;
        c.layout.mApply = false;
        c.propertySet.mApply = false;
        c.transform.mApply = false;
        for (int i = 0; i < indexCount; i++) {
            int index = a2.getIndex(i);
            switch (overrideMapToConstant.get(index)) {
                case 2:
                    delta.add(2, a2.getDimensionPixelSize(index, c.layout.bottomMargin));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    android.util.Log.w(TAG, "Unknown attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mapToConstant.get(index));
                    break;
                case 5:
                    delta.add(5, a2.getString(index));
                    break;
                case 6:
                    delta.add(6, a2.getDimensionPixelOffset(index, c.layout.editorAbsoluteX));
                    break;
                case 7:
                    delta.add(7, a2.getDimensionPixelOffset(index, c.layout.editorAbsoluteY));
                    break;
                case 8:
                    delta.add(8, a2.getDimensionPixelSize(index, c.layout.endMargin));
                    break;
                case 11:
                    delta.add(11, a2.getDimensionPixelSize(index, c.layout.goneBottomMargin));
                    break;
                case 12:
                    delta.add(12, a2.getDimensionPixelSize(index, c.layout.goneEndMargin));
                    break;
                case 13:
                    delta.add(13, a2.getDimensionPixelSize(index, c.layout.goneLeftMargin));
                    break;
                case 14:
                    delta.add(14, a2.getDimensionPixelSize(index, c.layout.goneRightMargin));
                    break;
                case 15:
                    delta.add(15, a2.getDimensionPixelSize(index, c.layout.goneStartMargin));
                    break;
                case 16:
                    delta.add(16, a2.getDimensionPixelSize(index, c.layout.goneTopMargin));
                    break;
                case 17:
                    delta.add(17, a2.getDimensionPixelOffset(index, c.layout.guideBegin));
                    break;
                case 18:
                    delta.add(18, a2.getDimensionPixelOffset(index, c.layout.guideEnd));
                    break;
                case 19:
                    delta.add(19, a2.getFloat(index, c.layout.guidePercent));
                    break;
                case 20:
                    delta.add(20, a2.getFloat(index, c.layout.horizontalBias));
                    break;
                case 21:
                    delta.add(21, a2.getLayoutDimension(index, c.layout.mHeight));
                    break;
                case 22:
                    delta.add(22, VISIBILITY_FLAGS[a2.getInt(index, c.propertySet.visibility)]);
                    break;
                case 23:
                    delta.add(23, a2.getLayoutDimension(index, c.layout.mWidth));
                    break;
                case 24:
                    delta.add(24, a2.getDimensionPixelSize(index, c.layout.leftMargin));
                    break;
                case 27:
                    delta.add(27, a2.getInt(index, c.layout.orientation));
                    break;
                case 28:
                    delta.add(28, a2.getDimensionPixelSize(index, c.layout.rightMargin));
                    break;
                case 31:
                    delta.add(31, a2.getDimensionPixelSize(index, c.layout.startMargin));
                    break;
                case 34:
                    delta.add(34, a2.getDimensionPixelSize(index, c.layout.topMargin));
                    break;
                case 37:
                    delta.add(37, a2.getFloat(index, c.layout.verticalBias));
                    break;
                case 38:
                    c.mViewId = a2.getResourceId(index, c.mViewId);
                    delta.add(38, c.mViewId);
                    break;
                case 39:
                    delta.add(39, a2.getFloat(index, c.layout.horizontalWeight));
                    break;
                case 40:
                    delta.add(40, a2.getFloat(index, c.layout.verticalWeight));
                    break;
                case 41:
                    delta.add(41, a2.getInt(index, c.layout.horizontalChainStyle));
                    break;
                case 42:
                    delta.add(42, a2.getInt(index, c.layout.verticalChainStyle));
                    break;
                case 43:
                    delta.add(43, a2.getFloat(index, c.propertySet.alpha));
                    break;
                case 44:
                    delta.add(44, true);
                    delta.add(44, a2.getDimension(index, c.transform.elevation));
                    break;
                case 45:
                    delta.add(45, a2.getFloat(index, c.transform.rotationX));
                    break;
                case 46:
                    delta.add(46, a2.getFloat(index, c.transform.rotationY));
                    break;
                case 47:
                    delta.add(47, a2.getFloat(index, c.transform.scaleX));
                    break;
                case 48:
                    delta.add(48, a2.getFloat(index, c.transform.scaleY));
                    break;
                case 49:
                    delta.add(49, a2.getDimension(index, c.transform.transformPivotX));
                    break;
                case 50:
                    delta.add(50, a2.getDimension(index, c.transform.transformPivotY));
                    break;
                case 51:
                    delta.add(51, a2.getDimension(index, c.transform.translationX));
                    break;
                case 52:
                    delta.add(52, a2.getDimension(index, c.transform.translationY));
                    break;
                case 53:
                    delta.add(53, a2.getDimension(index, c.transform.translationZ));
                    break;
                case 54:
                    delta.add(54, a2.getInt(index, c.layout.widthDefault));
                    break;
                case 55:
                    delta.add(55, a2.getInt(index, c.layout.heightDefault));
                    break;
                case 56:
                    delta.add(56, a2.getDimensionPixelSize(index, c.layout.widthMax));
                    break;
                case 57:
                    delta.add(57, a2.getDimensionPixelSize(index, c.layout.heightMax));
                    break;
                case 58:
                    delta.add(58, a2.getDimensionPixelSize(index, c.layout.widthMin));
                    break;
                case 59:
                    delta.add(59, a2.getDimensionPixelSize(index, c.layout.heightMin));
                    break;
                case 60:
                    delta.add(60, a2.getFloat(index, c.transform.rotation));
                    break;
                case 62:
                    delta.add(62, a2.getDimensionPixelSize(index, c.layout.circleRadius));
                    break;
                case 63:
                    delta.add(63, a2.getFloat(index, c.layout.circleAngle));
                    break;
                case 64:
                    delta.add(64, lookupID(a2, index, c.motion.mAnimateRelativeTo));
                    break;
                case 65:
                    if (a2.peekValue(index).type == 3) {
                        delta.add(65, a2.getString(index));
                    } else {
                        delta.add(65, androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING[a2.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    delta.add(66, a2.getInt(index, 0));
                    break;
                case 67:
                    delta.add(67, a2.getFloat(index, c.motion.mPathRotate));
                    break;
                case 68:
                    delta.add(68, a2.getFloat(index, c.propertySet.mProgress));
                    break;
                case 69:
                    delta.add(69, a2.getFloat(index, 1.0f));
                    break;
                case 70:
                    delta.add(70, a2.getFloat(index, 1.0f));
                    break;
                case 71:
                    android.util.Log.e(TAG, "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    delta.add(72, a2.getInt(index, c.layout.mBarrierDirection));
                    break;
                case 73:
                    delta.add(73, a2.getDimensionPixelSize(index, c.layout.mBarrierMargin));
                    break;
                case 74:
                    delta.add(74, a2.getString(index));
                    break;
                case 75:
                    delta.add(75, a2.getBoolean(index, c.layout.mBarrierAllowsGoneWidgets));
                    break;
                case 76:
                    delta.add(76, a2.getInt(index, c.motion.mPathMotionArc));
                    break;
                case 77:
                    delta.add(77, a2.getString(index));
                    break;
                case 78:
                    delta.add(78, a2.getInt(index, c.propertySet.mVisibilityMode));
                    break;
                case 79:
                    delta.add(79, a2.getFloat(index, c.motion.mMotionStagger));
                    break;
                case 80:
                    delta.add(80, a2.getBoolean(index, c.layout.constrainedWidth));
                    break;
                case 81:
                    delta.add(81, a2.getBoolean(index, c.layout.constrainedHeight));
                    break;
                case 82:
                    delta.add(82, a2.getInteger(index, c.motion.mAnimateCircleAngleTo));
                    break;
                case 83:
                    delta.add(83, lookupID(a2, index, c.transform.transformPivotTarget));
                    break;
                case 84:
                    delta.add(84, a2.getInteger(index, c.motion.mQuantizeMotionSteps));
                    break;
                case 85:
                    delta.add(85, a2.getFloat(index, c.motion.mQuantizeMotionPhase));
                    break;
                case 86:
                    android.util.TypedValue typedValuePeekValue = a2.peekValue(index);
                    if (typedValuePeekValue.type == 1) {
                        c.motion.mQuantizeInterpolatorID = a2.getResourceId(index, -1);
                        delta.add(89, c.motion.mQuantizeInterpolatorID);
                        if (c.motion.mQuantizeInterpolatorID != -1) {
                            c.motion.mQuantizeInterpolatorType = -2;
                            delta.add(88, c.motion.mQuantizeInterpolatorType);
                        }
                    } else if (typedValuePeekValue.type == 3) {
                        c.motion.mQuantizeInterpolatorString = a2.getString(index);
                        delta.add(90, c.motion.mQuantizeInterpolatorString);
                        if (c.motion.mQuantizeInterpolatorString.indexOf("/") > 0) {
                            c.motion.mQuantizeInterpolatorID = a2.getResourceId(index, -1);
                            delta.add(89, c.motion.mQuantizeInterpolatorID);
                            c.motion.mQuantizeInterpolatorType = -2;
                            delta.add(88, c.motion.mQuantizeInterpolatorType);
                        } else {
                            c.motion.mQuantizeInterpolatorType = -1;
                            delta.add(88, c.motion.mQuantizeInterpolatorType);
                        }
                    } else {
                        c.motion.mQuantizeInterpolatorType = a2.getInteger(index, c.motion.mQuantizeInterpolatorID);
                        delta.add(88, c.motion.mQuantizeInterpolatorType);
                    }
                    break;
                case 87:
                    android.util.Log.w(TAG, "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mapToConstant.get(index));
                    break;
                case 93:
                    delta.add(93, a2.getDimensionPixelSize(index, c.layout.baselineMargin));
                    break;
                case 94:
                    delta.add(94, a2.getDimensionPixelSize(index, c.layout.goneBaselineMargin));
                    break;
                case 95:
                    parseDimensionConstraints(delta, a2, index, 0);
                    break;
                case 96:
                    parseDimensionConstraints(delta, a2, index, 1);
                    break;
                case 97:
                    delta.add(97, a2.getInt(index, c.layout.mWrapBehavior));
                    break;
                case 98:
                    if (androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE) {
                        c.mViewId = a2.getResourceId(index, c.mViewId);
                        if (c.mViewId == -1) {
                            c.mTargetString = a2.getString(index);
                        }
                    } else if (a2.peekValue(index).type == 3) {
                        c.mTargetString = a2.getString(index);
                    } else {
                        c.mViewId = a2.getResourceId(index, c.mViewId);
                    }
                    break;
                case 99:
                    delta.add(99, a2.getBoolean(index, c.layout.guidelineUseRtl));
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setDeltaValue(androidx.constraintlayout.widget.ConstraintSet.Constraint c, int type, float value) {
        if (type == 19) {
            c.layout.guidePercent = value;
            return;
        }
        if (type == 20) {
            c.layout.horizontalBias = value;
            return;
        }
        if (type == 37) {
            c.layout.verticalBias = value;
            return;
        }
        if (type == 60) {
            c.transform.rotation = value;
            return;
        }
        if (type == 63) {
            c.layout.circleAngle = value;
            return;
        }
        if (type == 79) {
            c.motion.mMotionStagger = value;
            return;
        }
        if (type == 85) {
            c.motion.mQuantizeMotionPhase = value;
            return;
        }
        if (type != 87) {
            if (type == 39) {
                c.layout.horizontalWeight = value;
                return;
            }
            if (type != 40) {
                switch (type) {
                    case 43:
                        c.propertySet.alpha = value;
                        break;
                    case 44:
                        c.transform.elevation = value;
                        c.transform.applyElevation = true;
                        break;
                    case 45:
                        c.transform.rotationX = value;
                        break;
                    case 46:
                        c.transform.rotationY = value;
                        break;
                    case 47:
                        c.transform.scaleX = value;
                        break;
                    case 48:
                        c.transform.scaleY = value;
                        break;
                    case 49:
                        c.transform.transformPivotX = value;
                        break;
                    case 50:
                        c.transform.transformPivotY = value;
                        break;
                    case 51:
                        c.transform.translationX = value;
                        break;
                    case 52:
                        c.transform.translationY = value;
                        break;
                    case 53:
                        c.transform.translationZ = value;
                        break;
                    default:
                        switch (type) {
                            case 67:
                                c.motion.mPathRotate = value;
                                break;
                            case 68:
                                c.propertySet.mProgress = value;
                                break;
                            case 69:
                                c.layout.widthPercent = value;
                                break;
                            case 70:
                                c.layout.heightPercent = value;
                                break;
                            default:
                                android.util.Log.w(TAG, "Unknown attribute 0x");
                                break;
                        }
                        break;
                }
                return;
            }
            c.layout.verticalWeight = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setDeltaValue(androidx.constraintlayout.widget.ConstraintSet.Constraint c, int type, int value) {
        if (type == 6) {
            c.layout.editorAbsoluteX = value;
            return;
        }
        if (type == 7) {
            c.layout.editorAbsoluteY = value;
            return;
        }
        if (type == 8) {
            c.layout.endMargin = value;
            return;
        }
        if (type == 27) {
            c.layout.orientation = value;
            return;
        }
        if (type == 28) {
            c.layout.rightMargin = value;
            return;
        }
        if (type == 41) {
            c.layout.horizontalChainStyle = value;
            return;
        }
        if (type == 42) {
            c.layout.verticalChainStyle = value;
            return;
        }
        if (type == 61) {
            c.layout.circleConstraint = value;
            return;
        }
        if (type == 62) {
            c.layout.circleRadius = value;
            return;
        }
        if (type == 72) {
            c.layout.mBarrierDirection = value;
            return;
        }
        if (type != 73) {
            switch (type) {
                case 2:
                    c.layout.bottomMargin = value;
                    break;
                case 11:
                    c.layout.goneBottomMargin = value;
                    break;
                case 12:
                    c.layout.goneEndMargin = value;
                    break;
                case 13:
                    c.layout.goneLeftMargin = value;
                    break;
                case 14:
                    c.layout.goneRightMargin = value;
                    break;
                case 15:
                    c.layout.goneStartMargin = value;
                    break;
                case 16:
                    c.layout.goneTopMargin = value;
                    break;
                case 17:
                    c.layout.guideBegin = value;
                    break;
                case 18:
                    c.layout.guideEnd = value;
                    break;
                case 31:
                    c.layout.startMargin = value;
                    break;
                case 34:
                    c.layout.topMargin = value;
                    break;
                case 38:
                    c.mViewId = value;
                    break;
                case 64:
                    c.motion.mAnimateRelativeTo = value;
                    break;
                case 66:
                    c.motion.mDrawPath = value;
                    break;
                case 76:
                    c.motion.mPathMotionArc = value;
                    break;
                case 78:
                    c.propertySet.mVisibilityMode = value;
                    break;
                case 93:
                    c.layout.baselineMargin = value;
                    break;
                case 94:
                    c.layout.goneBaselineMargin = value;
                    break;
                case 97:
                    c.layout.mWrapBehavior = value;
                    break;
                default:
                    switch (type) {
                        case 21:
                            c.layout.mHeight = value;
                            break;
                        case 22:
                            c.propertySet.visibility = value;
                            break;
                        case 23:
                            c.layout.mWidth = value;
                            break;
                        case 24:
                            c.layout.leftMargin = value;
                            break;
                        default:
                            switch (type) {
                                case 54:
                                    c.layout.widthDefault = value;
                                    break;
                                case 55:
                                    c.layout.heightDefault = value;
                                    break;
                                case 56:
                                    c.layout.widthMax = value;
                                    break;
                                case 57:
                                    c.layout.heightMax = value;
                                    break;
                                case 58:
                                    c.layout.widthMin = value;
                                    break;
                                case 59:
                                    c.layout.heightMin = value;
                                    break;
                                default:
                                    switch (type) {
                                        case 82:
                                            c.motion.mAnimateCircleAngleTo = value;
                                            break;
                                        case 83:
                                            c.transform.transformPivotTarget = value;
                                            break;
                                        case 84:
                                            c.motion.mQuantizeMotionSteps = value;
                                            break;
                                        default:
                                            switch (type) {
                                                case 87:
                                                    break;
                                                case 88:
                                                    c.motion.mQuantizeInterpolatorType = value;
                                                    break;
                                                case 89:
                                                    c.motion.mQuantizeInterpolatorID = value;
                                                    break;
                                                default:
                                                    android.util.Log.w(TAG, "Unknown attribute 0x");
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
            return;
        }
        c.layout.mBarrierMargin = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setDeltaValue(androidx.constraintlayout.widget.ConstraintSet.Constraint c, int type, java.lang.String value) {
        if (type == 5) {
            c.layout.dimensionRatio = value;
            return;
        }
        if (type == 65) {
            c.motion.mTransitionEasing = value;
            return;
        }
        if (type == 74) {
            c.layout.mReferenceIdString = value;
            c.layout.mReferenceIds = null;
        } else if (type == 77) {
            c.layout.mConstraintTag = value;
        } else if (type != 87) {
            if (type == 90) {
                c.motion.mQuantizeInterpolatorString = value;
            } else {
                android.util.Log.w(TAG, "Unknown attribute 0x");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setDeltaValue(androidx.constraintlayout.widget.ConstraintSet.Constraint c, int type, boolean value) {
        if (type == 44) {
            c.transform.applyElevation = value;
            return;
        }
        if (type == 75) {
            c.layout.mBarrierAllowsGoneWidgets = value;
            return;
        }
        if (type != 87) {
            if (type == 80) {
                c.layout.constrainedWidth = value;
            } else if (type == 81) {
                c.layout.constrainedHeight = value;
            } else {
                android.util.Log.w(TAG, "Unknown attribute 0x");
            }
        }
    }

    private void populateConstraint(android.content.Context ctx, androidx.constraintlayout.widget.ConstraintSet.Constraint c, android.content.res.TypedArray a2, boolean override) {
        if (override) {
            populateOverride(ctx, c, a2);
            return;
        }
        int indexCount = a2.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = a2.getIndex(i);
            if (index != androidx.constraintlayout.widget.R.styleable.Constraint_android_id && androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginStart != index && androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginEnd != index) {
                c.motion.mApply = true;
                c.layout.mApply = true;
                c.propertySet.mApply = true;
                c.transform.mApply = true;
            }
            switch (mapToConstant.get(index)) {
                case 1:
                    c.layout.baselineToBaseline = lookupID(a2, index, c.layout.baselineToBaseline);
                    break;
                case 2:
                    c.layout.bottomMargin = a2.getDimensionPixelSize(index, c.layout.bottomMargin);
                    break;
                case 3:
                    c.layout.bottomToBottom = lookupID(a2, index, c.layout.bottomToBottom);
                    break;
                case 4:
                    c.layout.bottomToTop = lookupID(a2, index, c.layout.bottomToTop);
                    break;
                case 5:
                    c.layout.dimensionRatio = a2.getString(index);
                    break;
                case 6:
                    c.layout.editorAbsoluteX = a2.getDimensionPixelOffset(index, c.layout.editorAbsoluteX);
                    break;
                case 7:
                    c.layout.editorAbsoluteY = a2.getDimensionPixelOffset(index, c.layout.editorAbsoluteY);
                    break;
                case 8:
                    c.layout.endMargin = a2.getDimensionPixelSize(index, c.layout.endMargin);
                    break;
                case 9:
                    c.layout.endToEnd = lookupID(a2, index, c.layout.endToEnd);
                    break;
                case 10:
                    c.layout.endToStart = lookupID(a2, index, c.layout.endToStart);
                    break;
                case 11:
                    c.layout.goneBottomMargin = a2.getDimensionPixelSize(index, c.layout.goneBottomMargin);
                    break;
                case 12:
                    c.layout.goneEndMargin = a2.getDimensionPixelSize(index, c.layout.goneEndMargin);
                    break;
                case 13:
                    c.layout.goneLeftMargin = a2.getDimensionPixelSize(index, c.layout.goneLeftMargin);
                    break;
                case 14:
                    c.layout.goneRightMargin = a2.getDimensionPixelSize(index, c.layout.goneRightMargin);
                    break;
                case 15:
                    c.layout.goneStartMargin = a2.getDimensionPixelSize(index, c.layout.goneStartMargin);
                    break;
                case 16:
                    c.layout.goneTopMargin = a2.getDimensionPixelSize(index, c.layout.goneTopMargin);
                    break;
                case 17:
                    c.layout.guideBegin = a2.getDimensionPixelOffset(index, c.layout.guideBegin);
                    break;
                case 18:
                    c.layout.guideEnd = a2.getDimensionPixelOffset(index, c.layout.guideEnd);
                    break;
                case 19:
                    c.layout.guidePercent = a2.getFloat(index, c.layout.guidePercent);
                    break;
                case 20:
                    c.layout.horizontalBias = a2.getFloat(index, c.layout.horizontalBias);
                    break;
                case 21:
                    c.layout.mHeight = a2.getLayoutDimension(index, c.layout.mHeight);
                    break;
                case 22:
                    c.propertySet.visibility = a2.getInt(index, c.propertySet.visibility);
                    c.propertySet.visibility = VISIBILITY_FLAGS[c.propertySet.visibility];
                    break;
                case 23:
                    c.layout.mWidth = a2.getLayoutDimension(index, c.layout.mWidth);
                    break;
                case 24:
                    c.layout.leftMargin = a2.getDimensionPixelSize(index, c.layout.leftMargin);
                    break;
                case 25:
                    c.layout.leftToLeft = lookupID(a2, index, c.layout.leftToLeft);
                    break;
                case 26:
                    c.layout.leftToRight = lookupID(a2, index, c.layout.leftToRight);
                    break;
                case 27:
                    c.layout.orientation = a2.getInt(index, c.layout.orientation);
                    break;
                case 28:
                    c.layout.rightMargin = a2.getDimensionPixelSize(index, c.layout.rightMargin);
                    break;
                case 29:
                    c.layout.rightToLeft = lookupID(a2, index, c.layout.rightToLeft);
                    break;
                case 30:
                    c.layout.rightToRight = lookupID(a2, index, c.layout.rightToRight);
                    break;
                case 31:
                    c.layout.startMargin = a2.getDimensionPixelSize(index, c.layout.startMargin);
                    break;
                case 32:
                    c.layout.startToEnd = lookupID(a2, index, c.layout.startToEnd);
                    break;
                case 33:
                    c.layout.startToStart = lookupID(a2, index, c.layout.startToStart);
                    break;
                case 34:
                    c.layout.topMargin = a2.getDimensionPixelSize(index, c.layout.topMargin);
                    break;
                case 35:
                    c.layout.topToBottom = lookupID(a2, index, c.layout.topToBottom);
                    break;
                case 36:
                    c.layout.topToTop = lookupID(a2, index, c.layout.topToTop);
                    break;
                case 37:
                    c.layout.verticalBias = a2.getFloat(index, c.layout.verticalBias);
                    break;
                case 38:
                    c.mViewId = a2.getResourceId(index, c.mViewId);
                    break;
                case 39:
                    c.layout.horizontalWeight = a2.getFloat(index, c.layout.horizontalWeight);
                    break;
                case 40:
                    c.layout.verticalWeight = a2.getFloat(index, c.layout.verticalWeight);
                    break;
                case 41:
                    c.layout.horizontalChainStyle = a2.getInt(index, c.layout.horizontalChainStyle);
                    break;
                case 42:
                    c.layout.verticalChainStyle = a2.getInt(index, c.layout.verticalChainStyle);
                    break;
                case 43:
                    c.propertySet.alpha = a2.getFloat(index, c.propertySet.alpha);
                    break;
                case 44:
                    c.transform.applyElevation = true;
                    c.transform.elevation = a2.getDimension(index, c.transform.elevation);
                    break;
                case 45:
                    c.transform.rotationX = a2.getFloat(index, c.transform.rotationX);
                    break;
                case 46:
                    c.transform.rotationY = a2.getFloat(index, c.transform.rotationY);
                    break;
                case 47:
                    c.transform.scaleX = a2.getFloat(index, c.transform.scaleX);
                    break;
                case 48:
                    c.transform.scaleY = a2.getFloat(index, c.transform.scaleY);
                    break;
                case 49:
                    c.transform.transformPivotX = a2.getDimension(index, c.transform.transformPivotX);
                    break;
                case 50:
                    c.transform.transformPivotY = a2.getDimension(index, c.transform.transformPivotY);
                    break;
                case 51:
                    c.transform.translationX = a2.getDimension(index, c.transform.translationX);
                    break;
                case 52:
                    c.transform.translationY = a2.getDimension(index, c.transform.translationY);
                    break;
                case 53:
                    c.transform.translationZ = a2.getDimension(index, c.transform.translationZ);
                    break;
                case 54:
                    c.layout.widthDefault = a2.getInt(index, c.layout.widthDefault);
                    break;
                case 55:
                    c.layout.heightDefault = a2.getInt(index, c.layout.heightDefault);
                    break;
                case 56:
                    c.layout.widthMax = a2.getDimensionPixelSize(index, c.layout.widthMax);
                    break;
                case 57:
                    c.layout.heightMax = a2.getDimensionPixelSize(index, c.layout.heightMax);
                    break;
                case 58:
                    c.layout.widthMin = a2.getDimensionPixelSize(index, c.layout.widthMin);
                    break;
                case 59:
                    c.layout.heightMin = a2.getDimensionPixelSize(index, c.layout.heightMin);
                    break;
                case 60:
                    c.transform.rotation = a2.getFloat(index, c.transform.rotation);
                    break;
                case 61:
                    c.layout.circleConstraint = lookupID(a2, index, c.layout.circleConstraint);
                    break;
                case 62:
                    c.layout.circleRadius = a2.getDimensionPixelSize(index, c.layout.circleRadius);
                    break;
                case 63:
                    c.layout.circleAngle = a2.getFloat(index, c.layout.circleAngle);
                    break;
                case 64:
                    c.motion.mAnimateRelativeTo = lookupID(a2, index, c.motion.mAnimateRelativeTo);
                    break;
                case 65:
                    if (a2.peekValue(index).type == 3) {
                        c.motion.mTransitionEasing = a2.getString(index);
                    } else {
                        c.motion.mTransitionEasing = androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING[a2.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    c.motion.mDrawPath = a2.getInt(index, 0);
                    break;
                case 67:
                    c.motion.mPathRotate = a2.getFloat(index, c.motion.mPathRotate);
                    break;
                case 68:
                    c.propertySet.mProgress = a2.getFloat(index, c.propertySet.mProgress);
                    break;
                case 69:
                    c.layout.widthPercent = a2.getFloat(index, 1.0f);
                    break;
                case 70:
                    c.layout.heightPercent = a2.getFloat(index, 1.0f);
                    break;
                case 71:
                    android.util.Log.e(TAG, "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c.layout.mBarrierDirection = a2.getInt(index, c.layout.mBarrierDirection);
                    break;
                case 73:
                    c.layout.mBarrierMargin = a2.getDimensionPixelSize(index, c.layout.mBarrierMargin);
                    break;
                case 74:
                    c.layout.mReferenceIdString = a2.getString(index);
                    break;
                case 75:
                    c.layout.mBarrierAllowsGoneWidgets = a2.getBoolean(index, c.layout.mBarrierAllowsGoneWidgets);
                    break;
                case 76:
                    c.motion.mPathMotionArc = a2.getInt(index, c.motion.mPathMotionArc);
                    break;
                case 77:
                    c.layout.mConstraintTag = a2.getString(index);
                    break;
                case 78:
                    c.propertySet.mVisibilityMode = a2.getInt(index, c.propertySet.mVisibilityMode);
                    break;
                case 79:
                    c.motion.mMotionStagger = a2.getFloat(index, c.motion.mMotionStagger);
                    break;
                case 80:
                    c.layout.constrainedWidth = a2.getBoolean(index, c.layout.constrainedWidth);
                    break;
                case 81:
                    c.layout.constrainedHeight = a2.getBoolean(index, c.layout.constrainedHeight);
                    break;
                case 82:
                    c.motion.mAnimateCircleAngleTo = a2.getInteger(index, c.motion.mAnimateCircleAngleTo);
                    break;
                case 83:
                    c.transform.transformPivotTarget = lookupID(a2, index, c.transform.transformPivotTarget);
                    break;
                case 84:
                    c.motion.mQuantizeMotionSteps = a2.getInteger(index, c.motion.mQuantizeMotionSteps);
                    break;
                case 85:
                    c.motion.mQuantizeMotionPhase = a2.getFloat(index, c.motion.mQuantizeMotionPhase);
                    break;
                case 86:
                    android.util.TypedValue typedValuePeekValue = a2.peekValue(index);
                    if (typedValuePeekValue.type == 1) {
                        c.motion.mQuantizeInterpolatorID = a2.getResourceId(index, -1);
                        if (c.motion.mQuantizeInterpolatorID != -1) {
                            c.motion.mQuantizeInterpolatorType = -2;
                        }
                    } else if (typedValuePeekValue.type == 3) {
                        c.motion.mQuantizeInterpolatorString = a2.getString(index);
                        if (c.motion.mQuantizeInterpolatorString.indexOf("/") > 0) {
                            c.motion.mQuantizeInterpolatorID = a2.getResourceId(index, -1);
                            c.motion.mQuantizeInterpolatorType = -2;
                        } else {
                            c.motion.mQuantizeInterpolatorType = -1;
                        }
                    } else {
                        c.motion.mQuantizeInterpolatorType = a2.getInteger(index, c.motion.mQuantizeInterpolatorID);
                    }
                    break;
                case 87:
                    android.util.Log.w(TAG, "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mapToConstant.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    android.util.Log.w(TAG, "Unknown attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mapToConstant.get(index));
                    break;
                case 91:
                    c.layout.baselineToTop = lookupID(a2, index, c.layout.baselineToTop);
                    break;
                case 92:
                    c.layout.baselineToBottom = lookupID(a2, index, c.layout.baselineToBottom);
                    break;
                case 93:
                    c.layout.baselineMargin = a2.getDimensionPixelSize(index, c.layout.baselineMargin);
                    break;
                case 94:
                    c.layout.goneBaselineMargin = a2.getDimensionPixelSize(index, c.layout.goneBaselineMargin);
                    break;
                case 95:
                    parseDimensionConstraints(c.layout, a2, index, 0);
                    break;
                case 96:
                    parseDimensionConstraints(c.layout, a2, index, 1);
                    break;
                case 97:
                    c.layout.mWrapBehavior = a2.getInt(index, c.layout.mWrapBehavior);
                    break;
            }
        }
        if (c.layout.mReferenceIdString != null) {
            c.layout.mReferenceIds = null;
        }
    }

    private int[] convertReferenceString(android.view.View view, java.lang.String referenceIdString) {
        int iIntValue;
        java.lang.Object designInformation;
        java.lang.String[] strArrSplit = referenceIdString.split(",");
        android.content.Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            java.lang.String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = androidx.constraintlayout.widget.R.id.class.getField(strTrim).getInt(null);
            } catch (java.lang.Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout) && (designInformation = ((androidx.constraintlayout.widget.ConstraintLayout) view.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof java.lang.Integer)) {
                iIntValue = ((java.lang.Integer) designInformation).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? java.util.Arrays.copyOf(iArr, i2) : iArr;
    }

    public androidx.constraintlayout.widget.ConstraintSet.Constraint getConstraint(int id) {
        if (this.mConstraints.containsKey(java.lang.Integer.valueOf(id))) {
            return this.mConstraints.get(java.lang.Integer.valueOf(id));
        }
        return null;
    }

    public int[] getKnownIds() {
        java.lang.Integer[] numArr = (java.lang.Integer[]) this.mConstraints.keySet().toArray(new java.lang.Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public boolean isForceId() {
        return this.mForceId;
    }

    public void setForceId(boolean forceId) {
        this.mForceId = forceId;
    }

    public void setValidateOnParse(boolean validate) {
        this.mValidate = validate;
    }

    public void dump(androidx.constraintlayout.motion.widget.MotionScene scene, int... ids) {
        java.util.HashSet hashSet;
        java.util.Set<java.lang.Integer> setKeySet = this.mConstraints.keySet();
        if (ids.length != 0) {
            hashSet = new java.util.HashSet();
            for (int i : ids) {
                hashSet.add(java.lang.Integer.valueOf(i));
            }
        } else {
            hashSet = new java.util.HashSet(setKeySet);
        }
        java.lang.System.out.println(hashSet.size() + " constraints");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.Integer num : (java.lang.Integer[]) hashSet.toArray(new java.lang.Integer[0])) {
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(num);
            if (constraint != null) {
                sb.append("<Constraint id=");
                sb.append(num);
                sb.append(" \n");
                constraint.layout.dump(scene, sb);
                sb.append("/>\n");
            }
        }
        java.lang.System.out.println(sb.toString());
    }

    static java.lang.String getLine(android.content.Context context, int resourceId, org.xmlpull.v1.XmlPullParser pullParser) {
        return ".(" + androidx.constraintlayout.motion.widget.Debug.getName(context, resourceId) + ".xml:" + pullParser.getLineNumber() + ") \"" + pullParser.getName() + "\"";
    }

    static java.lang.String getDebugName(int v) {
        for (java.lang.reflect.Field field : androidx.constraintlayout.widget.ConstraintSet.class.getDeclaredFields()) {
            if (field.getName().contains("_") && field.getType() == java.lang.Integer.TYPE && java.lang.reflect.Modifier.isStatic(field.getModifiers()) && java.lang.reflect.Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt(null) == v) {
                        return field.getName();
                    }
                    continue;
                } catch (java.lang.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return "UNKNOWN";
    }

    public void writeState(java.io.Writer writer, androidx.constraintlayout.widget.ConstraintLayout layout, int flags) throws java.io.IOException {
        writer.write("\n---------------------------------------------\n");
        if ((flags & 1) == 1) {
            new androidx.constraintlayout.widget.ConstraintSet.WriteXmlEngine(writer, layout, flags).writeLayout();
        } else {
            new androidx.constraintlayout.widget.ConstraintSet.WriteJsonEngine(writer, layout, flags).writeLayout();
        }
        writer.write("\n---------------------------------------------\n");
    }

    class WriteXmlEngine {
        private static final java.lang.String SPACE = "\n       ";
        android.content.Context context;
        int flags;
        androidx.constraintlayout.widget.ConstraintLayout layout;
        java.io.Writer writer;
        int unknownCount = 0;
        final java.lang.String LEFT = "'left'";
        final java.lang.String RIGHT = "'right'";
        final java.lang.String BASELINE = "'baseline'";
        final java.lang.String BOTTOM = "'bottom'";
        final java.lang.String TOP = "'top'";
        final java.lang.String START = "'start'";
        final java.lang.String END = "'end'";
        java.util.HashMap<java.lang.Integer, java.lang.String> idMap = new java.util.HashMap<>();

        WriteXmlEngine(java.io.Writer writer, androidx.constraintlayout.widget.ConstraintLayout layout, int flags) throws java.io.IOException {
            this.writer = writer;
            this.layout = layout;
            this.context = layout.getContext();
            this.flags = flags;
        }

        void writeLayout() throws java.io.IOException {
            this.writer.write("\n<ConstraintSet>\n");
            for (java.lang.Integer num : androidx.constraintlayout.widget.ConstraintSet.this.mConstraints.keySet()) {
                androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = (androidx.constraintlayout.widget.ConstraintSet.Constraint) androidx.constraintlayout.widget.ConstraintSet.this.mConstraints.get(num);
                java.lang.String name = getName(num.intValue());
                this.writer.write("  <Constraint");
                this.writer.write("\n       android:id=\"" + name + "\"");
                androidx.constraintlayout.widget.ConstraintSet.Layout layout = constraint.layout;
                writeBaseDimension("android:layout_width", layout.mWidth, -5);
                writeBaseDimension("android:layout_height", layout.mHeight, -5);
                writeVariable("app:layout_constraintGuide_begin", layout.guideBegin, -1.0f);
                writeVariable("app:layout_constraintGuide_end", layout.guideEnd, -1.0f);
                writeVariable("app:layout_constraintGuide_percent", layout.guidePercent, -1.0f);
                writeVariable("app:layout_constraintHorizontal_bias", layout.horizontalBias, 0.5f);
                writeVariable("app:layout_constraintVertical_bias", layout.verticalBias, 0.5f);
                writeVariable("app:layout_constraintDimensionRatio", layout.dimensionRatio, (java.lang.String) null);
                writeXmlConstraint("app:layout_constraintCircle", layout.circleConstraint);
                writeVariable("app:layout_constraintCircleRadius", layout.circleRadius, 0.0f);
                writeVariable("app:layout_constraintCircleAngle", layout.circleAngle, 0.0f);
                writeVariable("android:orientation", layout.orientation, -1.0f);
                writeVariable("app:layout_constraintVertical_weight", layout.verticalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_weight", layout.horizontalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_chainStyle", layout.horizontalChainStyle, 0.0f);
                writeVariable("app:layout_constraintVertical_chainStyle", layout.verticalChainStyle, 0.0f);
                writeVariable("app:barrierDirection", layout.mBarrierDirection, -1.0f);
                writeVariable("app:barrierMargin", layout.mBarrierMargin, 0.0f);
                writeDimension("app:layout_marginLeft", layout.leftMargin, 0);
                writeDimension("app:layout_goneMarginLeft", layout.goneLeftMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginRight", layout.rightMargin, 0);
                writeDimension("app:layout_goneMarginRight", layout.goneRightMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginStart", layout.startMargin, 0);
                writeDimension("app:layout_goneMarginStart", layout.goneStartMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginEnd", layout.endMargin, 0);
                writeDimension("app:layout_goneMarginEnd", layout.goneEndMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginTop", layout.topMargin, 0);
                writeDimension("app:layout_goneMarginTop", layout.goneTopMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginBottom", layout.bottomMargin, 0);
                writeDimension("app:layout_goneMarginBottom", layout.goneBottomMargin, Integer.MIN_VALUE);
                writeDimension("app:goneBaselineMargin", layout.goneBaselineMargin, Integer.MIN_VALUE);
                writeDimension("app:baselineMargin", layout.baselineMargin, 0);
                writeBoolen("app:layout_constrainedWidth", layout.constrainedWidth, false);
                writeBoolen("app:layout_constrainedHeight", layout.constrainedHeight, false);
                writeBoolen("app:barrierAllowsGoneWidgets", layout.mBarrierAllowsGoneWidgets, true);
                writeVariable("app:layout_wrapBehaviorInParent", layout.mWrapBehavior, 0.0f);
                writeXmlConstraint("app:baselineToBaseline", layout.baselineToBaseline);
                writeXmlConstraint("app:baselineToBottom", layout.baselineToBottom);
                writeXmlConstraint("app:baselineToTop", layout.baselineToTop);
                writeXmlConstraint("app:layout_constraintBottom_toBottomOf", layout.bottomToBottom);
                writeXmlConstraint("app:layout_constraintBottom_toTopOf", layout.bottomToTop);
                writeXmlConstraint("app:layout_constraintEnd_toEndOf", layout.endToEnd);
                writeXmlConstraint("app:layout_constraintEnd_toStartOf", layout.endToStart);
                writeXmlConstraint("app:layout_constraintLeft_toLeftOf", layout.leftToLeft);
                writeXmlConstraint("app:layout_constraintLeft_toRightOf", layout.leftToRight);
                writeXmlConstraint("app:layout_constraintRight_toLeftOf", layout.rightToLeft);
                writeXmlConstraint("app:layout_constraintRight_toRightOf", layout.rightToRight);
                writeXmlConstraint("app:layout_constraintStart_toEndOf", layout.startToEnd);
                writeXmlConstraint("app:layout_constraintStart_toStartOf", layout.startToStart);
                writeXmlConstraint("app:layout_constraintTop_toBottomOf", layout.topToBottom);
                writeXmlConstraint("app:layout_constraintTop_toTopOf", layout.topToTop);
                java.lang.String[] strArr = {"spread", "wrap", "percent"};
                writeEnum("app:layout_constraintHeight_default", layout.heightDefault, strArr, 0);
                writeVariable("app:layout_constraintHeight_percent", layout.heightPercent, 1.0f);
                writeDimension("app:layout_constraintHeight_min", layout.heightMin, 0);
                writeDimension("app:layout_constraintHeight_max", layout.heightMax, 0);
                writeBoolen("android:layout_constrainedHeight", layout.constrainedHeight, false);
                writeEnum("app:layout_constraintWidth_default", layout.widthDefault, strArr, 0);
                writeVariable("app:layout_constraintWidth_percent", layout.widthPercent, 1.0f);
                writeDimension("app:layout_constraintWidth_min", layout.widthMin, 0);
                writeDimension("app:layout_constraintWidth_max", layout.widthMax, 0);
                writeBoolen("android:layout_constrainedWidth", layout.constrainedWidth, false);
                writeVariable("app:layout_constraintVertical_weight", layout.verticalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_weight", layout.horizontalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_chainStyle", layout.horizontalChainStyle);
                writeVariable("app:layout_constraintVertical_chainStyle", layout.verticalChainStyle);
                writeEnum("app:barrierDirection", layout.mBarrierDirection, new java.lang.String[]{androidx.media3.extractor.text.ttml.TtmlNode.LEFT, androidx.media3.extractor.text.ttml.TtmlNode.RIGHT, "top", "bottom", androidx.media3.extractor.text.ttml.TtmlNode.START, androidx.media3.extractor.text.ttml.TtmlNode.END}, -1);
                writeVariable("app:layout_constraintTag", layout.mConstraintTag, (java.lang.String) null);
                if (layout.mReferenceIds != null) {
                    writeVariable("'ReferenceIds'", layout.mReferenceIds);
                }
                this.writer.write(" />\n");
            }
            this.writer.write("</ConstraintSet>\n");
        }

        private void writeBoolen(java.lang.String dimString, boolean val, boolean def) throws java.io.IOException {
            if (val != def) {
                this.writer.write(SPACE + dimString + "=\"" + val + "dp\"");
            }
        }

        private void writeEnum(java.lang.String dimString, int val, java.lang.String[] types, int def) throws java.io.IOException {
            if (val != def) {
                this.writer.write(SPACE + dimString + "=\"" + types[val] + "\"");
            }
        }

        private void writeDimension(java.lang.String dimString, int dim, int def) throws java.io.IOException {
            if (dim != def) {
                this.writer.write(SPACE + dimString + "=\"" + dim + "dp\"");
            }
        }

        private void writeBaseDimension(java.lang.String dimString, int dim, int def) throws java.io.IOException {
            if (dim != def) {
                if (dim == -2) {
                    this.writer.write(SPACE + dimString + "=\"wrap_content\"");
                } else if (dim == -1) {
                    this.writer.write(SPACE + dimString + "=\"match_parent\"");
                } else {
                    this.writer.write(SPACE + dimString + "=\"" + dim + "dp\"");
                }
            }
        }

        java.lang.String getName(int id) {
            if (this.idMap.containsKey(java.lang.Integer.valueOf(id))) {
                return "@+id/" + this.idMap.get(java.lang.Integer.valueOf(id)) + "";
            }
            if (id == 0) {
                return androidx.constraintlayout.widget.ConstraintSet.KEY_PERCENT_PARENT;
            }
            java.lang.String strLookup = lookup(id);
            this.idMap.put(java.lang.Integer.valueOf(id), strLookup);
            return "@+id/" + strLookup + "";
        }

        java.lang.String lookup(int id) {
            try {
                if (id != -1) {
                    return this.context.getResources().getResourceEntryName(id);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown");
                int i = this.unknownCount + 1;
                this.unknownCount = i;
                return sb.append(i).toString();
            } catch (java.lang.Exception unused) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown");
                int i2 = this.unknownCount + 1;
                this.unknownCount = i2;
                return sb2.append(i2).toString();
            }
        }

        void writeXmlConstraint(java.lang.String str, int leftToLeft) throws java.io.IOException {
            if (leftToLeft == -1) {
                return;
            }
            this.writer.write(SPACE + str);
            this.writer.write("=\"" + getName(leftToLeft) + "\"");
        }

        void writeConstraint(java.lang.String my, int leftToLeft, java.lang.String other, int margin, int goneMargin) throws java.io.IOException {
            if (leftToLeft == -1) {
                return;
            }
            this.writer.write(SPACE + my);
            this.writer.write(":[");
            this.writer.write(getName(leftToLeft));
            this.writer.write(" , ");
            this.writer.write(other);
            if (margin != 0) {
                this.writer.write(" , " + margin);
            }
            this.writer.write("],\n");
        }

        void writeCircle(int circleConstraint, float circleAngle, int circleRadius) throws java.io.IOException {
            if (circleConstraint == -1) {
                return;
            }
            this.writer.write(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            this.writer.write(":[");
            this.writer.write(getName(circleConstraint));
            this.writer.write(", " + circleAngle);
            this.writer.write(circleRadius + com.ironsource.y8.i.e);
        }

        void writeVariable(java.lang.String name, int value) throws java.io.IOException {
            if (value == 0 || value == -1) {
                return;
            }
            this.writer.write(SPACE + name + "=\"" + value + "\"\n");
        }

        void writeVariable(java.lang.String name, float value, float def) throws java.io.IOException {
            if (value == def) {
                return;
            }
            this.writer.write(SPACE + name);
            this.writer.write("=\"" + value + "\"");
        }

        void writeVariable(java.lang.String name, java.lang.String value, java.lang.String def) throws java.io.IOException {
            if (value == null || value.equals(def)) {
                return;
            }
            this.writer.write(SPACE + name);
            this.writer.write("=\"" + value + "\"");
        }

        void writeVariable(java.lang.String name, int[] value) throws java.io.IOException {
            if (value == null) {
                return;
            }
            this.writer.write(SPACE + name);
            this.writer.write(":");
            int i = 0;
            while (i < value.length) {
                this.writer.write((i == 0 ? com.ironsource.y8.i.d : ", ") + getName(value[i]));
                i++;
            }
            this.writer.write("],\n");
        }

        void writeVariable(java.lang.String name, java.lang.String value) throws java.io.IOException {
            if (value == null) {
                return;
            }
            this.writer.write(name);
            this.writer.write(":");
            this.writer.write(", " + value);
            this.writer.write("\n");
        }
    }

    class WriteJsonEngine {
        private static final java.lang.String SPACE = "       ";
        android.content.Context context;
        int flags;
        androidx.constraintlayout.widget.ConstraintLayout layout;
        java.io.Writer writer;
        int unknownCount = 0;
        final java.lang.String LEFT = "'left'";
        final java.lang.String RIGHT = "'right'";
        final java.lang.String BASELINE = "'baseline'";
        final java.lang.String BOTTOM = "'bottom'";
        final java.lang.String TOP = "'top'";
        final java.lang.String START = "'start'";
        final java.lang.String END = "'end'";
        java.util.HashMap<java.lang.Integer, java.lang.String> idMap = new java.util.HashMap<>();

        private void writeGuideline(int orientation, int guideBegin, int guideEnd, float guidePercent) {
        }

        WriteJsonEngine(java.io.Writer writer, androidx.constraintlayout.widget.ConstraintLayout layout, int flags) throws java.io.IOException {
            this.writer = writer;
            this.layout = layout;
            this.context = layout.getContext();
            this.flags = flags;
        }

        void writeLayout() throws java.io.IOException {
            this.writer.write("\n'ConstraintSet':{\n");
            for (java.lang.Integer num : androidx.constraintlayout.widget.ConstraintSet.this.mConstraints.keySet()) {
                androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = (androidx.constraintlayout.widget.ConstraintSet.Constraint) androidx.constraintlayout.widget.ConstraintSet.this.mConstraints.get(num);
                this.writer.write(getName(num.intValue()) + ":{\n");
                androidx.constraintlayout.widget.ConstraintSet.Layout layout = constraint.layout;
                writeDimension("height", layout.mHeight, layout.heightDefault, layout.heightPercent, layout.heightMin, layout.heightMax, layout.constrainedHeight);
                writeDimension("width", layout.mWidth, layout.widthDefault, layout.widthPercent, layout.widthMin, layout.widthMax, layout.constrainedWidth);
                writeConstraint("'left'", layout.leftToLeft, "'left'", layout.leftMargin, layout.goneLeftMargin);
                writeConstraint("'left'", layout.leftToRight, "'right'", layout.leftMargin, layout.goneLeftMargin);
                writeConstraint("'right'", layout.rightToLeft, "'left'", layout.rightMargin, layout.goneRightMargin);
                writeConstraint("'right'", layout.rightToRight, "'right'", layout.rightMargin, layout.goneRightMargin);
                writeConstraint("'baseline'", layout.baselineToBaseline, "'baseline'", -1, layout.goneBaselineMargin);
                writeConstraint("'baseline'", layout.baselineToTop, "'top'", -1, layout.goneBaselineMargin);
                writeConstraint("'baseline'", layout.baselineToBottom, "'bottom'", -1, layout.goneBaselineMargin);
                writeConstraint("'top'", layout.topToBottom, "'bottom'", layout.topMargin, layout.goneTopMargin);
                writeConstraint("'top'", layout.topToTop, "'top'", layout.topMargin, layout.goneTopMargin);
                writeConstraint("'bottom'", layout.bottomToBottom, "'bottom'", layout.bottomMargin, layout.goneBottomMargin);
                writeConstraint("'bottom'", layout.bottomToTop, "'top'", layout.bottomMargin, layout.goneBottomMargin);
                writeConstraint("'start'", layout.startToStart, "'start'", layout.startMargin, layout.goneStartMargin);
                writeConstraint("'start'", layout.startToEnd, "'end'", layout.startMargin, layout.goneStartMargin);
                writeConstraint("'end'", layout.endToStart, "'start'", layout.endMargin, layout.goneEndMargin);
                writeConstraint("'end'", layout.endToEnd, "'end'", layout.endMargin, layout.goneEndMargin);
                writeVariable("'horizontalBias'", layout.horizontalBias, 0.5f);
                writeVariable("'verticalBias'", layout.verticalBias, 0.5f);
                writeCircle(layout.circleConstraint, layout.circleAngle, layout.circleRadius);
                writeGuideline(layout.orientation, layout.guideBegin, layout.guideEnd, layout.guidePercent);
                writeVariable("'dimensionRatio'", layout.dimensionRatio);
                writeVariable("'barrierMargin'", layout.mBarrierMargin);
                writeVariable("'type'", layout.mHelperType);
                writeVariable("'ReferenceId'", layout.mReferenceIdString);
                writeVariable("'mBarrierAllowsGoneWidgets'", layout.mBarrierAllowsGoneWidgets, true);
                writeVariable("'WrapBehavior'", layout.mWrapBehavior);
                writeVariable("'verticalWeight'", layout.verticalWeight);
                writeVariable("'horizontalWeight'", layout.horizontalWeight);
                writeVariable("'horizontalChainStyle'", layout.horizontalChainStyle);
                writeVariable("'verticalChainStyle'", layout.verticalChainStyle);
                writeVariable("'barrierDirection'", layout.mBarrierDirection);
                if (layout.mReferenceIds != null) {
                    writeVariable("'ReferenceIds'", layout.mReferenceIds);
                }
                this.writer.write("}\n");
            }
            this.writer.write("}\n");
        }

        private void writeDimension(java.lang.String dimString, int dim, int dimDefault, float dimPercent, int dimMin, int dimMax, boolean constrainedDim) throws java.io.IOException {
            if (dim != 0) {
                if (dim == -2) {
                    this.writer.write(SPACE + dimString + ": 'wrap'\n");
                    return;
                } else if (dim == -1) {
                    this.writer.write(SPACE + dimString + ": 'parent'\n");
                    return;
                } else {
                    this.writer.write(SPACE + dimString + ": " + dim + ",\n");
                    return;
                }
            }
            if (dimMax == -1 && dimMin == -1) {
                if (dimDefault == 1) {
                    this.writer.write(SPACE + dimString + ": '???????????',\n");
                    return;
                } else {
                    if (dimDefault != 2) {
                        return;
                    }
                    this.writer.write(SPACE + dimString + ": '" + dimPercent + "%',\n");
                    return;
                }
            }
            if (dimDefault == 0) {
                this.writer.write(SPACE + dimString + ": {'spread' ," + dimMin + ", " + dimMax + "}\n");
            } else if (dimDefault == 1) {
                this.writer.write(SPACE + dimString + ": {'wrap' ," + dimMin + ", " + dimMax + "}\n");
            } else {
                if (dimDefault != 2) {
                    return;
                }
                this.writer.write(SPACE + dimString + ": {'" + dimPercent + "'% ," + dimMin + ", " + dimMax + "}\n");
            }
        }

        java.lang.String getName(int id) {
            if (this.idMap.containsKey(java.lang.Integer.valueOf(id))) {
                return "'" + this.idMap.get(java.lang.Integer.valueOf(id)) + "'";
            }
            if (id == 0) {
                return "'parent'";
            }
            java.lang.String strLookup = lookup(id);
            this.idMap.put(java.lang.Integer.valueOf(id), strLookup);
            return "'" + strLookup + "'";
        }

        java.lang.String lookup(int id) {
            try {
                if (id != -1) {
                    return this.context.getResources().getResourceEntryName(id);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown");
                int i = this.unknownCount + 1;
                this.unknownCount = i;
                return sb.append(i).toString();
            } catch (java.lang.Exception unused) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown");
                int i2 = this.unknownCount + 1;
                this.unknownCount = i2;
                return sb2.append(i2).toString();
            }
        }

        void writeConstraint(java.lang.String my, int leftToLeft, java.lang.String other, int margin, int goneMargin) throws java.io.IOException {
            if (leftToLeft == -1) {
                return;
            }
            this.writer.write(SPACE + my);
            this.writer.write(":[");
            this.writer.write(getName(leftToLeft));
            this.writer.write(" , ");
            this.writer.write(other);
            if (margin != 0) {
                this.writer.write(" , " + margin);
            }
            this.writer.write("],\n");
        }

        void writeCircle(int circleConstraint, float circleAngle, int circleRadius) throws java.io.IOException {
            if (circleConstraint == -1) {
                return;
            }
            this.writer.write("       circle");
            this.writer.write(":[");
            this.writer.write(getName(circleConstraint));
            this.writer.write(", " + circleAngle);
            this.writer.write(circleRadius + com.ironsource.y8.i.e);
        }

        void writeVariable(java.lang.String name, int value) throws java.io.IOException {
            if (value == 0 || value == -1) {
                return;
            }
            this.writer.write(SPACE + name);
            this.writer.write(":");
            this.writer.write(", " + value);
            this.writer.write("\n");
        }

        void writeVariable(java.lang.String name, float value) throws java.io.IOException {
            if (value == -1.0f) {
                return;
            }
            this.writer.write(SPACE + name);
            this.writer.write(": " + value);
            this.writer.write(",\n");
        }

        void writeVariable(java.lang.String name, float value, float def) throws java.io.IOException {
            if (value == def) {
                return;
            }
            this.writer.write(SPACE + name);
            this.writer.write(": " + value);
            this.writer.write(",\n");
        }

        void writeVariable(java.lang.String name, boolean value) throws java.io.IOException {
            if (value) {
                this.writer.write(SPACE + name);
                this.writer.write(": " + value);
                this.writer.write(",\n");
            }
        }

        void writeVariable(java.lang.String name, boolean value, boolean def) throws java.io.IOException {
            if (value == def) {
                return;
            }
            this.writer.write(SPACE + name);
            this.writer.write(": " + value);
            this.writer.write(",\n");
        }

        void writeVariable(java.lang.String name, int[] value) throws java.io.IOException {
            if (value == null) {
                return;
            }
            this.writer.write(SPACE + name);
            this.writer.write(": ");
            int i = 0;
            while (i < value.length) {
                this.writer.write((i == 0 ? com.ironsource.y8.i.d : ", ") + getName(value[i]));
                i++;
            }
            this.writer.write("],\n");
        }

        void writeVariable(java.lang.String name, java.lang.String value) throws java.io.IOException {
            if (value == null) {
                return;
            }
            this.writer.write(SPACE + name);
            this.writer.write(":");
            this.writer.write(", " + value);
            this.writer.write("\n");
        }
    }
}
